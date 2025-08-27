package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: t6f  reason: default package */
public abstract class t6f extends r6f {
    public final Object a = new Object();
    public final kq9 b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public r6f e;
    public rt6 f;
    public go1 g;
    public do1 h;
    public oj6 i;
    public List j = null;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;

    public t6f(kq9 kq9, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.b = kq9;
        this.c = executor;
        this.d = scheduledExecutorService;
    }

    public final void a(u6f u6f) {
        Objects.requireNonNull(this.e);
        this.e.a(u6f);
    }

    public final void b(u6f u6f) {
        Objects.requireNonNull(this.e);
        this.e.b(u6f);
    }

    public abstract void c(t6f t6f);

    public final void d(t6f t6f) {
        t6f t6f2;
        Objects.requireNonNull(this.e);
        u6f u6f = (u6f) this;
        synchronized (u6f.a) {
            try {
                List<lk4> list = u6f.j;
                if (list != null) {
                    for (lk4 b2 : list) {
                        b2.b();
                    }
                    u6f.j = null;
                }
            } finally {
                while (true) {
                }
            }
        }
        u6f.t.d();
        kq9 kq9 = this.b;
        Iterator it = kq9.g().iterator();
        while (it.hasNext() && (t6f2 = (t6f) it.next()) != this) {
            u6f u6f2 = (u6f) t6f2;
            synchronized (u6f2.a) {
                try {
                    List<lk4> list2 = u6f2.j;
                    if (list2 != null) {
                        for (lk4 b3 : list2) {
                            b3.b();
                        }
                        u6f2.j = null;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            u6f2.t.d();
        }
        synchronized (kq9.b) {
            ((LinkedHashSet) kq9.v).remove(this);
        }
        this.e.d(t6f);
    }

    public final void f(u6f u6f) {
        Objects.requireNonNull(this.e);
        this.e.f(u6f);
    }

    public final void g(t6f t6f) {
        go1 go1;
        synchronized (this.a) {
            try {
                if (!this.m) {
                    this.m = true;
                    bs0.q(this.g, "Need to call openCaptureSession before using this API.");
                    go1 = this.g;
                } else {
                    go1 = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (go1 != null) {
            go1.b.d(new s6f(this, t6f, 0), ryg.j());
        }
    }

    public final void h(u6f u6f, Surface surface) {
        Objects.requireNonNull(this.e);
        this.e.h(u6f, surface);
    }

    public abstract int i(ArrayList arrayList, jr1 jr1);

    public abstract void j();

    public final void k(CameraCaptureSession cameraCaptureSession) {
        if (this.f == null) {
            this.f = new rt6(cameraCaptureSession);
        }
    }

    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.g != null;
        }
        return z;
    }

    public abstract zz7 m(CameraDevice cameraDevice, hwd hwd, List list);

    public abstract int n(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    public zz7 o(ArrayList arrayList) {
        synchronized (this.a) {
            try {
                if (this.l) {
                    xa7 xa7 = new xa7(1, new CancellationException("Opener is disabled"));
                    return xa7;
                }
                oj6 a2 = oj6.a(tf6.m0(arrayList, this.c, this.d));
                pbb pbb = new pbb(19, this, arrayList);
                Executor executor = this.c;
                a2.getClass();
                cz1 b0 = hd8.b0(a2, pbb, executor);
                this.i = b0;
                zz7 J = hd8.J(b0);
                return J;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract boolean p();

    public final rt6 q() {
        this.f.getClass();
        return this.f;
    }
}
