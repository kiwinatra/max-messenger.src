package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.view.Surface;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoFrame;

public class AndroidVideoDecoder implements VideoDecoder, VideoSink {
    private static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String TAG = "AndroidVideoDecoder";
    public static volatile ErrorCallback errorCallback;
    private volatile VideoDecoder.Callback callback;
    public volatile MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecMimeType codecType;
    private int colorFormat;
    private final DecoderSsrcControl control;
    private ThreadUtils.ThreadChecker decoderThreadChecker;
    private final Object dimensionLock = new Object();
    private final BlockingDeque<FrameInfo> frameInfos;
    private volatile boolean hasDecodedFirstFrame;
    private int height;
    private final Object initLock = new Object();
    private volatile boolean keyFrameRequired;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private Thread outputThread;
    /* access modifiers changed from: private */
    public ThreadUtils.ThreadChecker outputThreadChecker;
    private volatile DecodedTextureMetadata renderedTextureMetadata;
    private final Object renderedTextureMetadataLock = new Object();
    /* access modifiers changed from: private */
    public volatile boolean running;
    private final EglBase.Context sharedContext;
    private volatile Exception shutdownException;
    private int sliceHeight;
    private volatile long ssrc;
    private int stride;
    public volatile Surface surface;
    public volatile SurfaceTextureHelper surfaceTextureHelper;
    private final ConditionVariable variable = new ConditionVariable(true);
    private int width;

    public static class DecodedTextureMetadata {
        final Integer decodeTimeMs;
        final long presentationTimestampUs;

        public DecodedTextureMetadata(long j, Integer num) {
            this.presentationTimestampUs = j;
            this.decodeTimeMs = num;
        }
    }

    public interface ErrorCallback {
        void error(Exception exc, String str);
    }

    public static class FrameInfo {
        final long decodeStartTimeMs;
        final int rotation;

        public FrameInfo(long j, int i) {
            this.decodeStartTimeMs = j;
            this.rotation = i;
        }
    }

    public AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory2, String str, VideoCodecMimeType videoCodecMimeType, int i, DecoderSsrcControl decoderSsrcControl, EglBase.Context context) {
        this.control = decoderSsrcControl;
        if (isSupportedColorFormat(i)) {
            Logging.d(TAG, "ctor name: " + str + " type: " + videoCodecMimeType + " color format: " + i + " context: " + context);
            this.mediaCodecWrapperFactory = mediaCodecWrapperFactory2;
            this.codecName = str;
            this.codecType = videoCodecMimeType;
            this.colorFormat = i;
            this.sharedContext = context;
            this.frameInfos = new LinkedBlockingDeque();
            return;
        }
        throw new IllegalArgumentException(wj6.h(i, "Unsupported color format: "));
    }

    private static final String codecConfigToString(String str, MediaFormat mediaFormat) {
        try {
            String mediaFormat2 = mediaFormat.toString();
            return str + "\n" + mediaFormat2;
        } catch (Throwable th) {
            return a81.m("can not convert codec format to string: ", th.getMessage());
        }
    }

    private VideoFrame.Buffer copyI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        ByteBuffer byteBuffer2 = byteBuffer;
        int i5 = i;
        int i6 = i3;
        int i7 = i4;
        if (i5 % 2 == 0) {
            int i8 = (i6 + 1) / 2;
            int i9 = i2 % 2;
            int i10 = i9 == 0 ? (i7 + 1) / 2 : i7 / 2;
            int i11 = i5 / 2;
            int i12 = i5 * i2;
            int i13 = i11 * i10;
            int i14 = ((i11 * i2) / 2) + i12;
            int i15 = i14 + i13;
            VideoFrame.I420Buffer allocateI420Buffer = allocateI420Buffer(i6, i7);
            byteBuffer2.limit(i5 * i7);
            byteBuffer2.position(0);
            copyPlane(byteBuffer.slice(), i, allocateI420Buffer.getDataY(), allocateI420Buffer.getStrideY(), i3, i4);
            byteBuffer2.limit(i12 + i13);
            byteBuffer2.position(i12);
            copyPlane(byteBuffer.slice(), i11, allocateI420Buffer.getDataU(), allocateI420Buffer.getStrideU(), i8, i10);
            if (i9 == 1) {
                byteBuffer2.position(((i10 - 1) * i11) + i12);
                ByteBuffer dataU = allocateI420Buffer.getDataU();
                dataU.position(allocateI420Buffer.getStrideU() * i10);
                dataU.put(byteBuffer2);
            }
            byteBuffer2.limit(i15);
            byteBuffer2.position(i14);
            copyPlane(byteBuffer.slice(), i11, allocateI420Buffer.getDataV(), allocateI420Buffer.getStrideV(), i8, i10);
            if (i9 == 1) {
                byteBuffer2.position(((i10 - 1) * i11) + i14);
                ByteBuffer dataV = allocateI420Buffer.getDataV();
                dataV.position(allocateI420Buffer.getStrideV() * i10);
                dataV.put(byteBuffer2);
            }
            return allocateI420Buffer;
        }
        throw new AssertionError(wj6.h(i5, "Stride is not divisible by two: "));
    }

    private VideoFrame.Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        return new NV12Buffer(i3, i4, i, i2, byteBuffer, (Runnable) null).toI420();
    }

    private Thread createOutputThread() {
        return new Thread("AndroidVideoDecoder.outputThread") {
            public void run() {
                AndroidVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
                MediaCodecWrapper mediaCodecWrapper = AndroidVideoDecoder.this.codec;
                while (AndroidVideoDecoder.this.running) {
                    try {
                        AndroidVideoDecoder.this.deliverDecodedFrame();
                    } catch (NullPointerException e) {
                        Logging.e(AndroidVideoDecoder.TAG, "err", e);
                    }
                }
                AndroidVideoDecoder.this.releaseCodecOnOutputThread(mediaCodecWrapper);
            }
        };
    }

    private void deliverByteFrame(int i, MediaCodec.BufferInfo bufferInfo, int i2, Integer num) {
        int i3;
        int i4;
        int i5;
        int i6;
        synchronized (this.dimensionLock) {
            i3 = this.width;
            i4 = this.height;
            i5 = this.stride;
            i6 = this.sliceHeight;
        }
        int i7 = bufferInfo.size;
        if (i7 < ((i3 * i4) * 3) / 2) {
            Logging.e(TAG, "Insufficient output buffer size: " + i7);
            return;
        }
        int i8 = (i7 >= ((i5 * i4) * 3) / 2 || i6 != i4 || i5 <= i3) ? i5 : (i7 * 2) / (i4 * 3);
        ByteBuffer outputBuffer = this.codec.getOutputBuffer(i);
        outputBuffer.position(bufferInfo.offset);
        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
        ByteBuffer slice = outputBuffer.slice();
        VideoFrame.Buffer copyI420Buffer = this.colorFormat == 19 ? copyI420Buffer(slice, i8, i6, i3, i4) : copyNV12ToI420Buffer(slice, i8, i6, i3, i4);
        this.codec.releaseOutputBuffer(i, false);
        VideoFrame videoFrame = new VideoFrame(copyI420Buffer, i2, bufferInfo.presentationTimeUs * 1000);
        this.callback.onDecodedFrame(videoFrame, num, (Integer) null);
        videoFrame.release();
    }

    private void deliverTextureFrame(int i, MediaCodec.BufferInfo bufferInfo, int i2, Integer num) {
        int i3;
        int i4;
        synchronized (this.dimensionLock) {
            i3 = this.width;
            i4 = this.height;
        }
        if (this.renderedTextureMetadata != null) {
            Logging.v(TAG, "blocking");
            this.variable.block(60);
        }
        synchronized (this.renderedTextureMetadataLock) {
            try {
                if (this.renderedTextureMetadata != null) {
                    this.codec.releaseOutputBuffer(i, false);
                    Logging.v(TAG, "false release");
                    return;
                }
                this.variable.close();
                this.surfaceTextureHelper.setTextureSize(i3, i4);
                this.surfaceTextureHelper.setFrameRotation(i2);
                this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs, num);
                this.codec.releaseOutputBuffer(i, true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private VideoCodecStatus initDecodeInternal(int i, int i2, long j) {
        int i3 = i;
        int i4 = i2;
        this.decoderThreadChecker.checkIsOnValidThread();
        synchronized (this.initLock) {
            try {
                if (this.sharedContext != null) {
                    this.surfaceTextureHelper = createSurfaceTextureHelper();
                    this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
                    this.surfaceTextureHelper.startListening(this);
                }
                String mimeType = this.codecType.mimeType();
                int i5 = this.colorFormat;
                Surface surface2 = this.surface;
                Logging.d(TAG, "initDecodeInternal " + mimeType + " " + i3 + " x " + i4 + " " + i5 + " " + surface2);
                if (this.surface != null) {
                    boolean isValid = this.surface.isValid();
                    Logging.d(TAG, "initDecodeInternal " + isValid);
                    Field declaredField = Surface.class.getDeclaredField("mNativeObject");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(this.surface);
                    Logging.d(TAG, "initDecodeInternal " + obj);
                }
            } catch (Exception e) {
                Logging.e(TAG, "initDecodeInternal ", e);
            } catch (Throwable th) {
                throw th;
            }
            if (this.outputThread != null) {
                Logging.e(TAG, "initDecodeInternal called while the codec is already running");
                VideoCodecStatus videoCodecStatus = VideoCodecStatus.FALLBACK_SOFTWARE;
                return videoCodecStatus;
            }
            synchronized (this.dimensionLock) {
                this.width = i3;
                this.height = i4;
                this.stride = i3;
                this.sliceHeight = i4;
            }
            this.hasDecodedFirstFrame = false;
            this.keyFrameRequired = true;
            try {
                this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
                try {
                    MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i3, i4);
                    if (this.sharedContext == null) {
                        createVideoFormat.setInteger("color-format", this.colorFormat);
                    }
                    Logging.d(TAG, codecConfigToString(this.codecName, createVideoFormat));
                    this.codec.configure(createVideoFormat, this.surface, (MediaCrypto) null, 0);
                    this.codec.start();
                    this.control.onDecoderInit(this, j);
                    this.frameInfos.clear();
                    this.running = true;
                    Thread createOutputThread = createOutputThread();
                    this.outputThread = createOutputThread;
                    createOutputThread.start();
                    Logging.d(TAG, "initDecodeInternal done");
                    VideoCodecStatus videoCodecStatus2 = VideoCodecStatus.OK;
                    return videoCodecStatus2;
                } catch (IllegalStateException e2) {
                    Logging.e(TAG, "initDecode failed", e2);
                    ErrorCallback errorCallback2 = errorCallback;
                    if (errorCallback2 != null) {
                        errorCallback2.error(e2, "hwdec.ise\n" + "");
                    }
                    release();
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                } catch (IllegalArgumentException e3) {
                    ErrorCallback errorCallback3 = errorCallback;
                    if (errorCallback3 != null) {
                        errorCallback3.error(e3, "hwdec.iae\n" + "");
                    }
                    Logging.e(TAG, "initDecode failed", e3);
                    release();
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
            } catch (IOException | IllegalArgumentException unused) {
                String str = this.codecName;
                Logging.e(TAG, "Cannot create media decoder " + str);
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        }
    }

    private boolean isSupportedColorFormat(int i) {
        for (int i2 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bb, code lost:
        if (r7.surfaceTextureHelper != null) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c3, code lost:
        if (r8.containsKey("color-format") == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c5, code lost:
        r0 = r8.getInteger("color-format");
        r7.colorFormat = r0;
        r0 = java.lang.Integer.toHexString(r0);
        org.webrtc.Logging.d(TAG, "Color: 0x" + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ea, code lost:
        if (isSupportedColorFormat(r7.colorFormat) != false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ec, code lost:
        stopOnOutputThread(new java.lang.IllegalStateException(defpackage.wj6.h(r7.colorFormat, "Unsupported color format: ")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fd, code lost:
        r0 = r7.dimensionLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ff, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0106, code lost:
        if (r8.containsKey("stride") == false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0108, code lost:
        r7.stride = r8.getInteger("stride");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0111, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0119, code lost:
        if (r8.containsKey("slice-height") == false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011b, code lost:
        r7.sliceHeight = r8.getInteger("slice-height");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0123, code lost:
        r2 = r7.stride;
        r3 = r7.sliceHeight;
        org.webrtc.Logging.d(TAG, "Frame stride and slice height: " + r2 + " x " + r3);
        r7.stride = java.lang.Math.max(r7.width, r7.stride);
        r7.sliceHeight = java.lang.Math.max(r7.height, r7.sliceHeight);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0154, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0155, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0157, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void reformat(android.media.MediaFormat r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Unexpected format dimensions. Configured "
            java.lang.String r1 = "Frame stride and slice height: "
            java.lang.String r2 = "Unexpected size change. Configured "
            org.webrtc.ThreadUtils$ThreadChecker r3 = r7.outputThreadChecker
            r3.checkIsOnValidThread()
            java.lang.String r3 = "AndroidVideoDecoder"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Decoder format changed: "
            r4.<init>(r5)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            org.webrtc.Logging.d(r3, r4)
            java.lang.String r3 = "crop-left"
            boolean r3 = r8.containsKey(r3)
            if (r3 == 0) goto L_0x005d
            java.lang.String r3 = "crop-right"
            boolean r3 = r8.containsKey(r3)
            if (r3 == 0) goto L_0x005d
            java.lang.String r3 = "crop-bottom"
            boolean r3 = r8.containsKey(r3)
            if (r3 == 0) goto L_0x005d
            java.lang.String r3 = "crop-top"
            boolean r3 = r8.containsKey(r3)
            if (r3 == 0) goto L_0x005d
            java.lang.String r3 = "crop-right"
            int r3 = r8.getInteger(r3)
            int r3 = r3 + 1
            java.lang.String r4 = "crop-left"
            int r4 = r8.getInteger(r4)
            int r3 = r3 - r4
            java.lang.String r4 = "crop-bottom"
            int r4 = r8.getInteger(r4)
            int r4 = r4 + 1
            java.lang.String r5 = "crop-top"
            int r5 = r8.getInteger(r5)
            int r4 = r4 - r5
            goto L_0x0069
        L_0x005d:
            java.lang.String r3 = "width"
            int r3 = r8.getInteger(r3)
            java.lang.String r4 = "height"
            int r4 = r8.getInteger(r4)
        L_0x0069:
            java.lang.Object r5 = r7.dimensionLock
            monitor-enter(r5)
            int r6 = r7.width     // Catch:{ all -> 0x0075 }
            if (r3 != r6) goto L_0x0078
            int r6 = r7.height     // Catch:{ all -> 0x0075 }
            if (r4 == r6) goto L_0x00b8
            goto L_0x0078
        L_0x0075:
            r7 = move-exception
            goto L_0x018c
        L_0x0078:
            boolean r6 = r7.hasDecodedFirstFrame     // Catch:{ all -> 0x0075 }
            if (r6 == 0) goto L_0x00ae
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ all -> 0x0075 }
            int r0 = r7.width     // Catch:{ all -> 0x0075 }
            int r1 = r7.height     // Catch:{ all -> 0x0075 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r6.<init>(r2)     // Catch:{ all -> 0x0075 }
            r6.append(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "*"
            r6.append(r0)     // Catch:{ all -> 0x0075 }
            r6.append(r1)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = ". New "
            r6.append(r0)     // Catch:{ all -> 0x0075 }
            r6.append(r3)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "*"
            r6.append(r0)     // Catch:{ all -> 0x0075 }
            r6.append(r4)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0075 }
            r8.<init>(r0)     // Catch:{ all -> 0x0075 }
            r7.stopOnOutputThread(r8)     // Catch:{ all -> 0x0075 }
            monitor-exit(r5)     // Catch:{ all -> 0x0075 }
            return
        L_0x00ae:
            if (r3 <= 0) goto L_0x0158
            if (r4 > 0) goto L_0x00b4
            goto L_0x0158
        L_0x00b4:
            r7.width = r3     // Catch:{ all -> 0x0075 }
            r7.height = r4     // Catch:{ all -> 0x0075 }
        L_0x00b8:
            monitor-exit(r5)     // Catch:{ all -> 0x0075 }
            org.webrtc.SurfaceTextureHelper r0 = r7.surfaceTextureHelper
            if (r0 != 0) goto L_0x00fd
            java.lang.String r0 = "color-format"
            boolean r0 = r8.containsKey(r0)
            if (r0 == 0) goto L_0x00fd
            java.lang.String r0 = "color-format"
            int r0 = r8.getInteger(r0)
            r7.colorFormat = r0
            java.lang.String r2 = "AndroidVideoDecoder"
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Color: 0x"
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            org.webrtc.Logging.d(r2, r0)
            int r0 = r7.colorFormat
            boolean r0 = r7.isSupportedColorFormat(r0)
            if (r0 != 0) goto L_0x00fd
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            int r0 = r7.colorFormat
            java.lang.String r1 = "Unsupported color format: "
            java.lang.String r0 = defpackage.wj6.h(r0, r1)
            r8.<init>(r0)
            r7.stopOnOutputThread(r8)
            return
        L_0x00fd:
            java.lang.Object r0 = r7.dimensionLock
            monitor-enter(r0)
            java.lang.String r2 = "stride"
            boolean r2 = r8.containsKey(r2)     // Catch:{ all -> 0x0111 }
            if (r2 == 0) goto L_0x0113
            java.lang.String r2 = "stride"
            int r2 = r8.getInteger(r2)     // Catch:{ all -> 0x0111 }
            r7.stride = r2     // Catch:{ all -> 0x0111 }
            goto L_0x0113
        L_0x0111:
            r7 = move-exception
            goto L_0x0156
        L_0x0113:
            java.lang.String r2 = "slice-height"
            boolean r2 = r8.containsKey(r2)     // Catch:{ all -> 0x0111 }
            if (r2 == 0) goto L_0x0123
            java.lang.String r2 = "slice-height"
            int r8 = r8.getInteger(r2)     // Catch:{ all -> 0x0111 }
            r7.sliceHeight = r8     // Catch:{ all -> 0x0111 }
        L_0x0123:
            java.lang.String r8 = "AndroidVideoDecoder"
            int r2 = r7.stride     // Catch:{ all -> 0x0111 }
            int r3 = r7.sliceHeight     // Catch:{ all -> 0x0111 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0111 }
            r4.<init>(r1)     // Catch:{ all -> 0x0111 }
            r4.append(r2)     // Catch:{ all -> 0x0111 }
            java.lang.String r1 = " x "
            r4.append(r1)     // Catch:{ all -> 0x0111 }
            r4.append(r3)     // Catch:{ all -> 0x0111 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0111 }
            org.webrtc.Logging.d(r8, r1)     // Catch:{ all -> 0x0111 }
            int r8 = r7.width     // Catch:{ all -> 0x0111 }
            int r1 = r7.stride     // Catch:{ all -> 0x0111 }
            int r8 = java.lang.Math.max(r8, r1)     // Catch:{ all -> 0x0111 }
            r7.stride = r8     // Catch:{ all -> 0x0111 }
            int r8 = r7.height     // Catch:{ all -> 0x0111 }
            int r1 = r7.sliceHeight     // Catch:{ all -> 0x0111 }
            int r8 = java.lang.Math.max(r8, r1)     // Catch:{ all -> 0x0111 }
            r7.sliceHeight = r8     // Catch:{ all -> 0x0111 }
            monitor-exit(r0)     // Catch:{ all -> 0x0111 }
            return
        L_0x0156:
            monitor-exit(r0)     // Catch:{ all -> 0x0111 }
            throw r7
        L_0x0158:
            java.lang.String r8 = "AndroidVideoDecoder"
            int r1 = r7.width     // Catch:{ all -> 0x0075 }
            int r7 = r7.height     // Catch:{ all -> 0x0075 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r2.<init>(r0)     // Catch:{ all -> 0x0075 }
            r2.append(r1)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "*"
            r2.append(r0)     // Catch:{ all -> 0x0075 }
            r2.append(r7)     // Catch:{ all -> 0x0075 }
            java.lang.String r7 = ". New "
            r2.append(r7)     // Catch:{ all -> 0x0075 }
            r2.append(r3)     // Catch:{ all -> 0x0075 }
            java.lang.String r7 = "*"
            r2.append(r7)     // Catch:{ all -> 0x0075 }
            r2.append(r4)     // Catch:{ all -> 0x0075 }
            java.lang.String r7 = ". Skip it"
            r2.append(r7)     // Catch:{ all -> 0x0075 }
            java.lang.String r7 = r2.toString()     // Catch:{ all -> 0x0075 }
            org.webrtc.Logging.w(r8, r7)     // Catch:{ all -> 0x0075 }
            monitor-exit(r5)     // Catch:{ all -> 0x0075 }
            return
        L_0x018c:
            monitor-exit(r5)     // Catch:{ all -> 0x0075 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.AndroidVideoDecoder.reformat(android.media.MediaFormat):void");
    }

    private VideoCodecStatus reinitDecode(int i, int i2, long j) {
        this.decoderThreadChecker.checkIsOnValidThread();
        VideoCodecStatus releaseInternal = releaseInternal();
        return releaseInternal != VideoCodecStatus.OK ? releaseInternal : initDecodeInternal(i, i2, j);
    }

    /* access modifiers changed from: private */
    public void releaseCodecOnOutputThread(MediaCodecWrapper mediaCodecWrapper) {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "Releasing MediaCodec on output thread");
        try {
            mediaCodecWrapper.stop();
        } catch (Exception e) {
            Logging.e(TAG, "Media decoder stop failed", e);
        }
        try {
            mediaCodecWrapper.release();
        } catch (Exception e2) {
            Logging.e(TAG, "Media decoder release failed", e2);
            this.shutdownException = e2;
        }
        Logging.d(TAG, "Release on output thread done");
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    public VideoFrame.I420Buffer allocateI420Buffer(int i, int i2) {
        return JavaI420Buffer.allocate(i, i2);
    }

    public void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        YuvHelper.copyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
    }

    public SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo, long j) {
        int i;
        int i2;
        VideoCodecStatus reinitDecode;
        EncodedImage encodedImage2 = encodedImage;
        long j2 = j;
        this.decoderThreadChecker.checkIsOnValidThread();
        boolean z = true;
        if (this.callback == null) {
            if (this.codec == null) {
                z = false;
            }
            Logging.d(TAG, "decode uninitalized, codec: " + z + ", callback: " + this.callback);
            return VideoCodecStatus.UNINITIALIZED;
        }
        if (this.codec == null) {
            if (j2 == 0) {
                if (this.codec == null) {
                    z = false;
                }
                Logging.d(TAG, "decode uninitalized, codec: " + z + ", callback: " + this.callback);
                return VideoCodecStatus.UNINITIALIZED;
            } else if (!this.control.ssrcAllowedCodecInit(this, j2)) {
                return VideoCodecStatus.NO_OUTPUT;
            } else {
                VideoCodecStatus initDecodeInternal = initDecodeInternal(encodedImage2.encodedWidth, encodedImage2.encodedHeight, j2);
                if (initDecodeInternal != VideoCodecStatus.OK) {
                    return initDecodeInternal;
                }
            }
        }
        if (j2 != 0 && !this.control.ssrcAllowedDecode(this, j2)) {
            return VideoCodecStatus.NO_OUTPUT;
        }
        ByteBuffer byteBuffer = encodedImage2.buffer;
        if (byteBuffer == null) {
            Logging.e(TAG, "decode() - no input data");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            Logging.e(TAG, "decode() - input buffer empty");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        long j3 = this.ssrc;
        if (!(j3 == j2 || this.ssrc == 0)) {
            this.control.onDecoderSsrcChanged(this, j, j3);
            this.ssrc = j2;
        }
        synchronized (this.dimensionLock) {
            i = this.width;
            i2 = this.height;
        }
        int i3 = encodedImage2.encodedWidth;
        int i4 = encodedImage2.encodedHeight;
        if (i3 * i4 > 0 && ((i3 != i || i4 != i2) && (reinitDecode = reinitDecode(i3, i4, j2)) != VideoCodecStatus.OK)) {
            return reinitDecode;
        }
        if (!this.keyFrameRequired || encodedImage2.frameType == EncodedImage.FrameType.VideoFrameKey) {
            try {
                int dequeueInputBuffer = this.codec.dequeueInputBuffer(500000);
                if (dequeueInputBuffer < 0) {
                    Logging.e(TAG, "decode() - no HW buffers available; decoder falling behind");
                    return VideoCodecStatus.ERROR;
                }
                try {
                    ByteBuffer inputBuffer = this.codec.getInputBuffer(dequeueInputBuffer);
                    if (inputBuffer.capacity() < remaining) {
                        Logging.e(TAG, "decode() - HW buffer too small");
                        return VideoCodecStatus.ERROR;
                    }
                    inputBuffer.put(encodedImage2.buffer);
                    Logging.v(TAG, "frameInfos: " + this.frameInfos.size());
                    this.frameInfos.offer(new FrameInfo(SystemClock.elapsedRealtime(), encodedImage2.rotation));
                    try {
                        this.codec.queueInputBuffer(dequeueInputBuffer, 0, remaining, TimeUnit.NANOSECONDS.toMicros(encodedImage2.captureTimeNs), 0);
                        if (this.keyFrameRequired) {
                            this.keyFrameRequired = false;
                        }
                        return VideoCodecStatus.OK;
                    } catch (IllegalStateException e) {
                        Logging.e(TAG, "queueInputBuffer failed", e);
                        this.frameInfos.pollLast();
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
        } else {
            Logging.e(TAG, "decode() - key frame required first");
            return VideoCodecStatus.NO_OUTPUT;
        }
    }

    public void deliverDecodedFrame() {
        Integer num;
        int i;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000);
            if (dequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
            } else if (dequeueOutputBuffer < 0) {
                Logging.v(TAG, "dequeueOutputBuffer returned " + dequeueOutputBuffer);
            } else {
                FrameInfo poll = this.frameInfos.poll();
                if (poll != null) {
                    num = Integer.valueOf((int) (SystemClock.elapsedRealtime() - poll.decodeStartTimeMs));
                    i = poll.rotation;
                } else {
                    num = null;
                    i = 0;
                }
                this.hasDecodedFirstFrame = true;
                if (this.surfaceTextureHelper != null) {
                    deliverTextureFrame(dequeueOutputBuffer, bufferInfo, i, num);
                } else {
                    deliverByteFrame(dequeueOutputBuffer, bufferInfo, i, num);
                }
            }
        } catch (IllegalStateException e) {
            Logging.e(TAG, "deliverDecodedFrame failed", e);
        }
    }

    public String getImplementationName() {
        return this.codecName;
    }

    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback2) {
        this.decoderThreadChecker = new ThreadUtils.ThreadChecker();
        this.callback = callback2;
        synchronized (this.dimensionLock) {
            this.width = settings.width;
            this.height = settings.height;
        }
        return VideoCodecStatus.OK;
    }

    public void onFrame(VideoFrame videoFrame) {
        long j;
        Integer num;
        synchronized (this.renderedTextureMetadataLock) {
            if (this.renderedTextureMetadata != null) {
                j = this.renderedTextureMetadata.presentationTimestampUs * 1000;
                num = this.renderedTextureMetadata.decodeTimeMs;
                this.renderedTextureMetadata = null;
            } else {
                throw new IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
        }
        this.variable.open();
        this.callback.onDecodedFrame(new VideoFrame(videoFrame.getBuffer(), videoFrame.getRotation(), j), num, (Integer) null);
    }

    public VideoCodecStatus release() {
        Logging.d(TAG, "release");
        VideoCodecStatus releaseInternal = releaseInternal();
        this.callback = null;
        return releaseInternal;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x0066=Splitter:B:26:0x0066, B:66:0x00b6=Splitter:B:66:0x00b6, B:132:0x0126=Splitter:B:132:0x0126, B:98:0x00e7=Splitter:B:98:0x00e7} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.webrtc.VideoCodecStatus releaseInternal() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.initLock
            monitor-enter(r0)
            boolean r1 = r5.running     // Catch:{ all -> 0x0012 }
            if (r1 != 0) goto L_0x0015
            java.lang.String r5 = "AndroidVideoDecoder"
            java.lang.String r1 = "release: Decoder is not running."
            org.webrtc.Logging.d(r5, r1)     // Catch:{ all -> 0x0012 }
            org.webrtc.VideoCodecStatus r5 = org.webrtc.VideoCodecStatus.OK     // Catch:{ all -> 0x0012 }
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return r5
        L_0x0012:
            r5 = move-exception
            goto L_0x013a
        L_0x0015:
            r1 = 0
            r2 = 0
            r5.running = r1     // Catch:{ all -> 0x0045 }
            java.lang.Thread r1 = r5.outputThread     // Catch:{ all -> 0x0045 }
            r3 = 5000(0x1388, double:2.4703E-320)
            boolean r1 = org.webrtc.ThreadUtils.joinUninterruptibly(r1, r3)     // Catch:{ all -> 0x0045 }
            if (r1 != 0) goto L_0x007b
            java.lang.String r1 = "\n"
            java.lang.Thread r3 = r5.outputThread     // Catch:{ all -> 0x0045 }
            java.lang.StackTraceElement[] r3 = r3.getStackTrace()     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = android.text.TextUtils.join(r1, r3)     // Catch:{ all -> 0x0045 }
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x0045 }
            r3.<init>(r1)     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "AndroidVideoDecoder"
            java.lang.String r4 = "Media decoder release timeout"
            org.webrtc.Logging.e(r1, r4, r3)     // Catch:{ all -> 0x0045 }
            org.webrtc.AndroidVideoDecoder$ErrorCallback r1 = errorCallback     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0048
            java.lang.String r4 = "hwdec.release.timeout"
            r1.error(r3, r4)     // Catch:{ all -> 0x0045 }
            goto L_0x0048
        L_0x0045:
            r1 = move-exception
            goto L_0x010a
        L_0x0048:
            org.webrtc.VideoCodecStatus r1 = org.webrtc.VideoCodecStatus.OK     // Catch:{ all -> 0x0045 }
            r5.codec = r2     // Catch:{ all -> 0x0012 }
            r5.outputThread = r2     // Catch:{ all -> 0x0012 }
            android.view.Surface r3 = r5.surface     // Catch:{ all -> 0x0064 }
            if (r3 == 0) goto L_0x0066
            r5.releaseSurface()     // Catch:{ all -> 0x0064 }
            r5.surface = r2     // Catch:{ all -> 0x0064 }
            org.webrtc.SurfaceTextureHelper r3 = r5.surfaceTextureHelper     // Catch:{ all -> 0x0064 }
            r3.stopListening()     // Catch:{ all -> 0x0064 }
            org.webrtc.SurfaceTextureHelper r3 = r5.surfaceTextureHelper     // Catch:{ all -> 0x0064 }
            r3.dispose()     // Catch:{ all -> 0x0064 }
            r5.surfaceTextureHelper = r2     // Catch:{ all -> 0x0064 }
            goto L_0x0066
        L_0x0064:
            r1 = move-exception
            goto L_0x0071
        L_0x0066:
            java.lang.Object r3 = r5.renderedTextureMetadataLock     // Catch:{ all -> 0x0012 }
            monitor-enter(r3)     // Catch:{ all -> 0x0012 }
            r5.renderedTextureMetadata = r2     // Catch:{ all -> 0x006e }
            monitor-exit(r3)     // Catch:{ all -> 0x006e }
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return r1
        L_0x006e:
            r5 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x006e }
            throw r5     // Catch:{ all -> 0x0012 }
        L_0x0071:
            java.lang.Object r3 = r5.renderedTextureMetadataLock     // Catch:{ all -> 0x0012 }
            monitor-enter(r3)     // Catch:{ all -> 0x0012 }
            r5.renderedTextureMetadata = r2     // Catch:{ all -> 0x0078 }
            monitor-exit(r3)     // Catch:{ all -> 0x0078 }
            throw r1     // Catch:{ all -> 0x0012 }
        L_0x0078:
            r5 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0078 }
            throw r5     // Catch:{ all -> 0x0012 }
        L_0x007b:
            java.lang.Exception r1 = r5.shutdownException     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x00cb
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0045 }
            java.lang.Exception r3 = r5.shutdownException     // Catch:{ all -> 0x0045 }
            r1.<init>(r3)     // Catch:{ all -> 0x0045 }
            java.lang.String r3 = "AndroidVideoDecoder"
            java.lang.String r4 = "Media decoder release error"
            org.webrtc.Logging.e(r3, r4, r1)     // Catch:{ all -> 0x0045 }
            org.webrtc.AndroidVideoDecoder$ErrorCallback r3 = errorCallback     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x0096
            java.lang.String r4 = "hwdec.release.e"
            r3.error(r1, r4)     // Catch:{ all -> 0x0045 }
        L_0x0096:
            r5.shutdownException = r2     // Catch:{ all -> 0x0045 }
            org.webrtc.VideoCodecStatus r1 = org.webrtc.VideoCodecStatus.ERROR     // Catch:{ all -> 0x0045 }
            r5.codec = r2     // Catch:{ all -> 0x0012 }
            r5.outputThread = r2     // Catch:{ all -> 0x0012 }
            android.view.Surface r3 = r5.surface     // Catch:{ all -> 0x00b4 }
            if (r3 == 0) goto L_0x00b6
            r5.releaseSurface()     // Catch:{ all -> 0x00b4 }
            r5.surface = r2     // Catch:{ all -> 0x00b4 }
            org.webrtc.SurfaceTextureHelper r3 = r5.surfaceTextureHelper     // Catch:{ all -> 0x00b4 }
            r3.stopListening()     // Catch:{ all -> 0x00b4 }
            org.webrtc.SurfaceTextureHelper r3 = r5.surfaceTextureHelper     // Catch:{ all -> 0x00b4 }
            r3.dispose()     // Catch:{ all -> 0x00b4 }
            r5.surfaceTextureHelper = r2     // Catch:{ all -> 0x00b4 }
            goto L_0x00b6
        L_0x00b4:
            r1 = move-exception
            goto L_0x00c1
        L_0x00b6:
            java.lang.Object r3 = r5.renderedTextureMetadataLock     // Catch:{ all -> 0x0012 }
            monitor-enter(r3)     // Catch:{ all -> 0x0012 }
            r5.renderedTextureMetadata = r2     // Catch:{ all -> 0x00be }
            monitor-exit(r3)     // Catch:{ all -> 0x00be }
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return r1
        L_0x00be:
            r5 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00be }
            throw r5     // Catch:{ all -> 0x0012 }
        L_0x00c1:
            java.lang.Object r3 = r5.renderedTextureMetadataLock     // Catch:{ all -> 0x0012 }
            monitor-enter(r3)     // Catch:{ all -> 0x0012 }
            r5.renderedTextureMetadata = r2     // Catch:{ all -> 0x00c8 }
            monitor-exit(r3)     // Catch:{ all -> 0x00c8 }
            throw r1     // Catch:{ all -> 0x0012 }
        L_0x00c8:
            r5 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00c8 }
            throw r5     // Catch:{ all -> 0x0012 }
        L_0x00cb:
            r5.codec = r2     // Catch:{ all -> 0x0012 }
            r5.outputThread = r2     // Catch:{ all -> 0x0012 }
            android.view.Surface r1 = r5.surface     // Catch:{ all -> 0x00e5 }
            if (r1 == 0) goto L_0x00e7
            r5.releaseSurface()     // Catch:{ all -> 0x00e5 }
            r5.surface = r2     // Catch:{ all -> 0x00e5 }
            org.webrtc.SurfaceTextureHelper r1 = r5.surfaceTextureHelper     // Catch:{ all -> 0x00e5 }
            r1.stopListening()     // Catch:{ all -> 0x00e5 }
            org.webrtc.SurfaceTextureHelper r1 = r5.surfaceTextureHelper     // Catch:{ all -> 0x00e5 }
            r1.dispose()     // Catch:{ all -> 0x00e5 }
            r5.surfaceTextureHelper = r2     // Catch:{ all -> 0x00e5 }
            goto L_0x00e7
        L_0x00e5:
            r1 = move-exception
            goto L_0x0100
        L_0x00e7:
            java.lang.Object r1 = r5.renderedTextureMetadataLock     // Catch:{ all -> 0x0012 }
            monitor-enter(r1)     // Catch:{ all -> 0x0012 }
            r5.renderedTextureMetadata = r2     // Catch:{ all -> 0x00fd }
            monitor-exit(r1)     // Catch:{ all -> 0x00fd }
            java.util.concurrent.BlockingDeque<org.webrtc.AndroidVideoDecoder$FrameInfo> r1 = r5.frameInfos     // Catch:{ all -> 0x0012 }
            r1.clear()     // Catch:{ all -> 0x0012 }
            org.webrtc.DecoderSsrcControl r1 = r5.control     // Catch:{ all -> 0x0012 }
            long r2 = r5.ssrc     // Catch:{ all -> 0x0012 }
            r1.onDecoderRelease(r5, r2)     // Catch:{ all -> 0x0012 }
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            org.webrtc.VideoCodecStatus r5 = org.webrtc.VideoCodecStatus.OK
            return r5
        L_0x00fd:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00fd }
            throw r5     // Catch:{ all -> 0x0012 }
        L_0x0100:
            java.lang.Object r3 = r5.renderedTextureMetadataLock     // Catch:{ all -> 0x0012 }
            monitor-enter(r3)     // Catch:{ all -> 0x0012 }
            r5.renderedTextureMetadata = r2     // Catch:{ all -> 0x0107 }
            monitor-exit(r3)     // Catch:{ all -> 0x0107 }
            throw r1     // Catch:{ all -> 0x0012 }
        L_0x0107:
            r5 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0107 }
            throw r5     // Catch:{ all -> 0x0012 }
        L_0x010a:
            r5.codec = r2     // Catch:{ all -> 0x0012 }
            r5.outputThread = r2     // Catch:{ all -> 0x0012 }
            android.view.Surface r3 = r5.surface     // Catch:{ all -> 0x0124 }
            if (r3 == 0) goto L_0x0126
            r5.releaseSurface()     // Catch:{ all -> 0x0124 }
            r5.surface = r2     // Catch:{ all -> 0x0124 }
            org.webrtc.SurfaceTextureHelper r3 = r5.surfaceTextureHelper     // Catch:{ all -> 0x0124 }
            r3.stopListening()     // Catch:{ all -> 0x0124 }
            org.webrtc.SurfaceTextureHelper r3 = r5.surfaceTextureHelper     // Catch:{ all -> 0x0124 }
            r3.dispose()     // Catch:{ all -> 0x0124 }
            r5.surfaceTextureHelper = r2     // Catch:{ all -> 0x0124 }
            goto L_0x0126
        L_0x0124:
            r1 = move-exception
            goto L_0x0130
        L_0x0126:
            java.lang.Object r3 = r5.renderedTextureMetadataLock     // Catch:{ all -> 0x0012 }
            monitor-enter(r3)     // Catch:{ all -> 0x0012 }
            r5.renderedTextureMetadata = r2     // Catch:{ all -> 0x012d }
            monitor-exit(r3)     // Catch:{ all -> 0x012d }
            throw r1     // Catch:{ all -> 0x0012 }
        L_0x012d:
            r5 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x012d }
            throw r5     // Catch:{ all -> 0x0012 }
        L_0x0130:
            java.lang.Object r3 = r5.renderedTextureMetadataLock     // Catch:{ all -> 0x0012 }
            monitor-enter(r3)     // Catch:{ all -> 0x0012 }
            r5.renderedTextureMetadata = r2     // Catch:{ all -> 0x0137 }
            monitor-exit(r3)     // Catch:{ all -> 0x0137 }
            throw r1     // Catch:{ all -> 0x0012 }
        L_0x0137:
            r5 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0137 }
            throw r5     // Catch:{ all -> 0x0012 }
        L_0x013a:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.AndroidVideoDecoder.releaseInternal():org.webrtc.VideoCodecStatus");
    }

    public void releaseSurface() {
        this.surface.release();
    }

    public void shutdown() {
        releaseInternal();
    }
}
