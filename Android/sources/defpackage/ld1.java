package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextGLException;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextNotInitialized;

/* renamed from: ld1  reason: default package */
public final class ld1 {
    public static final AtomicInteger l = new AtomicInteger(0);
    public final voc a;
    public final Function1 b;
    public final HandlerThread c;
    public EGLContext d;
    public EGLDisplay e;
    public EGLConfig f;
    public EGLSurface g;
    public final Object h;
    public boolean i;
    public final String j;
    public final btg k;

    public ld1(voc voc, EGLContext eGLContext, int[] iArr, hq7 hq7, String str) {
        this.a = voc;
        this.b = hq7;
        HandlerThread handlerThread = new HandlerThread((str == null ? "VoipGLRenderer" : str).concat("Thread"));
        this.c = handlerThread;
        this.g = EGL14.EGL_NO_SURFACE;
        Object obj = new Object();
        this.h = obj;
        str = str == null ? "CallOpenGL" : str;
        this.j = str;
        handlerThread.start();
        btg btg = new btg(handlerThread.getLooper(), voc, str.concat("_timings"), new hq7(21, (Object) this));
        this.k = btg;
        voc.log(str, "OpenGL context initialization requested");
        synchronized (obj) {
            if (this.i) {
                voc.log(str, "OpenGL context is already initialized");
                return;
            }
            this.i = true;
            btg.postAtFrontOfQueue(new ktg(this, iArr, eGLContext, 11));
            voc.log(str, "OpenGL context initialization task submitted");
            Unit unit = Unit.INSTANCE;
        }
    }

    public static void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new CallOpenGLContext$CallOpenGLContextGLException(eglGetError, str);
        }
    }

    public final void b(EGLSurface eGLSurface) {
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGLContext eGLContext = this.d;
            if (eGLContext != null) {
                EGLDisplay eGLDisplay = this.e;
                if (eGLDisplay == null) {
                    throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
                } else if (Intrinsics.areEqual((Object) EGL14.eglGetCurrentContext(), (Object) this.d) && Intrinsics.areEqual((Object) this.g, (Object) eGLSurface)) {
                } else {
                    if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
                        this.g = eGLSurface;
                        return;
                    }
                    throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "makeCurrent()");
                }
            } else {
                throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
            }
        } else {
            throw new RuntimeException("Wrong surface in makeCurrent()");
        }
    }

    public final boolean c(Function1 function1) {
        try {
            return this.k.post(new kd1(function1, this, 0));
        } catch (IllegalStateException e2) {
            this.a.reportException(this.j, "OpenGL tread died, is it fine?", e2);
            return false;
        }
    }

    public final boolean d(Function1 function1) {
        try {
            return this.k.postAtFrontOfQueue(new kd1(function1, this, 1));
        } catch (IllegalStateException e2) {
            this.a.reportException(this.j, "OpenGL tread died, is it fine?", e2);
            return false;
        }
    }

    public final void e(EGLSurface eGLSurface) {
        if (eGLSurface != null && eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGLDisplay eGLDisplay = this.e;
            if (eGLDisplay != null) {
                EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                int decrementAndGet = l.decrementAndGet();
                this.a.log(this.j, "Surface destroyed, total count is " + decrementAndGet);
                return;
            }
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
    }
}
