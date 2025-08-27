package defpackage;

import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: k9f  reason: default package */
public final class k9f implements rb6 {
    public final ArrayDeque a = new ArrayDeque();
    public final b8d b;
    public zc4 c;
    public k3d o;
    public final ArrayList v;
    public boolean w = false;

    public k9f(b8d b8d) {
        ev0.g();
        this.b = b8d;
        this.v = new ArrayList();
    }

    public final void a(ha7 ha7) {
        ryg.G().execute(new j9f(this, 1));
    }

    public final void b() {
        ev0.g();
        Exception exc = new Exception("Camera is closed.", (Throwable) null);
        ArrayDeque arrayDeque = this.a;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            rc0 rc0 = (rc0) it.next();
            rc0.getClass();
            rc0.b.execute(new s6e(9, rc0, exc));
        }
        arrayDeque.clear();
        Iterator it2 = new ArrayList(this.v).iterator();
        while (it2.hasNext()) {
            k3d k3d = (k3d) it2.next();
            k3d.getClass();
            ev0.g();
            if (!k3d.d.b.isDone()) {
                ev0.g();
                k3d.g = true;
                zz7 zz7 = k3d.i;
                Objects.requireNonNull(zz7);
                zz7.cancel(true);
                k3d.e.d(exc);
                k3d.f.b((Object) null);
                ev0.g();
                rc0 rc02 = k3d.a;
                rc02.getClass();
                rc02.b.execute(new s6e(9, rc02, exc));
            }
        }
    }

    public final void c() {
        rc0 rc0;
        boolean z = false;
        ev0.g();
        if (this.o == null && !this.w) {
            zc4 zc4 = this.c;
            zc4.getClass();
            ev0.g();
            if (((pk4) zc4.c).w() != 0 && (rc0 = (rc0) this.a.poll()) != null) {
                k3d k3d = new k3d(rc0, this);
                bs0.r((String) null, !(this.o != null));
                this.o = k3d;
                ev0.g();
                k3d.c.b.d(new j9f(this, 0), ryg.j());
                this.v.add(k3d);
                ev0.g();
                k3d.d.b.d(new s6e(8, this, k3d), ryg.j());
                zc4 zc42 = this.c;
                ev0.g();
                go1 go1 = k3d.c;
                zc42.getClass();
                ev0.g();
                zw1 zw1 = (zw1) ((z87) zc42.a).k(z87.o, new zw1(Arrays.asList(new kx1[]{new kx1()})));
                Objects.requireNonNull(zw1);
                int i = zc4.x;
                zc4.x = i + 1;
                ArrayList arrayList = new ArrayList();
                String valueOf = String.valueOf(zw1.hashCode());
                List<kx1> list = zw1.a;
                Objects.requireNonNull(list);
                for (kx1 kx1 : list) {
                    u40 u40 = new u40();
                    bx1 bx1 = (bx1) zc42.b;
                    u40.c = bx1.c;
                    u40.c(bx1.b);
                    u40.a(rc0.i);
                    ja0 ja0 = (ja0) zc42.v;
                    za7 za7 = ja0.b;
                    Objects.requireNonNull(za7);
                    ((HashSet) u40.e).add(za7);
                    u40.a = ja0.c != null ? true : z;
                    if (ld9.H(ja0.e)) {
                        if (((ImageCaptureRotationOptionQuirk) nn4.a.g(ImageCaptureRotationOptionQuirk.class)) != null) {
                            la0 la0 = bx1.i;
                        } else {
                            ((pz9) u40.f).f(bx1.i, Integer.valueOf(rc0.f));
                        }
                        la0 la02 = bx1.j;
                        grf.b(rc0.d, ja0.d);
                        ((pz9) u40.f).f(la02, Integer.valueOf(rc0.g));
                    }
                    u40.c(kx1.a.b);
                    ((uz9) u40.g).a.put(valueOf, 0);
                    ((uz9) u40.g).a.put("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i));
                    u40.b(ja0.a);
                    arrayList.add(u40.d());
                    z = false;
                }
                zqd zqd = new zqd(6, arrayList, k3d);
                qvb qvb = new qvb(zw1, rc0.d, rc0.f, rc0.g, rc0.e, k3d, go1, i);
                zc4 zc43 = this.c;
                zc43.getClass();
                ev0.g();
                ((ja0) zc43.v).j.accept(qvb);
                ev0.g();
                y87 y87 = (y87) this.b.a;
                synchronized (y87.p) {
                    try {
                        if (y87.p.get() == null) {
                            y87.p.set(Integer.valueOf(y87.F()));
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                y87 y872 = (y87) this.b.a;
                y872.getClass();
                ev0.g();
                cz1 b0 = hd8.b0(y872.d().i(arrayList, y872.o, y872.q), new xv1(22, (Object) new es1(6)), ryg.j());
                boolean z2 = false;
                hd8.a(b0, new wsb(this, zqd, false), ryg.G());
                ev0.g();
                if (k3d.i == null) {
                    z2 = true;
                }
                bs0.r("CaptureRequestFuture can only be set once.", z2);
                k3d.i = b0;
            }
        }
    }
}
