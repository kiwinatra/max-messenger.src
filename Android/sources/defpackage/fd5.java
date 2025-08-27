package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: fd5  reason: default package */
public final class fd5 implements Handler.Callback, kt8, lqf, i09, vg4, qpb {
    public static final long d1 = v0g.h0(WorkRequest.MIN_BACKOFF_MILLIS);
    public final gc5 A0;
    public final tt8 B0;
    public final j09 C0;
    public final qg4 D0;
    public final long E0;
    public final mpb F0;
    public und G0;
    public eob H0;
    public ad5 I0;
    public boolean J0;
    public boolean K0 = false;
    public boolean L0;
    public boolean M0;
    public long N0;
    public boolean O0;
    public int P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public int U0;
    public dd5 V0;
    public long W0;
    public final Looper X;
    public long X0;
    public final hkf Y;
    public int Y0;
    public final ekf Z;
    public boolean Z0;
    public final pk0[] a;
    public ExoPlaybackException a1;
    public final Set b;
    public long b1;
    public final pk0[] c;
    public wb5 c1;
    public final pe8 o;
    public final mqf v;
    public final long v0;
    public final tg4 w;
    public final boolean w0;
    public final zg0 x;
    public final wg4 x0;
    public final k7f y;
    public final ArrayList y0;
    public final HandlerThread z;
    public final c7f z0;

    public fd5(pk0[] pk0Arr, pe8 pe8, mqf mqf, tg4 tg4, zg0 zg0, int i, boolean z2, wb4 wb4, und und, qg4 qg4, long j, Looper looper, c7f c7f, gc5 gc5, mpb mpb) {
        pk0[] pk0Arr2 = pk0Arr;
        pe8 pe82 = pe8;
        tg4 tg42 = tg4;
        zg0 zg02 = zg0;
        wb4 wb42 = wb4;
        c7f c7f2 = c7f;
        mpb mpb2 = mpb;
        wb5 wb5 = wb5.a;
        this.A0 = gc5;
        this.a = pk0Arr2;
        this.o = pe82;
        this.v = mqf;
        this.w = tg42;
        this.x = zg02;
        this.P0 = i;
        this.Q0 = z2;
        this.G0 = und;
        this.D0 = qg4;
        this.E0 = j;
        this.z0 = c7f2;
        this.F0 = mpb2;
        this.c1 = wb5;
        this.b1 = -9223372036854775807L;
        this.N0 = -9223372036854775807L;
        this.v0 = tg42.h;
        this.w0 = tg42.i;
        ckf ckf = jkf.a;
        eob i2 = eob.i(mqf);
        this.H0 = i2;
        this.I0 = new ad5(i2);
        this.c = new pk0[pk0Arr2.length];
        sj4 sj4 = (sj4) pe82;
        sj4.getClass();
        for (int i3 = 0; i3 < pk0Arr2.length; i3++) {
            pk0 pk0 = pk0Arr2[i3];
            pk0.v = i3;
            pk0.w = mpb2;
            pk0.x = c7f2;
            pk0[] pk0Arr3 = this.c;
            pk0.getClass();
            pk0Arr3[i3] = pk0;
            pk0 pk02 = this.c[i3];
            synchronized (pk02.a) {
                pk02.z0 = sj4;
            }
        }
        this.x0 = new wg4((vg4) this, c7f2);
        this.y0 = new ArrayList();
        this.b = ryg.K();
        this.Y = new hkf();
        this.Z = new ekf();
        pe82.a = this;
        pe82.b = zg02;
        this.Z0 = true;
        k7f a2 = c7f2.a(looper, (Handler.Callback) null);
        this.B0 = new tt8(wb42, a2, new lc5(5, (Object) this));
        this.C0 = new j09((i09) this, wb42, a2, mpb2);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.z = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.X = looper2;
        this.y = c7f2.a(looper2, this);
    }

    public static Pair F(jkf jkf, dd5 dd5, boolean z2, int i, boolean z3, hkf hkf, ekf ekf) {
        int G;
        jkf jkf2 = jkf;
        dd5 dd52 = dd5;
        ekf ekf2 = ekf;
        jkf jkf3 = dd52.a;
        if (jkf.q()) {
            return null;
        }
        jkf jkf4 = jkf3.q() ? jkf2 : jkf3;
        try {
            Pair j = jkf4.j(hkf, ekf, dd52.b, dd52.c);
            if (jkf.equals(jkf4)) {
                return j;
            }
            if (jkf.b(j.first) == -1) {
                hkf hkf2 = hkf;
                if (z2 && (G = G(hkf, ekf, i, z3, j.first, jkf4, jkf)) != -1) {
                    return jkf.j(hkf, ekf, G, -9223372036854775807L);
                }
                return null;
            } else if (!jkf4.h(j.first, ekf2).f || jkf4.n(ekf2.c, hkf, 0).n != jkf4.b(j.first)) {
                return j;
            } else {
                return jkf.j(hkf, ekf, jkf.h(j.first, ekf2).c, dd52.c);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public static int G(hkf hkf, ekf ekf, int i, boolean z2, Object obj, jkf jkf, jkf jkf2) {
        hkf hkf2 = hkf;
        ekf ekf2 = ekf;
        Object obj2 = obj;
        jkf jkf3 = jkf;
        jkf jkf4 = jkf2;
        Object obj3 = jkf3.n(jkf3.h(obj2, ekf2).c, hkf, 0).a;
        for (int i2 = 0; i2 < jkf2.p(); i2++) {
            if (jkf4.n(i2, hkf, 0).a.equals(obj3)) {
                return i2;
            }
        }
        int b2 = jkf3.b(obj2);
        int i3 = jkf.i();
        int i4 = b2;
        int i5 = -1;
        for (int i6 = 0; i6 < i3 && i5 == -1; i6++) {
            i4 = jkf.d(i4, ekf, hkf, i, z2);
            if (i4 == -1) {
                break;
            }
            i5 = jkf4.b(jkf3.m(i4));
        }
        if (i5 == -1) {
            return -1;
        }
        return jkf4.g(i5, ekf2, false).c;
    }

    public static void M(pk0 pk0, long j) {
        pk0.w0 = true;
        if (pk0 instanceof bgf) {
            bgf bgf = (bgf) pk0;
            n79.n(bgf.w0);
            bgf.T0 = j;
        }
    }

    public static boolean q(pk0 pk0) {
        return pk0.y != 0;
    }

    public final void A() {
        float f = this.x0.c().a;
        tt8 tt8 = this.B0;
        ot8 ot8 = tt8.i;
        ot8 ot82 = tt8.j;
        mqf mqf = null;
        ot8 ot83 = ot8;
        boolean z2 = true;
        while (ot83 != null && ot83.d) {
            mqf h = ot83.h(f, this.H0.a);
            mqf mqf2 = ot83 == this.B0.i ? h : mqf;
            mqf mqf3 = ot83.n;
            if (mqf3 != null) {
                int length = ((md5[]) mqf3.v).length;
                md5[] md5Arr = (md5[]) h.v;
                if (length == md5Arr.length) {
                    int i = 0;
                    while (i < md5Arr.length) {
                        if (h.L(mqf3, i)) {
                            i++;
                        }
                    }
                    if (ot83 == ot82) {
                        z2 = false;
                    }
                    ot83 = ot83.l;
                    mqf = mqf2;
                }
            }
            if (z2) {
                tt8 tt82 = this.B0;
                ot8 ot84 = tt82.i;
                boolean l = tt82.l(ot84);
                boolean[] zArr = new boolean[this.a.length];
                mqf2.getClass();
                long a2 = ot84.a(mqf2, this.H0.s, l, zArr);
                eob eob = this.H0;
                boolean z3 = (eob.e == 4 || a2 == eob.s) ? false : true;
                eob eob2 = this.H0;
                ot8 ot85 = ot84;
                boolean[] zArr2 = zArr;
                this.H0 = o(eob2.b, a2, eob2.c, eob2.d, z3, 5);
                if (z3) {
                    D(a2);
                }
                boolean[] zArr3 = new boolean[this.a.length];
                int i2 = 0;
                while (true) {
                    pk0[] pk0Arr = this.a;
                    if (i2 >= pk0Arr.length) {
                        break;
                    }
                    pk0 pk0 = pk0Arr[i2];
                    boolean q = q(pk0);
                    zArr3[i2] = q;
                    lcd lcd = ot85.c[i2];
                    if (q) {
                        if (lcd != pk0.z) {
                            d(pk0);
                        } else if (zArr2[i2]) {
                            long j = this.W0;
                            pk0.w0 = false;
                            pk0.Z = j;
                            pk0.v0 = j;
                            pk0.s(j, false);
                            i2++;
                        }
                    }
                    i2++;
                }
                f(zArr3, this.W0);
            } else {
                this.B0.l(ot83);
                if (ot83.d) {
                    ot83.a(h, Math.max(ot83.f.b, this.W0 - ot83.o), false, new boolean[ot83.i.length]);
                }
            }
            k(true);
            if (this.H0.e != 4) {
                s();
                f0();
                this.y.f(2);
                return;
            }
            return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            r33 = this;
            r1 = r33
            k7f r0 = r1.y
            r2 = 2
            r0.e(r2)
            r2 = 0
            r1.a1 = r2
            r3 = 0
            r4 = 1
            r1.h0(r3, r4)
            wg4 r0 = r1.x0
            r0.c = r3
            java.lang.Object r0 = r0.o
            tw8 r0 = (defpackage.tw8) r0
            boolean r5 = r0.b
            if (r5 == 0) goto L_0x0025
            long r5 = r0.e()
            r0.a(r5)
            r0.b = r3
        L_0x0025:
            r5 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r1.W0 = r5
            pk0[] r5 = r1.a
            int r6 = r5.length
            r7 = r3
        L_0x0030:
            if (r7 >= r6) goto L_0x0040
            r0 = r5[r7]
            r1.d(r0)     // Catch:{ ExoPlaybackException | RuntimeException -> 0x0038 }
            goto L_0x003e
        L_0x0038:
            r0 = move-exception
            java.lang.String r8 = "Disable failed."
            defpackage.i8b.p(r8, r0)
        L_0x003e:
            int r7 = r7 + r4
            goto L_0x0030
        L_0x0040:
            if (r34 == 0) goto L_0x005f
            pk0[] r5 = r1.a
            int r6 = r5.length
            r7 = r3
        L_0x0046:
            if (r7 >= r6) goto L_0x005f
            r0 = r5[r7]
            java.util.Set r8 = r1.b
            boolean r8 = r8.remove(r0)
            if (r8 == 0) goto L_0x005d
            r0.B()     // Catch:{ RuntimeException -> 0x0056 }
            goto L_0x005d
        L_0x0056:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Reset failed."
            defpackage.i8b.p(r0, r8)
        L_0x005d:
            int r7 = r7 + r4
            goto L_0x0046
        L_0x005f:
            r1.U0 = r3
            eob r0 = r1.H0
            nz8 r5 = r0.b
            long r6 = r0.s
            eob r0 = r1.H0
            nz8 r0 = r0.b
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x008f
            eob r0 = r1.H0
            ekf r8 = r1.Z
            nz8 r9 = r0.b
            jkf r0 = r0.a
            boolean r10 = r0.q()
            if (r10 != 0) goto L_0x008f
            java.lang.Object r9 = r9.a
            ekf r0 = r0.h(r9, r8)
            boolean r0 = r0.f
            if (r0 == 0) goto L_0x008a
            goto L_0x008f
        L_0x008a:
            eob r0 = r1.H0
            long r8 = r0.s
            goto L_0x0093
        L_0x008f:
            eob r0 = r1.H0
            long r8 = r0.c
        L_0x0093:
            if (r35 == 0) goto L_0x00bf
            r1.V0 = r2
            eob r0 = r1.H0
            jkf r0 = r0.a
            android.util.Pair r0 = r1.h(r0)
            java.lang.Object r5 = r0.first
            nz8 r5 = (defpackage.nz8) r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r6 = r0.longValue()
            eob r0 = r1.H0
            nz8 r0 = r0.b
            boolean r0 = r5.equals(r0)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L_0x00bf
            r0 = r4
        L_0x00bb:
            r28 = r6
            r9 = r8
            goto L_0x00c1
        L_0x00bf:
            r0 = r3
            goto L_0x00bb
        L_0x00c1:
            tt8 r6 = r1.B0
            r6.b()
            r1.O0 = r3
            eob r6 = r1.H0
            jkf r6 = r6.a
            if (r36 == 0) goto L_0x0122
            boolean r7 = r6 instanceof defpackage.cqb
            if (r7 == 0) goto L_0x0122
            cqb r6 = (defpackage.cqb) r6
            j09 r7 = r1.C0
            java.lang.Object r7 = r7.l
            b9e r7 = (defpackage.b9e) r7
            jkf[] r8 = r6.k
            int r11 = r8.length
            jkf[] r11 = new defpackage.jkf[r11]
            r12 = r3
        L_0x00e0:
            int r13 = r8.length
            if (r12 >= r13) goto L_0x00ee
            aqb r13 = new aqb
            r14 = r8[r12]
            r13.<init>(r14)
            r11[r12] = r13
            int r12 = r12 + r4
            goto L_0x00e0
        L_0x00ee:
            cqb r8 = new cqb
            java.lang.Object[] r6 = r6.l
            r8.<init>(r11, r6, r7)
            int r6 = r5.b
            r7 = -1
            if (r6 == r7) goto L_0x011f
            java.lang.Object r6 = r5.a
            ekf r7 = r1.Z
            r8.h(r6, r7)
            ekf r6 = r1.Z
            int r6 = r6.c
            hkf r7 = r1.Y
            r11 = 0
            r8.n(r6, r7, r11)
            boolean r6 = r7.a()
            if (r6 == 0) goto L_0x011f
            nz8 r6 = new nz8
            java.lang.Object r7 = r5.a
            long r11 = r5.d
            r6.<init>(r7, r11)
            r19 = r6
        L_0x011d:
            r7 = r8
            goto L_0x0125
        L_0x011f:
            r19 = r5
            goto L_0x011d
        L_0x0122:
            r19 = r5
            r7 = r6
        L_0x0125:
            eob r5 = new eob
            eob r6 = r1.H0
            int r13 = r6.e
            if (r37 == 0) goto L_0x012f
        L_0x012d:
            r14 = r2
            goto L_0x0132
        L_0x012f:
            androidx.media3.exoplayer.ExoPlaybackException r2 = r6.f
            goto L_0x012d
        L_0x0132:
            if (r0 == 0) goto L_0x0139
            upf r2 = defpackage.upf.d
        L_0x0136:
            r16 = r2
            goto L_0x013c
        L_0x0139:
            upf r2 = r6.h
            goto L_0x0136
        L_0x013c:
            if (r0 == 0) goto L_0x0143
            mqf r2 = r1.v
        L_0x0140:
            r17 = r2
            goto L_0x0146
        L_0x0143:
            mqf r2 = r6.i
            goto L_0x0140
        L_0x0146:
            if (r0 == 0) goto L_0x014f
            lx5 r0 = defpackage.tb7.b
            k0d r0 = defpackage.k0d.v
        L_0x014c:
            r18 = r0
            goto L_0x0152
        L_0x014f:
            java.util.List r0 = r6.j
            goto L_0x014c
        L_0x0152:
            boolean r0 = r6.l
            r20 = r0
            int r0 = r6.m
            r21 = r0
            int r0 = r6.n
            r22 = r0
            gob r0 = r6.o
            r23 = r0
            r15 = 0
            r26 = 0
            r30 = 0
            r32 = 0
            r6 = r5
            r8 = r19
            r11 = r28
            r24 = r28
            r6.<init>(r7, r8, r9, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r32)
            r1.H0 = r5
            if (r36 == 0) goto L_0x01e1
            tt8 r0 = r1.B0
            java.util.List r2 = r0.o
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x019e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5 = r3
        L_0x0187:
            java.util.List r6 = r0.o
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x019c
            java.util.List r6 = r0.o
            java.lang.Object r6 = r6.get(r5)
            ot8 r6 = (defpackage.ot8) r6
            r6.g()
            int r5 = r5 + r4
            goto L_0x0187
        L_0x019c:
            r0.o = r2
        L_0x019e:
            j09 r1 = r1.C0
            java.lang.Object r0 = r1.e
            r2 = r0
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.util.Collection r0 = r2.values()
            java.util.Iterator r4 = r0.iterator()
        L_0x01ad:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01d5
            java.lang.Object r0 = r4.next()
            r5 = r0
            f09 r5 = (defpackage.f09) r5
            yj0 r0 = r5.a     // Catch:{ RuntimeException -> 0x01c2 }
            pz8 r6 = r5.b     // Catch:{ RuntimeException -> 0x01c2 }
            r0.p(r6)     // Catch:{ RuntimeException -> 0x01c2 }
            goto L_0x01c8
        L_0x01c2:
            r0 = move-exception
            java.lang.String r6 = "Failed to release child source."
            defpackage.i8b.p(r6, r0)
        L_0x01c8:
            yj0 r0 = r5.a
            wsb r6 = r5.c
            r0.s(r6)
            yj0 r0 = r5.a
            r0.r(r6)
            goto L_0x01ad
        L_0x01d5:
            r2.clear()
            java.lang.Object r0 = r1.f
            java.util.HashSet r0 = (java.util.HashSet) r0
            r0.clear()
            r1.g = r3
        L_0x01e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd5.B(boolean, boolean, boolean, boolean):void");
    }

    public final void C() {
        ot8 ot8 = this.B0.i;
        this.L0 = ot8 != null && ot8.f.h && this.K0;
    }

    public final void D(long j) {
        tt8 tt8 = this.B0;
        ot8 ot8 = tt8.i;
        long j2 = j + (ot8 == null ? 1000000000000L : ot8.o);
        this.W0 = j2;
        ((tw8) this.x0.o).a(j2);
        for (pk0 pk0 : this.a) {
            if (q(pk0)) {
                long j3 = this.W0;
                pk0.w0 = false;
                pk0.Z = j3;
                pk0.v0 = j3;
                pk0.s(j3, false);
            }
        }
        for (ot8 ot82 = tt8.i; ot82 != null; ot82 = ot82.l) {
            for (md5 md5 : (md5[]) ot82.n.v) {
                if (md5 != null) {
                    md5.n();
                }
            }
        }
    }

    public final void E(jkf jkf, jkf jkf2) {
        if (!jkf.q() || !jkf2.q()) {
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

    public final void H(long j) {
        this.y.a.sendEmptyMessageAtTime(2, j + ((this.H0.e != 3 || X()) ? d1 : 1000));
    }

    public final void I(boolean z2) {
        nz8 nz8 = this.B0.i.f.a;
        long K = K(nz8, this.H0.s, true, false);
        if (K != this.H0.s) {
            eob eob = this.H0;
            this.H0 = o(nz8, K, eob.c, eob.d, z2, 5);
        }
    }

    public final void J(dd5 dd5) {
        long j;
        long j2;
        boolean z2;
        nz8 nz8;
        long j3;
        long j4;
        long j5;
        eob eob;
        int i;
        dd5 dd52 = dd5;
        boolean z3 = true;
        this.I0.d(1);
        Pair F = F(this.H0.a, dd5, true, this.P0, this.Q0, this.Y, this.Z);
        if (F == null) {
            Pair h = h(this.H0.a);
            nz8 = (nz8) h.first;
            long longValue = ((Long) h.second).longValue();
            z2 = !this.H0.a.q();
            j = longValue;
            j2 = -9223372036854775807L;
        } else {
            Object obj = F.first;
            long longValue2 = ((Long) F.second).longValue();
            long j6 = dd52.c == -9223372036854775807L ? -9223372036854775807L : longValue2;
            nz8 n = this.B0.n(this.H0.a, obj, longValue2);
            if (n.b()) {
                this.H0.a.h(n.a, this.Z);
                j = this.Z.f(n.b) == n.c ? this.Z.g.c : 0;
                j2 = j6;
                nz8 = n;
                z2 = true;
            } else {
                j = longValue2;
                j2 = j6;
                z2 = dd52.c == -9223372036854775807L;
                nz8 = n;
            }
        }
        try {
            if (this.H0.a.q()) {
                this.V0 = dd52;
            } else if (F == null) {
                if (this.H0.e != 1) {
                    W(4);
                }
                B(false, true, false, true);
            } else {
                if (nz8.equals(this.H0.b)) {
                    ot8 ot8 = this.B0.i;
                    long h2 = (ot8 == null || !ot8.d || j == 0) ? j : ot8.a.h(j, this.G0);
                    if (v0g.h0(h2) == v0g.h0(this.H0.s) && ((i = eob.e) == 2 || i == 3)) {
                        long j7 = (eob = this.H0).s;
                        this.H0 = o(nz8, j7, j2, j7, z2, 2);
                        return;
                    }
                    j5 = h2;
                } else {
                    j5 = j;
                }
                boolean z4 = this.H0.e == 4;
                tt8 tt8 = this.B0;
                long K = K(nz8, j5, tt8.i != tt8.j, z4);
                if (j == K) {
                    z3 = false;
                }
                z2 |= z3;
                try {
                    eob eob2 = this.H0;
                    jkf jkf = eob2.a;
                    g0(jkf, nz8, jkf, eob2.b, j2, true);
                    j4 = K;
                    this.H0 = o(nz8, j4, j2, j4, z2, 2);
                } catch (Throwable th) {
                    th = th;
                    j3 = K;
                    this.H0 = o(nz8, j3, j2, j3, z2, 2);
                    throw th;
                }
            }
            j4 = j;
            this.H0 = o(nz8, j4, j2, j4, z2, 2);
        } catch (Throwable th2) {
            th = th2;
            j3 = j;
            this.H0 = o(nz8, j3, j2, j3, z2, 2);
            throw th;
        }
    }

    public final long K(nz8 nz8, long j, boolean z2, boolean z3) {
        b0();
        h0(false, true);
        if (z3 || this.H0.e == 3) {
            W(2);
        }
        tt8 tt8 = this.B0;
        ot8 ot8 = tt8.i;
        ot8 ot82 = ot8;
        while (ot82 != null && !nz8.equals(ot82.f.a)) {
            ot82 = ot82.l;
        }
        if (z2 || ot8 != ot82 || (ot82 != null && ot82.o + j < 0)) {
            pk0[] pk0Arr = this.a;
            for (pk0 d : pk0Arr) {
                d(d);
            }
            if (ot82 != null) {
                while (tt8.i != ot82) {
                    tt8.a();
                }
                tt8.l(ot82);
                ot82.o = 1000000000000L;
                f(new boolean[pk0Arr.length], tt8.j.e());
            }
        }
        if (ot82 != null) {
            tt8.l(ot82);
            if (!ot82.d) {
                ot82.f = ot82.f.b(j);
            } else if (ot82.e) {
                mt8 mt8 = ot82.a;
                j = mt8.s(j);
                mt8.z(j - this.v0, this.w0);
            }
            D(j);
            s();
        } else {
            tt8.b();
            D(j);
        }
        k(false);
        this.y.f(2);
        return j;
    }

    public final void L(upb upb) {
        Looper looper = upb.f;
        if (!looper.getThread().isAlive()) {
            i8b.V("Trying to send message on a dead thread.");
            upb.b(false);
            return;
        }
        this.z0.a(looper, (Handler.Callback) null).d(new bk4(25, this, upb));
    }

    public final void N(AtomicBoolean atomicBoolean, boolean z2) {
        if (this.R0 != z2) {
            this.R0 = z2;
            if (!z2) {
                for (pk0 pk0 : this.a) {
                    if (!q(pk0) && this.b.remove(pk0)) {
                        pk0.B();
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

    public final void O(xc5 xc5) {
        this.I0.d(1);
        int i = xc5.c;
        b9e b9e = xc5.b;
        List list = xc5.a;
        if (i != -1) {
            this.V0 = new dd5(new cqb(list, b9e), xc5.c, xc5.d);
        }
        j09 j09 = this.C0;
        ArrayList arrayList = (ArrayList) j09.b;
        j09.p(0, arrayList.size());
        l(j09.b(arrayList.size(), list, b9e), false);
    }

    public final void P(boolean z2) {
        this.K0 = z2;
        C();
        if (this.L0) {
            tt8 tt8 = this.B0;
            if (tt8.j != tt8.i) {
                I(true);
                k(false);
            }
        }
    }

    public final void Q(int i, int i2, boolean z2, boolean z3) {
        this.I0.d(z3 ? 1 : 0);
        this.H0 = this.H0.d(i2, i, z2);
        h0(false, false);
        for (ot8 ot8 = this.B0.i; ot8 != null; ot8 = ot8.l) {
            for (md5 md5 : (md5[]) ot8.n.v) {
                if (md5 != null) {
                    md5.c(z2);
                }
            }
        }
        if (!X()) {
            b0();
            f0();
            return;
        }
        int i3 = this.H0.e;
        k7f k7f = this.y;
        if (i3 == 3) {
            wg4 wg4 = this.x0;
            wg4.c = true;
            ((tw8) wg4.o).b();
            Z();
            k7f.f(2);
        } else if (i3 == 2) {
            k7f.f(2);
        }
    }

    public final void R(gob gob) {
        this.y.e(16);
        wg4 wg4 = this.x0;
        wg4.f(gob);
        gob c2 = wg4.c();
        n(c2, c2.a, true, true);
    }

    public final void S(wb5 wb5) {
        this.c1 = wb5;
        jkf jkf = this.H0.a;
        tt8 tt8 = this.B0;
        tt8.getClass();
        wb5.getClass();
        if (!tt8.o.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < tt8.o.size(); i++) {
                ((ot8) tt8.o.get(i)).g();
            }
            tt8.o = arrayList;
        }
    }

    public final void T(int i) {
        this.P0 = i;
        jkf jkf = this.H0.a;
        tt8 tt8 = this.B0;
        tt8.g = i;
        if (!tt8.p(jkf)) {
            I(true);
        }
        k(false);
    }

    public final void U(boolean z2) {
        this.Q0 = z2;
        jkf jkf = this.H0.a;
        tt8 tt8 = this.B0;
        tt8.h = z2;
        if (!tt8.p(jkf)) {
            I(true);
        }
        k(false);
    }

    public final void V(b9e b9e) {
        this.I0.d(1);
        j09 j09 = this.C0;
        int size = ((ArrayList) j09.b).size();
        if (b9e.b.length != size) {
            b9e = new b9e(new Random(b9e.a.nextLong())).a(0, size);
        }
        j09.l = b9e;
        l(j09.f(), false);
    }

    public final void W(int i) {
        eob eob = this.H0;
        if (eob.e != i) {
            if (i != 2) {
                this.b1 = -9223372036854775807L;
            }
            this.H0 = eob.g(i);
        }
    }

    public final boolean X() {
        eob eob = this.H0;
        return eob.l && eob.n == 0;
    }

    public final boolean Y(jkf jkf, nz8 nz8) {
        if (nz8.b() || jkf.q()) {
            return false;
        }
        int i = jkf.h(nz8.a, this.Z).c;
        hkf hkf = this.Y;
        jkf.o(i, hkf);
        return hkf.a() && hkf.i && hkf.f != -9223372036854775807L;
    }

    public final void Z() {
        ot8 ot8 = this.B0.i;
        if (ot8 != null) {
            mqf mqf = ot8.n;
            int i = 0;
            while (true) {
                pk0[] pk0Arr = this.a;
                if (i < pk0Arr.length) {
                    if (mqf.N(i)) {
                        pk0 pk0 = pk0Arr[i];
                        int i2 = pk0.y;
                        boolean z2 = true;
                        if (i2 == 1) {
                            if (i2 != 1) {
                                z2 = false;
                            }
                            n79.n(z2);
                            pk0.y = 2;
                            pk0.v();
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void a(xc5 xc5, int i) {
        this.I0.d(1);
        j09 j09 = this.C0;
        if (i == -1) {
            i = ((ArrayList) j09.b).size();
        }
        l(j09.b(i, xc5.a, xc5.b), false);
    }

    public final void a0(boolean z2, boolean z3) {
        B(z2 || !this.R0, false, true, false);
        this.I0.d(z3 ? 1 : 0);
        tg4 tg4 = this.w;
        if (tg4.j.remove(this.F0) != null) {
            tg4.d();
        }
        W(1);
    }

    public final void b(mt8 mt8) {
        this.y.a(8, mt8).b();
    }

    public final void b0() {
        int i;
        wg4 wg4 = this.x0;
        wg4.c = false;
        tw8 tw8 = (tw8) wg4.o;
        if (tw8.b) {
            tw8.a(tw8.e());
            tw8.b = false;
        }
        for (pk0 pk0 : this.a) {
            if (q(pk0) && (i = pk0.y) == 2) {
                n79.n(i == 2);
                pk0.y = 1;
                pk0.w();
            }
        }
    }

    public final void c(qsd qsd) {
        this.y.a(9, (mt8) qsd).b();
    }

    public final void c0() {
        ot8 ot8 = this.B0.k;
        boolean z2 = this.O0 || (ot8 != null && ot8.a.d());
        eob eob = this.H0;
        if (z2 != eob.g) {
            eob eob2 = r2;
            eob eob3 = new eob(eob.a, eob.b, eob.c, eob.d, eob.e, eob.f, z2, eob.h, eob.i, eob.j, eob.k, eob.l, eob.m, eob.n, eob.o, eob.q, eob.r, eob.s, eob.t, eob.p);
            this.H0 = eob2;
        }
    }

    public final void d(pk0 pk0) {
        if (q(pk0)) {
            wg4 wg4 = this.x0;
            if (pk0 == ((pk0) wg4.w)) {
                wg4.x = null;
                wg4.w = null;
                wg4.b = true;
            }
            int i = pk0.y;
            if (i == 2) {
                n79.n(i == 2);
                pk0.y = 1;
                pk0.w();
            }
            n79.n(pk0.y == 1);
            pk0.c.u();
            pk0.y = 0;
            pk0.z = null;
            pk0.X = null;
            pk0.w0 = false;
            pk0.q();
            this.U0--;
        }
    }

    public final void d0(mqf mqf) {
        jkf jkf = this.H0.a;
        md5[] md5Arr = (md5[]) mqf.v;
        tg4 tg4 = this.w;
        rg4 rg4 = (rg4) tg4.j.get(this.F0);
        rg4.getClass();
        int i = tg4.f;
        if (i == -1) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                pk0[] pk0Arr = this.a;
                int i4 = 13107200;
                if (i2 < pk0Arr.length) {
                    if (md5Arr[i2] != null) {
                        switch (pk0Arr[i2].b) {
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
        rg4.b = i;
        tg4.d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:350:0x05d8, code lost:
        if (r4 >= r9.b()) goto L_0x052b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0673  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x06b0  */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x06b8  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x06ed  */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x06ef  */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x0702  */
    /* JADX WARNING: Removed duplicated region for block: B:486:0x0415 A[EDGE_INSN: B:486:0x0415->B:229:0x0415 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r50 = this;
            r0 = r50
            c7f r1 = r0.z0
            r1.getClass()
            long r11 = android.os.SystemClock.uptimeMillis()
            k7f r1 = r0.y
            r13 = 2
            r1.e(r13)
            eob r1 = r0.H0
            jkf r1 = r1.a
            boolean r1 = r1.q()
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
            if (r1 != 0) goto L_0x0027
            j09 r1 = r0.C0
            boolean r1 = r1.g
            if (r1 != 0) goto L_0x002f
        L_0x0027:
            r14 = r10
            r19 = r11
            r2 = 3
            r11 = 1
            r13 = 0
            goto L_0x041e
        L_0x002f:
            tt8 r1 = r0.B0
            long r2 = r0.W0
            ot8 r1 = r1.k
            if (r1 == 0) goto L_0x004d
            ot8 r4 = r1.l
            if (r4 != 0) goto L_0x003d
            r4 = 1
            goto L_0x003e
        L_0x003d:
            r4 = 0
        L_0x003e:
            defpackage.n79.n(r4)
            boolean r4 = r1.d
            if (r4 == 0) goto L_0x004d
            mt8 r4 = r1.a
            long r6 = r1.o
            long r2 = r2 - r6
            r4.A(r2)
        L_0x004d:
            tt8 r1 = r0.B0
            ot8 r2 = r1.k
            if (r2 == 0) goto L_0x0073
            rt8 r3 = r2.f
            boolean r3 = r3.i
            if (r3 != 0) goto L_0x0070
            boolean r2 = r2.f()
            if (r2 == 0) goto L_0x0070
            ot8 r2 = r1.k
            rt8 r2 = r2.f
            long r2 = r2.e
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x0070
            int r1 = r1.l
            r2 = 100
            if (r1 >= r2) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            r8 = 1
            goto L_0x015f
        L_0x0073:
            tt8 r1 = r0.B0
            long r2 = r0.W0
            eob r4 = r0.H0
            ot8 r5 = r1.k
            if (r5 != 0) goto L_0x0094
            jkf r2 = r4.a
            nz8 r3 = r4.b
            long r5 = r4.c
            long r8 = r4.s
            r16 = r1
            r17 = r2
            r18 = r3
            r19 = r5
            r21 = r8
            rt8 r1 = r16.e(r17, r18, r19, r21)
            goto L_0x009a
        L_0x0094:
            jkf r4 = r4.a
            rt8 r1 = r1.d(r4, r5, r2)
        L_0x009a:
            if (r1 == 0) goto L_0x0070
            tt8 r2 = r0.B0
            ot8 r3 = r2.k
            if (r3 != 0) goto L_0x00a8
            r3 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            goto L_0x00b3
        L_0x00a8:
            long r4 = r3.o
            rt8 r3 = r3.f
            long r6 = r3.e
            long r4 = r4 + r6
            long r6 = r1.b
            long r4 = r4 - r6
            r3 = r4
        L_0x00b3:
            r5 = 0
        L_0x00b4:
            java.util.List r6 = r2.o
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x00f6
            java.util.List r6 = r2.o
            java.lang.Object r6 = r6.get(r5)
            ot8 r6 = (defpackage.ot8) r6
            rt8 r6 = r6.f
            long r7 = r6.e
            int r9 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x00d2
            long r13 = r1.e
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x00ed
        L_0x00d2:
            long r7 = r6.b
            long r13 = r1.b
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x00ed
            nz8 r6 = r6.a
            nz8 r7 = r1.a
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00ed
            java.util.List r6 = r2.o
            java.lang.Object r5 = r6.remove(r5)
            ot8 r5 = (defpackage.ot8) r5
            goto L_0x00f7
        L_0x00ed:
            int r5 = r5 + 1
            r13 = 2
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00b4
        L_0x00f6:
            r5 = r10
        L_0x00f7:
            if (r5 != 0) goto L_0x0122
            lc5 r5 = r2.e
            ot8 r6 = new ot8
            java.lang.Object r5 = r5.b
            fd5 r5 = (defpackage.fd5) r5
            tg4 r7 = r5.w
            cb4 r7 = r7.a
            pk0[] r8 = r5.c
            pe8 r9 = r5.o
            j09 r13 = r5.C0
            mqf r5 = r5.v
            r24 = r6
            r25 = r8
            r26 = r3
            r28 = r9
            r29 = r7
            r30 = r13
            r31 = r1
            r32 = r5
            r24.<init>(r25, r26, r28, r29, r30, r31, r32)
            r5 = r6
            goto L_0x0126
        L_0x0122:
            r5.f = r1
            r5.o = r3
        L_0x0126:
            ot8 r3 = r2.k
            if (r3 == 0) goto L_0x0138
            ot8 r4 = r3.l
            if (r5 != r4) goto L_0x012f
            goto L_0x013c
        L_0x012f:
            r3.b()
            r3.l = r5
            r3.c()
            goto L_0x013c
        L_0x0138:
            r2.i = r5
            r2.j = r5
        L_0x013c:
            r2.m = r10
            r2.k = r5
            int r3 = r2.l
            r8 = 1
            int r3 = r3 + r8
            r2.l = r3
            r2.k()
            mt8 r2 = r5.a
            long r3 = r1.b
            r2.j(r0, r3)
            tt8 r2 = r0.B0
            ot8 r2 = r2.i
            if (r2 != r5) goto L_0x015b
            long r1 = r1.b
            r0.D(r1)
        L_0x015b:
            r1 = 0
            r0.k(r1)
        L_0x015f:
            boolean r1 = r0.O0
            if (r1 == 0) goto L_0x016d
            boolean r1 = r50.p()
            r0.O0 = r1
            r50.c0()
            goto L_0x0170
        L_0x016d:
            r50.s()
        L_0x0170:
            tt8 r9 = r0.B0
            ot8 r1 = r9.j
            if (r1 != 0) goto L_0x017b
        L_0x0176:
            r19 = r11
            r11 = r8
            goto L_0x02ca
        L_0x017b:
            ot8 r2 = r1.l
            pk0[] r13 = r0.a
            if (r2 == 0) goto L_0x0185
            boolean r2 = r0.L0
            if (r2 == 0) goto L_0x018a
        L_0x0185:
            r19 = r11
            r11 = r8
            goto L_0x0288
        L_0x018a:
            boolean r2 = r1.d
            if (r2 != 0) goto L_0x018f
            goto L_0x0176
        L_0x018f:
            r2 = 0
        L_0x0190:
            int r3 = r13.length
            if (r2 >= r3) goto L_0x01c6
            r3 = r13[r2]
            lcd[] r4 = r1.c
            r4 = r4[r2]
            lcd r5 = r3.z
            if (r5 != r4) goto L_0x0176
            if (r4 == 0) goto L_0x01c3
            boolean r4 = r3.m()
            if (r4 != 0) goto L_0x01c3
            ot8 r4 = r1.l
            rt8 r5 = r1.f
            boolean r5 = r5.f
            if (r5 == 0) goto L_0x0176
            boolean r5 = r4.d
            if (r5 == 0) goto L_0x0176
            boolean r5 = r3 instanceof defpackage.bgf
            if (r5 != 0) goto L_0x01c3
            boolean r5 = r3 instanceof defpackage.eq9
            if (r5 != 0) goto L_0x01c3
            long r5 = r3.v0
            long r3 = r4.e()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0176
        L_0x01c3:
            int r2 = r2 + 1
            goto L_0x0190
        L_0x01c6:
            ot8 r2 = r1.l
            boolean r3 = r2.d
            if (r3 != 0) goto L_0x01d7
            long r3 = r0.W0
            long r5 = r2.e()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x01d7
            goto L_0x0176
        L_0x01d7:
            mqf r14 = r1.n
            ot8 r2 = r9.j
            defpackage.n79.o(r2)
            ot8 r2 = r2.l
            r9.j = r2
            r9.k()
            ot8 r15 = r9.j
            defpackage.n79.o(r15)
            mqf r6 = r15.n
            eob r2 = r0.H0
            jkf r4 = r2.a
            rt8 r2 = r15.f
            nz8 r3 = r2.a
            rt8 r1 = r1.f
            nz8 r5 = r1.a
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r21 = 0
            r1 = r50
            r2 = r4
            r10 = r6
            r6 = r19
            r19 = r11
            r11 = r8
            r8 = r21
            r1.g0(r2, r3, r4, r5, r6, r8)
            boolean r1 = r15.d
            if (r1 == 0) goto L_0x0246
            mt8 r1 = r15.a
            long r1 = r1.w()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0246
            long r1 = r15.e()
            int r3 = r13.length
            r4 = 0
        L_0x0226:
            if (r4 >= r3) goto L_0x0234
            r5 = r13[r4]
            lcd r6 = r5.z
            if (r6 == 0) goto L_0x0231
            M(r5, r1)
        L_0x0231:
            int r4 = r4 + 1
            goto L_0x0226
        L_0x0234:
            boolean r1 = r15.f()
            if (r1 != 0) goto L_0x02ca
            r9.l(r15)
            r1 = 0
            r0.k(r1)
            r50.s()
            goto L_0x02ca
        L_0x0246:
            r1 = 0
        L_0x0247:
            int r2 = r13.length
            if (r1 >= r2) goto L_0x02ca
            boolean r2 = r14.N(r1)
            boolean r3 = r10.N(r1)
            if (r2 == 0) goto L_0x0285
            r2 = r13[r1]
            boolean r2 = r2.w0
            if (r2 != 0) goto L_0x0285
            pk0[] r2 = r0.c
            r2 = r2[r1]
            int r2 = r2.b
            r4 = -2
            if (r2 != r4) goto L_0x0265
            r8 = r11
            goto L_0x0266
        L_0x0265:
            r8 = 0
        L_0x0266:
            java.lang.Object r2 = r14.o
            s1d[] r2 = (defpackage.s1d[]) r2
            r2 = r2[r1]
            java.lang.Object r4 = r10.o
            s1d[] r4 = (defpackage.s1d[]) r4
            r4 = r4[r1]
            if (r3 == 0) goto L_0x027c
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x027c
            if (r8 == 0) goto L_0x0285
        L_0x027c:
            r2 = r13[r1]
            long r3 = r15.e()
            M(r2, r3)
        L_0x0285:
            int r1 = r1 + 1
            goto L_0x0247
        L_0x0288:
            rt8 r2 = r1.f
            boolean r2 = r2.i
            if (r2 != 0) goto L_0x0292
            boolean r2 = r0.L0
            if (r2 == 0) goto L_0x02ca
        L_0x0292:
            r2 = 0
        L_0x0293:
            int r3 = r13.length
            if (r2 >= r3) goto L_0x02ca
            r3 = r13[r2]
            lcd[] r4 = r1.c
            r4 = r4[r2]
            if (r4 == 0) goto L_0x02c7
            lcd r5 = r3.z
            if (r5 != r4) goto L_0x02c7
            boolean r4 = r3.m()
            if (r4 == 0) goto L_0x02c7
            rt8 r4 = r1.f
            long r4 = r4.e
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x02bf
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x02bf
            long r6 = r1.o
            long r4 = r4 + r6
            goto L_0x02c4
        L_0x02bf:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x02c4:
            M(r3, r4)
        L_0x02c7:
            int r2 = r2 + 1
            goto L_0x0293
        L_0x02ca:
            tt8 r1 = r0.B0
            ot8 r2 = r1.j
            if (r2 == 0) goto L_0x02d8
            ot8 r1 = r1.i
            if (r1 == r2) goto L_0x02d8
            boolean r1 = r2.g
            if (r1 == 0) goto L_0x02db
        L_0x02d8:
            r9 = 0
            goto L_0x0372
        L_0x02db:
            mqf r1 = r2.n
            r3 = 0
            r8 = 0
        L_0x02df:
            pk0[] r4 = r0.a
            int r5 = r4.length
            if (r3 >= r5) goto L_0x035f
            r4 = r4[r3]
            boolean r5 = q(r4)
            if (r5 != 0) goto L_0x02ed
            goto L_0x033e
        L_0x02ed:
            lcd r5 = r4.z
            lcd[] r6 = r2.c
            r7 = r6[r3]
            if (r5 == r7) goto L_0x02f7
            r5 = r11
            goto L_0x02f8
        L_0x02f7:
            r5 = 0
        L_0x02f8:
            boolean r7 = r1.N(r3)
            if (r7 == 0) goto L_0x0301
            if (r5 != 0) goto L_0x0301
            goto L_0x033e
        L_0x0301:
            boolean r5 = r4.w0
            if (r5 != 0) goto L_0x0350
            java.lang.Object r5 = r1.v
            md5[] r5 = (defpackage.md5[]) r5
            r5 = r5[r3]
            if (r5 == 0) goto L_0x0312
            int r7 = r5.length()
            goto L_0x0313
        L_0x0312:
            r7 = 0
        L_0x0313:
            ea6[] r9 = new defpackage.ea6[r7]
            r10 = 0
        L_0x0316:
            if (r10 >= r7) goto L_0x0321
            ea6 r12 = r5.d(r10)
            r9[r10] = r12
            int r10 = r10 + 1
            goto L_0x0316
        L_0x0321:
            r25 = r6[r3]
            long r26 = r2.e()
            long r5 = r2.o
            rt8 r7 = r2.f
            nz8 r7 = r7.a
            r23 = r4
            r24 = r9
            r28 = r5
            r30 = r7
            r23.A(r24, r25, r26, r28, r30)
            boolean r4 = r0.T0
            if (r4 == 0) goto L_0x033e
            if (r4 != 0) goto L_0x0340
        L_0x033e:
            r9 = 0
            goto L_0x035c
        L_0x0340:
            r9 = 0
            r0.T0 = r9
            eob r4 = r0.H0
            boolean r4 = r4.p
            if (r4 == 0) goto L_0x035c
            k7f r4 = r0.y
            r5 = 2
            r4.f(r5)
            goto L_0x035c
        L_0x0350:
            r9 = 0
            boolean r5 = r4.n()
            if (r5 == 0) goto L_0x035b
            r0.d(r4)
            goto L_0x035c
        L_0x035b:
            r8 = r11
        L_0x035c:
            int r3 = r3 + 1
            goto L_0x02df
        L_0x035f:
            r9 = 0
            r1 = r8 ^ 1
            if (r1 == 0) goto L_0x0372
            int r1 = r4.length
            boolean[] r1 = new boolean[r1]
            tt8 r2 = r0.B0
            ot8 r2 = r2.j
            long r2 = r2.e()
            r0.f(r1, r2)
        L_0x0372:
            r8 = r9
        L_0x0373:
            boolean r1 = r50.X()
            if (r1 != 0) goto L_0x037e
        L_0x0379:
            r13 = r9
            r2 = 3
            r14 = 0
            goto L_0x0419
        L_0x037e:
            boolean r1 = r0.L0
            if (r1 == 0) goto L_0x0383
            goto L_0x0379
        L_0x0383:
            tt8 r12 = r0.B0
            ot8 r1 = r12.i
            if (r1 != 0) goto L_0x038a
            goto L_0x0379
        L_0x038a:
            ot8 r1 = r1.l
            if (r1 == 0) goto L_0x0379
            long r2 = r0.W0
            long r4 = r1.e()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x0379
            boolean r1 = r1.g
            if (r1 == 0) goto L_0x0379
            if (r8 == 0) goto L_0x03a1
            r50.t()
        L_0x03a1:
            ot8 r1 = r12.a()
            r1.getClass()
            eob r2 = r0.H0
            nz8 r2 = r2.b
            java.lang.Object r2 = r2.a
            rt8 r3 = r1.f
            nz8 r3 = r3.a
            java.lang.Object r3 = r3.a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x03d3
            eob r2 = r0.H0
            nz8 r2 = r2.b
            int r3 = r2.b
            r4 = -1
            if (r3 != r4) goto L_0x03d3
            rt8 r3 = r1.f
            nz8 r3 = r3.a
            int r5 = r3.b
            if (r5 != r4) goto L_0x03d3
            int r2 = r2.e
            int r3 = r3.e
            if (r2 == r3) goto L_0x03d3
            r8 = r11
            goto L_0x03d4
        L_0x03d3:
            r8 = r9
        L_0x03d4:
            rt8 r1 = r1.f
            nz8 r2 = r1.a
            long r13 = r1.b
            long r5 = r1.c
            r10 = r8 ^ 1
            r15 = 0
            r1 = r50
            r3 = r13
            r7 = r13
            r13 = r9
            r9 = r10
            r14 = 0
            r10 = r15
            eob r1 = r1.o(r2, r3, r5, r7, r9, r10)
            r0.H0 = r1
            r50.C()
            r50.f0()
            eob r1 = r0.H0
            int r1 = r1.e
            r2 = 3
            if (r1 != r2) goto L_0x03fd
            r50.Z()
        L_0x03fd:
            ot8 r1 = r12.i
            mqf r1 = r1.n
            r9 = r13
        L_0x0402:
            pk0[] r3 = r0.a
            int r4 = r3.length
            if (r9 >= r4) goto L_0x0415
            boolean r4 = r1.N(r9)
            if (r4 == 0) goto L_0x0412
            r3 = r3[r9]
            r3.h()
        L_0x0412:
            int r9 = r9 + 1
            goto L_0x0402
        L_0x0415:
            r8 = r11
            r9 = r13
            goto L_0x0373
        L_0x0419:
            wb5 r1 = r0.c1
            r1.getClass()
        L_0x041e:
            eob r1 = r0.H0
            int r1 = r1.e
            if (r1 == r11) goto L_0x0782
            r3 = 4
            if (r1 != r3) goto L_0x0429
            goto L_0x0782
        L_0x0429:
            tt8 r1 = r0.B0
            ot8 r1 = r1.i
            if (r1 != 0) goto L_0x0435
            r4 = r19
            r0.H(r4)
            return
        L_0x0435:
            r4 = r19
            java.lang.String r6 = "doSomeWork"
            android.os.Trace.beginSection(r6)
            r50.f0()
            boolean r6 = r1.d
            if (r6 == 0) goto L_0x04c3
            c7f r6 = r0.z0
            r6.getClass()
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = defpackage.v0g.S(r6)
            r0.X0 = r6
            mt8 r6 = r1.a
            eob r7 = r0.H0
            long r7 = r7.s
            long r9 = r0.v0
            long r7 = r7 - r9
            boolean r9 = r0.w0
            r6.z(r7, r9)
            r6 = r11
            r8 = r6
            r9 = r13
        L_0x0463:
            pk0[] r7 = r0.a
            int r10 = r7.length
            if (r9 >= r10) goto L_0x04ca
            r7 = r7[r9]
            boolean r10 = q(r7)
            if (r10 != 0) goto L_0x0471
            goto L_0x04be
        L_0x0471:
            long r11 = r0.W0
            long r14 = r0.X0
            r7.z(r11, r14)
            if (r8 == 0) goto L_0x0482
            boolean r8 = r7.n()
            if (r8 == 0) goto L_0x0482
            r8 = 1
            goto L_0x0483
        L_0x0482:
            r8 = r13
        L_0x0483:
            lcd[] r10 = r1.c
            r10 = r10[r9]
            lcd r11 = r7.z
            if (r10 == r11) goto L_0x048d
            r10 = 1
            goto L_0x048e
        L_0x048d:
            r10 = r13
        L_0x048e:
            if (r10 != 0) goto L_0x0498
            boolean r11 = r7.m()
            if (r11 == 0) goto L_0x0498
            r11 = 1
            goto L_0x0499
        L_0x0498:
            r11 = r13
        L_0x0499:
            if (r10 != 0) goto L_0x04ac
            if (r11 != 0) goto L_0x04ac
            boolean r10 = r7.p()
            if (r10 != 0) goto L_0x04ac
            boolean r10 = r7.n()
            if (r10 == 0) goto L_0x04aa
            goto L_0x04ac
        L_0x04aa:
            r10 = r13
            goto L_0x04ad
        L_0x04ac:
            r10 = 1
        L_0x04ad:
            if (r6 == 0) goto L_0x04b3
            if (r10 == 0) goto L_0x04b3
            r6 = 1
            goto L_0x04b4
        L_0x04b3:
            r6 = r13
        L_0x04b4:
            if (r10 != 0) goto L_0x04be
            lcd r7 = r7.z
            r7.getClass()
            r7.b()
        L_0x04be:
            int r9 = r9 + 1
            r11 = 1
            r14 = 0
            goto L_0x0463
        L_0x04c3:
            mt8 r6 = r1.a
            r6.r()
            r6 = 1
            r8 = 1
        L_0x04ca:
            rt8 r7 = r1.f
            long r9 = r7.e
            if (r8 == 0) goto L_0x04e7
            boolean r7 = r1.d
            if (r7 == 0) goto L_0x04e7
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x04e5
            eob r7 = r0.H0
            long r7 = r7.s
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x04e7
        L_0x04e5:
            r9 = 1
            goto L_0x04e8
        L_0x04e7:
            r9 = r13
        L_0x04e8:
            if (r9 == 0) goto L_0x04f8
            boolean r7 = r0.L0
            if (r7 == 0) goto L_0x04f8
            r0.L0 = r13
            eob r7 = r0.H0
            int r7 = r7.n
            r8 = 5
            r0.Q(r7, r8, r13, r13)
        L_0x04f8:
            if (r9 == 0) goto L_0x050b
            rt8 r7 = r1.f
            boolean r7 = r7.i
            if (r7 == 0) goto L_0x050b
            r0.W(r3)
            r50.b0()
            r19 = r4
        L_0x0508:
            r4 = 1
            goto L_0x066c
        L_0x050b:
            eob r7 = r0.H0
            int r8 = r7.e
            r9 = 2
            if (r8 != r9) goto L_0x0605
            int r8 = r0.U0
            if (r8 != 0) goto L_0x051e
            boolean r9 = r50.r()
            r19 = r4
            goto L_0x05e0
        L_0x051e:
            if (r6 != 0) goto L_0x0525
            r19 = r4
            r9 = r13
            goto L_0x05e0
        L_0x0525:
            boolean r8 = r7.g
            if (r8 != 0) goto L_0x052e
        L_0x0529:
            r19 = r4
        L_0x052b:
            r9 = 1
            goto L_0x05e0
        L_0x052e:
            tt8 r8 = r0.B0
            ot8 r9 = r8.i
            jkf r7 = r7.a
            rt8 r10 = r9.f
            nz8 r10 = r10.a
            boolean r7 = r0.Y(r7, r10)
            if (r7 == 0) goto L_0x0543
            qg4 r7 = r0.D0
            long r10 = r7.j
            goto L_0x0548
        L_0x0543:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0548:
            ot8 r7 = r8.k
            boolean r8 = r7.f()
            if (r8 == 0) goto L_0x0558
            rt8 r8 = r7.f
            boolean r8 = r8.i
            if (r8 == 0) goto L_0x0558
            r8 = 1
            goto L_0x0559
        L_0x0558:
            r8 = r13
        L_0x0559:
            rt8 r12 = r7.f
            nz8 r12 = r12.a
            boolean r12 = r12.b()
            if (r12 == 0) goto L_0x0569
            boolean r7 = r7.d
            if (r7 != 0) goto L_0x0569
            r7 = 1
            goto L_0x056a
        L_0x0569:
            r7 = r13
        L_0x056a:
            if (r8 != 0) goto L_0x0529
            if (r7 != 0) goto L_0x0529
            eob r7 = r0.H0
            jkf r8 = r7.a
            rt8 r8 = r9.f
            nz8 r8 = r8.a
            long r7 = r7.q
            tt8 r9 = r0.B0
            ot8 r9 = r9.k
            r14 = 0
            if (r9 != 0) goto L_0x0584
            r19 = r4
            r3 = r14
            goto L_0x0590
        L_0x0584:
            r19 = r4
            long r3 = r0.W0
            long r12 = r9.o
            long r3 = r3 - r12
            long r7 = r7 - r3
            long r3 = java.lang.Math.max(r14, r7)
        L_0x0590:
            wg4 r7 = r0.x0
            gob r7 = r7.c()
            float r7 = r7.a
            eob r8 = r0.H0
            boolean r8 = r8.l
            boolean r8 = r0.M0
            tg4 r9 = r0.w
            r9.getClass()
            long r3 = defpackage.v0g.E(r3, r7)
            if (r8 == 0) goto L_0x05b1
            long r7 = r9.e
        L_0x05ab:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x05b4
        L_0x05b1:
            long r7 = r9.d
            goto L_0x05ab
        L_0x05b4:
            int r21 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r21 == 0) goto L_0x05bf
            r12 = 2
            long r10 = r10 / r12
            long r7 = java.lang.Math.min(r10, r7)
        L_0x05bf:
            int r10 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x052b
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x052b
            boolean r3 = r9.g
            if (r3 != 0) goto L_0x05df
            cb4 r3 = r9.a
            monitor-enter(r3)
            int r4 = r3.e     // Catch:{ all -> 0x05dc }
            int r7 = r3.c     // Catch:{ all -> 0x05dc }
            int r4 = r4 * r7
            monitor-exit(r3)
            int r3 = r9.b()
            if (r4 < r3) goto L_0x05df
            goto L_0x052b
        L_0x05dc:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x05dc }
            throw r0
        L_0x05df:
            r9 = 0
        L_0x05e0:
            if (r9 == 0) goto L_0x0603
            r0.W(r2)
            r3 = 0
            r0.a1 = r3
            boolean r3 = r50.X()
            if (r3 == 0) goto L_0x0508
            r3 = 0
            r0.h0(r3, r3)
            wg4 r3 = r0.x0
            r4 = 1
            r3.c = r4
            java.lang.Object r3 = r3.o
            tw8 r3 = (defpackage.tw8) r3
            r3.b()
            r50.Z()
            goto L_0x066c
        L_0x0603:
            r4 = 1
            goto L_0x0608
        L_0x0605:
            r19 = r4
            goto L_0x0603
        L_0x0608:
            eob r3 = r0.H0
            int r3 = r3.e
            if (r3 != r2) goto L_0x066c
            int r3 = r0.U0
            if (r3 != 0) goto L_0x0619
            boolean r3 = r50.r()
            if (r3 == 0) goto L_0x061b
            goto L_0x066c
        L_0x0619:
            if (r6 != 0) goto L_0x066c
        L_0x061b:
            boolean r3 = r50.X()
            r6 = 0
            r0.h0(r3, r6)
            r3 = 2
            r0.W(r3)
            boolean r3 = r0.M0
            if (r3 == 0) goto L_0x0669
            tt8 r3 = r0.B0
            ot8 r3 = r3.i
        L_0x062f:
            if (r3 == 0) goto L_0x0648
            mqf r6 = r3.n
            java.lang.Object r6 = r6.v
            md5[] r6 = (defpackage.md5[]) r6
            int r7 = r6.length
            r9 = 0
        L_0x0639:
            if (r9 >= r7) goto L_0x0645
            r8 = r6[r9]
            if (r8 == 0) goto L_0x0642
            r8.o()
        L_0x0642:
            int r9 = r9 + 1
            goto L_0x0639
        L_0x0645:
            ot8 r3 = r3.l
            goto L_0x062f
        L_0x0648:
            qg4 r3 = r0.D0
            long r6 = r3.j
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0656
            goto L_0x0669
        L_0x0656:
            long r10 = r3.c
            long r6 = r6 + r10
            r3.j = r6
            long r10 = r3.i
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 == 0) goto L_0x0667
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x0667
            r3.j = r10
        L_0x0667:
            r3.n = r8
        L_0x0669:
            r50.b0()
        L_0x066c:
            eob r3 = r0.H0
            int r3 = r3.e
            r6 = 2
            if (r3 != r6) goto L_0x06ad
            r9 = 0
        L_0x0674:
            pk0[] r3 = r0.a
            int r6 = r3.length
            if (r9 >= r6) goto L_0x0696
            r3 = r3[r9]
            boolean r3 = q(r3)
            if (r3 == 0) goto L_0x0693
            pk0[] r3 = r0.a
            r3 = r3[r9]
            lcd r3 = r3.z
            lcd[] r6 = r1.c
            r6 = r6[r9]
            if (r3 != r6) goto L_0x0693
            r3.getClass()
            r3.b()
        L_0x0693:
            int r9 = r9 + 1
            goto L_0x0674
        L_0x0696:
            eob r1 = r0.H0
            boolean r3 = r1.g
            if (r3 != 0) goto L_0x06ad
            long r6 = r1.r
            r8 = 500000(0x7a120, double:2.47033E-318)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x06ad
            boolean r1 = r50.p()
            if (r1 == 0) goto L_0x06ad
            r9 = r4
            goto L_0x06ae
        L_0x06ad:
            r9 = 0
        L_0x06ae:
            if (r9 != 0) goto L_0x06b8
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.b1 = r6
            goto L_0x06e1
        L_0x06b8:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r8 = r0.b1
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x06cf
            c7f r1 = r0.z0
            r1.getClass()
            long r6 = android.os.SystemClock.elapsedRealtime()
            r0.b1 = r6
            goto L_0x06e1
        L_0x06cf:
            c7f r1 = r0.z0
            r1.getClass()
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r8 = r0.b1
            long r6 = r6 - r8
            r8 = 4000(0xfa0, double:1.9763E-320)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x077a
        L_0x06e1:
            boolean r1 = r50.X()
            if (r1 == 0) goto L_0x06ef
            eob r1 = r0.H0
            int r1 = r1.e
            if (r1 != r2) goto L_0x06ef
            r9 = r4
            goto L_0x06f0
        L_0x06ef:
            r9 = 0
        L_0x06f0:
            boolean r1 = r0.T0
            if (r1 == 0) goto L_0x06fb
            boolean r1 = r0.S0
            if (r1 == 0) goto L_0x06fb
            if (r9 == 0) goto L_0x06fb
            goto L_0x06fc
        L_0x06fb:
            r4 = 0
        L_0x06fc:
            eob r1 = r0.H0
            boolean r3 = r1.p
            if (r3 == r4) goto L_0x0759
            eob r3 = new eob
            r23 = r3
            jkf r6 = r1.a
            r24 = r6
            nz8 r6 = r1.b
            r25 = r6
            long r6 = r1.c
            r26 = r6
            long r6 = r1.d
            r28 = r6
            int r6 = r1.e
            r30 = r6
            androidx.media3.exoplayer.ExoPlaybackException r6 = r1.f
            r31 = r6
            boolean r6 = r1.g
            r32 = r6
            upf r6 = r1.h
            r33 = r6
            mqf r6 = r1.i
            r34 = r6
            java.util.List r6 = r1.j
            r35 = r6
            nz8 r6 = r1.k
            r36 = r6
            boolean r6 = r1.l
            r37 = r6
            int r6 = r1.m
            r38 = r6
            int r6 = r1.n
            r39 = r6
            gob r6 = r1.o
            r40 = r6
            long r6 = r1.q
            r41 = r6
            long r6 = r1.r
            r43 = r6
            long r6 = r1.s
            r45 = r6
            long r6 = r1.t
            r47 = r6
            r49 = r4
            r23.<init>(r24, r25, r26, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43, r45, r47, r49)
            r0.H0 = r3
        L_0x0759:
            r1 = 0
            r0.S0 = r1
            if (r4 != 0) goto L_0x0776
            eob r1 = r0.H0
            int r1 = r1.e
            r3 = 4
            if (r1 != r3) goto L_0x0766
            goto L_0x0776
        L_0x0766:
            if (r9 != 0) goto L_0x0771
            r3 = 2
            if (r1 == r3) goto L_0x0771
            if (r1 != r2) goto L_0x0776
            int r1 = r0.U0
            if (r1 == 0) goto L_0x0776
        L_0x0771:
            r1 = r19
            r0.H(r1)
        L_0x0776:
            android.os.Trace.endSection()
            return
        L_0x077a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Playback stuck buffering and not loading"
            r0.<init>(r1)
            throw r0
        L_0x0782:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd5.e():void");
    }

    public final void e0(List list, int i, int i2) {
        boolean z2 = true;
        this.I0.d(1);
        j09 j09 = this.C0;
        j09.getClass();
        ArrayList arrayList = (ArrayList) j09.b;
        n79.g(i >= 0 && i <= i2 && i2 <= arrayList.size());
        if (list.size() != i2 - i) {
            z2 = false;
        }
        n79.g(z2);
        for (int i3 = i; i3 < i2; i3++) {
            ((h09) arrayList.get(i3)).a.t((ir8) list.get(i3 - i));
        }
        l(j09.f(), false);
    }

    public final void f(boolean[] zArr, long j) {
        pk0[] pk0Arr;
        Set set;
        int i;
        ot8 ot8;
        mqf mqf;
        tt8 tt8;
        Set set2;
        int i2;
        cn8 cn8;
        long j2 = j;
        tt8 tt82 = this.B0;
        ot8 ot82 = tt82.j;
        mqf mqf2 = ot82.n;
        int i3 = 0;
        while (true) {
            pk0Arr = this.a;
            int length = pk0Arr.length;
            set = this.b;
            if (i3 >= length) {
                break;
            }
            if (!mqf2.N(i3) && set.remove(pk0Arr[i3])) {
                pk0Arr[i3].B();
            }
            i3++;
        }
        int i4 = 0;
        while (i4 < pk0Arr.length) {
            if (mqf2.N(i4)) {
                boolean z2 = zArr[i4];
                pk0 pk0 = pk0Arr[i4];
                if (!q(pk0)) {
                    ot8 ot83 = tt82.j;
                    boolean z3 = ot83 == tt82.i;
                    mqf mqf3 = ot83.n;
                    s1d s1d = ((s1d[]) mqf3.o)[i4];
                    md5 md5 = ((md5[]) mqf3.v)[i4];
                    if (md5 != null) {
                        tt8 = tt82;
                        i2 = md5.length();
                    } else {
                        tt8 = tt82;
                        i2 = 0;
                    }
                    ea6[] ea6Arr = new ea6[i2];
                    mqf = mqf2;
                    for (int i5 = 0; i5 < i2; i5++) {
                        ea6Arr[i5] = md5.d(i5);
                    }
                    boolean z4 = X() && this.H0.e == 3;
                    boolean z5 = !z2 && z4;
                    this.U0++;
                    set.add(pk0);
                    lcd lcd = ot83.c[i4];
                    ot8 = ot82;
                    boolean z6 = z4;
                    long j3 = ot83.o;
                    nz8 nz8 = ot83.f.a;
                    n79.n(pk0.y == 0);
                    pk0.o = s1d;
                    pk0.y = 1;
                    pk0.r(z5, z3);
                    nz8 nz82 = nz8;
                    ea6[] ea6Arr2 = ea6Arr;
                    pk0 pk02 = pk0;
                    boolean z7 = z3;
                    i = i4;
                    long j4 = j3;
                    set2 = set;
                    pk0.A(ea6Arr2, lcd, j, j4, nz82);
                    pk02.w0 = false;
                    pk02.Z = j2;
                    pk02.v0 = j2;
                    pk02.s(j2, z5);
                    pk02.a(11, new vc5(this));
                    wg4 wg4 = this.x0;
                    wg4.getClass();
                    cn8 k = pk02.k();
                    if (!(k == null || k == (cn8 = (cn8) wg4.x))) {
                        if (cn8 == null) {
                            wg4.x = k;
                            wg4.w = pk02;
                            k.f((gob) ((tw8) wg4.o).w);
                        } else {
                            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z6 && z7) {
                        n79.n(pk02.y == 1);
                        pk02.y = 2;
                        pk02.v();
                    }
                    i4 = i + 1;
                    set = set2;
                    tt82 = tt8;
                    mqf2 = mqf;
                    ot82 = ot8;
                }
            }
            i = i4;
            tt8 = tt82;
            ot8 = ot82;
            mqf = mqf2;
            set2 = set;
            i4 = i + 1;
            set = set2;
            tt82 = tt8;
            mqf2 = mqf;
            ot82 = ot8;
        }
        ot82.g = true;
    }

    public final void f0() {
        ot8 ot8 = this.B0.i;
        if (ot8 != null) {
            long w2 = ot8.d ? ot8.a.w() : -9223372036854775807L;
            if (w2 != -9223372036854775807L) {
                if (!ot8.f()) {
                    this.B0.l(ot8);
                    k(false);
                    s();
                }
                D(w2);
                if (w2 != this.H0.s) {
                    eob eob = this.H0;
                    this.H0 = o(eob.b, w2, eob.c, w2, true, 5);
                }
            } else {
                wg4 wg4 = this.x0;
                boolean z2 = ot8 != this.B0.j;
                pk0 pk0 = (pk0) wg4.w;
                tw8 tw8 = (tw8) wg4.o;
                if (pk0 == null || pk0.n() || ((z2 && ((pk0) wg4.w).y != 2) || (!((pk0) wg4.w).p() && (z2 || ((pk0) wg4.w).m())))) {
                    wg4.b = true;
                    if (wg4.c) {
                        tw8.b();
                    }
                } else {
                    cn8 cn8 = (cn8) wg4.x;
                    cn8.getClass();
                    long e = cn8.e();
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
                    gob c2 = cn8.c();
                    if (!c2.equals((gob) tw8.w)) {
                        tw8.f(c2);
                        ((fd5) ((vg4) wg4.v)).y.a(16, c2).b();
                    }
                }
                long e2 = wg4.e();
                this.W0 = e2;
                long j = e2 - ot8.o;
                long j2 = this.H0.s;
                if (!this.y0.isEmpty() && !this.H0.b.b()) {
                    if (this.Z0) {
                        this.Z0 = false;
                    }
                    eob eob2 = this.H0;
                    eob2.a.b(eob2.b.a);
                    int min = Math.min(this.Y0, this.y0.size());
                    if (min > 0) {
                        rae.w(this.y0.get(min - 1));
                    }
                    if (min < this.y0.size()) {
                        rae.w(this.y0.get(min));
                    }
                    this.Y0 = min;
                }
                if (this.x0.J()) {
                    boolean z3 = !this.I0.e;
                    eob eob3 = this.H0;
                    this.H0 = o(eob3.b, j, eob3.c, j, z3, 6);
                } else {
                    eob eob4 = this.H0;
                    eob4.s = j;
                    eob4.t = SystemClock.elapsedRealtime();
                }
            }
            this.H0.q = this.B0.k.d();
            eob eob5 = this.H0;
            long j3 = eob5.q;
            ot8 ot82 = this.B0.k;
            eob5.r = ot82 == null ? 0 : Math.max(0, j3 - (this.W0 - ot82.o));
            eob eob6 = this.H0;
            if (eob6.l && eob6.e == 3 && Y(eob6.a, eob6.b)) {
                eob eob7 = this.H0;
                float f = 1.0f;
                if (eob7.o.a == 1.0f) {
                    qg4 qg4 = this.D0;
                    long g = g(eob7.a, eob7.b.a, eob7.s);
                    long j4 = this.H0.q;
                    ot8 ot83 = this.B0.k;
                    long max = ot83 == null ? 0 : Math.max(0, j4 - (this.W0 - ot83.o));
                    if (qg4.e != -9223372036854775807L) {
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
                                float S = (float) v0g.S(1000);
                                qg4.j = kr7.D(j7, qg4.g, qg4.j - (((long) ((qg4.m - 1.0f) * S)) + ((long) ((qg4.k - 1.0f) * S))));
                            } else {
                                long k = v0g.k(g - ((long) (Math.max(c44.DEFAULT_ASPECT_RATIO, qg4.m - 1.0f) / 1.0E-7f)), qg4.j, j7);
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
                                qg4.m = v0g.i((1.0E-7f * ((float) j9)) + 1.0f, qg4.l, qg4.k);
                            }
                            f = qg4.m;
                        } else {
                            f = qg4.m;
                        }
                    }
                    if (this.x0.c().a != f) {
                        gob gob = new gob(f, this.H0.o.b);
                        this.y.e(16);
                        this.x0.f(gob);
                        n(this.H0.o, this.x0.c().a, false, false);
                    }
                }
            }
        }
    }

    public final long g(jkf jkf, Object obj, long j) {
        ekf ekf = this.Z;
        int i = jkf.h(obj, ekf).c;
        hkf hkf = this.Y;
        jkf.o(i, hkf);
        if (hkf.f == -9223372036854775807L || !hkf.a() || !hkf.i) {
            return -9223372036854775807L;
        }
        return v0g.S(v0g.B(hkf.g) - hkf.f) - (j + ekf.e);
    }

    public final void g0(jkf jkf, nz8 nz8, jkf jkf2, nz8 nz82, long j, boolean z2) {
        if (!Y(jkf, nz8)) {
            gob gob = nz8.b() ? gob.d : this.H0.o;
            wg4 wg4 = this.x0;
            if (!wg4.c().equals(gob)) {
                this.y.e(16);
                wg4.f(gob);
                n(this.H0.o, gob.a, false, false);
                return;
            }
            return;
        }
        Object obj = nz8.a;
        ekf ekf = this.Z;
        int i = jkf.h(obj, ekf).c;
        hkf hkf = this.Y;
        jkf.o(i, hkf);
        wq8 wq8 = hkf.j;
        qg4 qg4 = this.D0;
        qg4.getClass();
        qg4.e = v0g.S(wq8.a);
        qg4.h = v0g.S(wq8.b);
        qg4.i = v0g.S(wq8.c);
        float f = wq8.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        qg4.l = f;
        float f2 = wq8.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        qg4.k = f2;
        if (f == 1.0f && f2 == 1.0f) {
            qg4.e = -9223372036854775807L;
        }
        qg4.a();
        if (j != -9223372036854775807L) {
            qg4.f = g(jkf, obj, j);
            qg4.a();
            return;
        }
        if (!v0g.a(!jkf2.q() ? jkf2.n(jkf2.h(nz82.a, ekf).c, hkf, 0).a : null, hkf.a) || z2) {
            qg4.f = -9223372036854775807L;
            qg4.a();
        }
    }

    public final Pair h(jkf jkf) {
        long j = 0;
        if (jkf.q()) {
            return Pair.create(eob.u, 0L);
        }
        int a2 = jkf.a(this.Q0);
        jkf jkf2 = jkf;
        Pair j2 = jkf2.j(this.Y, this.Z, a2, -9223372036854775807L);
        nz8 n = this.B0.n(jkf, j2.first, 0);
        long longValue = ((Long) j2.second).longValue();
        if (n.b()) {
            Object obj = n.a;
            ekf ekf = this.Z;
            jkf.h(obj, ekf);
            if (n.c == ekf.f(n.b)) {
                j = ekf.g.c;
            }
            longValue = j;
        }
        return Pair.create(n, Long.valueOf(longValue));
    }

    public final void h0(boolean z2, boolean z3) {
        long j;
        this.M0 = z2;
        if (!z2 || z3) {
            j = -9223372036854775807L;
        } else {
            this.z0.getClass();
            j = SystemClock.elapsedRealtime();
        }
        this.N0 = j;
    }

    public final boolean handleMessage(Message message) {
        int i;
        ot8 ot8;
        int i2;
        upb upb;
        Message message2 = message;
        int i3 = 1000;
        try {
            switch (message2.what) {
                case 1:
                    boolean z2 = message2.arg1 != 0;
                    int i4 = message2.arg2;
                    Q(i4 >> 4, i4 & 15, z2, true);
                    break;
                case 2:
                    e();
                    break;
                case 3:
                    J((dd5) message2.obj);
                    break;
                case 4:
                    R((gob) message2.obj);
                    break;
                case 5:
                    this.G0 = (und) message2.obj;
                    break;
                case 6:
                    a0(false, true);
                    break;
                case 7:
                    x();
                    return true;
                case 8:
                    m((mt8) message2.obj);
                    break;
                case 9:
                    i((mt8) message2.obj);
                    break;
                case 10:
                    A();
                    break;
                case 11:
                    T(message2.arg1);
                    break;
                case 12:
                    U(message2.arg1 != 0);
                    break;
                case 13:
                    N((AtomicBoolean) message2.obj, message2.arg1 != 0);
                    break;
                case Protos.Attaches.Attach.LOCATION /*14*/:
                    upb = (upb) message2.obj;
                    upb.getClass();
                    Looper looper = upb.f;
                    Looper looper2 = this.X;
                    k7f k7f = this.y;
                    if (looper != looper2) {
                        k7f.a(15, upb).b();
                        break;
                    } else {
                        synchronized (upb) {
                        }
                        upb.a.a(upb.d, upb.e);
                        upb.b(true);
                        int i5 = this.H0.e;
                        if (i5 == 3 || i5 == 2) {
                            k7f.f(2);
                            break;
                        }
                    }
                case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                    L((upb) message2.obj);
                    break;
                case 16:
                    gob gob = (gob) message2.obj;
                    n(gob, gob.a, true, false);
                    break;
                case LangUtils.HASH_SEED /*17*/:
                    O((xc5) message2.obj);
                    break;
                case 18:
                    a((xc5) message2.obj, message2.arg1);
                    break;
                case 19:
                    v((yc5) message2.obj);
                    break;
                case 20:
                    z(message2.arg1, message2.arg2, (b9e) message2.obj);
                    break;
                case 21:
                    V((b9e) message2.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    P(message2.arg1 != 0);
                    break;
                case 25:
                    A();
                    I(true);
                    break;
                case 26:
                    A();
                    I(true);
                    break;
                case 27:
                    e0((List) message2.obj, message2.arg1, message2.arg2);
                    break;
                case 28:
                    S((wb5) message2.obj);
                    break;
                case 29:
                    w();
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e) {
            ExoPlaybackException exoPlaybackException = e;
            int i6 = exoPlaybackException.X;
            tt8 tt8 = this.B0;
            if (i6 == 1 && (ot8 = tt8.j) != null) {
                exoPlaybackException = exoPlaybackException.d(ot8.f.a);
            }
            if (!exoPlaybackException.y0 || !(this.a1 == null || (i = exoPlaybackException.a) == 5004 || i == 5003)) {
                ExoPlaybackException exoPlaybackException2 = this.a1;
                if (exoPlaybackException2 != null) {
                    exoPlaybackException2.addSuppressed(exoPlaybackException);
                    exoPlaybackException = this.a1;
                }
                ExoPlaybackException exoPlaybackException3 = exoPlaybackException;
                i8b.p("Playback error", exoPlaybackException3);
                if (exoPlaybackException3.X == 1 && tt8.i != tt8.j) {
                    while (true) {
                        ot8 ot82 = tt8.i;
                        if (ot82 != tt8.j) {
                            tt8.a();
                        } else {
                            ot82.getClass();
                            t();
                            rt8 rt8 = ot82.f;
                            nz8 nz8 = rt8.a;
                            long j = rt8.b;
                            this.H0 = o(nz8, j, rt8.c, j, true, 0);
                        }
                    }
                }
                a0(true, false);
                this.H0 = this.H0.e(exoPlaybackException3);
            } else {
                i8b.W("Recoverable renderer error", exoPlaybackException);
                ExoPlaybackException exoPlaybackException4 = this.a1;
                if (exoPlaybackException4 != null) {
                    exoPlaybackException4.addSuppressed(exoPlaybackException);
                    exoPlaybackException = this.a1;
                } else {
                    this.a1 = exoPlaybackException;
                }
                k7f k7f2 = this.y;
                i7f a2 = k7f2.a(25, exoPlaybackException);
                k7f2.getClass();
                Message message3 = a2.a;
                message3.getClass();
                k7f2.a.sendMessageAtFrontOfQueue(message3);
                a2.a();
            }
        } catch (DrmSession$DrmSessionException e2) {
            DrmSession$DrmSessionException drmSession$DrmSessionException = e2;
            j(drmSession$DrmSessionException.a, drmSession$DrmSessionException);
        } catch (ParserException e3) {
            ParserException parserException = e3;
            boolean z3 = parserException.a;
            int i7 = parserException.b;
            if (i7 == 1) {
                i2 = z3 ? 3001 : 3003;
            } else {
                if (i7 == 4) {
                    i2 = z3 ? 3002 : 3004;
                }
                j(i3, parserException);
            }
            i3 = i2;
            j(i3, parserException);
        } catch (DataSourceException e4) {
            DataSourceException dataSourceException = e4;
            j(dataSourceException.a, dataSourceException);
        } catch (BehindLiveWindowException e5) {
            j(1002, e5);
        } catch (IOException e6) {
            j(2000, e6);
        } catch (RuntimeException e7) {
            RuntimeException runtimeException = e7;
            if ((runtimeException instanceof IllegalStateException) || (runtimeException instanceof IllegalArgumentException)) {
                i3 = 1004;
            }
            ExoPlaybackException exoPlaybackException5 = new ExoPlaybackException(2, runtimeException, i3);
            i8b.p("Playback error", exoPlaybackException5);
            a0(true, false);
            this.H0 = this.H0.e(exoPlaybackException5);
        } catch (Throwable th) {
            Throwable th2 = th;
            upb.b(true);
            throw th2;
        }
        t();
        return true;
    }

    public final void i(mt8 mt8) {
        ot8 ot8 = this.B0.k;
        if (ot8 != null && ot8.a == mt8) {
            long j = this.W0;
            if (ot8 != null) {
                n79.n(ot8.l == null);
                if (ot8.d) {
                    ot8.a.A(j - ot8.o);
                }
            }
            s();
        }
    }

    public final synchronized void i0(ch4 ch4, long j) {
        this.z0.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z2 = false;
        while (!((Boolean) ch4.get()).booleanValue() && j > 0) {
            try {
                this.z0.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z2 = true;
            }
            this.z0.getClass();
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    public final void j(int i, IOException iOException) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        ot8 ot8 = this.B0.i;
        if (ot8 != null) {
            exoPlaybackException = exoPlaybackException.d(ot8.f.a);
        }
        i8b.p("Playback error", exoPlaybackException);
        a0(false, false);
        this.H0 = this.H0.e(exoPlaybackException);
    }

    public final void k(boolean z2) {
        ot8 ot8 = this.B0.k;
        nz8 nz8 = ot8 == null ? this.H0.b : ot8.f.a;
        boolean z3 = !this.H0.k.equals(nz8);
        if (z3) {
            this.H0 = this.H0.b(nz8);
        }
        eob eob = this.H0;
        eob.q = ot8 == null ? eob.s : ot8.d();
        eob eob2 = this.H0;
        long j = eob2.q;
        ot8 ot82 = this.B0.k;
        long j2 = 0;
        if (ot82 != null) {
            j2 = Math.max(0, j - (this.W0 - ot82.o));
        }
        eob2.r = j2;
        if ((z3 || z2) && ot8 != null && ot8.d) {
            nz8 nz82 = ot8.f.a;
            d0(ot8.n);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: hkf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: dd5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v29, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v31, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v44, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v45, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: hkf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v61, resolved type: hkf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: ekf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v63, resolved type: ekf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v64, resolved type: dd5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v65, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v67, resolved type: int} */
    /* JADX WARNING: type inference failed for: r25v9 */
    /* JADX WARNING: type inference failed for: r25v18 */
    /* JADX WARNING: type inference failed for: r5v42 */
    /* JADX WARNING: type inference failed for: r25v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e4, code lost:
        if (r5.e(r6, r8) != 2) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e6, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f5, code lost:
        if (r5.i(r3.b) != false) goto L_0x01e6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0204  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(defpackage.jkf r40, boolean r41) {
        /*
            r39 = this;
            r11 = r39
            r12 = r40
            eob r0 = r11.H0
            dd5 r8 = r11.V0
            tt8 r9 = r11.B0
            int r4 = r11.P0
            boolean r10 = r11.Q0
            hkf r13 = r11.Y
            ekf r14 = r11.Z
            boolean r1 = r40.q()
            r7 = 1
            r5 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x003d
            bd5 r0 = new bd5
            nz8 r19 = defpackage.eob.u
            r25 = 1
            r26 = 0
            r20 = 0
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r24 = 0
            r18 = r0
            r18.<init>(r19, r20, r22, r24, r25, r26)
            r7 = r0
            r24 = r5
            r11 = -1
            r13 = 2
            goto L_0x0234
        L_0x003d:
            nz8 r1 = r0.b
            java.lang.Object r15 = r1.a
            jkf r2 = r0.a
            boolean r20 = r2.q()
            if (r20 != 0) goto L_0x0057
            java.lang.Object r3 = r1.a
            ekf r2 = r2.h(r3, r14)
            boolean r2 = r2.f
            if (r2 == 0) goto L_0x0054
            goto L_0x0057
        L_0x0054:
            r21 = 0
            goto L_0x0059
        L_0x0057:
            r21 = r7
        L_0x0059:
            nz8 r2 = r0.b
            boolean r2 = r2.b()
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
            if (r8 == 0) goto L_0x00c1
            r3 = 1
            r2 = r1
            r1 = r40
            r27 = r2
            r11 = -1
            r2 = r8
            r5 = r10
            r6 = r13
            r7 = r14
            android.util.Pair r1 = F(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x008a
            int r1 = r12.a(r10)
            r3 = r1
            r1 = r22
            r4 = 0
            r5 = 0
            r7 = 1
            goto L_0x00b4
        L_0x008a:
            long r2 = r8.c
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x009d
            java.lang.Object r1 = r1.first
            ekf r1 = r12.h(r1, r14)
            int r2 = r1.c
            r3 = r2
            r1 = r22
            r7 = 0
            goto L_0x00a9
        L_0x009d:
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3 = r11
            r7 = 1
        L_0x00a9:
            int r4 = r0.e
            r5 = 4
            if (r4 != r5) goto L_0x00b0
            r4 = 1
            goto L_0x00b1
        L_0x00b0:
            r4 = 0
        L_0x00b1:
            r5 = r4
            r4 = r7
            r7 = 0
        L_0x00b4:
            r38 = r4
            r36 = r5
            r37 = r7
            r7 = r27
            r24 = 0
            r4 = r3
            goto L_0x0169
        L_0x00c1:
            r27 = r1
            r11 = -1
            jkf r1 = r0.a
            boolean r1 = r1.q()
            if (r1 == 0) goto L_0x00df
            int r1 = r12.a(r10)
        L_0x00d0:
            r4 = r1
            r1 = r22
            r7 = r27
            r24 = 0
        L_0x00d7:
            r36 = 0
            r37 = 0
        L_0x00db:
            r38 = 0
            goto L_0x0169
        L_0x00df:
            int r1 = r12.b(r15)
            if (r1 != r11) goto L_0x0107
            jkf r6 = r0.a
            r1 = r13
            r2 = r14
            r3 = r4
            r4 = r10
            r5 = r15
            r7 = r40
            int r1 = G(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != r11) goto L_0x00fa
            int r1 = r12.a(r10)
            r7 = 1
            goto L_0x00fb
        L_0x00fa:
            r7 = 0
        L_0x00fb:
            r4 = r1
            r37 = r7
            r1 = r22
            r7 = r27
            r24 = 0
            r36 = 0
            goto L_0x00db
        L_0x0107:
            int r1 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x0112
            ekf r1 = r12.h(r15, r14)
            int r1 = r1.c
            goto L_0x00d0
        L_0x0112:
            if (r21 == 0) goto L_0x0160
            jkf r1 = r0.a
            r7 = r27
            java.lang.Object r2 = r7.a
            r1.h(r2, r14)
            jkf r1 = r0.a
            int r2 = r14.c
            r5 = 0
            hkf r1 = r1.n(r2, r13, r5)
            int r1 = r1.n
            jkf r2 = r0.a
            java.lang.Object r3 = r7.a
            int r2 = r2.b(r3)
            if (r1 != r2) goto L_0x0154
            long r1 = r14.e
            long r19 = r22 + r1
            ekf r1 = r12.h(r15, r14)
            int r4 = r1.c
            r1 = r40
            r2 = r13
            r3 = r14
            r24 = r5
            r5 = r19
            android.util.Pair r1 = r1.j(r2, r3, r4, r5)
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            goto L_0x0158
        L_0x0154:
            r24 = r5
            r1 = r22
        L_0x0158:
            r4 = r11
            r36 = 0
            r37 = 0
            r38 = 1
            goto L_0x0169
        L_0x0160:
            r7 = r27
            r24 = 0
            r4 = r11
            r1 = r22
            goto L_0x00d7
        L_0x0169:
            if (r4 == r11) goto L_0x0185
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r40
            r2 = r13
            r3 = r14
            android.util.Pair r1 = r1.j(r2, r3, r4, r5)
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r34 = r16
            goto L_0x0187
        L_0x0185:
            r34 = r1
        L_0x0187:
            nz8 r3 = r9.n(r12, r15, r1)
            int r4 = r3.e
            if (r4 == r11) goto L_0x0198
            int r5 = r7.e
            if (r5 == r11) goto L_0x0196
            if (r4 < r5) goto L_0x0196
            goto L_0x0198
        L_0x0196:
            r4 = 0
            goto L_0x0199
        L_0x0198:
            r4 = 1
        L_0x0199:
            java.lang.Object r5 = r7.a
            boolean r5 = r5.equals(r15)
            if (r5 == 0) goto L_0x01b1
            boolean r5 = r7.b()
            if (r5 != 0) goto L_0x01b1
            boolean r5 = r3.b()
            if (r5 != 0) goto L_0x01b1
            if (r4 == 0) goto L_0x01b1
            r4 = 1
            goto L_0x01b2
        L_0x01b1:
            r4 = 0
        L_0x01b2:
            ekf r5 = r12.h(r15, r14)
            if (r21 != 0) goto L_0x01c6
            int r6 = (r22 > r34 ? 1 : (r22 == r34 ? 0 : -1))
            if (r6 != 0) goto L_0x01c6
            java.lang.Object r6 = r7.a
            java.lang.Object r8 = r3.a
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x01c8
        L_0x01c6:
            r13 = 2
            goto L_0x01f8
        L_0x01c8:
            boolean r6 = r7.b()
            if (r6 == 0) goto L_0x01e8
            int r6 = r7.b
            boolean r8 = r5.i(r6)
            if (r8 == 0) goto L_0x01e8
            int r8 = r7.c
            int r9 = r5.e(r6, r8)
            r10 = 4
            if (r9 == r10) goto L_0x01c6
            int r5 = r5.e(r6, r8)
            r13 = 2
            if (r5 == r13) goto L_0x01f8
        L_0x01e6:
            r5 = 1
            goto L_0x01f9
        L_0x01e8:
            r13 = 2
            boolean r6 = r3.b()
            if (r6 == 0) goto L_0x01f8
            int r6 = r3.b
            boolean r5 = r5.i(r6)
            if (r5 == 0) goto L_0x01f8
            goto L_0x01e6
        L_0x01f8:
            r5 = 0
        L_0x01f9:
            if (r4 != 0) goto L_0x01fd
            if (r5 == 0) goto L_0x01fe
        L_0x01fd:
            r3 = r7
        L_0x01fe:
            boolean r4 = r3.b()
            if (r4 == 0) goto L_0x0228
            boolean r1 = r3.equals(r7)
            if (r1 == 0) goto L_0x020f
            long r0 = r0.s
            r32 = r0
            goto L_0x022a
        L_0x020f:
            java.lang.Object r0 = r3.a
            r12.h(r0, r14)
            int r0 = r3.c
            int r1 = r3.b
            int r1 = r14.f(r1)
            if (r0 != r1) goto L_0x0223
            q9 r0 = r14.g
            long r5 = r0.c
            goto L_0x0225
        L_0x0223:
            r5 = r24
        L_0x0225:
            r32 = r5
            goto L_0x022a
        L_0x0228:
            r32 = r1
        L_0x022a:
            bd5 r0 = new bd5
            r30 = r0
            r31 = r3
            r30.<init>(r31, r32, r34, r36, r37, r38)
            r7 = r0
        L_0x0234:
            java.lang.Object r0 = r7.f
            r9 = r0
            nz8 r9 = (defpackage.nz8) r9
            long r14 = r7.b
            boolean r6 = r7.c
            long r3 = r7.a
            r10 = r11
            r11 = r39
            eob r0 = r11.H0
            nz8 r0 = r0.b
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0258
            eob r0 = r11.H0
            long r0 = r0.s
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0255
            goto L_0x0258
        L_0x0255:
            r19 = 0
            goto L_0x025a
        L_0x0258:
            r19 = 1
        L_0x025a:
            r20 = 3
            boolean r0 = r7.d     // Catch:{ all -> 0x02a2 }
            if (r0 == 0) goto L_0x0281
            eob r0 = r11.H0     // Catch:{ all -> 0x027d }
            int r0 = r0.e     // Catch:{ all -> 0x027d }
            r5 = 1
            if (r0 == r5) goto L_0x0277
            r2 = 4
            r11.W(r2)     // Catch:{ all -> 0x026d }
        L_0x026b:
            r1 = 0
            goto L_0x0279
        L_0x026d:
            r0 = move-exception
        L_0x026e:
            r10 = r2
            r25 = r3
            r22 = r14
            r13 = 0
            r15 = r5
            goto L_0x03df
        L_0x0277:
            r2 = 4
            goto L_0x026b
        L_0x0279:
            r11.B(r1, r1, r1, r5)     // Catch:{ all -> 0x026d }
            goto L_0x0283
        L_0x027d:
            r0 = move-exception
            r2 = 4
            r5 = 1
            goto L_0x026e
        L_0x0281:
            r2 = 4
            r5 = 1
        L_0x0283:
            pk0[] r0 = r11.a     // Catch:{ all -> 0x026d }
            int r1 = r0.length     // Catch:{ all -> 0x026d }
            r2 = 0
        L_0x0287:
            if (r2 >= r1) goto L_0x02a4
            r5 = r0[r2]     // Catch:{ all -> 0x02a2 }
            jkf r8 = r5.y0     // Catch:{ all -> 0x02a2 }
            boolean r8 = defpackage.v0g.a(r8, r12)     // Catch:{ all -> 0x02a2 }
            if (r8 != 0) goto L_0x0295
            r5.y0 = r12     // Catch:{ all -> 0x02a2 }
        L_0x0295:
            int r2 = r2 + 1
            r5 = 1
            goto L_0x0287
        L_0x0299:
            r25 = r3
            r22 = r14
            r10 = 4
            r13 = 0
            r15 = 1
            goto L_0x03df
        L_0x02a2:
            r0 = move-exception
            goto L_0x0299
        L_0x02a4:
            if (r19 != 0) goto L_0x031b
            tt8 r1 = r11.B0     // Catch:{ all -> 0x0313 }
            long r5 = r11.W0     // Catch:{ all -> 0x0313 }
            ot8 r0 = r1.j     // Catch:{ all -> 0x030d }
            if (r0 != 0) goto L_0x02b5
            r22 = r14
            r13 = r24
        L_0x02b2:
            r25 = r3
            goto L_0x02f4
        L_0x02b5:
            r22 = r14
            long r13 = r0.o     // Catch:{ all -> 0x0309 }
            boolean r2 = r0.d     // Catch:{ all -> 0x0309 }
            if (r2 != 0) goto L_0x02be
            goto L_0x02b2
        L_0x02be:
            r2 = 0
        L_0x02bf:
            pk0[] r8 = r11.a     // Catch:{ all -> 0x0309 }
            int r15 = r8.length     // Catch:{ all -> 0x0309 }
            if (r2 >= r15) goto L_0x02b2
            r15 = r8[r2]     // Catch:{ all -> 0x0309 }
            boolean r15 = q(r15)     // Catch:{ all -> 0x0309 }
            if (r15 == 0) goto L_0x02d6
            r8 = r8[r2]     // Catch:{ all -> 0x0309 }
            lcd r15 = r8.z     // Catch:{ all -> 0x0309 }
            lcd[] r10 = r0.c     // Catch:{ all -> 0x0309 }
            r10 = r10[r2]     // Catch:{ all -> 0x0309 }
            if (r15 == r10) goto L_0x02d9
        L_0x02d6:
            r25 = r3
            goto L_0x02ee
        L_0x02d9:
            r25 = r3
            long r3 = r8.v0     // Catch:{ all -> 0x02ec }
            r28 = -9223372036854775808
            int r8 = (r3 > r28 ? 1 : (r3 == r28 ? 0 : -1))
            if (r8 != 0) goto L_0x02e6
            r13 = r28
            goto L_0x02f4
        L_0x02e6:
            long r3 = java.lang.Math.max(r3, r13)     // Catch:{ all -> 0x02ec }
            r13 = r3
            goto L_0x02ee
        L_0x02ec:
            r0 = move-exception
            goto L_0x0318
        L_0x02ee:
            int r2 = r2 + 1
            r3 = r25
            r10 = -1
            goto L_0x02bf
        L_0x02f4:
            r10 = 4
            r2 = r40
            r3 = r5
            r15 = 1
            r5 = r13
            boolean r0 = r1.q(r2, r3, r5)     // Catch:{ all -> 0x0305 }
            if (r0 != 0) goto L_0x035d
            r1 = 0
            r11.I(r1)     // Catch:{ all -> 0x0305 }
            goto L_0x035d
        L_0x0305:
            r0 = move-exception
        L_0x0306:
            r13 = 0
            goto L_0x03df
        L_0x0309:
            r0 = move-exception
            r25 = r3
            goto L_0x0318
        L_0x030d:
            r0 = move-exception
            r25 = r3
            r22 = r14
            goto L_0x0318
        L_0x0313:
            r0 = move-exception
            r25 = r3
            r22 = r14
        L_0x0318:
            r10 = 4
            r15 = 1
            goto L_0x0306
        L_0x031b:
            r25 = r3
            r22 = r14
            r10 = 4
            r15 = 1
            boolean r0 = r40.q()     // Catch:{ all -> 0x0305 }
            if (r0 != 0) goto L_0x035d
            tt8 r0 = r11.B0     // Catch:{ all -> 0x0305 }
            ot8 r0 = r0.i     // Catch:{ all -> 0x0305 }
        L_0x032b:
            if (r0 == 0) goto L_0x0347
            rt8 r1 = r0.f     // Catch:{ all -> 0x0305 }
            nz8 r1 = r1.a     // Catch:{ all -> 0x0305 }
            boolean r1 = r1.equals(r9)     // Catch:{ all -> 0x0305 }
            if (r1 == 0) goto L_0x0344
            tt8 r1 = r11.B0     // Catch:{ all -> 0x0305 }
            rt8 r2 = r0.f     // Catch:{ all -> 0x0305 }
            rt8 r1 = r1.h(r12, r2)     // Catch:{ all -> 0x0305 }
            r0.f = r1     // Catch:{ all -> 0x0305 }
            r0.i()     // Catch:{ all -> 0x0305 }
        L_0x0344:
            ot8 r0 = r0.l     // Catch:{ all -> 0x0305 }
            goto L_0x032b
        L_0x0347:
            tt8 r0 = r11.B0     // Catch:{ all -> 0x0305 }
            ot8 r1 = r0.i     // Catch:{ all -> 0x0305 }
            ot8 r0 = r0.j     // Catch:{ all -> 0x0305 }
            if (r1 == r0) goto L_0x0351
            r5 = r15
            goto L_0x0352
        L_0x0351:
            r5 = 0
        L_0x0352:
            r1 = r39
            r2 = r9
            r3 = r25
            long r0 = r1.K(r2, r3, r5, r6)     // Catch:{ all -> 0x0305 }
            r25 = r0
        L_0x035d:
            eob r0 = r11.H0
            jkf r4 = r0.a
            nz8 r5 = r0.b
            boolean r0 = r7.e
            if (r0 == 0) goto L_0x036a
            r6 = r25
            goto L_0x036c
        L_0x036a:
            r6 = r16
        L_0x036c:
            r8 = 0
            r1 = r39
            r2 = r40
            r3 = r9
            r13 = 0
            r1.g0(r2, r3, r4, r5, r6, r8)
            if (r19 != 0) goto L_0x0380
            eob r0 = r11.H0
            long r0 = r0.c
            int r0 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x03ba
        L_0x0380:
            eob r0 = r11.H0
            nz8 r1 = r0.b
            java.lang.Object r1 = r1.a
            jkf r0 = r0.a
            if (r19 == 0) goto L_0x039d
            if (r41 == 0) goto L_0x039d
            boolean r2 = r0.q()
            if (r2 != 0) goto L_0x039d
            ekf r2 = r11.Z
            ekf r0 = r0.h(r1, r2)
            boolean r0 = r0.f
            if (r0 != 0) goto L_0x039d
            goto L_0x039e
        L_0x039d:
            r15 = 0
        L_0x039e:
            eob r0 = r11.H0
            long r7 = r0.d
            int r0 = r12.b(r1)
            r1 = -1
            if (r0 != r1) goto L_0x03aa
            goto L_0x03ac
        L_0x03aa:
            r10 = r20
        L_0x03ac:
            r1 = r39
            r2 = r9
            r3 = r25
            r5 = r22
            r9 = r15
            eob r0 = r1.o(r2, r3, r5, r7, r9, r10)
            r11.H0 = r0
        L_0x03ba:
            r39.C()
            eob r0 = r11.H0
            jkf r0 = r0.a
            r11.E(r12, r0)
            eob r0 = r11.H0
            eob r0 = r0.h(r12)
            r11.H0 = r0
            boolean r0 = r40.q()
            if (r0 != 0) goto L_0x03d4
            r11.V0 = r13
        L_0x03d4:
            r1 = 0
            r11.k(r1)
            k7f r0 = r11.y
            r1 = 2
            r0.f(r1)
            return
        L_0x03df:
            eob r1 = r11.H0
            jkf r4 = r1.a
            nz8 r5 = r1.b
            boolean r1 = r7.e
            if (r1 == 0) goto L_0x03ec
            r6 = r25
            goto L_0x03ee
        L_0x03ec:
            r6 = r16
        L_0x03ee:
            r8 = 0
            r1 = r39
            r2 = r40
            r3 = r9
            r1.g0(r2, r3, r4, r5, r6, r8)
            if (r19 != 0) goto L_0x0401
            eob r1 = r11.H0
            long r1 = r1.c
            int r1 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x043b
        L_0x0401:
            eob r1 = r11.H0
            nz8 r2 = r1.b
            java.lang.Object r2 = r2.a
            jkf r1 = r1.a
            if (r19 == 0) goto L_0x041e
            if (r41 == 0) goto L_0x041e
            boolean r3 = r1.q()
            if (r3 != 0) goto L_0x041e
            ekf r3 = r11.Z
            ekf r1 = r1.h(r2, r3)
            boolean r1 = r1.f
            if (r1 != 0) goto L_0x041e
            goto L_0x041f
        L_0x041e:
            r15 = 0
        L_0x041f:
            eob r1 = r11.H0
            long r7 = r1.d
            int r1 = r12.b(r2)
            r2 = -1
            if (r1 != r2) goto L_0x042b
            goto L_0x042d
        L_0x042b:
            r10 = r20
        L_0x042d:
            r1 = r39
            r2 = r9
            r3 = r25
            r5 = r22
            r9 = r15
            eob r1 = r1.o(r2, r3, r5, r7, r9, r10)
            r11.H0 = r1
        L_0x043b:
            r39.C()
            eob r1 = r11.H0
            jkf r1 = r1.a
            r11.E(r12, r1)
            eob r1 = r11.H0
            eob r1 = r1.h(r12)
            r11.H0 = r1
            boolean r1 = r40.q()
            if (r1 != 0) goto L_0x0455
            r11.V0 = r13
        L_0x0455:
            r1 = 0
            r11.k(r1)
            k7f r1 = r11.y
            r2 = 2
            r1.f(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd5.l(jkf, boolean):void");
    }

    public final void m(mt8 mt8) {
        tt8 tt8 = this.B0;
        ot8 ot8 = tt8.k;
        if (ot8 != null && ot8.a == mt8) {
            float f = this.x0.c().a;
            jkf jkf = this.H0.a;
            ot8.d = true;
            ot8.m = ot8.a.x();
            mqf h = ot8.h(f, jkf);
            rt8 rt8 = ot8.f;
            long j = rt8.b;
            long j2 = rt8.e;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            long a2 = ot8.a(h, j, false, new boolean[ot8.i.length]);
            long j3 = ot8.o;
            rt8 rt82 = ot8.f;
            ot8.o = (rt82.b - a2) + j3;
            ot8.f = rt82.b(a2);
            d0(ot8.n);
            if (ot8 == tt8.i) {
                D(ot8.f.b);
                f(new boolean[this.a.length], tt8.j.e());
                eob eob = this.H0;
                nz8 nz8 = eob.b;
                long j4 = ot8.f.b;
                this.H0 = o(nz8, j4, eob.c, j4, false, 5);
            }
            s();
        }
    }

    public final void n(gob gob, float f, boolean z2, boolean z3) {
        int i;
        if (z2) {
            if (z3) {
                this.I0.d(1);
            }
            this.H0 = this.H0.f(gob);
        }
        float f2 = gob.a;
        ot8 ot8 = this.B0.i;
        while (true) {
            i = 0;
            if (ot8 == null) {
                break;
            }
            md5[] md5Arr = (md5[]) ot8.n.v;
            int length = md5Arr.length;
            while (i < length) {
                md5 md5 = md5Arr[i];
                if (md5 != null) {
                    md5.l(f2);
                }
                i++;
            }
            ot8 = ot8.l;
        }
        pk0[] pk0Arr = this.a;
        int length2 = pk0Arr.length;
        while (i < length2) {
            pk0 pk0 = pk0Arr[i];
            if (pk0 != null) {
                pk0.C(f, gob.a);
            }
            i++;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: k0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: k0d} */
    /* JADX WARNING: type inference failed for: r11v5, types: [qb7, jb7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.eob o(defpackage.nz8 r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r4 = r20
            r2 = r25
            boolean r3 = r0.Z0
            r6 = 0
            if (r3 != 0) goto L_0x0022
            eob r3 = r0.H0
            long r8 = r3.s
            int r3 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0022
            eob r3 = r0.H0
            nz8 r3 = r3.b
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r3 = r6
            goto L_0x0023
        L_0x0022:
            r3 = 1
        L_0x0023:
            r0.Z0 = r3
            r16.C()
            eob r3 = r0.H0
            upf r8 = r3.h
            mqf r9 = r3.i
            java.util.List r10 = r3.j
            j09 r11 = r0.C0
            boolean r11 = r11.g
            if (r11 == 0) goto L_0x00e0
            tt8 r3 = r0.B0
            ot8 r3 = r3.i
            if (r3 != 0) goto L_0x003f
            upf r8 = defpackage.upf.d
            goto L_0x0041
        L_0x003f:
            upf r8 = r3.m
        L_0x0041:
            if (r3 != 0) goto L_0x0046
            mqf r9 = r0.v
            goto L_0x0048
        L_0x0046:
            mqf r9 = r3.n
        L_0x0048:
            java.lang.Object r10 = r9.v
            md5[] r10 = (defpackage.md5[]) r10
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
            ea6 r15 = r15.d(r6)
            sp9 r15 = r15.k
            if (r15 != 0) goto L_0x006e
            sp9 r15 = new sp9
            qp9[] r7 = new defpackage.qp9[r6]
            r15.<init>((defpackage.qp9[]) r7)
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
            rt8 r10 = r3.f
            long r11 = r10.c
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x0092
            rt8 r10 = r10.a(r4)
            r3.f = r10
        L_0x0092:
            tt8 r3 = r0.B0
            ot8 r3 = r3.i
            if (r3 == 0) goto L_0x00dc
            mqf r3 = r3.n
            r10 = r6
            r11 = r10
        L_0x009c:
            pk0[] r12 = r0.a
            int r13 = r12.length
            if (r11 >= r13) goto L_0x00bf
            boolean r13 = r3.N(r11)
            if (r13 == 0) goto L_0x00bc
            r12 = r12[r11]
            int r12 = r12.b
            r13 = 1
            if (r12 == r13) goto L_0x00b0
            r3 = r6
            goto L_0x00c0
        L_0x00b0:
            java.lang.Object r12 = r3.o
            s1d[] r12 = (defpackage.s1d[]) r12
            r12 = r12[r11]
            int r12 = r12.a
            if (r12 == 0) goto L_0x00bd
            r10 = r13
            goto L_0x00bd
        L_0x00bc:
            r13 = 1
        L_0x00bd:
            int r11 = r11 + r13
            goto L_0x009c
        L_0x00bf:
            r3 = 1
        L_0x00c0:
            if (r10 == 0) goto L_0x00c6
            if (r3 == 0) goto L_0x00c6
            r3 = 1
            goto L_0x00c7
        L_0x00c6:
            r3 = r6
        L_0x00c7:
            boolean r10 = r0.T0
            if (r3 != r10) goto L_0x00cc
            goto L_0x00dc
        L_0x00cc:
            r0.T0 = r3
            if (r3 != 0) goto L_0x00dc
            eob r3 = r0.H0
            boolean r3 = r3.p
            if (r3 == 0) goto L_0x00dc
            k7f r3 = r0.y
            r10 = 2
            r3.f(r10)
        L_0x00dc:
            r12 = r7
            r10 = r8
            r11 = r9
            goto L_0x00f5
        L_0x00e0:
            nz8 r3 = r3.b
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00f2
            upf r3 = defpackage.upf.d
            mqf r7 = r0.v
            k0d r8 = defpackage.k0d.v
            r10 = r3
            r11 = r7
            r12 = r8
            goto L_0x00f5
        L_0x00f2:
            r11 = r9
            r12 = r10
            r10 = r8
        L_0x00f5:
            if (r24 == 0) goto L_0x0110
            ad5 r3 = r0.I0
            boolean r7 = r3.e
            if (r7 == 0) goto L_0x0109
            int r7 = r3.c
            r8 = 5
            if (r7 == r8) goto L_0x0109
            if (r2 != r8) goto L_0x0105
            r6 = 1
        L_0x0105:
            defpackage.n79.g(r6)
            goto L_0x0110
        L_0x0109:
            r6 = 1
            r3.d = r6
            r3.e = r6
            r3.c = r2
        L_0x0110:
            eob r2 = r0.H0
            long r6 = r2.q
            tt8 r3 = r0.B0
            ot8 r3 = r3.k
            if (r3 != 0) goto L_0x011d
            r8 = 0
            goto L_0x012a
        L_0x011d:
            long r13 = r0.W0
            long r8 = r3.o
            long r13 = r13 - r8
            long r6 = r6 - r13
            r8 = 0
            long r6 = java.lang.Math.max(r8, r6)
            r8 = r6
        L_0x012a:
            r0 = r2
            r1 = r17
            r2 = r18
            r4 = r20
            r6 = r22
            eob r0 = r0.c(r1, r2, r4, r6, r8, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd5.o(nz8, long, long, long, boolean, int):eob");
    }

    public final boolean p() {
        ot8 ot8 = this.B0.k;
        if (ot8 == null) {
            return false;
        }
        try {
            mt8 mt8 = ot8.a;
            if (!ot8.d) {
                mt8.r();
            } else {
                for (lcd lcd : ot8.c) {
                    if (lcd != null) {
                        lcd.b();
                    }
                }
            }
            return (!ot8.d ? 0 : mt8.i()) != Long.MIN_VALUE;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean r() {
        ot8 ot8 = this.B0.i;
        long j = ot8.f.e;
        return ot8.d && (j == -9223372036854775807L || this.H0.s < j || !X());
    }

    public final void s() {
        boolean z2;
        boolean z3 = false;
        if (!p()) {
            z2 = false;
        } else {
            ot8 ot8 = this.B0.k;
            long i = !ot8.d ? 0 : ot8.a.i();
            ot8 ot82 = this.B0.k;
            long max = ot82 == null ? 0 : Math.max(0, i - (this.W0 - ot82.o));
            if (ot8 != this.B0.i) {
                long j = ot8.f.b;
            }
            long j2 = Y(this.H0.a, ot8.f.a) ? this.D0.j : -9223372036854775807L;
            mpb mpb = this.F0;
            jkf jkf = this.H0.a;
            nz8 nz8 = ot8.f.a;
            float f = this.x0.c().a;
            boolean z4 = this.H0.l;
            b28 b28 = r9;
            b28 b282 = new b28(mpb, max, f, this.M0, j2);
            z2 = this.w.c(b28);
            ot8 ot83 = this.B0.i;
            if (!z2 && ot83.d && max < 500000 && (this.v0 > 0 || this.w0)) {
                ot83.a.z(this.H0.s, false);
                z2 = this.w.c(b28);
            }
        }
        this.O0 = z2;
        if (z2) {
            ot8 ot84 = this.B0.k;
            long j3 = this.W0;
            float f2 = this.x0.c().a;
            long j4 = this.N0;
            n79.n(ot84.l == null);
            mt8 mt8 = ot84.a;
            c38 c38 = new c38();
            c38.a = j3 - ot84.o;
            n79.g(f2 > c44.DEFAULT_ASPECT_RATIO || f2 == -3.4028235E38f);
            c38.b = f2;
            if (j4 >= 0 || j4 == -9223372036854775807L) {
                z3 = true;
            }
            n79.g(z3);
            c38.c = j4;
            mt8.k(new d38(c38));
        }
        c0();
    }

    public final void t() {
        ad5 ad5 = this.I0;
        eob eob = this.H0;
        boolean z2 = ad5.d | (((eob) ad5.f) != eob);
        ad5.d = z2;
        ad5.f = eob;
        if (z2) {
            tc5 tc5 = this.A0.b;
            tc5.z.d(new bk4(22, tc5, ad5));
            this.I0 = new ad5(this.H0);
        }
    }

    public final void u() {
        l(this.C0.f(), true);
    }

    public final void v(yc5 yc5) {
        jkf jkf;
        this.I0.d(1);
        int i = yc5.a;
        j09 j09 = this.C0;
        j09.getClass();
        ArrayList arrayList = (ArrayList) j09.b;
        int i2 = yc5.b;
        int i3 = yc5.c;
        n79.g(i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0);
        j09.l = yc5.d;
        if (i == i2 || i == i3) {
            jkf = j09.f();
        } else {
            int min = Math.min(i, i3);
            int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int i4 = ((h09) arrayList.get(min)).d;
            v0g.R(arrayList, i, i2, i3);
            while (min <= max) {
                h09 h09 = (h09) arrayList.get(min);
                h09.d = i4;
                i4 += h09.a.o.e.p();
                min++;
            }
            jkf = j09.f();
        }
        l(jkf, false);
    }

    public final void w() {
        this.I0.d(1);
        int i = 0;
        B(false, false, false, true);
        tg4 tg4 = this.w;
        tg4.getClass();
        long id = Thread.currentThread().getId();
        long j = tg4.k;
        n79.m("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        tg4.k = id;
        HashMap hashMap = tg4.j;
        mpb mpb = this.F0;
        if (!hashMap.containsKey(mpb)) {
            hashMap.put(mpb, new Object());
        }
        rg4 rg4 = (rg4) hashMap.get(mpb);
        rg4.getClass();
        int i2 = tg4.f;
        if (i2 == -1) {
            i2 = 13107200;
        }
        rg4.b = i2;
        rg4.a = false;
        W(this.H0.a.q() ? 4 : 2);
        wc4 wc4 = (wc4) this.x;
        wc4.getClass();
        j09 j09 = this.C0;
        n79.n(!j09.g);
        j09.m = wc4;
        while (true) {
            ArrayList arrayList = (ArrayList) j09.b;
            if (i < arrayList.size()) {
                h09 h09 = (h09) arrayList.get(i);
                j09.l(h09);
                ((HashSet) j09.f).add(h09);
                i++;
            } else {
                j09.g = true;
                this.y.f(2);
                return;
            }
        }
    }

    public final void x() {
        try {
            B(true, false, true, false);
            y();
            tg4 tg4 = this.w;
            if (tg4.j.remove(this.F0) != null) {
                tg4.d();
            }
            if (tg4.j.isEmpty()) {
                tg4.k = -1;
            }
            W(1);
            HandlerThread handlerThread = this.z;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.J0 = true;
                notifyAll();
            }
        } catch (Throwable th) {
            HandlerThread handlerThread2 = this.z;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.J0 = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final void y() {
        for (int i = 0; i < this.a.length; i++) {
            pk0 pk0 = this.c[i];
            synchronized (pk0.a) {
                pk0.z0 = null;
            }
            pk0 pk02 = this.a[i];
            n79.n(pk02.y == 0);
            pk02.t();
        }
    }

    public final void z(int i, int i2, b9e b9e) {
        boolean z2 = true;
        this.I0.d(1);
        j09 j09 = this.C0;
        j09.getClass();
        if (i < 0 || i > i2 || i2 > ((ArrayList) j09.b).size()) {
            z2 = false;
        }
        n79.g(z2);
        j09.l = b9e;
        j09.p(i, i2);
        l(j09.f(), false);
    }
}
