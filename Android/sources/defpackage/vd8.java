package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: vd8  reason: default package */
public final class vd8 {
    public static final /* synthetic */ int t = 0;
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final HashMap c = new HashMap();
    public final er7 d;
    public final ae8 e;
    public final lfd f;
    public final bk3 g;
    public final v02 h;
    public final u9a i;
    public final zc8 j;
    public final zc8 k;
    public final zc8 l;
    public final zc8 m;
    public ao1 n;
    public u6h o;
    public ao1 p;
    public long q;
    public ao1 r;
    public wie s;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, bk3] */
    /* JADX WARNING: type inference failed for: r1v0, types: [v02, java.lang.Object] */
    public vd8(er7 er7, ae8 ae8, lfd lfd) {
        ? obj = new Object();
        ? obj2 = new Object();
        u9a u9a = new u9a(14);
        zc8 zc8 = new zc8(7);
        zc8 zc82 = new zc8(8);
        zc8 zc83 = new zc8(9);
        zc8 zc84 = new zc8(10);
        this.d = er7;
        this.e = ae8;
        this.f = lfd;
        this.g = obj;
        this.h = obj2;
        this.i = u9a;
        this.j = zc8;
        this.k = zc82;
        this.l = zc83;
        this.m = zc84;
    }

    public final void a(Context context, List list) {
        LinkedHashMap linkedHashMap;
        boolean z;
        gb3 gb3;
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedHashMap = this.a;
            if (!hasNext) {
                break;
            }
            pf8 pf8 = (pf8) it.next();
            sj0 sj0 = (sj0) linkedHashMap.get(Long.valueOf(pf8.c));
            s58 s58 = pf8.a;
            double d2 = s58.a;
            double d3 = s58.b;
            tf8 tf8 = pf8.d;
            long j2 = pf8.c;
            if (sj0 == null) {
                sf8 sf8 = (sf8) this.j.b();
                LatLng latLng = new LatLng(d2, d3);
                rf8 rf8 = sf8.a;
                rf8.a = latLng;
                rf8.x = false;
                rf8.b = pf8.e;
                rf8.c = pf8.f;
                rf8.w0 = j2 == 0 ? 2.0f : tf8.a;
                rf8.v = 0.5f;
                rf8.w = 0.95f;
                rf8.y = false;
                this.h.getClass();
                rf8.o = v02.f().a;
                e4 B = this.d.B(sf8);
                B.A(Long.valueOf(j2));
                sj0 sj02 = new sj0(pf8, B);
                linkedHashMap.put(Long.valueOf(j2), sj02);
                z = pf8.k;
                sj0 = sj02;
            } else {
                pf8 pf82 = sj0.b;
                tf8 tf82 = pf82.d;
                sj0.b = pf8;
                e4 e4Var = sj0.a;
                e4Var.getClass();
                LatLng latLng2 = new LatLng(d2, d3);
                mf8 mf8 = (mf8) e4Var.b;
                mf8.getClass();
                uxg uxg = mf8.a;
                try {
                    oxg oxg = (oxg) uxg;
                    Parcel H0 = oxg.H0();
                    hzg.b(H0, latLng2);
                    oxg.I0(H0, 3);
                    e4Var.A(Long.valueOf(j2));
                    float f2 = j2 == 0 ? 2.0f : tf8.a;
                    try {
                        oxg oxg2 = (oxg) uxg;
                        Parcel H02 = oxg2.H0();
                        H02.writeFloat(f2);
                        oxg2.I0(H02, 27);
                        z = pf82.k;
                        tf8 = tf82;
                    } catch (RemoteException e2) {
                        throw new RuntimeException(e2);
                    }
                } catch (RemoteException e3) {
                    throw new RuntimeException(e3);
                }
            }
            if (sj0.c != null) {
                pf8 pf83 = sj0.b;
                if (tf8 == pf83.d && z == pf83.k) {
                    Context context2 = context;
                }
            }
            pf8 pf84 = sj0.b;
            boolean z2 = pf84.h;
            ae8 ae8 = this.e;
            if (z2) {
                long j3 = pf84.b;
                if (j3 != 0) {
                    ae8.getClass();
                    gb3 = new gb3(3, new wd8(ae8, j3, pf84.d, pf84.k, context));
                    Context context3 = context;
                    lja s2 = gb3.x(this.f).s(qe.a());
                    or7 or7 = new or7(new d9d(11, sj0), new rx0(28), m58.e);
                    s2.a(or7);
                    sj0.c = or7;
                }
            }
            ae8.getClass();
            gb3 = new gb3(3, new u00((Object) ae8, (Object) pf84.d, (Object) context, 14));
            lja s22 = gb3.x(this.f).s(qe.a());
            or7 or72 = new or7(new d9d(11, sj0), new rx0(28), m58.e);
            s22.a(or72);
            sj0.c = or72;
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            sj0 sj03 = (sj0) it2.next();
            Iterator it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (((pf8) it3.next()).c == sj03.b.c) {
                        break;
                    }
                } else {
                    it2.remove();
                    mq4 mq4 = sj03.c;
                    if (mq4 != null) {
                        mq4.dispose();
                    }
                    sj03.a.s();
                }
            }
        }
    }

    public final void b() {
        LinkedHashMap linkedHashMap = this.a;
        for (sj0 sj0 : linkedHashMap.values()) {
            sj0.a.s();
            mq4 mq4 = sj0.c;
            if (mq4 != null) {
                mq4.dispose();
            }
        }
        linkedHashMap.clear();
        d();
        c();
    }

    public final void c() {
        wie wie = this.s;
        if (wie != null) {
            y03 y03 = (y03) wie.b;
            y03.getClass();
            try {
                r5h r5h = (r5h) y03.a;
                r5h.I0(r5h.H0(), 1);
            } catch (RemoteException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final void d() {
        e();
        u6h u6h = this.o;
        if (u6h != null) {
            iqb iqb = (iqb) u6h.b;
            iqb.getClass();
            try {
                byg byg = (byg) iqb.a;
                byg.I0(byg.H0(), 1);
                this.o = null;
                this.q = 0;
            } catch (RemoteException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final void e() {
        jbd.c(this.p);
        jbd.c(this.r);
        LinkedHashMap linkedHashMap = this.b;
        for (sj0 sj0 : linkedHashMap.values()) {
            sj0.a.s();
        }
        linkedHashMap.clear();
    }

    public final void f(double d2, double d3, Float f2, Float f3, Float f4) {
        LatLng latLng = new LatLng(d2, d3);
        ev1 ev1 = ((fv1) this.k.b()).a;
        ev1.a = latLng;
        ev1.b = f2.floatValue();
        if (f3 != null) {
            ev1.c = f3.floatValue();
        }
        if (f4 != null) {
            ev1.d = f4.floatValue();
        }
        CameraPosition cameraPosition = new CameraPosition(ev1.a, ev1.b, ev1.c, ev1.d);
        this.g.getClass();
        try {
            qyg qyg = hsg.j;
            vzg.n(qyg, "CameraUpdateFactory is not initialized");
            Parcel H0 = qyg.H0();
            hzg.b(H0, cameraPosition);
            Parcel R = qyg.R(H0, 7);
            p67 L0 = hha.L0(R.readStrongBinder());
            R.recycle();
            g(new xv1(10, (Object) new b8d(L0)), false);
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final void g(xv1 xv1, boolean z) {
        b8d b8d = (b8d) xv1.b;
        er7 er7 = this.d;
        if (z) {
            er7.getClass();
            wsb wsb = (wsb) er7.b;
            wsb.getClass();
            try {
                vzg.n(b8d, "CameraUpdate must not be null.");
                o3h o3h = (o3h) wsb.a;
                Parcel H0 = o3h.H0();
                hzg.c(H0, (p67) b8d.a);
                H0.writeInt(800);
                H0.writeStrongBinder((IBinder) null);
                o3h.I0(H0, 7);
            } catch (RemoteException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            er7.getClass();
            wsb wsb2 = (wsb) er7.b;
            wsb2.getClass();
            try {
                vzg.n(b8d, "CameraUpdate must not be null.");
                o3h o3h2 = (o3h) wsb2.a;
                Parcel H02 = o3h2.H0();
                hzg.c(H02, (p67) b8d.a);
                o3h2.I0(H02, 4);
            } catch (RemoteException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public final void h(int i2, Context context) {
        if (i2 != 0) {
            ce8 ce8 = (ce8) this.c.get(Integer.valueOf(i2));
            if (ce8 != null) {
                ((wsb) this.d.b).f0(ce8.a);
                return;
            }
            jbd.c(this.n);
            fce j2 = new mka(1, new oj0((Object) this, (Object) context, i2, 0)).n(this.f).j(qe.a());
            ao1 ao1 = new ao1(3, new ud0(this, i2, 1), new rx0(27));
            j2.l(ao1);
            this.n = ao1;
        }
    }

    public final void i(int i2) {
        int i3;
        er7 er7 = this.d;
        er7.getClass();
        if (i2 != 0) {
            i3 = 1;
            if (i2 != 1) {
                int i4 = 2;
                if (i2 != 2) {
                    i4 = 3;
                    if (i2 != 3) {
                        i4 = 4;
                        if (i2 != 4) {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unknown tam map type = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
                        }
                    }
                }
                i3 = i4;
            }
        } else {
            i3 = 0;
        }
        wsb wsb = (wsb) er7.b;
        wsb.getClass();
        try {
            o3h o3h = (o3h) wsb.a;
            Parcel H0 = o3h.H0();
            H0.writeInt(i3);
            o3h.I0(H0, 16);
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final void j(Context context, boolean z) {
        boolean z2 = false;
        er7 er7 = this.d;
        if (!z) {
            er7.U(false);
            return;
        }
        int d2 = q8.d(context, "android.permission.ACCESS_FINE_LOCATION");
        int d3 = q8.d(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (d2 == 0 && d3 == 0) {
            z2 = true;
        }
        er7.U(z2);
    }
}
