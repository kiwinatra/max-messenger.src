package org.webrtc;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

public class ScreenCapturerAndroid implements VideoCapturer, VideoSink {
    private static final int DISPLAY_FLAGS = 3;
    public static final int FRAME_RESUBMIT_DELAY_MILLIS = 200;
    private static final int VIRTUAL_DISPLAY_DPI = 400;
    /* access modifiers changed from: private */
    public CapturerObserver capturerObserver;
    private int height;
    private boolean isDisposed;
    private long lastNewFrameSystemtime;
    private long lastNewFrameTimestamp;
    /* access modifiers changed from: private */
    public MediaProjection mediaProjection;
    /* access modifiers changed from: private */
    public final MediaProjection.Callback mediaProjectionCallback;
    private MediaProjectionManager mediaProjectionManager;
    private final Intent mediaProjectionPermissionResultData;
    private long numCapturedFrames;
    private final Runnable rerequestTextureFrame = new ogd(this, 0);
    /* access modifiers changed from: private */
    public SurfaceTextureHelper surfaceTextureHelper;
    /* access modifiers changed from: private */
    public VirtualDisplay virtualDisplay;
    private int width;

    public ScreenCapturerAndroid(Intent intent, MediaProjection.Callback callback) {
        this.mediaProjectionPermissionResultData = intent;
        this.mediaProjectionCallback = callback;
    }

    private VideoFrame adjustTs(VideoFrame videoFrame) {
        long j;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long timestampNs = videoFrame.getTimestampNs();
        long j2 = this.lastNewFrameTimestamp;
        if (timestampNs > j2) {
            j = j2 == 0 ? videoFrame.getTimestampNs() : Math.max(videoFrame.getTimestampNs(), (elapsedRealtimeNanos - this.lastNewFrameSystemtime) + this.lastNewFrameTimestamp);
            this.lastNewFrameTimestamp = j;
            this.lastNewFrameSystemtime = elapsedRealtimeNanos;
        } else {
            j = (elapsedRealtimeNanos - this.lastNewFrameSystemtime) + j2;
        }
        return videoFrame.getTimestampNs() == j ? videoFrame : new VideoFrame(videoFrame.getBuffer(), videoFrame.getRotation(), j);
    }

    private void checkNotDisposed() {
        if (this.isDisposed) {
            throw new RuntimeException("capturer is disposed.");
        }
    }

    private void createVirtualDisplay() {
        VirtualDisplay virtualDisplay2 = this.virtualDisplay;
        if (virtualDisplay2 != null) {
            virtualDisplay2.release();
        }
        this.virtualDisplay = this.mediaProjection.createVirtualDisplay("WebRTC_ScreenCapture", this.width, this.height, 400, 3, new Surface(this.surfaceTextureHelper.getSurfaceTexture()), (VirtualDisplay.Callback) null, (Handler) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        this.surfaceTextureHelper.deliverFrame();
    }

    /* access modifiers changed from: private */
    public void updateVirtualDisplay() {
        this.surfaceTextureHelper.setTextureSize(this.width, this.height);
        VirtualDisplay virtualDisplay2 = this.virtualDisplay;
        if (virtualDisplay2 == null || Build.VERSION.SDK_INT < 31) {
            createVirtualDisplay();
            return;
        }
        virtualDisplay2.resize(this.width, this.height, 400);
        this.virtualDisplay.setSurface(new Surface(this.surfaceTextureHelper.getSurfaceTexture()));
    }

    public synchronized void changeCaptureFormat(int i, int i2, int i3) {
        checkNotDisposed();
        this.width = i;
        this.height = i2;
        if (this.virtualDisplay != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), (Runnable) new ogd(this, 1));
        }
    }

    public synchronized void dispose() {
        this.isDisposed = true;
        SurfaceTextureHelper surfaceTextureHelper2 = this.surfaceTextureHelper;
        if (surfaceTextureHelper2 != null) {
            surfaceTextureHelper2.getHandler().removeCallbacks(this.rerequestTextureFrame);
        }
    }

    public MediaProjection getMediaProjection() {
        return this.mediaProjection;
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }

    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper2, Context context, CapturerObserver capturerObserver2) {
        checkNotDisposed();
        if (capturerObserver2 != null) {
            this.capturerObserver = capturerObserver2;
            if (surfaceTextureHelper2 != null) {
                this.surfaceTextureHelper = surfaceTextureHelper2;
                this.mediaProjectionManager = (MediaProjectionManager) context.getSystemService("media_projection");
            } else {
                throw new RuntimeException("surfaceTextureHelper not set.");
            }
        } else {
            throw new RuntimeException("capturerObserver not set.");
        }
    }

    public boolean isScreencast() {
        return true;
    }

    public void onFrame(VideoFrame videoFrame) {
        this.numCapturedFrames++;
        if (!this.isDisposed) {
            Handler handler = this.surfaceTextureHelper.getHandler();
            handler.removeCallbacks(this.rerequestTextureFrame);
            handler.postDelayed(this.rerequestTextureFrame, 200);
            if (this.isDisposed) {
                handler.removeCallbacks(this.rerequestTextureFrame);
            }
        }
        this.capturerObserver.onFrameCaptured(adjustTs(videoFrame));
    }

    public synchronized void startCapture(int i, int i2, int i3) {
        checkNotDisposed();
        this.width = i;
        this.height = i2;
        MediaProjection mediaProjection2 = this.mediaProjectionManager.getMediaProjection(-1, this.mediaProjectionPermissionResultData);
        this.mediaProjection = mediaProjection2;
        mediaProjection2.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
        updateVirtualDisplay();
        this.capturerObserver.onCapturerStarted(true);
        this.surfaceTextureHelper.startListening(this);
    }

    public synchronized void stopCapture() {
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), (Runnable) new Runnable() {
            public void run() {
                ScreenCapturerAndroid.this.surfaceTextureHelper.stopListening();
                ScreenCapturerAndroid.this.capturerObserver.onCapturerStopped();
                if (ScreenCapturerAndroid.this.virtualDisplay != null) {
                    ScreenCapturerAndroid.this.virtualDisplay.release();
                    ScreenCapturerAndroid.this.virtualDisplay = null;
                }
                if (ScreenCapturerAndroid.this.mediaProjection != null) {
                    ScreenCapturerAndroid.this.mediaProjection.unregisterCallback(ScreenCapturerAndroid.this.mediaProjectionCallback);
                    ScreenCapturerAndroid.this.mediaProjection.stop();
                    ScreenCapturerAndroid.this.mediaProjection = null;
                }
            }
        });
    }
}
