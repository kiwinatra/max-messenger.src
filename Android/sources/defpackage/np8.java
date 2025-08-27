package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: np8  reason: default package */
public class np8 implements po8 {
    public npb A;
    public final qo8 a;
    public final bs6 b;
    public final wp8 c;
    public final Context d;
    public final oxd e;
    public final Bundle f;
    public final fp8 g;
    public final m56 h;
    public final ox0 i;
    public final ws j;
    public oxd k;
    public mp8 l;
    public boolean m;
    public ppb n = ppb.F;
    public tb7 o;
    public k0d p;
    public zvd q = zvd.b;
    public pob r;
    public pob s;
    public pob t;
    public Surface u;
    public ode v = ode.c;
    public i67 w;
    public long x;
    public long y;
    public ppb z;

    public np8(Context context, qo8 qo8, oxd oxd, Bundle bundle, Looper looper) {
        k0d k0d = k0d.v;
        this.o = k0d;
        this.p = k0d;
        pob pob = pob.b;
        this.r = pob;
        this.s = pob;
        this.t = I0(pob, pob);
        this.h = new m56(looper, c7f.a, (k08) new ap8(this, 6));
        this.a = qo8;
        n79.k(context, "context must not be null");
        n79.k(oxd, "token must not be null");
        this.d = context;
        this.b = new bs6();
        this.c = new wp8(this);
        this.j = new ws(0);
        this.e = oxd;
        this.f = bundle;
        this.g = new fp8(this);
        Bundle bundle2 = Bundle.EMPTY;
        this.l = oxd.a.getType() == 0 ? null : new mp8(this, bundle);
        this.i = new ox0(this, looper);
        this.x = -9223372036854775807L;
        this.y = -9223372036854775807L;
    }

    public static pob I0(pob pob, pob pob2) {
        pob A2 = kne.A(pob, pob2);
        if (A2.a(32)) {
            return A2;
        }
        vq5 vq5 = new vq5(1);
        vq5.b(A2.a);
        vq5.a(32);
        return new pob(vq5.e());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [qb7, jb7] */
    /* JADX WARNING: type inference failed for: r3v0, types: [qb7, jb7] */
    public static fkf J0(ArrayList arrayList, ArrayList arrayList2) {
        ? jb7 = new jb7(4);
        jb7.e(arrayList);
        k0d j2 = jb7.j();
        ? jb72 = new jb7(4);
        jb72.e(arrayList2);
        k0d j3 = jb72.j();
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = i2;
        }
        return new fkf(j2, j3, iArr);
    }

    public static int N0(ppb ppb) {
        int i2 = ppb.c.a.b;
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    public static ppb Q0(ppb ppb, int i2, List list, long j2, long j3) {
        int i3;
        int i4;
        ppb ppb2 = ppb;
        int i5 = i2;
        jkf jkf = ppb2.j;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i6 = 0; i6 < jkf.p(); i6++) {
            arrayList.add(jkf.n(i6, new hkf(), 0));
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            hkf hkf = r9;
            hkf hkf2 = new hkf();
            hkf.b(0, (ir8) list.get(i7), (Object) null, 0, 0, 0, true, false, (wq8) null, 0, -9223372036854775807L, -1, -1, 0);
            arrayList.add(i7 + i5, hkf2);
        }
        List list2 = list;
        X0(jkf, arrayList, arrayList2);
        fkf J0 = J0(arrayList, arrayList2);
        if (ppb2.j.q()) {
            i4 = 0;
            i3 = 0;
        } else {
            qwd qwd = ppb2.c;
            i3 = qwd.a.b;
            if (i3 >= i5) {
                i3 += list.size();
            }
            i4 = qwd.a.e;
            if (i4 >= i5) {
                i4 += list.size();
            }
        }
        return S0(ppb, J0, i3, i4, j2, j3, 5);
    }

    public static ppb R0(ppb ppb, int i2, int i3, boolean z2, long j2, long j3) {
        int i4;
        int i5;
        ppb ppb2;
        boolean z3;
        ppb ppb3 = ppb;
        int i6 = i2;
        int i7 = i3;
        jkf jkf = ppb3.j;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i8 = 0;
        for (int i9 = 0; i9 < jkf.p(); i9++) {
            if (i9 < i6 || i9 >= i7) {
                arrayList.add(jkf.n(i9, new hkf(), 0));
            }
        }
        X0(jkf, arrayList, arrayList2);
        fkf J0 = J0(arrayList, arrayList2);
        int N0 = N0(ppb);
        int i10 = ppb3.c.a.e;
        hkf hkf = new hkf();
        boolean z4 = N0 >= i6 && N0 < i7;
        if (J0.q()) {
            i4 = 0;
            i5 = -1;
        } else if (z4) {
            int p2 = jkf.p();
            i5 = N0;
            while (true) {
                z3 = ppb3.i;
                if (i8 < p2 && (i5 = jkf.e(i5, ppb3.h, z3)) != -1) {
                    if (i5 < i6 || i5 >= i7) {
                        break;
                    }
                    i8++;
                } else {
                    i5 = -1;
                }
            }
            if (i5 == -1) {
                i5 = J0.a(z3);
            } else if (i5 >= i7) {
                i5 -= i7 - i6;
            }
            J0.n(i5, hkf, 0);
            i4 = hkf.n;
        } else if (N0 >= i7) {
            int i11 = N0 - (i7 - i6);
            if (i10 != -1) {
                for (int i12 = i6; i12 < i7; i12++) {
                    hkf hkf2 = new hkf();
                    jkf.o(i12, hkf2);
                    i10 -= (hkf2.o - hkf2.n) + 1;
                }
            }
            i4 = i10;
            i5 = i11;
        } else {
            i4 = i10;
            i5 = N0;
        }
        if (!z4) {
            ppb2 = S0(ppb, J0, i5, i4, j2, j3, 4);
        } else if (i5 == -1) {
            ppb2 = T0(ppb3, J0, qwd.k, qwd.l, 4);
        } else if (z2) {
            ppb2 = S0(ppb, J0, i5, i4, j2, j3, 4);
        } else {
            hkf hkf3 = new hkf();
            J0.n(i5, hkf3, 0);
            long h0 = v0g.h0(hkf3.l);
            long h02 = v0g.h0(hkf3.m);
            uob uob = r16;
            uob uob2 = new uob((Object) null, i5, hkf3.c, (Object) null, i4, h0, h0, -1, -1);
            ppb2 = T0(ppb3, J0, uob2, new qwd(uob, false, SystemClock.elapsedRealtime(), h02, h0, kne.h(h0, h02), 0, -9223372036854775807L, h02, h0), 4);
        }
        int i13 = ppb2.y;
        return (i13 == 1 || i13 == 4 || i6 >= i7 || i7 != jkf.p() || N0 < i6) ? ppb2 : ppb2.f(4, (PlaybackException) null);
    }

    public static ppb S0(ppb ppb, fkf fkf, int i2, int i3, long j2, long j3, int i4) {
        ppb ppb2 = ppb;
        fkf fkf2 = fkf;
        hkf hkf = new hkf();
        fkf2.n(i2, hkf, 0);
        ir8 ir8 = hkf.c;
        uob uob = ppb2.c.a;
        uob uob2 = new uob((Object) null, i2, ir8, (Object) null, i3, j2, j3, uob.h, uob.i);
        qwd qwd = ppb2.c;
        qwd qwd2 = r2;
        uob uob3 = uob2;
        qwd qwd3 = new qwd(uob3, qwd.b, SystemClock.elapsedRealtime(), qwd.d, qwd.e, qwd.f, qwd.g, qwd.h, qwd.i, qwd.j);
        return T0(ppb2, fkf2, uob3, qwd2, i4);
    }

    public static ppb T0(ppb ppb, jkf jkf, uob uob, qwd qwd, int i2) {
        ppb ppb2 = ppb;
        PlaybackException playbackException = ppb2.a;
        uob uob2 = ppb2.c.a;
        n79.n(jkf.q() || qwd.a.b < jkf.p());
        return new ppb(playbackException, ppb2.b, qwd, uob2, uob, i2, ppb2.g, ppb2.h, ppb2.i, ppb2.l, jkf, ppb2.k, ppb2.m, ppb2.n, ppb2.o, ppb2.p, ppb2.q, ppb2.r, ppb2.s, ppb2.t, ppb2.u, ppb2.x, ppb2.y, ppb2.v, ppb2.w, ppb2.z, ppb2.A, ppb2.B, ppb2.C, ppb2.D, ppb2.E);
    }

    public static void X0(jkf jkf, ArrayList arrayList, ArrayList arrayList2) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            hkf hkf = (hkf) arrayList.get(i2);
            int i3 = hkf.n;
            int i4 = hkf.o;
            if (i3 == -1 || i4 == -1) {
                hkf.n = arrayList2.size();
                hkf.o = arrayList2.size();
                ekf ekf = new ekf();
                ekf.j((Object) null, (Object) null, i2, -9223372036854775807L, 0, q9.g, true);
                arrayList2.add(ekf);
            } else {
                hkf.n = arrayList2.size();
                hkf.o = (i4 - i3) + arrayList2.size();
                while (i3 <= i4) {
                    ekf ekf2 = new ekf();
                    jkf.g(i3, ekf2, false);
                    ekf2.c = i2;
                    arrayList2.add(ekf2);
                    i3++;
                }
            }
        }
    }

    public final void A() {
        if (P0(4)) {
            L0(new ap8(this, 2));
            a1(N0(this.n), -9223372036854775807L);
        }
    }

    public final long A0() {
        return this.n.A;
    }

    public final i30 B() {
        return this.n.o;
    }

    public final zvd B0() {
        return this.q;
    }

    public final void C(int i2, boolean z2) {
        if (P0(34)) {
            L0(new jb4(this, z2, i2));
            ppb ppb = this.n;
            if (ppb.s != z2) {
                this.n = ppb.c(ppb.r, z2);
                ep8 ep8 = new ep8(this, z2, 0);
                m56 m56 = this.h;
                m56.j(30, ep8);
                m56.h();
            }
        }
    }

    public final int C0() {
        if (this.n.j.q()) {
            return -1;
        }
        ppb ppb = this.n;
        jkf jkf = ppb.j;
        int N0 = N0(ppb);
        ppb ppb2 = this.n;
        int i2 = ppb2.h;
        if (i2 == 1) {
            i2 = 0;
        }
        return jkf.l(N0, i2, ppb2.i);
    }

    public final in4 D() {
        return this.n.q;
    }

    public final zz7 D0(yvd yvd, Bundle bundle) {
        i67 i67;
        u00 u00 = new u00((Object) this, (Object) yvd, (Object) bundle, 15);
        n79.g(yvd.a == 0);
        zvd zvd = this.q;
        zvd.getClass();
        if (!zvd.a.contains(yvd)) {
            i8b.V("Controller isn't allowed to call custom session command:" + yvd.b);
            i67 = null;
        } else {
            i67 = this.w;
        }
        return K0(i67, u00, false);
    }

    public final void E() {
        if (P0(26)) {
            L0(new ap8(this, 15));
            ppb ppb = this.n;
            int i2 = ppb.r - 1;
            if (i2 >= ppb.q.b) {
                this.n = ppb.c(i2, ppb.s);
                zo8 zo8 = new zo8(this, i2, 9);
                m56 m56 = this.h;
                m56.j(30, zo8);
                m56.h();
            }
        }
    }

    public final int E0() {
        if (this.n.j.q()) {
            return -1;
        }
        ppb ppb = this.n;
        jkf jkf = ppb.j;
        int N0 = N0(ppb);
        ppb ppb2 = this.n;
        int i2 = ppb2.h;
        if (i2 == 1) {
            i2 = 0;
        }
        return jkf.e(N0, i2, ppb2.i);
    }

    public final void F(int i2, int i3) {
        if (P0(33)) {
            L0(new bp8(this, i2, i3, 1));
            ppb ppb = this.n;
            in4 in4 = ppb.q;
            if (ppb.r != i2 && in4.b <= i2) {
                int i4 = in4.c;
                if (i4 == 0 || i2 <= i4) {
                    this.n = ppb.c(i2, ppb.s);
                    zo8 zo8 = new zo8(this, i2, 1);
                    m56 m56 = this.h;
                    m56.j(30, zo8);
                    m56.h();
                }
            }
        }
    }

    public final void F0(ir8 ir8) {
        if (P0(31)) {
            L0(new g18(4, this, ir8));
            d1(Collections.singletonList(ir8), -1, -9223372036854775807L, true);
        }
    }

    public final boolean G() {
        return C0() != -1;
    }

    public final tb7 G0() {
        return this.p;
    }

    public final void H(int i2) {
        if (P0(34)) {
            L0(new zo8(this, i2, 4));
            ppb ppb = this.n;
            int i3 = ppb.r + 1;
            int i4 = ppb.q.c;
            if (i4 == 0 || i3 <= i4) {
                this.n = ppb.c(i3, ppb.s);
                zo8 zo8 = new zo8(this, i3, 5);
                m56 m56 = this.h;
                m56.j(30, zo8);
                m56.h();
            }
        }
    }

    public final void H0(int i2, List list) {
        if (!list.isEmpty()) {
            if (this.n.j.q()) {
                d1(list, -1, -9223372036854775807L, false);
            } else {
                f1(Q0(this.n, Math.min(i2, this.n.j.p()), list, h(), R()), 0, (Integer) null, (Integer) null, this.n.j.q() ? 3 : null);
            }
        }
    }

    public final int I() {
        return this.n.c.a.i;
    }

    public final void J(kqf kqf) {
        if (P0(29)) {
            L0(new g18(6, this, kqf));
            ppb ppb = this.n;
            if (kqf != ppb.E) {
                this.n = ppb.o(kqf);
                ic5 ic5 = new ic5(kqf, 1);
                m56 m56 = this.h;
                m56.j(19, ic5);
                m56.h();
            }
        }
    }

    public final void K(int i2) {
        if (P0(20)) {
            n79.g(i2 >= 0);
            L0(new zo8(this, i2, 2));
            Y0(i2, i2 + 1);
        }
    }

    public final zz7 K0(i67 i67, lp8 lp8, boolean z2) {
        int g2;
        rsd rsd;
        if (i67 == null) {
            return o5a.F(new swd(-4));
        }
        bs6 bs6 = this.b;
        swd swd = new swd(1);
        synchronized (bs6.o) {
            try {
                g2 = bs6.g();
                rsd = new rsd(g2, swd);
                if (bs6.b) {
                    rsd.n();
                } else {
                    ((ts) bs6.v).put(Integer.valueOf(g2), rsd);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (z2) {
            this.j.add(Integer.valueOf(g2));
        }
        try {
            lp8.d(i67, g2);
        } catch (RemoteException e2) {
            i8b.W("Cannot connect to the service or the session is gone", e2);
            this.j.remove(Integer.valueOf(g2));
            this.b.p(g2, new swd(-100));
        }
        return rsd;
    }

    public final void L(int i2, int i3) {
        if (P0(20)) {
            n79.g(i2 >= 0 && i3 >= i2);
            L0(new bp8(this, i2, i3, 0));
            Y0(i2, i3);
        }
    }

    public final void L0(lp8 lp8) {
        ox0 ox0 = this.i;
        if (((np8) ox0.b).w != null) {
            Handler handler = (Handler) ox0.c;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessage(1);
            }
        }
        K0(this.w, lp8, true);
    }

    public final void M() {
        if (P0(7)) {
            L0(new ap8(this, 4));
            jkf jkf = this.n.j;
            if (!jkf.q() && !k()) {
                boolean G = G();
                hkf n2 = jkf.n(N0(this.n), new hkf(), 0);
                if (!n2.i || !n2.a()) {
                    if (!G || h() > this.n.C) {
                        a1(N0(this.n), 0);
                    } else {
                        a1(C0(), -9223372036854775807L);
                    }
                } else if (G) {
                    a1(C0(), -9223372036854775807L);
                }
            }
        }
    }

    public final void M0(lp8 lp8) {
        ox0 ox0 = this.i;
        if (((np8) ox0.b).w != null) {
            Handler handler = (Handler) ox0.c;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessage(1);
            }
        }
        zz7 K0 = K0(this.w, lp8, true);
        try {
            ft7.v(K0);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2);
        } catch (TimeoutException e3) {
            if (K0 instanceof rsd) {
                int i2 = ((rsd) K0).y;
                this.j.remove(Integer.valueOf(i2));
                this.b.p(i2, new swd(-1));
            }
            i8b.W("Synchronous command takes too long on the session side.", e3);
        }
    }

    public final PlaybackException N() {
        return this.n.a;
    }

    public final void O(boolean z2) {
        if (P0(1)) {
            L0(new ep8(this, z2, 4));
            e1(z2);
        } else if (z2) {
            i8b.V("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        }
    }

    public final p01 O0(jkf jkf, int i2, long j2) {
        int i3;
        if (jkf.q()) {
            return null;
        }
        hkf hkf = new hkf();
        ekf ekf = new ekf();
        if (i2 == -1 || i2 >= jkf.p()) {
            i2 = jkf.a(this.n.i);
            j2 = v0g.h0(jkf.n(i2, hkf, 0).l);
        }
        long S = v0g.S(j2);
        n79.i(i2, jkf.p());
        jkf.o(i2, hkf);
        if (S == -9223372036854775807L) {
            S = hkf.l;
            if (S == -9223372036854775807L) {
                return null;
            }
        }
        int i4 = hkf.n;
        jkf.g(i4, ekf, false);
        do {
            i3 = i4;
            if (i3 >= hkf.o || ekf.e == S) {
                jkf.g(i3, ekf, false);
            } else {
                i4 = i3 + 1;
            }
        } while (jkf.g(i4, ekf, false).e <= S);
        jkf.g(i3, ekf, false);
        return new p01(S - ekf.e, i3, 6, false);
    }

    public final void P(int i2) {
        if (P0(10)) {
            n79.g(i2 >= 0);
            L0(new zo8(this, i2, 0));
            a1(i2, -9223372036854775807L);
        }
    }

    public final boolean P0(int i2) {
        if (this.t.a(i2)) {
            return true;
        }
        i2a.m(i2, "Controller isn't allowed to call command= ");
        return false;
    }

    public final long Q() {
        return this.n.B;
    }

    public final long R() {
        qwd qwd = this.n.c;
        return !qwd.b ? h() : qwd.a.g;
    }

    public final void S(int i2, List list) {
        if (P0(20)) {
            n79.g(i2 >= 0);
            L0(new oj0((Object) this, i2, (Object) list, 7));
            H0(i2, list);
        }
    }

    public final long T() {
        return this.n.c.e;
    }

    public final void U() {
        if (P0(8)) {
            L0(new ap8(this, 14));
            if (E0() != -1) {
                a1(E0(), -9223372036854775807L);
            }
        }
    }

    public final void U0(int i2, int i3) {
        ode ode = this.v;
        if (ode.a != i2 || ode.b != i3) {
            this.v = new ode(i2, i3);
            this.h.m(24, new fc5(i2, i3, 2));
        }
    }

    public final void V(int i2) {
        if (P0(34)) {
            L0(new zo8(this, i2, 10));
            ppb ppb = this.n;
            int i3 = ppb.r - 1;
            if (i3 >= ppb.q.b) {
                this.n = ppb.c(i3, ppb.s);
                zo8 zo8 = new zo8(this, i3, 11);
                m56 m56 = this.h;
                m56.j(30, zo8);
                m56.h();
            }
        }
    }

    public final void V0(int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i2;
        jkf jkf = this.n.j;
        int p2 = jkf.p();
        int min = Math.min(i3, p2);
        int i8 = min - i7;
        int min2 = Math.min(i4, p2 - i8);
        if (i7 < p2 && i7 != min && i7 != min2) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i9 = 0; i9 < p2; i9++) {
                arrayList.add(jkf.n(i9, new hkf(), 0));
            }
            v0g.R(arrayList, i7, min, min2);
            X0(jkf, arrayList, arrayList2);
            fkf J0 = J0(arrayList, arrayList2);
            if (!J0.q()) {
                int N0 = N0(this.n);
                if (N0 >= i7 && N0 < min) {
                    i6 = (N0 - i7) + min2;
                } else if (min > N0 || min2 <= N0) {
                    i5 = (min <= N0 || min2 > N0) ? N0 : i8 + N0;
                    hkf hkf = new hkf();
                    J0.n(i5, hkf, 0);
                    f1(S0(this.n, J0, i5, hkf.n + (this.n.c.a.e - jkf.n(N0, hkf, 0).n), h(), R(), 5), 0, (Integer) null, (Integer) null, (Integer) null);
                } else {
                    i6 = N0 - i8;
                }
                i5 = i6;
                hkf hkf2 = new hkf();
                J0.n(i5, hkf2, 0);
                f1(S0(this.n, J0, i5, hkf2.n + (this.n.c.a.e - jkf.n(N0, hkf2, 0).n), h(), R(), 5), 0, (Integer) null, (Integer) null, (Integer) null);
            }
        }
    }

    public final qqf W() {
        return this.n.D;
    }

    public final void W0(ppb ppb, ppb ppb2, Integer num, Integer num2, Integer num3, Integer num4) {
        m56 m56 = this.h;
        if (num != null) {
            m56.j(0, new hp8(ppb2, num, 0));
        }
        if (num3 != null) {
            m56.j(11, new hp8(ppb2, num3, 1));
        }
        ir8 s2 = ppb2.s();
        if (num4 != null) {
            m56.j(1, new g18(8, s2, num4));
        }
        PlaybackException playbackException = ppb.a;
        PlaybackException playbackException2 = ppb2.a;
        if (playbackException != playbackException2 && (playbackException == null || !playbackException.a(playbackException2))) {
            m56.j(10, new jp8(0, playbackException2));
            if (playbackException2 != null) {
                m56.j(10, new jp8(1, playbackException2));
            }
        }
        if (!ppb.D.equals(ppb2.D)) {
            m56.j(2, new ip8(ppb2, 17));
        }
        if (!ppb.z.equals(ppb2.z)) {
            m56.j(14, new ip8(ppb2, 18));
        }
        if (ppb.w != ppb2.w) {
            m56.j(3, new ip8(ppb2, 19));
        }
        if (ppb.y != ppb2.y) {
            m56.j(4, new ip8(ppb2, 20));
        }
        if (num2 != null) {
            m56.j(5, new hp8(ppb2, num2, 2));
        }
        if (ppb.x != ppb2.x) {
            m56.j(6, new ip8(ppb2, 0));
        }
        if (ppb.v != ppb2.v) {
            m56.j(7, new ip8(ppb2, 1));
        }
        if (!ppb.g.equals(ppb2.g)) {
            m56.j(12, new ip8(ppb2, 2));
        }
        if (ppb.h != ppb2.h) {
            m56.j(8, new ip8(ppb2, 3));
        }
        if (ppb.i != ppb2.i) {
            m56.j(9, new ip8(ppb2, 4));
        }
        if (!ppb.m.equals(ppb2.m)) {
            m56.j(15, new ip8(ppb2, 5));
        }
        if (ppb.n != ppb2.n) {
            m56.j(22, new ip8(ppb2, 6));
        }
        if (!ppb.o.equals(ppb2.o)) {
            m56.j(20, new ip8(ppb2, 7));
        }
        if (!ppb.p.a.equals(ppb2.p.a)) {
            m56.j(27, new ip8(ppb2, 8));
            m56.j(27, new ip8(ppb2, 9));
        }
        if (!ppb.q.equals(ppb2.q)) {
            m56.j(29, new ip8(ppb2, 10));
        }
        if (!(ppb.r == ppb2.r && ppb.s == ppb2.s)) {
            m56.j(30, new ip8(ppb2, 11));
        }
        if (!ppb.l.equals(ppb2.l)) {
            m56.j(25, new ip8(ppb2, 12));
        }
        if (ppb.A != ppb2.A) {
            m56.j(16, new ip8(ppb2, 13));
        }
        if (ppb.B != ppb2.B) {
            m56.j(17, new ip8(ppb2, 14));
        }
        if (ppb.C != ppb2.C) {
            m56.j(18, new ip8(ppb2, 15));
        }
        if (!ppb.E.equals(ppb2.E)) {
            m56.j(19, new ip8(ppb2, 16));
        }
        m56.h();
    }

    public final boolean X() {
        return E0() != -1;
    }

    public final us8 Y() {
        return this.n.m;
    }

    public final void Y0(int i2, int i3) {
        int i4 = i2;
        int p2 = this.n.j.p();
        int min = Math.min(i3, p2);
        if (i4 < p2 && i4 != min && p2 != 0) {
            boolean z2 = true;
            boolean z3 = N0(this.n) >= i4 && N0(this.n) < min;
            ppb R0 = R0(this.n, i2, min, false, h(), R());
            int i5 = this.n.c.a.b;
            if (i5 < i4 || i5 >= min) {
                z2 = false;
            }
            int i6 = null;
            int i7 = z3 ? 4 : null;
            if (z2) {
                i6 = 3;
            }
            f1(R0, 0, (Integer) null, i7, i6);
        }
    }

    public final o44 Z() {
        return this.n.p;
    }

    public final void Z0(List list, int i2, int i3) {
        int p2 = this.n.j.p();
        if (i2 <= p2) {
            if (this.n.j.q()) {
                d1(list, -1, -9223372036854775807L, false);
                return;
            }
            int min = Math.min(i3, p2);
            int i4 = min;
            ppb R0 = R0(Q0(this.n, i4, list, h(), R()), i2, i4, true, h(), R());
            int i5 = this.n.c.a.b;
            boolean z2 = i5 >= i2 && i5 < min;
            f1(R0, (Integer) null, (Integer) null, z2 ? 4 : null, z2 ? 3 : null);
        }
    }

    public final boolean a() {
        return this.n.v;
    }

    public final void a0(i30 i30, boolean z2) {
        if (P0(35)) {
            L0(new ij5(this, i30, z2, 2));
            if (!this.n.o.equals(i30)) {
                this.n = this.n.a(i30);
                hc5 hc5 = new hc5(i30, 1);
                m56 m56 = this.h;
                m56.j(20, hc5);
                m56.h();
            }
        }
    }

    public final void a1(int i2, long j2) {
        int i3;
        int i4;
        ppb ppb;
        ppb j3;
        int i5 = i2;
        long j4 = j2;
        jkf jkf = this.n.j;
        if ((jkf.q() || i5 < jkf.p()) && !k()) {
            ppb ppb2 = this.n;
            ppb f2 = ppb2.f(ppb2.y == 1 ? 1 : 2, ppb2.a);
            p01 O0 = O0(jkf, i5, j4);
            if (O0 == null) {
                int i6 = (j4 > -9223372036854775807L ? 1 : (j4 == -9223372036854775807L ? 0 : -1));
                int i7 = i2;
                int i8 = i2;
                uob uob = r1;
                i3 = 1;
                uob uob2 = new uob((Object) null, i7, (ir8) null, (Object) null, i8, i6 == 0 ? 0 : j4, i6 == 0 ? 0 : j4, -1, -1);
                ppb ppb3 = this.n;
                jkf jkf2 = ppb3.j;
                boolean z2 = this.n.c.b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                qwd qwd = this.n.c;
                ppb = T0(ppb3, jkf2, uob, new qwd(uob, z2, elapsedRealtime, qwd.d, i6 == 0 ? 0 : j4, 0, 0, qwd.h, qwd.i, i6 == 0 ? 0 : j4), 1);
                i4 = 0;
            } else {
                i3 = 1;
                qwd qwd2 = f2.c;
                int i9 = qwd2.a.e;
                ekf ekf = new ekf();
                jkf.g(i9, ekf, false);
                ekf ekf2 = new ekf();
                int i10 = O0.b;
                jkf.g(i10, ekf2, false);
                boolean z3 = i9 != i10;
                long S = v0g.S(h()) - ekf.e;
                long j5 = O0.c;
                if (z3 || j5 != S) {
                    uob uob3 = qwd2.a;
                    n79.n(uob3.h == -1);
                    boolean z4 = z3;
                    long j6 = j5;
                    uob uob4 = new uob((Object) null, ekf.c, uob3.c, (Object) null, i9, v0g.h0(ekf.e + S), v0g.h0(ekf.e + S), -1, -1);
                    i4 = 0;
                    jkf.g(i10, ekf2, false);
                    hkf hkf = new hkf();
                    jkf.o(ekf2.c, hkf);
                    uob uob5 = new uob((Object) null, ekf2.c, hkf.c, (Object) null, i10, v0g.h0(ekf2.e + j6), v0g.h0(ekf2.e + j6), -1, -1);
                    ppb h2 = f2.h(uob4, uob5, 1);
                    if (z4 || j6 < S) {
                        j3 = h2.j(new qwd(uob5, false, SystemClock.elapsedRealtime(), v0g.h0(hkf.m), v0g.h0(ekf2.e + j6), kne.h(v0g.h0(ekf2.e + j6), v0g.h0(hkf.m)), 0, -9223372036854775807L, -9223372036854775807L, v0g.h0(ekf2.e + j6)));
                    } else {
                        long max = Math.max(0, v0g.S(h2.c.g) - (j6 - S));
                        long j7 = j6 + max;
                        j3 = h2.j(new qwd(uob5, false, SystemClock.elapsedRealtime(), v0g.h0(hkf.m), v0g.h0(j7), kne.h(v0g.h0(j7), v0g.h0(hkf.m)), v0g.h0(max), -9223372036854775807L, -9223372036854775807L, v0g.h0(j7)));
                    }
                    f2 = j3;
                } else {
                    i4 = 0;
                }
                ppb = f2;
            }
            boolean q2 = this.n.j.q();
            qwd qwd3 = ppb.c;
            int i11 = (q2 || qwd3.a.b == this.n.c.a.b) ? i4 : i3;
            if (i11 != 0 || qwd3.a.f != this.n.c.a.f) {
                f1(ppb, (Integer) null, (Integer) null, Integer.valueOf(i3), i11 != 0 ? 2 : null);
            }
        }
    }

    public final float b() {
        return this.n.n;
    }

    public final void b0(us8 us8) {
        if (P0(19)) {
            L0(new g18(3, this, us8));
            if (!this.n.m.equals(us8)) {
                this.n = this.n.g(us8);
                dc5 dc5 = new dc5(us8, 1);
                m56 m56 = this.h;
                m56.j(15, dc5);
                m56.h();
            }
        }
    }

    public final void b1(long j2) {
        long h2 = h() + j2;
        long e2 = e();
        if (e2 != -9223372036854775807L) {
            h2 = Math.min(h2, e2);
        }
        a1(N0(this.n), Math.max(h2, 0));
    }

    public final gob c() {
        return this.n.g;
    }

    public final int c0() {
        return this.n.c.a.h;
    }

    public final void c1(int i2, ya7 ya7) {
        ya7.d(new kh1((Object) this, (Object) ya7, i2, 13), dp4.a);
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [g67, java.lang.Object] */
    public final void connect() {
        i67 i67;
        oxd oxd = this.e;
        int type = oxd.a.getType();
        nxd nxd = oxd.a;
        Context context = this.d;
        Bundle bundle = this.f;
        if (type == 0) {
            this.l = null;
            Object c2 = nxd.c();
            n79.o(c2);
            IBinder iBinder = (IBinder) c2;
            int i2 = hz8.i;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof i67)) {
                ? obj = new Object();
                obj.c = iBinder;
                i67 = obj;
            } else {
                i67 = (i67) queryLocalInterface;
            }
            try {
                i67.i0(this.c, this.b.g(), new ai3(context.getPackageName(), Process.myPid(), bundle).b());
            } catch (RemoteException e2) {
                i8b.W("Failed to call connection request.", e2);
            }
        } else {
            this.l = new mp8(this, bundle);
            int i3 = v0g.a >= 29 ? 4097 : 1;
            Intent intent = new Intent("androidx.media3.session.MediaSessionService");
            intent.setClassName(nxd.getPackageName(), nxd.d());
            if (!context.bindService(intent, this.l, i3)) {
                i8b.V("bind to " + oxd + " failed");
                qo8 qo8 = this.a;
                Objects.requireNonNull(qo8);
                qo8.H0(new y86(24, (Object) qo8));
            }
        }
    }

    public final boolean d() {
        return this.n.w;
    }

    public final int d0() {
        return N0(this.n);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d1(java.util.List r66, int r67, long r68, boolean r70) {
        /*
            r65 = this;
            r0 = r65
            r1 = r66
            r2 = r67
            r3 = 1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            java.lang.Integer r28 = java.lang.Integer.valueOf(r6)
            r9 = r6
        L_0x0017:
            int r7 = r66.size()
            if (r9 >= r7) goto L_0x0073
            java.lang.Object r7 = r1.get(r9)
            r24 = r7
            ir8 r24 = (defpackage.ir8) r24
            dc7 r7 = defpackage.ft7.a
            hkf r8 = new hkf
            r7 = r8
            r8.<init>()
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r26 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 1
            r18 = 0
            r19 = 0
            r20 = 0
            r6 = r8
            r8 = r28
            r30 = r9
            r9 = r24
            r24 = r30
            r25 = r30
            r7.b(r8, r9, r10, r11, r13, r15, r17, r18, r19, r20, r22, r24, r25, r26)
            r4.add(r6)
            ekf r6 = new ekf
            r6.<init>()
            q9 r15 = defpackage.q9.g
            r9 = 0
            r16 = 1
            r8 = 0
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = 0
            r7 = r6
            r10 = r30
            r7.j(r8, r9, r10, r11, r13, r15, r16)
            r5.add(r6)
            int r9 = r30 + 1
            r6 = 0
            goto L_0x0017
        L_0x0073:
            fkf r4 = J0(r4, r5)
            boolean r5 = r4.q()
            tb7 r6 = r4.e
            if (r5 != 0) goto L_0x008c
            int r5 = r6.size()
            if (r2 >= r5) goto L_0x0086
            goto L_0x008c
        L_0x0086:
            androidx.media3.common.IllegalSeekPositionException r0 = new androidx.media3.common.IllegalSeekPositionException
            r0.<init>()
            throw r0
        L_0x008c:
            r5 = -1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r70 == 0) goto L_0x009f
            ppb r2 = r0.n
            boolean r2 = r2.i
            int r2 = r4.a(r2)
            r10 = r7
        L_0x009d:
            r6 = 0
            goto L_0x00c7
        L_0x009f:
            if (r2 != r5) goto L_0x00c4
            ppb r2 = r0.n
            qwd r2 = r2.c
            uob r2 = r2.a
            int r9 = r2.b
            boolean r10 = r4.q()
            if (r10 != 0) goto L_0x00c0
            int r6 = r6.size()
            if (r9 < r6) goto L_0x00c0
            ppb r2 = r0.n
            boolean r2 = r2.i
            int r2 = r4.a(r2)
            r6 = r3
            r10 = r7
            goto L_0x00c7
        L_0x00c0:
            long r10 = r2.f
            r2 = r9
            goto L_0x009d
        L_0x00c4:
            r10 = r68
            goto L_0x009d
        L_0x00c7:
            p01 r9 = r0.O0(r4, r2, r10)
            if (r9 != 0) goto L_0x0121
            uob r1 = new uob
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            r8 = 0
            if (r7 != 0) goto L_0x00d8
            r18 = r8
            goto L_0x00da
        L_0x00d8:
            r18 = r10
        L_0x00da:
            if (r7 != 0) goto L_0x00df
            r20 = r8
            goto L_0x00e1
        L_0x00df:
            r20 = r10
        L_0x00e1:
            r15 = 0
            r16 = 0
            r13 = 0
            r22 = -1
            r23 = -1
            r12 = r1
            r14 = r2
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22, r23)
            qwd r12 = new qwd
            long r32 = android.os.SystemClock.elapsedRealtime()
            if (r7 != 0) goto L_0x00fb
            r36 = r8
            goto L_0x00fd
        L_0x00fb:
            r36 = r10
        L_0x00fd:
            if (r7 != 0) goto L_0x0102
            r45 = r8
            goto L_0x0104
        L_0x0102:
            r45 = r10
        L_0x0104:
            r41 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r43 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r31 = 0
            r34 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r38 = 0
            r39 = 0
            r29 = r12
            r30 = r1
            r29.<init>(r30, r31, r32, r34, r36, r38, r39, r41, r43, r45)
            goto L_0x016f
        L_0x0121:
            uob r7 = new uob
            java.lang.Object r1 = r1.get(r2)
            r15 = r1
            ir8 r15 = (defpackage.ir8) r15
            long r10 = r9.c
            long r18 = defpackage.v0g.h0(r10)
            long r20 = defpackage.v0g.h0(r10)
            r16 = 0
            int r1 = r9.b
            r13 = 0
            r22 = -1
            r23 = -1
            r12 = r7
            r14 = r2
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22, r23)
            qwd r12 = new qwd
            long r50 = android.os.SystemClock.elapsedRealtime()
            long r54 = defpackage.v0g.h0(r10)
            long r63 = defpackage.v0g.h0(r10)
            r59 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r61 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r49 = 0
            r52 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r56 = 0
            r57 = 0
            r47 = r12
            r48 = r7
            r47.<init>(r48, r49, r50, r52, r54, r56, r57, r59, r61, r63)
            r1 = r7
        L_0x016f:
            ppb r7 = r0.n
            r8 = 4
            ppb r1 = T0(r7, r4, r1, r12, r8)
            int r7 = r1.y
            if (r2 == r5) goto L_0x0188
            if (r7 == r3) goto L_0x0188
            boolean r2 = r4.q()
            if (r2 != 0) goto L_0x0187
            if (r6 == 0) goto L_0x0185
            goto L_0x0187
        L_0x0185:
            r7 = 2
            goto L_0x0188
        L_0x0187:
            r7 = r8
        L_0x0188:
            ppb r2 = r0.n
            androidx.media3.common.PlaybackException r2 = r2.a
            ppb r1 = r1.f(r7, r2)
            ppb r2 = r0.n
            jkf r2 = r2.j
            boolean r2 = r2.q()
            r3 = 0
            if (r2 != 0) goto L_0x01a0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L_0x01a1
        L_0x01a0:
            r2 = r3
        L_0x01a1:
            ppb r4 = r0.n
            jkf r4 = r4.j
            boolean r4 = r4.q()
            if (r4 == 0) goto L_0x01b3
            jkf r4 = r1.j
            boolean r4 = r4.q()
            if (r4 != 0) goto L_0x01b8
        L_0x01b3:
            r3 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x01b8:
            r4 = 0
            r66 = r1
            r67 = r28
            r68 = r4
            r69 = r2
            r70 = r3
            r65.f1(r66, r67, r68, r69, r70)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np8.d1(java.util.List, int, long, boolean):void");
    }

    public final long e() {
        return this.n.c.d;
    }

    public final void e0(boolean z2) {
        if (P0(26)) {
            L0(new ep8(this, z2, 2));
            ppb ppb = this.n;
            if (ppb.s != z2) {
                this.n = ppb.c(ppb.r, z2);
                ep8 ep8 = new ep8(this, z2, 3);
                m56 m56 = this.h;
                m56.j(30, ep8);
                m56.h();
            }
        }
    }

    public final void e1(boolean z2) {
        ppb ppb = this.n;
        int i2 = ppb.x;
        int i3 = i2 == 1 ? 0 : i2;
        if (ppb.t != z2 || i2 != i3) {
            this.x = kne.z(ppb, this.x, this.y, this.a.w);
            this.y = SystemClock.elapsedRealtime();
            f1(this.n.d(1, i3, z2), (Integer) null, 1, (Integer) null, (Integer) null);
        }
    }

    public final void f(gob gob) {
        if (P0(13)) {
            L0(new g18(7, this, gob));
            if (!this.n.g.equals(gob)) {
                this.n = this.n.e(gob);
                dp8 dp8 = new dp8(gob, 1);
                m56 m56 = this.h;
                m56.j(12, dp8);
                m56.h();
            }
        }
    }

    public final void f0(sob sob) {
        this.h.l(sob);
    }

    public final void f1(ppb ppb, Integer num, Integer num2, Integer num3, Integer num4) {
        ppb ppb2 = this.n;
        this.n = ppb;
        W0(ppb2, ppb, num, num2, num3, num4);
    }

    public final void g(float f2) {
        if (P0(24)) {
            L0(new cp8(this, f2, 1));
            ppb ppb = this.n;
            if (ppb.n != f2) {
                this.n = ppb.p(f2);
                zb5 zb5 = new zb5(f2, 2);
                m56 m56 = this.h;
                m56.j(22, zb5);
                m56.h();
            }
        }
    }

    public final void g0(List list, int i2, int i3) {
        if (P0(20)) {
            n79.g(i2 >= 0 && i2 <= i3);
            L0(new kp8(this, list, i2, i3));
            Z0(list, i2, i3);
        }
    }

    public final int getPlaybackState() {
        return this.n.y;
    }

    public final int getRepeatMode() {
        return this.n.h;
    }

    public final long h() {
        long z2 = kne.z(this.n, this.x, this.y, this.a.w);
        this.x = z2;
        return z2;
    }

    public final void h0(int i2, int i3) {
        if (P0(20)) {
            n79.g(i2 >= 0 && i3 >= 0);
            L0(new bp8(this, i2, i3, 2));
            V0(i2, i2 + 1, i3);
        }
    }

    public final int i() {
        return this.n.r;
    }

    public final void i0(int i2, int i3, int i4) {
        if (P0(20)) {
            n79.g(i2 >= 0 && i2 <= i3 && i4 >= 0);
            L0(new gr1(this, i2, i3, i4));
            V0(i2, i3, i4);
        }
    }

    public final boolean isConnected() {
        return this.w != null;
    }

    public final void j(Surface surface) {
        if (P0(27)) {
            if (this.u != null) {
                this.u = null;
            }
            this.u = surface;
            M0(new g18(5, this, surface));
            int i2 = surface == null ? 0 : -1;
            U0(i2, i2);
        }
    }

    public final int j0() {
        return this.n.x;
    }

    public final boolean k() {
        return this.n.c.b;
    }

    public final void k0(List list) {
        if (P0(20)) {
            L0(new g18(9, this, list));
            H0(this.n.j.p(), list);
        }
    }

    public final long l() {
        return this.n.c.h;
    }

    public final jkf l0() {
        return this.n.j;
    }

    public final long m() {
        return this.n.c.g;
    }

    public final boolean m0() {
        return this.n.s;
    }

    public final void n(int i2, long j2) {
        if (P0(10)) {
            n79.g(i2 >= 0);
            L0(new rb4((Object) this, i2, j2, 3));
            a1(i2, j2);
        }
    }

    public final void n0(int i2, ir8 ir8) {
        if (P0(20)) {
            n79.g(i2 >= 0);
            L0(new oj0((Object) this, i2, (Object) ir8, 6));
            Z0(tb7.t(ir8), i2, i2 + 1);
        }
    }

    public final pob o() {
        return this.t;
    }

    public final void o0(ir8 ir8) {
        if (P0(31)) {
            L0(new ij5(this, (Object) ir8, 4));
            d1(Collections.singletonList(ir8), -1, -9223372036854775807L, true);
        }
    }

    public final void p(ir8 ir8, long j2) {
        if (P0(31)) {
            long j3 = j2;
            L0(new u52((Object) this, (Object) ir8, j3, 11));
            d1(Collections.singletonList(ir8), -1, j3, false);
        }
    }

    public final void p0() {
        if (P0(26)) {
            L0(new ap8(this, 10));
            ppb ppb = this.n;
            int i2 = ppb.r + 1;
            int i3 = ppb.q.c;
            if (i3 == 0 || i2 <= i3) {
                this.n = ppb.c(i2, ppb.s);
                zo8 zo8 = new zo8(this, i2, 3);
                m56 m56 = this.h;
                m56.j(30, zo8);
                m56.h();
            }
        }
    }

    public final void pause() {
        if (P0(1)) {
            L0(new ap8(this, 9));
            e1(false);
        }
    }

    public final void play() {
        if (!P0(1)) {
            i8b.V("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
            return;
        }
        L0(new ap8(this, 11));
        e1(true);
    }

    public final void prepare() {
        int i2 = 2;
        if (P0(2)) {
            L0(new ap8(this, 13));
            ppb ppb = this.n;
            if (ppb.y == 1) {
                if (ppb.j.q()) {
                    i2 = 4;
                }
                f1(ppb.f(i2, (PlaybackException) null), (Integer) null, (Integer) null, (Integer) null, (Integer) null);
            }
        }
    }

    public final boolean q() {
        return this.n.t;
    }

    public final boolean q0() {
        return this.n.i;
    }

    public final void r() {
        if (P0(20)) {
            L0(new ap8(this, 5));
            Y0(0, IntCompanionObject.MAX_VALUE);
        }
    }

    public final kqf r0() {
        return this.n.E;
    }

    public final void release() {
        i67 i67 = this.w;
        if (!this.m) {
            this.m = true;
            this.k = null;
            ox0 ox0 = this.i;
            Handler handler = (Handler) ox0.c;
            if (handler.hasMessages(1)) {
                try {
                    np8 np8 = (np8) ox0.b;
                    np8.w.l0(np8.c);
                } catch (RemoteException unused) {
                    i8b.V("Error in sending flushCommandQueue");
                }
            }
            handler.removeCallbacksAndMessages((Object) null);
            this.w = null;
            if (i67 != null) {
                int g2 = this.b.g();
                try {
                    i67.asBinder().unlinkToDeath(this.g, 0);
                    i67.d0(this.c, g2);
                } catch (RemoteException unused2) {
                }
            }
            this.h.k();
            bs6 bs6 = this.b;
            y86 y86 = new y86(25, (Object) this);
            synchronized (bs6.o) {
                try {
                    Handler o2 = v0g.o((Handler.Callback) null);
                    bs6.w = o2;
                    bs6.c = y86;
                    if (((ts) bs6.v).isEmpty()) {
                        bs6.h();
                    } else {
                        o2.postDelayed(new mgd(5, bs6), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void s(boolean z2) {
        if (P0(14)) {
            L0(new ep8(this, z2, 1));
            ppb ppb = this.n;
            if (ppb.i != z2) {
                this.n = ppb.k(z2);
                vz0 vz0 = new vz0(z2, 6);
                m56 m56 = this.h;
                m56.j(9, vz0);
                m56.h();
            }
        }
    }

    public final long s0() {
        return this.n.c.j;
    }

    public final void seekTo(long j2) {
        if (P0(5)) {
            L0(new dr1((Object) this, j2, 5));
            a1(N0(this.n), j2);
        }
    }

    public final void setPlaybackSpeed(float f2) {
        if (P0(13)) {
            L0(new cp8(this, f2, 0));
            gob gob = this.n.g;
            if (gob.a != f2) {
                gob gob2 = new gob(f2, gob.b);
                this.n = this.n.e(gob2);
                dp8 dp8 = new dp8(gob2, 0);
                m56 m56 = this.h;
                m56.j(12, dp8);
                m56.h();
            }
        }
    }

    public final void setRepeatMode(int i2) {
        if (P0(15)) {
            L0(new zo8(this, i2, 6));
            ppb ppb = this.n;
            if (ppb.h != i2) {
                this.n = ppb.i(i2);
                ob4 ob4 = new ob4(i2, 5);
                m56 m56 = this.h;
                m56.j(8, ob4);
                m56.h();
            }
        }
    }

    public final void stop() {
        if (P0(3)) {
            L0(new ap8(this, 12));
            ppb ppb = this.n;
            qwd qwd = this.n.c;
            uob uob = qwd.a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            qwd qwd2 = this.n.c;
            long j2 = qwd2.d;
            long j3 = qwd2.a.f;
            qwd qwd3 = qwd;
            int h2 = kne.h(j3, j2);
            qwd qwd4 = this.n.c;
            qwd qwd5 = r2;
            qwd qwd6 = new qwd(uob, qwd3.b, elapsedRealtime, j2, j3, h2, 0, qwd4.h, qwd4.i, qwd4.a.f);
            ppb j4 = ppb.j(qwd5);
            this.n = j4;
            if (j4.y != 1) {
                this.n = j4.f(1, j4.a);
                zc8 zc8 = new zc8(15);
                m56 m56 = this.h;
                m56.j(4, zc8);
                m56.h();
            }
        }
    }

    public final int t() {
        return this.n.c.f;
    }

    public final void t0(int i2, long j2, List list) {
        if (P0(20)) {
            L0(new gp8(this, list, i2, j2));
            d1(list, i2, j2, false);
        }
    }

    public final long u() {
        return this.n.C;
    }

    public final void u0(int i2) {
        if (P0(25)) {
            L0(new zo8(this, i2, 7));
            ppb ppb = this.n;
            in4 in4 = ppb.q;
            if (ppb.r != i2 && in4.b <= i2) {
                int i3 = in4.c;
                if (i3 == 0 || i2 <= i3) {
                    this.n = ppb.c(i2, ppb.s);
                    zo8 zo8 = new zo8(this, i2, 8);
                    m56 m56 = this.h;
                    m56.j(30, zo8);
                    m56.h();
                }
            }
        }
    }

    public final void v(sob sob) {
        this.h.c(sob);
    }

    public final void v0() {
        if (P0(9)) {
            L0(new ap8(this, 7));
            jkf jkf = this.n.j;
            if (!jkf.q() && !k()) {
                if (X()) {
                    a1(E0(), -9223372036854775807L);
                    return;
                }
                hkf n2 = jkf.n(N0(this.n), new hkf(), 0);
                if (n2.i && n2.a()) {
                    a1(N0(this.n), -9223372036854775807L);
                }
            }
        }
    }

    public final long w() {
        return this.n.c.i;
    }

    public final void w0() {
        if (P0(12)) {
            L0(new ap8(this, 1));
            b1(this.n.B);
        }
    }

    public final int x() {
        return this.n.c.a.e;
    }

    public final void x0() {
        if (P0(11)) {
            L0(new ap8(this, 8));
            b1(-this.n.A);
        }
    }

    public final v8g y() {
        return this.n.l;
    }

    public final us8 y0() {
        return this.n.z;
    }

    public final void z() {
        if (P0(6)) {
            L0(new ap8(this, 3));
            if (C0() != -1) {
                a1(C0(), -9223372036854775807L);
            }
        }
    }

    public final void z0(List list) {
        if (P0(20)) {
            L0(new ij5(this, (Object) list, 3));
            d1(list, -1, -9223372036854775807L, true);
        }
    }
}
