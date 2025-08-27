package defpackage;

import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: wv6  reason: default package */
public final class wv6 implements v05, w05 {
    public final /* synthetic */ int a = 0;
    public String b;
    public boolean c;
    public final boolean[] d;
    public long e;
    public long f;
    public final Object g;
    public Object h;
    public Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;

    public wv6(ata ata) {
        this.g = ata;
        this.d = new boolean[3];
        this.j = new v4a(32, 0);
        this.k = new v4a(33, 0);
        this.l = new v4a(34, 0);
        this.m = new v4a(39, 0);
        this.n = new v4a(40, 0);
        this.f = -9223372036854775807L;
        this.o = new g1g(3, false);
    }

    public final void a() {
        switch (this.a) {
            case 0:
                this.e = 0;
                this.f = -9223372036854775807L;
                vzg.p(this.d);
                ((v4a) this.j).c();
                ((v4a) this.k).c();
                ((v4a) this.l).c();
                ((v4a) this.m).c();
                ((v4a) this.n).c();
                vv6 vv6 = (vv6) this.i;
                if (vv6 != null) {
                    vv6.e = false;
                    vv6.f = false;
                    vv6.g = false;
                    vv6.h = false;
                    vv6.i = false;
                    return;
                }
                return;
            default:
                this.e = 0;
                this.f = -9223372036854775807L;
                b0h.k(this.d);
                ((v4a) this.j).c();
                ((v4a) this.k).c();
                ((v4a) this.l).c();
                ((v4a) this.m).c();
                ((v4a) this.n).c();
                vv6 vv62 = (vv6) this.i;
                if (vv62 != null) {
                    vv62.e = false;
                    vv62.f = false;
                    vv62.g = false;
                    vv62.h = false;
                    vv62.i = false;
                    return;
                }
                return;
        }
    }

    public final void b(int i2, byte[] bArr, int i3) {
        switch (this.a) {
            case 0:
                vv6 vv6 = (vv6) this.i;
                if (vv6.e) {
                    int i4 = vv6.c;
                    int i5 = (i2 + 2) - i4;
                    if (i5 < i3) {
                        vv6.f = (bArr[i5] & ByteCompanionObject.MIN_VALUE) != 0;
                        vv6.e = false;
                    } else {
                        vv6.c = (i3 - i2) + i4;
                    }
                }
                if (!this.c) {
                    ((v4a) this.j).a(i2, bArr, i3);
                    ((v4a) this.k).a(i2, bArr, i3);
                    ((v4a) this.l).a(i2, bArr, i3);
                }
                ((v4a) this.m).a(i2, bArr, i3);
                ((v4a) this.n).a(i2, bArr, i3);
                return;
            default:
                vv6 vv62 = (vv6) this.i;
                if (vv62.e) {
                    int i6 = vv62.c;
                    int i7 = (i2 + 2) - i6;
                    if (i7 < i3) {
                        vv62.f = (bArr[i7] & ByteCompanionObject.MIN_VALUE) != 0;
                        vv62.e = false;
                    } else {
                        vv62.c = (i3 - i2) + i6;
                    }
                }
                if (!this.c) {
                    ((v4a) this.j).a(i2, bArr, i3);
                    ((v4a) this.k).a(i2, bArr, i3);
                    ((v4a) this.l).a(i2, bArr, i3);
                }
                ((v4a) this.m).a(i2, bArr, i3);
                ((v4a) this.n).a(i2, bArr, i3);
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0241 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(defpackage.l8b r38) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            r2 = 3
            java.lang.Object r3 = r0.h
            zpf r3 = (defpackage.zpf) r3
            defpackage.n79.o(r3)
            int r3 = defpackage.v0g.a
        L_0x000e:
            int r3 = r38.a()
            if (r3 <= 0) goto L_0x0256
            int r3 = r1.b
            int r4 = r1.c
            byte[] r5 = r1.a
            long r6 = r0.e
            int r8 = r38.a()
            long r8 = (long) r8
            long r6 = r6 + r8
            r0.e = r6
            java.lang.Object r6 = r0.h
            zpf r6 = (defpackage.zpf) r6
            int r7 = r38.a()
            r8 = 0
            r6.b(r1, r7, r8)
        L_0x0030:
            if (r3 >= r4) goto L_0x0252
            boolean[] r6 = r0.d
            int r6 = defpackage.b0h.q(r5, r3, r4, r6)
            if (r6 != r4) goto L_0x003e
            r0.b(r3, r5, r4)
            return
        L_0x003e:
            int r7 = r6 + 3
            byte r9 = r5[r7]
            r9 = r9 & 126(0x7e, float:1.77E-43)
            r10 = 1
            int r9 = r9 >> r10
            int r11 = r6 - r3
            if (r11 <= 0) goto L_0x004d
            r0.b(r3, r5, r6)
        L_0x004d:
            int r3 = r4 - r6
            long r12 = r0.e
            long r14 = (long) r3
            long r12 = r12 - r14
            if (r11 >= 0) goto L_0x0057
            int r6 = -r11
            goto L_0x0058
        L_0x0057:
            r6 = r8
        L_0x0058:
            long r14 = r0.f
            java.lang.Object r11 = r0.i
            vv6 r11 = (defpackage.vv6) r11
            boolean r2 = r0.c
            boolean r10 = r11.i
            if (r10 == 0) goto L_0x0070
            boolean r10 = r11.f
            if (r10 == 0) goto L_0x0070
            boolean r2 = r11.b
            r11.l = r2
            r11.i = r8
        L_0x006e:
            r10 = r9
            goto L_0x0099
        L_0x0070:
            boolean r10 = r11.g
            if (r10 != 0) goto L_0x0078
            boolean r10 = r11.f
            if (r10 == 0) goto L_0x006e
        L_0x0078:
            if (r2 == 0) goto L_0x0089
            boolean r2 = r11.h
            if (r2 == 0) goto L_0x0089
            r10 = r9
            long r8 = r11.a
            long r8 = r12 - r8
            int r8 = (int) r8
            int r8 = r8 + r3
            r11.a(r8)
            goto L_0x008a
        L_0x0089:
            r10 = r9
        L_0x008a:
            long r8 = r11.a
            r11.j = r8
            long r8 = r11.d
            r11.k = r8
            boolean r8 = r11.b
            r11.l = r8
            r8 = 1
            r11.h = r8
        L_0x0099:
            boolean r8 = r0.c
            java.lang.Object r9 = r0.l
            v4a r9 = (defpackage.v4a) r9
            java.lang.Object r11 = r0.k
            v4a r11 = (defpackage.v4a) r11
            java.lang.Object r2 = r0.j
            v4a r2 = (defpackage.v4a) r2
            if (r8 != 0) goto L_0x0171
            r2.b(r6)
            r11.b(r6)
            r9.b(r6)
            boolean r8 = r2.d
            if (r8 == 0) goto L_0x0171
            boolean r8 = r11.d
            if (r8 == 0) goto L_0x0171
            boolean r8 = r9.d
            if (r8 == 0) goto L_0x0171
            java.lang.Object r8 = r0.h
            zpf r8 = (defpackage.zpf) r8
            java.lang.String r1 = r0.b
            r17 = r4
            int r4 = r2.f
            r18 = r5
            int r5 = r11.f
            int r5 = r5 + r4
            r19 = r7
            int r7 = r9.f
            int r5 = r5 + r7
            byte[] r5 = new byte[r5]
            byte[] r7 = r2.e
            r20 = r3
            r3 = 0
            java.lang.System.arraycopy(r7, r3, r5, r3, r4)
            byte[] r4 = r11.e
            int r7 = r2.f
            r16 = r10
            int r10 = r11.f
            java.lang.System.arraycopy(r4, r3, r5, r7, r10)
            byte[] r4 = r9.e
            int r7 = r2.f
            int r10 = r11.f
            int r7 = r7 + r10
            int r10 = r9.f
            java.lang.System.arraycopy(r4, r3, r5, r7, r10)
            r3 = r2
            byte[] r4 = r11.e
            int r7 = r11.f
            r10 = 3
            x4a r4 = defpackage.b0h.I(r10, r4, r7)
            int r7 = r4.c
            int r2 = r4.d
            int r10 = r4.a
            r27 = r9
            boolean r9 = r4.b
            r28 = r11
            int[] r11 = r4.g
            r29 = r3
            int r3 = r4.h
            r21 = r10
            r22 = r9
            r23 = r7
            r24 = r2
            r25 = r11
            r26 = r3
            java.lang.String r2 = defpackage.hd8.e(r21, r22, r23, r24, r25, r26)
            ba6 r3 = new ba6
            r3.<init>()
            r3.a = r1
            java.lang.String r1 = "video/hevc"
            java.lang.String r1 = defpackage.vq9.l(r1)
            r3.m = r1
            r3.i = r2
            int r1 = r4.i
            r3.s = r1
            int r1 = r4.j
            r3.t = r1
            int r1 = r4.e
            int r34 = r1 + 8
            int r1 = r4.f
            int r35 = r1 + 8
            m53 r1 = new m53
            int r2 = r4.o
            r36 = 0
            int r7 = r4.m
            int r9 = r4.n
            r30 = r1
            r31 = r7
            r32 = r9
            r33 = r2
            r30.<init>(r31, r32, r33, r34, r35, r36)
            r3.z = r1
            float r1 = r4.k
            r3.w = r1
            int r1 = r4.l
            r3.o = r1
            java.util.List r1 = java.util.Collections.singletonList(r5)
            r3.p = r1
            ea6 r1 = new ea6
            r1.<init>(r3)
            r8.e(r1)
            r1 = 1
            r0.c = r1
            goto L_0x0181
        L_0x0171:
            r29 = r2
            r20 = r3
            r17 = r4
            r18 = r5
            r19 = r7
            r27 = r9
            r16 = r10
            r28 = r11
        L_0x0181:
            java.lang.Object r1 = r0.m
            v4a r1 = (defpackage.v4a) r1
            boolean r2 = r1.b(r6)
            java.lang.Object r3 = r0.g
            wsb r3 = (defpackage.wsb) r3
            r4 = 5
            java.lang.Object r5 = r0.o
            l8b r5 = (defpackage.l8b) r5
            if (r2 == 0) goto L_0x01ab
            byte[] r2 = r1.e
            int r7 = r1.f
            int r2 = defpackage.b0h.P(r7, r2)
            byte[] r7 = r1.e
            r5.E(r2, r7)
            r5.H(r4)
            java.lang.Object r2 = r3.b
            zpf[] r2 = (defpackage.zpf[]) r2
            defpackage.q8.e(r14, r5, r2)
        L_0x01ab:
            java.lang.Object r2 = r0.n
            r7 = r2
            v4a r7 = (defpackage.v4a) r7
            boolean r2 = r7.b(r6)
            if (r2 == 0) goto L_0x01cd
            byte[] r2 = r7.e
            int r6 = r7.f
            int r2 = defpackage.b0h.P(r6, r2)
            byte[] r6 = r7.e
            r5.E(r2, r6)
            r5.H(r4)
            java.lang.Object r2 = r3.b
            zpf[] r2 = (defpackage.zpf[]) r2
            defpackage.q8.e(r14, r5, r2)
        L_0x01cd:
            long r2 = r0.f
            java.lang.Object r4 = r0.i
            vv6 r4 = (defpackage.vv6) r4
            boolean r5 = r0.c
            r6 = 0
            r4.f = r6
            r4.g = r6
            r4.d = r2
            r4.c = r6
            r4.a = r12
            r3 = 32
            r6 = r16
            if (r6 < r3) goto L_0x01ea
            r8 = 40
            if (r6 != r8) goto L_0x01ed
        L_0x01ea:
            r3 = 1
            r8 = 0
            goto L_0x0215
        L_0x01ed:
            boolean r8 = r4.h
            if (r8 == 0) goto L_0x0200
            boolean r8 = r4.i
            if (r8 != 0) goto L_0x0200
            if (r5 == 0) goto L_0x01fc
            r5 = r20
            r4.a(r5)
        L_0x01fc:
            r8 = 0
            r4.h = r8
            goto L_0x0201
        L_0x0200:
            r8 = 0
        L_0x0201:
            if (r3 > r6) goto L_0x0207
            r2 = 35
            if (r6 <= r2) goto L_0x020b
        L_0x0207:
            r2 = 39
            if (r6 != r2) goto L_0x0214
        L_0x020b:
            boolean r2 = r4.i
            r3 = 1
            r2 = r2 ^ r3
            r4.g = r2
            r4.i = r3
            goto L_0x0215
        L_0x0214:
            r3 = 1
        L_0x0215:
            r2 = 16
            if (r6 < r2) goto L_0x021f
            r2 = 21
            if (r6 > r2) goto L_0x021f
            r2 = r3
            goto L_0x0220
        L_0x021f:
            r2 = r8
        L_0x0220:
            r4.b = r2
            if (r2 != 0) goto L_0x022b
            r2 = 9
            if (r6 > r2) goto L_0x0229
            goto L_0x022b
        L_0x0229:
            r10 = r8
            goto L_0x022c
        L_0x022b:
            r10 = r3
        L_0x022c:
            r4.e = r10
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x0241
            r2 = r29
            r2.d(r6)
            r11 = r28
            r11.d(r6)
            r9 = r27
            r9.d(r6)
        L_0x0241:
            r1.d(r6)
            r7.d(r6)
            r1 = r38
            r4 = r17
            r5 = r18
            r3 = r19
            r2 = 3
            goto L_0x0030
        L_0x0252:
            r1 = r38
            goto L_0x000e
        L_0x0256:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv6.f(l8b):void");
    }

    public void g(boolean z) {
        n79.o((zpf) this.h);
        int i2 = v0g.a;
        if (z) {
            vv6 vv6 = (vv6) this.i;
            long j2 = this.e;
            vv6.l = vv6.b;
            vv6.a((int) (j2 - vv6.a));
            vv6.j = vv6.a;
            vv6.a = j2;
            vv6.a(0);
            vv6.h = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:174:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x04c1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(defpackage.g1g r43) {
        /*
            r42 = this;
            r0 = r42
            r1 = r43
            r4 = 3
            r5 = 1
            java.lang.Object r6 = r0.h
            ypf r6 = (defpackage.ypf) r6
            defpackage.y64.k(r6)
            int r6 = defpackage.t0g.a
        L_0x000f:
            int r6 = r43.c()
            if (r6 <= 0) goto L_0x04d7
            int r6 = r1.b
            int r7 = r1.c
            byte[] r8 = r1.a
            long r9 = r0.e
            int r11 = r43.c()
            long r11 = (long) r11
            long r9 = r9 + r11
            r0.e = r9
            java.lang.Object r9 = r0.h
            ypf r9 = (defpackage.ypf) r9
            int r10 = r43.c()
            r9.c(r10, r1)
        L_0x0030:
            if (r6 >= r7) goto L_0x04d3
            boolean[] r9 = r0.d
            int r9 = defpackage.vzg.t(r8, r6, r7, r9)
            if (r9 != r7) goto L_0x003e
            r0.b(r6, r8, r7)
            return
        L_0x003e:
            int r10 = r9 + 3
            byte r11 = r8[r10]
            r11 = r11 & 126(0x7e, float:1.77E-43)
            int r11 = r11 >> r5
            int r12 = r9 - r6
            if (r12 <= 0) goto L_0x004c
            r0.b(r6, r8, r9)
        L_0x004c:
            int r6 = r7 - r9
            long r13 = r0.e
            long r2 = (long) r6
            long r13 = r13 - r2
            r2 = 0
            if (r12 >= 0) goto L_0x0058
            int r3 = -r12
        L_0x0056:
            r12 = r10
            goto L_0x005a
        L_0x0058:
            r3 = r2
            goto L_0x0056
        L_0x005a:
            long r9 = r0.f
            java.lang.Object r15 = r0.i
            vv6 r15 = (defpackage.vv6) r15
            boolean r4 = r0.c
            boolean r5 = r15.i
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == 0) goto L_0x007c
            boolean r5 = r15.f
            if (r5 == 0) goto L_0x007c
            boolean r4 = r15.b
            r15.l = r4
            r15.i = r2
        L_0x0075:
            r19 = r3
            r29 = r7
            r30 = r8
            goto L_0x00cb
        L_0x007c:
            boolean r5 = r15.g
            if (r5 != 0) goto L_0x0084
            boolean r5 = r15.f
            if (r5 == 0) goto L_0x0075
        L_0x0084:
            if (r4 == 0) goto L_0x00b6
            boolean r4 = r15.h
            if (r4 == 0) goto L_0x00b6
            long r4 = r15.a
            r19 = r3
            long r2 = r13 - r4
            int r2 = (int) r2
            int r27 = r6 + r2
            long r2 = r15.k
            int r22 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r22 != 0) goto L_0x009a
            goto L_0x00b8
        L_0x009a:
            boolean r1 = r15.l
            r29 = r7
            r30 = r8
            long r7 = r15.j
            long r4 = r4 - r7
            int r4 = (int) r4
            java.lang.Object r5 = r15.m
            r22 = r5
            ypf r22 = (defpackage.ypf) r22
            r28 = 0
            r23 = r2
            r25 = r1
            r26 = r4
            r22.b(r23, r25, r26, r27, r28)
            goto L_0x00bc
        L_0x00b6:
            r19 = r3
        L_0x00b8:
            r29 = r7
            r30 = r8
        L_0x00bc:
            long r1 = r15.a
            r15.j = r1
            long r1 = r15.d
            r15.k = r1
            boolean r1 = r15.b
            r15.l = r1
            r1 = 1
            r15.h = r1
        L_0x00cb:
            boolean r1 = r0.c
            java.lang.Object r4 = r0.l
            v4a r4 = (defpackage.v4a) r4
            java.lang.Object r5 = r0.k
            v4a r5 = (defpackage.v4a) r5
            java.lang.Object r7 = r0.j
            v4a r7 = (defpackage.v4a) r7
            if (r1 != 0) goto L_0x03ce
            r1 = r19
            r7.b(r1)
            r5.b(r1)
            r4.b(r1)
            boolean r15 = r7.d
            if (r15 == 0) goto L_0x03bc
            boolean r15 = r5.d
            if (r15 == 0) goto L_0x03bc
            boolean r15 = r4.d
            if (r15 == 0) goto L_0x03bc
            java.lang.Object r15 = r0.h
            ypf r15 = (defpackage.ypf) r15
            java.lang.String r2 = r0.b
            int r3 = r7.f
            int r8 = r5.f
            int r8 = r8 + r3
            r24 = r12
            int r12 = r4.f
            int r8 = r8 + r12
            byte[] r8 = new byte[r8]
            byte[] r12 = r7.e
            r25 = r6
            r6 = 0
            java.lang.System.arraycopy(r12, r6, r8, r6, r3)
            byte[] r3 = r5.e
            int r12 = r7.f
            r26 = r11
            int r11 = r5.f
            java.lang.System.arraycopy(r3, r6, r8, r12, r11)
            byte[] r3 = r4.e
            int r11 = r7.f
            int r12 = r5.f
            int r11 = r11 + r12
            int r12 = r4.f
            java.lang.System.arraycopy(r3, r6, r8, r11, r12)
            ky1 r3 = new ky1
            byte[] r11 = r5.e
            int r12 = r5.f
            r27 = r4
            r4 = 3
            r3.<init>((int) r6, (int) r12, (int) r4, (byte[]) r11)
            r6 = 44
            r3.t(r6)
            int r6 = r3.i(r4)
            r3.s()
            r4 = 2
            int r31 = r3.i(r4)
            boolean r32 = r3.h()
            r11 = 5
            int r33 = r3.i(r11)
            r11 = 0
            r12 = 32
            r34 = 0
        L_0x014e:
            if (r11 >= r12) goto L_0x0163
            boolean r12 = r3.h()
            if (r12 == 0) goto L_0x015e
            r12 = 1
            int r16 = r12 << r11
            r16 = r34 | r16
            r34 = r16
            goto L_0x015f
        L_0x015e:
            r12 = 1
        L_0x015f:
            int r11 = r11 + r12
            r12 = 32
            goto L_0x014e
        L_0x0163:
            r12 = 1
            r11 = 6
            int[] r4 = new int[r11]
            r12 = 0
        L_0x0168:
            if (r12 >= r11) goto L_0x0178
            r11 = 8
            int r20 = r3.i(r11)
            r4[r12] = r20
            r20 = 1
            int r12 = r12 + 1
            r11 = 6
            goto L_0x0168
        L_0x0178:
            r11 = 8
            int r36 = r3.i(r11)
            r11 = 0
            r12 = 0
        L_0x0180:
            if (r12 >= r6) goto L_0x0199
            boolean r35 = r3.h()
            if (r35 == 0) goto L_0x018a
            int r11 = r11 + 89
        L_0x018a:
            boolean r35 = r3.h()
            r20 = 8
            if (r35 == 0) goto L_0x0194
            int r11 = r11 + 8
        L_0x0194:
            r21 = 1
            int r12 = r12 + 1
            goto L_0x0180
        L_0x0199:
            r20 = 8
            r3.t(r11)
            if (r6 <= 0) goto L_0x01a7
            int r11 = 8 - r6
            r12 = 2
            int r11 = r11 * r12
            r3.t(r11)
        L_0x01a7:
            r3.m()
            int r11 = r3.m()
            r12 = 3
            if (r11 != r12) goto L_0x01b4
            r3.s()
        L_0x01b4:
            int r12 = r3.m()
            int r35 = r3.m()
            boolean r37 = r3.h()
            if (r37 == 0) goto L_0x01f4
            int r37 = r3.m()
            int r38 = r3.m()
            int r39 = r3.m()
            int r40 = r3.m()
            r41 = r5
            r5 = 1
            if (r11 == r5) goto L_0x01df
            r5 = 2
            if (r11 != r5) goto L_0x01db
            goto L_0x01df
        L_0x01db:
            r5 = 1
            r16 = 1
            goto L_0x01e2
        L_0x01df:
            r5 = 1
            r16 = 2
        L_0x01e2:
            if (r11 != r5) goto L_0x01e6
            r5 = 2
            goto L_0x01e7
        L_0x01e6:
            r5 = 1
        L_0x01e7:
            int r37 = r37 + r38
            int r37 = r37 * r16
            int r12 = r12 - r37
            int r39 = r39 + r40
            int r39 = r39 * r5
            int r35 = r35 - r39
            goto L_0x01f6
        L_0x01f4:
            r41 = r5
        L_0x01f6:
            r3.m()
            r3.m()
            int r5 = r3.m()
            boolean r11 = r3.h()
            if (r11 == 0) goto L_0x0208
            r11 = 0
            goto L_0x0209
        L_0x0208:
            r11 = r6
        L_0x0209:
            if (r11 > r6) goto L_0x0219
            r3.m()
            r3.m()
            r3.m()
            r16 = 1
            int r11 = r11 + 1
            goto L_0x0209
        L_0x0219:
            r3.m()
            r3.m()
            r3.m()
            r3.m()
            r3.m()
            r3.m()
            boolean r6 = r3.h()
            r11 = 4
            if (r6 == 0) goto L_0x0285
            boolean r6 = r3.h()
            if (r6 == 0) goto L_0x0285
            r6 = 0
        L_0x0239:
            if (r6 >= r11) goto L_0x0285
            r28 = r7
            r7 = 6
            r11 = 0
        L_0x023f:
            if (r11 >= r7) goto L_0x027a
            boolean r37 = r3.h()
            if (r37 != 0) goto L_0x024f
            r3.m()
            r38 = r13
            r7 = 1
        L_0x024d:
            r14 = 3
            goto L_0x026d
        L_0x024f:
            r7 = 1
            int r21 = r6 << 1
            r16 = 4
            int r21 = r21 + 4
            r38 = r13
            int r13 = r7 << r21
            r14 = 64
            int r13 = java.lang.Math.min(r14, r13)
            if (r6 <= r7) goto L_0x0265
            r3.n()
        L_0x0265:
            r14 = 0
        L_0x0266:
            if (r14 >= r13) goto L_0x024d
            r3.n()
            int r14 = r14 + r7
            goto L_0x0266
        L_0x026d:
            if (r6 != r14) goto L_0x0272
            r21 = r14
            goto L_0x0274
        L_0x0272:
            r21 = r7
        L_0x0274:
            int r11 = r11 + r21
            r13 = r38
            r7 = 6
            goto L_0x023f
        L_0x027a:
            r38 = r13
            r7 = 1
            r14 = 3
            int r6 = r6 + r7
            r7 = r28
            r13 = r38
            r11 = 4
            goto L_0x0239
        L_0x0285:
            r28 = r7
            r38 = r13
            r14 = 3
            r6 = 2
            r3.t(r6)
            boolean r7 = r3.h()
            if (r7 == 0) goto L_0x02a2
            r7 = 8
            r3.t(r7)
            r3.m()
            r3.m()
            r3.s()
        L_0x02a2:
            int r7 = r3.m()
            r6 = 0
            r11 = 0
            r13 = 0
        L_0x02a9:
            if (r11 >= r7) goto L_0x02ff
            if (r11 == 0) goto L_0x02b1
            boolean r13 = r3.h()
        L_0x02b1:
            if (r13 == 0) goto L_0x02cf
            r3.s()
            r3.m()
            r14 = 0
        L_0x02ba:
            if (r14 > r6) goto L_0x02ca
            boolean r37 = r3.h()
            if (r37 == 0) goto L_0x02c5
            r3.s()
        L_0x02c5:
            r21 = 1
            int r14 = r14 + 1
            goto L_0x02ba
        L_0x02ca:
            r40 = r7
            r21 = 1
            goto L_0x02f9
        L_0x02cf:
            int r6 = r3.m()
            int r14 = r3.m()
            int r37 = r6 + r14
            r40 = r7
            r7 = 0
        L_0x02dc:
            if (r7 >= r6) goto L_0x02e9
            r3.m()
            r3.s()
            r21 = 1
            int r7 = r7 + 1
            goto L_0x02dc
        L_0x02e9:
            r21 = 1
            r6 = 0
        L_0x02ec:
            if (r6 >= r14) goto L_0x02f7
            r3.m()
            r3.s()
            int r6 = r6 + 1
            goto L_0x02ec
        L_0x02f7:
            r6 = r37
        L_0x02f9:
            int r11 = r11 + 1
            r7 = r40
            r14 = 3
            goto L_0x02a9
        L_0x02ff:
            r21 = 1
            boolean r6 = r3.h()
            if (r6 == 0) goto L_0x0319
            r6 = 0
        L_0x0308:
            int r7 = r3.m()
            if (r6 >= r7) goto L_0x0319
            r7 = 5
            int r11 = r5 + 5
            r3.t(r11)
            int r6 = r6 + 1
            r21 = 1
            goto L_0x0308
        L_0x0319:
            r5 = 2
            r3.t(r5)
            boolean r6 = r3.h()
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L_0x038d
            boolean r6 = r3.h()
            if (r6 == 0) goto L_0x0350
            r6 = 8
            int r11 = r3.i(r6)
            r13 = 255(0xff, float:3.57E-43)
            if (r11 != r13) goto L_0x0347
            r13 = 16
            int r11 = r3.i(r13)
            int r14 = r3.i(r13)
            if (r11 == 0) goto L_0x0352
            if (r14 == 0) goto L_0x0352
            float r7 = (float) r11
            float r11 = (float) r14
            float r7 = r7 / r11
            goto L_0x0352
        L_0x0347:
            r13 = 17
            if (r11 >= r13) goto L_0x0352
            float[] r7 = defpackage.vzg.c
            r7 = r7[r11]
            goto L_0x0352
        L_0x0350:
            r6 = 8
        L_0x0352:
            boolean r11 = r3.h()
            if (r11 == 0) goto L_0x035b
            r3.s()
        L_0x035b:
            boolean r11 = r3.h()
            if (r11 == 0) goto L_0x0370
            r11 = 4
            r3.t(r11)
            boolean r11 = r3.h()
            if (r11 == 0) goto L_0x0370
            r11 = 24
            r3.t(r11)
        L_0x0370:
            boolean r11 = r3.h()
            if (r11 == 0) goto L_0x037c
            r3.m()
            r3.m()
        L_0x037c:
            r3.s()
            boolean r3 = r3.h()
            if (r3 == 0) goto L_0x038b
            r3 = 2
            int r35 = r35 * 2
        L_0x0388:
            r5 = r35
            goto L_0x0391
        L_0x038b:
            r3 = 2
            goto L_0x0388
        L_0x038d:
            r3 = 2
            r6 = 8
            goto L_0x0388
        L_0x0391:
            r35 = r4
            java.lang.String r4 = defpackage.m58.f(r31, r32, r33, r34, r35, r36)
            aa6 r11 = new aa6
            r11.<init>()
            r11.a = r2
            java.lang.String r2 = "video/hevc"
            r11.k = r2
            r11.h = r4
            r11.p = r12
            r11.q = r5
            r11.t = r7
            java.util.List r2 = java.util.Collections.singletonList(r8)
            r11.m = r2
            ca6 r2 = new ca6
            r2.<init>(r11)
            r15.d(r2)
            r2 = 1
            r0.c = r2
            goto L_0x03df
        L_0x03bc:
            r27 = r4
            r41 = r5
            r25 = r6
            r28 = r7
            r26 = r11
            r24 = r12
            r38 = r13
        L_0x03ca:
            r3 = 2
            r6 = 8
            goto L_0x03df
        L_0x03ce:
            r27 = r4
            r41 = r5
            r25 = r6
            r28 = r7
            r26 = r11
            r24 = r12
            r38 = r13
            r1 = r19
            goto L_0x03ca
        L_0x03df:
            java.lang.Object r2 = r0.m
            v4a r2 = (defpackage.v4a) r2
            boolean r4 = r2.b(r1)
            java.lang.Object r5 = r0.g
            ata r5 = (defpackage.ata) r5
            java.lang.Object r7 = r0.o
            g1g r7 = (defpackage.g1g) r7
            if (r4 == 0) goto L_0x0409
            byte[] r4 = r2.e
            int r8 = r2.f
            int r4 = defpackage.vzg.K(r8, r4)
            byte[] r8 = r2.e
            r7.F(r4, r8)
            r4 = 5
            r7.I(r4)
            java.lang.Object r4 = r5.c
            ypf[] r4 = (defpackage.ypf[]) r4
            defpackage.b0h.m(r9, r7, r4)
        L_0x0409:
            java.lang.Object r4 = r0.n
            v4a r4 = (defpackage.v4a) r4
            boolean r1 = r4.b(r1)
            if (r1 == 0) goto L_0x042b
            byte[] r1 = r4.e
            int r8 = r4.f
            int r1 = defpackage.vzg.K(r8, r1)
            byte[] r8 = r4.e
            r7.F(r1, r8)
            r1 = 5
            r7.I(r1)
            java.lang.Object r1 = r5.c
            ypf[] r1 = (defpackage.ypf[]) r1
            defpackage.b0h.m(r9, r7, r1)
        L_0x042b:
            long r7 = r0.f
            java.lang.Object r1 = r0.i
            vv6 r1 = (defpackage.vv6) r1
            boolean r5 = r0.c
            r9 = 0
            r1.f = r9
            r1.g = r9
            r1.d = r7
            r1.c = r9
            r13 = r38
            r1.a = r13
            r7 = r26
            r8 = 32
            if (r7 < r8) goto L_0x044a
            r8 = 40
            if (r7 != r8) goto L_0x044e
        L_0x044a:
            r5 = 0
            r9 = 1
            r11 = 3
            goto L_0x0495
        L_0x044e:
            boolean r8 = r1.h
            if (r8 == 0) goto L_0x0480
            boolean r8 = r1.i
            if (r8 != 0) goto L_0x0480
            if (r5 == 0) goto L_0x0479
            long r8 = r1.k
            int r5 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r5 != 0) goto L_0x045f
            goto L_0x0479
        L_0x045f:
            boolean r5 = r1.l
            long r10 = r1.j
            long r13 = r13 - r10
            int r10 = (int) r13
            java.lang.Object r11 = r1.m
            r13 = r11
            ypf r13 = (defpackage.ypf) r13
            r19 = 0
            r11 = 3
            r14 = r8
            r16 = r5
            r17 = r10
            r18 = r25
            r13.b(r14, r16, r17, r18, r19)
        L_0x0477:
            r5 = 0
            goto L_0x047b
        L_0x0479:
            r11 = 3
            goto L_0x0477
        L_0x047b:
            r1.h = r5
        L_0x047d:
            r8 = 32
            goto L_0x0483
        L_0x0480:
            r5 = 0
            r11 = 3
            goto L_0x047d
        L_0x0483:
            if (r8 > r7) goto L_0x0489
            r8 = 35
            if (r7 <= r8) goto L_0x048d
        L_0x0489:
            r8 = 39
            if (r7 != r8) goto L_0x0498
        L_0x048d:
            boolean r8 = r1.i
            r9 = 1
            r8 = r8 ^ r9
            r1.g = r8
            r1.i = r9
        L_0x0495:
            r8 = 16
            goto L_0x049a
        L_0x0498:
            r9 = 1
            goto L_0x0495
        L_0x049a:
            if (r7 < r8) goto L_0x04a2
            r8 = 21
            if (r7 > r8) goto L_0x04a2
            r8 = r9
            goto L_0x04a3
        L_0x04a2:
            r8 = r5
        L_0x04a3:
            r1.b = r8
            if (r8 != 0) goto L_0x04ab
            r8 = 9
            if (r7 > r8) goto L_0x04ac
        L_0x04ab:
            r5 = r9
        L_0x04ac:
            r1.e = r5
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x04c1
            r1 = r28
            r1.d(r7)
            r5 = r41
            r5.d(r7)
            r1 = r27
            r1.d(r7)
        L_0x04c1:
            r2.d(r7)
            r4.d(r7)
            r1 = r43
            r5 = r9
            r4 = r11
            r6 = r24
            r7 = r29
            r8 = r30
            goto L_0x0030
        L_0x04d3:
            r1 = r43
            goto L_0x000f
        L_0x04d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv6.h(g1g):void");
    }

    public final void i(int i2, long j2) {
        switch (this.a) {
            case 0:
                if (j2 != -9223372036854775807L) {
                    this.f = j2;
                    return;
                }
                return;
            default:
                this.f = j2;
                return;
        }
    }

    public void j() {
    }

    public void k(xf5 xf5, qtf qtf) {
        qtf.a();
        qtf.b();
        this.b = qtf.f;
        qtf.b();
        zpf B = xf5.B(qtf.e, 2);
        this.h = B;
        this.i = new vv6(B);
        ((wsb) this.g).I(xf5, qtf);
    }

    public void l(wf5 wf5, qtf qtf) {
        qtf.a();
        qtf.b();
        this.b = qtf.f;
        qtf.b();
        ypf B = wf5.B(qtf.e, 2);
        this.h = B;
        this.i = new vv6(B);
        ((ata) this.g).t(wf5, qtf);
    }

    public wv6(wsb wsb) {
        this.g = wsb;
        this.d = new boolean[3];
        this.j = new v4a(32, 1);
        this.k = new v4a(33, 1);
        this.l = new v4a(34, 1);
        this.m = new v4a(39, 1);
        this.n = new v4a(40, 1);
        this.f = -9223372036854775807L;
        this.o = new l8b();
    }
}
