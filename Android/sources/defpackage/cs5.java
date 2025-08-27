package defpackage;

import java.util.ArrayList;

/* renamed from: cs5  reason: default package */
public final class cs5 extends cy6 {
    public int A0;
    public xl0 B0;
    public l8c C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public ArrayList W0;
    public tj3[] X0;
    public tj3[] Y0;
    public int[] Z0;
    public tj3[] a1;
    public int b1;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public int z0;

    public final void S() {
        for (int i = 0; i < this.r0; i++) {
            tj3 tj3 = this.q0[i];
            if (tj3 != null) {
                tj3.F = true;
            }
        }
    }

    public final int T(tj3 tj3, int i) {
        if (tj3 == null) {
            return 0;
        }
        int[] iArr = tj3.p0;
        if (iArr[1] == 3) {
            int i2 = tj3.s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (tj3.z * ((float) i));
                if (i3 != tj3.k()) {
                    tj3.g = true;
                    W(iArr[0], tj3.q(), 1, i3, tj3);
                }
                return i3;
            } else if (i2 == 1) {
                return tj3.k();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) tj3.q()) * tj3.W) + 0.5f);
                }
            }
        }
        return tj3.k();
    }

    public final int U(tj3 tj3, int i) {
        if (tj3 == null) {
            return 0;
        }
        int[] iArr = tj3.p0;
        if (iArr[0] == 3) {
            int i2 = tj3.r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (tj3.w * ((float) i));
                if (i3 != tj3.q()) {
                    tj3.g = true;
                    W(1, i3, iArr[1], tj3.k(), tj3);
                }
                return i3;
            } else if (i2 == 1) {
                return tj3.q();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) tj3.k()) * tj3.W) + 0.5f);
                }
            }
        }
        return tj3.q();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: as5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v9, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x076d  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0773  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0783  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0786  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x07a2  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x07a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void V(int r40, int r41, int r42, int r43) {
        /*
            r39 = this;
            r8 = r39
            r9 = r40
            r10 = r41
            r11 = r42
            r12 = r43
            int r0 = r8.r0
            r13 = 2
            r14 = 3
            r15 = 0
            r7 = 1
            if (r0 <= 0) goto L_0x0078
            tj3 r0 = r8.T
            if (r0 == 0) goto L_0x001b
            uj3 r0 = (defpackage.uj3) r0
            l8c r0 = r0.u0
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 != 0) goto L_0x0025
            r8.z0 = r15
            r8.A0 = r15
            r8.y0 = r15
            return
        L_0x0025:
            r2 = r15
        L_0x0026:
            int r3 = r8.r0
            if (r2 >= r3) goto L_0x0078
            tj3[] r3 = r8.q0
            r3 = r3[r2]
            if (r3 != 0) goto L_0x0031
            goto L_0x0075
        L_0x0031:
            boolean r4 = r3 instanceof defpackage.iv6
            if (r4 == 0) goto L_0x0036
            goto L_0x0075
        L_0x0036:
            int r4 = r3.j(r15)
            int r5 = r3.j(r7)
            if (r4 != r14) goto L_0x004b
            int r6 = r3.r
            if (r6 == r7) goto L_0x004b
            if (r5 != r14) goto L_0x004b
            int r6 = r3.s
            if (r6 == r7) goto L_0x004b
            goto L_0x0075
        L_0x004b:
            if (r4 != r14) goto L_0x004e
            r4 = r13
        L_0x004e:
            if (r5 != r14) goto L_0x0051
            r5 = r13
        L_0x0051:
            xl0 r6 = r8.B0
            r6.b = r4
            r6.d = r5
            int r4 = r3.q()
            r6.e = r4
            int r4 = r3.k()
            r6.f = r4
            r0.c(r3, r6)
            int r4 = r6.g
            r3.O(r4)
            int r4 = r6.h
            r3.L(r4)
            int r4 = r6.i
            r3.I(r4)
        L_0x0075:
            int r2 = r2 + 1
            goto L_0x0026
        L_0x0078:
            int r6 = r8.w0
            int r5 = r8.x0
            int r4 = r8.s0
            int r3 = r8.t0
            int[] r2 = new int[r13]
            int r0 = r10 - r6
            int r0 = r0 - r5
            int r1 = r8.V0
            if (r1 != r7) goto L_0x008c
            int r0 = r12 - r4
            int r0 = r0 - r3
        L_0x008c:
            r14 = -1
            if (r1 != 0) goto L_0x009c
            int r1 = r8.D0
            if (r1 != r14) goto L_0x0095
            r8.D0 = r15
        L_0x0095:
            int r1 = r8.E0
            if (r1 != r14) goto L_0x00a8
            r8.E0 = r15
            goto L_0x00a8
        L_0x009c:
            int r1 = r8.D0
            if (r1 != r14) goto L_0x00a2
            r8.D0 = r15
        L_0x00a2:
            int r1 = r8.E0
            if (r1 != r14) goto L_0x00a8
            r8.E0 = r15
        L_0x00a8:
            tj3[] r1 = r8.q0
            r14 = r15
            r18 = r14
        L_0x00ad:
            int r15 = r8.r0
            r13 = 8
            if (r14 >= r15) goto L_0x00c1
            tj3[] r15 = r8.q0
            r15 = r15[r14]
            int r15 = r15.g0
            if (r15 != r13) goto L_0x00bd
            int r18 = r18 + 1
        L_0x00bd:
            int r14 = r14 + 1
            r13 = 2
            goto L_0x00ad
        L_0x00c1:
            if (r18 <= 0) goto L_0x00e0
            int r15 = r15 - r18
            tj3[] r1 = new defpackage.tj3[r15]
            r14 = 0
            r15 = 0
        L_0x00c9:
            int r7 = r8.r0
            if (r14 >= r7) goto L_0x00e0
            tj3[] r7 = r8.q0
            r7 = r7[r14]
            r20 = r0
            int r0 = r7.g0
            if (r0 == r13) goto L_0x00db
            r1[r15] = r7
            int r15 = r15 + 1
        L_0x00db:
            int r14 = r14 + 1
            r0 = r20
            goto L_0x00c9
        L_0x00e0:
            r20 = r0
            r13 = r1
            r8.a1 = r13
            r8.b1 = r15
            int r0 = r8.T0
            java.util.ArrayList r14 = r8.W0
            if (r0 == 0) goto L_0x06d1
            aj3 r7 = r8.J
            aj3 r1 = r8.I
            aj3 r12 = r8.K
            r28 = r12
            aj3 r12 = r8.L
            r29 = r12
            int[] r12 = r8.p0
            r21 = r7
            r7 = 1
            if (r0 == r7) goto L_0x04b0
            r7 = 2
            if (r0 == r7) goto L_0x0365
            r7 = 3
            if (r0 == r7) goto L_0x0114
        L_0x0106:
            r31 = r2
            r32 = r3
            r33 = r4
            r34 = r5
            r35 = r6
        L_0x0110:
            r1 = 0
            r2 = 1
            goto L_0x0759
        L_0x0114:
            int r7 = r8.V0
            if (r15 != 0) goto L_0x0119
            goto L_0x0106
        L_0x0119:
            r14.clear()
            as5 r0 = new as5
            r22 = r3
            aj3 r3 = r8.I
            r23 = r4
            aj3 r4 = r8.J
            r24 = r5
            aj3 r5 = r8.K
            r25 = r6
            aj3 r6 = r8.L
            r16 = r0
            r30 = r20
            r20 = r1
            r1 = r39
            r31 = r2
            r2 = r7
            r32 = r22
            r33 = r23
            r34 = r24
            r35 = r25
            r36 = r7
            r18 = r21
            r11 = 1
            r7 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.add(r0)
            if (r36 != 0) goto L_0x01e4
            r1 = 0
            r2 = 0
            r3 = 0
            r7 = 0
        L_0x0154:
            if (r7 >= r15) goto L_0x01e0
            int r6 = r1 + 1
            r5 = r13[r7]
            r4 = r30
            int r16 = r8.U(r5, r4)
            int[] r1 = r5.p0
            r21 = 0
            r1 = r1[r21]
            r11 = 3
            if (r1 != r11) goto L_0x016b
            int r2 = r2 + 1
        L_0x016b:
            r11 = r2
            if (r3 == r4) goto L_0x0175
            int r1 = r8.P0
            int r1 = r1 + r3
            int r1 = r1 + r16
            if (r1 <= r4) goto L_0x017b
        L_0x0175:
            tj3 r1 = r0.b
            if (r1 == 0) goto L_0x017b
            r1 = 1
            goto L_0x017c
        L_0x017b:
            r1 = 0
        L_0x017c:
            if (r1 != 0) goto L_0x0187
            if (r7 <= 0) goto L_0x0187
            int r2 = r8.U0
            if (r2 <= 0) goto L_0x0187
            if (r6 <= r2) goto L_0x0187
            r1 = 1
        L_0x0187:
            if (r1 == 0) goto L_0x01bd
            as5 r3 = new as5
            aj3 r2 = r8.I
            aj3 r1 = r8.J
            aj3 r0 = r8.K
            r21 = r6
            aj3 r6 = r8.L
            r22 = r0
            r0 = r3
            r23 = r1
            r1 = r39
            r24 = r2
            r2 = r36
            r25 = r11
            r11 = r3
            r3 = r24
            r37 = r4
            r4 = r23
            r10 = r5
            r5 = r22
            r9 = r7
            r7 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r11.n = r9
            r14.add(r11)
            r0 = r11
            r3 = r16
            r1 = r21
            goto L_0x01d0
        L_0x01bd:
            r37 = r4
            r10 = r5
            r9 = r7
            r25 = r11
            if (r9 <= 0) goto L_0x01cd
            int r1 = r8.P0
            int r1 = r1 + r16
            int r1 = r1 + r3
            r3 = r1
        L_0x01cb:
            r1 = 0
            goto L_0x01d0
        L_0x01cd:
            r3 = r16
            goto L_0x01cb
        L_0x01d0:
            r0.a(r10)
            int r7 = r9 + 1
            r9 = r40
            r10 = r41
            r2 = r25
            r30 = r37
            r11 = 1
            goto L_0x0154
        L_0x01e0:
            r11 = r30
            goto L_0x0254
        L_0x01e4:
            r37 = r30
            r1 = 0
            r2 = 0
            r9 = 0
        L_0x01e9:
            if (r9 >= r15) goto L_0x0251
            r10 = r13[r9]
            r11 = r37
            int r16 = r8.T(r10, r11)
            int[] r3 = r10.p0
            r4 = 1
            r3 = r3[r4]
            r4 = 3
            if (r3 != r4) goto L_0x01fd
            int r1 = r1 + 1
        L_0x01fd:
            r21 = r1
            if (r2 == r11) goto L_0x0208
            int r1 = r8.Q0
            int r1 = r1 + r2
            int r1 = r1 + r16
            if (r1 <= r11) goto L_0x020e
        L_0x0208:
            tj3 r1 = r0.b
            if (r1 == 0) goto L_0x020e
            r7 = 1
            goto L_0x020f
        L_0x020e:
            r7 = 0
        L_0x020f:
            if (r7 != 0) goto L_0x021a
            if (r9 <= 0) goto L_0x021a
            int r1 = r8.U0
            if (r1 <= 0) goto L_0x021a
            if (r1 >= 0) goto L_0x021a
            r7 = 1
        L_0x021a:
            if (r7 == 0) goto L_0x023b
            as5 r7 = new as5
            aj3 r3 = r8.I
            aj3 r4 = r8.J
            aj3 r5 = r8.K
            aj3 r6 = r8.L
            r0 = r7
            r1 = r39
            r2 = r36
            r37 = r13
            r13 = r7
            r7 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r13.n = r9
            r14.add(r13)
            r0 = r13
        L_0x0238:
            r2 = r16
            goto L_0x0245
        L_0x023b:
            r37 = r13
            if (r9 <= 0) goto L_0x0238
            int r1 = r8.Q0
            int r1 = r1 + r16
            int r1 = r1 + r2
            r2 = r1
        L_0x0245:
            r0.a(r10)
            int r9 = r9 + 1
            r1 = r21
            r13 = r37
            r37 = r11
            goto L_0x01e9
        L_0x0251:
            r11 = r37
            r2 = r1
        L_0x0254:
            int r0 = r14.size()
            int r1 = r8.w0
            int r3 = r8.s0
            int r4 = r8.x0
            int r5 = r8.t0
            r6 = 0
            r7 = r12[r6]
            r6 = 2
            if (r7 == r6) goto L_0x026e
            r7 = 1
            r9 = r12[r7]
            if (r9 != r6) goto L_0x026c
            goto L_0x026e
        L_0x026c:
            r7 = 0
            goto L_0x026f
        L_0x026e:
            r7 = 1
        L_0x026f:
            if (r2 <= 0) goto L_0x0294
            if (r7 == 0) goto L_0x0294
            r2 = 0
        L_0x0274:
            if (r2 >= r0) goto L_0x0294
            java.lang.Object r6 = r14.get(r2)
            as5 r6 = (defpackage.as5) r6
            if (r36 != 0) goto L_0x0288
            int r7 = r6.d()
            int r7 = r11 - r7
            r6.e(r7)
            goto L_0x0291
        L_0x0288:
            int r7 = r6.c()
            int r7 = r11 - r7
            r6.e(r7)
        L_0x0291:
            int r2 = r2 + 1
            goto L_0x0274
        L_0x0294:
            r6 = r3
            r2 = r18
            r13 = r28
            r12 = r29
            r7 = 0
            r9 = 0
            r10 = 0
            r3 = r1
            r1 = r20
        L_0x02a1:
            if (r7 >= r0) goto L_0x035d
            java.lang.Object r15 = r14.get(r7)
            as5 r15 = (defpackage.as5) r15
            if (r36 != 0) goto L_0x02ff
            int r5 = r0 + -1
            if (r7 >= r5) goto L_0x02c0
            int r5 = r7 + 1
            java.lang.Object r5 = r14.get(r5)
            as5 r5 = (defpackage.as5) r5
            tj3 r5 = r5.b
            aj3 r5 = r5.J
            r12 = r5
            r38 = r14
            r5 = 0
            goto L_0x02c6
        L_0x02c0:
            int r5 = r8.t0
            r38 = r14
            r12 = r29
        L_0x02c6:
            tj3 r14 = r15.b
            aj3 r14 = r14.L
            r17 = r15
            r18 = r36
            r19 = r1
            r20 = r2
            r21 = r13
            r22 = r12
            r23 = r3
            r24 = r6
            r25 = r4
            r26 = r5
            r27 = r11
            r17.f(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            int r2 = r15.d()
            int r2 = java.lang.Math.max(r9, r2)
            int r6 = r15.c()
            int r6 = r6 + r10
            if (r7 <= 0) goto L_0x02f5
            int r9 = r8.Q0
            int r6 = r6 + r9
        L_0x02f5:
            r16 = r0
            r9 = r2
            r10 = r6
            r0 = r13
            r2 = r14
            r13 = r38
            r6 = 0
            goto L_0x0355
        L_0x02ff:
            r38 = r14
            int r4 = r0 + -1
            if (r7 >= r4) goto L_0x0317
            int r4 = r7 + 1
            r13 = r38
            java.lang.Object r4 = r13.get(r4)
            as5 r4 = (defpackage.as5) r4
            tj3 r4 = r4.b
            aj3 r4 = r4.I
            r16 = r0
            r14 = 0
            goto L_0x0320
        L_0x0317:
            r13 = r38
            int r4 = r8.x0
            r16 = r0
            r14 = r4
            r4 = r28
        L_0x0320:
            tj3 r0 = r15.b
            aj3 r0 = r0.K
            r17 = r15
            r18 = r36
            r19 = r1
            r20 = r2
            r21 = r4
            r22 = r12
            r23 = r3
            r24 = r6
            r25 = r14
            r26 = r5
            r27 = r11
            r17.f(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            int r1 = r15.d()
            int r1 = r1 + r9
            int r3 = r15.c()
            int r3 = java.lang.Math.max(r10, r3)
            if (r7 <= 0) goto L_0x034f
            int r9 = r8.P0
            int r1 = r1 + r9
        L_0x034f:
            r9 = r1
            r10 = r3
            r3 = 0
            r1 = r0
            r0 = r4
            r4 = r14
        L_0x0355:
            int r7 = r7 + 1
            r14 = r13
            r13 = r0
            r0 = r16
            goto L_0x02a1
        L_0x035d:
            r0 = 0
            r31[r0] = r9
            r0 = 1
            r31[r0] = r10
            goto L_0x0110
        L_0x0365:
            r31 = r2
            r32 = r3
            r33 = r4
            r34 = r5
            r35 = r6
            r37 = r13
            r11 = r20
            int r0 = r8.V0
            if (r0 != 0) goto L_0x039c
            int r1 = r8.U0
            if (r1 > 0) goto L_0x039a
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x037e:
            if (r1 >= r15) goto L_0x0398
            if (r1 <= 0) goto L_0x0385
            int r4 = r8.P0
            int r2 = r2 + r4
        L_0x0385:
            r4 = r37[r1]
            if (r4 != 0) goto L_0x038a
            goto L_0x0395
        L_0x038a:
            int r4 = r8.U(r4, r11)
            int r4 = r4 + r2
            if (r4 <= r11) goto L_0x0392
            goto L_0x0398
        L_0x0392:
            int r3 = r3 + 1
            r2 = r4
        L_0x0395:
            int r1 = r1 + 1
            goto L_0x037e
        L_0x0398:
            r1 = 0
            goto L_0x03bf
        L_0x039a:
            r3 = r1
            goto L_0x0398
        L_0x039c:
            int r1 = r8.U0
            if (r1 > 0) goto L_0x03be
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x03a3:
            if (r1 >= r15) goto L_0x03bd
            if (r1 <= 0) goto L_0x03aa
            int r4 = r8.Q0
            int r2 = r2 + r4
        L_0x03aa:
            r4 = r37[r1]
            if (r4 != 0) goto L_0x03af
            goto L_0x03ba
        L_0x03af:
            int r4 = r8.T(r4, r11)
            int r4 = r4 + r2
            if (r4 <= r11) goto L_0x03b7
            goto L_0x03bd
        L_0x03b7:
            int r3 = r3 + 1
            r2 = r4
        L_0x03ba:
            int r1 = r1 + 1
            goto L_0x03a3
        L_0x03bd:
            r1 = r3
        L_0x03be:
            r3 = 0
        L_0x03bf:
            int[] r2 = r8.Z0
            if (r2 != 0) goto L_0x03c8
            r2 = 2
            int[] r2 = new int[r2]
            r8.Z0 = r2
        L_0x03c8:
            if (r1 != 0) goto L_0x03cd
            r2 = 1
            if (r0 == r2) goto L_0x03d1
        L_0x03cd:
            if (r3 != 0) goto L_0x03d3
            if (r0 != 0) goto L_0x03d3
        L_0x03d1:
            r7 = 1
            goto L_0x03d4
        L_0x03d3:
            r7 = 0
        L_0x03d4:
            if (r7 != 0) goto L_0x04a6
            if (r0 != 0) goto L_0x03e2
            float r1 = (float) r15
            float r2 = (float) r3
            float r1 = r1 / r2
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            goto L_0x03eb
        L_0x03e2:
            float r2 = (float) r15
            float r3 = (float) r1
            float r2 = r2 / r3
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r3 = (int) r2
        L_0x03eb:
            tj3[] r2 = r8.Y0
            if (r2 == 0) goto L_0x03f2
            int r4 = r2.length
            if (r4 >= r3) goto L_0x03f4
        L_0x03f2:
            r4 = 0
            goto L_0x03f9
        L_0x03f4:
            r4 = 0
            java.util.Arrays.fill(r2, r4)
            goto L_0x03fd
        L_0x03f9:
            tj3[] r2 = new defpackage.tj3[r3]
            r8.Y0 = r2
        L_0x03fd:
            tj3[] r2 = r8.X0
            if (r2 == 0) goto L_0x0409
            int r5 = r2.length
            if (r5 >= r1) goto L_0x0405
            goto L_0x0409
        L_0x0405:
            java.util.Arrays.fill(r2, r4)
            goto L_0x040d
        L_0x0409:
            tj3[] r2 = new defpackage.tj3[r1]
            r8.X0 = r2
        L_0x040d:
            r2 = 0
        L_0x040e:
            if (r2 >= r3) goto L_0x0459
            r4 = 0
        L_0x0411:
            if (r4 >= r1) goto L_0x0454
            int r5 = r4 * r3
            int r5 = r5 + r2
            r6 = 1
            if (r0 != r6) goto L_0x041c
            int r5 = r2 * r1
            int r5 = r5 + r4
        L_0x041c:
            r9 = r37
            int r6 = r9.length
            if (r5 < r6) goto L_0x0422
            goto L_0x044f
        L_0x0422:
            r5 = r9[r5]
            if (r5 != 0) goto L_0x0427
            goto L_0x044f
        L_0x0427:
            int r6 = r8.U(r5, r11)
            tj3[] r10 = r8.Y0
            r10 = r10[r2]
            if (r10 == 0) goto L_0x0437
            int r10 = r10.q()
            if (r10 >= r6) goto L_0x043b
        L_0x0437:
            tj3[] r6 = r8.Y0
            r6[r2] = r5
        L_0x043b:
            int r6 = r8.T(r5, r11)
            tj3[] r10 = r8.X0
            r10 = r10[r4]
            if (r10 == 0) goto L_0x044b
            int r10 = r10.k()
            if (r10 >= r6) goto L_0x044f
        L_0x044b:
            tj3[] r6 = r8.X0
            r6[r4] = r5
        L_0x044f:
            int r4 = r4 + 1
            r37 = r9
            goto L_0x0411
        L_0x0454:
            r9 = r37
            int r2 = r2 + 1
            goto L_0x040e
        L_0x0459:
            r9 = r37
            r2 = 0
            r4 = 0
        L_0x045d:
            if (r2 >= r3) goto L_0x0473
            tj3[] r5 = r8.Y0
            r5 = r5[r2]
            if (r5 == 0) goto L_0x0470
            if (r2 <= 0) goto L_0x046a
            int r6 = r8.P0
            int r4 = r4 + r6
        L_0x046a:
            int r5 = r8.U(r5, r11)
            int r5 = r5 + r4
            r4 = r5
        L_0x0470:
            int r2 = r2 + 1
            goto L_0x045d
        L_0x0473:
            r2 = 0
            r5 = 0
        L_0x0475:
            if (r2 >= r1) goto L_0x048b
            tj3[] r6 = r8.X0
            r6 = r6[r2]
            if (r6 == 0) goto L_0x0488
            if (r2 <= 0) goto L_0x0482
            int r10 = r8.Q0
            int r5 = r5 + r10
        L_0x0482:
            int r6 = r8.T(r6, r11)
            int r6 = r6 + r5
            r5 = r6
        L_0x0488:
            int r2 = r2 + 1
            goto L_0x0475
        L_0x048b:
            r2 = 0
            r31[r2] = r4
            r2 = 1
            r31[r2] = r5
            if (r0 != 0) goto L_0x049c
            if (r4 <= r11) goto L_0x049a
            if (r3 <= r2) goto L_0x049a
            int r3 = r3 + -1
            goto L_0x04a2
        L_0x049a:
            r7 = r2
            goto L_0x04a2
        L_0x049c:
            if (r5 <= r11) goto L_0x049a
            if (r1 <= r2) goto L_0x049a
            int r1 = r1 + -1
        L_0x04a2:
            r37 = r9
            goto L_0x03d4
        L_0x04a6:
            r2 = 1
            int[] r0 = r8.Z0
            r4 = 0
            r0[r4] = r3
            r0[r2] = r1
            goto L_0x0110
        L_0x04b0:
            r31 = r2
            r32 = r3
            r33 = r4
            r34 = r5
            r35 = r6
            r9 = r13
            r13 = r14
            r11 = r20
            r18 = r21
            r20 = r1
            int r10 = r8.V0
            if (r15 != 0) goto L_0x04c8
            goto L_0x0110
        L_0x04c8:
            r13.clear()
            as5 r14 = new as5
            aj3 r3 = r8.I
            aj3 r4 = r8.J
            aj3 r5 = r8.K
            aj3 r6 = r8.L
            r0 = r14
            r1 = r39
            r2 = r10
            r7 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r13.add(r14)
            if (r10 != 0) goto L_0x055c
            r0 = 0
            r1 = 0
            r7 = 0
        L_0x04e5:
            if (r7 >= r15) goto L_0x0556
            r6 = r9[r7]
            int r16 = r8.U(r6, r11)
            int[] r2 = r6.p0
            r3 = 0
            r2 = r2[r3]
            r3 = 3
            if (r2 != r3) goto L_0x04f7
            int r0 = r0 + 1
        L_0x04f7:
            r21 = r0
            if (r1 == r11) goto L_0x0502
            int r0 = r8.P0
            int r0 = r0 + r1
            int r0 = r0 + r16
            if (r0 <= r11) goto L_0x0508
        L_0x0502:
            tj3 r0 = r14.b
            if (r0 == 0) goto L_0x0508
            r0 = 1
            goto L_0x0509
        L_0x0508:
            r0 = 0
        L_0x0509:
            if (r0 != 0) goto L_0x0516
            if (r7 <= 0) goto L_0x0516
            int r2 = r8.U0
            if (r2 <= 0) goto L_0x0516
            int r2 = r7 % r2
            if (r2 != 0) goto L_0x0516
            r0 = 1
        L_0x0516:
            if (r0 == 0) goto L_0x053c
            as5 r14 = new as5
            aj3 r3 = r8.I
            aj3 r4 = r8.J
            aj3 r5 = r8.K
            aj3 r2 = r8.L
            r0 = r14
            r1 = r39
            r22 = r2
            r2 = r10
            r23 = r12
            r12 = r6
            r6 = r22
            r36 = r10
            r10 = r7
            r7 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.n = r10
            r13.add(r14)
        L_0x0539:
            r1 = r16
            goto L_0x054a
        L_0x053c:
            r36 = r10
            r23 = r12
            r12 = r6
            r10 = r7
            if (r10 <= 0) goto L_0x0539
            int r0 = r8.P0
            int r0 = r0 + r16
            int r0 = r0 + r1
            r1 = r0
        L_0x054a:
            r14.a(r12)
            int r7 = r10 + 1
            r0 = r21
            r12 = r23
            r10 = r36
            goto L_0x04e5
        L_0x0556:
            r36 = r10
            r23 = r12
            goto L_0x05c5
        L_0x055c:
            r36 = r10
            r23 = r12
            r0 = 0
            r1 = 0
            r10 = 0
        L_0x0563:
            if (r10 >= r15) goto L_0x05c5
            r12 = r9[r10]
            int r16 = r8.T(r12, r11)
            int[] r2 = r12.p0
            r3 = 1
            r2 = r2[r3]
            r7 = 3
            if (r2 != r7) goto L_0x0575
            int r0 = r0 + 1
        L_0x0575:
            r17 = r0
            if (r1 == r11) goto L_0x0580
            int r0 = r8.Q0
            int r0 = r0 + r1
            int r0 = r0 + r16
            if (r0 <= r11) goto L_0x0586
        L_0x0580:
            tj3 r0 = r14.b
            if (r0 == 0) goto L_0x0586
            r0 = 1
            goto L_0x0587
        L_0x0586:
            r0 = 0
        L_0x0587:
            if (r0 != 0) goto L_0x0594
            if (r10 <= 0) goto L_0x0594
            int r2 = r8.U0
            if (r2 <= 0) goto L_0x0594
            int r2 = r10 % r2
            if (r2 != 0) goto L_0x0594
            r0 = 1
        L_0x0594:
            if (r0 == 0) goto L_0x05b3
            as5 r14 = new as5
            aj3 r3 = r8.I
            aj3 r4 = r8.J
            aj3 r5 = r8.K
            aj3 r6 = r8.L
            r0 = r14
            r1 = r39
            r2 = r36
            r21 = r7
            r7 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.n = r10
            r13.add(r14)
        L_0x05b0:
            r1 = r16
            goto L_0x05bd
        L_0x05b3:
            r21 = r7
            if (r10 <= 0) goto L_0x05b0
            int r0 = r8.Q0
            int r0 = r0 + r16
            int r0 = r0 + r1
            r1 = r0
        L_0x05bd:
            r14.a(r12)
            int r10 = r10 + 1
            r0 = r17
            goto L_0x0563
        L_0x05c5:
            int r1 = r13.size()
            int r2 = r8.w0
            int r3 = r8.s0
            int r4 = r8.x0
            int r5 = r8.t0
            r6 = 0
            r7 = r23[r6]
            r6 = 2
            if (r7 == r6) goto L_0x05df
            r7 = 1
            r9 = r23[r7]
            if (r9 != r6) goto L_0x05dd
            goto L_0x05df
        L_0x05dd:
            r7 = 0
            goto L_0x05e0
        L_0x05df:
            r7 = 1
        L_0x05e0:
            if (r0 <= 0) goto L_0x0605
            if (r7 == 0) goto L_0x0605
            r0 = 0
        L_0x05e5:
            if (r0 >= r1) goto L_0x0605
            java.lang.Object r6 = r13.get(r0)
            as5 r6 = (defpackage.as5) r6
            if (r36 != 0) goto L_0x05f9
            int r7 = r6.d()
            int r7 = r11 - r7
            r6.e(r7)
            goto L_0x0602
        L_0x05f9:
            int r7 = r6.c()
            int r7 = r11 - r7
            r6.e(r7)
        L_0x0602:
            int r0 = r0 + 1
            goto L_0x05e5
        L_0x0605:
            r6 = r3
            r0 = r20
            r14 = r28
            r12 = r29
            r7 = 0
            r9 = 0
            r10 = 0
            r3 = r2
            r2 = r18
        L_0x0612:
            if (r7 >= r1) goto L_0x06c9
            java.lang.Object r15 = r13.get(r7)
            as5 r15 = (defpackage.as5) r15
            if (r36 != 0) goto L_0x066f
            int r5 = r1 + -1
            if (r7 >= r5) goto L_0x0631
            int r5 = r7 + 1
            java.lang.Object r5 = r13.get(r5)
            as5 r5 = (defpackage.as5) r5
            tj3 r5 = r5.b
            aj3 r5 = r5.J
            r12 = r5
            r38 = r13
            r5 = 0
            goto L_0x0637
        L_0x0631:
            int r5 = r8.t0
            r38 = r13
            r12 = r29
        L_0x0637:
            tj3 r13 = r15.b
            aj3 r13 = r13.L
            r17 = r15
            r18 = r36
            r19 = r0
            r20 = r2
            r21 = r14
            r22 = r12
            r23 = r3
            r24 = r6
            r25 = r4
            r26 = r5
            r27 = r11
            r17.f(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            int r2 = r15.d()
            int r2 = java.lang.Math.max(r9, r2)
            int r6 = r15.c()
            int r6 = r6 + r10
            if (r7 <= 0) goto L_0x0666
            int r9 = r8.Q0
            int r6 = r6 + r9
        L_0x0666:
            r16 = r1
            r9 = r2
            r10 = r6
            r2 = r13
            r13 = r38
            r6 = 0
            goto L_0x06c3
        L_0x066f:
            r38 = r13
            int r4 = r1 + -1
            if (r7 >= r4) goto L_0x0688
            int r4 = r7 + 1
            r13 = r38
            java.lang.Object r4 = r13.get(r4)
            as5 r4 = (defpackage.as5) r4
            tj3 r4 = r4.b
            aj3 r4 = r4.I
            r16 = r1
            r14 = r4
            r4 = 0
            goto L_0x0690
        L_0x0688:
            r13 = r38
            int r4 = r8.x0
            r16 = r1
            r14 = r28
        L_0x0690:
            tj3 r1 = r15.b
            aj3 r1 = r1.K
            r17 = r15
            r18 = r36
            r19 = r0
            r20 = r2
            r21 = r14
            r22 = r12
            r23 = r3
            r24 = r6
            r25 = r4
            r26 = r5
            r27 = r11
            r17.f(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            int r0 = r15.d()
            int r0 = r0 + r9
            int r3 = r15.c()
            int r3 = java.lang.Math.max(r10, r3)
            if (r7 <= 0) goto L_0x06bf
            int r9 = r8.P0
            int r0 = r0 + r9
        L_0x06bf:
            r9 = r0
            r0 = r1
            r10 = r3
            r3 = 0
        L_0x06c3:
            int r7 = r7 + 1
            r1 = r16
            goto L_0x0612
        L_0x06c9:
            r0 = 0
            r31[r0] = r9
            r0 = 1
            r31[r0] = r10
            goto L_0x0110
        L_0x06d1:
            r31 = r2
            r32 = r3
            r33 = r4
            r34 = r5
            r35 = r6
            r9 = r13
            r13 = r14
            r11 = r20
            int r2 = r8.V0
            if (r15 != 0) goto L_0x06e5
            goto L_0x0110
        L_0x06e5:
            int r0 = r13.size()
            if (r0 != 0) goto L_0x0700
            as5 r10 = new as5
            aj3 r3 = r8.I
            aj3 r4 = r8.J
            aj3 r5 = r8.K
            aj3 r6 = r8.L
            r0 = r10
            r1 = r39
            r7 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r13.add(r10)
            goto L_0x0740
        L_0x0700:
            r0 = 0
            java.lang.Object r1 = r13.get(r0)
            r10 = r1
            as5 r10 = (defpackage.as5) r10
            r10.c = r0
            r1 = 0
            r10.b = r1
            r10.l = r0
            r10.m = r0
            r10.n = r0
            r10.o = r0
            r10.p = r0
            int r0 = r8.w0
            int r1 = r8.s0
            int r3 = r8.x0
            int r4 = r8.t0
            aj3 r5 = r8.K
            aj3 r6 = r8.L
            aj3 r7 = r8.I
            aj3 r12 = r8.J
            r17 = r10
            r18 = r2
            r19 = r7
            r20 = r12
            r21 = r5
            r22 = r6
            r23 = r0
            r24 = r1
            r25 = r3
            r26 = r4
            r27 = r11
            r17.f(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x0740:
            r0 = 0
        L_0x0741:
            if (r0 >= r15) goto L_0x074b
            r1 = r9[r0]
            r10.a(r1)
            int r0 = r0 + 1
            goto L_0x0741
        L_0x074b:
            int r0 = r10.d()
            r1 = 0
            r31[r1] = r0
            int r0 = r10.c()
            r2 = 1
            r31[r2] = r0
        L_0x0759:
            r0 = r31[r1]
            int r0 = r0 + r35
            int r0 = r0 + r34
            r3 = r31[r2]
            int r3 = r3 + r33
            int r3 = r3 + r32
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = r40
            if (r6 != r5) goto L_0x0773
            r0 = r41
        L_0x076f:
            r6 = r2
            r2 = r42
            goto L_0x0781
        L_0x0773:
            if (r6 != r4) goto L_0x077c
            r7 = r41
            int r0 = java.lang.Math.min(r0, r7)
            goto L_0x076f
        L_0x077c:
            if (r6 != 0) goto L_0x077f
            goto L_0x076f
        L_0x077f:
            r0 = r1
            goto L_0x076f
        L_0x0781:
            if (r2 != r5) goto L_0x0786
            r2 = r43
            goto L_0x0794
        L_0x0786:
            if (r2 != r4) goto L_0x078f
            r4 = r43
            int r2 = java.lang.Math.min(r3, r4)
            goto L_0x0794
        L_0x078f:
            if (r2 != 0) goto L_0x0793
            r2 = r3
            goto L_0x0794
        L_0x0793:
            r2 = r1
        L_0x0794:
            r8.z0 = r0
            r8.A0 = r2
            r8.O(r0)
            r8.L(r2)
            int r0 = r8.r0
            if (r0 <= 0) goto L_0x07a4
            r15 = r6
            goto L_0x07a5
        L_0x07a4:
            r15 = r1
        L_0x07a5:
            r8.y0 = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.V(int, int, int, int):void");
    }

    public final void W(int i, int i2, int i3, int i4, tj3 tj3) {
        l8c l8c;
        tj3 tj32;
        while (true) {
            l8c = this.C0;
            if (l8c != null || (tj32 = this.T) == null) {
                xl0 xl0 = this.B0;
                xl0.b = i;
                xl0.d = i3;
                xl0.e = i2;
                xl0.f = i4;
                l8c.c(tj3, xl0);
                tj3.O(xl0.g);
                tj3.L(xl0.h);
                tj3.E = xl0.c;
                tj3.I(xl0.i);
            } else {
                this.C0 = ((uj3) tj32).u0;
            }
        }
        xl0 xl02 = this.B0;
        xl02.b = i;
        xl02.d = i3;
        xl02.e = i2;
        xl02.f = i4;
        l8c.c(tj3, xl02);
        tj3.O(xl02.g);
        tj3.L(xl02.h);
        tj3.E = xl02.c;
        tj3.I(xl02.i);
    }

    public final void b(gw7 gw7, boolean z) {
        tj3 tj3;
        float f;
        int i;
        super.b(gw7, z);
        tj3 tj32 = this.T;
        boolean z2 = tj32 != null && ((uj3) tj32).v0;
        int i2 = this.T0;
        ArrayList arrayList = this.W0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((as5) arrayList.get(i3)).b(i3, z2, i3 == size + -1);
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((as5) arrayList.get(i4)).b(i4, z2, i4 == size2 + -1);
                        i4++;
                    }
                }
            } else if (!(this.Z0 == null || this.Y0 == null || this.X0 == null)) {
                for (int i5 = 0; i5 < this.b1; i5++) {
                    this.a1[i5].D();
                }
                int[] iArr = this.Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.J0;
                tj3 tj33 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.J0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    tj3 tj34 = this.Y0[i];
                    if (!(tj34 == null || tj34.g0 == 8)) {
                        aj3 aj3 = tj34.I;
                        if (i8 == 0) {
                            tj34.f(aj3, this.I, this.w0);
                            tj34.i0 = this.D0;
                            tj34.d0 = f;
                        }
                        if (i8 == i6 - 1) {
                            tj34.f(tj34.K, this.K, this.x0);
                        }
                        if (i8 > 0 && tj33 != null) {
                            int i9 = this.P0;
                            aj3 aj32 = tj33.K;
                            tj34.f(aj3, aj32, i9);
                            tj33.f(aj32, aj3, 0);
                        }
                        tj33 = tj34;
                    }
                    i8++;
                    f2 = f;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    tj3 tj35 = this.X0[i10];
                    if (!(tj35 == null || tj35.g0 == 8)) {
                        aj3 aj33 = tj35.J;
                        if (i10 == 0) {
                            tj35.f(aj33, this.J, this.s0);
                            tj35.j0 = this.E0;
                            tj35.e0 = this.K0;
                        }
                        if (i10 == i7 - 1) {
                            tj35.f(tj35.L, this.L, this.t0);
                        }
                        if (i10 > 0 && tj33 != null) {
                            int i11 = this.Q0;
                            aj3 aj34 = tj33.L;
                            tj35.f(aj33, aj34, i11);
                            tj33.f(aj34, aj33, 0);
                        }
                        tj33 = tj35;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        tj3[] tj3Arr = this.a1;
                        if (!(i14 >= tj3Arr.length || (tj3 = tj3Arr[i14]) == null || tj3.g0 == 8)) {
                            tj3 tj36 = this.Y0[i12];
                            tj3 tj37 = this.X0[i13];
                            if (tj3 != tj36) {
                                tj3.f(tj3.I, tj36.I, 0);
                                tj3.f(tj3.K, tj36.K, 0);
                            }
                            if (tj3 != tj37) {
                                tj3.f(tj3.J, tj37.J, 0);
                                tj3.f(tj3.L, tj37.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((as5) arrayList.get(0)).b(0, z2, true);
        }
        this.y0 = false;
    }
}
