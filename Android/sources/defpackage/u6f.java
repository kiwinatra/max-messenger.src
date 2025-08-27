package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: u6f  reason: default package */
public final class u6f extends t6f {
    public final ScheduledExecutorService n;
    public final Object o = new Object();
    public List p;
    public kz7 q;
    public final z50 r;
    public final grg s;
    public final jw8 t;
    public final bv1 u;
    public final AtomicBoolean v;

    /* JADX WARNING: type inference failed for: r3v3, types: [z50, java.lang.Object] */
    public u6f(ykb ykb, ykb ykb2, kq9 kq9, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(kq9, executor, scheduledExecutorService, handler);
        boolean z = false;
        this.v = new AtomicBoolean(false);
        ? obj = new Object();
        obj.a = ykb2.e(TextureViewIsClosedQuirk.class);
        obj.b = ykb.e(PreviewOrientationIncorrectQuirk.class);
        obj.c = ykb.e(ConfigureSurfaceToSecondarySessionFailQuirk.class);
        this.r = obj;
        this.t = new jw8((ykb.e(CaptureSessionStuckQuirk.class) || ykb.e(IncorrectCaptureStateQuirk.class)) ? true : z);
        this.s = new grg(ykb2);
        this.u = new bv1(ykb2, 5);
        this.n = scheduledExecutorService;
    }

    public final void c(t6f t6f) {
        go1 go1;
        synchronized (this.o) {
            this.r.b(this.p);
        }
        synchronized (this.a) {
            try {
                if (!this.k) {
                    this.k = true;
                    bs0.q(this.g, "Need to call openCaptureSession before using this API.");
                    go1 = this.g;
                } else {
                    go1 = null;
                }
            } finally {
                while (true) {
                }
            }
        }
        synchronized (this.a) {
            try {
                List<lk4> list = this.j;
                if (list != null) {
                    for (lk4 b : list) {
                        b.b();
                    }
                    this.j = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.t.d();
        if (go1 != null) {
            go1.b.d(new s6f(this, t6f, 1), ryg.j());
        }
    }

    public final void e(u6f u6f) {
        ArrayList arrayList;
        t6f t6f;
        t6f t6f2;
        t6f t6f3;
        grg grg = this.s;
        kq9 kq9 = this.b;
        synchronized (kq9.b) {
            arrayList = new ArrayList((LinkedHashSet) kq9.v);
        }
        ArrayList e = this.b.e();
        if (((CaptureSessionOnClosedNotCalledQuirk) grg.b) != null) {
            LinkedHashSet<t6f> linkedHashSet = new LinkedHashSet<>();
            Iterator it = arrayList.iterator();
            while (it.hasNext() && (t6f3 = (t6f) it.next()) != u6f) {
                linkedHashSet.add(t6f3);
            }
            for (t6f t6f4 : linkedHashSet) {
                t6f4.getClass();
                t6f4.d(t6f4);
            }
        }
        Objects.requireNonNull(this.e);
        kq9 kq92 = this.b;
        synchronized (kq92.b) {
            ((LinkedHashSet) kq92.c).add(this);
            ((LinkedHashSet) kq92.v).remove(this);
        }
        Iterator it2 = kq92.g().iterator();
        while (it2.hasNext() && (t6f2 = (t6f) it2.next()) != this) {
            u6f u6f2 = (u6f) t6f2;
            synchronized (u6f2.a) {
                try {
                    List<lk4> list = u6f2.j;
                    if (list != null) {
                        for (lk4 b : list) {
                            b.b();
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
        this.e.e(u6f);
        if (((CaptureSessionOnClosedNotCalledQuirk) grg.b) != null) {
            LinkedHashSet<t6f> linkedHashSet2 = new LinkedHashSet<>();
            Iterator it3 = e.iterator();
            while (it3.hasNext() && (t6f = (t6f) it3.next()) != u6f) {
                linkedHashSet2.add(t6f);
            }
            for (t6f t6f5 : linkedHashSet2) {
                t6f5.getClass();
                t6f5.c(t6f5);
            }
        }
    }

    public final int i(ArrayList arrayList, jr1 jr1) {
        CameraCaptureSession.CaptureCallback a = this.t.a(jr1);
        bs0.q(this.f, "Need to call openCaptureSession before using this API.");
        return ((CameraCaptureSession) ((ata) this.f.b).b).captureBurstRequests(arrayList, this.c, a);
    }

    public final void j() {
        if (this.v.compareAndSet(false, true)) {
            if (this.u.b) {
                try {
                    bs0.q(this.f, "Need to call openCaptureSession before using this API.");
                    ((CameraCaptureSession) ((ata) this.f.b).b).abortCaptures();
                } catch (Exception e) {
                    e.toString();
                }
            }
            this.t.c().d(new mgd(21, this), this.c);
        }
    }

    public final zz7 m(CameraDevice cameraDevice, hwd hwd, List list) {
        zz7 J;
        synchronized (this.o) {
            try {
                ArrayList e = this.b.e();
                ArrayList arrayList = new ArrayList();
                Iterator it = e.iterator();
                while (it.hasNext()) {
                    u6f u6f = (u6f) ((t6f) it.next());
                    arrayList.add(m5a.F(new u52((Object) u6f.t.c(), (Object) u6f.n, 1500, 8)));
                }
                kz7 W = hd8.W(arrayList);
                this.q = W;
                oj6 a = oj6.a(W);
                fm3 fm3 = new fm3(this, cameraDevice, hwd, list);
                Executor executor = this.c;
                a.getClass();
                J = hd8.J(hd8.b0(a, fm3, executor));
            } catch (Throwable th) {
                throw th;
            }
        }
        return J;
    }

    public final int n(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        CameraCaptureSession.CaptureCallback a = this.t.a(captureCallback);
        bs0.q(this.f, "Need to call openCaptureSession before using this API.");
        return ((CameraCaptureSession) ((ata) this.f.b).b).setSingleRepeatingRequest(captureRequest, this.c, a);
    }

    public final zz7 o(ArrayList arrayList) {
        zz7 o2;
        synchronized (this.o) {
            this.p = arrayList;
            o2 = super.o(arrayList);
        }
        return o2;
    }

    public final boolean p() {
        boolean z;
        synchronized (this.o) {
            try {
                if (l()) {
                    this.r.b(this.p);
                } else {
                    kz7 kz7 = this.q;
                    if (kz7 != null) {
                        kz7.cancel(true);
                    }
                }
                oj6 oj6 = null;
                try {
                    synchronized (this.a) {
                        if (!this.l) {
                            oj6 oj62 = this.i;
                            if (oj62 != null) {
                                oj6 = oj62;
                            }
                            this.l = true;
                        }
                        z = !l();
                    }
                    if (oj6 != null) {
                        oj6.cancel(true);
                    }
                } catch (Throwable th) {
                    if (oj6 != null) {
                        oj6.cancel(true);
                    }
                    throw th;
                }
            } finally {
            }
        }
        return z;
    }
}
