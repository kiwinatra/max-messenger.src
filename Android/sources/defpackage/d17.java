package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* renamed from: d17  reason: default package */
public final class d17 extends xj0 implements t17 {
    public final l07 h;
    public final zq8 i;
    public final vs6 j;
    public final o9a k;
    public final ow4 l;
    public final gga m;
    public final boolean n;
    public final int o;
    public final boolean p = false;
    public final vf4 q;
    public final long r;
    public final gr8 s;
    public vq8 t;
    public arf u;

    static {
        gd5.a("goog.exo.hls");
    }

    public d17(gr8 gr8, vs6 vs6, sx6 sx6, o9a o9a, ow4 ow4, gga gga, vf4 vf4, long j2, boolean z, int i2) {
        zq8 zq8 = gr8.b;
        zq8.getClass();
        this.i = zq8;
        this.s = gr8;
        this.t = gr8.c;
        this.j = vs6;
        this.h = sx6;
        this.k = o9a;
        this.l = ow4;
        this.m = gga;
        this.q = vf4;
        this.r = j2;
        this.n = z;
        this.o = i2;
    }

    public static s07 p(long j2, List list) {
        s07 s07 = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            s07 s072 = (s07) list.get(i2);
            long j3 = s072.v;
            if (j3 <= j2 && s072.Z) {
                s07 = s072;
            } else if (j3 > j2) {
                break;
            }
        }
        return s07;
    }

    public final lt8 a(mz8 mz8, cb4 cb4, long j2) {
        uz8 uz8 = new uz8(this.c.c, 0, mz8, 0);
        fw4 fw4 = new fw4(this.d.c, 0, mz8);
        arf arf = this.u;
        lpb lpb = this.g;
        y64.k(lpb);
        return new q07(this.h, this.q, this.j, arf, this.l, fw4, this.m, uz8, cb4, this.k, this.n, this.o, this.p, lpb);
    }

    public final gr8 f() {
        return this.s;
    }

    public final void g() {
        vf4 vf4 = this.q;
        w28 w28 = (w28) vf4.Z;
        if (w28 != null) {
            w28.b();
        }
        Uri uri = vf4.v;
        if (uri != null) {
            tf4 tf4 = (tf4) vf4.b.get(uri);
            tf4.b.b();
            IOException iOException = tf4.X;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    public final void i(arf arf) {
        this.u = arf;
        ow4 ow4 = this.l;
        ow4.prepare();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        lpb lpb = this.g;
        y64.k(lpb);
        ow4.c(myLooper, lpb);
        uz8 uz8 = new uz8(this.c.c, 0, (mz8) null, 0);
        Uri uri = this.i.a;
        vf4 vf4 = this.q;
        vf4.getClass();
        vf4.o = t0g.m((Handler.Callback) null);
        vf4.Y = uz8;
        vf4.v0 = this;
        p8b p8b = new p8b(((f74) ((vs6) vf4.y).b).a(), uri, 4, ((p17) vf4.z).f());
        y64.j(((w28) vf4.Z) == null);
        w28 w28 = new w28("DefaultHlsPlaylistTracker:MultivariantPlaylist", 0);
        vf4.Z = w28;
        int i2 = p8b.c;
        uz8.k(new k28(p8b.a, p8b.b, w28.P(p8b, vf4, ((gga) vf4.X).o(i2))), i2, -1, (ca6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void k(lt8 lt8) {
        q07 q07 = (q07) lt8;
        q07.b.c.remove(q07);
        for (d27 d27 : q07.C0) {
            if (d27.M0) {
                for (b27 b27 : d27.E0) {
                    b27.i();
                    zv4 zv4 = b27.h;
                    if (zv4 != null) {
                        zv4.f(b27.e);
                        b27.h = null;
                        b27.g = null;
                    }
                }
            }
            d27.X.O(d27);
            d27.A0.removeCallbacksAndMessages((Object) null);
            d27.Q0 = true;
            d27.B0.clear();
        }
        q07.z0 = null;
    }

    public final void m() {
        vf4 vf4 = this.q;
        vf4.v = null;
        vf4.x0 = null;
        vf4.w0 = null;
        vf4.x = -9223372036854775807L;
        ((w28) vf4.Z).O((u28) null);
        vf4.Z = null;
        HashMap hashMap = vf4.b;
        for (tf4 tf4 : hashMap.values()) {
            tf4.b.O((u28) null);
        }
        vf4.o.removeCallbacksAndMessages((Object) null);
        vf4.o = null;
        hashMap.clear();
        this.l.release();
    }

    /* JADX WARNING: type inference failed for: r25v0, types: [java.lang.Object, ejd] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(defpackage.b17 r42) {
        /*
            r41 = this;
            r0 = r41
            r1 = r42
            boolean r2 = r1.p
            long r5 = r1.h
            if (r2 == 0) goto L_0x0010
            long r7 = defpackage.t0g.M(r5)
            r12 = r7
            goto L_0x0015
        L_0x0010:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0015:
            r2 = 1
            r7 = 2
            int r8 = r1.d
            if (r8 == r7) goto L_0x0024
            if (r8 != r2) goto L_0x001e
            goto L_0x0024
        L_0x001e:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0025
        L_0x0024:
            r10 = r12
        L_0x0025:
            ejd r25 = new ejd
            vf4 r9 = r0.q
            java.lang.Object r14 = r9.w0
            j17 r14 = (defpackage.j17) r14
            r14.getClass()
            r25.<init>()
            n07 r26 = new n07
            java.util.List r15 = r14.k
            boolean r7 = r14.c
            java.lang.String r2 = r14.a
            java.util.List r3 = r14.b
            java.util.List r4 = r14.e
            r20 = r12
            java.util.List r12 = r14.f
            java.util.List r13 = r14.g
            r39 = r10
            java.util.List r10 = r14.h
            java.util.List r11 = r14.i
            r22 = r8
            ca6 r8 = r14.j
            java.util.Map r0 = r14.l
            java.util.List r14 = r14.m
            r27 = r2
            r28 = r3
            r29 = r4
            r30 = r12
            r31 = r13
            r32 = r10
            r33 = r11
            r34 = r8
            r35 = r15
            r36 = r7
            r37 = r0
            r38 = r14
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            boolean r0 = r9.w
            long r2 = r1.u
            tb7 r4 = r1.r
            boolean r10 = r1.g
            long r11 = r1.e
            if (r0 == 0) goto L_0x01bd
            long r13 = r9.x
            long r28 = r5 - r13
            boolean r0 = r1.o
            if (r0 == 0) goto L_0x0086
            long r13 = r28 + r2
            r14 = r13
            goto L_0x008b
        L_0x0086:
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x008b:
            boolean r9 = r1.p
            if (r9 == 0) goto L_0x00a0
            r13 = r41
            long r7 = r13.r
            long r7 = defpackage.t0g.t(r7)
            long r7 = defpackage.t0g.D(r7)
            long r5 = r5 + r2
            long r7 = r7 - r5
            r32 = r7
            goto L_0x00a4
        L_0x00a0:
            r13 = r41
            r32 = 0
        L_0x00a4:
            vq8 r5 = r13.t
            long r5 = r5.a
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            a17 r7 = r1.v
            if (r9 == 0) goto L_0x00ba
            long r5 = defpackage.t0g.D(r5)
            r30 = r5
            goto L_0x00e7
        L_0x00ba:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x00c6
            long r8 = r2 - r11
            goto L_0x00e3
        L_0x00c6:
            long r8 = r7.d
            int r18 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r18 == 0) goto L_0x00d7
            r18 = r8
            long r8 = r1.n
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x00d7
            r8 = r18
            goto L_0x00e3
        L_0x00d7:
            long r8 = r7.c
            int r26 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r26 == 0) goto L_0x00de
            goto L_0x00e3
        L_0x00de:
            r5 = 3
            long r8 = r1.m
            long r8 = r8 * r5
        L_0x00e3:
            long r8 = r8 + r32
            r30 = r8
        L_0x00e7:
            long r2 = r2 + r32
            r34 = r2
            long r5 = defpackage.t0g.k(r30, r32, r34)
            gr8 r8 = r13.s
            vq8 r8 = r8.c
            float r9 = r8.o
            r26 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r9 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1))
            r27 = 0
            if (r9 != 0) goto L_0x0117
            float r8 = r8.v
            int r8 = (r8 > r26 ? 1 : (r8 == r26 ? 0 : -1))
            if (r8 != 0) goto L_0x0117
            long r8 = r7.c
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 != 0) goto L_0x0117
            long r7 = r7.d
            int r7 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r7 != 0) goto L_0x0117
            r7 = 1
            goto L_0x0119
        L_0x0117:
            r7 = r27
        L_0x0119:
            long r5 = defpackage.t0g.M(r5)
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r7 == 0) goto L_0x0124
            r37 = r8
            goto L_0x012a
        L_0x0124:
            vq8 r9 = r13.t
            float r9 = r9.o
            r37 = r9
        L_0x012a:
            if (r7 == 0) goto L_0x012f
            r38 = r8
            goto L_0x0135
        L_0x012f:
            vq8 r7 = r13.t
            float r7 = r7.v
            r38 = r7
        L_0x0135:
            vq8 r7 = new vq8
            r35 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r30 = r7
            r31 = r5
            r33 = r35
            r30.<init>(r31, r33, r35, r37, r38)
            r13.t = r7
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0151
            goto L_0x0157
        L_0x0151:
            long r5 = defpackage.t0g.D(r5)
            long r11 = r2 - r5
        L_0x0157:
            if (r10 == 0) goto L_0x015e
            r2 = r11
        L_0x015a:
            r5 = r22
        L_0x015c:
            r4 = 2
            goto L_0x0191
        L_0x015e:
            tb7 r2 = r1.s
            s07 r2 = p(r11, r2)
            if (r2 == 0) goto L_0x0169
            long r2 = r2.v
            goto L_0x015a
        L_0x0169:
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x0174
            r5 = r22
            r2 = 0
            goto L_0x015c
        L_0x0174:
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r3 = 1
            int r2 = defpackage.t0g.e(r2, r4, r3)
            java.lang.Object r2 = r4.get(r2)
            w07 r2 = (defpackage.w07) r2
            tb7 r3 = r2.v0
            s07 r3 = p(r11, r3)
            if (r3 == 0) goto L_0x018e
            long r2 = r3.v
            goto L_0x015a
        L_0x018e:
            long r2 = r2.v
            goto L_0x015a
        L_0x0191:
            if (r5 != r4) goto L_0x019a
            boolean r4 = r1.f
            if (r4 == 0) goto L_0x019a
            r24 = 1
            goto L_0x019c
        L_0x019a:
            r24 = r27
        L_0x019c:
            jce r4 = new jce
            r5 = 1
            r23 = r0 ^ 1
            vq8 r0 = r13.t
            r27 = r0
            r22 = 1
            gr8 r0 = r13.s
            r26 = r0
            long r0 = r1.u
            r16 = r0
            r9 = r4
            r10 = r39
            r0 = r13
            r12 = r20
            r18 = r28
            r20 = r2
            r9.<init>(r10, r12, r14, r16, r18, r20, r22, r23, r24, r25, r26, r27)
            goto L_0x020b
        L_0x01bd:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r41
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x01ea
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x01cf
            goto L_0x01ea
        L_0x01cf:
            if (r10 != 0) goto L_0x01e8
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x01d6
            goto L_0x01e8
        L_0x01d6:
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r3 = 1
            int r2 = defpackage.t0g.e(r2, r4, r3)
            java.lang.Object r2 = r4.get(r2)
            w07 r2 = (defpackage.w07) r2
            long r2 = r2.v
            goto L_0x01ec
        L_0x01e8:
            r2 = r11
            goto L_0x01ec
        L_0x01ea:
            r2 = 0
        L_0x01ec:
            jce r4 = new jce
            r9 = r4
            gr8 r5 = r0.s
            r26 = r5
            r27 = 0
            long r5 = r1.u
            r14 = r5
            r16 = r5
            r18 = 0
            r22 = 1
            r23 = 0
            r24 = 1
            r10 = r39
            r12 = r20
            r20 = r2
            r9.<init>(r10, r12, r14, r16, r18, r20, r22, r23, r24, r25, r26, r27)
        L_0x020b:
            r0.j(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d17.q(b17):void");
    }
}
