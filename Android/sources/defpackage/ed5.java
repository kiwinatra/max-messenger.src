package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ed5  reason: default package */
public final class ed5 implements Handler.Callback, jt8 {
    public final ec5 A0;
    public final st8 B0;
    public final j09 C0;
    public final qg4 D0;
    public tnd E0;
    public dob F0;
    public zc5 G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public int M0;
    public boolean N0 = false;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public int R0;
    public cd5 S0;
    public long T0;
    public int U0;
    public boolean V0;
    public ExoPlaybackException W0;
    public final Looper X;
    public long X0;
    public final gkf Y;
    public final dkf Z;
    public final ok0[] a;
    public final Set b;
    public final ok0[] c;
    public final oe8 o;
    public final mqf v;
    public final long v0;
    public final sg4 w;
    public final boolean w0;
    public final yg0 x;
    public final wg4 x0;
    public final j7f y;
    public final ArrayList y0;
    public final HandlerThread z;
    public final b7f z0;

    public ed5(ok0[] ok0Arr, oe8 oe8, mqf mqf, sg4 sg4, yg0 yg0, int i, vb4 vb4, tnd tnd, qg4 qg4, boolean z2, Looper looper, b7f b7f, ec5 ec5, lpb lpb) {
        this.A0 = ec5;
        this.a = ok0Arr;
        this.o = oe8;
        this.v = mqf;
        this.w = sg4;
        this.x = yg0;
        this.M0 = i;
        this.E0 = tnd;
        this.D0 = qg4;
        this.I0 = z2;
        this.z0 = b7f;
        this.X0 = -9223372036854775807L;
        this.v0 = sg4.h;
        this.w0 = sg4.i;
        dob h = dob.h(mqf);
        this.F0 = h;
        this.G0 = new zc5(h);
        this.c = new ok0[ok0Arr.length];
        for (int i2 = 0; i2 < ok0Arr.length; i2++) {
            ok0 ok0 = ok0Arr[i2];
            ok0.o = i2;
            ok0.v = lpb;
            this.c[i2] = ok0;
        }
        this.x0 = new wg4(this, b7f);
        this.y0 = new ArrayList();
        this.b = ryg.K();
        this.Y = new gkf();
        this.Z = new dkf();
        oe8.a = this;
        oe8.b = yg0;
        this.V0 = true;
        Handler handler = new Handler(looper);
        this.B0 = new st8(vb4, handler);
        this.C0 = new j09(this, vb4, handler, lpb);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.z = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.X = looper2;
        this.y = b7f.a(looper2, this);
    }

    public static Pair E(ikf ikf, cd5 cd5, boolean z2, int i, boolean z3, gkf gkf, dkf dkf) {
        Object F;
        ikf ikf2 = ikf;
        cd5 cd52 = cd5;
        dkf dkf2 = dkf;
        ikf ikf3 = cd52.a;
        if (ikf.q()) {
            return null;
        }
        ikf ikf4 = ikf3.q() ? ikf2 : ikf3;
        try {
            Pair j = ikf4.j(gkf, dkf, cd52.b, cd52.c);
            if (ikf.equals(ikf4)) {
                return j;
            }
            if (ikf.b(j.first) == -1) {
                gkf gkf2 = gkf;
                if (z2 && (F = F(gkf, dkf, i, z3, j.first, ikf4, ikf)) != null) {
                    return ikf.j(gkf, dkf, ikf.h(F, dkf2).c, -9223372036854775807L);
                }
                return null;
            } else if (!ikf4.h(j.first, dkf2).w || ikf4.n(dkf2.c, gkf, 0).x0 != ikf4.b(j.first)) {
                return j;
            } else {
                return ikf.j(gkf, dkf, ikf.h(j.first, dkf2).c, cd52.c);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public static Object F(gkf gkf, dkf dkf, int i, boolean z2, Object obj, ikf ikf, ikf ikf2) {
        int b2 = ikf.b(obj);
        int i2 = ikf.i();
        int i3 = b2;
        int i4 = -1;
        for (int i5 = 0; i5 < i2 && i4 == -1; i5++) {
            i3 = ikf.d(i3, dkf, gkf, i, z2);
            if (i3 == -1) {
                break;
            }
            i4 = ikf2.b(ikf.m(i3));
        }
        if (i4 == -1) {
            return null;
        }
        return ikf2.m(i4);
    }

    public static void L(ok0 ok0, long j) {
        ok0.Y = true;
        if (ok0 instanceof agf) {
            agf agf = (agf) ok0;
            y64.j(agf.Y);
            agf.J0 = j;
        }
    }

    public static boolean q(ok0 ok0) {
        return ok0.w != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b9, code lost:
        if (r5.equals(r1.F0.b) == false) goto L_0x00bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(boolean r31, boolean r32, boolean r33, boolean r34) {
        /*
            r30 = this;
            r1 = r30
            r2 = 1
            j7f r0 = r1.y
            r3 = 2
            android.os.Handler r0 = r0.a
            r0.removeMessages(r3)
            r3 = 0
            r1.W0 = r3
            r4 = 0
            r1.K0 = r4
            wg4 r0 = r1.x0
            r0.c = r4
            java.lang.Object r0 = r0.o
            tw8 r0 = (defpackage.tw8) r0
            boolean r5 = r0.b
            if (r5 == 0) goto L_0x0026
            long r5 = r0.e()
            r0.a(r5)
            r0.b = r4
        L_0x0026:
            r5 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r1.T0 = r5
            ok0[] r5 = r1.a
            int r6 = r5.length
            r7 = r4
        L_0x0031:
            if (r7 >= r6) goto L_0x0041
            r0 = r5[r7]
            r1.d(r0)     // Catch:{ ExoPlaybackException | RuntimeException -> 0x0039 }
            goto L_0x003f
        L_0x0039:
            r0 = move-exception
            java.lang.String r8 = "Disable failed."
            defpackage.iq.a(r8, r0)
        L_0x003f:
            int r7 = r7 + r2
            goto L_0x0031
        L_0x0041:
            if (r31 == 0) goto L_0x0060
            ok0[] r5 = r1.a
            int r6 = r5.length
            r7 = r4
        L_0x0047:
            if (r7 >= r6) goto L_0x0060
            r0 = r5[r7]
            java.util.Set r8 = r1.b
            boolean r8 = r8.remove(r0)
            if (r8 == 0) goto L_0x005e
            r0.y()     // Catch:{ RuntimeException -> 0x0057 }
            goto L_0x005e
        L_0x0057:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Reset failed."
            defpackage.iq.a(r0, r8)
        L_0x005e:
            int r7 = r7 + r2
            goto L_0x0047
        L_0x0060:
            r1.R0 = r4
            dob r0 = r1.F0
            mz8 r5 = r0.b
            long r6 = r0.s
            dob r0 = r1.F0
            mz8 r0 = r0.b
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0090
            dob r0 = r1.F0
            dkf r8 = r1.Z
            mz8 r9 = r0.b
            ikf r0 = r0.a
            boolean r10 = r0.q()
            if (r10 != 0) goto L_0x0090
            java.lang.Object r9 = r9.a
            dkf r0 = r0.h(r9, r8)
            boolean r0 = r0.w
            if (r0 == 0) goto L_0x008b
            goto L_0x0090
        L_0x008b:
            dob r0 = r1.F0
            long r8 = r0.s
            goto L_0x0094
        L_0x0090:
            dob r0 = r1.F0
            long r8 = r0.c
        L_0x0094:
            if (r32 == 0) goto L_0x00c0
            r1.S0 = r3
            dob r0 = r1.F0
            ikf r0 = r0.a
            android.util.Pair r0 = r1.h(r0)
            java.lang.Object r5 = r0.first
            mz8 r5 = (defpackage.mz8) r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r6 = r0.longValue()
            dob r0 = r1.F0
            mz8 r0 = r0.b
            boolean r0 = r5.equals(r0)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L_0x00c0
        L_0x00bb:
            r18 = r5
            r26 = r6
            goto L_0x00c2
        L_0x00c0:
            r2 = r4
            goto L_0x00bb
        L_0x00c2:
            st8 r0 = r1.B0
            r0.b()
            r1.L0 = r4
            dob r0 = new dob
            dob r5 = r1.F0
            ikf r6 = r5.a
            int r12 = r5.e
            if (r34 == 0) goto L_0x00d5
        L_0x00d3:
            r13 = r3
            goto L_0x00d8
        L_0x00d5:
            com.google.android.exoplayer2.ExoPlaybackException r3 = r5.f
            goto L_0x00d3
        L_0x00d8:
            if (r2 == 0) goto L_0x00de
            tpf r3 = defpackage.tpf.o
        L_0x00dc:
            r15 = r3
            goto L_0x00e1
        L_0x00de:
            tpf r3 = r5.h
            goto L_0x00dc
        L_0x00e1:
            if (r2 == 0) goto L_0x00e8
            mqf r3 = r1.v
        L_0x00e5:
            r16 = r3
            goto L_0x00eb
        L_0x00e8:
            mqf r3 = r5.i
            goto L_0x00e5
        L_0x00eb:
            if (r2 == 0) goto L_0x00f4
            lx5 r2 = defpackage.tb7.b
            k0d r2 = defpackage.k0d.v
        L_0x00f1:
            r17 = r2
            goto L_0x00f7
        L_0x00f4:
            java.util.List r2 = r5.j
            goto L_0x00f1
        L_0x00f7:
            boolean r2 = r5.l
            r19 = r2
            int r2 = r5.m
            r20 = r2
            fob r2 = r5.n
            r21 = r2
            boolean r2 = r1.Q0
            r28 = r2
            r14 = 0
            r24 = 0
            r29 = 0
            r5 = r0
            r7 = r18
            r10 = r26
            r22 = r26
            r5.<init>(r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r26, r28, r29)
            r1.F0 = r0
            if (r33 == 0) goto L_0x015d
            j09 r1 = r1.C0
            java.lang.Object r0 = r1.e
            r2 = r0
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.util.Collection r0 = r2.values()
            java.util.Iterator r3 = r0.iterator()
        L_0x0129:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0151
            java.lang.Object r0 = r3.next()
            r5 = r0
            e09 r5 = (defpackage.e09) r5
            xj0 r0 = r5.a     // Catch:{ RuntimeException -> 0x013e }
            oz8 r6 = r5.b     // Catch:{ RuntimeException -> 0x013e }
            r0.l(r6)     // Catch:{ RuntimeException -> 0x013e }
            goto L_0x0144
        L_0x013e:
            r0 = move-exception
            java.lang.String r6 = "Failed to release child source."
            defpackage.iq.a(r6, r0)
        L_0x0144:
            xj0 r0 = r5.a
            m7f r6 = r5.c
            r0.o(r6)
            xj0 r0 = r5.a
            r0.n(r6)
            goto L_0x0129
        L_0x0151:
            r2.clear()
            java.lang.Object r0 = r1.f
            java.util.HashSet r0 = (java.util.HashSet) r0
            r0.clear()
            r1.g = r4
        L_0x015d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed5.A(boolean, boolean, boolean, boolean):void");
    }

    public final void B() {
        nt8 nt8 = this.B0.h;
        this.J0 = nt8 != null && nt8.f.h && this.I0;
    }

    public final void C(long j) {
        st8 st8 = this.B0;
        nt8 nt8 = st8.h;
        long j2 = j + (nt8 == null ? 1000000000000L : nt8.o);
        this.T0 = j2;
        ((tw8) this.x0.o).a(j2);
        for (ok0 ok0 : this.a) {
            if (q(ok0)) {
                long j3 = this.T0;
                ok0.Y = false;
                ok0.X = j3;
                ok0.q(j3, false);
            }
        }
        for (nt8 nt82 = st8.h; nt82 != null; nt82 = nt82.l) {
            for (ld5 ld5 : (ld5[]) nt82.n.v) {
                if (ld5 != null) {
                    ld5.n();
                }
            }
        }
    }

    public final void D(ikf ikf, ikf ikf2) {
        if (!ikf.q() || !ikf2.q()) {
            ArrayList arrayList = this.y0;
            int size = arrayList.size() - 1;
            if (size < 0) {
                Collections.sort(arrayList);
            } else {
                rae.w(arrayList.get(size));
                throw null;
            }
        }
    }

    public final void G(long j, long j2) {
        j7f j7f = this.y;
        j7f.a.removeMessages(2);
        j7f.a.sendEmptyMessageAtTime(2, j + j2);
    }

    public final void H(boolean z2) {
        mz8 mz8 = this.B0.h.f.a;
        long J = J(mz8, this.F0.s, true, false);
        if (J != this.F0.s) {
            dob dob = this.F0;
            this.F0 = o(mz8, J, dob.c, dob.d, z2, 5);
        }
    }

    public final void I(cd5 cd5) {
        long j;
        long j2;
        boolean z2;
        mz8 mz8;
        long j3;
        long j4;
        long j5;
        dob dob;
        int i;
        cd5 cd52 = cd5;
        boolean z3 = true;
        this.G0.a(1);
        Pair E = E(this.F0.a, cd5, true, this.M0, this.N0, this.Y, this.Z);
        if (E == null) {
            Pair h = h(this.F0.a);
            mz8 = (mz8) h.first;
            long longValue = ((Long) h.second).longValue();
            z2 = !this.F0.a.q();
            j = longValue;
            j2 = -9223372036854775807L;
        } else {
            Object obj = E.first;
            long longValue2 = ((Long) E.second).longValue();
            long j6 = cd52.c == -9223372036854775807L ? -9223372036854775807L : longValue2;
            mz8 m = this.B0.m(this.F0.a, obj, longValue2);
            if (m.a()) {
                this.F0.a.h(m.a, this.Z);
                j = this.Z.e(m.b) == m.c ? this.Z.x.b : 0;
                j2 = j6;
                mz8 = m;
                z2 = true;
            } else {
                j = longValue2;
                j2 = j6;
                z2 = cd52.c == -9223372036854775807L;
                mz8 = m;
            }
        }
        try {
            if (this.F0.a.q()) {
                this.S0 = cd52;
            } else if (E == null) {
                if (this.F0.e != 1) {
                    V(4);
                }
                A(false, true, false, true);
            } else {
                if (mz8.equals(this.F0.b)) {
                    nt8 nt8 = this.B0.h;
                    long F = (nt8 == null || !nt8.d || j == 0) ? j : nt8.a.F(j, this.E0);
                    if (t0g.M(F) == t0g.M(this.F0.s) && ((i = dob.e) == 2 || i == 3)) {
                        long j7 = (dob = this.F0).s;
                        this.F0 = o(mz8, j7, j2, j7, z2, 2);
                        return;
                    }
                    j5 = F;
                } else {
                    j5 = j;
                }
                boolean z4 = this.F0.e == 4;
                st8 st8 = this.B0;
                long J = J(mz8, j5, st8.h != st8.i, z4);
                if (j == J) {
                    z3 = false;
                }
                boolean z5 = z3 | z2;
                try {
                    dob dob2 = this.F0;
                    ikf ikf = dob2.a;
                    e0(ikf, mz8, ikf, dob2.b, j2);
                    z2 = z5;
                    j4 = J;
                    this.F0 = o(mz8, j4, j2, j4, z2, 2);
                } catch (Throwable th) {
                    th = th;
                    z2 = z5;
                    j3 = J;
                    this.F0 = o(mz8, j3, j2, j3, z2, 2);
                    throw th;
                }
            }
            j4 = j;
            this.F0 = o(mz8, j4, j2, j4, z2, 2);
        } catch (Throwable th2) {
            th = th2;
            j3 = j;
            this.F0 = o(mz8, j3, j2, j3, z2, 2);
            throw th;
        }
    }

    public final long J(mz8 mz8, long j, boolean z2, boolean z3) {
        a0();
        this.K0 = false;
        if (z3 || this.F0.e == 3) {
            V(2);
        }
        st8 st8 = this.B0;
        nt8 nt8 = st8.h;
        nt8 nt82 = nt8;
        while (nt82 != null && !mz8.equals(nt82.f.a)) {
            nt82 = nt82.l;
        }
        if (z2 || nt8 != nt82 || (nt82 != null && nt82.o + j < 0)) {
            ok0[] ok0Arr = this.a;
            for (ok0 d : ok0Arr) {
                d(d);
            }
            if (nt82 != null) {
                while (st8.h != nt82) {
                    st8.a();
                }
                st8.k(nt82);
                nt82.o = 1000000000000L;
                f(new boolean[ok0Arr.length]);
            }
        }
        if (nt82 != null) {
            st8.k(nt82);
            if (!nt82.d) {
                nt82.f = nt82.f.b(j);
            } else if (nt82.e) {
                lt8 lt8 = nt82.a;
                j = lt8.s(j);
                lt8.z(j - this.v0, this.w0);
            }
            C(j);
            s();
        } else {
            st8.b();
            C(j);
        }
        k(false);
        this.y.c(2);
        return j;
    }

    public final void K(tpb tpb) {
        Looper looper = tpb.f;
        if (!looper.getThread().isAlive()) {
            tpb.b(false);
            return;
        }
        j7f a2 = this.z0.a(looper, (Handler.Callback) null);
        a2.a.post(new bk4(24, this, tpb));
    }

    public final void M(AtomicBoolean atomicBoolean, boolean z2) {
        if (this.O0 != z2) {
            this.O0 = z2;
            if (!z2) {
                for (ok0 ok0 : this.a) {
                    if (!q(ok0) && this.b.remove(ok0)) {
                        ok0.y();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void N(wc5 wc5) {
        this.G0.a(1);
        int i = wc5.c;
        a9e a9e = wc5.b;
        List list = wc5.a;
        if (i != -1) {
            this.S0 = new cd5(new bqb(list, a9e), wc5.c, wc5.d);
        }
        j09 j09 = this.C0;
        ArrayList arrayList = (ArrayList) j09.b;
        j09.p(0, arrayList.size());
        l(j09.a(arrayList.size(), list, a9e), false);
    }

    public final void O(boolean z2) {
        if (z2 != this.Q0) {
            this.Q0 = z2;
            dob dob = this.F0;
            int i = dob.e;
            if (z2 || i == 4 || i == 1) {
                this.F0 = dob.c(z2);
            } else {
                this.y.c(2);
            }
        }
    }

    public final void P(boolean z2) {
        this.I0 = z2;
        B();
        if (this.J0) {
            st8 st8 = this.B0;
            if (st8.i != st8.h) {
                H(true);
                k(false);
            }
        }
    }

    public final void Q(int i, int i2, boolean z2, boolean z3) {
        this.G0.a(z3 ? 1 : 0);
        zc5 zc5 = this.G0;
        zc5.a = true;
        zc5.f = true;
        zc5.g = i2;
        this.F0 = this.F0.d(i, z2);
        this.K0 = false;
        for (nt8 nt8 = this.B0.h; nt8 != null; nt8 = nt8.l) {
            for (ld5 ld5 : (ld5[]) nt8.n.v) {
                if (ld5 != null) {
                    ld5.c(z2);
                }
            }
        }
        if (!W()) {
            a0();
            d0();
            return;
        }
        int i3 = this.F0.e;
        j7f j7f = this.y;
        if (i3 == 3) {
            Y();
            j7f.c(2);
        } else if (i3 == 2) {
            j7f.c(2);
        }
    }

    public final void R(fob fob) {
        wg4 wg4 = this.x0;
        wg4.g(fob);
        fob c2 = wg4.c();
        n(c2, c2.a, true, true);
    }

    public final void S(int i) {
        this.M0 = i;
        ikf ikf = this.F0.a;
        st8 st8 = this.B0;
        st8.f = i;
        if (!st8.n(ikf)) {
            H(true);
        }
        k(false);
    }

    public final void T(boolean z2) {
        this.N0 = z2;
        ikf ikf = this.F0.a;
        st8 st8 = this.B0;
        st8.g = z2;
        if (!st8.n(ikf)) {
            H(true);
        }
        k(false);
    }

    public final void U(a9e a9e) {
        this.G0.a(1);
        j09 j09 = this.C0;
        int size = ((ArrayList) j09.b).size();
        if (a9e.b.length != size) {
            a9e = new a9e(new Random(a9e.a.nextLong())).a(size);
        }
        j09.l = a9e;
        l(j09.e(), false);
    }

    public final void V(int i) {
        dob dob = this.F0;
        if (dob.e != i) {
            if (i != 2) {
                this.X0 = -9223372036854775807L;
            }
            this.F0 = dob.f(i);
        }
    }

    public final boolean W() {
        dob dob = this.F0;
        return dob.l && dob.m == 0;
    }

    public final boolean X(ikf ikf, mz8 mz8) {
        if (mz8.a() || ikf.q()) {
            return false;
        }
        int i = ikf.h(mz8.a, this.Z).c;
        gkf gkf = this.Y;
        ikf.o(i, gkf);
        return gkf.a() && gkf.z && gkf.w != -9223372036854775807L;
    }

    public final void Y() {
        this.K0 = false;
        wg4 wg4 = this.x0;
        wg4.c = true;
        ((tw8) wg4.o).b();
        for (ok0 ok0 : this.a) {
            if (q(ok0)) {
                y64.j(ok0.w == 1);
                ok0.w = 2;
                ok0.s();
            }
        }
    }

    public final void Z(boolean z2, boolean z3) {
        A(z2 || !this.O0, false, true, false);
        this.G0.a(z3 ? 1 : 0);
        this.w.b(true);
        V(1);
    }

    public final void a(wc5 wc5, int i) {
        this.G0.a(1);
        j09 j09 = this.C0;
        if (i == -1) {
            i = ((ArrayList) j09.b).size();
        }
        l(j09.a(i, wc5.a, wc5.b), false);
    }

    public final void a0() {
        int i;
        wg4 wg4 = this.x0;
        wg4.c = false;
        tw8 tw8 = (tw8) wg4.o;
        if (tw8.b) {
            tw8.a(tw8.e());
            tw8.b = false;
        }
        for (ok0 ok0 : this.a) {
            if (q(ok0) && (i = ok0.w) == 2) {
                y64.j(i == 2);
                ok0.w = 1;
                ok0.t();
            }
        }
    }

    public final void b(psd psd) {
        this.y.a(9, (lt8) psd).b();
    }

    public final void b0() {
        nt8 nt8 = this.B0.j;
        boolean z2 = this.L0 || (nt8 != null && nt8.a.d());
        dob dob = this.F0;
        if (z2 != dob.g) {
            dob dob2 = r2;
            dob dob3 = new dob(dob.a, dob.b, dob.c, dob.d, dob.e, dob.f, z2, dob.h, dob.i, dob.j, dob.k, dob.l, dob.m, dob.n, dob.q, dob.r, dob.s, dob.o, dob.p);
            this.F0 = dob2;
        }
    }

    public final void c(lt8 lt8) {
        this.y.a(8, lt8).b();
    }

    public final void c0(mqf mqf) {
        ld5[] ld5Arr = (ld5[]) mqf.v;
        sg4 sg4 = this.w;
        int i = sg4.f;
        if (i == -1) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                ok0[] ok0Arr = this.a;
                int i4 = 13107200;
                if (i2 < ok0Arr.length) {
                    if (ld5Arr[i2] != null) {
                        switch (ok0Arr[i2].a) {
                            case -2:
                                i4 = 0;
                                break;
                            case 0:
                                i4 = 144310272;
                                break;
                            case 1:
                                break;
                            case 2:
                                i4 = 131072000;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i4 = 131072;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        i3 += i4;
                    }
                    i2++;
                } else {
                    i = Math.max(13107200, i3);
                }
            }
        }
        sg4.j = i;
        sg4.a.b(i);
    }

    public final void d(ok0 ok0) {
        if (q(ok0)) {
            wg4 wg4 = this.x0;
            if (ok0 == ((ok0) wg4.w)) {
                wg4.x = null;
                wg4.w = null;
                wg4.b = true;
            }
            int i = ok0.w;
            if (i == 2) {
                y64.j(i == 2);
                ok0.w = 1;
                ok0.t();
            }
            y64.j(ok0.w == 1);
            ok0.b.j();
            ok0.w = 0;
            ok0.x = null;
            ok0.y = null;
            ok0.Y = false;
            ok0.o();
            this.R0--;
        }
    }

    public final void d0() {
        float f;
        nt8 nt8 = this.B0.h;
        if (nt8 != null) {
            long w2 = nt8.d ? nt8.a.w() : -9223372036854775807L;
            if (w2 != -9223372036854775807L) {
                C(w2);
                if (w2 != this.F0.s) {
                    dob dob = this.F0;
                    this.F0 = o(dob.b, w2, dob.c, w2, true, 5);
                }
            } else {
                wg4 wg4 = this.x0;
                boolean z2 = nt8 != this.B0.i;
                ok0 ok0 = (ok0) wg4.w;
                tw8 tw8 = (tw8) wg4.o;
                if (ok0 == null || ok0.m() || (!((ok0) wg4.w).n() && (z2 || ((ok0) wg4.w).l()))) {
                    wg4.b = true;
                    if (wg4.c) {
                        tw8.b();
                    }
                } else {
                    bn8 bn8 = (bn8) wg4.x;
                    bn8.getClass();
                    long e = bn8.e();
                    if (wg4.b) {
                        if (e >= tw8.e()) {
                            wg4.b = false;
                            if (wg4.c) {
                                tw8.b();
                            }
                        } else if (tw8.b) {
                            tw8.a(tw8.e());
                            tw8.b = false;
                        }
                    }
                    tw8.a(e);
                    fob c2 = bn8.c();
                    if (!c2.equals((fob) tw8.w)) {
                        tw8.g(c2);
                        ((ed5) wg4.v).y.a(16, c2).b();
                    }
                }
                long e2 = wg4.e();
                this.T0 = e2;
                long j = e2 - nt8.o;
                long j2 = this.F0.s;
                if (!this.y0.isEmpty() && !this.F0.b.a()) {
                    if (this.V0) {
                        this.V0 = false;
                    }
                    dob dob2 = this.F0;
                    dob2.a.b(dob2.b.a);
                    int min = Math.min(this.U0, this.y0.size());
                    if (min > 0) {
                        rae.w(this.y0.get(min - 1));
                    }
                    if (min < this.y0.size()) {
                        rae.w(this.y0.get(min));
                    }
                    this.U0 = min;
                }
                this.F0.s = j;
            }
            this.F0.q = this.B0.j.d();
            dob dob3 = this.F0;
            long j3 = dob3.q;
            nt8 nt82 = this.B0.j;
            dob3.r = nt82 == null ? 0 : Math.max(0, j3 - (this.T0 - nt82.o));
            dob dob4 = this.F0;
            if (dob4.l && dob4.e == 3 && X(dob4.a, dob4.b)) {
                dob dob5 = this.F0;
                if (dob5.n.a == 1.0f) {
                    qg4 qg4 = this.D0;
                    long g = g(dob5.a, dob5.b.a, dob5.s);
                    long j4 = this.F0.q;
                    nt8 nt83 = this.B0.j;
                    long max = nt83 == null ? 0 : Math.max(0, j4 - (this.T0 - nt83.o));
                    if (qg4.e == -9223372036854775807L) {
                        f = 1.0f;
                    } else {
                        long j5 = g - max;
                        long j6 = qg4.o;
                        if (j6 == -9223372036854775807L) {
                            qg4.o = j5;
                            qg4.p = 0;
                        } else {
                            float f2 = qg4.d;
                            float f3 = 1.0f - f2;
                            long max2 = Math.max(j5, (long) ((((float) j5) * f3) + (((float) j6) * f2)));
                            qg4.o = max2;
                            qg4.p = (long) ((f3 * ((float) Math.abs(j5 - max2))) + (f2 * ((float) qg4.p)));
                        }
                        if (qg4.n == -9223372036854775807L || SystemClock.elapsedRealtime() - qg4.n >= 1000) {
                            qg4.n = SystemClock.elapsedRealtime();
                            long j7 = (qg4.p * 3) + qg4.o;
                            if (qg4.j > j7) {
                                float D = (float) t0g.D(1000);
                                qg4.j = kr7.D(j7, qg4.g, qg4.j - (((long) ((qg4.m - 1.0f) * D)) + ((long) ((qg4.k - 1.0f) * D))));
                            } else {
                                long k = t0g.k(g - ((long) (Math.max(c44.DEFAULT_ASPECT_RATIO, qg4.m - 1.0f) / 1.0E-7f)), qg4.j, j7);
                                qg4.j = k;
                                long j8 = qg4.i;
                                if (j8 != -9223372036854775807L && k > j8) {
                                    qg4.j = j8;
                                }
                            }
                            long j9 = g - qg4.j;
                            if (Math.abs(j9) < qg4.b) {
                                qg4.m = 1.0f;
                            } else {
                                qg4.m = t0g.i((1.0E-7f * ((float) j9)) + 1.0f, qg4.l, qg4.k);
                            }
                            f = qg4.m;
                        } else {
                            f = qg4.m;
                        }
                    }
                    if (this.x0.c().a != f) {
                        this.x0.g(new fob(f, this.F0.n.b));
                        n(this.F0.n, this.x0.c().a, false, false);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:326:0x051f, code lost:
        if (r8 >= r4.j) goto L_0x0525;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x05e6  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0617  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x0630  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0645  */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x0661  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x02e3 A[EDGE_INSN: B:444:0x02e3->B:173:0x02e3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r47 = this;
            r0 = r47
            b7f r1 = r0.z0
            r1.getClass()
            long r11 = android.os.SystemClock.uptimeMillis()
            dob r1 = r0.F0
            ikf r1 = r1.a
            boolean r1 = r1.q()
            r13 = -9223372036854775808
            r15 = 0
            r9 = 0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0024
            j09 r1 = r0.C0
            boolean r1 = r1.g
            if (r1 != 0) goto L_0x002a
        L_0x0024:
            r16 = r11
            r11 = 1
            r12 = r6
            goto L_0x0373
        L_0x002a:
            st8 r1 = r0.B0
            long r2 = r0.T0
            nt8 r1 = r1.j
            if (r1 == 0) goto L_0x004b
            nt8 r4 = r1.l
            if (r4 != 0) goto L_0x0038
            r4 = 1
            goto L_0x0039
        L_0x0038:
            r4 = r15
        L_0x0039:
            defpackage.y64.j(r4)
            boolean r4 = r1.d
            if (r4 == 0) goto L_0x004b
            lt8 r4 = r1.a
            r16 = r11
            long r10 = r1.o
            long r2 = r2 - r10
            r4.A(r2)
            goto L_0x004d
        L_0x004b:
            r16 = r11
        L_0x004d:
            st8 r1 = r0.B0
            nt8 r2 = r1.j
            if (r2 == 0) goto L_0x007b
            qt8 r3 = r2.f
            boolean r3 = r3.i
            if (r3 != 0) goto L_0x0115
            boolean r3 = r2.d
            if (r3 == 0) goto L_0x0115
            boolean r3 = r2.e
            if (r3 == 0) goto L_0x006b
            lt8 r2 = r2.a
            long r2 = r2.y()
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0115
        L_0x006b:
            nt8 r2 = r1.j
            qt8 r2 = r2.f
            long r2 = r2.e
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0115
            int r1 = r1.k
            r2 = 100
            if (r1 >= r2) goto L_0x0115
        L_0x007b:
            st8 r1 = r0.B0
            long r2 = r0.T0
            dob r4 = r0.F0
            nt8 r5 = r1.j
            if (r5 != 0) goto L_0x009c
            ikf r2 = r4.a
            mz8 r3 = r4.b
            long r10 = r4.c
            long r4 = r4.s
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r10
            r23 = r4
            qt8 r1 = r18.d(r19, r20, r21, r23)
            goto L_0x00a2
        L_0x009c:
            ikf r4 = r4.a
            qt8 r1 = r1.c(r4, r5, r2)
        L_0x00a2:
            if (r1 == 0) goto L_0x0115
            st8 r2 = r0.B0
            ok0[] r3 = r0.c
            oe8 r4 = r0.o
            sg4 r5 = r0.w
            cb4 r5 = r5.a
            j09 r8 = r0.C0
            mqf r10 = r0.v
            nt8 r11 = r2.j
            if (r11 != 0) goto L_0x00be
            r18 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r20 = r18
            goto L_0x00ca
        L_0x00be:
            long r6 = r11.o
            qt8 r11 = r11.f
            long r12 = r11.e
            long r6 = r6 + r12
            long r11 = r1.b
            long r6 = r6 - r11
            r20 = r6
        L_0x00ca:
            nt8 r6 = new nt8
            r18 = r6
            r19 = r3
            r22 = r4
            r23 = r5
            r24 = r8
            r25 = r1
            r26 = r10
            r18.<init>(r19, r20, r22, r23, r24, r25, r26)
            nt8 r3 = r2.j
            if (r3 == 0) goto L_0x00ef
            nt8 r4 = r3.l
            if (r6 != r4) goto L_0x00e6
            goto L_0x00f3
        L_0x00e6:
            r3.b()
            r3.l = r6
            r3.c()
            goto L_0x00f3
        L_0x00ef:
            r2.h = r6
            r2.i = r6
        L_0x00f3:
            r2.l = r9
            r2.j = r6
            int r3 = r2.k
            r4 = 1
            int r3 = r3 + r4
            r2.k = r3
            r2.j()
            lt8 r2 = r6.a
            long r3 = r1.b
            r2.S(r0, r3)
            st8 r2 = r0.B0
            nt8 r2 = r2.h
            if (r2 != r6) goto L_0x0112
            long r1 = r1.b
            r0.C(r1)
        L_0x0112:
            r0.k(r15)
        L_0x0115:
            boolean r1 = r0.L0
            if (r1 == 0) goto L_0x0123
            boolean r1 = r47.p()
            r0.L0 = r1
            r47.b0()
            goto L_0x0126
        L_0x0123:
            r47.s()
        L_0x0126:
            st8 r1 = r0.B0
            nt8 r2 = r1.i
            if (r2 != 0) goto L_0x0133
        L_0x012c:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x026d
        L_0x0133:
            nt8 r3 = r2.l
            ok0[] r8 = r0.a
            if (r3 == 0) goto L_0x013d
            boolean r3 = r0.J0
            if (r3 == 0) goto L_0x0144
        L_0x013d:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0234
        L_0x0144:
            boolean r3 = r2.d
            if (r3 != 0) goto L_0x0149
            goto L_0x012c
        L_0x0149:
            r3 = r15
        L_0x014a:
            int r4 = r8.length
            if (r3 >= r4) goto L_0x0180
            r4 = r8[r3]
            kcd[] r5 = r2.c
            r5 = r5[r3]
            kcd r6 = r4.x
            if (r6 != r5) goto L_0x012c
            if (r5 == 0) goto L_0x017d
            boolean r5 = r4.l()
            if (r5 != 0) goto L_0x017d
            nt8 r5 = r2.l
            qt8 r6 = r2.f
            boolean r6 = r6.f
            if (r6 == 0) goto L_0x012c
            boolean r6 = r5.d
            if (r6 == 0) goto L_0x012c
            boolean r6 = r4 instanceof defpackage.agf
            if (r6 != 0) goto L_0x017d
            boolean r6 = r4 instanceof defpackage.dq9
            if (r6 != 0) goto L_0x017d
            long r6 = r4.X
            long r4 = r5.e()
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x012c
        L_0x017d:
            int r3 = r3 + 1
            goto L_0x014a
        L_0x0180:
            nt8 r3 = r2.l
            boolean r4 = r3.d
            if (r4 != 0) goto L_0x0191
            long r4 = r0.T0
            long r6 = r3.e()
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0191
            goto L_0x012c
        L_0x0191:
            mqf r10 = r2.n
            nt8 r3 = r1.i
            if (r3 == 0) goto L_0x019d
            nt8 r3 = r3.l
            if (r3 == 0) goto L_0x019d
            r3 = 1
            goto L_0x019e
        L_0x019d:
            r3 = r15
        L_0x019e:
            defpackage.y64.j(r3)
            nt8 r3 = r1.i
            nt8 r3 = r3.l
            r1.i = r3
            r1.j()
            nt8 r11 = r1.i
            mqf r13 = r11.n
            dob r1 = r0.F0
            ikf r4 = r1.a
            qt8 r1 = r11.f
            mz8 r3 = r1.a
            qt8 r1 = r2.f
            mz8 r5 = r1.a
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r47
            r2 = r4
            r18 = r13
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.e0(r2, r3, r4, r5, r6)
            boolean r1 = r11.d
            if (r1 == 0) goto L_0x01ee
            lt8 r1 = r11.a
            long r1 = r1.w()
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x01ee
            long r1 = r11.e()
            int r3 = r8.length
            r4 = r15
        L_0x01e0:
            if (r4 >= r3) goto L_0x026d
            r5 = r8[r4]
            kcd r6 = r5.x
            if (r6 == 0) goto L_0x01eb
            L(r5, r1)
        L_0x01eb:
            int r4 = r4 + 1
            goto L_0x01e0
        L_0x01ee:
            r1 = r15
        L_0x01ef:
            int r2 = r8.length
            if (r1 >= r2) goto L_0x026d
            boolean r2 = r10.N(r1)
            r3 = r18
            boolean r4 = r3.N(r1)
            if (r2 == 0) goto L_0x022f
            r2 = r8[r1]
            boolean r2 = r2.Y
            if (r2 != 0) goto L_0x022f
            ok0[] r2 = r0.c
            r2 = r2[r1]
            int r2 = r2.a
            r5 = -2
            if (r2 != r5) goto L_0x020f
            r2 = 1
            goto L_0x0210
        L_0x020f:
            r2 = r15
        L_0x0210:
            java.lang.Object r5 = r10.o
            r1d[] r5 = (defpackage.r1d[]) r5
            r5 = r5[r1]
            java.lang.Object r6 = r3.o
            r1d[] r6 = (defpackage.r1d[]) r6
            r6 = r6[r1]
            if (r4 == 0) goto L_0x0226
            boolean r4 = r6.equals(r5)
            if (r4 == 0) goto L_0x0226
            if (r2 == 0) goto L_0x022f
        L_0x0226:
            r2 = r8[r1]
            long r4 = r11.e()
            L(r2, r4)
        L_0x022f:
            int r1 = r1 + 1
            r18 = r3
            goto L_0x01ef
        L_0x0234:
            qt8 r1 = r2.f
            boolean r1 = r1.i
            if (r1 != 0) goto L_0x023e
            boolean r1 = r0.J0
            if (r1 == 0) goto L_0x026d
        L_0x023e:
            r1 = r15
        L_0x023f:
            int r3 = r8.length
            if (r1 >= r3) goto L_0x026d
            r3 = r8[r1]
            kcd[] r4 = r2.c
            r4 = r4[r1]
            if (r4 == 0) goto L_0x026a
            kcd r5 = r3.x
            if (r5 != r4) goto L_0x026a
            boolean r4 = r3.l()
            if (r4 == 0) goto L_0x026a
            qt8 r4 = r2.f
            long r4 = r4.e
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x0266
            r6 = -9223372036854775808
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0266
            long r6 = r2.o
            long r6 = r6 + r4
            goto L_0x0267
        L_0x0266:
            r6 = r12
        L_0x0267:
            L(r3, r6)
        L_0x026a:
            int r1 = r1 + 1
            goto L_0x023f
        L_0x026d:
            st8 r1 = r0.B0
            nt8 r2 = r1.i
            if (r2 == 0) goto L_0x02ee
            nt8 r1 = r1.h
            if (r1 == r2) goto L_0x02ee
            boolean r1 = r2.g
            if (r1 == 0) goto L_0x027d
            goto L_0x02ee
        L_0x027d:
            mqf r1 = r2.n
            r3 = r15
            r4 = r3
        L_0x0281:
            ok0[] r5 = r0.a
            int r6 = r5.length
            if (r4 >= r6) goto L_0x02e3
            r5 = r5[r4]
            boolean r6 = q(r5)
            if (r6 != 0) goto L_0x028f
            goto L_0x02e0
        L_0x028f:
            kcd r6 = r5.x
            kcd[] r7 = r2.c
            r8 = r7[r4]
            if (r6 == r8) goto L_0x0299
            r6 = 1
            goto L_0x029a
        L_0x0299:
            r6 = r15
        L_0x029a:
            boolean r8 = r1.N(r4)
            if (r8 == 0) goto L_0x02a3
            if (r6 != 0) goto L_0x02a3
            goto L_0x02e0
        L_0x02a3:
            boolean r6 = r5.Y
            if (r6 != 0) goto L_0x02d5
            java.lang.Object r6 = r1.v
            ld5[] r6 = (defpackage.ld5[]) r6
            r6 = r6[r4]
            if (r6 == 0) goto L_0x02b4
            int r8 = r6.length()
            goto L_0x02b5
        L_0x02b4:
            r8 = r15
        L_0x02b5:
            ca6[] r10 = new defpackage.ca6[r8]
            r11 = r15
        L_0x02b8:
            if (r11 >= r8) goto L_0x02c3
            ca6 r18 = r6.d(r11)
            r10[r11] = r18
            int r11 = r11 + 1
            goto L_0x02b8
        L_0x02c3:
            r20 = r7[r4]
            long r21 = r2.e()
            long r6 = r2.o
            r18 = r5
            r19 = r10
            r23 = r6
            r18.x(r19, r20, r21, r23)
            goto L_0x02e0
        L_0x02d5:
            boolean r6 = r5.m()
            if (r6 == 0) goto L_0x02df
            r0.d(r5)
            goto L_0x02e0
        L_0x02df:
            r3 = 1
        L_0x02e0:
            int r4 = r4 + 1
            goto L_0x0281
        L_0x02e3:
            r4 = 1
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x02ee
            int r1 = r5.length
            boolean[] r1 = new boolean[r1]
            r0.f(r1)
        L_0x02ee:
            r14 = r15
        L_0x02ef:
            boolean r1 = r47.W()
            if (r1 != 0) goto L_0x02f7
            goto L_0x0372
        L_0x02f7:
            boolean r1 = r0.J0
            if (r1 == 0) goto L_0x02fd
            goto L_0x0372
        L_0x02fd:
            st8 r1 = r0.B0
            nt8 r3 = r1.h
            if (r3 != 0) goto L_0x0305
            goto L_0x0372
        L_0x0305:
            nt8 r3 = r3.l
            if (r3 == 0) goto L_0x0372
            long r4 = r0.T0
            long r6 = r3.e()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x0372
            boolean r3 = r3.g
            if (r3 == 0) goto L_0x0372
            if (r14 == 0) goto L_0x031c
            r47.t()
        L_0x031c:
            nt8 r1 = r1.a()
            r1.getClass()
            dob r3 = r0.F0
            mz8 r3 = r3.b
            java.lang.Object r3 = r3.a
            qt8 r4 = r1.f
            mz8 r4 = r4.a
            java.lang.Object r4 = r4.a
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x034e
            dob r3 = r0.F0
            mz8 r3 = r3.b
            int r4 = r3.b
            r5 = -1
            if (r4 != r5) goto L_0x034e
            qt8 r4 = r1.f
            mz8 r4 = r4.a
            int r6 = r4.b
            if (r6 != r5) goto L_0x034e
            int r3 = r3.e
            int r4 = r4.e
            if (r3 == r4) goto L_0x034e
            r14 = 1
            goto L_0x034f
        L_0x034e:
            r14 = r15
        L_0x034f:
            qt8 r1 = r1.f
            mz8 r3 = r1.a
            long r7 = r1.b
            long r5 = r1.c
            r10 = 1
            r11 = r14 ^ 1
            r14 = 0
            r1 = r47
            r2 = r3
            r3 = r7
            r9 = r11
            r11 = r10
            r10 = r14
            dob r1 = r1.o(r2, r3, r5, r7, r9, r10)
            r0.F0 = r1
            r47.B()
            r47.d0()
            r14 = r11
            r9 = 0
            goto L_0x02ef
        L_0x0372:
            r11 = 1
        L_0x0373:
            dob r1 = r0.F0
            int r1 = r1.e
            if (r1 == r11) goto L_0x06c3
            r3 = 4
            if (r1 != r3) goto L_0x037e
            goto L_0x06c3
        L_0x037e:
            st8 r1 = r0.B0
            nt8 r1 = r1.h
            r4 = 10
            if (r1 != 0) goto L_0x038c
            r6 = r16
            r0.G(r6, r4)
            return
        L_0x038c:
            r6 = r16
            java.lang.String r8 = "doSomeWork"
            defpackage.m5a.f(r8)
            r47.d0()
            boolean r8 = r1.d
            r9 = 1000(0x3e8, double:4.94E-321)
            if (r8 == 0) goto L_0x0410
            long r16 = android.os.SystemClock.elapsedRealtime()
            long r4 = r16 * r9
            lt8 r8 = r1.a
            dob r14 = r0.F0
            long r9 = r14.s
            long r2 = r0.v0
            long r9 = r9 - r2
            boolean r2 = r0.w0
            r8.z(r9, r2)
            r2 = r11
            r10 = r2
            r3 = r15
        L_0x03b3:
            ok0[] r8 = r0.a
            int r9 = r8.length
            if (r3 >= r9) goto L_0x0417
            r8 = r8[r3]
            boolean r9 = q(r8)
            if (r9 != 0) goto L_0x03c1
            goto L_0x040c
        L_0x03c1:
            long r14 = r0.T0
            r8.w(r14, r4)
            if (r10 == 0) goto L_0x03d0
            boolean r10 = r8.m()
            if (r10 == 0) goto L_0x03d0
            r10 = r11
            goto L_0x03d1
        L_0x03d0:
            r10 = 0
        L_0x03d1:
            kcd[] r14 = r1.c
            r14 = r14[r3]
            kcd r15 = r8.x
            if (r14 == r15) goto L_0x03db
            r14 = r11
            goto L_0x03dc
        L_0x03db:
            r14 = 0
        L_0x03dc:
            if (r14 != 0) goto L_0x03e6
            boolean r15 = r8.l()
            if (r15 == 0) goto L_0x03e6
            r15 = r11
            goto L_0x03e7
        L_0x03e6:
            r15 = 0
        L_0x03e7:
            if (r14 != 0) goto L_0x03fa
            if (r15 != 0) goto L_0x03fa
            boolean r14 = r8.n()
            if (r14 != 0) goto L_0x03fa
            boolean r14 = r8.m()
            if (r14 == 0) goto L_0x03f8
            goto L_0x03fa
        L_0x03f8:
            r14 = 0
            goto L_0x03fb
        L_0x03fa:
            r14 = r11
        L_0x03fb:
            if (r2 == 0) goto L_0x0401
            if (r14 == 0) goto L_0x0401
            r2 = r11
            goto L_0x0402
        L_0x0401:
            r2 = 0
        L_0x0402:
            if (r14 != 0) goto L_0x040c
            kcd r8 = r8.x
            r8.getClass()
            r8.b()
        L_0x040c:
            int r3 = r3 + 1
            r15 = 0
            goto L_0x03b3
        L_0x0410:
            lt8 r2 = r1.a
            r2.r()
            r2 = r11
            r10 = r2
        L_0x0417:
            qt8 r3 = r1.f
            long r3 = r3.e
            if (r10 == 0) goto L_0x042f
            boolean r5 = r1.d
            if (r5 == 0) goto L_0x042f
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x042d
            dob r5 = r0.F0
            long r14 = r5.s
            int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r3 > 0) goto L_0x042f
        L_0x042d:
            r10 = r11
            goto L_0x0430
        L_0x042f:
            r10 = 0
        L_0x0430:
            if (r10 == 0) goto L_0x0441
            boolean r3 = r0.J0
            if (r3 == 0) goto L_0x0441
            r3 = 0
            r0.J0 = r3
            dob r4 = r0.F0
            int r4 = r4.m
            r5 = 5
            r0.Q(r4, r5, r3, r3)
        L_0x0441:
            r3 = 3
            if (r10 == 0) goto L_0x0453
            qt8 r4 = r1.f
            boolean r4 = r4.i
            if (r4 == 0) goto L_0x0453
            r4 = 4
            r0.V(r4)
            r47.a0()
            goto L_0x059a
        L_0x0453:
            dob r4 = r0.F0
            int r5 = r4.e
            r8 = 2
            if (r5 != r8) goto L_0x0538
            int r5 = r0.R0
            if (r5 != 0) goto L_0x0465
            boolean r10 = r47.r()
            r4 = r10
            goto L_0x0526
        L_0x0465:
            if (r2 != 0) goto L_0x046a
        L_0x0467:
            r4 = 0
            goto L_0x0526
        L_0x046a:
            boolean r5 = r4.g
            if (r5 != 0) goto L_0x0471
            r4 = r11
            goto L_0x0526
        L_0x0471:
            ikf r4 = r4.a
            st8 r5 = r0.B0
            nt8 r8 = r5.h
            qt8 r8 = r8.f
            mz8 r8 = r8.a
            boolean r4 = r0.X(r4, r8)
            if (r4 == 0) goto L_0x0486
            qg4 r4 = r0.D0
            long r9 = r4.j
            goto L_0x0487
        L_0x0486:
            r9 = r12
        L_0x0487:
            nt8 r4 = r5.j
            boolean r5 = r4.d
            if (r5 == 0) goto L_0x04a5
            boolean r5 = r4.e
            if (r5 == 0) goto L_0x049d
            lt8 r5 = r4.a
            long r21 = r5.y()
            r23 = -9223372036854775808
            int r5 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r5 != 0) goto L_0x04a5
        L_0x049d:
            qt8 r5 = r4.f
            boolean r5 = r5.i
            if (r5 == 0) goto L_0x04a5
            r5 = r11
            goto L_0x04a6
        L_0x04a5:
            r5 = 0
        L_0x04a6:
            qt8 r15 = r4.f
            mz8 r15 = r15.a
            boolean r15 = r15.a()
            if (r15 == 0) goto L_0x04b6
            boolean r4 = r4.d
            if (r4 != 0) goto L_0x04b6
            r4 = r11
            goto L_0x04b7
        L_0x04b6:
            r4 = 0
        L_0x04b7:
            if (r5 != 0) goto L_0x0525
            if (r4 != 0) goto L_0x0525
            dob r4 = r0.F0
            long r4 = r4.q
            st8 r15 = r0.B0
            nt8 r15 = r15.j
            r22 = r9
            r8 = 0
            if (r15 != 0) goto L_0x04cb
            r4 = r8
            goto L_0x04d5
        L_0x04cb:
            long r11 = r0.T0
            long r14 = r15.o
            long r11 = r11 - r14
            long r4 = r4 - r11
            long r4 = java.lang.Math.max(r8, r4)
        L_0x04d5:
            wg4 r11 = r0.x0
            fob r11 = r11.c()
            float r11 = r11.a
            boolean r12 = r0.K0
            sg4 r14 = r0.w
            r14.getClass()
            long r4 = defpackage.t0g.w(r4, r11)
            if (r12 == 0) goto L_0x04f2
            long r11 = r14.e
        L_0x04ec:
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x04f5
        L_0x04f2:
            long r11 = r14.d
            goto L_0x04ec
        L_0x04f5:
            int r15 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r15 == 0) goto L_0x0504
            r24 = 2
            r26 = r14
            long r13 = r22 / r24
            long r11 = java.lang.Math.min(r13, r11)
            goto L_0x0506
        L_0x0504:
            r26 = r14
        L_0x0506:
            int r8 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x0525
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x0525
            r4 = r26
            boolean r5 = r4.g
            if (r5 != 0) goto L_0x0467
            cb4 r5 = r4.a
            monitor-enter(r5)
            int r8 = r5.e     // Catch:{ all -> 0x0522 }
            int r9 = r5.c     // Catch:{ all -> 0x0522 }
            int r8 = r8 * r9
            monitor-exit(r5)
            int r4 = r4.j
            if (r8 < r4) goto L_0x0467
            goto L_0x0525
        L_0x0522:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0522 }
            throw r0
        L_0x0525:
            r4 = 1
        L_0x0526:
            if (r4 == 0) goto L_0x0538
            r0.V(r3)
            r2 = 0
            r0.W0 = r2
            boolean r2 = r47.W()
            if (r2 == 0) goto L_0x059a
            r47.Y()
            goto L_0x059a
        L_0x0538:
            dob r4 = r0.F0
            int r4 = r4.e
            if (r4 != r3) goto L_0x059a
            int r4 = r0.R0
            if (r4 != 0) goto L_0x0549
            boolean r2 = r47.r()
            if (r2 == 0) goto L_0x054b
            goto L_0x059a
        L_0x0549:
            if (r2 != 0) goto L_0x059a
        L_0x054b:
            boolean r2 = r47.W()
            r0.K0 = r2
            r2 = 2
            r0.V(r2)
            boolean r2 = r0.K0
            if (r2 == 0) goto L_0x0597
            st8 r2 = r0.B0
            nt8 r2 = r2.h
        L_0x055d:
            if (r2 == 0) goto L_0x0576
            mqf r4 = r2.n
            java.lang.Object r4 = r4.v
            ld5[] r4 = (defpackage.ld5[]) r4
            int r5 = r4.length
            r8 = 0
        L_0x0567:
            if (r8 >= r5) goto L_0x0573
            r9 = r4[r8]
            if (r9 == 0) goto L_0x0570
            r9.o()
        L_0x0570:
            int r8 = r8 + 1
            goto L_0x0567
        L_0x0573:
            nt8 r2 = r2.l
            goto L_0x055d
        L_0x0576:
            qg4 r2 = r0.D0
            long r4 = r2.j
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r11 != 0) goto L_0x0584
            goto L_0x0597
        L_0x0584:
            long r11 = r2.c
            long r4 = r4 + r11
            r2.j = r4
            long r11 = r2.i
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x0595
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0595
            r2.j = r11
        L_0x0595:
            r2.n = r8
        L_0x0597:
            r47.a0()
        L_0x059a:
            dob r2 = r0.F0
            int r2 = r2.e
            r4 = 2
            if (r2 != r4) goto L_0x05db
            r2 = 0
        L_0x05a2:
            ok0[] r4 = r0.a
            int r5 = r4.length
            if (r2 >= r5) goto L_0x05c4
            r4 = r4[r2]
            boolean r4 = q(r4)
            if (r4 == 0) goto L_0x05c1
            ok0[] r4 = r0.a
            r4 = r4[r2]
            kcd r4 = r4.x
            kcd[] r5 = r1.c
            r5 = r5[r2]
            if (r4 != r5) goto L_0x05c1
            r4.getClass()
            r4.b()
        L_0x05c1:
            int r2 = r2 + 1
            goto L_0x05a2
        L_0x05c4:
            dob r1 = r0.F0
            boolean r2 = r1.g
            if (r2 != 0) goto L_0x05db
            long r1 = r1.r
            r4 = 500000(0x7a120, double:2.47033E-318)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x05db
            boolean r1 = r47.p()
            if (r1 == 0) goto L_0x05db
            r1 = 1
            goto L_0x05dc
        L_0x05db:
            r1 = 0
        L_0x05dc:
            if (r1 != 0) goto L_0x05e6
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.X0 = r1
            goto L_0x060f
        L_0x05e6:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r4 = r0.X0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x05fd
            b7f r1 = r0.z0
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.X0 = r1
            goto L_0x060f
        L_0x05fd:
            b7f r1 = r0.z0
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r4 = r0.X0
            long r1 = r1 - r4
            r4 = 4000(0xfa0, double:1.9763E-320)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x06bb
        L_0x060f:
            boolean r1 = r0.Q0
            dob r2 = r0.F0
            boolean r4 = r2.o
            if (r1 == r4) goto L_0x061d
            dob r1 = r2.c(r1)
            r0.F0 = r1
        L_0x061d:
            boolean r1 = r47.W()
            if (r1 == 0) goto L_0x0629
            dob r1 = r0.F0
            int r1 = r1.e
            if (r1 == r3) goto L_0x0630
        L_0x0629:
            dob r1 = r0.F0
            int r1 = r1.e
            r2 = 2
            if (r1 != r2) goto L_0x0645
        L_0x0630:
            boolean r1 = r0.Q0
            if (r1 == 0) goto L_0x063b
            boolean r1 = r0.P0
            if (r1 == 0) goto L_0x063b
            r1 = 1
            r10 = 0
            goto L_0x0642
        L_0x063b:
            r1 = 10
            r0.G(r6, r1)
            r1 = 1
            r10 = 1
        L_0x0642:
            r3 = r10 ^ 1
            goto L_0x065b
        L_0x0645:
            int r2 = r0.R0
            if (r2 == 0) goto L_0x0652
            r2 = 4
            if (r1 == r2) goto L_0x0652
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.G(r6, r1)
            goto L_0x065a
        L_0x0652:
            j7f r1 = r0.y
            android.os.Handler r1 = r1.a
            r2 = 2
            r1.removeMessages(r2)
        L_0x065a:
            r3 = 0
        L_0x065b:
            dob r1 = r0.F0
            boolean r2 = r1.p
            if (r2 == r3) goto L_0x06b4
            dob r2 = new dob
            r22 = r2
            ikf r4 = r1.a
            r23 = r4
            mz8 r4 = r1.b
            r24 = r4
            long r4 = r1.c
            r25 = r4
            long r4 = r1.d
            r27 = r4
            int r4 = r1.e
            r29 = r4
            com.google.android.exoplayer2.ExoPlaybackException r4 = r1.f
            r30 = r4
            boolean r4 = r1.g
            r31 = r4
            tpf r4 = r1.h
            r32 = r4
            mqf r4 = r1.i
            r33 = r4
            java.util.List r4 = r1.j
            r34 = r4
            mz8 r4 = r1.k
            r35 = r4
            boolean r4 = r1.l
            r36 = r4
            int r4 = r1.m
            r37 = r4
            fob r4 = r1.n
            r38 = r4
            long r4 = r1.q
            r39 = r4
            long r4 = r1.r
            r41 = r4
            long r4 = r1.s
            r43 = r4
            boolean r1 = r1.o
            r45 = r1
            r46 = r3
            r22.<init>(r23, r24, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r43, r45, r46)
            r0.F0 = r2
        L_0x06b4:
            r1 = 0
            r0.P0 = r1
            defpackage.m5a.s()
            return
        L_0x06bb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Playback stuck buffering and not loading"
            r0.<init>(r1)
            throw r0
        L_0x06c3:
            j7f r0 = r0.y
            android.os.Handler r0 = r0.a
            r1 = 2
            r0.removeMessages(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed5.e():void");
    }

    public final void e0(ikf ikf, mz8 mz8, ikf ikf2, mz8 mz82, long j) {
        if (!X(ikf, mz8)) {
            fob fob = mz8.a() ? fob.o : this.F0.n;
            wg4 wg4 = this.x0;
            if (!wg4.c().equals(fob)) {
                wg4.g(fob);
                return;
            }
            return;
        }
        Object obj = mz8.a;
        dkf dkf = this.Z;
        int i = ikf.h(obj, dkf).c;
        gkf gkf = this.Y;
        ikf.o(i, gkf);
        vq8 vq8 = gkf.Y;
        int i2 = t0g.a;
        qg4 qg4 = this.D0;
        qg4.getClass();
        qg4.e = t0g.D(vq8.a);
        qg4.h = t0g.D(vq8.b);
        qg4.i = t0g.D(vq8.c);
        float f = vq8.o;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        qg4.l = f;
        float f2 = vq8.v;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        qg4.k = f2;
        if (f == 1.0f && f2 == 1.0f) {
            qg4.e = -9223372036854775807L;
        }
        qg4.a();
        if (j != -9223372036854775807L) {
            qg4.f = g(ikf, obj, j);
            qg4.a();
            return;
        }
        if (!t0g.a(!ikf2.q() ? ikf2.n(ikf2.h(mz82.a, dkf).c, gkf, 0).a : null, gkf.a)) {
            qg4.f = -9223372036854775807L;
            qg4.a();
        }
    }

    public final void f(boolean[] zArr) {
        ok0[] ok0Arr;
        Set set;
        int i;
        ok0[] ok0Arr2;
        nt8 nt8;
        st8 st8;
        bn8 bn8;
        st8 st82 = this.B0;
        nt8 nt82 = st82.i;
        mqf mqf = nt82.n;
        int i2 = 0;
        while (true) {
            ok0Arr = this.a;
            int length = ok0Arr.length;
            set = this.b;
            if (i2 >= length) {
                break;
            }
            if (!mqf.N(i2) && set.remove(ok0Arr[i2])) {
                ok0Arr[i2].y();
            }
            i2++;
        }
        int i3 = 0;
        while (i3 < ok0Arr.length) {
            if (mqf.N(i3)) {
                boolean z2 = zArr[i3];
                ok0 ok0 = ok0Arr[i3];
                if (!q(ok0)) {
                    nt8 nt83 = st82.i;
                    boolean z3 = nt83 == st82.h;
                    mqf mqf2 = nt83.n;
                    r1d r1d = ((r1d[]) mqf2.o)[i3];
                    ld5 ld5 = ((ld5[]) mqf2.v)[i3];
                    int length2 = ld5 != null ? ld5.length() : 0;
                    ca6[] ca6Arr = new ca6[length2];
                    for (int i4 = 0; i4 < length2; i4++) {
                        ca6Arr[i4] = ld5.d(i4);
                    }
                    boolean z4 = W() && this.F0.e == 3;
                    boolean z5 = !z2 && z4;
                    this.R0++;
                    set.add(ok0);
                    kcd kcd = nt83.c[i3];
                    st8 = st82;
                    nt8 = nt82;
                    long j = this.T0;
                    long e = nt83.e();
                    i = i3;
                    ok0Arr2 = ok0Arr;
                    long j2 = nt83.o;
                    y64.j(ok0.w == 0);
                    ok0.c = r1d;
                    ok0.w = 1;
                    ok0.p(z5, z3);
                    ok0 ok02 = ok0;
                    ok0.x(ca6Arr, kcd, e, j2);
                    ok02.Y = false;
                    ok02.X = j;
                    ok02.q(j, z5);
                    ok02.a(11, new uc5(this));
                    wg4 wg4 = this.x0;
                    wg4.getClass();
                    bn8 j3 = ok02.j();
                    if (!(j3 == null || j3 == (bn8 = (bn8) wg4.x))) {
                        if (bn8 == null) {
                            wg4.x = j3;
                            wg4.w = ok02;
                            ((kn8) j3).g((fob) ((tw8) wg4.o).w);
                        } else {
                            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z4) {
                        y64.j(ok02.w == 1);
                        ok02.w = 2;
                        ok02.s();
                    }
                    i3 = i + 1;
                    st82 = st8;
                    nt82 = nt8;
                    ok0Arr = ok0Arr2;
                }
            }
            st8 = st82;
            nt8 = nt82;
            i = i3;
            ok0Arr2 = ok0Arr;
            i3 = i + 1;
            st82 = st8;
            nt82 = nt8;
            ok0Arr = ok0Arr2;
        }
        nt82.g = true;
    }

    public final long g(ikf ikf, Object obj, long j) {
        dkf dkf = this.Z;
        int i = ikf.h(obj, dkf).c;
        gkf gkf = this.Y;
        ikf.o(i, gkf);
        if (gkf.w == -9223372036854775807L || !gkf.a() || !gkf.z) {
            return -9223372036854775807L;
        }
        return t0g.D(t0g.t(gkf.x) - gkf.w) - (j + dkf.v);
    }

    public final Pair h(ikf ikf) {
        long j = 0;
        if (ikf.q()) {
            return Pair.create(dob.t, 0L);
        }
        int a2 = ikf.a(this.N0);
        ikf ikf2 = ikf;
        Pair j2 = ikf2.j(this.Y, this.Z, a2, -9223372036854775807L);
        mz8 m = this.B0.m(ikf, j2.first, 0);
        long longValue = ((Long) j2.second).longValue();
        if (m.a()) {
            Object obj = m.a;
            dkf dkf = this.Z;
            ikf.h(obj, dkf);
            if (m.c == dkf.e(m.b)) {
                j = dkf.x.b;
            }
            longValue = j;
        }
        return Pair.create(m, Long.valueOf(longValue));
    }

    public final boolean handleMessage(Message message) {
        nt8 nt8;
        int i;
        tpb tpb;
        int i2 = 1000;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    Q(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    e();
                    break;
                case 3:
                    I((cd5) message.obj);
                    break;
                case 4:
                    R((fob) message.obj);
                    break;
                case 5:
                    this.E0 = (tnd) message.obj;
                    break;
                case 6:
                    Z(false, true);
                    break;
                case 7:
                    x();
                    return true;
                case 8:
                    m((lt8) message.obj);
                    break;
                case 9:
                    i((lt8) message.obj);
                    break;
                case 10:
                    z();
                    break;
                case 11:
                    S(message.arg1);
                    break;
                case 12:
                    T(message.arg1 != 0);
                    break;
                case 13:
                    M((AtomicBoolean) message.obj, message.arg1 != 0);
                    break;
                case Protos.Attaches.Attach.LOCATION /*14*/:
                    tpb = (tpb) message.obj;
                    tpb.getClass();
                    Looper looper = tpb.f;
                    Looper looper2 = this.X;
                    j7f j7f = this.y;
                    if (looper != looper2) {
                        j7f.a(15, tpb).b();
                        break;
                    } else {
                        synchronized (tpb) {
                        }
                        tpb.a.a(tpb.d, tpb.e);
                        tpb.b(true);
                        int i3 = this.F0.e;
                        if (i3 == 3 || i3 == 2) {
                            j7f.c(2);
                            break;
                        }
                    }
                case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                    K((tpb) message.obj);
                    break;
                case 16:
                    fob fob = (fob) message.obj;
                    n(fob, fob.a, true, false);
                    break;
                case LangUtils.HASH_SEED /*17*/:
                    N((wc5) message.obj);
                    break;
                case 18:
                    a((wc5) message.obj, message.arg1);
                    break;
                case 19:
                    rae.w(message.obj);
                    v();
                    throw null;
                case 20:
                    y(message.arg1, message.arg2, (a9e) message.obj);
                    break;
                case 21:
                    U((a9e) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    P(message.arg1 != 0);
                    break;
                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                    O(message.arg1 == 1);
                    break;
                case 25:
                    H(true);
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e) {
            e = e;
            if (e.c == 1 && (nt8 = this.B0.i) != null) {
                e = e.a(nt8.f.a);
            }
            if (!e.z || this.W0 != null) {
                ExoPlaybackException exoPlaybackException = this.W0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.W0;
                }
                iq.a("Playback error", e);
                Z(true, false);
                this.F0 = this.F0.e(e);
            } else {
                iq.a("Recoverable renderer error", e);
                this.W0 = e;
                j7f j7f2 = this.y;
                h7f a2 = j7f2.a(25, e);
                j7f2.getClass();
                Message message2 = a2.a;
                message2.getClass();
                j7f2.a.sendMessageAtFrontOfQueue(message2);
                a2.a();
            }
        } catch (DrmSession$DrmSessionException e2) {
            j(e2.a, e2);
        } catch (ParserException e3) {
            boolean z2 = e3.a;
            int i4 = e3.b;
            if (i4 == 1) {
                i = z2 ? 3001 : 3003;
            } else {
                if (i4 == 4) {
                    i = z2 ? 3002 : 3004;
                }
                j(i2, e3);
            }
            i2 = i;
            j(i2, e3);
        } catch (DataSourceException e4) {
            j(e4.a, e4);
        } catch (BehindLiveWindowException e5) {
            j(1002, e5);
        } catch (IOException e6) {
            j(2000, e6);
        } catch (RuntimeException e7) {
            if ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) {
                i2 = 1004;
            }
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e7, i2);
            iq.a("Playback error", exoPlaybackException2);
            Z(true, false);
            this.F0 = this.F0.e(exoPlaybackException2);
        } catch (Throwable th) {
            tpb.b(true);
            throw th;
        }
        t();
        return true;
    }

    public final void i(lt8 lt8) {
        nt8 nt8 = this.B0.j;
        if (nt8 != null && nt8.a == lt8) {
            long j = this.T0;
            if (nt8 != null) {
                y64.j(nt8.l == null);
                if (nt8.d) {
                    nt8.a.A(j - nt8.o);
                }
            }
            s();
        }
    }

    public final void j(int i, IOException iOException) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        nt8 nt8 = this.B0.h;
        if (nt8 != null) {
            exoPlaybackException = exoPlaybackException.a(nt8.f.a);
        }
        iq.a("Playback error", exoPlaybackException);
        Z(false, false);
        this.F0 = this.F0.e(exoPlaybackException);
    }

    public final void k(boolean z2) {
        nt8 nt8 = this.B0.j;
        mz8 mz8 = nt8 == null ? this.F0.b : nt8.f.a;
        boolean z3 = !this.F0.k.equals(mz8);
        if (z3) {
            this.F0 = this.F0.a(mz8);
        }
        dob dob = this.F0;
        dob.q = nt8 == null ? dob.s : nt8.d();
        dob dob2 = this.F0;
        long j = dob2.q;
        nt8 nt82 = this.B0.j;
        long j2 = 0;
        if (nt82 != null) {
            j2 = Math.max(0, j - (this.T0 - nt82.o));
        }
        dob2.r = j2;
        if ((z3 || z2) && nt8 != null && nt8.d) {
            c0(nt8.n);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: cd5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: cd5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: gkf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: cd5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v49, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: gkf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v57, resolved type: gkf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: dkf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: dkf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: cd5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v61, resolved type: cd5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: cd5} */
    /* JADX WARNING: type inference failed for: r10v8 */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ee, code lost:
        if (r5.d(r6, r9) != 2) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01f0, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01fe, code lost:
        if (r5.g(r3.b) != false) goto L_0x01f0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02eb A[Catch:{ all -> 0x02f3, all -> 0x02f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0431  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(defpackage.ikf r38, boolean r39) {
        /*
            r37 = this;
            r11 = r37
            r12 = r38
            dob r0 = r11.F0
            cd5 r8 = r11.S0
            st8 r9 = r11.B0
            int r4 = r11.M0
            boolean r10 = r11.N0
            gkf r13 = r11.Y
            dkf r14 = r11.Z
            boolean r1 = r38.q()
            r7 = 1
            r5 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x003d
            bd5 r0 = new bd5
            mz8 r19 = defpackage.dob.t
            r25 = 1
            r26 = 0
            r20 = 0
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r24 = 0
            r18 = r0
            r18.<init>(r19, r20, r22, r24, r25, r26)
            r7 = r0
            r24 = r5
            r8 = -1
            r11 = 4
            goto L_0x023d
        L_0x003d:
            mz8 r1 = r0.b
            java.lang.Object r15 = r1.a
            ikf r2 = r0.a
            boolean r20 = r2.q()
            if (r20 != 0) goto L_0x0057
            java.lang.Object r3 = r1.a
            dkf r2 = r2.h(r3, r14)
            boolean r2 = r2.w
            if (r2 == 0) goto L_0x0054
            goto L_0x0057
        L_0x0054:
            r21 = 0
            goto L_0x0059
        L_0x0057:
            r21 = r7
        L_0x0059:
            mz8 r2 = r0.b
            boolean r2 = r2.a()
            if (r2 != 0) goto L_0x0069
            if (r21 == 0) goto L_0x0064
            goto L_0x0069
        L_0x0064:
            long r2 = r0.s
        L_0x0066:
            r22 = r2
            goto L_0x006c
        L_0x0069:
            long r2 = r0.c
            goto L_0x0066
        L_0x006c:
            if (r8 == 0) goto L_0x00c0
            r3 = 1
            r2 = r1
            r1 = r38
            r27 = r2
            r11 = 4
            r2 = r8
            r5 = r10
            r6 = r13
            r7 = r14
            android.util.Pair r1 = E(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x008a
            int r1 = r12.a(r10)
            r3 = r1
            r1 = r22
            r4 = 0
            r5 = 0
            r7 = 1
            goto L_0x00b2
        L_0x008a:
            long r2 = r8.c
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x009c
            java.lang.Object r1 = r1.first
            dkf r1 = r12.h(r1, r14)
            int r3 = r1.c
            r1 = r22
            r7 = 0
            goto L_0x00a8
        L_0x009c:
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3 = -1
            r7 = 1
        L_0x00a8:
            int r4 = r0.e
            if (r4 != r11) goto L_0x00ae
            r4 = 1
            goto L_0x00af
        L_0x00ae:
            r4 = 0
        L_0x00af:
            r5 = r4
            r4 = r7
            r7 = 0
        L_0x00b2:
            r36 = r4
            r34 = r5
            r35 = r7
            r7 = r27
            r8 = -1
            r24 = 0
            r4 = r3
            goto L_0x0175
        L_0x00c0:
            r27 = r1
            r11 = 4
            ikf r1 = r0.a
            boolean r1 = r1.q()
            if (r1 == 0) goto L_0x00df
            int r1 = r12.a(r10)
            r4 = r1
            r1 = r22
            r7 = r27
            r8 = -1
        L_0x00d5:
            r24 = 0
        L_0x00d7:
            r34 = 0
            r35 = 0
        L_0x00db:
            r36 = 0
            goto L_0x0175
        L_0x00df:
            int r1 = r12.b(r15)
            r8 = -1
            if (r1 != r8) goto L_0x010e
            ikf r6 = r0.a
            r1 = r13
            r2 = r14
            r3 = r4
            r4 = r10
            r5 = r15
            r7 = r38
            java.lang.Object r1 = F(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x00fb
            int r1 = r12.a(r10)
            r7 = 1
            goto L_0x0102
        L_0x00fb:
            dkf r1 = r12.h(r1, r14)
            int r1 = r1.c
            r7 = 0
        L_0x0102:
            r4 = r1
            r35 = r7
            r1 = r22
            r7 = r27
            r24 = 0
            r34 = 0
            goto L_0x00db
        L_0x010e:
            int r1 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x011e
            dkf r1 = r12.h(r15, r14)
            int r1 = r1.c
            r4 = r1
            r1 = r22
            r7 = r27
            goto L_0x00d5
        L_0x011e:
            if (r21 == 0) goto L_0x016c
            ikf r1 = r0.a
            r7 = r27
            java.lang.Object r2 = r7.a
            r1.h(r2, r14)
            ikf r1 = r0.a
            int r2 = r14.c
            r5 = 0
            gkf r1 = r1.n(r2, r13, r5)
            int r1 = r1.x0
            ikf r2 = r0.a
            java.lang.Object r3 = r7.a
            int r2 = r2.b(r3)
            if (r1 != r2) goto L_0x0160
            long r1 = r14.v
            long r19 = r22 + r1
            dkf r1 = r12.h(r15, r14)
            int r4 = r1.c
            r1 = r38
            r2 = r13
            r3 = r14
            r24 = r5
            r5 = r19
            android.util.Pair r1 = r1.j(r2, r3, r4, r5)
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            goto L_0x0164
        L_0x0160:
            r24 = r5
            r1 = r22
        L_0x0164:
            r4 = r8
            r34 = 0
            r35 = 0
            r36 = 1
            goto L_0x0175
        L_0x016c:
            r7 = r27
            r24 = 0
            r4 = r8
            r1 = r22
            goto L_0x00d7
        L_0x0175:
            if (r4 == r8) goto L_0x0191
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r38
            r2 = r13
            r3 = r14
            android.util.Pair r1 = r1.j(r2, r3, r4, r5)
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r32 = r16
            goto L_0x0193
        L_0x0191:
            r32 = r1
        L_0x0193:
            mz8 r3 = r9.m(r12, r15, r1)
            int r4 = r3.e
            if (r4 == r8) goto L_0x01a4
            int r5 = r7.e
            if (r5 == r8) goto L_0x01a2
            if (r4 < r5) goto L_0x01a2
            goto L_0x01a4
        L_0x01a2:
            r4 = 0
            goto L_0x01a5
        L_0x01a4:
            r4 = 1
        L_0x01a5:
            java.lang.Object r5 = r7.a
            boolean r5 = r5.equals(r15)
            if (r5 == 0) goto L_0x01bd
            boolean r5 = r7.a()
            if (r5 != 0) goto L_0x01bd
            boolean r5 = r3.a()
            if (r5 != 0) goto L_0x01bd
            if (r4 == 0) goto L_0x01bd
            r4 = 1
            goto L_0x01be
        L_0x01bd:
            r4 = 0
        L_0x01be:
            dkf r5 = r12.h(r15, r14)
            if (r21 != 0) goto L_0x0201
            int r6 = (r22 > r32 ? 1 : (r22 == r32 ? 0 : -1))
            if (r6 != 0) goto L_0x0201
            java.lang.Object r6 = r7.a
            java.lang.Object r9 = r3.a
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x01d3
            goto L_0x0201
        L_0x01d3:
            boolean r6 = r7.a()
            if (r6 == 0) goto L_0x01f2
            int r6 = r7.b
            boolean r9 = r5.g(r6)
            if (r9 == 0) goto L_0x01f2
            int r9 = r7.c
            int r10 = r5.d(r6, r9)
            if (r10 == r11) goto L_0x0201
            int r5 = r5.d(r6, r9)
            r6 = 2
            if (r5 == r6) goto L_0x0201
        L_0x01f0:
            r5 = 1
            goto L_0x0202
        L_0x01f2:
            boolean r6 = r3.a()
            if (r6 == 0) goto L_0x0201
            int r6 = r3.b
            boolean r5 = r5.g(r6)
            if (r5 == 0) goto L_0x0201
            goto L_0x01f0
        L_0x0201:
            r5 = 0
        L_0x0202:
            if (r4 != 0) goto L_0x0206
            if (r5 == 0) goto L_0x0207
        L_0x0206:
            r3 = r7
        L_0x0207:
            boolean r4 = r3.a()
            if (r4 == 0) goto L_0x0231
            boolean r1 = r3.equals(r7)
            if (r1 == 0) goto L_0x0218
            long r0 = r0.s
            r30 = r0
            goto L_0x0233
        L_0x0218:
            java.lang.Object r0 = r3.a
            r12.h(r0, r14)
            int r0 = r3.c
            int r1 = r3.b
            int r1 = r14.e(r1)
            if (r0 != r1) goto L_0x022c
            p9 r0 = r14.x
            long r5 = r0.b
            goto L_0x022e
        L_0x022c:
            r5 = r24
        L_0x022e:
            r30 = r5
            goto L_0x0233
        L_0x0231:
            r30 = r1
        L_0x0233:
            bd5 r0 = new bd5
            r28 = r0
            r29 = r3
            r28.<init>(r29, r30, r32, r34, r35, r36)
            r7 = r0
        L_0x023d:
            java.lang.Object r0 = r7.f
            r9 = r0
            mz8 r9 = (defpackage.mz8) r9
            long r13 = r7.b
            boolean r6 = r7.c
            long r3 = r7.a
            r10 = r11
            r11 = r37
            dob r0 = r11.F0
            mz8 r0 = r0.b
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0260
            dob r0 = r11.F0
            long r0 = r0.s
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x025e
            goto L_0x0260
        L_0x025e:
            r15 = 0
            goto L_0x0261
        L_0x0260:
            r15 = 1
        L_0x0261:
            r19 = 3
            boolean r0 = r7.d     // Catch:{ all -> 0x03b4 }
            if (r0 == 0) goto L_0x0282
            dob r0 = r11.F0     // Catch:{ all -> 0x027f }
            int r0 = r0.e     // Catch:{ all -> 0x027f }
            r2 = 1
            if (r0 == r2) goto L_0x0271
            r11.V(r10)     // Catch:{ all -> 0x0273 }
        L_0x0271:
            r1 = 0
            goto L_0x027b
        L_0x0273:
            r0 = move-exception
        L_0x0274:
            r8 = r2
            r24 = r13
        L_0x0277:
            r10 = 0
            r13 = r3
            goto L_0x03ba
        L_0x027b:
            r11.A(r1, r1, r1, r2)     // Catch:{ all -> 0x0273 }
            goto L_0x0283
        L_0x027f:
            r0 = move-exception
            r2 = 1
            goto L_0x0274
        L_0x0282:
            r2 = 1
        L_0x0283:
            if (r15 != 0) goto L_0x02f7
            st8 r1 = r11.B0     // Catch:{ all -> 0x0273 }
            long r5 = r11.T0     // Catch:{ all -> 0x0273 }
            nt8 r0 = r1.i     // Catch:{ all -> 0x0273 }
            if (r0 != 0) goto L_0x0294
            r21 = r3
            r26 = r24
        L_0x0291:
            r24 = r13
            goto L_0x02dc
        L_0x0294:
            r21 = r3
            long r2 = r0.o     // Catch:{ all -> 0x02f3 }
            boolean r4 = r0.d     // Catch:{ all -> 0x02f3 }
            if (r4 != 0) goto L_0x029f
            r26 = r2
            goto L_0x0291
        L_0x029f:
            r4 = 0
        L_0x02a0:
            ok0[] r10 = r11.a     // Catch:{ all -> 0x02f3 }
            int r8 = r10.length     // Catch:{ all -> 0x02f3 }
            if (r4 >= r8) goto L_0x02d8
            r8 = r10[r4]     // Catch:{ all -> 0x02f3 }
            boolean r8 = q(r8)     // Catch:{ all -> 0x02f3 }
            if (r8 == 0) goto L_0x02ca
            r8 = r10[r4]     // Catch:{ all -> 0x02f3 }
            kcd r10 = r8.x     // Catch:{ all -> 0x02f3 }
            r24 = r13
            kcd[] r13 = r0.c     // Catch:{ all -> 0x02c8 }
            r13 = r13[r4]     // Catch:{ all -> 0x02c8 }
            if (r10 == r13) goto L_0x02ba
            goto L_0x02cc
        L_0x02ba:
            long r13 = r8.X     // Catch:{ all -> 0x02c8 }
            r26 = -9223372036854775808
            int r8 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r8 != 0) goto L_0x02c3
            goto L_0x02dc
        L_0x02c3:
            long r2 = java.lang.Math.max(r13, r2)     // Catch:{ all -> 0x02c8 }
            goto L_0x02cc
        L_0x02c8:
            r0 = move-exception
            goto L_0x02d2
        L_0x02ca:
            r24 = r13
        L_0x02cc:
            int r4 = r4 + 1
            r13 = r24
            r8 = -1
            goto L_0x02a0
        L_0x02d2:
            r13 = r21
            r8 = 1
            r10 = 0
            goto L_0x03ba
        L_0x02d8:
            r24 = r13
            r26 = r2
        L_0x02dc:
            r8 = 1
            r2 = r38
            r13 = r21
            r3 = r5
            r10 = 0
            r5 = r26
            boolean r0 = r1.o(r2, r3, r5)     // Catch:{ all -> 0x02f0 }
            if (r0 != 0) goto L_0x0336
            r1 = 0
            r11.H(r1)     // Catch:{ all -> 0x02f0 }
            goto L_0x0336
        L_0x02f0:
            r0 = move-exception
            goto L_0x03ba
        L_0x02f3:
            r0 = move-exception
            r24 = r13
            goto L_0x02d2
        L_0x02f7:
            r8 = r2
            r24 = r13
            r10 = 0
            r13 = r3
            boolean r0 = r38.q()     // Catch:{ all -> 0x02f0 }
            if (r0 != 0) goto L_0x0336
            st8 r0 = r11.B0     // Catch:{ all -> 0x02f0 }
            nt8 r0 = r0.h     // Catch:{ all -> 0x02f0 }
        L_0x0306:
            if (r0 == 0) goto L_0x0322
            qt8 r1 = r0.f     // Catch:{ all -> 0x02f0 }
            mz8 r1 = r1.a     // Catch:{ all -> 0x02f0 }
            boolean r1 = r1.equals(r9)     // Catch:{ all -> 0x02f0 }
            if (r1 == 0) goto L_0x031f
            st8 r1 = r11.B0     // Catch:{ all -> 0x02f0 }
            qt8 r2 = r0.f     // Catch:{ all -> 0x02f0 }
            qt8 r1 = r1.g(r12, r2)     // Catch:{ all -> 0x02f0 }
            r0.f = r1     // Catch:{ all -> 0x02f0 }
            r0.h()     // Catch:{ all -> 0x02f0 }
        L_0x031f:
            nt8 r0 = r0.l     // Catch:{ all -> 0x02f0 }
            goto L_0x0306
        L_0x0322:
            st8 r0 = r11.B0     // Catch:{ all -> 0x02f0 }
            nt8 r1 = r0.h     // Catch:{ all -> 0x02f0 }
            nt8 r0 = r0.i     // Catch:{ all -> 0x02f0 }
            if (r1 == r0) goto L_0x032c
            r5 = r8
            goto L_0x032d
        L_0x032c:
            r5 = 0
        L_0x032d:
            r1 = r37
            r2 = r9
            r3 = r13
            long r0 = r1.J(r2, r3, r5, r6)     // Catch:{ all -> 0x02f0 }
            r13 = r0
        L_0x0336:
            dob r0 = r11.F0
            ikf r4 = r0.a
            mz8 r5 = r0.b
            boolean r0 = r7.e
            if (r0 == 0) goto L_0x0342
            r6 = r13
            goto L_0x0344
        L_0x0342:
            r6 = r16
        L_0x0344:
            r1 = r37
            r2 = r38
            r3 = r9
            r1.e0(r2, r3, r4, r5, r6)
            if (r15 != 0) goto L_0x0359
            dob r0 = r11.F0
            long r0 = r0.c
            int r0 = (r24 > r0 ? 1 : (r24 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0357
            goto L_0x0359
        L_0x0357:
            r13 = r10
            goto L_0x0395
        L_0x0359:
            dob r0 = r11.F0
            mz8 r1 = r0.b
            java.lang.Object r1 = r1.a
            ikf r0 = r0.a
            if (r15 == 0) goto L_0x0377
            if (r39 == 0) goto L_0x0377
            boolean r2 = r0.q()
            if (r2 != 0) goto L_0x0377
            dkf r2 = r11.Z
            dkf r0 = r0.h(r1, r2)
            boolean r0 = r0.w
            if (r0 != 0) goto L_0x0377
            r0 = r8
            goto L_0x0378
        L_0x0377:
            r0 = 0
        L_0x0378:
            dob r2 = r11.F0
            long r7 = r2.d
            int r1 = r12.b(r1)
            r2 = -1
            if (r1 != r2) goto L_0x0385
            r19 = 4
        L_0x0385:
            r1 = r37
            r2 = r9
            r3 = r13
            r5 = r24
            r9 = r0
            r13 = r10
            r10 = r19
            dob r0 = r1.o(r2, r3, r5, r7, r9, r10)
            r11.F0 = r0
        L_0x0395:
            r37.B()
            dob r0 = r11.F0
            ikf r0 = r0.a
            r11.D(r12, r0)
            dob r0 = r11.F0
            dob r0 = r0.g(r12)
            r11.F0 = r0
            boolean r0 = r38.q()
            if (r0 != 0) goto L_0x03af
            r11.S0 = r13
        L_0x03af:
            r1 = 0
            r11.k(r1)
            return
        L_0x03b4:
            r0 = move-exception
            r24 = r13
            r8 = 1
            goto L_0x0277
        L_0x03ba:
            dob r1 = r11.F0
            ikf r4 = r1.a
            mz8 r5 = r1.b
            boolean r1 = r7.e
            if (r1 == 0) goto L_0x03c6
            r6 = r13
            goto L_0x03c8
        L_0x03c6:
            r6 = r16
        L_0x03c8:
            r1 = r37
            r2 = r38
            r3 = r9
            r1.e0(r2, r3, r4, r5, r6)
            if (r15 != 0) goto L_0x03dd
            dob r1 = r11.F0
            long r1 = r1.c
            int r1 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x03db
            goto L_0x03dd
        L_0x03db:
            r13 = r10
            goto L_0x0419
        L_0x03dd:
            dob r1 = r11.F0
            mz8 r2 = r1.b
            java.lang.Object r2 = r2.a
            ikf r1 = r1.a
            if (r15 == 0) goto L_0x03fb
            if (r39 == 0) goto L_0x03fb
            boolean r3 = r1.q()
            if (r3 != 0) goto L_0x03fb
            dkf r3 = r11.Z
            dkf r1 = r1.h(r2, r3)
            boolean r1 = r1.w
            if (r1 != 0) goto L_0x03fb
            r15 = r8
            goto L_0x03fc
        L_0x03fb:
            r15 = 0
        L_0x03fc:
            dob r1 = r11.F0
            long r7 = r1.d
            int r1 = r12.b(r2)
            r2 = -1
            if (r1 != r2) goto L_0x0409
            r19 = 4
        L_0x0409:
            r1 = r37
            r2 = r9
            r3 = r13
            r5 = r24
            r9 = r15
            r13 = r10
            r10 = r19
            dob r1 = r1.o(r2, r3, r5, r7, r9, r10)
            r11.F0 = r1
        L_0x0419:
            r37.B()
            dob r1 = r11.F0
            ikf r1 = r1.a
            r11.D(r12, r1)
            dob r1 = r11.F0
            dob r1 = r1.g(r12)
            r11.F0 = r1
            boolean r1 = r38.q()
            if (r1 != 0) goto L_0x0433
            r11.S0 = r13
        L_0x0433:
            r1 = 0
            r11.k(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed5.l(ikf, boolean):void");
    }

    public final void m(lt8 lt8) {
        st8 st8 = this.B0;
        nt8 nt8 = st8.j;
        if (nt8 != null && nt8.a == lt8) {
            float f = this.x0.c().a;
            ikf ikf = this.F0.a;
            nt8.d = true;
            nt8.m = nt8.a.x();
            mqf g = nt8.g(f, ikf);
            qt8 qt8 = nt8.f;
            long j = qt8.b;
            long j2 = qt8.e;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            long a2 = nt8.a(g, j, false, new boolean[nt8.i.length]);
            long j3 = nt8.o;
            qt8 qt82 = nt8.f;
            nt8.o = (qt82.b - a2) + j3;
            nt8.f = qt82.b(a2);
            c0(nt8.n);
            if (nt8 == st8.h) {
                C(nt8.f.b);
                f(new boolean[this.a.length]);
                dob dob = this.F0;
                mz8 mz8 = dob.b;
                long j4 = nt8.f.b;
                this.F0 = o(mz8, j4, dob.c, j4, false, 5);
            }
            s();
        }
    }

    public final void n(fob fob, float f, boolean z2, boolean z3) {
        int i;
        ed5 ed5 = this;
        fob fob2 = fob;
        if (z2) {
            if (z3) {
                ed5.G0.a(1);
            }
            dob dob = ed5.F0;
            dob dob2 = dob;
            ikf ikf = dob.a;
            dob dob3 = new dob(ikf, dob.b, dob.c, dob.d, dob.e, dob.f, dob.g, dob.h, dob.i, dob.j, dob.k, dob2.l, dob2.m, fob, dob2.q, dob2.r, dob2.s, dob2.o, dob2.p);
            ed5 = this;
            ed5.F0 = dob3;
        }
        fob fob3 = fob;
        float f2 = fob3.a;
        nt8 nt8 = ed5.B0.h;
        while (true) {
            i = 0;
            if (nt8 == null) {
                break;
            }
            ld5[] ld5Arr = (ld5[]) nt8.n.v;
            int length = ld5Arr.length;
            while (i < length) {
                ld5 ld5 = ld5Arr[i];
                if (ld5 != null) {
                    ld5.l(f2);
                }
                i++;
            }
            nt8 = nt8.l;
        }
        ok0[] ok0Arr = ed5.a;
        int length2 = ok0Arr.length;
        while (i < length2) {
            ok0 ok0 = ok0Arr[i];
            if (ok0 != null) {
                ok0.z(f, fob3.a);
            } else {
                float f3 = f;
            }
            i++;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: k0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: k0d} */
    /* JADX WARNING: type inference failed for: r11v5, types: [qb7, jb7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.dob o(defpackage.mz8 r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r4 = r20
            r2 = r25
            boolean r3 = r0.V0
            r6 = 0
            if (r3 != 0) goto L_0x0022
            dob r3 = r0.F0
            long r8 = r3.s
            int r3 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0022
            dob r3 = r0.F0
            mz8 r3 = r3.b
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r3 = r6
            goto L_0x0023
        L_0x0022:
            r3 = 1
        L_0x0023:
            r0.V0 = r3
            r16.B()
            dob r3 = r0.F0
            tpf r8 = r3.h
            mqf r9 = r3.i
            java.util.List r10 = r3.j
            j09 r11 = r0.C0
            boolean r11 = r11.g
            if (r11 == 0) goto L_0x0096
            st8 r3 = r0.B0
            nt8 r3 = r3.h
            if (r3 != 0) goto L_0x003f
            tpf r8 = defpackage.tpf.o
            goto L_0x0041
        L_0x003f:
            tpf r8 = r3.m
        L_0x0041:
            if (r3 != 0) goto L_0x0046
            mqf r9 = r0.v
            goto L_0x0048
        L_0x0046:
            mqf r9 = r3.n
        L_0x0048:
            java.lang.Object r10 = r9.v
            ld5[] r10 = (defpackage.ld5[]) r10
            qb7 r11 = new qb7
            r12 = 4
            r11.<init>(r12)
            int r12 = r10.length
            r13 = r6
            r14 = r13
        L_0x0055:
            if (r13 >= r12) goto L_0x0077
            r15 = r10[r13]
            if (r15 == 0) goto L_0x0074
            ca6 r15 = r15.d(r6)
            rp9 r15 = r15.X
            if (r15 != 0) goto L_0x006e
            rp9 r15 = new rp9
            pp9[] r7 = new defpackage.pp9[r6]
            r15.<init>((defpackage.pp9[]) r7)
            r11.a(r15)
            goto L_0x0074
        L_0x006e:
            r11.a(r15)
            r7 = 1
            r14 = 1
            goto L_0x0075
        L_0x0074:
            r7 = 1
        L_0x0075:
            int r13 = r13 + r7
            goto L_0x0055
        L_0x0077:
            if (r14 == 0) goto L_0x007e
            k0d r7 = r11.j()
            goto L_0x0082
        L_0x007e:
            lx5 r7 = defpackage.tb7.b
            k0d r7 = defpackage.k0d.v
        L_0x0082:
            if (r3 == 0) goto L_0x0092
            qt8 r10 = r3.f
            long r11 = r10.c
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x0092
            qt8 r10 = r10.a(r4)
            r3.f = r10
        L_0x0092:
            r12 = r7
            r10 = r8
            r11 = r9
            goto L_0x00ab
        L_0x0096:
            mz8 r3 = r3.b
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00a8
            tpf r3 = defpackage.tpf.o
            mqf r7 = r0.v
            k0d r8 = defpackage.k0d.v
            r10 = r3
            r11 = r7
            r12 = r8
            goto L_0x00ab
        L_0x00a8:
            r11 = r9
            r12 = r10
            r10 = r8
        L_0x00ab:
            if (r24 == 0) goto L_0x00c6
            zc5 r3 = r0.G0
            boolean r7 = r3.d
            if (r7 == 0) goto L_0x00bf
            int r7 = r3.e
            r8 = 5
            if (r7 == r8) goto L_0x00bf
            if (r2 != r8) goto L_0x00bb
            r6 = 1
        L_0x00bb:
            defpackage.y64.g(r6)
            goto L_0x00c6
        L_0x00bf:
            r6 = 1
            r3.a = r6
            r3.d = r6
            r3.e = r2
        L_0x00c6:
            dob r2 = r0.F0
            long r6 = r2.q
            st8 r3 = r0.B0
            nt8 r3 = r3.j
            if (r3 != 0) goto L_0x00d3
            r8 = 0
            goto L_0x00e0
        L_0x00d3:
            long r13 = r0.T0
            long r8 = r3.o
            long r13 = r13 - r8
            long r6 = r6 - r13
            r8 = 0
            long r6 = java.lang.Math.max(r8, r6)
            r8 = r6
        L_0x00e0:
            r0 = r2
            r1 = r17
            r2 = r18
            r4 = r20
            r6 = r22
            dob r0 = r0.b(r1, r2, r4, r6, r8, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed5.o(mz8, long, long, long, boolean, int):dob");
    }

    public final boolean p() {
        nt8 nt8 = this.B0.j;
        if (nt8 == null) {
            return false;
        }
        return (!nt8.d ? 0 : nt8.a.i()) != Long.MIN_VALUE;
    }

    public final boolean r() {
        nt8 nt8 = this.B0.h;
        long j = nt8.f.e;
        return nt8.d && (j == -9223372036854775807L || this.F0.s < j || !W());
    }

    public final void s() {
        boolean z2;
        int i;
        boolean p = p();
        st8 st8 = this.B0;
        boolean z3 = true;
        if (!p) {
            z2 = false;
        } else {
            nt8 nt8 = st8.j;
            long j = 0;
            long i2 = !nt8.d ? 0 : nt8.a.i();
            nt8 nt82 = this.B0.j;
            if (nt82 != null) {
                j = Math.max(0, i2 - (this.T0 - nt82.o));
            }
            if (nt8 != st8.h) {
                long j2 = nt8.f.b;
            }
            float f = this.x0.c().a;
            sg4 sg4 = this.w;
            cb4 cb4 = sg4.a;
            synchronized (cb4) {
                i = cb4.e * cb4.c;
            }
            boolean z4 = i >= sg4.j;
            int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            long j3 = sg4.c;
            long j4 = sg4.b;
            if (i3 > 0) {
                j4 = Math.min(t0g.s(j4, f), j3);
            }
            if (j < Math.max(j4, 500000)) {
                sg4.k = sg4.g || !z4;
            } else if (j >= j3 || z4) {
                sg4.k = false;
            }
            z2 = sg4.k;
        }
        this.L0 = z2;
        if (z2) {
            nt8 nt83 = st8.j;
            long j5 = this.T0;
            if (nt83.l != null) {
                z3 = false;
            }
            y64.j(z3);
            nt83.a.M(j5 - nt83.o);
        }
        b0();
    }

    public final void t() {
        zc5 zc5 = this.G0;
        dob dob = this.F0;
        boolean z2 = zc5.a | (zc5.b != dob);
        zc5.a = z2;
        zc5.b = dob;
        if (z2) {
            sc5 sc5 = this.A0.a;
            sc5.z.a.post(new bk4(23, sc5, zc5));
            this.G0 = new zc5(this.F0);
        }
    }

    public final void u() {
        l(this.C0.e(), true);
    }

    public final void v() {
        this.G0.a(1);
        throw null;
    }

    public final void w() {
        this.G0.a(1);
        int i = 0;
        A(false, false, false, true);
        this.w.b(false);
        V(this.F0.a.q() ? 4 : 2);
        vc4 vc4 = (vc4) this.x;
        vc4.getClass();
        j09 j09 = this.C0;
        y64.j(!j09.g);
        j09.m = vc4;
        while (true) {
            ArrayList arrayList = (ArrayList) j09.b;
            if (i < arrayList.size()) {
                g09 g09 = (g09) arrayList.get(i);
                j09.k(g09);
                ((HashSet) j09.f).add(g09);
                i++;
            } else {
                j09.g = true;
                this.y.c(2);
                return;
            }
        }
    }

    public final void x() {
        A(true, false, true, false);
        this.w.b(true);
        V(1);
        this.z.quit();
        synchronized (this) {
            this.H0 = true;
            notifyAll();
        }
    }

    public final void y(int i, int i2, a9e a9e) {
        boolean z2 = true;
        this.G0.a(1);
        j09 j09 = this.C0;
        j09.getClass();
        if (i < 0 || i > i2 || i2 > ((ArrayList) j09.b).size()) {
            z2 = false;
        }
        y64.g(z2);
        j09.l = a9e;
        j09.p(i, i2);
        l(j09.e(), false);
    }

    public final void z() {
        float f = this.x0.c().a;
        st8 st8 = this.B0;
        nt8 nt8 = st8.h;
        nt8 nt82 = st8.i;
        nt8 nt83 = nt8;
        boolean z2 = true;
        while (nt83 != null && nt83.d) {
            mqf g = nt83.g(f, this.F0.a);
            mqf mqf = nt83.n;
            if (mqf != null) {
                int length = ((ld5[]) mqf.v).length;
                ld5[] ld5Arr = (ld5[]) g.v;
                if (length == ld5Arr.length) {
                    int i = 0;
                    while (i < ld5Arr.length) {
                        if (g.K(mqf, i)) {
                            i++;
                        }
                    }
                    if (nt83 == nt82) {
                        z2 = false;
                    }
                    nt83 = nt83.l;
                }
            }
            if (z2) {
                st8 st82 = this.B0;
                nt8 nt84 = st82.h;
                boolean k = st82.k(nt84);
                boolean[] zArr = new boolean[this.a.length];
                long a2 = nt84.a(g, this.F0.s, k, zArr);
                dob dob = this.F0;
                boolean z3 = (dob.e == 4 || a2 == dob.s) ? false : true;
                dob dob2 = this.F0;
                nt8 nt85 = nt84;
                boolean[] zArr2 = zArr;
                this.F0 = o(dob2.b, a2, dob2.c, dob2.d, z3, 5);
                if (z3) {
                    C(a2);
                }
                boolean[] zArr3 = new boolean[this.a.length];
                int i2 = 0;
                while (true) {
                    ok0[] ok0Arr = this.a;
                    if (i2 >= ok0Arr.length) {
                        break;
                    }
                    ok0 ok0 = ok0Arr[i2];
                    boolean q = q(ok0);
                    zArr3[i2] = q;
                    kcd kcd = nt85.c[i2];
                    if (q) {
                        if (kcd != ok0.x) {
                            d(ok0);
                        } else if (zArr2[i2]) {
                            long j = this.T0;
                            ok0.Y = false;
                            ok0.X = j;
                            ok0.q(j, false);
                            i2++;
                        }
                    }
                    i2++;
                }
                f(zArr3);
            } else {
                this.B0.k(nt83);
                if (nt83.d) {
                    nt83.a(g, Math.max(nt83.f.b, this.T0 - nt83.o), false, new boolean[nt83.i.length]);
                }
            }
            k(true);
            if (this.F0.e != 4) {
                s();
                d0();
                this.y.c(2);
                return;
            }
            return;
        }
    }
}
