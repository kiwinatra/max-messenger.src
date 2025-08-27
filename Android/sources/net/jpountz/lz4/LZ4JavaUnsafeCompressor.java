package net.jpountz.lz4;

final class LZ4JavaUnsafeCompressor extends LZ4Compressor {
    public static final LZ4Compressor INSTANCE = new LZ4JavaUnsafeCompressor();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005a, code lost:
        if ((((r12 + r11) + 8) + (r11 >>> 8)) > r5) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005e, code lost:
        if (r11 < 15) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0060, code lost:
        defpackage.gwf.g(r3, r10, (byte) 240);
        r12 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r11 - 15, r3, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006d, code lost:
        defpackage.gwf.g(r3, r10, (byte) (r11 << 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0073, code lost:
        net.jpountz.lz4.LZ4UnsafeUtils.wildArraycopy(r0, r9, r3, r12, r11);
        r12 = r12 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0077, code lost:
        r9 = (short) (r8 - r15);
        defpackage.gwf.g(r3, r12, (byte) r9);
        defpackage.gwf.g(r3, r12 + 1, (byte) (r9 >>> 8));
        r9 = r12 + 2;
        r8 = r8 + 4;
        r11 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytes(r0, r15 + 4, r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0095, code lost:
        if (((r12 + 8) + (r11 >>> 8)) > r5) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0097, code lost:
        r8 = r8 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009a, code lost:
        if (r11 < 15) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009c, code lost:
        defpackage.gwf.g(r3, r10, (byte) (defpackage.gwf.a(r10, r3) | 15));
        r9 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r11 - 15, r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ab, code lost:
        r10 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ad, code lost:
        defpackage.gwf.g(r3, r10, (byte) (r11 | defpackage.gwf.a(r10, r3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b7, code lost:
        if (r8 <= r7) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b9, code lost:
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bb, code lost:
        r9 = r8 - 2;
        defpackage.gwf.l(r2, net.jpountz.lz4.LZ4Utils.hash64k(defpackage.gwf.b(r9, r0)), r9 - r1);
        r9 = net.jpountz.lz4.LZ4Utils.hash64k(defpackage.gwf.b(r8, r0));
        r15 = defpackage.gwf.e(r2, r9) + r1;
        defpackage.gwf.l(r2, r9, r8 - r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e0, code lost:
        if (net.jpountz.lz4.LZ4UnsafeUtils.readIntEquals(r0, r8, r15) != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00eb, code lost:
        defpackage.gwf.g(r3, r10, (byte) 0);
        r12 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f9, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ff, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0047, code lost:
        r11 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytesBackward(r0, r15, r8, r1, r9);
        r8 = r8 - r11;
        r15 = r15 - r11;
        r11 = r8 - r9;
        r12 = r10 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int compress64k(byte[] r17, int r18, int r19, byte[] r20, int r21, int r22) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r22
            int r4 = r1 + r2
            int r6 = r4 + -5
            int r7 = r4 + -12
            r8 = 13
            if (r2 < r8) goto L_0x0106
            r2 = 8192(0x2000, float:1.14794E-41)
            short[] r2 = new short[r2]
            int r8 = r1 + 1
            r10 = r21
            r9 = r1
        L_0x001d:
            int r11 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            r12 = 1
            int r11 = r12 << r11
        L_0x0022:
            int r12 = r12 + r8
            int r13 = r11 + 1
            int r14 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            int r11 = r11 >>> r14
            if (r12 <= r7) goto L_0x002d
            r1 = r9
            goto L_0x0108
        L_0x002d:
            int r14 = defpackage.gwf.b(r8, r0)
            int r14 = net.jpountz.lz4.LZ4Utils.hash64k(r14)
            int r15 = defpackage.gwf.e(r2, r14)
            int r15 = r15 + r1
            r19 = r11
            int r11 = r8 - r1
            defpackage.gwf.l(r2, r14, r11)
            boolean r11 = net.jpountz.lz4.LZ4UnsafeUtils.readIntEquals(r0, r15, r8)
            if (r11 == 0) goto L_0x0100
            int r11 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytesBackward(r0, r15, r8, r1, r9)
            int r8 = r8 - r11
            int r15 = r15 - r11
            int r11 = r8 - r9
            int r12 = r10 + 1
            int r13 = r12 + r11
            int r13 = r13 + 8
            int r14 = r11 >>> 8
            int r13 = r13 + r14
            java.lang.String r14 = "maxDestLen is too small"
            if (r13 > r5) goto L_0x00fa
            r13 = 15
            if (r11 < r13) goto L_0x006d
            r13 = 240(0xf0, float:3.36E-43)
            byte r13 = (byte) r13
            defpackage.gwf.g(r3, r10, r13)
            int r13 = r11 + -15
            int r12 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r13, r3, r12)
            goto L_0x0073
        L_0x006d:
            int r13 = r11 << 4
            byte r13 = (byte) r13
            defpackage.gwf.g(r3, r10, r13)
        L_0x0073:
            net.jpountz.lz4.LZ4UnsafeUtils.wildArraycopy(r0, r9, r3, r12, r11)
            int r12 = r12 + r11
        L_0x0077:
            int r9 = r8 - r15
            short r9 = (short) r9
            byte r11 = (byte) r9
            defpackage.gwf.g(r3, r12, r11)
            int r11 = r12 + 1
            int r9 = r9 >>> 8
            byte r9 = (byte) r9
            defpackage.gwf.g(r3, r11, r9)
            int r9 = r12 + 2
            int r8 = r8 + 4
            int r15 = r15 + 4
            int r11 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytes(r0, r15, r8, r6)
            int r12 = r12 + 8
            int r13 = r11 >>> 8
            int r12 = r12 + r13
            if (r12 > r5) goto L_0x00f4
            int r8 = r8 + r11
            r12 = 15
            if (r11 < r12) goto L_0x00ad
            byte r13 = defpackage.gwf.a(r10, r3)
            r13 = r13 | r12
            byte r13 = (byte) r13
            defpackage.gwf.g(r3, r10, r13)
            int r11 = r11 + -15
            int r9 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r11, r3, r9)
        L_0x00ab:
            r10 = r9
            goto L_0x00b7
        L_0x00ad:
            byte r13 = defpackage.gwf.a(r10, r3)
            r11 = r11 | r13
            byte r11 = (byte) r11
            defpackage.gwf.g(r3, r10, r11)
            goto L_0x00ab
        L_0x00b7:
            if (r8 <= r7) goto L_0x00bb
            r1 = r8
            goto L_0x0108
        L_0x00bb:
            int r9 = r8 + -2
            int r11 = defpackage.gwf.b(r9, r0)
            int r11 = net.jpountz.lz4.LZ4Utils.hash64k(r11)
            int r9 = r9 - r1
            defpackage.gwf.l(r2, r11, r9)
            int r9 = defpackage.gwf.b(r8, r0)
            int r9 = net.jpountz.lz4.LZ4Utils.hash64k(r9)
            int r11 = defpackage.gwf.e(r2, r9)
            int r15 = r11 + r1
            int r11 = r8 - r1
            defpackage.gwf.l(r2, r9, r11)
            boolean r9 = net.jpountz.lz4.LZ4UnsafeUtils.readIntEquals(r0, r8, r15)
            if (r9 != 0) goto L_0x00eb
            int r9 = r8 + 1
            r16 = r9
            r9 = r8
            r8 = r16
            goto L_0x001d
        L_0x00eb:
            int r9 = r10 + 1
            r11 = 0
            byte r11 = (byte) r11
            defpackage.gwf.g(r3, r10, r11)
            r12 = r9
            goto L_0x0077
        L_0x00f4:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r14)
            throw r0
        L_0x00fa:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r14)
            throw r0
        L_0x0100:
            r8 = r12
            r11 = r13
            r12 = r19
            goto L_0x0022
        L_0x0106:
            r10 = r21
        L_0x0108:
            int r2 = r4 - r1
            r0 = r17
            r3 = r20
            r4 = r10
            r5 = r22
            int r0 = net.jpountz.lz4.LZ4UnsafeUtils.lastLiterals(r0, r1, r2, r3, r4, r5)
            int r0 = r0 - r21
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeCompressor.compress64k(byte[], int, int, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006b, code lost:
        r15 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytesBackward(r0, r7, r10, r1, r12);
        r10 = r10 - r15;
        r7 = r7 - r15;
        r15 = r10 - r12;
        r5 = r13 + 1;
        r22 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0083, code lost:
        if ((((r5 + r15) + 8) + (r15 >>> 8)) > r8) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0087, code lost:
        if (r15 < 15) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0089, code lost:
        defpackage.gwf.g(r3, r13, (byte) 240);
        r16 = r10;
        r5 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r15 - 15, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009a, code lost:
        r16 = r10;
        defpackage.gwf.g(r3, r13, (byte) (r15 << 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a2, code lost:
        net.jpountz.lz4.LZ4UnsafeUtils.wildArraycopy(r0, r12, r3, r5, r15);
        r5 = r5 + r15;
        r1 = r22;
        r10 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00aa, code lost:
        defpackage.gwf.g(r3, r5, (byte) r14);
        defpackage.gwf.g(r3, r5 + 1, (byte) (r14 >>> 8));
        r12 = r5 + 2;
        r10 = r10 + 4;
        r1 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytes(r0, r1 + 4, r10, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c6, code lost:
        if (((r5 + 8) + (r1 >>> 8)) > r8) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c8, code lost:
        r10 = r10 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cb, code lost:
        if (r1 < 15) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cd, code lost:
        defpackage.gwf.g(r3, r13, (byte) (defpackage.gwf.a(r13, r3) | 15));
        r13 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r1 - 15, r3, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00dd, code lost:
        defpackage.gwf.g(r3, r13, (byte) (r1 | defpackage.gwf.a(r13, r3)));
        r13 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e7, code lost:
        if (r10 <= r9) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e9, code lost:
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f8, code lost:
        r1 = r10 - 2;
        defpackage.gwf.i(r11, net.jpountz.lz4.LZ4Utils.hash(defpackage.gwf.b(r1, r0)), r1);
        r1 = net.jpountz.lz4.LZ4Utils.hash(defpackage.gwf.b(r10, r0));
        r12 = defpackage.gwf.c(r1, r11);
        defpackage.gwf.i(r11, r1, r10);
        r14 = r10 - r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0118, code lost:
        if (r14 >= 65536) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x011e, code lost:
        if (net.jpountz.lz4.LZ4UnsafeUtils.readIntEquals(r0, r12, r10) != false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0123, code lost:
        defpackage.gwf.g(r3, r13, (byte) 0);
        r1 = r12;
        r5 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x013f, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0145, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compress(byte[] r20, int r21, int r22, byte[] r23, int r24, int r25) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r6 = r24
            r4 = r25
            r7 = 1
            sun.misc.Unsafe r8 = defpackage.gwf.a
            defpackage.acd.b(r1, r0, r2)
            defpackage.acd.b(r6, r3, r4)
            int r8 = r6 + r4
            r4 = 65547(0x1000b, float:9.1851E-41)
            if (r2 >= r4) goto L_0x002c
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r8
            int r0 = compress64k((byte[]) r0, (int) r1, (int) r2, (byte[]) r3, (int) r4, (int) r5)
            return r0
        L_0x002c:
            int r2 = r2 + r1
            int r4 = r2 + -5
            int r9 = r2 + -12
            int r10 = r1 + 1
            r11 = 4096(0x1000, float:5.74E-42)
            int[] r11 = new int[r11]
            java.util.Arrays.fill(r11, r1)
            r12 = r1
            r13 = r6
        L_0x003c:
            int r14 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            int r14 = r7 << r14
            r15 = r7
        L_0x0041:
            int r15 = r15 + r10
            int r16 = r14 + 1
            int r17 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            int r14 = r14 >>> r17
            if (r15 <= r9) goto L_0x004e
            r1 = r12
        L_0x004b:
            r4 = r13
            goto L_0x00ec
        L_0x004e:
            int r17 = defpackage.gwf.b(r10, r0)
            int r5 = net.jpountz.lz4.LZ4Utils.hash(r17)
            int r7 = defpackage.gwf.c(r5, r11)
            r22 = r14
            int r14 = r10 - r7
            defpackage.gwf.i(r11, r5, r10)
            r5 = 65536(0x10000, float:9.18355E-41)
            if (r14 >= r5) goto L_0x0146
            boolean r18 = net.jpountz.lz4.LZ4UnsafeUtils.readIntEquals(r0, r7, r10)
            if (r18 == 0) goto L_0x0146
            int r15 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytesBackward(r0, r7, r10, r1, r12)
            int r10 = r10 - r15
            int r7 = r7 - r15
            int r15 = r10 - r12
            r16 = 1
            int r5 = r13 + 1
            int r16 = r5 + r15
            int r16 = r16 + 8
            int r18 = r15 >>> 8
            int r1 = r16 + r18
            r22 = r7
            java.lang.String r7 = "maxDestLen is too small"
            if (r1 > r8) goto L_0x0140
            r1 = 15
            if (r15 < r1) goto L_0x009a
            r1 = 240(0xf0, float:3.36E-43)
            byte r1 = (byte) r1
            defpackage.gwf.g(r3, r13, r1)
            r16 = r10
            r1 = 15
            int r10 = r15 + -15
            int r5 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r10, r3, r5)
            goto L_0x00a2
        L_0x009a:
            r16 = r10
            int r1 = r15 << 4
            byte r1 = (byte) r1
            defpackage.gwf.g(r3, r13, r1)
        L_0x00a2:
            net.jpountz.lz4.LZ4UnsafeUtils.wildArraycopy(r0, r12, r3, r5, r15)
            int r5 = r5 + r15
            r1 = r22
            r10 = r16
        L_0x00aa:
            byte r12 = (byte) r14
            defpackage.gwf.g(r3, r5, r12)
            r12 = 1
            int r15 = r5 + 1
            int r12 = r14 >>> 8
            byte r12 = (byte) r12
            defpackage.gwf.g(r3, r15, r12)
            int r12 = r5 + 2
            int r10 = r10 + 4
            int r1 = r1 + 4
            int r1 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytes(r0, r1, r10, r4)
            int r5 = r5 + 8
            int r14 = r1 >>> 8
            int r5 = r5 + r14
            if (r5 > r8) goto L_0x013a
            int r10 = r10 + r1
            r5 = 15
            if (r1 < r5) goto L_0x00dd
            byte r14 = defpackage.gwf.a(r13, r3)
            r14 = r14 | r5
            byte r14 = (byte) r14
            defpackage.gwf.g(r3, r13, r14)
            int r1 = r1 - r5
            int r1 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r1, r3, r12)
            r13 = r1
            goto L_0x00e7
        L_0x00dd:
            byte r14 = defpackage.gwf.a(r13, r3)
            r1 = r1 | r14
            byte r1 = (byte) r1
            defpackage.gwf.g(r3, r13, r1)
            r13 = r12
        L_0x00e7:
            if (r10 <= r9) goto L_0x00f8
            r1 = r10
            goto L_0x004b
        L_0x00ec:
            int r2 = r2 - r1
            r0 = r20
            r3 = r23
            r5 = r8
            int r0 = net.jpountz.lz4.LZ4UnsafeUtils.lastLiterals(r0, r1, r2, r3, r4, r5)
            int r0 = r0 - r6
            return r0
        L_0x00f8:
            int r1 = r10 + -2
            int r12 = defpackage.gwf.b(r1, r0)
            int r12 = net.jpountz.lz4.LZ4Utils.hash(r12)
            defpackage.gwf.i(r11, r12, r1)
            int r1 = defpackage.gwf.b(r10, r0)
            int r1 = net.jpountz.lz4.LZ4Utils.hash(r1)
            int r12 = defpackage.gwf.c(r1, r11)
            defpackage.gwf.i(r11, r1, r10)
            int r14 = r10 - r12
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r14 >= r1) goto L_0x0120
            boolean r15 = net.jpountz.lz4.LZ4UnsafeUtils.readIntEquals(r0, r12, r10)
            if (r15 != 0) goto L_0x0123
        L_0x0120:
            r17 = 1
            goto L_0x0130
        L_0x0123:
            r17 = 1
            int r15 = r13 + 1
            r1 = 0
            byte r1 = (byte) r1
            defpackage.gwf.g(r3, r13, r1)
            r1 = r12
            r5 = r15
            goto L_0x00aa
        L_0x0130:
            int r1 = r10 + 1
            r12 = r10
            r7 = r17
            r10 = r1
            r1 = r21
            goto L_0x003c
        L_0x013a:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r7)
            throw r0
        L_0x0140:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r7)
            throw r0
        L_0x0146:
            r5 = 15
            r17 = 1
            r1 = r21
            r10 = r15
            r14 = r16
            r7 = r17
            r15 = r22
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeCompressor.compress(byte[], int, int, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005a, code lost:
        if ((((r12 + r11) + 8) + (r11 >>> 8)) > r5) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005e, code lost:
        if (r11 < 15) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0060, code lost:
        r3.put(r10, (byte) 240);
        r12 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r11 - 15, r3, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006d, code lost:
        r3.put(r10, (byte) (r11 << 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0073, code lost:
        net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r0, r9, r3, r12, r11);
        r12 = r12 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0077, code lost:
        defpackage.ow0.e(r3, r12, (short) (r8 - r15));
        r9 = r12 + 2;
        r8 = r8 + 4;
        r11 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r0, r15 + 4, r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008c, code lost:
        if (((r12 + 8) + (r11 >>> 8)) > r5) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008e, code lost:
        r8 = r8 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0091, code lost:
        if (r11 < 15) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0093, code lost:
        r3.put(r10, (byte) (r3.get(r10) | 15));
        r9 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r11 - 15, r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a2, code lost:
        r10 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a4, code lost:
        r3.put(r10, (byte) (r11 | r3.get(r10)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ae, code lost:
        if (r8 <= r7) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b0, code lost:
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b2, code lost:
        r9 = r8 - 2;
        defpackage.gwf.l(r2, net.jpountz.lz4.LZ4Utils.hash64k(r0.getInt(r9)), r9 - r1);
        r9 = net.jpountz.lz4.LZ4Utils.hash64k(r0.getInt(r8));
        r15 = defpackage.gwf.e(r2, r9) + r1;
        defpackage.gwf.l(r2, r9, r8 - r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d7, code lost:
        if (net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r0, r8, r15) != false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e2, code lost:
        r3.put(r10, (byte) 0);
        r12 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f0, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f6, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0047, code lost:
        r11 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r0, r15, r8, r1, r9);
        r8 = r8 - r11;
        r15 = r15 - r11;
        r11 = r8 - r9;
        r12 = r10 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int compress64k(java.nio.ByteBuffer r17, int r18, int r19, java.nio.ByteBuffer r20, int r21, int r22) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r22
            int r4 = r1 + r2
            int r6 = r4 + -5
            int r7 = r4 + -12
            r8 = 13
            if (r2 < r8) goto L_0x00fd
            r2 = 8192(0x2000, float:1.14794E-41)
            short[] r2 = new short[r2]
            int r8 = r1 + 1
            r10 = r21
            r9 = r1
        L_0x001d:
            int r11 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            r12 = 1
            int r11 = r12 << r11
        L_0x0022:
            int r12 = r12 + r8
            int r13 = r11 + 1
            int r14 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            int r11 = r11 >>> r14
            if (r12 <= r7) goto L_0x002d
            r1 = r9
            goto L_0x00ff
        L_0x002d:
            int r14 = r0.getInt(r8)
            int r14 = net.jpountz.lz4.LZ4Utils.hash64k(r14)
            int r15 = defpackage.gwf.e(r2, r14)
            int r15 = r15 + r1
            r19 = r11
            int r11 = r8 - r1
            defpackage.gwf.l(r2, r14, r11)
            boolean r11 = net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r0, r15, r8)
            if (r11 == 0) goto L_0x00f7
            int r11 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r0, r15, r8, r1, r9)
            int r8 = r8 - r11
            int r15 = r15 - r11
            int r11 = r8 - r9
            int r12 = r10 + 1
            int r13 = r12 + r11
            int r13 = r13 + 8
            int r14 = r11 >>> 8
            int r13 = r13 + r14
            java.lang.String r14 = "maxDestLen is too small"
            if (r13 > r5) goto L_0x00f1
            r13 = 15
            if (r11 < r13) goto L_0x006d
            r13 = 240(0xf0, float:3.36E-43)
            byte r13 = (byte) r13
            r3.put(r10, r13)
            int r13 = r11 + -15
            int r12 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r13, r3, r12)
            goto L_0x0073
        L_0x006d:
            int r13 = r11 << 4
            byte r13 = (byte) r13
            r3.put(r10, r13)
        L_0x0073:
            net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r0, r9, r3, r12, r11)
            int r12 = r12 + r11
        L_0x0077:
            int r9 = r8 - r15
            short r9 = (short) r9
            defpackage.ow0.e(r3, r12, r9)
            int r9 = r12 + 2
            int r8 = r8 + 4
            int r15 = r15 + 4
            int r11 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r0, r15, r8, r6)
            int r12 = r12 + 8
            int r13 = r11 >>> 8
            int r12 = r12 + r13
            if (r12 > r5) goto L_0x00eb
            int r8 = r8 + r11
            r12 = 15
            if (r11 < r12) goto L_0x00a4
            byte r13 = r3.get(r10)
            r13 = r13 | r12
            byte r13 = (byte) r13
            r3.put(r10, r13)
            int r11 = r11 + -15
            int r9 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r11, r3, r9)
        L_0x00a2:
            r10 = r9
            goto L_0x00ae
        L_0x00a4:
            byte r13 = r3.get(r10)
            r11 = r11 | r13
            byte r11 = (byte) r11
            r3.put(r10, r11)
            goto L_0x00a2
        L_0x00ae:
            if (r8 <= r7) goto L_0x00b2
            r1 = r8
            goto L_0x00ff
        L_0x00b2:
            int r9 = r8 + -2
            int r11 = r0.getInt(r9)
            int r11 = net.jpountz.lz4.LZ4Utils.hash64k(r11)
            int r9 = r9 - r1
            defpackage.gwf.l(r2, r11, r9)
            int r9 = r0.getInt(r8)
            int r9 = net.jpountz.lz4.LZ4Utils.hash64k(r9)
            int r11 = defpackage.gwf.e(r2, r9)
            int r15 = r11 + r1
            int r11 = r8 - r1
            defpackage.gwf.l(r2, r9, r11)
            boolean r9 = net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r0, r8, r15)
            if (r9 != 0) goto L_0x00e2
            int r9 = r8 + 1
            r16 = r9
            r9 = r8
            r8 = r16
            goto L_0x001d
        L_0x00e2:
            int r9 = r10 + 1
            r11 = 0
            byte r11 = (byte) r11
            r3.put(r10, r11)
            r12 = r9
            goto L_0x0077
        L_0x00eb:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r14)
            throw r0
        L_0x00f1:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r14)
            throw r0
        L_0x00f7:
            r8 = r12
            r11 = r13
            r12 = r19
            goto L_0x0022
        L_0x00fd:
            r10 = r21
        L_0x00ff:
            int r2 = r4 - r1
            r0 = r17
            r3 = r20
            r4 = r10
            r5 = r22
            int r0 = net.jpountz.lz4.LZ4ByteBufferUtils.lastLiterals(r0, r1, r2, r3, r4, r5)
            int r0 = r0 - r21
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeCompressor.compress64k(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009b, code lost:
        r14 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r5, r12, r6, r1, r9);
        r6 = r6 - r14;
        r12 = r12 - r14;
        r14 = r6 - r9;
        r15 = r11 + 1;
        r18 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b1, code lost:
        if ((((r15 + r14) + 8) + (r14 >>> 8)) > r10) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b5, code lost:
        if (r14 < 15) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b7, code lost:
        r8.put(r11, (byte) 240);
        r15 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r14 - 15, r8, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c4, code lost:
        r8.put(r11, (byte) (r14 << 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ca, code lost:
        net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r5, r9, r8, r15, r14);
        r15 = r15 + r14;
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d0, code lost:
        defpackage.ow0.e(r8, r15, r13);
        r9 = r15 + 2;
        r1 = r1 + 4;
        r12 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r5, r12 + 4, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e2, code lost:
        if (((r15 + 8) + (r12 >>> 8)) > r10) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e4, code lost:
        r1 = r1 + r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e7, code lost:
        if (r12 < 15) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e9, code lost:
        r8.put(r11, (byte) (r8.get(r11) | 15));
        r9 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r12 - 15, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f8, code lost:
        r11 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fa, code lost:
        r8.put(r11, (byte) (r12 | r8.get(r11)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0104, code lost:
        if (r1 <= r3) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0106, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0111, code lost:
        r9 = r1 - 2;
        defpackage.gwf.i(r7, net.jpountz.lz4.LZ4Utils.hash(r5.getInt(r9)), r9);
        r9 = net.jpountz.lz4.LZ4Utils.hash(r5.getInt(r1));
        r12 = defpackage.gwf.c(r9, r7);
        defpackage.gwf.i(r7, r9, r1);
        r9 = r1 - r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0131, code lost:
        if (r9 >= 65536) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0137, code lost:
        if (net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r5, r12, r1) != false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x013a, code lost:
        r15 = r11 + 1;
        r8.put(r11, (byte) 0);
        r13 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014f, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0155, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compress(java.nio.ByteBuffer r19, int r20, int r21, java.nio.ByteBuffer r22, int r23, int r24) {
        /*
            r18 = this;
            r1 = r20
            r3 = r21
            r4 = r23
            r6 = r24
            boolean r0 = r19.hasArray()
            if (r0 == 0) goto L_0x0037
            boolean r0 = r22.hasArray()
            if (r0 == 0) goto L_0x0037
            byte[] r2 = r19.array()
            int r0 = r19.arrayOffset()
            int r5 = r0 + r1
            byte[] r7 = r22.array()
            int r0 = r22.arrayOffset()
            int r8 = r0 + r4
            r0 = r18
            r1 = r2
            r2 = r5
            r3 = r21
            r4 = r7
            r5 = r8
            r6 = r24
            int r0 = r0.compress((byte[]) r1, (int) r2, (int) r3, (byte[]) r4, (int) r5, (int) r6)
            return r0
        L_0x0037:
            java.nio.ByteBuffer r5 = defpackage.ow0.c(r19)
            java.nio.ByteBuffer r8 = defpackage.ow0.c(r22)
            defpackage.ow0.b(r5, r1, r3)
            defpackage.ow0.b(r8, r4, r6)
            int r10 = r4 + r6
            r0 = 65547(0x1000b, float:9.1851E-41)
            if (r3 >= r0) goto L_0x005a
            r0 = r5
            r1 = r20
            r2 = r21
            r3 = r8
            r4 = r23
            r5 = r10
            int r0 = compress64k((java.nio.ByteBuffer) r0, (int) r1, (int) r2, (java.nio.ByteBuffer) r3, (int) r4, (int) r5)
            return r0
        L_0x005a:
            int r0 = r1 + r3
            int r2 = r0 + -5
            int r3 = r0 + -12
            int r6 = r1 + 1
            r7 = 4096(0x1000, float:5.74E-42)
            int[] r7 = new int[r7]
            java.util.Arrays.fill(r7, r1)
            r9 = r1
            r11 = r4
        L_0x006b:
            int r12 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            r13 = 1
            int r12 = r13 << r12
        L_0x0070:
            int r13 = r13 + r6
            int r14 = r12 + 1
            int r15 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            int r12 = r12 >>> r15
            if (r13 <= r3) goto L_0x007c
            r6 = r9
        L_0x0079:
            r9 = r11
            goto L_0x0109
        L_0x007c:
            int r15 = r5.getInt(r6)
            int r15 = net.jpountz.lz4.LZ4Utils.hash(r15)
            r18 = r12
            int r12 = defpackage.gwf.c(r15, r7)
            r19 = r13
            int r13 = r6 - r12
            defpackage.gwf.i(r7, r15, r6)
            r15 = 65536(0x10000, float:9.18355E-41)
            if (r13 >= r15) goto L_0x0156
            boolean r16 = net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r5, r12, r6)
            if (r16 == 0) goto L_0x0156
            int r14 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r5, r12, r6, r1, r9)
            int r6 = r6 - r14
            int r12 = r12 - r14
            int r14 = r6 - r9
            int r15 = r11 + 1
            int r16 = r15 + r14
            int r16 = r16 + 8
            int r17 = r14 >>> 8
            int r1 = r16 + r17
            r18 = r6
            java.lang.String r6 = "maxDestLen is too small"
            if (r1 > r10) goto L_0x0150
            r1 = 15
            if (r14 < r1) goto L_0x00c4
            r1 = 240(0xf0, float:3.36E-43)
            byte r1 = (byte) r1
            r8.put(r11, r1)
            int r1 = r14 + -15
            int r15 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r1, r8, r15)
            goto L_0x00ca
        L_0x00c4:
            int r1 = r14 << 4
            byte r1 = (byte) r1
            r8.put(r11, r1)
        L_0x00ca:
            net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r5, r9, r8, r15, r14)
            int r15 = r15 + r14
            r1 = r18
        L_0x00d0:
            defpackage.ow0.e(r8, r15, r13)
            int r9 = r15 + 2
            int r1 = r1 + 4
            int r12 = r12 + 4
            int r12 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r5, r12, r1, r2)
            int r15 = r15 + 8
            int r13 = r12 >>> 8
            int r15 = r15 + r13
            if (r15 > r10) goto L_0x014a
            int r1 = r1 + r12
            r13 = 15
            if (r12 < r13) goto L_0x00fa
            byte r14 = r8.get(r11)
            r14 = r14 | r13
            byte r14 = (byte) r14
            r8.put(r11, r14)
            int r12 = r12 + -15
            int r9 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r12, r8, r9)
        L_0x00f8:
            r11 = r9
            goto L_0x0104
        L_0x00fa:
            byte r14 = r8.get(r11)
            r12 = r12 | r14
            byte r12 = (byte) r12
            r8.put(r11, r12)
            goto L_0x00f8
        L_0x0104:
            if (r1 <= r3) goto L_0x0111
            r6 = r1
            goto L_0x0079
        L_0x0109:
            int r7 = r0 - r6
            int r0 = net.jpountz.lz4.LZ4ByteBufferUtils.lastLiterals(r5, r6, r7, r8, r9, r10)
            int r0 = r0 - r4
            return r0
        L_0x0111:
            int r9 = r1 + -2
            int r12 = r5.getInt(r9)
            int r12 = net.jpountz.lz4.LZ4Utils.hash(r12)
            defpackage.gwf.i(r7, r12, r9)
            int r9 = r5.getInt(r1)
            int r9 = net.jpountz.lz4.LZ4Utils.hash(r9)
            int r12 = defpackage.gwf.c(r9, r7)
            defpackage.gwf.i(r7, r9, r1)
            int r9 = r1 - r12
            r14 = 65536(0x10000, float:9.18355E-41)
            if (r9 >= r14) goto L_0x0143
            boolean r15 = net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r5, r12, r1)
            if (r15 != 0) goto L_0x013a
            goto L_0x0143
        L_0x013a:
            int r15 = r11 + 1
            r13 = 0
            byte r13 = (byte) r13
            r8.put(r11, r13)
            r13 = r9
            goto L_0x00d0
        L_0x0143:
            int r6 = r1 + 1
            r9 = r1
            r1 = r20
            goto L_0x006b
        L_0x014a:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r6)
            throw r0
        L_0x0150:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r6)
            throw r0
        L_0x0156:
            r13 = r18
            r6 = r19
            r1 = r20
            r12 = r14
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeCompressor.compress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }
}
