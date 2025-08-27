package org.webrtc;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;
import org.webrtc.CameraSession;
import org.webrtc.CameraVideoCapturer;

abstract class CameraCapturer implements CameraVideoCapturer {
    private static final int MAX_OPEN_CAMERA_ATTEMPTS = 3;
    private static final int OPEN_CAMERA_DELAY_MS = 500;
    private static final int OPEN_CAMERA_TIMEOUT = 10000;
    private static final String TAG = "CameraCapturer";
    /* access modifiers changed from: private */
    public Context applicationContext;
    /* access modifiers changed from: private */
    public final CameraEnumerator cameraEnumerator;
    /* access modifiers changed from: private */
    public String cameraName;
    /* access modifiers changed from: private */
    public final CameraSession.Events cameraSessionEventsHandler;
    /* access modifiers changed from: private */
    public CameraVideoCapturer.CameraStatistics cameraStatistics;
    private Handler cameraThreadHandler;
    protected final CameraVideoCapturer.CaptureFormatHelper captureFormatHelper;
    /* access modifiers changed from: private */
    public CapturerObserver capturerObserver;
    /* access modifiers changed from: private */
    public final CameraSession.CreateSessionCallback createSessionCallback;
    /* access modifiers changed from: private */
    public CameraSession currentSession;
    /* access modifiers changed from: private */
    public final CameraVideoCapturer.CameraEventsHandler eventsHandler;
    /* access modifiers changed from: private */
    public boolean firstFrameObserved;
    /* access modifiers changed from: private */
    public int framerate;
    /* access modifiers changed from: private */
    public int height;
    /* access modifiers changed from: private */
    public int openAttemptsRemaining;
    /* access modifiers changed from: private */
    public final Runnable openCameraTimeoutRunnable;
    /* access modifiers changed from: private */
    public String pendingCameraName;
    /* access modifiers changed from: private */
    public boolean sessionOpening;
    /* access modifiers changed from: private */
    public final Object stateLock;
    /* access modifiers changed from: private */
    public SurfaceTextureHelper surfaceHelper;
    /* access modifiers changed from: private */
    public CameraVideoCapturer.CameraSwitchHandler switchEventsHandler;
    /* access modifiers changed from: private */
    public SwitchState switchState;
    /* access modifiers changed from: private */
    public final Handler uiThreadHandler;
    /* access modifiers changed from: private */
    public int width;

    public enum SwitchState {
        IDLE,
        PENDING,
        IN_PROGRESS
    }

    public CameraCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraEnumerator cameraEnumerator2) {
        this(str, cameraEventsHandler, cameraEnumerator2, (CameraVideoCapturer.CaptureFormatHelper) null);
    }

    /* access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            Logging.e(TAG, "Check is on camera thread failed.");
            throw new RuntimeException("Not on camera thread.");
        }
    }

    /* access modifiers changed from: private */
    public void createSessionInternal(int i) {
        this.uiThreadHandler.postDelayed(this.openCameraTimeoutRunnable, (long) (i + OPEN_CAMERA_TIMEOUT));
        this.cameraThreadHandler.postDelayed(new Runnable() {
            public void run() {
                CameraCapturer cameraCapturer = CameraCapturer.this;
                cameraCapturer.createCameraSession(cameraCapturer.createSessionCallback, CameraCapturer.this.cameraSessionEventsHandler, CameraCapturer.this.applicationContext, CameraCapturer.this.surfaceHelper, CameraCapturer.this.cameraName, CameraCapturer.this.width, CameraCapturer.this.height, CameraCapturer.this.framerate);
            }
        }, (long) i);
    }

    /* access modifiers changed from: private */
    public void reportCameraSwitchError(String str, CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        Logging.e(TAG, str);
        if (cameraSwitchHandler != null) {
            cameraSwitchHandler.onCameraSwitchError(str);
        }
    }

    /* access modifiers changed from: private */
    public void switchCameraInternal(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, String str) {
        Logging.d(TAG, "switchCamera internal");
        if (!Arrays.asList(this.cameraEnumerator.getDeviceNames()).contains(str)) {
            reportCameraSwitchError(a81.m("Attempted to switch to unknown camera device ", str), cameraSwitchHandler);
            return;
        }
        synchronized (this.stateLock) {
            try {
                if (this.switchState != SwitchState.IDLE) {
                    reportCameraSwitchError("Camera switch already in progress.", cameraSwitchHandler);
                    return;
                }
                boolean z = this.sessionOpening;
                if (z || this.currentSession != null) {
                    this.switchEventsHandler = cameraSwitchHandler;
                    if (z) {
                        this.switchState = SwitchState.PENDING;
                        this.pendingCameraName = str;
                        return;
                    }
                    this.switchState = SwitchState.IN_PROGRESS;
                    Logging.d(TAG, "switchCamera: Stopping session");
                    this.cameraStatistics.release();
                    this.cameraStatistics = null;
                    final CameraSession cameraSession = this.currentSession;
                    this.cameraThreadHandler.post(new Runnable() {
                        public void run() {
                            cameraSession.stop();
                        }
                    });
                    this.currentSession = null;
                    this.cameraName = str;
                    this.sessionOpening = true;
                    this.openAttemptsRemaining = 1;
                    createSessionInternal(0);
                    Logging.d(TAG, "switchCamera done");
                    return;
                }
                reportCameraSwitchError("switchCamera: camera is not running.", cameraSwitchHandler);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void changeCaptureFormat(int i, int i2, int i3) {
        StringBuilder n = a81.n("changeCaptureFormat: ", i, "x", i2, "@");
        n.append(i3);
        Logging.d(TAG, n.toString());
        synchronized (this.stateLock) {
            stopCapture();
            startCapture(i, i2, i3);
        }
    }

    public abstract void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback2, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3);

    public void dispose() {
        Logging.d(TAG, "dispose");
        stopCapture();
    }

    public String getCameraName() {
        String str;
        synchronized (this.stateLock) {
            str = this.cameraName;
        }
        return str;
    }

    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver2) {
        this.applicationContext = context;
        this.capturerObserver = capturerObserver2;
        this.surfaceHelper = surfaceTextureHelper;
        this.cameraThreadHandler = surfaceTextureHelper.getHandler();
    }

    public boolean isScreencast() {
        return false;
    }

    public void printStackTrace() {
        Handler handler = this.cameraThreadHandler;
        Thread thread = handler != null ? handler.getLooper().getThread() : null;
        if (thread != null) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            if (stackTrace.length > 0) {
                Logging.d(TAG, "CameraCapturer stack trace:");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    Logging.d(TAG, stackTraceElement.toString());
                }
            }
        }
    }

    public void startCapture(int i, int i2, int i3) {
        StringBuilder n = a81.n("startCapture: ", i, "x", i2, "@");
        n.append(i3);
        Logging.d(TAG, n.toString());
        if (this.applicationContext != null) {
            synchronized (this.stateLock) {
                try {
                    if (!this.sessionOpening) {
                        if (this.currentSession == null) {
                            this.width = i;
                            this.height = i2;
                            this.framerate = i3;
                            this.sessionOpening = true;
                            this.openAttemptsRemaining = 3;
                            createSessionInternal(0);
                            return;
                        }
                    }
                    Logging.w(TAG, "Session already open");
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            throw new RuntimeException("CameraCapturer must be initialized before calling startCapture.");
        }
    }

    public void stopCapture() {
        Logging.d(TAG, "Stop capture");
        synchronized (this.stateLock) {
            while (this.sessionOpening) {
                Logging.d(TAG, "Stop capture: Waiting for session to open");
                try {
                    this.stateLock.wait();
                } catch (InterruptedException unused) {
                    Logging.w(TAG, "Stop capture interrupted while waiting for the session to open.");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (this.currentSession != null) {
                Logging.d(TAG, "Stop capture: Nulling session");
                this.cameraStatistics.release();
                this.cameraStatistics = null;
                final CameraSession cameraSession = this.currentSession;
                this.cameraThreadHandler.post(new Runnable() {
                    public void run() {
                        cameraSession.stop();
                    }
                });
                this.currentSession = null;
                this.capturerObserver.onCapturerStopped();
            } else {
                Logging.d(TAG, "Stop capture: No session open");
            }
        }
        Logging.d(TAG, "Stop capture done");
    }

    public void switchCamera(final CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        Logging.d(TAG, "switchCamera");
        this.cameraThreadHandler.post(new Runnable() {
            public void run() {
                List asList = Arrays.asList(CameraCapturer.this.cameraEnumerator.getDeviceNames());
                if (asList.size() < 2) {
                    CameraCapturer.this.reportCameraSwitchError("No camera to switch to.", cameraSwitchHandler);
                    return;
                }
                CameraCapturer.this.switchCameraInternal(cameraSwitchHandler, (String) asList.get((asList.indexOf(CameraCapturer.this.cameraName) + 1) % asList.size()));
            }
        });
    }

    public CameraCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraEnumerator cameraEnumerator2, CameraVideoCapturer.CaptureFormatHelper captureFormatHelper2) {
        this.createSessionCallback = new CameraSession.CreateSessionCallback() {
            public void onDone(CameraSession cameraSession) {
                CameraCapturer.this.checkIsOnCameraThread();
                SwitchState s = CameraCapturer.this.switchState;
                Logging.d(CameraCapturer.TAG, "Create session done. Switch state: " + s);
                CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
                synchronized (CameraCapturer.this.stateLock) {
                    try {
                        CameraCapturer.this.capturerObserver.onCapturerStarted(true);
                        CameraCapturer.this.sessionOpening = false;
                        CameraCapturer.this.currentSession = cameraSession;
                        CameraCapturer cameraCapturer = CameraCapturer.this;
                        cameraCapturer.cameraStatistics = new CameraVideoCapturer.CameraStatistics(cameraCapturer.surfaceHelper, CameraCapturer.this.eventsHandler);
                        CameraCapturer.this.firstFrameObserved = false;
                        CameraCapturer.this.stateLock.notifyAll();
                        if (CameraCapturer.this.switchState == SwitchState.IN_PROGRESS) {
                            CameraCapturer.this.switchState = SwitchState.IDLE;
                            if (CameraCapturer.this.switchEventsHandler != null) {
                                CameraCapturer.this.switchEventsHandler.onCameraSwitchDone(CameraCapturer.this.cameraEnumerator.isFrontFacing(CameraCapturer.this.cameraName));
                                CameraCapturer.this.switchEventsHandler = null;
                            }
                        } else if (CameraCapturer.this.switchState == SwitchState.PENDING) {
                            String o = CameraCapturer.this.pendingCameraName;
                            CameraCapturer.this.pendingCameraName = null;
                            CameraCapturer.this.switchState = SwitchState.IDLE;
                            CameraCapturer cameraCapturer2 = CameraCapturer.this;
                            cameraCapturer2.switchCameraInternal(cameraCapturer2.switchEventsHandler, o);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            public void onFailure(CameraSession.FailureType failureType, String str) {
                CameraCapturer.this.checkIsOnCameraThread();
                CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
                synchronized (CameraCapturer.this.stateLock) {
                    try {
                        CameraCapturer.this.capturerObserver.onCapturerStarted(false);
                        CameraCapturer cameraCapturer = CameraCapturer.this;
                        cameraCapturer.openAttemptsRemaining = cameraCapturer.openAttemptsRemaining - 1;
                        if (CameraCapturer.this.openAttemptsRemaining <= 0) {
                            Logging.w(CameraCapturer.TAG, "Opening camera failed, passing: " + str);
                            CameraCapturer.this.sessionOpening = false;
                            CameraCapturer.this.stateLock.notifyAll();
                            SwitchState s = CameraCapturer.this.switchState;
                            SwitchState switchState = SwitchState.IDLE;
                            if (s != switchState) {
                                if (CameraCapturer.this.switchEventsHandler != null) {
                                    CameraCapturer.this.switchEventsHandler.onCameraSwitchError(str);
                                    CameraCapturer.this.switchEventsHandler = null;
                                }
                                CameraCapturer.this.switchState = switchState;
                            }
                            if (failureType == CameraSession.FailureType.DISCONNECTED) {
                                CameraCapturer.this.eventsHandler.onCameraDisconnected();
                            } else {
                                CameraCapturer.this.eventsHandler.onCameraError(str);
                            }
                        } else {
                            Logging.w(CameraCapturer.TAG, "Opening camera failed, retry: " + str);
                            CameraCapturer.this.createSessionInternal(500);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.cameraSessionEventsHandler = new CameraSession.Events() {
            public void onCameraClosed(CameraSession cameraSession) {
                CameraCapturer.this.checkIsOnCameraThread();
                synchronized (CameraCapturer.this.stateLock) {
                    try {
                        if (cameraSession == CameraCapturer.this.currentSession || CameraCapturer.this.currentSession == null) {
                            CameraCapturer.this.eventsHandler.onCameraClosed();
                        } else {
                            Logging.d(CameraCapturer.TAG, "onCameraClosed from another session.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            public void onCameraDisconnected(CameraSession cameraSession) {
                CameraCapturer.this.checkIsOnCameraThread();
                synchronized (CameraCapturer.this.stateLock) {
                    try {
                        if (cameraSession != CameraCapturer.this.currentSession) {
                            Logging.w(CameraCapturer.TAG, "onCameraDisconnected from another session.");
                            return;
                        }
                        CameraCapturer.this.eventsHandler.onCameraDisconnected();
                        CameraCapturer.this.stopCapture();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            public void onCameraError(CameraSession cameraSession, String str) {
                CameraCapturer.this.checkIsOnCameraThread();
                synchronized (CameraCapturer.this.stateLock) {
                    try {
                        if (cameraSession != CameraCapturer.this.currentSession) {
                            Logging.w(CameraCapturer.TAG, "onCameraError from another session: " + str);
                            return;
                        }
                        CameraCapturer.this.eventsHandler.onCameraError(str);
                        CameraCapturer.this.stopCapture();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            public void onCameraOpening() {
                CameraCapturer.this.checkIsOnCameraThread();
                synchronized (CameraCapturer.this.stateLock) {
                    try {
                        if (CameraCapturer.this.currentSession != null) {
                            Logging.w(CameraCapturer.TAG, "onCameraOpening while session was open.");
                        } else {
                            CameraCapturer.this.eventsHandler.onCameraOpening(CameraCapturer.this.cameraName);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            public void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame) {
                CameraCapturer.this.checkIsOnCameraThread();
                synchronized (CameraCapturer.this.stateLock) {
                    try {
                        if (cameraSession != CameraCapturer.this.currentSession) {
                            Logging.w(CameraCapturer.TAG, "onFrameCaptured from another session.");
                            return;
                        }
                        if (!CameraCapturer.this.firstFrameObserved) {
                            CameraCapturer.this.eventsHandler.onFirstFrameAvailable();
                            CameraCapturer.this.firstFrameObserved = true;
                        }
                        CameraCapturer.this.cameraStatistics.addFrame();
                        CameraCapturer.this.capturerObserver.onFrameCaptured(videoFrame);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.openCameraTimeoutRunnable = new Runnable() {
            public void run() {
                CameraCapturer.this.eventsHandler.onCameraError("Camera failed to start within timeout.");
            }
        };
        this.stateLock = new Object();
        this.switchState = SwitchState.IDLE;
        cameraEventsHandler = cameraEventsHandler == null ? new CameraVideoCapturer.CameraEventsHandler() {
            public void onCameraClosed() {
            }

            public void onCameraDisconnected() {
            }

            public void onCameraError(String str) {
            }

            public void onCameraFreezed(String str) {
            }

            public void onCameraOpening(String str) {
            }

            public void onFirstFrameAvailable() {
            }
        } : cameraEventsHandler;
        this.captureFormatHelper = captureFormatHelper2 == null ? new CameraVideoCapturer.CaptureFormatHelper() {
        } : captureFormatHelper2;
        this.eventsHandler = cameraEventsHandler;
        this.cameraEnumerator = cameraEnumerator2;
        this.cameraName = str;
        List asList = Arrays.asList(cameraEnumerator2.getDeviceNames());
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        if (asList.isEmpty()) {
            throw new RuntimeException("No cameras attached.");
        } else if (!asList.contains(this.cameraName)) {
            throw new IllegalArgumentException(wj6.k("Camera name ", this.cameraName, " does not match any known camera device."));
        }
    }

    public void switchCamera(final CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, final String str) {
        Logging.d(TAG, "switchCamera");
        this.cameraThreadHandler.post(new Runnable() {
            public void run() {
                CameraCapturer.this.switchCameraInternal(cameraSwitchHandler, str);
            }
        });
    }
}
