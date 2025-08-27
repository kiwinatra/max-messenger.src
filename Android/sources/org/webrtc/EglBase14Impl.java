package org.webrtc;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLException;
import android.view.Surface;
import org.webrtc.EglBase14;

class EglBase14Impl implements EglBase14 {
    private static final EglConnection EGL_NO_CONNECTION = new EglConnection(0);
    private static final String TAG = "EglBase14Impl";
    private EglConnection eglConnection;
    private EGLSurface eglSurface = EGL14.EGL_NO_SURFACE;

    public static class Context implements EglBase14.Context {
        private final EGLContext egl14Context;

        public Context(EGLContext eGLContext) {
            this.egl14Context = eGLContext;
        }

        public long getNativeEglContext() {
            return this.egl14Context.getNativeHandle();
        }

        public EGLContext getRawContext() {
            return this.egl14Context;
        }
    }

    public static class EglConnection implements EglBase14.EglConnection {
        private EGLSurface currentSurface;
        private final EGLConfig eglConfig;
        private final EGLContext eglContext;
        private final EGLDisplay eglDisplay;
        private final RefCountDelegate refCountDelegate;

        public /* synthetic */ EglConnection(int i) {
            this();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0() {
            synchronized (EglBase.lock) {
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.eglDisplay);
            this.currentSurface = EGL14.EGL_NO_SURFACE;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$new$1() {
        }

        public void detachCurrent() {
            synchronized (EglBase.lock) {
                try {
                    EGLDisplay eGLDisplay = this.eglDisplay;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                        if (EGL14.eglGetError() != 12288) {
                            String hexString = Integer.toHexString(EGL14.eglGetError());
                            throw new RuntimeException("eglDetachCurrent failed: 0x" + hexString);
                        }
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            this.currentSurface = EGL14.EGL_NO_SURFACE;
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

        public void makeCurrent(EGLSurface eGLSurface) {
            if (EGL14.eglGetCurrentContext() != this.eglContext || this.currentSurface != eGLSurface) {
                synchronized (EglBase.lock) {
                    if (!EGL14.eglMakeCurrent(this.eglDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                        int eglGetError = EGL14.eglGetError();
                        String hexString = Integer.toHexString(EGL14.eglGetError());
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
            this.currentSurface = EGL14.EGL_NO_SURFACE;
            EGLDisplay c = EglBase14Impl.getEglDisplay();
            this.eglDisplay = c;
            EGLConfig b = EglBase14Impl.getEglConfig(c, iArr);
            this.eglConfig = b;
            int openGlesVersionFromConfig = EglBase.getOpenGlesVersionFromConfig(iArr);
            Logging.d(EglBase14Impl.TAG, "Using OpenGL ES version " + openGlesVersionFromConfig);
            this.eglContext = EglBase14Impl.createEglContext(eGLContext, c, b, openGlesVersionFromConfig);
            this.refCountDelegate = new RefCountDelegate(new ne4(13, this));
        }

        private EglConnection() {
            this.currentSurface = EGL14.EGL_NO_SURFACE;
            this.eglContext = EGL14.EGL_NO_CONTEXT;
            this.eglDisplay = EGL14.EGL_NO_DISPLAY;
            this.eglConfig = null;
            this.refCountDelegate = new RefCountDelegate(new gc(8));
        }
    }

    public EglBase14Impl(EGLContext eGLContext, int[] iArr) {
        this.eglConnection = new EglConnection(eGLContext, iArr);
    }

    private void checkIsNotReleased() {
        if (this.eglConnection == EGL_NO_CONNECTION) {
            throw new RuntimeException("This object has been released");
        }
    }

    /* access modifiers changed from: private */
    public static EGLContext createEglContext(EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext;
        if (eGLContext == null || eGLContext != EGL14.EGL_NO_CONTEXT) {
            int[] iArr = {12440, i, 12344};
            if (eGLContext == null) {
                eGLContext = EGL14.EGL_NO_CONTEXT;
            }
            synchronized (EglBase.lock) {
                eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
            }
            if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                return eglCreateContext;
            }
            throw new GLException(EGL14.eglGetError(), a81.m("Failed to create EGL context: 0x", Integer.toHexString(EGL14.eglGetError())));
        }
        throw new RuntimeException("Invalid sharedContext");
    }

    private void createSurfaceInternal(Object obj) {
        if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
            checkIsNotReleased();
            if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
                EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.eglConnection.getDisplay(), this.eglConnection.getConfig(), obj, new int[]{12344}, 0);
                this.eglSurface = eglCreateWindowSurface;
                if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                    throw new GLException(EGL14.eglGetError(), a81.m("Failed to create window surface: 0x", Integer.toHexString(EGL14.eglGetError())));
                }
                return;
            }
            throw new RuntimeException("Already has an EGLSurface");
        }
        throw new IllegalStateException("Input must be either a Surface or SurfaceTexture");
    }

    /* access modifiers changed from: private */
    public static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            throw new GLException(EGL14.eglGetError(), a81.m("eglChooseConfig failed: 0x", Integer.toHexString(EGL14.eglGetError())));
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
    public static EGLDisplay getEglDisplay() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new GLException(EGL14.eglGetError(), a81.m("Unable to initialize EGL14: 0x", Integer.toHexString(EGL14.eglGetError())));
        }
        throw new GLException(EGL14.eglGetError(), a81.m("Unable to get EGL14 display: 0x", Integer.toHexString(EGL14.eglGetError())));
    }

    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.eglConnection.getDisplay(), this.eglConnection.getConfig(), new int[]{12375, i, 12374, i2, 12344}, 0);
            this.eglSurface = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface == EGL14.EGL_NO_SURFACE) {
                int eglGetError = EGL14.eglGetError();
                String hexString = Integer.toHexString(EGL14.eglGetError());
                StringBuilder n = a81.n("Failed to create pixel buffer surface with size ", i, "x", i2, ": 0x");
                n.append(hexString);
                throw new GLException(eglGetError, n.toString());
            }
            return;
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    public void createSurface(Surface surface) {
        createSurfaceInternal(surface);
    }

    public void detachCurrent() {
        this.eglConnection.detachCurrent();
    }

    public boolean hasSurface() {
        return this.eglSurface != EGL14.EGL_NO_SURFACE;
    }

    public void makeCurrent() {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
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
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.eglConnection.getDisplay(), this.eglSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
        }
    }

    public int surfaceHeight() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglConnection.getDisplay(), this.eglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    public int surfaceWidth() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglConnection.getDisplay(), this.eglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EGL14.eglSwapBuffers(this.eglConnection.getDisplay(), this.eglSurface);
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }

    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    public Context getEglBaseContext() {
        return new Context(this.eglConnection.getContext());
    }

    public EglBase14Impl(EglConnection eglConnection2) {
        this.eglConnection = eglConnection2;
        eglConnection2.retain();
    }

    public void swapBuffers(long j) {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EGLExt.eglPresentationTimeANDROID(this.eglConnection.getDisplay(), this.eglSurface, j);
                EGL14.eglSwapBuffers(this.eglConnection.getDisplay(), this.eglSurface);
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }
}
