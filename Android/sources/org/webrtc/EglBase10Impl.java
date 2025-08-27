package org.webrtc;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.GLException;
import android.view.Surface;
import android.view.SurfaceHolder;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.webrtc.EglBase;
import org.webrtc.EglBase10;

class EglBase10Impl implements EglBase10 {
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final EglConnection EGL_NO_CONNECTION = new EglConnection(0);
    private static final String TAG = "EglBase10Impl";
    private EglConnection eglConnection;
    private EGLSurface eglSurface = EGL10.EGL_NO_SURFACE;

    public static class Context implements EglBase10.Context {
        private final EGL10 egl;
        private final EGLContext eglContext;
        private final EGLConfig eglContextConfig;

        public Context(EGL10 egl10, EGLContext eGLContext, EGLConfig eGLConfig) {
            this.egl = egl10;
            this.eglContext = eGLContext;
            this.eglContextConfig = eGLConfig;
        }

        public long getNativeEglContext() {
            EGLContext eglGetCurrentContext = this.egl.eglGetCurrentContext();
            EGLDisplay eglGetCurrentDisplay = this.egl.eglGetCurrentDisplay();
            EGLSurface eglGetCurrentSurface = this.egl.eglGetCurrentSurface(12377);
            EGLSurface eglGetCurrentSurface2 = this.egl.eglGetCurrentSurface(12378);
            if (eglGetCurrentDisplay == EGL10.EGL_NO_DISPLAY) {
                eglGetCurrentDisplay = this.egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            }
            EGLSurface eGLSurface = null;
            try {
                if (eglGetCurrentContext != this.eglContext) {
                    eGLSurface = this.egl.eglCreatePbufferSurface(eglGetCurrentDisplay, this.eglContextConfig, new int[]{12375, 1, 12374, 1, 12344});
                    if (!this.egl.eglMakeCurrent(eglGetCurrentDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                        int eglGetError = this.egl.eglGetError();
                        int eglGetError2 = this.egl.eglGetError();
                        throw new GLException(eglGetError, "Failed to make temporary EGL surface active: " + eglGetError2);
                    }
                }
                long d = EglBase10Impl.nativeGetCurrentNativeEGLContext();
                if (eGLSurface != null) {
                    this.egl.eglMakeCurrent(eglGetCurrentDisplay, eglGetCurrentSurface, eglGetCurrentSurface2, eglGetCurrentContext);
                    this.egl.eglDestroySurface(eglGetCurrentDisplay, eGLSurface);
                }
                return d;
            } catch (Throwable th) {
                if (0 != 0) {
                    this.egl.eglMakeCurrent(eglGetCurrentDisplay, eglGetCurrentSurface, eglGetCurrentSurface2, eglGetCurrentContext);
                    this.egl.eglDestroySurface(eglGetCurrentDisplay, (EGLSurface) null);
                }
                throw th;
            }
        }

        public EGLContext getRawContext() {
            return this.eglContext;
        }
    }

    public static class EglConnection implements EglBase10.EglConnection {
        private EGLSurface currentSurface;
        private final EGL10 egl;
        private final EGLConfig eglConfig;
        private final EGLContext eglContext;
        private final EGLDisplay eglDisplay;
        private final RefCountDelegate refCountDelegate;

        public /* synthetic */ EglConnection(int i) {
            this();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0() {
            EGLSurface eGLSurface;
            synchronized (EglBase.lock) {
                EGL10 egl10 = this.egl;
                EGLDisplay eGLDisplay = this.eglDisplay;
                eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            }
            this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
            this.egl.eglTerminate(this.eglDisplay);
            this.currentSurface = eGLSurface;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$new$1() {
        }

        public void detachCurrent() {
            EGLSurface eGLSurface;
            synchronized (EglBase.lock) {
                EGL10 egl10 = this.egl;
                EGLDisplay eGLDisplay = this.eglDisplay;
                eGLSurface = EGL10.EGL_NO_SURFACE;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
                    int eglGetError = this.egl.eglGetError();
                    String hexString = Integer.toHexString(this.egl.eglGetError());
                    throw new GLException(eglGetError, "eglDetachCurrent failed: 0x" + hexString);
                }
            }
            this.currentSurface = eGLSurface;
        }

        public EGLConfig getConfig() {
            return this.eglConfig;
        }

        public EGLContext getContext() {
            return this.eglContext;
        }

        public EGLDisplay getDisplay() {
            return this.eglDisplay;
        }

        public EGL10 getEgl() {
            return this.egl;
        }

        public void makeCurrent(EGLSurface eGLSurface) {
            if (this.egl.eglGetCurrentContext() != this.eglContext || this.currentSurface != eGLSurface) {
                synchronized (EglBase.lock) {
                    if (!this.egl.eglMakeCurrent(this.eglDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                        int eglGetError = this.egl.eglGetError();
                        String hexString = Integer.toHexString(this.egl.eglGetError());
                        throw new GLException(eglGetError, "eglMakeCurrent failed: 0x" + hexString);
                    }
                }
                this.currentSurface = eGLSurface;
            }
        }

        public void release() {
            this.refCountDelegate.release();
        }

        public void retain() {
            this.refCountDelegate.retain();
        }

        public EglConnection(EGLContext eGLContext, int[] iArr) {
            this.currentSurface = EGL10.EGL_NO_SURFACE;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl = egl10;
            EGLDisplay c = EglBase10Impl.getEglDisplay(egl10);
            this.eglDisplay = c;
            EGLConfig b = EglBase10Impl.getEglConfig(egl10, c, iArr);
            this.eglConfig = b;
            int openGlesVersionFromConfig = EglBase.getOpenGlesVersionFromConfig(iArr);
            Logging.d(EglBase10Impl.TAG, "Using OpenGL ES version " + openGlesVersionFromConfig);
            this.eglContext = EglBase10Impl.createEglContext(egl10, eGLContext, c, b, openGlesVersionFromConfig);
            this.refCountDelegate = new RefCountDelegate(new ne4(12, this));
        }

        private EglConnection() {
            this.currentSurface = EGL10.EGL_NO_SURFACE;
            this.egl = (EGL10) EGLContext.getEGL();
            this.eglContext = EGL10.EGL_NO_CONTEXT;
            this.eglDisplay = EGL10.EGL_NO_DISPLAY;
            this.eglConfig = null;
            this.refCountDelegate = new RefCountDelegate(new gc(7));
        }
    }

    public EglBase10Impl(EGLContext eGLContext, int[] iArr) {
        this.eglConnection = new EglConnection(eGLContext, iArr);
    }

    private void checkIsNotReleased() {
        if (this.eglConnection == EGL_NO_CONNECTION) {
            throw new RuntimeException("This object has been released");
        }
    }

    /* access modifiers changed from: private */
    public static EGLContext createEglContext(EGL10 egl10, EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext;
        if (eGLContext == null || eGLContext != EGL10.EGL_NO_CONTEXT) {
            int[] iArr = {EGL_CONTEXT_CLIENT_VERSION, i, 12344};
            if (eGLContext == null) {
                eGLContext = EGL10.EGL_NO_CONTEXT;
            }
            synchronized (EglBase.lock) {
                eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
            }
            if (eglCreateContext != EGL10.EGL_NO_CONTEXT) {
                return eglCreateContext;
            }
            throw new GLException(egl10.eglGetError(), a81.m("Failed to create EGL context: 0x", Integer.toHexString(egl10.eglGetError())));
        }
        throw new RuntimeException("Invalid sharedContext");
    }

    private void createSurfaceInternal(Object obj) {
        if ((obj instanceof SurfaceHolder) || (obj instanceof SurfaceTexture)) {
            checkIsNotReleased();
            EGLSurface eGLSurface = this.eglSurface;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            if (eGLSurface == eGLSurface2) {
                EGL10 egl = this.eglConnection.getEgl();
                EGLSurface eglCreateWindowSurface = egl.eglCreateWindowSurface(this.eglConnection.getDisplay(), this.eglConnection.getConfig(), obj, new int[]{12344});
                this.eglSurface = eglCreateWindowSurface;
                if (eglCreateWindowSurface == eGLSurface2) {
                    throw new GLException(egl.eglGetError(), a81.m("Failed to create window surface: 0x", Integer.toHexString(egl.eglGetError())));
                }
                return;
            }
            throw new RuntimeException("Already has an EGLSurface");
        }
        throw new IllegalStateException("Input must be either a SurfaceHolder or SurfaceTexture");
    }

    /* access modifiers changed from: private */
    public static EGLConfig getEglConfig(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, 1, iArr2)) {
            throw new GLException(egl10.eglGetError(), a81.m("eglChooseConfig failed: 0x", Integer.toHexString(egl10.eglGetError())));
        } else if (iArr2[0] > 0) {
            EGLConfig eGLConfig = eGLConfigArr[0];
            if (eGLConfig != null) {
                return eGLConfig;
            }
            throw new RuntimeException("eglChooseConfig returned null");
        } else {
            throw new RuntimeException("Unable to find any matching EGL config");
        }
    }

    /* access modifiers changed from: private */
    public static EGLDisplay getEglDisplay(EGL10 egl10) {
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new GLException(egl10.eglGetError(), a81.m("Unable to get EGL10 display: 0x", Integer.toHexString(egl10.eglGetError())));
        } else if (egl10.eglInitialize(eglGetDisplay, new int[2])) {
            return eglGetDisplay;
        } else {
            throw new GLException(egl10.eglGetError(), a81.m("Unable to initialize EGL10: 0x", Integer.toHexString(egl10.eglGetError())));
        }
    }

    /* access modifiers changed from: private */
    public static native long nativeGetCurrentNativeEGLContext();

    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface == eGLSurface2) {
            EGL10 egl = this.eglConnection.getEgl();
            EGLSurface eglCreatePbufferSurface = egl.eglCreatePbufferSurface(this.eglConnection.getDisplay(), this.eglConnection.getConfig(), new int[]{12375, i, 12374, i2, 12344});
            this.eglSurface = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface == eGLSurface2) {
                int eglGetError = egl.eglGetError();
                String hexString = Integer.toHexString(egl.eglGetError());
                StringBuilder n = a81.n("Failed to create pixel buffer surface with size ", i, "x", i2, ": 0x");
                n.append(hexString);
                throw new GLException(eglGetError, n.toString());
            }
            return;
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    public void createSurface(Surface surface) {
        createSurfaceInternal(new SurfaceHolder(surface) {
            private final Surface surface;

            {
                this.surface = r2;
            }

            public void addCallback(SurfaceHolder.Callback callback) {
            }

            public Surface getSurface() {
                return this.surface;
            }

            public Rect getSurfaceFrame() {
                return null;
            }

            public boolean isCreating() {
                return false;
            }

            public Canvas lockCanvas() {
                return null;
            }

            public void removeCallback(SurfaceHolder.Callback callback) {
            }

            public void setFixedSize(int i, int i2) {
            }

            public void setFormat(int i) {
            }

            public void setKeepScreenOn(boolean z) {
            }

            public void setSizeFromLayout() {
            }

            @Deprecated
            public void setType(int i) {
            }

            public void unlockCanvasAndPost(Canvas canvas) {
            }

            public Canvas lockCanvas(Rect rect) {
                return null;
            }
        });
    }

    public void detachCurrent() {
        this.eglConnection.detachCurrent();
    }

    public EglBase.Context getEglBaseContext() {
        return new Context(this.eglConnection.getEgl(), this.eglConnection.getContext(), this.eglConnection.getConfig());
    }

    public boolean hasSurface() {
        return this.eglSurface != EGL10.EGL_NO_SURFACE;
    }

    public void makeCurrent() {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL10.EGL_NO_SURFACE) {
            this.eglConnection.makeCurrent(eGLSurface);
            return;
        }
        throw new RuntimeException("No EGLSurface - can't make current");
    }

    public void release() {
        checkIsNotReleased();
        releaseSurface();
        this.eglConnection.release();
        this.eglConnection = EGL_NO_CONNECTION;
    }

    public void releaseSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            this.eglConnection.getEgl().eglDestroySurface(this.eglConnection.getDisplay(), this.eglSurface);
            this.eglSurface = eGLSurface2;
        }
    }

    public int surfaceHeight() {
        int[] iArr = new int[1];
        this.eglConnection.getEgl().eglQuerySurface(this.eglConnection.getDisplay(), this.eglSurface, 12374, iArr);
        return iArr[0];
    }

    public int surfaceWidth() {
        int[] iArr = new int[1];
        this.eglConnection.getEgl().eglQuerySurface(this.eglConnection.getDisplay(), this.eglSurface, 12375, iArr);
        return iArr[0];
    }

    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                this.eglConnection.getEgl().eglSwapBuffers(this.eglConnection.getDisplay(), this.eglSurface);
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }

    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    public EglBase10Impl(EglConnection eglConnection2) {
        this.eglConnection = eglConnection2;
        eglConnection2.retain();
    }

    public void swapBuffers(long j) {
        swapBuffers();
    }
}
