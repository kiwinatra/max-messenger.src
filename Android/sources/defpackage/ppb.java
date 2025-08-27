package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.Arrays;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: ppb  reason: default package */
public final class ppb {
    public static final ppb F;
    public static final String G = Integer.toString(1, 36);
    public static final String H = Integer.toString(2, 36);
    public static final String I = Integer.toString(3, 36);
    public static final String J = Integer.toString(4, 36);
    public static final String K = Integer.toString(5, 36);
    public static final String L = Integer.toString(6, 36);
    public static final String M = Integer.toString(7, 36);
    public static final String N = Integer.toString(8, 36);
    public static final String O = Integer.toString(9, 36);
    public static final String P = Integer.toString(10, 36);
    public static final String Q = Integer.toString(11, 36);
    public static final String R = Integer.toString(12, 36);
    public static final String S = Integer.toString(13, 36);
    public static final String T = Integer.toString(14, 36);
    public static final String U = Integer.toString(15, 36);
    public static final String V = Integer.toString(16, 36);
    public static final String W = Integer.toString(17, 36);
    public static final String X = Integer.toString(18, 36);
    public static final String Y = Integer.toString(19, 36);
    public static final String Z = Integer.toString(20, 36);
    public static final String a0 = Integer.toString(21, 36);
    public static final String b0 = Integer.toString(22, 36);
    public static final String c0 = Integer.toString(23, 36);
    public static final String d0 = Integer.toString(24, 36);
    public static final String e0 = Integer.toString(25, 36);
    public static final String f0 = Integer.toString(26, 36);
    public static final String g0 = Integer.toString(27, 36);
    public static final String h0 = Integer.toString(28, 36);
    public static final String i0 = Integer.toString(29, 36);
    public static final String j0 = Integer.toString(30, 36);
    public static final String k0 = Integer.toString(31, 36);
    public static final String l0 = Integer.toString(32, 36);
    public final long A;
    public final long B;
    public final long C;
    public final qqf D;
    public final kqf E;
    public final PlaybackException a;
    public final int b;
    public final qwd c;
    public final uob d;
    public final uob e;
    public final int f;
    public final gob g;
    public final int h;
    public final boolean i;
    public final jkf j;
    public final int k;
    public final v8g l;
    public final us8 m;
    public final float n;
    public final i30 o;
    public final o44 p;
    public final in4 q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final int y;
    public final us8 z;

    static {
        qwd qwd = qwd.l;
        uob uob = qwd.k;
        gob gob = gob.d;
        v8g v8g = v8g.e;
        ckf ckf = jkf.a;
        us8 us8 = us8.J;
        F = new ppb((PlaybackException) null, 0, qwd, uob, uob, 0, gob, 0, false, v8g, ckf, 0, us8, 1.0f, i30.g, o44.c, in4.e, 0, false, false, 1, 0, 1, false, false, us8, MultiFileUploader.UPLOAD_NEXT_INTERVAL, 15000, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, qqf.b, kqf.C);
        int i2 = v0g.a;
    }

    public ppb(PlaybackException playbackException, int i2, qwd qwd, uob uob, uob uob2, int i3, gob gob, int i4, boolean z2, v8g v8g, jkf jkf, int i5, us8 us8, float f2, i30 i30, o44 o44, in4 in4, int i6, boolean z3, boolean z4, int i7, int i8, int i9, boolean z5, boolean z6, us8 us82, long j2, long j3, long j4, qqf qqf, kqf kqf) {
        this.a = playbackException;
        this.b = i2;
        this.c = qwd;
        this.d = uob;
        this.e = uob2;
        this.f = i3;
        this.g = gob;
        this.h = i4;
        this.i = z2;
        this.l = v8g;
        this.j = jkf;
        this.k = i5;
        this.m = us8;
        this.n = f2;
        this.o = i30;
        this.p = o44;
        this.q = in4;
        this.r = i6;
        this.s = z3;
        this.t = z4;
        this.u = i7;
        this.x = i8;
        this.y = i9;
        this.v = z5;
        this.w = z6;
        this.z = us82;
        this.A = j2;
        this.B = j3;
        this.C = j4;
        this.D = qqf;
        this.E = kqf;
    }

    public static ppb r(int i2, Bundle bundle) {
        PlaybackException playbackException;
        ckf ckf;
        k0d k0d;
        o44 o44;
        in4 b2;
        qqf qqf;
        k0d k0d2;
        k0d k0d3;
        int i3 = i2;
        Bundle bundle2 = bundle;
        IBinder binder = bundle2.getBinder(l0);
        if (binder instanceof opb) {
            return ((opb) binder).c;
        }
        Bundle bundle3 = bundle2.getBundle(X);
        Throwable th = null;
        if (bundle3 == null) {
            playbackException = null;
        } else {
            String string = bundle3.getString(PlaybackException.w);
            String string2 = bundle3.getString(PlaybackException.x);
            String string3 = bundle3.getString(PlaybackException.y);
            if (!TextUtils.isEmpty(string2)) {
                try {
                    Class<?> cls = Class.forName(string2, true, PlaybackException.class.getClassLoader());
                    if (Throwable.class.isAssignableFrom(cls)) {
                        th = (Throwable) cls.getConstructor(new Class[]{String.class}).newInstance(new Object[]{string3});
                    }
                    if (th == null) {
                        th = new RemoteException(string3);
                    }
                } catch (Throwable unused) {
                    th = new RemoteException(string3);
                }
            }
            Throwable th2 = th;
            int i4 = bundle3.getInt(PlaybackException.o, 1000);
            Bundle bundle4 = bundle3.getBundle(PlaybackException.z);
            if (bundle4 == null) {
                bundle4 = Bundle.EMPTY;
            }
            playbackException = new PlaybackException(string, th2, i4, bundle4, bundle3.getLong(PlaybackException.v, SystemClock.elapsedRealtime()));
        }
        int i5 = bundle2.getInt(Z, 0);
        Bundle bundle5 = bundle2.getBundle(Y);
        qwd b3 = bundle5 == null ? qwd.l : qwd.b(bundle5);
        Bundle bundle6 = bundle2.getBundle(a0);
        uob c2 = bundle6 == null ? qwd.k : uob.c(bundle6);
        Bundle bundle7 = bundle2.getBundle(b0);
        uob c3 = bundle7 == null ? qwd.k : uob.c(bundle7);
        int i6 = bundle2.getInt(c0, 0);
        Bundle bundle8 = bundle2.getBundle(G);
        gob gob = bundle8 == null ? gob.d : new gob(bundle8.getFloat(gob.e, 1.0f), bundle8.getFloat(gob.f, 1.0f));
        int i7 = bundle2.getInt(H, 0);
        boolean z2 = bundle2.getBoolean(I, false);
        Bundle bundle9 = bundle2.getBundle(J);
        if (bundle9 == null) {
            ckf = jkf.a;
        } else {
            xff xff = new xff(2);
            IBinder binder2 = bundle9.getBinder(jkf.b);
            if (binder2 == null) {
                lx5 lx5 = tb7.b;
                k0d2 = k0d.v;
            } else {
                k0d2 = ev0.m(xff, gv0.a(binder2));
            }
            xff xff2 = new xff(3);
            IBinder binder3 = bundle9.getBinder(jkf.c);
            if (binder3 == null) {
                lx5 lx52 = tb7.b;
                k0d3 = k0d.v;
            } else {
                k0d3 = ev0.m(xff2, gv0.a(binder3));
            }
            int[] intArray = bundle9.getIntArray(jkf.d);
            if (intArray == null) {
                int i8 = k0d2.o;
                int[] iArr = new int[i8];
                for (int i9 = 0; i9 < i8; i9++) {
                    iArr[i9] = i9;
                }
                intArray = iArr;
            }
            ckf = new fkf(k0d2, k0d3, intArray);
        }
        int i10 = bundle2.getInt(k0, 0);
        Bundle bundle10 = bundle2.getBundle(K);
        v8g v8g = bundle10 == null ? v8g.e : new v8g(bundle10.getFloat(v8g.i, 1.0f), bundle10.getInt(v8g.f, 0), bundle10.getInt(v8g.g, 0), bundle10.getInt(v8g.h, 0));
        Bundle bundle11 = bundle2.getBundle(L);
        us8 b4 = bundle11 == null ? us8.J : us8.b(bundle11);
        float f2 = bundle2.getFloat(M, 1.0f);
        Bundle bundle12 = bundle2.getBundle(N);
        i30 a2 = bundle12 == null ? i30.g : i30.a(bundle12);
        Bundle bundle13 = bundle2.getBundle(d0);
        if (bundle13 == null) {
            o44 = o44.c;
        } else {
            ArrayList parcelableArrayList = bundle13.getParcelableArrayList(o44.d);
            if (parcelableArrayList == null) {
                k0d = k0d.v;
            } else {
                qb7 o2 = tb7.o();
                for (int i11 = 0; i11 < parcelableArrayList.size(); i11++) {
                    Bundle bundle14 = (Bundle) parcelableArrayList.get(i11);
                    bundle14.getClass();
                    o2.a(n44.a(bundle14));
                }
                k0d = o2.j();
            }
            o44 = new o44(bundle13.getLong(o44.e), k0d);
        }
        o44 o442 = o44;
        Bundle bundle15 = bundle2.getBundle(O);
        if (bundle15 == null) {
            b2 = in4.e;
        } else {
            int i12 = bundle15.getInt(in4.f, 0);
            int i13 = bundle15.getInt(in4.g, 0);
            int i14 = bundle15.getInt(in4.h, 0);
            String string4 = bundle15.getString(in4.i);
            he3 he3 = new he3(i12);
            he3.b = i13;
            he3.c = i14;
            n79.g(i12 != 0 || string4 == null);
            he3.d = string4;
            b2 = he3.b();
        }
        in4 in4 = b2;
        int i15 = bundle2.getInt(P, 0);
        boolean z3 = bundle2.getBoolean(Q, false);
        boolean z4 = bundle2.getBoolean(R, false);
        int i16 = bundle2.getInt(S, 1);
        int i17 = bundle2.getInt(T, 0);
        int i18 = bundle2.getInt(U, 1);
        boolean z5 = bundle2.getBoolean(V, false);
        boolean z6 = bundle2.getBoolean(W, false);
        Bundle bundle16 = bundle2.getBundle(e0);
        us8 b5 = bundle16 == null ? us8.J : us8.b(bundle16);
        long j2 = 0;
        long j3 = bundle2.getLong(f0, i3 < 4 ? 0 : MultiFileUploader.UPLOAD_NEXT_INTERVAL);
        long j4 = bundle2.getLong(g0, i3 < 4 ? 0 : 15000);
        if (i3 >= 4) {
            j2 = CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS;
        }
        long j5 = bundle2.getLong(h0, j2);
        Bundle bundle17 = bundle2.getBundle(j0);
        if (bundle17 == null) {
            qqf = qqf.b;
        } else {
            ArrayList parcelableArrayList2 = bundle17.getParcelableArrayList(qqf.c);
            qqf = new qqf(parcelableArrayList2 == null ? k0d.v : ev0.m(new xff(14), parcelableArrayList2));
        }
        Bundle bundle18 = bundle2.getBundle(i0);
        return new ppb(playbackException, i5, b3, c2, c3, i6, gob, i7, z2, v8g, ckf, i10, b4, f2, a2, o442, in4, i15, z3, z4, i16, i17, i18, z5, z6, b5, j3, j4, j5, qqf, bundle18 == null ? kqf.C : kqf.b(bundle18));
    }

    public final ppb a(i30 i30) {
        jkf jkf = this.j;
        boolean q2 = jkf.q();
        qwd qwd = this.c;
        n79.n(q2 || qwd.a.b < jkf.p());
        return new ppb(this.a, this.b, qwd, this.d, this.e, this.f, this.g, this.h, this.i, this.l, jkf, this.k, this.m, this.n, i30, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final ppb b(qqf qqf) {
        jkf jkf = this.j;
        boolean q2 = jkf.q();
        qwd qwd = this.c;
        n79.n(q2 || qwd.a.b < jkf.p());
        return new ppb(this.a, this.b, qwd, this.d, this.e, this.f, this.g, this.h, this.i, this.l, jkf, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, qqf, this.E);
    }

    public final ppb c(int i2, boolean z2) {
        jkf jkf = this.j;
        boolean q2 = jkf.q();
        qwd qwd = this.c;
        n79.n(q2 || qwd.a.b < jkf.p());
        return new ppb(this.a, this.b, qwd, this.d, this.e, this.f, this.g, this.h, this.i, this.l, jkf, this.k, this.m, this.n, this.o, this.p, this.q, i2, z2, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final ppb d(int i2, int i3, boolean z2) {
        boolean z3 = false;
        boolean z4 = this.y == 3 && z2 && i3 == 0;
        jkf jkf = this.j;
        boolean q2 = jkf.q();
        qwd qwd = this.c;
        if (q2 || qwd.a.b < jkf.p()) {
            z3 = true;
        }
        n79.n(z3);
        return new ppb(this.a, this.b, qwd, this.d, this.e, this.f, this.g, this.h, this.i, this.l, jkf, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, z2, i2, i3, this.y, z4, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final ppb e(gob gob) {
        jkf jkf = this.j;
        boolean q2 = jkf.q();
        qwd qwd = this.c;
        n79.n(q2 || qwd.a.b < jkf.p());
        return new ppb(this.a, this.b, qwd, this.d, this.e, this.f, gob, this.h, this.i, this.l, jkf, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final ppb f(int i2, PlaybackException playbackException) {
        boolean z2 = false;
        boolean z3 = i2 == 3 && this.t && this.x == 0;
        jkf jkf = this.j;
        boolean q2 = jkf.q();
        qwd qwd = this.c;
        if (q2 || qwd.a.b < jkf.p()) {
            z2 = true;
        }
        n79.n(z2);
        ppb ppb = r4;
        ppb ppb2 = new ppb(playbackException, this.b, qwd, this.d, this.e, this.f, this.g, this.h, this.i, this.l, jkf, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, i2, z3, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
        return ppb;
    }

    public final ppb g(us8 us8) {
        jkf jkf = this.j;
        boolean q2 = jkf.q();
        qwd qwd = this.c;
        n79.n(q2 || qwd.a.b < jkf.p());
        return new ppb(this.a, this.b, qwd, this.d, this.e, this.f, this.g, this.h, this.i, this.l, jkf, this.k, us8, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final ppb h(uob uob, uob uob2, int i2) {
        jkf jkf = this.j;
        boolean q2 = jkf.q();
        qwd qwd = this.c;
        n79.n(q2 || qwd.a.b < jkf.p());
        return new ppb(this.a, this.b, qwd, uob, uob2, i2, this.g, this.h, this.i, this.l, jkf, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final ppb i(int i2) {
        jkf jkf = this.j;
        boolean q2 = jkf.q();
        qwd qwd = this.c;
        n79.n(q2 || qwd.a.b < jkf.p());
        return new ppb(this.a, this.b, qwd, this.d, this.e, this.f, this.g, i2, this.i, this.l, jkf, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final ppb j(qwd qwd) {
        jkf jkf = this.j;
        n79.n(jkf.q() || qwd.a.b < jkf.p());
        return new ppb(this.a, this.b, qwd, this.d, this.e, this.f, this.g, this.h, this.i, this.l, jkf, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final ppb k(boolean z2) {
        jkf jkf = this.j;
        boolean q2 = jkf.q();
        qwd qwd = this.c;
        n79.n(q2 || qwd.a.b < jkf.p());
        return new ppb(this.a, this.b, qwd, this.d, this.e, this.f, this.g, this.h, z2, this.l, jkf, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final ppb l(jkf jkf) {
        boolean q2 = jkf.q();
        qwd qwd = this.c;
        n79.n(q2 || qwd.a.b < jkf.p());
        ppb ppb = r2;
        ppb ppb2 = new ppb(this.a, this.b, qwd, this.d, this.e, this.f, this.g, this.h, this.i, this.l, jkf, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
        return ppb;
    }

    public final ppb m(bbc bbc, int i2) {
        uob uob = r14;
        qwd qwd = this.c;
        uob uob2 = qwd.a;
        uob uob3 = new uob(uob2.a, i2, uob2.c, uob2.d, uob2.e, uob2.f, uob2.g, uob2.h, uob2.i);
        qwd qwd2 = r1;
        qwd qwd3 = new qwd(uob, qwd.b, qwd.c, qwd.d, qwd.e, qwd.f, qwd.g, qwd.h, qwd.i, qwd.j);
        n79.n(bbc.q() || qwd2.a.b < bbc.p());
        qwd qwd4 = qwd2;
        qqf qqf = this.D;
        kqf kqf = this.E;
        return new ppb(this.a, this.b, qwd4, this.d, this.e, this.f, this.g, this.h, this.i, this.l, bbc, 0, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, qqf, kqf);
    }

    public final ppb n(jkf jkf, qwd qwd, int i2) {
        boolean z2;
        if (jkf.q()) {
            qwd qwd2 = qwd;
        } else if (qwd.a.b >= jkf.p()) {
            z2 = false;
            n79.n(z2);
            qqf qqf = this.D;
            kqf kqf = this.E;
            return new ppb(this.a, this.b, qwd, this.d, this.e, this.f, this.g, this.h, this.i, this.l, jkf, i2, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, qqf, kqf);
        }
        z2 = true;
        n79.n(z2);
        qqf qqf2 = this.D;
        kqf kqf2 = this.E;
        return new ppb(this.a, this.b, qwd, this.d, this.e, this.f, this.g, this.h, this.i, this.l, jkf, i2, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, qqf2, kqf2);
    }

    public final ppb o(kqf kqf) {
        jkf jkf = this.j;
        boolean q2 = jkf.q();
        qwd qwd = this.c;
        n79.n(q2 || qwd.a.b < jkf.p());
        return new ppb(this.a, this.b, qwd, this.d, this.e, this.f, this.g, this.h, this.i, this.l, jkf, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, kqf);
    }

    public final ppb p(float f2) {
        jkf jkf = this.j;
        boolean q2 = jkf.q();
        qwd qwd = this.c;
        n79.n(q2 || qwd.a.b < jkf.p());
        return new ppb(this.a, this.b, qwd, this.d, this.e, this.f, this.g, this.h, this.i, this.l, jkf, this.k, this.m, f2, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ppb q(defpackage.pob r41, boolean r42, boolean r43) {
        /*
            r40 = this;
            r0 = r40
            r1 = r41
            r2 = 16
            boolean r2 = r1.a(r2)
            r3 = 17
            boolean r3 = r1.a(r3)
            qwd r4 = r0.c
            qwd r8 = r4.a(r2, r3)
            uob r5 = r0.d
            uob r9 = r5.b(r2, r3)
            uob r5 = r0.e
            uob r10 = r5.b(r2, r3)
            r5 = 1
            jkf r6 = r0.j
            r7 = 0
            if (r3 != 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            boolean r2 = r6.q()
            if (r2 != 0) goto L_0x007c
            uob r2 = r4.a
            int r2 = r2.b
            int r3 = r6.p()
            if (r3 != r5) goto L_0x003b
            goto L_0x0079
        L_0x003b:
            hkf r3 = new hkf
            r3.<init>()
            r11 = 0
            hkf r2 = r6.n(r2, r3, r11)
            qb7 r3 = defpackage.tb7.o()
            int r4 = r2.n
        L_0x004c:
            int r11 = r2.o
            if (r4 > r11) goto L_0x0061
            ekf r11 = new ekf
            r11.<init>()
            ekf r11 = r6.g(r4, r11, r5)
            r11.c = r7
            r3.a(r11)
            int r4 = r4 + 1
            goto L_0x004c
        L_0x0061:
            int r4 = r2.n
            int r11 = r11 - r4
            r2.o = r11
            r2.n = r7
            fkf r6 = new fkf
            k0d r2 = defpackage.tb7.t(r2)
            k0d r3 = r3.j()
            int[] r4 = new int[]{r7}
            r6.<init>(r2, r3, r4)
        L_0x0079:
            r16 = r6
            goto L_0x0084
        L_0x007c:
            if (r42 != 0) goto L_0x0080
            if (r3 != 0) goto L_0x0079
        L_0x0080:
            ckf r2 = defpackage.jkf.a
            r16 = r2
        L_0x0084:
            r2 = 18
            boolean r3 = r1.a(r2)
            if (r3 != 0) goto L_0x0091
            us8 r3 = defpackage.us8.J
        L_0x008e:
            r18 = r3
            goto L_0x0094
        L_0x0091:
            us8 r3 = r0.m
            goto L_0x008e
        L_0x0094:
            r3 = 22
            boolean r3 = r1.a(r3)
            if (r3 != 0) goto L_0x00a1
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x009e:
            r19 = r3
            goto L_0x00a4
        L_0x00a1:
            float r3 = r0.n
            goto L_0x009e
        L_0x00a4:
            r3 = 21
            boolean r3 = r1.a(r3)
            if (r3 != 0) goto L_0x00b1
            i30 r3 = defpackage.i30.g
        L_0x00ae:
            r20 = r3
            goto L_0x00b4
        L_0x00b1:
            i30 r3 = r0.o
            goto L_0x00ae
        L_0x00b4:
            r3 = 28
            boolean r3 = r1.a(r3)
            if (r3 != 0) goto L_0x00c1
            o44 r3 = defpackage.o44.c
        L_0x00be:
            r21 = r3
            goto L_0x00c4
        L_0x00c1:
            o44 r3 = r0.p
            goto L_0x00be
        L_0x00c4:
            r3 = 23
            boolean r3 = r1.a(r3)
            if (r3 != 0) goto L_0x00d1
            r23 = r7
            r24 = r23
            goto L_0x00d9
        L_0x00d1:
            int r3 = r0.r
            boolean r4 = r0.s
            r23 = r3
            r24 = r4
        L_0x00d9:
            boolean r2 = r1.a(r2)
            if (r2 != 0) goto L_0x00e4
            us8 r2 = defpackage.us8.J
        L_0x00e1:
            r31 = r2
            goto L_0x00e7
        L_0x00e4:
            us8 r2 = r0.z
            goto L_0x00e1
        L_0x00e7:
            if (r43 != 0) goto L_0x00f7
            r2 = 30
            boolean r1 = r1.a(r2)
            if (r1 != 0) goto L_0x00f2
            goto L_0x00f7
        L_0x00f2:
            qqf r1 = r0.D
        L_0x00f4:
            r38 = r1
            goto L_0x00fa
        L_0x00f7:
            qqf r1 = defpackage.qqf.b
            goto L_0x00f4
        L_0x00fa:
            boolean r1 = r16.q()
            if (r1 != 0) goto L_0x010c
            uob r1 = r8.a
            int r1 = r1.b
            int r2 = r16.p()
            if (r1 >= r2) goto L_0x010b
            goto L_0x010c
        L_0x010b:
            r5 = r7
        L_0x010c:
            defpackage.n79.n(r5)
            ppb r1 = new ppb
            r5 = r1
            long r2 = r0.C
            r36 = r2
            kqf r2 = r0.E
            r39 = r2
            androidx.media3.common.PlaybackException r6 = r0.a
            int r7 = r0.b
            int r11 = r0.f
            gob r12 = r0.g
            int r13 = r0.h
            boolean r14 = r0.i
            v8g r15 = r0.l
            int r2 = r0.k
            r17 = r2
            in4 r2 = r0.q
            r22 = r2
            boolean r2 = r0.t
            r25 = r2
            int r2 = r0.u
            r26 = r2
            int r2 = r0.x
            r27 = r2
            int r2 = r0.y
            r28 = r2
            boolean r2 = r0.v
            r29 = r2
            boolean r2 = r0.w
            r30 = r2
            long r2 = r0.A
            r32 = r2
            long r2 = r0.B
            r34 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r36, r38, r39)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppb.q(pob, boolean, boolean):ppb");
    }

    public final ir8 s() {
        jkf jkf = this.j;
        if (jkf.q()) {
            return null;
        }
        return jkf.n(this.c.a.b, new hkf(), 0).c;
    }

    public final Bundle t(int i2) {
        long j2;
        long j3;
        int i3;
        Bundle bundle;
        ekf ekf;
        int i4;
        long j4;
        ir8[] ir8Arr;
        Bundle bundle2;
        int i5 = i2;
        Bundle bundle3 = new Bundle();
        PlaybackException playbackException = this.a;
        if (playbackException != null) {
            bundle3.putBundle(X, playbackException.c());
        }
        int i6 = this.b;
        if (i6 != 0) {
            bundle3.putInt(Z, i6);
        }
        qwd qwd = this.c;
        if (i5 < 3 || !qwd.equals(qwd.l)) {
            bundle3.putBundle(Y, qwd.c(i5));
        }
        uob uob = this.d;
        if (i5 < 3 || !qwd.k.a(uob)) {
            bundle3.putBundle(a0, uob.d(i5));
        }
        uob uob2 = this.e;
        if (i5 < 3 || !qwd.k.a(uob2)) {
            bundle3.putBundle(b0, uob2.d(i5));
        }
        int i7 = this.f;
        if (i7 != 0) {
            bundle3.putInt(c0, i7);
        }
        gob gob = gob.d;
        gob gob2 = this.g;
        if (!gob2.equals(gob)) {
            Bundle bundle4 = new Bundle();
            bundle4.putFloat(gob.e, gob2.a);
            bundle4.putFloat(gob.f, gob2.b);
            bundle3.putBundle(G, bundle4);
        }
        int i8 = this.h;
        if (i8 != 0) {
            bundle3.putInt(H, i8);
        }
        boolean z2 = this.i;
        if (z2) {
            bundle3.putBoolean(I, z2);
        }
        ckf ckf = jkf.a;
        jkf jkf = this.j;
        boolean z3 = false;
        long j5 = 0;
        if (!jkf.equals(ckf)) {
            ArrayList arrayList = new ArrayList();
            int p2 = jkf.p();
            hkf hkf = new hkf();
            int i9 = 0;
            while (true) {
                j3 = -9223372036854775807L;
                if (i9 >= p2) {
                    break;
                }
                hkf n2 = jkf.n(i9, hkf, j5);
                n2.getClass();
                Bundle bundle5 = new Bundle();
                if (!ir8.g.equals(n2.c)) {
                    bundle5.putBundle(hkf.t, n2.c.d(false));
                }
                long j6 = n2.e;
                if (j6 != -9223372036854775807L) {
                    bundle5.putLong(hkf.u, j6);
                }
                long j7 = n2.f;
                if (j7 != -9223372036854775807L) {
                    bundle5.putLong(hkf.v, j7);
                }
                long j8 = n2.g;
                if (j8 != -9223372036854775807L) {
                    bundle5.putLong(hkf.w, j8);
                }
                boolean z4 = n2.h;
                if (z4) {
                    bundle5.putBoolean(hkf.x, z4);
                }
                boolean z5 = n2.i;
                if (z5) {
                    bundle5.putBoolean(hkf.y, z5);
                }
                wq8 wq8 = n2.j;
                if (wq8 != null) {
                    bundle5.putBundle(hkf.z, wq8.c());
                }
                boolean z6 = n2.k;
                if (z6) {
                    bundle5.putBoolean(hkf.A, z6);
                }
                long j9 = n2.l;
                if (j9 != 0) {
                    bundle5.putLong(hkf.B, j9);
                }
                long j10 = n2.m;
                if (j10 != -9223372036854775807L) {
                    bundle5.putLong(hkf.C, j10);
                }
                int i10 = n2.n;
                if (i10 != 0) {
                    bundle5.putInt(hkf.D, i10);
                }
                int i11 = n2.o;
                if (i11 != 0) {
                    bundle5.putInt(hkf.E, i11);
                }
                long j11 = n2.p;
                if (j11 != 0) {
                    bundle5.putLong(hkf.F, j11);
                }
                arrayList.add(bundle5);
                i9++;
                j5 = 0;
            }
            ArrayList arrayList2 = new ArrayList();
            int i12 = jkf.i();
            ekf ekf2 = new ekf();
            int i13 = 0;
            while (i13 < i12) {
                ekf g2 = jkf.g(i13, ekf2, z3);
                g2.getClass();
                Bundle bundle6 = new Bundle();
                int i14 = g2.c;
                if (i14 != 0) {
                    bundle6.putInt(ekf.h, i14);
                }
                int i15 = i12;
                ekf ekf3 = ekf2;
                long j12 = g2.d;
                if (j12 != j3) {
                    bundle6.putLong(ekf.i, j12);
                }
                long j13 = g2.e;
                if (j13 != 0) {
                    bundle6.putLong(ekf.j, j13);
                }
                boolean z7 = g2.f;
                if (z7) {
                    bundle6.putBoolean(ekf.k, z7);
                }
                if (!g2.g.equals(q9.g)) {
                    q9 q9Var = g2.g;
                    q9Var.getClass();
                    Bundle bundle7 = new Bundle();
                    ArrayList arrayList3 = new ArrayList();
                    o9[] o9VarArr = q9Var.f;
                    int length = o9VarArr.length;
                    i4 = i15;
                    int i16 = 0;
                    while (i16 < length) {
                        int i17 = length;
                        o9 o9Var = o9VarArr[i16];
                        o9Var.getClass();
                        o9[] o9VarArr2 = o9VarArr;
                        Bundle bundle8 = new Bundle();
                        ekf ekf4 = ekf3;
                        bundle8.putLong(o9.j, o9Var.a);
                        bundle8.putInt(o9.k, o9Var.b);
                        bundle8.putInt(o9.q, o9Var.c);
                        bundle8.putParcelableArrayList(o9.l, new ArrayList(Arrays.asList(o9Var.d)));
                        ArrayList arrayList4 = new ArrayList();
                        ir8[] ir8Arr2 = o9Var.e;
                        int length2 = ir8Arr2.length;
                        Bundle bundle9 = bundle3;
                        int i18 = 0;
                        while (i18 < length2) {
                            int i19 = length2;
                            ir8 ir8 = ir8Arr2[i18];
                            if (ir8 == null) {
                                bundle2 = null;
                                ir8Arr = ir8Arr2;
                            } else {
                                ir8Arr = ir8Arr2;
                                bundle2 = ir8.d(true);
                            }
                            arrayList4.add(bundle2);
                            i18++;
                            length2 = i19;
                            ir8Arr2 = ir8Arr;
                        }
                        bundle8.putParcelableArrayList(o9.r, arrayList4);
                        bundle8.putIntArray(o9.m, o9Var.f);
                        bundle8.putLongArray(o9.n, o9Var.g);
                        bundle8.putLong(o9.o, o9Var.h);
                        bundle8.putBoolean(o9.p, o9Var.i);
                        arrayList3.add(bundle8);
                        i16++;
                        int i20 = i2;
                        length = i17;
                        o9VarArr = o9VarArr2;
                        ekf3 = ekf4;
                        bundle3 = bundle9;
                    }
                    bundle = bundle3;
                    ekf = ekf3;
                    if (!arrayList3.isEmpty()) {
                        bundle7.putParcelableArrayList(q9.i, arrayList3);
                    }
                    long j14 = q9Var.c;
                    if (j14 != 0) {
                        bundle7.putLong(q9.j, j14);
                    }
                    long j15 = q9Var.d;
                    j4 = -9223372036854775807L;
                    if (j15 != -9223372036854775807L) {
                        bundle7.putLong(q9.k, j15);
                    }
                    int i21 = q9Var.e;
                    if (i21 != 0) {
                        bundle7.putInt(q9.l, i21);
                    }
                    bundle6.putBundle(ekf.l, bundle7);
                } else {
                    bundle = bundle3;
                    i4 = i15;
                    ekf = ekf3;
                    j4 = -9223372036854775807L;
                }
                arrayList2.add(bundle6);
                i13++;
                int i22 = i2;
                j3 = j4;
                i12 = i4;
                ekf2 = ekf;
                bundle3 = bundle;
                z3 = false;
            }
            Bundle bundle10 = bundle3;
            j2 = 0;
            int[] iArr = new int[p2];
            boolean z8 = true;
            if (p2 > 0) {
                i3 = 0;
                iArr[0] = jkf.a(true);
            } else {
                i3 = 0;
            }
            int i23 = 1;
            while (i23 < p2) {
                iArr[i23] = jkf.e(iArr[i23 - 1], i3, z8);
                i23++;
                z8 = true;
                i3 = 0;
            }
            Bundle bundle11 = new Bundle();
            bundle11.putBinder(jkf.b, new gv0(arrayList));
            bundle11.putBinder(jkf.c, new gv0(arrayList2));
            bundle11.putIntArray(jkf.d, iArr);
            bundle3 = bundle10;
            bundle3.putBundle(J, bundle11);
        } else {
            j2 = 0;
        }
        int i24 = this.k;
        if (i24 != 0) {
            bundle3.putInt(k0, i24);
        }
        v8g v8g = v8g.e;
        v8g v8g2 = this.l;
        if (!v8g2.equals(v8g)) {
            Bundle bundle12 = new Bundle();
            bundle12.putInt(v8g.f, v8g2.a);
            bundle12.putInt(v8g.g, v8g2.b);
            bundle12.putInt(v8g.h, v8g2.c);
            bundle12.putFloat(v8g.i, v8g2.d);
            bundle3.putBundle(K, bundle12);
        }
        us8 us8 = us8.J;
        us8 us82 = this.m;
        if (!us82.equals(us8)) {
            bundle3.putBundle(L, us82.c());
        }
        float f2 = this.n;
        if (f2 != 1.0f) {
            bundle3.putFloat(M, f2);
        }
        i30 i30 = i30.g;
        i30 i302 = this.o;
        if (!i302.equals(i30)) {
            bundle3.putBundle(N, i302.c());
        }
        o44 o44 = o44.c;
        o44 o442 = this.p;
        if (!o442.equals(o44)) {
            Bundle bundle13 = new Bundle();
            qb7 o2 = tb7.o();
            int i25 = 0;
            while (true) {
                tb7 tb7 = o442.a;
                if (i25 >= tb7.size()) {
                    break;
                }
                if (((n44) tb7.get(i25)).d == null) {
                    o2.a((n44) tb7.get(i25));
                }
                i25++;
            }
            k0d j16 = o2.j();
            ArrayList arrayList5 = new ArrayList(j16.o);
            lx5 r2 = j16.listIterator(0);
            while (r2.hasNext()) {
                n44 n44 = (n44) r2.next();
                Bundle b2 = n44.b();
                Bitmap bitmap = n44.d;
                if (bitmap != null) {
                    b2.putParcelable(n44.v, bitmap);
                }
                arrayList5.add(b2);
            }
            bundle13.putParcelableArrayList(o44.d, arrayList5);
            bundle13.putLong(o44.e, o442.b);
            bundle3.putBundle(d0, bundle13);
        }
        in4 in4 = in4.e;
        in4 in42 = this.q;
        if (!in42.equals(in4)) {
            Bundle bundle14 = new Bundle();
            int i26 = in42.a;
            if (i26 != 0) {
                bundle14.putInt(in4.f, i26);
            }
            int i27 = in42.b;
            if (i27 != 0) {
                bundle14.putInt(in4.g, i27);
            }
            int i28 = in42.c;
            if (i28 != 0) {
                bundle14.putInt(in4.h, i28);
            }
            String str = in42.d;
            if (str != null) {
                bundle14.putString(in4.i, str);
            }
            bundle3.putBundle(O, bundle14);
        }
        int i29 = this.r;
        if (i29 != 0) {
            bundle3.putInt(P, i29);
        }
        boolean z9 = this.s;
        if (z9) {
            bundle3.putBoolean(Q, z9);
        }
        boolean z10 = this.t;
        if (z10) {
            bundle3.putBoolean(R, z10);
        }
        int i31 = this.u;
        if (i31 != 1) {
            bundle3.putInt(S, i31);
        }
        int i32 = this.x;
        if (i32 != 0) {
            bundle3.putInt(T, i32);
        }
        int i33 = this.y;
        if (i33 != 1) {
            bundle3.putInt(U, i33);
        }
        boolean z11 = this.v;
        if (z11) {
            bundle3.putBoolean(V, z11);
        }
        boolean z12 = this.w;
        if (z12) {
            bundle3.putBoolean(W, z12);
        }
        us8 us83 = us8.J;
        us8 us84 = this.z;
        if (!us84.equals(us83)) {
            bundle3.putBundle(e0, us84.c());
        }
        int i34 = i2;
        long j17 = i34 < 6 ? j2 : MultiFileUploader.UPLOAD_NEXT_INTERVAL;
        long j18 = this.A;
        if (j18 != j17) {
            bundle3.putLong(f0, j18);
        }
        long j19 = i34 < 6 ? j2 : 15000;
        long j20 = this.B;
        if (j20 != j19) {
            bundle3.putLong(g0, j20);
        }
        long j21 = i34 < 6 ? j2 : CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS;
        long j22 = this.C;
        if (j22 != j21) {
            bundle3.putLong(h0, j22);
        }
        qqf qqf = qqf.b;
        qqf qqf2 = this.D;
        if (!qqf2.equals(qqf)) {
            Bundle bundle15 = new Bundle();
            bundle15.putParcelableArrayList(qqf.c, ev0.G(qqf2.a, new xff(13)));
            bundle3.putBundle(j0, bundle15);
        }
        kqf kqf = kqf.C;
        kqf kqf2 = this.E;
        if (!kqf2.equals(kqf)) {
            bundle3.putBundle(i0, kqf2.c());
        }
        return bundle3;
    }
}
