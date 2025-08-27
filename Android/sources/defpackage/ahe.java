package defpackage;

/* renamed from: ahe  reason: default package */
public final class ahe extends m58 {
    public final l8b k = new l8b();
    public final ky1 l = new ky1(2);
    public rkf m;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: bvb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: mhe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: bvb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: bvb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: bvb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: bvb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: bvb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v5, resolved type: ehe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: ehe} */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22, types: [ujf] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r6 != r8) goto L_0x0019;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.sp9 l(defpackage.xp9 r57, java.nio.ByteBuffer r58) {
        /*
            r56 = this;
            r0 = r56
            r1 = r57
            r3 = 32
            r4 = 1
            rkf r5 = r0.m
            if (r5 == 0) goto L_0x0019
            long r6 = r1.Y
            monitor-enter(r5)
            long r8 = r5.b     // Catch:{ all -> 0x0016 }
            monitor-exit(r5)
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x002a
            goto L_0x0019
        L_0x0016:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0016 }
            throw r0
        L_0x0019:
            rkf r5 = new rkf
            long r6 = r1.x
            r5.<init>(r6)
            r0.m = r5
            long r6 = r1.x
            long r8 = r1.Y
            long r6 = r6 - r8
            r5.a(r6)
        L_0x002a:
            byte[] r1 = r58.array()
            int r5 = r58.limit()
            l8b r6 = r0.k
            r6.E(r5, r1)
            ky1 r7 = r0.l
            r7.o(r5, r1)
            r1 = 39
            r7.t(r1)
            int r1 = r7.i(r4)
            long r8 = (long) r1
            long r8 = r8 << r3
            int r1 = r7.i(r3)
            long r10 = (long) r1
            long r8 = r8 | r10
            r1 = 20
            r7.t(r1)
            r1 = 12
            int r1 = r7.i(r1)
            r5 = 8
            int r5 = r7.i(r5)
            r7 = 14
            r6.H(r7)
            if (r5 == 0) goto L_0x0269
            r7 = 255(0xff, float:3.57E-43)
            r10 = 4
            if (r5 == r7) goto L_0x0255
            r15 = 1
            r17 = 0
            r19 = 128(0x80, double:6.32E-322)
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == r10) goto L_0x016c
            r1 = 5
            if (r5 == r1) goto L_0x0092
            r1 = 6
            if (r5 == r1) goto L_0x0080
            r0 = 0
            goto L_0x026e
        L_0x0080:
            rkf r0 = r0.m
            long r5 = defpackage.ujf.a(r8, r6)
            long r0 = r0.b(r5)
            ujf r3 = new ujf
            r3.<init>(r5, r0)
        L_0x008f:
            r0 = r3
            goto L_0x026e
        L_0x0092:
            rkf r0 = r0.m
            long r24 = r6.w()
            int r1 = r6.u()
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x00a3
            r26 = r4
            goto L_0x00a5
        L_0x00a3:
            r26 = 0
        L_0x00a5:
            java.util.List r1 = java.util.Collections.emptyList()
            if (r26 != 0) goto L_0x0149
            int r5 = r6.u()
            r7 = r5 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x00b5
            r7 = r4
            goto L_0x00b6
        L_0x00b5:
            r7 = 0
        L_0x00b6:
            r10 = r5 & 64
            if (r10 == 0) goto L_0x00bc
            r10 = r4
            goto L_0x00bd
        L_0x00bc:
            r10 = 0
        L_0x00bd:
            r23 = r5 & 32
            if (r23 == 0) goto L_0x00c4
            r23 = r4
            goto L_0x00c6
        L_0x00c4:
            r23 = 0
        L_0x00c6:
            r5 = r5 & 16
            if (r5 == 0) goto L_0x00cc
            r5 = r4
            goto L_0x00cd
        L_0x00cc:
            r5 = 0
        L_0x00cd:
            if (r10 == 0) goto L_0x00d6
            if (r5 != 0) goto L_0x00d6
            long r27 = defpackage.ujf.a(r8, r6)
            goto L_0x00d8
        L_0x00d6:
            r27 = r21
        L_0x00d8:
            if (r10 != 0) goto L_0x0108
            int r1 = r6.u()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r11 = 0
        L_0x00e4:
            if (r11 >= r1) goto L_0x0107
            int r30 = r6.u()
            if (r5 != 0) goto L_0x00f3
            long r31 = defpackage.ujf.a(r8, r6)
            r13 = r31
            goto L_0x00f5
        L_0x00f3:
            r13 = r21
        L_0x00f5:
            che r12 = new che
            long r33 = r0.b(r13)
            r29 = r12
            r31 = r13
            r29.<init>(r30, r31, r33)
            r2.add(r12)
            int r11 = r11 + r4
            goto L_0x00e4
        L_0x0107:
            r1 = r2
        L_0x0108:
            if (r23 == 0) goto L_0x0127
            int r2 = r6.u()
            long r8 = (long) r2
            long r11 = r8 & r19
            int r2 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x0117
            r2 = r4
            goto L_0x0118
        L_0x0117:
            r2 = 0
        L_0x0118:
            long r8 = r8 & r15
            long r8 = r8 << r3
            long r11 = r6.w()
            long r8 = r8 | r11
            r11 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r11
            r11 = 90
            long r21 = r8 / r11
            goto L_0x0128
        L_0x0127:
            r2 = 0
        L_0x0128:
            int r3 = r6.A()
            int r8 = r6.u()
            int r6 = r6.u()
            r34 = r1
            r35 = r2
            r38 = r3
            r29 = r5
            r40 = r6
            r39 = r8
            r36 = r21
            r1 = r27
            r27 = r7
            r28 = r10
            goto L_0x015d
        L_0x0149:
            r34 = r1
            r1 = r21
            r36 = r1
            r27 = 0
            r28 = 0
            r29 = 0
            r35 = 0
            r38 = 0
            r39 = 0
            r40 = 0
        L_0x015d:
            ehe r3 = new ehe
            r23 = r3
            long r32 = r0.b(r1)
            r30 = r1
            r23.<init>(r24, r26, r27, r28, r29, r30, r32, r34, r35, r36, r38, r39, r40)
            goto L_0x008f
        L_0x016c:
            int r0 = r6.u()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        L_0x0176:
            if (r2 >= r0) goto L_0x024f
            long r42 = r6.w()
            int r5 = r6.u()
            r5 = r5 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x0187
            r44 = r4
            goto L_0x0189
        L_0x0187:
            r44 = 0
        L_0x0189:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r44 != 0) goto L_0x0226
            int r7 = r6.u()
            r8 = r7 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x019a
            r8 = r4
            goto L_0x019b
        L_0x019a:
            r8 = 0
        L_0x019b:
            r9 = r7 & 64
            if (r9 == 0) goto L_0x01a1
            r9 = r4
            goto L_0x01a2
        L_0x01a1:
            r9 = 0
        L_0x01a2:
            r7 = r7 & r3
            if (r7 == 0) goto L_0x01a7
            r7 = r4
            goto L_0x01a8
        L_0x01a7:
            r7 = 0
        L_0x01a8:
            if (r9 == 0) goto L_0x01af
            long r10 = r6.w()
            goto L_0x01b1
        L_0x01af:
            r10 = r21
        L_0x01b1:
            if (r9 != 0) goto L_0x01d8
            int r5 = r6.u()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r5)
            r13 = 0
        L_0x01bd:
            if (r13 >= r5) goto L_0x01d7
            int r14 = r6.u()
            long r3 = r6.w()
            ihe r15 = new ihe
            r15.<init>(r14, r3)
            r12.add(r15)
            r3 = 1
            int r13 = r13 + r3
            r4 = r3
            r3 = 32
            r15 = 1
            goto L_0x01bd
        L_0x01d7:
            r5 = r12
        L_0x01d8:
            if (r7 == 0) goto L_0x01fc
            int r3 = r6.u()
            long r3 = (long) r3
            long r12 = r3 & r19
            int r7 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r7 == 0) goto L_0x01e9
            r7 = 1
        L_0x01e6:
            r12 = 1
            goto L_0x01eb
        L_0x01e9:
            r7 = 0
            goto L_0x01e6
        L_0x01eb:
            long r3 = r3 & r12
            r14 = 32
            long r3 = r3 << r14
            long r15 = r6.w()
            long r3 = r3 | r15
            r15 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r15
            r24 = 90
            long r3 = r3 / r24
            goto L_0x0207
        L_0x01fc:
            r12 = 1
            r14 = 32
            r15 = 1000(0x3e8, double:4.94E-321)
            r24 = 90
            r3 = r21
            r7 = 0
        L_0x0207:
            int r26 = r6.A()
            int r27 = r6.u()
            int r28 = r6.u()
            r51 = r3
            r47 = r5
            r50 = r7
            r45 = r8
            r46 = r9
            r48 = r10
            r53 = r26
            r54 = r27
            r55 = r28
            goto L_0x023e
        L_0x0226:
            r14 = r3
            r12 = r15
            r15 = 1000(0x3e8, double:4.94E-321)
            r24 = 90
            r47 = r5
            r48 = r21
            r51 = r48
            r45 = 0
            r46 = 0
            r50 = 0
            r53 = 0
            r54 = 0
            r55 = 0
        L_0x023e:
            khe r3 = new khe
            r41 = r3
            r41.<init>(r42, r44, r45, r46, r47, r48, r50, r51, r53, r54, r55)
            r1.add(r3)
            r3 = 1
            int r2 = r2 + r3
            r4 = r3
            r15 = r12
            r3 = r14
            goto L_0x0176
        L_0x024f:
            mhe r0 = new mhe
            r0.<init>((java.util.ArrayList) r1)
            goto L_0x026e
        L_0x0255:
            long r13 = r6.w()
            int r1 = r1 - r10
            byte[] r15 = new byte[r1]
            r0 = 0
            r6.e(r0, r15, r1)
            bvb r0 = new bvb
            r12 = r0
            r16 = r8
            r12.<init>(r13, r15, r16)
            goto L_0x026e
        L_0x0269:
            ghe r0 = new ghe
            r0.<init>()
        L_0x026e:
            if (r0 != 0) goto L_0x0279
            sp9 r0 = new sp9
            r1 = 0
            qp9[] r1 = new defpackage.qp9[r1]
            r0.<init>((defpackage.qp9[]) r1)
            goto L_0x0285
        L_0x0279:
            r1 = 0
            sp9 r2 = new sp9
            r3 = 1
            qp9[] r3 = new defpackage.qp9[r3]
            r3[r1] = r0
            r2.<init>((defpackage.qp9[]) r3)
            r0 = r2
        L_0x0285:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahe.l(xp9, java.nio.ByteBuffer):sp9");
    }
}
