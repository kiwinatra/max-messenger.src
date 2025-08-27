package org.webrtc;

import android.graphics.Matrix;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase14;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoFrame;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

public class HardwareVideoEncoder implements VideoEncoder {
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int MAX_ENCODER_Q_SIZE = 2;
    private static final int MAX_VIDEO_FRAMERATE = 30;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    public static boolean ODKL_CBR_SUPPORTED_CHECK = false;
    public static boolean ODKL_CHANGE_CBR_BEHAVIOR = false;
    private static final int REQUIRED_RESOLUTION_ALIGNMENT = 16;
    private static final String TAG = "HardwareVideoEncoder";
    private int adjustedBitrate;
    private boolean automaticResizeOn;
    private final BitrateAdjuster bitrateAdjuster;
    private VideoEncoder.Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecMimeType codecType;
    private ByteBuffer configBuffer;
    private final ThreadUtils.ThreadChecker encodeThreadChecker;
    private final long forcedKeyFrameNs;
    private int frameSizeBytes;
    private int height;
    private boolean isEncodingStatisticsEnabled;
    private boolean isSemiPlanar;
    private final int keyFrameIntervalSec;
    private long lastKeyFrameNs;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private long nextPresentationTimestampUs;
    private final BusyCount outputBuffersBusyCount;
    private final BlockingDeque<EncodedImage.Builder> outputBuilders = new LinkedBlockingDeque();
    private Thread outputThread;
    private final ThreadUtils.ThreadChecker outputThreadChecker;
    private final Map<String, String> params;
    /* access modifiers changed from: private */
    public volatile boolean running;
    private final EglBase14.Context sharedContext;
    private volatile Exception shutdownException;
    private int sliceHeight;
    private int stride;
    private final Integer surfaceColorFormat;
    private final GlRectDrawer textureDrawer = new GlRectDrawer();
    private EglBase14 textureEglBase;
    private Surface textureInputSurface;
    private boolean useSurfaceMode;
    private final VideoFrameDrawer videoFrameDrawer = new VideoFrameDrawer();
    private int width;
    private final Integer yuvColorFormat;

    public static class BusyCount {
        private int count;
        private final Object countLock;

        public /* synthetic */ BusyCount(int i) {
            this();
        }

        public void decrement() {
            synchronized (this.countLock) {
                try {
                    int i = this.count - 1;
                    this.count = i;
                    if (i == 0) {
                        this.countLock.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void increment() {
            synchronized (this.countLock) {
                this.count++;
            }
        }

        public void waitForZero() {
            boolean z;
            synchronized (this.countLock) {
                z = false;
                while (this.count > 0) {
                    try {
                        this.countLock.wait();
                    } catch (InterruptedException e) {
                        Logging.e(HardwareVideoEncoder.TAG, "Interrupted while waiting on busy count", e);
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }

        private BusyCount() {
            this.countLock = new Object();
        }
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory2, String str, VideoCodecMimeType videoCodecMimeType, Integer num, Integer num2, Map<String, String> map, int i, int i2, BitrateAdjuster bitrateAdjuster2, EglBase14.Context context) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.encodeThreadChecker = threadChecker;
        this.outputThreadChecker = new ThreadUtils.ThreadChecker();
        this.outputBuffersBusyCount = new BusyCount(0);
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory2;
        this.codecName = str;
        this.codecType = videoCodecMimeType;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.params = map;
        this.keyFrameIntervalSec = i;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos((long) i2);
        this.bitrateAdjuster = bitrateAdjuster2;
        this.sharedContext = context;
        threadChecker.detachThread();
    }

    private boolean canUseSurface() {
        return (this.sharedContext == null || this.surfaceColorFormat == null) ? false : true;
    }

    private Thread createOutputThread() {
        return new Thread() {
            public void run() {
                while (HardwareVideoEncoder.this.running) {
                    HardwareVideoEncoder.this.deliverEncodedImage();
                }
                HardwareVideoEncoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private VideoCodecStatus encodeByteBuffer(VideoFrame videoFrame, long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(0);
            if (dequeueInputBuffer == -1) {
                Logging.d(TAG, "Dropped frame, no input buffers available");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                ByteBuffer inputBuffer = this.codec.getInputBuffer(dequeueInputBuffer);
                if (inputBuffer.capacity() < this.frameSizeBytes) {
                    int capacity = inputBuffer.capacity();
                    int i = this.frameSizeBytes;
                    Logging.e(TAG, "Input buffer size: " + capacity + " is smaller than frame size: " + i);
                    return VideoCodecStatus.ERROR;
                }
                fillInputBuffer(inputBuffer, videoFrame.getBuffer());
                try {
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, this.frameSizeBytes, j, 0);
                    return VideoCodecStatus.OK;
                } catch (IllegalStateException e) {
                    Logging.e(TAG, "queueInputBuffer failed", e);
                    return VideoCodecStatus.ERROR;
                }
            } catch (IllegalStateException e2) {
                Logging.e(TAG, "getInputBuffer with index=" + dequeueInputBuffer + " failed", e2);
                return VideoCodecStatus.ERROR;
            }
        } catch (IllegalStateException e3) {
            Logging.e(TAG, "dequeueInputBuffer failed", e3);
            return VideoCodecStatus.ERROR;
        }
    }

    private VideoCodecStatus encodeTextureBuffer(VideoFrame videoFrame, long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            GLES20.glClear(16384);
            this.videoFrameDrawer.drawFrame(new VideoFrame(videoFrame.getBuffer(), 0, videoFrame.getTimestampNs()), this.textureDrawer, (Matrix) null);
            this.textureEglBase.swapBuffers(TimeUnit.MICROSECONDS.toNanos(j));
            return VideoCodecStatus.OK;
        } catch (RuntimeException e) {
            Logging.e(TAG, "encodeTexture failed", e);
            return VideoCodecStatus.ERROR;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c7 A[Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d1 A[Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.webrtc.VideoCodecStatus initEncodeInternal() {
        /*
            r11 = this;
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r1 = "Format: "
            java.lang.String r2 = "Unknown profile level id: "
            java.lang.String r3 = "    cbr supported "
            org.webrtc.ThreadUtils$ThreadChecker r4 = r11.encodeThreadChecker
            r4.checkIsOnValidThread()
            r4 = 0
            r11.nextPresentationTimestampUs = r4
            r4 = -1
            r11.lastKeyFrameNs = r4
            r4 = 0
            r11.isEncodingStatisticsEnabled = r4
            org.webrtc.MediaCodecWrapperFactory r5 = r11.mediaCodecWrapperFactory     // Catch:{ IOException | IllegalArgumentException -> 0x015c }
            java.lang.String r6 = r11.codecName     // Catch:{ IOException | IllegalArgumentException -> 0x015c }
            org.webrtc.MediaCodecWrapper r5 = r5.createByCodecName(r6)     // Catch:{ IOException | IllegalArgumentException -> 0x015c }
            r11.codec = r5     // Catch:{ IOException | IllegalArgumentException -> 0x015c }
            boolean r5 = r11.useSurfaceMode
            if (r5 == 0) goto L_0x0029
            java.lang.Integer r5 = r11.surfaceColorFormat
            goto L_0x002b
        L_0x0029:
            java.lang.Integer r5 = r11.yuvColorFormat
        L_0x002b:
            int r5 = r5.intValue()
            org.webrtc.VideoCodecMimeType r6 = r11.codecType     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            java.lang.String r6 = r6.mimeType()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            int r7 = r11.width     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            int r8 = r11.height     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            android.media.MediaFormat r6 = android.media.MediaFormat.createVideoFormat(r6, r7, r8)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            java.lang.String r7 = "bitrate"
            int r8 = r11.adjustedBitrate     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            r6.setInteger(r7, r8)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            boolean r7 = ODKL_CHANGE_CBR_BEHAVIOR     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            r8 = 2
            java.lang.String r9 = "bitrate-mode"
            if (r7 == 0) goto L_0x0073
            boolean r7 = ODKL_CBR_SUPPORTED_CHECK     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            if (r7 == 0) goto L_0x006d
            org.webrtc.MediaCodecWrapper r7 = r11.codec     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            boolean r7 = r7.cbrSupported(r6)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            r10.<init>(r3)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            r10.append(r7)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            java.lang.String r3 = r10.toString()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            org.webrtc.Logging.d(r0, r3)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            if (r7 == 0) goto L_0x0076
            r6.setInteger(r9, r8)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            goto L_0x0076
        L_0x006a:
            r1 = move-exception
            goto L_0x0151
        L_0x006d:
            java.lang.String r3 = "    cbr disabled"
            org.webrtc.Logging.d(r0, r3)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            goto L_0x0076
        L_0x0073:
            r6.setInteger(r9, r8)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
        L_0x0076:
            java.lang.String r3 = "color-format"
            r6.setInteger(r3, r5)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            java.lang.String r3 = "frame-rate"
            org.webrtc.BitrateAdjuster r5 = r11.bitrateAdjuster     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            double r7 = r5.getAdjustedFramerateFps()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            float r5 = (float) r7     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            r6.setFloat(r3, r5)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            java.lang.String r3 = "i-frame-interval"
            int r5 = r11.keyFrameIntervalSec     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            r6.setInteger(r3, r5)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            org.webrtc.VideoCodecMimeType r3 = r11.codecType     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            org.webrtc.VideoCodecMimeType r5 = org.webrtc.VideoCodecMimeType.H264     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            r7 = 1
            if (r3 != r5) goto L_0x00df
            java.util.Map<java.lang.String, java.lang.String> r3 = r11.params     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            java.lang.String r5 = "profile-level-id"
            java.lang.Object r3 = r3.get(r5)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            java.lang.String r5 = "42e01f"
            if (r3 != 0) goto L_0x00a4
            r3 = r5
        L_0x00a4:
            int r8 = r3.hashCode()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            r9 = 1537948542(0x5bab3b7e, float:9.6395267E16)
            if (r8 == r9) goto L_0x00bc
            r5 = 1595523974(0x5f19c386, float:1.1079847E19)
            if (r8 == r5) goto L_0x00b3
            goto L_0x00c4
        L_0x00b3:
            java.lang.String r5 = "640c1f"
            boolean r5 = r3.equals(r5)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            if (r5 == 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00bc:
            boolean r4 = r3.equals(r5)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            if (r4 == 0) goto L_0x00c4
            r4 = r7
            goto L_0x00c5
        L_0x00c4:
            r4 = -1
        L_0x00c5:
            if (r4 == 0) goto L_0x00d1
            if (r4 == r7) goto L_0x00df
            java.lang.String r2 = r2.concat(r3)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            org.webrtc.Logging.w(r0, r2)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            goto L_0x00df
        L_0x00d1:
            java.lang.String r2 = "profile"
            r3 = 8
            r6.setInteger(r2, r3)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            java.lang.String r2 = "level"
            r3 = 256(0x100, float:3.59E-43)
            r6.setInteger(r2, r3)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
        L_0x00df:
            java.lang.String r2 = r11.codecName     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            java.lang.String r3 = "c2.google.av1.encoder"
            boolean r2 = r2.equals(r3)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            if (r2 == 0) goto L_0x00ee
            java.lang.String r2 = "vendor.google-av1enc.encoding-preset.int32.value"
            r6.setInteger(r2, r7)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
        L_0x00ee:
            boolean r2 = r11.isEncodingStatisticsSupported()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            if (r2 == 0) goto L_0x00fb
            java.lang.String r2 = "video-encoding-statistics-level"
            r6.setInteger(r2, r7)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            r11.isEncodingStatisticsEnabled = r7     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
        L_0x00fb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            r2.<init>(r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            r2.append(r6)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            java.lang.String r1 = r2.toString()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            org.webrtc.Logging.d(r0, r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            org.webrtc.MediaCodecWrapper r1 = r11.codec     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            r2 = 0
            r1.configure(r6, r2, r2, r7)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            boolean r1 = r11.useSurfaceMode     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            if (r1 == 0) goto L_0x0130
            org.webrtc.EglBase14$Context r1 = r11.sharedContext     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            int[] r2 = org.webrtc.EglBase.CONFIG_RECORDABLE     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            org.webrtc.EglBase14 r1 = org.webrtc.EglBase.createEgl14((org.webrtc.EglBase14.Context) r1, (int[]) r2)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            r11.textureEglBase = r1     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            org.webrtc.MediaCodecWrapper r1 = r11.codec     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            android.view.Surface r1 = r1.createInputSurface()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            r11.textureInputSurface = r1     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            org.webrtc.EglBase14 r2 = r11.textureEglBase     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            r2.createSurface((android.view.Surface) r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            org.webrtc.EglBase14 r1 = r11.textureEglBase     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            r1.makeCurrent()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
        L_0x0130:
            org.webrtc.MediaCodecWrapper r1 = r11.codec     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            android.media.MediaFormat r1 = r1.getInputFormat()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            r11.updateInputFormat(r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            org.webrtc.MediaCodecWrapper r1 = r11.codec     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            r1.start()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006a }
            r11.running = r7
            org.webrtc.ThreadUtils$ThreadChecker r0 = r11.outputThreadChecker
            r0.detachThread()
            java.lang.Thread r0 = r11.createOutputThread()
            r11.outputThread = r0
            r0.start()
            org.webrtc.VideoCodecStatus r11 = org.webrtc.VideoCodecStatus.OK
            return r11
        L_0x0151:
            java.lang.String r2 = "initEncodeInternal failed"
            org.webrtc.Logging.e(r0, r2, r1)
            r11.release()
            org.webrtc.VideoCodecStatus r11 = org.webrtc.VideoCodecStatus.FALLBACK_SOFTWARE
            return r11
        L_0x015c:
            java.lang.String r11 = r11.codecName
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot create media encoder "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            org.webrtc.Logging.e(r0, r11)
            org.webrtc.VideoCodecStatus r11 = org.webrtc.VideoCodecStatus.FALLBACK_SOFTWARE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.initEncodeInternal():org.webrtc.VideoCodecStatus");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$deliverEncodedImage$0(int i) {
        try {
            this.codec.releaseOutputBuffer(i, false);
        } catch (Exception e) {
            Logging.e(TAG, "releaseOutputBuffer failed", e);
        }
        this.outputBuffersBusyCount.decrement();
    }

    /* access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "Releasing MediaCodec on output thread");
        this.outputBuffersBusyCount.waitForZero();
        try {
            this.codec.stop();
        } catch (Exception e) {
            Logging.e(TAG, "Media encoder stop failed", e);
        }
        try {
            this.codec.release();
        } catch (Exception e2) {
            Logging.e(TAG, "Media encoder release failed", e2);
            this.shutdownException = e2;
        }
        this.configBuffer = null;
        Logging.d(TAG, "Release on output thread done");
    }

    private void requestKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j;
        } catch (IllegalStateException e) {
            Logging.e(TAG, "requestKeyFrame failed", e);
        }
    }

    private VideoCodecStatus resetCodec(int i, int i2, boolean z) {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus release = release();
        if (release != VideoCodecStatus.OK) {
            return release;
        }
        this.width = i;
        this.height = i2;
        this.useSurfaceMode = z;
        return initEncodeInternal();
    }

    private boolean shouldForceKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long j2 = this.forcedKeyFrameNs;
        return j2 > 0 && j > this.lastKeyFrameNs + j2;
    }

    private VideoCodecStatus updateBitrate() {
        this.outputThreadChecker.checkIsOnValidThread();
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", this.adjustedBitrate);
            this.codec.setParameters(bundle);
            return VideoCodecStatus.OK;
        } catch (IllegalStateException e) {
            Logging.e(TAG, "updateBitrate failed", e);
            return VideoCodecStatus.ERROR;
        }
    }

    private void updateInputFormat(MediaFormat mediaFormat) {
        this.stride = this.width;
        this.sliceHeight = this.height;
        if (mediaFormat != null) {
            if (mediaFormat.containsKey("stride")) {
                int integer = mediaFormat.getInteger("stride");
                this.stride = integer;
                this.stride = Math.max(integer, this.width);
            }
            if (mediaFormat.containsKey("slice-height")) {
                int integer2 = mediaFormat.getInteger("slice-height");
                this.sliceHeight = integer2;
                this.sliceHeight = Math.max(integer2, this.height);
            }
        }
        boolean isSemiPlanar2 = isSemiPlanar(this.yuvColorFormat.intValue());
        this.isSemiPlanar = isSemiPlanar2;
        if (isSemiPlanar2) {
            int i = this.sliceHeight;
            int i2 = this.stride;
            this.frameSizeBytes = (((this.height + 1) / 2) * i2) + (i * i2);
        } else {
            int i3 = this.stride;
            int i4 = this.sliceHeight;
            this.frameSizeBytes = (((i4 + 1) / 2) * ((i3 + 1) / 2) * 2) + (i4 * i3);
        }
        int i5 = this.stride;
        int i6 = this.sliceHeight;
        int i7 = this.frameSizeBytes;
        Logging.d(TAG, "updateInputFormat format: " + mediaFormat + " stride: " + i5 + " sliceHeight: " + i6 + " isSemiPlanar: " + isSemiPlanar2 + " frameSizeBytes: " + i7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009f, code lost:
        r3 = r13.codec.getOutputFormat(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void deliverEncodedImage() {
        /*
            r13 = this;
            java.lang.String r0 = "video-qp-average"
            java.lang.String r1 = "HardwareVideoEncoder"
            java.lang.String r2 = "Prepending config buffer of size "
            java.lang.String r3 = "Config frame generated. Offset: "
            org.webrtc.ThreadUtils$ThreadChecker r4 = r13.outputThreadChecker
            r4.checkIsOnValidThread()
            android.media.MediaCodec$BufferInfo r4 = new android.media.MediaCodec$BufferInfo     // Catch:{ IllegalStateException -> 0x0026 }
            r4.<init>()     // Catch:{ IllegalStateException -> 0x0026 }
            org.webrtc.MediaCodecWrapper r5 = r13.codec     // Catch:{ IllegalStateException -> 0x0026 }
            r6 = 100000(0x186a0, double:4.94066E-319)
            int r5 = r5.dequeueOutputBuffer(r4, r6)     // Catch:{ IllegalStateException -> 0x0026 }
            if (r5 >= 0) goto L_0x002a
            r0 = -3
            if (r5 != r0) goto L_0x0029
            org.webrtc.HardwareVideoEncoder$BusyCount r13 = r13.outputBuffersBusyCount     // Catch:{ IllegalStateException -> 0x0026 }
            r13.waitForZero()     // Catch:{ IllegalStateException -> 0x0026 }
            goto L_0x0029
        L_0x0026:
            r13 = move-exception
            goto L_0x0141
        L_0x0029:
            return
        L_0x002a:
            org.webrtc.MediaCodecWrapper r6 = r13.codec     // Catch:{ IllegalStateException -> 0x0026 }
            java.nio.ByteBuffer r6 = r6.getOutputBuffer(r5)     // Catch:{ IllegalStateException -> 0x0026 }
            int r7 = r4.offset     // Catch:{ IllegalStateException -> 0x0026 }
            r6.position(r7)     // Catch:{ IllegalStateException -> 0x0026 }
            int r7 = r4.offset     // Catch:{ IllegalStateException -> 0x0026 }
            int r8 = r4.size     // Catch:{ IllegalStateException -> 0x0026 }
            int r7 = r7 + r8
            r6.limit(r7)     // Catch:{ IllegalStateException -> 0x0026 }
            int r7 = r4.flags     // Catch:{ IllegalStateException -> 0x0026 }
            r7 = r7 & 2
            if (r7 == 0) goto L_0x0076
            int r0 = r4.offset     // Catch:{ IllegalStateException -> 0x0026 }
            int r2 = r4.size     // Catch:{ IllegalStateException -> 0x0026 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0026 }
            r5.<init>(r3)     // Catch:{ IllegalStateException -> 0x0026 }
            r5.append(r0)     // Catch:{ IllegalStateException -> 0x0026 }
            java.lang.String r0 = ". Size: "
            r5.append(r0)     // Catch:{ IllegalStateException -> 0x0026 }
            r5.append(r2)     // Catch:{ IllegalStateException -> 0x0026 }
            java.lang.String r0 = r5.toString()     // Catch:{ IllegalStateException -> 0x0026 }
            org.webrtc.Logging.d(r1, r0)     // Catch:{ IllegalStateException -> 0x0026 }
            int r0 = r4.size     // Catch:{ IllegalStateException -> 0x0026 }
            if (r0 <= 0) goto L_0x0075
            org.webrtc.VideoCodecMimeType r2 = r13.codecType     // Catch:{ IllegalStateException -> 0x0026 }
            org.webrtc.VideoCodecMimeType r3 = org.webrtc.VideoCodecMimeType.H264     // Catch:{ IllegalStateException -> 0x0026 }
            if (r2 == r3) goto L_0x006c
            org.webrtc.VideoCodecMimeType r3 = org.webrtc.VideoCodecMimeType.H265     // Catch:{ IllegalStateException -> 0x0026 }
            if (r2 != r3) goto L_0x0075
        L_0x006c:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)     // Catch:{ IllegalStateException -> 0x0026 }
            r13.configBuffer = r0     // Catch:{ IllegalStateException -> 0x0026 }
            r0.put(r6)     // Catch:{ IllegalStateException -> 0x0026 }
        L_0x0075:
            return
        L_0x0076:
            org.webrtc.BitrateAdjuster r3 = r13.bitrateAdjuster     // Catch:{ IllegalStateException -> 0x0026 }
            int r7 = r4.size     // Catch:{ IllegalStateException -> 0x0026 }
            r3.reportEncodedFrame(r7)     // Catch:{ IllegalStateException -> 0x0026 }
            int r3 = r13.adjustedBitrate     // Catch:{ IllegalStateException -> 0x0026 }
            org.webrtc.BitrateAdjuster r7 = r13.bitrateAdjuster     // Catch:{ IllegalStateException -> 0x0026 }
            int r7 = r7.getAdjustedBitrateBps()     // Catch:{ IllegalStateException -> 0x0026 }
            if (r3 == r7) goto L_0x008a
            r13.updateBitrate()     // Catch:{ IllegalStateException -> 0x0026 }
        L_0x008a:
            int r3 = r4.flags     // Catch:{ IllegalStateException -> 0x0026 }
            r7 = 1
            r3 = r3 & r7
            r8 = 0
            if (r3 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r7 = r8
        L_0x0093:
            if (r7 == 0) goto L_0x009a
            java.lang.String r3 = "Sync frame generated"
            org.webrtc.Logging.d(r1, r3)     // Catch:{ IllegalStateException -> 0x0026 }
        L_0x009a:
            boolean r3 = r13.isEncodingStatisticsEnabled     // Catch:{ IllegalStateException -> 0x0026 }
            r9 = 0
            if (r3 == 0) goto L_0x00b6
            org.webrtc.MediaCodecWrapper r3 = r13.codec     // Catch:{ IllegalStateException -> 0x0026 }
            android.media.MediaFormat r3 = r3.getOutputFormat(r5)     // Catch:{ IllegalStateException -> 0x0026 }
            if (r3 == 0) goto L_0x00b6
            boolean r10 = r3.containsKey(r0)     // Catch:{ IllegalStateException -> 0x0026 }
            if (r10 == 0) goto L_0x00b6
            int r0 = r3.getInteger(r0)     // Catch:{ IllegalStateException -> 0x0026 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalStateException -> 0x0026 }
            goto L_0x00b7
        L_0x00b6:
            r0 = r9
        L_0x00b7:
            if (r7 == 0) goto L_0x0107
            java.nio.ByteBuffer r3 = r13.configBuffer     // Catch:{ IllegalStateException -> 0x0026 }
            if (r3 == 0) goto L_0x0107
            int r3 = r3.capacity()     // Catch:{ IllegalStateException -> 0x0026 }
            int r10 = r4.offset     // Catch:{ IllegalStateException -> 0x0026 }
            int r11 = r4.size     // Catch:{ IllegalStateException -> 0x0026 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0026 }
            r12.<init>(r2)     // Catch:{ IllegalStateException -> 0x0026 }
            r12.append(r3)     // Catch:{ IllegalStateException -> 0x0026 }
            java.lang.String r2 = " to output buffer with offset "
            r12.append(r2)     // Catch:{ IllegalStateException -> 0x0026 }
            r12.append(r10)     // Catch:{ IllegalStateException -> 0x0026 }
            java.lang.String r2 = ", size "
            r12.append(r2)     // Catch:{ IllegalStateException -> 0x0026 }
            r12.append(r11)     // Catch:{ IllegalStateException -> 0x0026 }
            java.lang.String r2 = r12.toString()     // Catch:{ IllegalStateException -> 0x0026 }
            org.webrtc.Logging.d(r1, r2)     // Catch:{ IllegalStateException -> 0x0026 }
            int r2 = r4.size     // Catch:{ IllegalStateException -> 0x0026 }
            java.nio.ByteBuffer r3 = r13.configBuffer     // Catch:{ IllegalStateException -> 0x0026 }
            int r3 = r3.capacity()     // Catch:{ IllegalStateException -> 0x0026 }
            int r2 = r2 + r3
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)     // Catch:{ IllegalStateException -> 0x0026 }
            java.nio.ByteBuffer r3 = r13.configBuffer     // Catch:{ IllegalStateException -> 0x0026 }
            r3.rewind()     // Catch:{ IllegalStateException -> 0x0026 }
            java.nio.ByteBuffer r3 = r13.configBuffer     // Catch:{ IllegalStateException -> 0x0026 }
            r2.put(r3)     // Catch:{ IllegalStateException -> 0x0026 }
            r2.put(r6)     // Catch:{ IllegalStateException -> 0x0026 }
            r2.rewind()     // Catch:{ IllegalStateException -> 0x0026 }
            org.webrtc.MediaCodecWrapper r3 = r13.codec     // Catch:{ IllegalStateException -> 0x0026 }
            r3.releaseOutputBuffer(r5, r8)     // Catch:{ IllegalStateException -> 0x0026 }
            goto L_0x0117
        L_0x0107:
            java.nio.ByteBuffer r2 = r6.slice()     // Catch:{ IllegalStateException -> 0x0026 }
            org.webrtc.HardwareVideoEncoder$BusyCount r3 = r13.outputBuffersBusyCount     // Catch:{ IllegalStateException -> 0x0026 }
            r3.increment()     // Catch:{ IllegalStateException -> 0x0026 }
            l40 r9 = new l40     // Catch:{ IllegalStateException -> 0x0026 }
            r3 = 11
            r9.<init>(r13, r5, r3)     // Catch:{ IllegalStateException -> 0x0026 }
        L_0x0117:
            if (r7 == 0) goto L_0x011c
            org.webrtc.EncodedImage$FrameType r3 = org.webrtc.EncodedImage.FrameType.VideoFrameKey     // Catch:{ IllegalStateException -> 0x0026 }
            goto L_0x011e
        L_0x011c:
            org.webrtc.EncodedImage$FrameType r3 = org.webrtc.EncodedImage.FrameType.VideoFrameDelta     // Catch:{ IllegalStateException -> 0x0026 }
        L_0x011e:
            java.util.concurrent.BlockingDeque<org.webrtc.EncodedImage$Builder> r4 = r13.outputBuilders     // Catch:{ IllegalStateException -> 0x0026 }
            java.lang.Object r4 = r4.poll()     // Catch:{ IllegalStateException -> 0x0026 }
            org.webrtc.EncodedImage$Builder r4 = (org.webrtc.EncodedImage.Builder) r4     // Catch:{ IllegalStateException -> 0x0026 }
            r4.setBuffer(r2, r9)     // Catch:{ IllegalStateException -> 0x0026 }
            r4.setFrameType(r3)     // Catch:{ IllegalStateException -> 0x0026 }
            r4.setQp(r0)     // Catch:{ IllegalStateException -> 0x0026 }
            org.webrtc.EncodedImage r0 = r4.createEncodedImage()     // Catch:{ IllegalStateException -> 0x0026 }
            org.webrtc.VideoEncoder$Callback r13 = r13.callback     // Catch:{ IllegalStateException -> 0x0026 }
            org.webrtc.VideoEncoder$CodecSpecificInfo r2 = new org.webrtc.VideoEncoder$CodecSpecificInfo     // Catch:{ IllegalStateException -> 0x0026 }
            r2.<init>()     // Catch:{ IllegalStateException -> 0x0026 }
            r13.onEncodedFrame(r0, r2)     // Catch:{ IllegalStateException -> 0x0026 }
            r0.release()     // Catch:{ IllegalStateException -> 0x0026 }
            goto L_0x0146
        L_0x0141:
            java.lang.String r0 = "deliverOutput failed"
            org.webrtc.Logging.e(r1, r0, r13)
        L_0x0146:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.deliverEncodedImage():void");
    }

    public VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        VideoCodecStatus resetCodec;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.codec == null) {
            return VideoCodecStatus.UNINITIALIZED;
        }
        boolean z = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
        int width2 = videoFrame.getBuffer().getWidth();
        int height2 = videoFrame.getBuffer().getHeight();
        boolean z2 = canUseSurface() && z;
        if ((width2 != this.width || height2 != this.height || z2 != this.useSurfaceMode) && (resetCodec = resetCodec(width2, height2, z2)) != VideoCodecStatus.OK) {
            return resetCodec;
        }
        if (this.outputBuilders.size() > 2) {
            Logging.e(TAG, "Dropped frame, encoder queue full");
            return VideoCodecStatus.NO_OUTPUT;
        }
        boolean z3 = false;
        for (EncodedImage.FrameType frameType : encodeInfo.frameTypes) {
            if (frameType == EncodedImage.FrameType.VideoFrameKey) {
                z3 = true;
            }
        }
        if (z3 || shouldForceKeyFrame(videoFrame.getTimestampNs())) {
            requestKeyFrame(videoFrame.getTimestampNs());
        }
        this.outputBuilders.offer(EncodedImage.builder().setCaptureTimeNs(videoFrame.getTimestampNs()).setEncodedWidth(videoFrame.getBuffer().getWidth()).setEncodedHeight(videoFrame.getBuffer().getHeight()).setRotation(videoFrame.getRotation()));
        long j = this.nextPresentationTimestampUs;
        this.nextPresentationTimestampUs += (long) (((double) TimeUnit.SECONDS.toMicros(1)) / this.bitrateAdjuster.getAdjustedFramerateFps());
        VideoCodecStatus encodeTextureBuffer = this.useSurfaceMode ? encodeTextureBuffer(videoFrame, j) : encodeByteBuffer(videoFrame, j);
        if (encodeTextureBuffer != VideoCodecStatus.OK) {
            this.outputBuilders.pollLast();
        }
        return encodeTextureBuffer;
    }

    public void fillInputBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
        VideoFrame.I420Buffer i420 = buffer.toI420();
        if (this.isSemiPlanar) {
            YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight(), this.stride, this.sliceHeight);
        } else {
            YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight(), this.stride, this.sliceHeight);
        }
        i420.release();
    }

    public VideoEncoder.EncoderInfo getEncoderInfo() {
        return new VideoEncoder.EncoderInfo(16, false);
    }

    public String getImplementationName() {
        return this.codecName;
    }

    public VideoEncoder.ScalingSettings getScalingSettings() {
        if (this.automaticResizeOn) {
            VideoCodecMimeType videoCodecMimeType = this.codecType;
            if (videoCodecMimeType == VideoCodecMimeType.VP8) {
                return new VideoEncoder.ScalingSettings(29, 95);
            }
            if (videoCodecMimeType == VideoCodecMimeType.H264) {
                return new VideoEncoder.ScalingSettings(24, 37);
            }
        }
        return VideoEncoder.ScalingSettings.OFF;
    }

    public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback2) {
        int i;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.callback = callback2;
        this.automaticResizeOn = settings.automaticResizeOn;
        this.width = settings.width;
        this.height = settings.height;
        this.useSurfaceMode = canUseSurface();
        int i2 = settings.startBitrate;
        if (!(i2 == 0 || (i = settings.maxFramerate) == 0)) {
            this.bitrateAdjuster.setTargets(i2 * 1000, (double) i);
        }
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        String str = this.codecName;
        VideoCodecMimeType videoCodecMimeType = this.codecType;
        int i3 = this.width;
        int i4 = this.height;
        int i5 = settings.maxFramerate;
        int i6 = settings.startBitrate;
        boolean z = this.useSurfaceMode;
        StringBuilder sb = new StringBuilder("initEncode name: ");
        sb.append(str);
        sb.append(" type: ");
        sb.append(videoCodecMimeType);
        sb.append(" width: ");
        g63.o(sb, i3, " height: ", i4, " framerate_fps: ");
        g63.o(sb, i5, " bitrate_kbps: ", i6, " surface mode: ");
        sb.append(z);
        Logging.d(TAG, sb.toString());
        return initEncodeInternal();
    }

    public boolean isEncodingStatisticsSupported() {
        MediaCodecInfo codecInfo;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        VideoCodecMimeType videoCodecMimeType = this.codecType;
        if (videoCodecMimeType == VideoCodecMimeType.VP8 || videoCodecMimeType == VideoCodecMimeType.VP9 || (codecInfo = this.codec.getCodecInfo()) == null || (capabilitiesForType = codecInfo.getCapabilitiesForType(this.codecType.mimeType())) == null) {
            return false;
        }
        return capabilitiesForType.isFeatureSupported("encoding-statistics");
    }

    public boolean isSemiPlanar(int i) {
        if (i == 19) {
            return false;
        }
        if (i == 21 || i == 2141391872 || i == 2141391876) {
            return true;
        }
        throw new IllegalArgumentException(wj6.h(i, "Unsupported colorFormat: "));
    }

    public VideoCodecStatus release() {
        VideoCodecStatus videoCodecStatus;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.outputThread == null) {
            videoCodecStatus = VideoCodecStatus.OK;
        } else {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, MultiFileUploader.UPLOAD_NEXT_INTERVAL)) {
                Logging.e(TAG, "Media encoder release timeout");
                videoCodecStatus = VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                Logging.e(TAG, "Media encoder release exception", this.shutdownException);
                videoCodecStatus = VideoCodecStatus.ERROR;
            } else {
                videoCodecStatus = VideoCodecStatus.OK;
            }
        }
        this.textureDrawer.release();
        this.videoFrameDrawer.release();
        EglBase14 eglBase14 = this.textureEglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.textureEglBase = null;
        }
        Surface surface = this.textureInputSurface;
        if (surface != null) {
            surface.release();
            this.textureInputSurface = null;
        }
        this.outputBuilders.clear();
        this.codec = null;
        this.outputThread = null;
        this.encodeThreadChecker.detachThread();
        return videoCodecStatus;
    }

    public VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (i > MAX_VIDEO_FRAMERATE) {
            i = MAX_VIDEO_FRAMERATE;
        }
        this.bitrateAdjuster.setTargets(bitrateAllocation.getSum(), (double) i);
        return VideoCodecStatus.OK;
    }

    public VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.bitrateAdjuster.setTargets(rateControlParameters.bitrate.getSum(), rateControlParameters.framerateFps);
        return VideoCodecStatus.OK;
    }
}
