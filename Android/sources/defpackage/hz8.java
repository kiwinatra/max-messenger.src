package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: hz8  reason: default package */
public final class hz8 extends Binder implements i67 {
    public static final /* synthetic */ int i = 0;
    public final WeakReference c;
    public final ny8 d;
    public final m7f e;
    public final Set f = Collections.synchronizedSet(new HashSet());
    public j0d g = j0d.X;
    public int h;

    public hz8(yx8 yx8) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.c = new WeakReference(yx8);
        this.d = ny8.a(yx8.f);
        this.e = new m7f(yx8);
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [zz7, java.lang.Object] */
    public static zz7 J0(yx8 yx8, cx8 cx8, int i2, gz8 gz8, pk3 pk3) {
        if (yx8.i()) {
            return ya7.b;
        }
        zz7 zz7 = (zz7) gz8.g(yx8, cx8, i2);
        ? obj = new Object();
        zz7.d(new jh3(10, yx8, obj, pk3, zz7), dp4.a);
        return obj;
    }

    public static void N0(cx8 cx8, int i2, swd swd) {
        try {
            bx8 bx8 = cx8.d;
            n79.o(bx8);
            bx8.i(i2, swd);
        } catch (RemoteException e2) {
            i8b.W("Failed to send result to controller " + cx8, e2);
        }
    }

    public static td8 O0(pk3 pk3) {
        return new td8(9, new td8(10, pk3));
    }

    public final void A0(c67 c67, int i2, int i3) {
        if (c67 != null) {
            if (i3 == 2 || i3 == 0 || i3 == 1) {
                L0(c67, i2, 15, O0(new ob4(i3, 9)));
            }
        }
    }

    public final void B(c67 c67, int i2, Bundle bundle) {
        if (c67 != null && bundle != null) {
            try {
                L0(c67, i2, 29, O0(new g18(15, this, kqf.b(bundle))));
            } catch (RuntimeException e2) {
                i8b.W("Ignoring malformed Bundle for TrackSelectionParameters", e2);
            }
        }
    }

    public final void B0(c67 c67, int i2, int i3, int i4, int i5) {
        if (c67 != null && i3 >= 0 && i4 >= i3 && i5 >= 0) {
            L0(c67, i2, 20, O0(new wy8(i3, i4, i5)));
        }
    }

    public final void C(c67 c67, int i2) {
        cx8 k;
        if (c67 != null && (k = this.e.k(c67.asBinder())) != null) {
            M0(k, i2, 12, O0(new vx8(13)));
        }
    }

    public final void D0(c67 c67, int i2, int i3, int i4) {
        if (c67 != null && i3 >= 0 && i4 >= 0) {
            L0(c67, i2, 20, O0(new fc5(i3, i4, 4)));
        }
    }

    public final void E(c67 c67, int i2, int i3, Bundle bundle) {
        if (c67 != null && bundle != null && i3 >= 0) {
            try {
                L0(c67, i2, 20, new zy8(new g18(18, new vy8(0, ir8.b(bundle)), new uy8(this, i3, 1)), 1));
            } catch (RuntimeException e2) {
                i8b.W("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void E0(c67 c67, int i2, int i3, Bundle bundle) {
        if (c67 != null && bundle != null && i3 >= 0) {
            try {
                L0(c67, i2, 20, new zy8(new g18(18, new vy8(1, ir8.b(bundle)), new uy8(this, i3, 2)), 1));
            } catch (RuntimeException e2) {
                i8b.W("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void F(c67 c67, int i2, int i3) {
        if (c67 != null) {
            L0(c67, i2, 34, O0(new ob4(i3, 8)));
        }
    }

    public final void F0(c67 c67, int i2, boolean z) {
        if (c67 != null) {
            L0(c67, i2, 14, O0(new vz0(z, 9)));
        }
    }

    public final void G(c67 c67, int i2) {
        cx8 k;
        if (c67 != null && (k = this.e.k(c67.asBinder())) != null) {
            M0(k, i2, 11, O0(new vx8(8)));
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [cs, cb7] */
    public final ppb H0(ppb ppb) {
        tb7 a = ppb.D.a();
        qb7 o = tb7.o();
        ? csVar = new cs(4);
        for (int i2 = 0; i2 < a.size(); i2++) {
            pqf pqf = (pqf) a.get(i2);
            spf b = pqf.b();
            String str = (String) this.g.get(b);
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                int i3 = this.h;
                this.h = i3 + 1;
                int i4 = v0g.a;
                sb.append(Integer.toString(i3, 36));
                sb.append("-");
                sb.append(b.b);
                str = sb.toString();
            }
            csVar.G(b, str);
            o.d(pqf.a(str));
        }
        this.g = csVar.h();
        ppb b2 = ppb.b(new qqf(o.j()));
        kqf kqf = b2.E;
        if (kqf.A.isEmpty()) {
            return b2;
        }
        iqf c2 = kqf.a().c();
        wvf m = kqf.A.values().iterator();
        while (m.hasNext()) {
            dqf dqf = (dqf) m.next();
            spf spf = dqf.a;
            String str2 = (String) this.g.get(spf);
            if (str2 != null) {
                c2.a(new dqf(spf.a(str2), dqf.b));
            } else {
                c2.a(dqf);
            }
        }
        return b2.o(c2.b());
    }

    public final void I(c67 c67, int i2, int i3) {
        if (c67 != null) {
            L0(c67, i2, 34, O0(new ob4(i3, 7)));
        }
    }

    public final m7f I0() {
        return this.e;
    }

    public final void J(c67 c67, int i2, IBinder iBinder, boolean z) {
        if (c67 != null && iBinder != null) {
            try {
                tb7 a = gv0.a(iBinder);
                qb7 o = tb7.o();
                for (int i3 = 0; i3 < a.size(); i3++) {
                    Bundle bundle = (Bundle) a.get(i3);
                    bundle.getClass();
                    o.a(ir8.b(bundle));
                }
                L0(c67, i2, 20, new zy8(new g18(17, new h62(o.j(), z, 7), new vx8(27)), 1));
            } catch (RuntimeException e2) {
                i8b.W("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void K(c67 c67, int i2, int i3, int i4) {
        if (c67 != null && i3 >= 0 && i4 >= i3) {
            L0(c67, i2, 20, new td8(9, new ty8(this, i3, i4)));
        }
    }

    public final int K0(cx8 cx8, ypb ypb, int i2) {
        if (ypb.J0(17)) {
            m7f m7f = this.e;
            if (!m7f.q(cx8, 17) && m7f.q(cx8, 16)) {
                return ypb.d0() + i2;
            }
        }
        return i2;
    }

    public final void L(c67 c67, int i2, int i3) {
        if (c67 != null && i3 >= 0) {
            L0(c67, i2, 20, new td8(9, new uy8(this, i3, 4)));
        }
    }

    public final void L0(c67 c67, int i2, int i3, gz8 gz8) {
        cx8 k = this.e.k(c67.asBinder());
        if (k != null) {
            M0(k, i2, i3, gz8);
        }
    }

    public final void M0(cx8 cx8, int i2, int i3, gz8 gz8) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            yx8 yx8 = (yx8) this.c.get();
            if (yx8 != null) {
                if (!yx8.i()) {
                    v0g.W(yx8.l, new yy8(this, cx8, i3, i2, yx8, gz8));
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void N(c67 c67, int i2, int i3, int i4, IBinder iBinder) {
        if (c67 != null && iBinder != null && i3 >= 0 && i4 >= i3) {
            try {
                tb7 a = gv0.a(iBinder);
                qb7 o = tb7.o();
                for (int i5 = 0; i5 < a.size(); i5++) {
                    Bundle bundle = (Bundle) a.get(i5);
                    bundle.getClass();
                    o.a(ir8.b(bundle));
                }
                L0(c67, i2, 20, new zy8(new g18(18, new td8(7, o.j()), new ty8(this, i3, i4)), 1));
            } catch (RuntimeException e2) {
                i8b.W("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void O(c67 c67, int i2) {
        cx8 k;
        if (c67 != null && (k = this.e.k(c67.asBinder())) != null) {
            M0(k, i2, 9, O0(new vx8(14)));
        }
    }

    public final void P(c67 c67, int i2, int i3, long j) {
        if (c67 != null && i3 >= 0) {
            L0(c67, i2, 10, new td8(9, new rb4((Object) this, i3, j, 4)));
        }
    }

    public final void Q(c67 c67, int i2, IBinder iBinder) {
        if (c67 != null && iBinder != null) {
            try {
                tb7 a = gv0.a(iBinder);
                qb7 o = tb7.o();
                for (int i3 = 0; i3 < a.size(); i3++) {
                    Bundle bundle = (Bundle) a.get(i3);
                    bundle.getClass();
                    o.a(ir8.b(bundle));
                }
                L0(c67, i2, 20, new zy8(new g18(18, new x52(22, o.j()), new vx8(16)), 1));
            } catch (RuntimeException e2) {
                i8b.W("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void R(c67 c67, int i2, yvd yvd, int i3, gz8 gz8) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            yx8 yx8 = (yx8) this.c.get();
            if (yx8 != null) {
                if (!yx8.i()) {
                    cx8 k = this.e.k(c67.asBinder());
                    if (k == null) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        return;
                    }
                    v0g.W(yx8.l, new xy8(this, k, yvd, i2, i3, gz8, yx8));
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void S(c67 c67, int i2) {
        if (c67 != null) {
            L0(c67, i2, 4, O0(new vx8(23)));
        }
    }

    public final void U(c67 c67, int i2, int i3, IBinder iBinder) {
        if (c67 != null && iBinder != null && i3 >= 0) {
            try {
                tb7 a = gv0.a(iBinder);
                qb7 o = tb7.o();
                for (int i4 = 0; i4 < a.size(); i4++) {
                    Bundle bundle = (Bundle) a.get(i4);
                    bundle.getClass();
                    o.a(ir8.b(bundle));
                }
                L0(c67, i2, 20, new zy8(new g18(18, new x52(21, o.j()), new uy8(this, i3, 3)), 1));
            } catch (RuntimeException e2) {
                i8b.W("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void V(c67 c67, int i2) {
        if (c67 != null) {
            L0(c67, i2, 6, O0(new vx8(11)));
        }
    }

    public final void X(c67 c67, int i2, long j) {
        if (c67 != null) {
            L0(c67, i2, 5, O0(new c10(j, 28)));
        }
    }

    public final void Y(c67 c67, int i2) {
        if (c67 != null) {
            L0(c67, i2, 2, O0(new vx8(22)));
        }
    }

    public final void Z(c67 c67, int i2, int i3) {
        if (c67 != null && i3 >= 0) {
            L0(c67, i2, 10, new td8(9, new uy8(this, i3, 0)));
        }
    }

    public final void a0(c67 c67, int i2) {
        if (c67 != null) {
            L0(c67, i2, 26, O0(new vx8(17)));
        }
    }

    public final IBinder asBinder() {
        return this;
    }

    public final void b0(c67 c67, int i2, boolean z) {
        if (c67 != null) {
            L0(c67, i2, 1, O0(new vz0(z, 7)));
        }
    }

    public final void c(c67 c67, int i2, Bundle bundle) {
        bs6 bs6;
        lh3 lh3;
        if (c67 != null && bundle != null) {
            try {
                swd a = swd.a(bundle);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    m7f m7f = this.e;
                    IBinder asBinder = c67.asBinder();
                    synchronized (m7f.a) {
                        cx8 k = m7f.k(asBinder);
                        bs6 = null;
                        lh3 = k != null ? (lh3) ((ts) m7f.c).get(k) : null;
                    }
                    if (lh3 != null) {
                        bs6 = lh3.b;
                    }
                    if (bs6 == null) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        return;
                    }
                    bs6.p(i2, a);
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
            } catch (RuntimeException e2) {
                i8b.W("Ignoring malformed Bundle for SessionResult", e2);
            }
        }
    }

    public final void c0(c67 c67, int i2, Bundle bundle) {
        k0(c67, i2, bundle, true);
    }

    public final void d0(c67 c67, int i2) {
        if (c67 != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                yx8 yx8 = (yx8) this.c.get();
                if (yx8 != null) {
                    if (!yx8.i()) {
                        v0g.W(yx8.l, new sx8(4, this, c67));
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public final void e(c67 c67, int i2, Bundle bundle, boolean z) {
        if (c67 != null && bundle != null) {
            try {
                L0(c67, i2, 35, O0(new h62(i30.a(bundle), z, 6)));
            } catch (RuntimeException e2) {
                i8b.W("Ignoring malformed Bundle for AudioAttributes", e2);
            }
        }
    }

    public final void f(c67 c67, int i2) {
        cx8 k;
        if (c67 != null && (k = this.e.k(c67.asBinder())) != null) {
            M0(k, i2, 1, O0(new vx8(5)));
        }
    }

    public final void h0(c67 c67, int i2, Surface surface) {
        if (c67 != null) {
            L0(c67, i2, 27, O0(new td8(8, surface)));
        }
    }

    public final void i0(c67 c67, int i2, Bundle bundle) {
        if (c67 != null && bundle != null) {
            try {
                ai3 a = ai3.a(bundle);
                int callingUid = Binder.getCallingUid();
                int callingPid = Binder.getCallingPid();
                long clearCallingIdentity = Binder.clearCallingIdentity();
                if (callingPid == 0) {
                    callingPid = a.d;
                }
                try {
                    ly8 ly8 = new ly8(a.c, callingPid, callingUid);
                    l(c67, new cx8(ly8, a.a, a.b, this.d.b(ly8), new dz8(c67), a.e));
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            } catch (RuntimeException e2) {
                i8b.W("Ignoring malformed Bundle for ConnectionRequest", e2);
            }
        }
    }

    public final void j(c67 c67, int i2, Bundle bundle, long j) {
        if (c67 != null && bundle != null) {
            try {
                L0(c67, i2, 31, new zy8(new g18(17, new dr1((Object) ir8.b(bundle), j, 6), new vx8(27)), 1));
            } catch (RuntimeException e2) {
                i8b.W("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void k0(c67 c67, int i2, Bundle bundle, boolean z) {
        if (c67 != null && bundle != null) {
            try {
                L0(c67, i2, 31, new zy8(new g18(17, new h62(ir8.b(bundle), z, 5), new vx8(27)), 1));
            } catch (RuntimeException e2) {
                i8b.W("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void l(c67 c67, cx8 cx8) {
        if (c67 != null) {
            yx8 yx8 = (yx8) this.c.get();
            if (yx8 == null || yx8.i()) {
                try {
                    c67.d(0);
                } catch (RemoteException unused) {
                }
            } else {
                this.f.add(cx8);
                v0g.W(yx8.l, new jh3(9, this, cx8, yx8, c67));
            }
        }
    }

    public final void l0(c67 c67) {
        if (c67 != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                yx8 yx8 = (yx8) this.c.get();
                if (yx8 != null) {
                    if (!yx8.i()) {
                        cx8 k = this.e.k(c67.asBinder());
                        if (k != null) {
                            v0g.W(yx8.l, new sx8(5, this, k));
                        }
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public final void n0(c67 c67, int i2, int i3) {
        if (c67 != null && i3 >= 0) {
            L0(c67, i2, 25, O0(new ob4(i3, 10)));
        }
    }

    public final void o0(c67 c67, int i2, Bundle bundle) {
        if (c67 != null && bundle != null) {
            try {
                L0(c67, i2, 13, O0(new dp8(new gob(bundle.getFloat(gob.e, 1.0f), bundle.getFloat(gob.f, 1.0f)), 2)));
            } catch (RuntimeException e2) {
                i8b.W("Ignoring malformed Bundle for PlaybackParameters", e2);
            }
        }
    }

    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 >= 1 && i2 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i2 != 1598968902) {
            boolean z = false;
            switch (i2) {
                case 3002:
                    y(wp8.l(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                    break;
                case 3003:
                    n0(wp8.l(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    break;
                case 3004:
                    z(wp8.l(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3005:
                    a0(wp8.l(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3006:
                    c67 l = wp8.l(parcel.readStrongBinder());
                    int readInt = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    x0(l, readInt, z);
                    break;
                case 3007:
                    k0(wp8.l(parcel.readStrongBinder()), parcel.readInt(), (Bundle) kr7.c(parcel, Bundle.CREATOR), true);
                    break;
                case 3008:
                    j(wp8.l(parcel.readStrongBinder()), parcel.readInt(), (Bundle) kr7.c(parcel, Bundle.CREATOR), parcel.readLong());
                    break;
                case 3009:
                    c67 l2 = wp8.l(parcel.readStrongBinder());
                    int readInt2 = parcel.readInt();
                    Bundle bundle = (Bundle) kr7.c(parcel, Bundle.CREATOR);
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    k0(l2, readInt2, bundle, z);
                    break;
                case 3010:
                    J(wp8.l(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                    break;
                case 3011:
                    c67 l3 = wp8.l(parcel.readStrongBinder());
                    int readInt3 = parcel.readInt();
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    J(l3, readInt3, readStrongBinder, z);
                    break;
                case 3012:
                    v(wp8.l(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                    break;
                case 3013:
                    c67 l4 = wp8.l(parcel.readStrongBinder());
                    int readInt4 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    b0(l4, readInt4, z);
                    break;
                case 3014:
                    c(wp8.l(parcel.readStrongBinder()), parcel.readInt(), (Bundle) kr7.c(parcel, Bundle.CREATOR));
                    break;
                case 3015:
                    i0(wp8.l(parcel.readStrongBinder()), parcel.readInt(), (Bundle) kr7.c(parcel, Bundle.CREATOR));
                    break;
                case 3016:
                    c67 l5 = wp8.l(parcel.readStrongBinder());
                    int readInt5 = parcel.readInt();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    q0(l5, readInt5, (Bundle) kr7.c(parcel, creator), (Bundle) kr7.c(parcel, creator));
                    break;
                case 3017:
                    A0(wp8.l(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    break;
                case 3018:
                    c67 l6 = wp8.l(parcel.readStrongBinder());
                    int readInt6 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    F0(l6, readInt6, z);
                    break;
                case 3019:
                    L(wp8.l(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    break;
                case 3020:
                    K(wp8.l(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    break;
                case 3021:
                    s0(wp8.l(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3022:
                    D0(wp8.l(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    break;
                case 3023:
                    B0(wp8.l(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    break;
                case 3024:
                    p(wp8.l(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3025:
                    f(wp8.l(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3026:
                    Y(wp8.l(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3027:
                    o0(wp8.l(parcel.readStrongBinder()), parcel.readInt(), (Bundle) kr7.c(parcel, Bundle.CREATOR));
                    break;
                case 3028:
                    x(wp8.l(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                    break;
                case 3029:
                    c67 l7 = wp8.l(parcel.readStrongBinder());
                    int readInt7 = parcel.readInt();
                    Bundle bundle2 = (Bundle) kr7.c(parcel, Bundle.CREATOR);
                    if (!(l7 == null || bundle2 == null)) {
                        try {
                            L0(l7, readInt7, 20, new zy8(new g18(18, new vy8(2, ir8.b(bundle2)), new vx8(18)), 1));
                            break;
                        } catch (RuntimeException e2) {
                            i8b.W("Ignoring malformed Bundle for MediaItem", e2);
                            break;
                        }
                    }
                case 3030:
                    E(wp8.l(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) kr7.c(parcel, Bundle.CREATOR));
                    break;
                case 3031:
                    Q(wp8.l(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                    break;
                case 3032:
                    U(wp8.l(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    break;
                case 3033:
                    v0(wp8.l(parcel.readStrongBinder()), parcel.readInt(), (Bundle) kr7.c(parcel, Bundle.CREATOR));
                    break;
                case 3034:
                    y0(wp8.l(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3035:
                    d0(wp8.l(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3036:
                    S(wp8.l(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3037:
                    Z(wp8.l(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    break;
                case 3038:
                    X(wp8.l(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                    break;
                case 3039:
                    P(wp8.l(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readLong());
                    break;
                case 3040:
                    G(wp8.l(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3041:
                    C(wp8.l(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3042:
                    V(wp8.l(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3043:
                    w(wp8.l(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3044:
                    h0(wp8.l(parcel.readStrongBinder()), parcel.readInt(), (Surface) kr7.c(parcel, Surface.CREATOR));
                    break;
                case 3045:
                    l0(wp8.l(parcel.readStrongBinder()));
                    break;
                case 3046:
                    w0(wp8.l(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3047:
                    O(wp8.l(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3048:
                    B(wp8.l(parcel.readStrongBinder()), parcel.readInt(), (Bundle) kr7.c(parcel, Bundle.CREATOR));
                    break;
                case 3049:
                    c67 l8 = wp8.l(parcel.readStrongBinder());
                    int readInt8 = parcel.readInt();
                    String readString = parcel.readString();
                    Bundle bundle3 = (Bundle) kr7.c(parcel, Bundle.CREATOR);
                    if (!(l8 == null || readString == null || bundle3 == null)) {
                        if (!TextUtils.isEmpty(readString)) {
                            try {
                                R(l8, readInt8, (yvd) null, 40010, new zy8(new vx8(15, readString, rpc.a(bundle3)), 1));
                                break;
                            } catch (RuntimeException e3) {
                                i8b.W("Ignoring malformed Bundle for Rating", e3);
                                break;
                            }
                        } else {
                            i8b.V("setRatingWithMediaId(): Ignoring empty mediaId");
                            break;
                        }
                    }
                case 3050:
                    c67 l9 = wp8.l(parcel.readStrongBinder());
                    int readInt9 = parcel.readInt();
                    Bundle bundle4 = (Bundle) kr7.c(parcel, Bundle.CREATOR);
                    if (!(l9 == null || bundle4 == null)) {
                        try {
                            rpc.a(bundle4);
                            R(l9, readInt9, (yvd) null, 40010, new zy8(new vx8(28), 1));
                            break;
                        } catch (RuntimeException e4) {
                            i8b.W("Ignoring malformed Bundle for Rating", e4);
                            break;
                        }
                    }
                case 3051:
                    s(wp8.l(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    break;
                case 3052:
                    F(wp8.l(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    break;
                case 3053:
                    I(wp8.l(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    break;
                case 3054:
                    c67 l10 = wp8.l(parcel.readStrongBinder());
                    int readInt10 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    t0(l10, readInt10, z, parcel.readInt());
                    break;
                case 3055:
                    E0(wp8.l(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) kr7.c(parcel, Bundle.CREATOR));
                    break;
                case 3056:
                    N(wp8.l(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    break;
                case 3057:
                    c67 l11 = wp8.l(parcel.readStrongBinder());
                    int readInt11 = parcel.readInt();
                    Bundle bundle5 = (Bundle) kr7.c(parcel, Bundle.CREATOR);
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    e(l11, readInt11, bundle5, z);
                    break;
                default:
                    switch (i2) {
                        case 4001:
                            c67 l12 = wp8.l(parcel.readStrongBinder());
                            int readInt12 = parcel.readInt();
                            Bundle bundle6 = (Bundle) kr7.c(parcel, Bundle.CREATOR);
                            if (l12 != null) {
                                if (bundle6 != null) {
                                    try {
                                        ds8.a(bundle6);
                                    } catch (RuntimeException e5) {
                                        i8b.W("Ignoring malformed Bundle for LibraryParams", e5);
                                        break;
                                    }
                                }
                                R(l12, readInt12, (yvd) null, 50000, new zy8(new vx8(21), 0));
                                break;
                            }
                            break;
                        case 4002:
                            c67 l13 = wp8.l(parcel.readStrongBinder());
                            int readInt13 = parcel.readInt();
                            String readString2 = parcel.readString();
                            if (l13 != null) {
                                if (!TextUtils.isEmpty(readString2)) {
                                    R(l13, readInt13, (yvd) null, 50004, new zy8(new vx8(12), 0));
                                    break;
                                } else {
                                    i8b.V("getItem(): Ignoring empty mediaId");
                                    break;
                                }
                            }
                            break;
                        case 4003:
                            c67 l14 = wp8.l(parcel.readStrongBinder());
                            int readInt14 = parcel.readInt();
                            String readString3 = parcel.readString();
                            int readInt15 = parcel.readInt();
                            int readInt16 = parcel.readInt();
                            Bundle bundle7 = (Bundle) kr7.c(parcel, Bundle.CREATOR);
                            if (l14 != null) {
                                if (!TextUtils.isEmpty(readString3)) {
                                    if (readInt15 >= 0) {
                                        if (readInt16 >= 1) {
                                            if (bundle7 != null) {
                                                try {
                                                    ds8.a(bundle7);
                                                } catch (RuntimeException e6) {
                                                    i8b.W("Ignoring malformed Bundle for LibraryParams", e6);
                                                    break;
                                                }
                                            }
                                            R(l14, readInt14, (yvd) null, 50003, new zy8(new vx8(4), 0));
                                            break;
                                        } else {
                                            i8b.V("getChildren(): Ignoring pageSize less than 1");
                                            break;
                                        }
                                    } else {
                                        i8b.V("getChildren(): Ignoring negative page");
                                        break;
                                    }
                                } else {
                                    i8b.V("getChildren(): Ignoring empty parentId");
                                    break;
                                }
                            }
                            break;
                        case 4004:
                            c67 l15 = wp8.l(parcel.readStrongBinder());
                            int readInt17 = parcel.readInt();
                            String readString4 = parcel.readString();
                            Bundle bundle8 = (Bundle) kr7.c(parcel, Bundle.CREATOR);
                            if (l15 != null) {
                                if (!TextUtils.isEmpty(readString4)) {
                                    if (bundle8 != null) {
                                        try {
                                            ds8.a(bundle8);
                                        } catch (RuntimeException e7) {
                                            i8b.W("Ignoring malformed Bundle for LibraryParams", e7);
                                            break;
                                        }
                                    }
                                    R(l15, readInt17, (yvd) null, 50005, new zy8(new vx8(26), 0));
                                    break;
                                } else {
                                    i8b.V("search(): Ignoring empty query");
                                    break;
                                }
                            }
                            break;
                        case 4005:
                            c67 l16 = wp8.l(parcel.readStrongBinder());
                            int readInt18 = parcel.readInt();
                            String readString5 = parcel.readString();
                            int readInt19 = parcel.readInt();
                            int readInt20 = parcel.readInt();
                            Bundle bundle9 = (Bundle) kr7.c(parcel, Bundle.CREATOR);
                            if (l16 != null) {
                                if (!TextUtils.isEmpty(readString5)) {
                                    if (readInt19 >= 0) {
                                        if (readInt20 >= 1) {
                                            if (bundle9 != null) {
                                                try {
                                                    ds8.a(bundle9);
                                                } catch (RuntimeException e8) {
                                                    i8b.W("Ignoring malformed Bundle for LibraryParams", e8);
                                                    break;
                                                }
                                            }
                                            R(l16, readInt18, (yvd) null, 50006, new zy8(new vx8(19), 0));
                                            break;
                                        } else {
                                            i8b.V("getSearchResult(): Ignoring pageSize less than 1");
                                            break;
                                        }
                                    } else {
                                        i8b.V("getSearchResult(): Ignoring negative page");
                                        break;
                                    }
                                } else {
                                    i8b.V("getSearchResult(): Ignoring empty query");
                                    break;
                                }
                            }
                            break;
                        case 4006:
                            c67 l17 = wp8.l(parcel.readStrongBinder());
                            int readInt21 = parcel.readInt();
                            String readString6 = parcel.readString();
                            Bundle bundle10 = (Bundle) kr7.c(parcel, Bundle.CREATOR);
                            if (l17 != null) {
                                if (!TextUtils.isEmpty(readString6)) {
                                    if (bundle10 != null) {
                                        try {
                                            ds8.a(bundle10);
                                        } catch (RuntimeException e9) {
                                            i8b.W("Ignoring malformed Bundle for LibraryParams", e9);
                                            break;
                                        }
                                    }
                                    R(l17, readInt21, (yvd) null, 50001, new zy8(new vx8(24), 0));
                                    break;
                                } else {
                                    i8b.V("subscribe(): Ignoring empty parentId");
                                    break;
                                }
                            }
                            break;
                        case 4007:
                            c67 l18 = wp8.l(parcel.readStrongBinder());
                            int readInt22 = parcel.readInt();
                            String readString7 = parcel.readString();
                            if (l18 != null) {
                                if (!TextUtils.isEmpty(readString7)) {
                                    R(l18, readInt22, (yvd) null, 50002, new zy8(new vx8(3), 0));
                                    break;
                                } else {
                                    i8b.V("unsubscribe(): Ignoring empty parentId");
                                    break;
                                }
                            }
                            break;
                        default:
                            return super.onTransact(i2, parcel, parcel2, i3);
                    }
            }
            return true;
        }
        parcel2.writeString("androidx.media3.session.IMediaSession");
        return true;
    }

    public final void p(c67 c67, int i2) {
        cx8 k;
        if (c67 != null && (k = this.e.k(c67.asBinder())) != null) {
            M0(k, i2, 1, O0(new g18(16, this, k)));
        }
    }

    public final void q0(c67 c67, int i2, Bundle bundle, Bundle bundle2) {
        if (c67 != null && bundle != null && bundle2 != null) {
            try {
                yvd a = yvd.a(bundle);
                R(c67, i2, a, 0, new zy8(new vx8(9, a, bundle2), 1));
            } catch (RuntimeException e2) {
                i8b.W("Ignoring malformed Bundle for SessionCommand", e2);
            }
        }
    }

    public final void s(c67 c67, int i2, int i3, int i4) {
        if (c67 != null && i3 >= 0) {
            L0(c67, i2, 33, O0(new fc5(i3, i4, 3)));
        }
    }

    public final void s0(c67 c67, int i2) {
        if (c67 != null) {
            L0(c67, i2, 20, O0(new vx8(25)));
        }
    }

    public final void t0(c67 c67, int i2, boolean z, int i3) {
        if (c67 != null) {
            L0(c67, i2, 34, O0(new hm3(z, i3)));
        }
    }

    public final void v(c67 c67, int i2, IBinder iBinder, int i3, long j) {
        if (c67 != null && iBinder != null) {
            if (i3 == -1 || i3 >= 0) {
                try {
                    tb7 a = gv0.a(iBinder);
                    qb7 o = tb7.o();
                    for (int i4 = 0; i4 < a.size(); i4++) {
                        Bundle bundle = (Bundle) a.get(i4);
                        bundle.getClass();
                        o.a(ir8.b(bundle));
                    }
                    L0(c67, i2, 20, new zy8(new g18(17, new rb4((Object) o.j(), i3, j, 5), new vx8(27)), 1));
                } catch (RuntimeException e2) {
                    i8b.W("Ignoring malformed Bundle for MediaItem", e2);
                }
            }
        }
    }

    public final void v0(c67 c67, int i2, Bundle bundle) {
        if (c67 != null && bundle != null) {
            try {
                L0(c67, i2, 19, O0(new dc5(us8.b(bundle), 2)));
            } catch (RuntimeException e2) {
                i8b.W("Ignoring malformed Bundle for MediaMetadata", e2);
            }
        }
    }

    public final void w(c67 c67, int i2) {
        if (c67 != null) {
            L0(c67, i2, 8, O0(new vx8(6)));
        }
    }

    public final void w0(c67 c67, int i2) {
        cx8 k;
        if (c67 != null && (k = this.e.k(c67.asBinder())) != null) {
            M0(k, i2, 7, O0(new vx8(10)));
        }
    }

    public final void x(c67 c67, int i2, float f2) {
        if (c67 != null && f2 > c44.DEFAULT_ASPECT_RATIO) {
            L0(c67, i2, 13, O0(new zb5(f2, 3)));
        }
    }

    public final void x0(c67 c67, int i2, boolean z) {
        if (c67 != null) {
            L0(c67, i2, 26, O0(new vz0(z, 8)));
        }
    }

    public final void y(c67 c67, int i2, float f2) {
        if (c67 != null && f2 >= c44.DEFAULT_ASPECT_RATIO && f2 <= 1.0f) {
            L0(c67, i2, 24, O0(new zb5(f2, 4)));
        }
    }

    public final void y0(c67 c67, int i2) {
        cx8 k;
        if (c67 != null && (k = this.e.k(c67.asBinder())) != null) {
            M0(k, i2, 3, O0(new vx8(20)));
        }
    }

    public final void z(c67 c67, int i2) {
        if (c67 != null) {
            L0(c67, i2, 26, O0(new vx8(7)));
        }
    }
}
