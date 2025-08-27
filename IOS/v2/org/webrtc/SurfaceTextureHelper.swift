package org.webrtc;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Callable;
import org.webrtc.EglBase;
import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoFrame;

public class SurfaceTextureHelper {
    private static final String TAG = "SurfaceTextureHelper";
    private final EglBase eglBase;
    /* access modifiers changed from: private */
    public final FrameRefMonitor frameRefMonitor;
    private int frameRotation;
    private final FrameGeometryAdjuster geometryAdjuster;
    private final Handler handler;
    /* access modifiers changed from: private */
    public boolean hasPendingTexture;
    private boolean isQuitting;
    private volatile boolean isTextureInUse;
    /* access modifiers changed from: private */
    public VideoSink listener;
    private final int oesTextureId;
    /* access modifiers changed from: private */
    public VideoSink pendingListener;
    final Runnable setListenerRunnable;
    private final SurfaceTexture surfaceTexture;
    private int textureHeight;
    private final TextureBufferImpl.RefCountMonitor textureRefCountMonitor;
    private int textureWidth;
    private final TimestampAligner timestampAligner;
    private final YuvConverter yuvConverter;

    public static class FrameGeometry {
        public final int height;
        public final int scaledHeight;
        public final int scaledWidth;
        public final Matrix transform;
        public final int width;

        public FrameGeometry(int i, int i2, int i3, int i4, Matrix matrix) {
            this.width = i;
            this.height = i2;
            this.scaledWidth = i3;
            this.scaledHeight = i4;
            this.transform = matrix;
        }
    }

    public interface FrameGeometryAdjuster {
        FrameGeometry adjustFrameGeometry(Matrix matrix, int i, int i2);
    }

    public interface FrameRefMonitor {
        void onDestroyBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onNewBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onReleaseBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onRetainBuffer(VideoFrame.TextureBuffer textureBuffer);
    }

    public /* synthetic */ SurfaceTextureHelper(EglBase.Context context, Handler handler2, boolean z, YuvConverter yuvConverter2, FrameRefMonitor frameRefMonitor2, FrameGeometryAdjuster frameGeometryAdjuster, int i) {
        this(context, handler2, z, yuvConverter2, frameRefMonitor2, frameGeometryAdjuster);
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z, YuvConverter yuvConverter2, FrameRefMonitor frameRefMonitor2) {
        return create(str, context, false, new YuvConverter(), frameRefMonitor2, (FrameGeometryAdjuster) null);
    }

    private VideoFrame.TextureBuffer createFrameBuffer(int i, int i2, VideoFrame.TextureBuffer.Type type, int i3, Matrix matrix, Handler handler2, YuvConverter yuvConverter2, TextureBufferImpl.RefCountMonitor refCountMonitor) {
        FrameGeometry frameGeometry;
        FrameGeometryAdjuster frameGeometryAdjuster = this.geometryAdjuster;
        if (frameGeometryAdjuster != null) {
            int i4 = i;
            int i5 = i2;
            frameGeometry = frameGeometryAdjuster.adjustFrameGeometry(matrix, i, i2);
        } else {
            int i6 = i;
            int i7 = i2;
            Matrix matrix2 = matrix;
            frameGeometry = null;
        }
        if (frameGeometry == null) {
            return new TextureBufferImpl(i, i2, type, i3, matrix, handler2, yuvConverter2, refCountMonitor);
        }
        return new TextureBufferImpl(frameGeometry.width, frameGeometry.height, frameGeometry.scaledWidth, frameGeometry.scaledHeight, type, i3, frameGeometry.transform, handler2, yuvConverter2, refCountMonitor);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$dispose$6() {
        this.isQuitting = true;
        if (!this.isTextureInUse) {
            release();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$forceFrame$3() {
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(SurfaceTexture surfaceTexture2) {
        if (this.hasPendingTexture) {
            Logging.d(TAG, "A frame is already pending, dropping frame.");
        }
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$returnTextureFrame$5() {
        this.isTextureInUse = false;
        if (this.isQuitting) {
            release();
        } else {
            tryDeliverTextureFrame();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setFrameRotation$4(int i) {
        this.frameRotation = i;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setTextureSize$2(int i, int i2) {
        this.textureWidth = i;
        this.textureHeight = i2;
        tryDeliverTextureFrame();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$stopListening$1() {
        this.listener = null;
        this.pendingListener = null;
    }

    private void release() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (this.isTextureInUse || !this.isQuitting) {
            throw new IllegalStateException("Unexpected release.");
        } else {
            this.yuvConverter.release();
            GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
            this.surfaceTexture.release();
            this.eglBase.release();
            this.handler.getLooper().quit();
            TimestampAligner timestampAligner2 = this.timestampAligner;
            if (timestampAligner2 != null) {
                timestampAligner2.dispose();
            }
        }
    }

    /* access modifiers changed from: private */
    public void returnTextureFrame() {
        this.handler.post(new a4f(this, 2));
    }

    private void tryDeliverTextureFrame() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (!this.isQuitting && this.hasPendingTexture && !this.isTextureInUse && this.listener != null) {
            if (this.textureWidth == 0 || this.textureHeight == 0) {
                Logging.w(TAG, "Texture size has not been set.");
                return;
            }
            this.isTextureInUse = true;
            this.hasPendingTexture = false;
            updateTexImage();
            float[] fArr = new float[16];
            this.surfaceTexture.getTransformMatrix(fArr);
            long timestamp = this.surfaceTexture.getTimestamp();
            TimestampAligner timestampAligner2 = this.timestampAligner;
            if (timestampAligner2 != null) {
                timestamp = timestampAligner2.translateTimestamp(timestamp);
            }
            VideoFrame.TextureBuffer createFrameBuffer = createFrameBuffer(this.textureWidth, this.textureHeight, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, this.textureRefCountMonitor);
            FrameRefMonitor frameRefMonitor2 = this.frameRefMonitor;
            if (frameRefMonitor2 != null) {
                frameRefMonitor2.onNewBuffer(createFrameBuffer);
            }
            VideoFrame videoFrame = new VideoFrame(createFrameBuffer, this.frameRotation, timestamp);
            this.listener.onFrame(videoFrame);
            videoFrame.release();
        }
    }

    /* access modifiers changed from: private */
    public void updateTexImage() {
        synchronized (EglBase.lock) {
            this.surfaceTexture.updateTexImage();
        }
    }

    public void deliverFrame() {
        if (this.hasPendingTexture) {
            Logging.d(TAG, "A frame is already pending, dropping frame.");
        }
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    public void dispose() {
        Logging.d(TAG, "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, (Runnable) new a4f(this, 1));
    }

    public void forceFrame() {
        this.handler.post(new a4f(this, 3));
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    public void setFrameRotation(int i) {
        this.handler.post(new l40(this, i, 18));
    }

    public void setTextureSize(int i, int i2) {
        if (i <= 0) {
            throw new IllegalArgumentException(wj6.h(i, "Texture width must be positive, but was "));
        } else if (i2 > 0) {
            this.surfaceTexture.setDefaultBufferSize(i, i2);
            this.handler.post(new wt0(this, i, i2, 6));
        } else {
            throw new IllegalArgumentException(wj6.h(i2, "Texture height must be positive, but was "));
        }
    }

    public void startListening(VideoSink videoSink) {
        if (this.listener == null && this.pendingListener == null) {
            this.pendingListener = videoSink;
            this.handler.post(this.setListenerRunnable);
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
    }

    public void stopListening() {
        Logging.d(TAG, "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, (Runnable) new a4f(this, 0));
    }

    @Deprecated
    public VideoFrame.I420Buffer textureToYuv(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.toI420();
    }

    private SurfaceTextureHelper(EglBase.Context context, Handler handler2, boolean z, YuvConverter yuvConverter2, FrameRefMonitor frameRefMonitor2, FrameGeometryAdjuster frameGeometryAdjuster) {
        this.textureRefCountMonitor = new TextureBufferImpl.RefCountMonitor() {
            public void onDestroy(TextureBufferImpl textureBufferImpl) {
                SurfaceTextureHelper.this.returnTextureFrame();
                if (SurfaceTextureHelper.this.frameRefMonitor != null) {
                    SurfaceTextureHelper.this.frameRefMonitor.onDestroyBuffer(textureBufferImpl);
                }
            }

            public void onRelease(TextureBufferImpl textureBufferImpl) {
                if (SurfaceTextureHelper.this.frameRefMonitor != null) {
                    SurfaceTextureHelper.this.frameRefMonitor.onReleaseBuffer(textureBufferImpl);
                }
            }

            public void onRetain(TextureBufferImpl textureBufferImpl) {
                if (SurfaceTextureHelper.this.frameRefMonitor != null) {
                    SurfaceTextureHelper.this.frameRefMonitor.onRetainBuffer(textureBufferImpl);
                }
            }
        };
        this.setListenerRunnable = new Runnable() {
            public void run() {
                VideoSink j = SurfaceTextureHelper.this.pendingListener;
                Logging.d(SurfaceTextureHelper.TAG, "Setting listener to " + j);
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
                SurfaceTextureHelper.this.pendingListener = null;
                if (SurfaceTextureHelper.this.hasPendingTexture) {
                    SurfaceTextureHelper.this.updateTexImage();
                    SurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }
        };
        if (handler2.getLooper().getThread() == Thread.currentThread()) {
            this.handler = handler2;
            this.timestampAligner = z ? new TimestampAligner() : null;
            this.geometryAdjuster = frameGeometryAdjuster;
            this.yuvConverter = yuvConverter2;
            this.frameRefMonitor = frameRefMonitor2;
            EglBase create = EglBase.create(context, EglBase.CONFIG_PIXEL_BUFFER);
            this.eglBase = create;
            try {
                create.createDummyPbufferSurface();
                create.makeCurrent();
                int generateTexture = GlUtil.generateTexture(36197);
                this.oesTextureId = generateTexture;
                SurfaceTexture surfaceTexture2 = new SurfaceTexture(generateTexture);
                this.surfaceTexture = surfaceTexture2;
                surfaceTexture2.setOnFrameAvailableListener(new eed(1, this), handler2);
            } catch (RuntimeException e) {
                this.eglBase.release();
                handler2.getLooper().quit();
                throw e;
            }
        } else {
            throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
        }
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z, YuvConverter yuvConverter2, FrameRefMonitor frameRefMonitor2, FrameGeometryAdjuster frameGeometryAdjuster) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        Handler handler2 = new Handler(handlerThread.getLooper());
        final EglBase.Context context2 = context;
        final Handler handler3 = handler2;
        final boolean z2 = z;
        final YuvConverter yuvConverter3 = yuvConverter2;
        final FrameRefMonitor frameRefMonitor3 = frameRefMonitor2;
        final FrameGeometryAdjuster frameGeometryAdjuster2 = frameGeometryAdjuster;
        final String str2 = str;
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler2, new Callable<SurfaceTextureHelper>() {
            public SurfaceTextureHelper call() {
                try {
                    return new SurfaceTextureHelper(EglBase.Context.this, handler3, z2, yuvConverter3, frameRefMonitor3, frameGeometryAdjuster2, 0);
                } catch (RuntimeException e) {
                    String str = str2;
                    Logging.e(SurfaceTextureHelper.TAG, str + " create failure", e);
                    return null;
                }
            }
        });
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context) {
        return create(str, context, false, new YuvConverter(), (FrameRefMonitor) null);
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z) {
        return create(str, context, z, new YuvConverter(), (FrameRefMonitor) null);
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z, YuvConverter yuvConverter2) {
        return create(str, context, z, yuvConverter2, (FrameRefMonitor) null);
    }
}
