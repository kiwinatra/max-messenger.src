package org.webrtc;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraSession;
import org.webrtc.CameraVideoCapturer;

class Camera1Session implements CameraSession {
    private static final int NUMBER_OF_CAPTURE_BUFFERS = 3;
    private static final String TAG = "Camera1Session";
    private static final Histogram camera1ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera1.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());
    /* access modifiers changed from: private */
    public static final Histogram camera1StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera1.StartTimeMs", 1, 10000, 50);
    private static final Histogram camera1StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera1.StopTimeMs", 1, 10000, 50);
    private final Context applicationContext;
    /* access modifiers changed from: private */
    public final Camera camera;
    private final int cameraId;
    /* access modifiers changed from: private */
    public final Handler cameraThreadHandler = new Handler();
    /* access modifiers changed from: private */
    public final CameraEnumerationAndroid.CaptureFormat captureFormat;
    private final boolean captureToTexture;
    /* access modifiers changed from: private */
    public final long constructionTimeNs;
    /* access modifiers changed from: private */
    public final CameraSession.Events events;
    /* access modifiers changed from: private */
    public boolean firstFrameReported;
    private final Camera.CameraInfo info;
    /* access modifiers changed from: private */
    public SessionState state;
    private final SurfaceTextureHelper surfaceTextureHelper;

    public enum SessionState {
        RUNNING,
        STOPPED
    }

    private Camera1Session(CameraSession.Events events2, boolean z, Context context, SurfaceTextureHelper surfaceTextureHelper2, int i, Camera camera2, Camera.CameraInfo cameraInfo, CameraEnumerationAndroid.CaptureFormat captureFormat2, long j) {
        Logging.d(TAG, "Create new camera1 session on camera " + i);
        this.events = events2;
        this.captureToTexture = z;
        this.applicationContext = context;
        this.surfaceTextureHelper = surfaceTextureHelper2;
        this.cameraId = i;
        this.camera = camera2;
        this.info = cameraInfo;
        this.captureFormat = captureFormat2;
        this.constructionTimeNs = j;
        surfaceTextureHelper2.setTextureSize(captureFormat2.width, captureFormat2.height);
        startCapturing();
    }

    /* access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            throw new IllegalStateException("Wrong thread");
        }
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events2, boolean z, Context context, SurfaceTextureHelper surfaceTextureHelper2, String str, int i, int i2, int i3) {
        create(createSessionCallback, events2, z, context, surfaceTextureHelper2, str, (CameraVideoCapturer.CaptureFormatHelper) null, i, i2, i3);
    }

    private static CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat(Camera.Parameters parameters, CameraVideoCapturer.CaptureFormatHelper captureFormatHelper, int i, int i2, int i3) {
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = Camera1Enumerator.convertFramerates(parameters.getSupportedPreviewFpsRange());
        Logging.d(TAG, "Available fps ranges: " + convertFramerates);
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = captureFormatHelper.getClosestSupportedFramerateRange(convertFramerates, i3);
        Size closestSupportedSize = captureFormatHelper.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPreviewSizes()), i, i2);
        CameraEnumerationAndroid.reportCameraResolution(camera1ResolutionHistogram, closestSupportedSize);
        return new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
    }

    private static Size findClosestPictureSize(Camera.Parameters parameters, CameraVideoCapturer.CaptureFormatHelper captureFormatHelper, int i, int i2) {
        return captureFormatHelper.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPictureSizes()), i, i2);
    }

    /* access modifiers changed from: private */
    public int getFrameOrientation() {
        int deviceOrientation = CameraSession.getDeviceOrientation(this.applicationContext);
        Camera.CameraInfo cameraInfo = this.info;
        if (cameraInfo.facing == 0) {
            deviceOrientation = 360 - deviceOrientation;
        }
        return (cameraInfo.orientation + deviceOrientation) % 360;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$listenForTextureFrames$0(VideoFrame videoFrame) {
        checkIsOnCameraThread();
        if (this.state != SessionState.RUNNING) {
            Logging.d(TAG, "Texture frame captured but camera is no longer running.");
            return;
        }
        boolean z = true;
        if (!this.firstFrameReported) {
            camera1StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.constructionTimeNs));
            this.firstFrameReported = true;
        }
        TextureBufferImpl textureBufferImpl = (TextureBufferImpl) videoFrame.getBuffer();
        if (this.info.facing != 1) {
            z = false;
        }
        VideoFrame videoFrame2 = new VideoFrame(CameraSession.createTextureBufferWithModifiedTransformMatrix(textureBufferImpl, z, 0), getFrameOrientation(), videoFrame.getTimestampNs());
        this.events.onFrameCaptured(this, videoFrame2);
        videoFrame2.release();
    }

    private void listenForBytebufferFrames() {
        this.camera.setPreviewCallbackWithBuffer(new Camera.PreviewCallback() {
            /* access modifiers changed from: private */
            public /* synthetic */ void lambda$onPreviewFrame$0(byte[] bArr) {
                if (Camera1Session.this.state == SessionState.RUNNING) {
                    Camera1Session.this.camera.addCallbackBuffer(bArr);
                }
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void lambda$onPreviewFrame$1(byte[] bArr) {
                Camera1Session.this.cameraThreadHandler.post(new b(1, this, bArr));
            }

            public void onPreviewFrame(byte[] bArr, Camera camera) {
                Camera1Session.this.checkIsOnCameraThread();
                if (camera != Camera1Session.this.camera) {
                    Logging.e(Camera1Session.TAG, "Callback from a different camera. This should never happen.");
                } else if (Camera1Session.this.state != SessionState.RUNNING) {
                    Logging.d(Camera1Session.TAG, "Bytebuffer frame captured but camera is no longer running.");
                } else {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
                    if (!Camera1Session.this.firstFrameReported) {
                        Camera1Session.camera1StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera1Session.this.constructionTimeNs));
                        Camera1Session.this.firstFrameReported = true;
                    }
                    VideoFrame videoFrame = new VideoFrame(new NV21Buffer(bArr, Camera1Session.this.captureFormat.width, Camera1Session.this.captureFormat.height, new b(0, this, bArr)), Camera1Session.this.getFrameOrientation(), nanos);
                    Camera1Session.this.events.onFrameCaptured(Camera1Session.this, videoFrame);
                    videoFrame.release();
                }
            }
        });
    }

    private void listenForTextureFrames() {
        this.surfaceTextureHelper.startListening(new a(0, this));
    }

    private void startCapturing() {
        Logging.d(TAG, "Start capturing");
        checkIsOnCameraThread();
        this.state = SessionState.RUNNING;
        this.camera.setErrorCallback(new Camera.ErrorCallback() {
            public void onError(int i, Camera camera) {
                String h = i == 100 ? "Camera server died!" : wj6.h(i, "Camera error: ");
                Logging.e(Camera1Session.TAG, h);
                Camera1Session.this.stopInternal(a81.m("error: ", h));
                if (i == 2) {
                    Camera1Session.this.events.onCameraDisconnected(Camera1Session.this);
                } else {
                    Camera1Session.this.events.onCameraError(Camera1Session.this, h);
                }
            }
        });
        if (this.captureToTexture) {
            listenForTextureFrames();
        } else {
            listenForBytebufferFrames();
        }
        try {
            this.camera.startPreview();
        } catch (RuntimeException e) {
            stopInternal("start preview failure");
            this.events.onCameraError(this, e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public void stopInternal(String str) {
        Logging.d(TAG, "Stop internal");
        checkIsOnCameraThread();
        SessionState sessionState = this.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState == sessionState2) {
            Logging.d(TAG, "Camera is already stopped");
            return;
        }
        this.state = sessionState2;
        this.surfaceTextureHelper.stopListening();
        try {
            this.camera.stopPreview();
            this.camera.release();
            this.events.onCameraClosed(this);
            Logging.d(TAG, "Stop done");
        } catch (RuntimeException e) {
            Logging.e(TAG, "Error while trying to release camera by " + str, e);
            this.events.onCameraError(this, g63.j("Error on camera.release(", str, "): ", e.getMessage()));
        }
    }

    private static void updateCameraParameters(Camera camera2, Camera.Parameters parameters, CameraEnumerationAndroid.CaptureFormat captureFormat2, Size size, boolean z) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange = captureFormat2.framerate;
        parameters.setPreviewFpsRange(framerateRange.min, framerateRange.max);
        parameters.setPreviewSize(captureFormat2.width, captureFormat2.height);
        parameters.setPictureSize(size.width, size.height);
        if (!z) {
            parameters.setPreviewFormat(17);
        }
        if (parameters.isVideoStabilizationSupported()) {
            parameters.setVideoStabilization(true);
        }
        if (supportedFocusModes != null && supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
        }
        camera2.setParameters(parameters);
    }

    public void stop() {
        int i = this.cameraId;
        Logging.d(TAG, "Stop camera1 session on camera " + i);
        checkIsOnCameraThread();
        if (this.state != SessionState.STOPPED) {
            long nanoTime = System.nanoTime();
            stopInternal("stop request");
            camera1StopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
        }
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events2, boolean z, Context context, SurfaceTextureHelper surfaceTextureHelper2, String str, CameraVideoCapturer.CaptureFormatHelper captureFormatHelper, int i, int i2, int i3) {
        CameraSession.CreateSessionCallback createSessionCallback2 = createSessionCallback;
        boolean z2 = z;
        int i4 = i;
        int i5 = i2;
        CameraVideoCapturer.CaptureFormatHelper r4 = captureFormatHelper == null ? new CameraVideoCapturer.CaptureFormatHelper() {
        } : captureFormatHelper;
        long nanoTime = System.nanoTime();
        Logging.d(TAG, "Open camera " + str);
        events2.onCameraOpening();
        try {
            int cameraIndex = Camera1Enumerator.getCameraIndex(str);
            try {
                Camera open = Camera.open(cameraIndex);
                if (open == null) {
                    createSessionCallback.onFailure(CameraSession.FailureType.ERROR, "Camera.open returned null for camera id = " + cameraIndex);
                    return;
                }
                try {
                    open.setPreviewTexture(surfaceTextureHelper2.getSurfaceTexture());
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    try {
                        Camera.getCameraInfo(cameraIndex, cameraInfo);
                        try {
                            Camera.Parameters parameters = open.getParameters();
                            CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat = findClosestCaptureFormat(parameters, r4, i4, i5, i3);
                            updateCameraParameters(open, parameters, findClosestCaptureFormat, findClosestPictureSize(parameters, r4, i4, i5), z2);
                            if (!z2) {
                                int frameSize = findClosestCaptureFormat.frameSize();
                                for (int i6 = 0; i6 < 3; i6++) {
                                    open.addCallbackBuffer(ByteBuffer.allocateDirect(frameSize).array());
                                }
                            }
                            try {
                                open.setDisplayOrientation(0);
                                createSessionCallback.onDone(new Camera1Session(events2, z, context, surfaceTextureHelper2, cameraIndex, open, cameraInfo, findClosestCaptureFormat, nanoTime));
                            } catch (RuntimeException e) {
                                open.release();
                                createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e.getMessage());
                            }
                        } catch (RuntimeException e2) {
                            open.release();
                            createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e2.getMessage());
                        }
                    } catch (RuntimeException e3) {
                        open.release();
                        createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e3.getMessage());
                    }
                } catch (IOException | RuntimeException e4) {
                    open.release();
                    createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e4.getMessage());
                }
            } catch (RuntimeException e5) {
                createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e5.getMessage());
            }
        } catch (IllegalArgumentException e6) {
            createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e6.getMessage());
        }
    }
}
