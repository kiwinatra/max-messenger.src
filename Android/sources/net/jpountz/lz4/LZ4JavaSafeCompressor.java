package net.jpountz.lz4;

final class LZ4JavaSafeCompressor extends LZ4Compressor {
    public static final LZ4Compressor INSTANCE = new LZ4JavaSafeCompressor();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005d, code lost:
        if ((((r12 + r11) + 8) + (r11 >>> 8)) > r5) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0061, code lost:
        if (r11 < 15) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0063, code lost:
        r3[r10] = (byte) 240;
        r12 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r11 - 15, r3, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006f, code lost:
        r3[r10] = (byte) (r11 << 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0074, code lost:
        net.jpountz.lz4.LZ4SafeUtils.wildArraycopy(r0, r9, r3, r12, r11);
        r12 = r12 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0078, code lost:
        r9 = (short) (r8 - r15);
        r3[r12] = (byte) r9;
        r3[r12 + 1] = (byte) (r9 >>> 8);
        r9 = r12 + 2;
        r8 = r8 + 4;
        r11 = net.jpountz.lz4.LZ4SafeUtils.commonBytes(r0, r15 + 4, r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0094, code lost:
        if (((r12 + 8) + (r11 >>> 8)) > r5) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0096, code lost:
        r8 = r8 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0099, code lost:
        if (r11 < 15) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009b, code lost:
        r3[r10] = (byte) (r3[r10] | 15);
        r9 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r11 - 15, r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a7, code lost:
        r10 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a9, code lost:
        r3[r10] = (byte) (r11 | r3[r10]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b0, code lost:
        if (r8 <= r7) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b2, code lost:
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b4, code lost:
        r9 = r8 - 2;
        r2[net.jpountz.lz4.LZ4Utils.hash64k(defpackage.acd.c(r9, r0))] = (short) (r9 - r1);
        r9 = net.jpountz.lz4.LZ4Utils.hash64k(defpackage.acd.c(r8, r0));
        r15 = r1 + (r2[r9] & kotlin.UShort.MAX_VALUE);
        r2[r9] = (short) (r8 - r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d9, code lost:
        if (net.jpountz.lz4.LZ4SafeUtils.readIntEquals(r0, r8, r15) != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e4, code lost:
        r3[r10] = (byte) 0;
        r12 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f1, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f7, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004a, code lost:
        r11 = net.jpountz.lz4.LZ4SafeUtils.commonBytesBackward(r0, r15, r8, r1, r9);
        r8 = r8 - r11;
        r15 = r15 - r11;
        r11 = r8 - r9;
        r12 = r10 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int compress64k(byte[] r18, int r19, int r20, byte[] r21, int r22, int r23) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r5 = r23
            int r4 = r1 + r2
            int r6 = r4 + -5
            int r7 = r4 + -12
            r8 = 13
            if (r2 < r8) goto L_0x00fe
            r2 = 8192(0x2000, float:1.14794E-41)
            short[] r2 = new short[r2]
            int r8 = r1 + 1
            r10 = r22
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
            goto L_0x0100
        L_0x002d:
            int r14 = defpackage.acd.c(r8, r0)
            int r14 = net.jpountz.lz4.LZ4Utils.hash64k(r14)
            short r15 = r2[r14]
            r16 = 65535(0xffff, float:9.1834E-41)
            r15 = r15 & r16
            int r15 = r15 + r1
            r20 = r11
            int r11 = r8 - r1
            short r11 = (short) r11
            r2[r14] = r11
            boolean r11 = net.jpountz.lz4.LZ4SafeUtils.readIntEquals(r0, r15, r8)
            if (r11 == 0) goto L_0x00f8
            int r11 = net.jpountz.lz4.LZ4SafeUtils.commonBytesBackward(r0, r15, r8, r1, r9)
            int r8 = r8 - r11
            int r15 = r15 - r11
            int r11 = r8 - r9
            int r12 = r10 + 1
            int r13 = r12 + r11
            int r13 = r13 + 8
            int r14 = r11 >>> 8
            int r13 = r13 + r14
            java.lang.String r14 = "maxDestLen is too small"
            if (r13 > r5) goto L_0x00f2
            r13 = 15
            if (r11 < r13) goto L_0x006f
            r13 = 240(0xf0, float:3.36E-43)
            byte r13 = (byte) r13
            r3[r10] = r13
            int r13 = r11 + -15
            int r12 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r13, r3, r12)
            goto L_0x0074
        L_0x006f:
            int r13 = r11 << 4
            byte r13 = (byte) r13
            r3[r10] = r13
        L_0x0074:
            net.jpountz.lz4.LZ4SafeUtils.wildArraycopy(r0, r9, r3, r12, r11)
            int r12 = r12 + r11
        L_0x0078:
            int r9 = r8 - r15
            short r9 = (short) r9
            int r11 = r12 + 1
            byte r13 = (byte) r9
            r3[r12] = r13
            int r9 = r9 >>> 8
            byte r9 = (byte) r9
            r3[r11] = r9
            int r9 = r12 + 2
            int r8 = r8 + 4
            int r15 = r15 + 4
            int r11 = net.jpountz.lz4.LZ4SafeUtils.commonBytes(r0, r15, r8, r6)
            int r12 = r12 + 8
            int r13 = r11 >>> 8
            int r12 = r12 + r13
            if (r12 > r5) goto L_0x00ec
            int r8 = r8 + r11
            r12 = 15
            if (r11 < r12) goto L_0x00a9
            byte r13 = r3[r10]
            r13 = r13 | r12
            byte r13 = (byte) r13
            r3[r10] = r13
            int r11 = r11 + -15
            int r9 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r11, r3, r9)
        L_0x00a7:
            r10 = r9
            goto L_0x00b0
        L_0x00a9:
            byte r13 = r3[r10]
            r11 = r11 | r13
            byte r11 = (byte) r11
            r3[r10] = r11
            goto L_0x00a7
        L_0x00b0:
            if (r8 <= r7) goto L_0x00b4
            r1 = r8
            goto L_0x0100
        L_0x00b4:
            int r9 = r8 + -2
            int r11 = defpackage.acd.c(r9, r0)
            int r11 = net.jpountz.lz4.LZ4Utils.hash64k(r11)
            int r9 = r9 - r1
            short r9 = (short) r9
            r2[r11] = r9
            int r9 = defpackage.acd.c(r8, r0)
            int r9 = net.jpountz.lz4.LZ4Utils.hash64k(r9)
            short r11 = r2[r9]
            r11 = r11 & r16
            int r15 = r1 + r11
            int r11 = r8 - r1
            short r11 = (short) r11
            r2[r9] = r11
            boolean r9 = net.jpountz.lz4.LZ4SafeUtils.readIntEquals(r0, r8, r15)
            if (r9 != 0) goto L_0x00e4
            int r9 = r8 + 1
            r17 = r9
            r9 = r8
            r8 = r17
            goto L_0x001d
        L_0x00e4:
            int r9 = r10 + 1
            r11 = 0
            byte r11 = (byte) r11
            r3[r10] = r11
            r12 = r9
            goto L_0x0078
        L_0x00ec:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r14)
            throw r0
        L_0x00f2:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r14)
            throw r0
        L_0x00f8:
            r8 = r12
            r11 = r13
            r12 = r20
            goto L_0x0022
        L_0x00fe:
            r10 = r22
        L_0x0100:
            int r2 = r4 - r1
            r0 = r18
            r3 = r21
            r4 = r10
            r5 = r23
            int r0 = net.jpountz.lz4.LZ4SafeUtils.lastLiterals(r0, r1, r2, r3, r4, r5)
            int r0 = r0 - r22
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress64k(byte[], int, int, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0065, code lost:
        r14 = net.jpountz.lz4.LZ4SafeUtils.commonBytesBackward(r0, r12, r8, r1, r10);
        r8 = r8 - r14;
        r12 = r12 - r14;
        r14 = r8 - r10;
        r15 = r11 + 1;
        r18 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007b, code lost:
        if ((((r15 + r14) + 8) + (r14 >>> 8)) > r5) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007f, code lost:
        if (r14 < 15) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0081, code lost:
        r3[r11] = (byte) 240;
        r15 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r14 - 15, r3, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008d, code lost:
        r3[r11] = (byte) (r14 << 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0092, code lost:
        net.jpountz.lz4.LZ4SafeUtils.wildArraycopy(r0, r10, r3, r15, r14);
        r15 = r15 + r14;
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0098, code lost:
        r3[r15] = (byte) r13;
        r3[r15 + 1] = (byte) (r13 >>> 8);
        r10 = r15 + 2;
        r1 = r1 + 4;
        r12 = net.jpountz.lz4.LZ4SafeUtils.commonBytes(r0, r12 + 4, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b1, code lost:
        if (((r15 + 8) + (r12 >>> 8)) > r5) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b3, code lost:
        r1 = r1 + r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b6, code lost:
        if (r12 < 15) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b8, code lost:
        r3[r11] = (byte) (r3[r11] | 15);
        r10 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r12 - 15, r3, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c4, code lost:
        r11 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c6, code lost:
        r3[r11] = (byte) (r12 | r3[r11]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00cd, code lost:
        if (r1 <= r7) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00dc, code lost:
        r10 = r1 - 2;
        r9[net.jpountz.lz4.LZ4Utils.hash(defpackage.acd.c(r10, r0))] = r10;
        r10 = net.jpountz.lz4.LZ4Utils.hash(defpackage.acd.c(r1, r0));
        r12 = r9[r10];
        r9[r10] = r1;
        r10 = r1 - r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f8, code lost:
        if (r10 >= 65536) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fe, code lost:
        if (net.jpountz.lz4.LZ4SafeUtils.readIntEquals(r0, r12, r1) != false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0101, code lost:
        r15 = r11 + 1;
        r3[r11] = (byte) 0;
        r13 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0115, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011b, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compress(byte[] r19, int r20, int r21, byte[] r22, int r23, int r24) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r6 = r23
            r4 = r24
            defpackage.acd.b(r1, r0, r2)
            defpackage.acd.b(r6, r3, r4)
            int r5 = r6 + r4
            r4 = 65547(0x1000b, float:9.1851E-41)
            if (r2 >= r4) goto L_0x0028
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            int r0 = compress64k((byte[]) r0, (int) r1, (int) r2, (byte[]) r3, (int) r4, (int) r5)
            return r0
        L_0x0028:
            int r2 = r2 + r1
            int r4 = r2 + -5
            int r7 = r2 + -12
            int r8 = r1 + 1
            r9 = 4096(0x1000, float:5.74E-42)
            int[] r9 = new int[r9]
            java.util.Arrays.fill(r9, r1)
            r10 = r1
            r11 = r6
        L_0x0038:
            int r12 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            r13 = 1
            int r12 = r13 << r12
        L_0x003d:
            int r13 = r13 + r8
            int r14 = r12 + 1
            int r15 = net.jpountz.lz4.LZ4Constants.SKIP_STRENGTH
            int r12 = r12 >>> r15
            if (r13 <= r7) goto L_0x0049
            r1 = r10
        L_0x0046:
            r4 = r11
            goto L_0x00d1
        L_0x0049:
            int r15 = defpackage.acd.c(r8, r0)
            int r15 = net.jpountz.lz4.LZ4Utils.hash(r15)
            r18 = r12
            r12 = r9[r15]
            r21 = r13
            int r13 = r8 - r12
            r9[r15] = r8
            r15 = 65536(0x10000, float:9.18355E-41)
            if (r13 >= r15) goto L_0x011c
            boolean r16 = net.jpountz.lz4.LZ4SafeUtils.readIntEquals(r0, r12, r8)
            if (r16 == 0) goto L_0x011c
            int r14 = net.jpountz.lz4.LZ4SafeUtils.commonBytesBackward(r0, r12, r8, r1, r10)
            int r8 = r8 - r14
            int r12 = r12 - r14
            int r14 = r8 - r10
            int r15 = r11 + 1
            int r16 = r15 + r14
            int r16 = r16 + 8
            int r17 = r14 >>> 8
            int r1 = r16 + r17
            r18 = r8
            java.lang.String r8 = "maxDestLen is too small"
            if (r1 > r5) goto L_0x0116
            r1 = 15
            if (r14 < r1) goto L_0x008d
            r1 = 240(0xf0, float:3.36E-43)
            byte r1 = (byte) r1
            r3[r11] = r1
            int r1 = r14 + -15
            int r15 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r1, r3, r15)
            goto L_0x0092
        L_0x008d:
            int r1 = r14 << 4
            byte r1 = (byte) r1
            r3[r11] = r1
        L_0x0092:
            net.jpountz.lz4.LZ4SafeUtils.wildArraycopy(r0, r10, r3, r15, r14)
            int r15 = r15 + r14
            r1 = r18
        L_0x0098:
            int r10 = r15 + 1
            byte r14 = (byte) r13
            r3[r15] = r14
            int r13 = r13 >>> 8
            byte r13 = (byte) r13
            r3[r10] = r13
            int r10 = r15 + 2
            int r1 = r1 + 4
            int r12 = r12 + 4
            int r12 = net.jpountz.lz4.LZ4SafeUtils.commonBytes(r0, r12, r1, r4)
            int r15 = r15 + 8
            int r13 = r12 >>> 8
            int r15 = r15 + r13
            if (r15 > r5) goto L_0x0110
            int r1 = r1 + r12
            r13 = 15
            if (r12 < r13) goto L_0x00c6
            byte r14 = r3[r11]
            r14 = r14 | r13
            byte r14 = (byte) r14
            r3[r11] = r14
            int r12 = r12 + -15
            int r10 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r12, r3, r10)
        L_0x00c4:
            r11 = r10
            goto L_0x00cd
        L_0x00c6:
            byte r14 = r3[r11]
            r12 = r12 | r14
            byte r12 = (byte) r12
            r3[r11] = r12
            goto L_0x00c4
        L_0x00cd:
            if (r1 <= r7) goto L_0x00dc
            goto L_0x0046
        L_0x00d1:
            int r2 = r2 - r1
            r0 = r19
            r3 = r22
            int r0 = net.jpountz.lz4.LZ4SafeUtils.lastLiterals(r0, r1, r2, r3, r4, r5)
            int r0 = r0 - r6
            return r0
        L_0x00dc:
            int r10 = r1 + -2
            int r12 = defpackage.acd.c(r10, r0)
            int r12 = net.jpountz.lz4.LZ4Utils.hash(r12)
            r9[r12] = r10
            int r10 = defpackage.acd.c(r1, r0)
            int r10 = net.jpountz.lz4.LZ4Utils.hash(r10)
            r12 = r9[r10]
            r9[r10] = r1
            int r10 = r1 - r12
            r14 = 65536(0x10000, float:9.18355E-41)
            if (r10 >= r14) goto L_0x0109
            boolean r15 = net.jpountz.lz4.LZ4SafeUtils.readIntEquals(r0, r12, r1)
            if (r15 != 0) goto L_0x0101
            goto L_0x0109
        L_0x0101:
            int r15 = r11 + 1
            r13 = 0
            byte r13 = (byte) r13
            r3[r11] = r13
            r13 = r10
            goto L_0x0098
        L_0x0109:
            int r8 = r1 + 1
            r10 = r1
            r1 = r20
            goto L_0x0038
        L_0x0110:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r8)
            throw r0
        L_0x0116:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r8)
            throw r0
        L_0x011c:
            r13 = r18
            r1 = r20
            r8 = r21
            r12 = r14
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress(byte[], int, int, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005d, code lost:
        if ((((r12 + r11) + 8) + (r11 >>> 8)) > r5) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0061, code lost:
        if (r11 < 15) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0063, code lost:
        r3.put(r10, (byte) 240);
        r12 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r11 - 15, r3, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0070, code lost:
        r3.put(r10, (byte) (r11 << 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0076, code lost:
        net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r0, r9, r3, r12, r11);
        r12 = r12 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007a, code lost:
        defpackage.ow0.e(r3, r12, (short) (r8 - r15));
        r9 = r12 + 2;
        r8 = r8 + 4;
        r11 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r0, r15 + 4, r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008f, code lost:
        if (((r12 + 8) + (r11 >>> 8)) > r5) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0091, code lost:
        r8 = r8 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0094, code lost:
        if (r11 < 15) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0096, code lost:
        r3.put(r10, (byte) (r3.get(r10) | 15));
        r9 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r11 - 15, r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a5, code lost:
        r10 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a7, code lost:
        r3.put(r10, (byte) (r11 | r3.get(r10)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b1, code lost:
        if (r8 <= r7) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b3, code lost:
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b5, code lost:
        r9 = r8 - 2;
        r2[net.jpountz.lz4.LZ4Utils.hash64k(r0.getInt(r9))] = (short) (r9 - r1);
        r9 = net.jpountz.lz4.LZ4Utils.hash64k(r0.getInt(r8));
        r15 = r1 + (r2[r9] & kotlin.UShort.MAX_VALUE);
        r2[r9] = (short) (r8 - r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00da, code lost:
        if (net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r0, r8, r15) != false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e5, code lost:
        r3.put(r10, (byte) 0);
        r12 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f3, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f9, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004a, code lost:
        r11 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r0, r15, r8, r1, r9);
        r8 = r8 - r11;
        r15 = r15 - r11;
        r11 = r8 - r9;
        r12 = r10 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int compress64k(java.nio.ByteBuffer r18, int r19, int r20, java.nio.ByteBuffer r21, int r22, int r23) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r5 = r23
            int r4 = r1 + r2
            int r6 = r4 + -5
            int r7 = r4 + -12
            r8 = 13
            if (r2 < r8) goto L_0x0100
            r2 = 8192(0x2000, float:1.14794E-41)
            short[] r2 = new short[r2]
            int r8 = r1 + 1
            r10 = r22
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
            goto L_0x0102
        L_0x002d:
            int r14 = r0.getInt(r8)
            int r14 = net.jpountz.lz4.LZ4Utils.hash64k(r14)
            short r15 = r2[r14]
            r16 = 65535(0xffff, float:9.1834E-41)
            r15 = r15 & r16
            int r15 = r15 + r1
            r20 = r11
            int r11 = r8 - r1
            short r11 = (short) r11
            r2[r14] = r11
            boolean r11 = net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r0, r15, r8)
            if (r11 == 0) goto L_0x00fa
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
            if (r13 > r5) goto L_0x00f4
            r13 = 15
            if (r11 < r13) goto L_0x0070
            r13 = 240(0xf0, float:3.36E-43)
            byte r13 = (byte) r13
            r3.put(r10, r13)
            int r13 = r11 + -15
            int r12 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r13, r3, r12)
            goto L_0x0076
        L_0x0070:
            int r13 = r11 << 4
            byte r13 = (byte) r13
            r3.put(r10, r13)
        L_0x0076:
            net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r0, r9, r3, r12, r11)
            int r12 = r12 + r11
        L_0x007a:
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
            if (r12 > r5) goto L_0x00ee
            int r8 = r8 + r11
            r12 = 15
            if (r11 < r12) goto L_0x00a7
            byte r13 = r3.get(r10)
            r13 = r13 | r12
            byte r13 = (byte) r13
            r3.put(r10, r13)
            int r11 = r11 + -15
            int r9 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r11, r3, r9)
        L_0x00a5:
            r10 = r9
            goto L_0x00b1
        L_0x00a7:
            byte r13 = r3.get(r10)
            r11 = r11 | r13
            byte r11 = (byte) r11
            r3.put(r10, r11)
            goto L_0x00a5
        L_0x00b1:
            if (r8 <= r7) goto L_0x00b5
            r1 = r8
            goto L_0x0102
        L_0x00b5:
            int r9 = r8 + -2
            int r11 = r0.getInt(r9)
            int r11 = net.jpountz.lz4.LZ4Utils.hash64k(r11)
            int r9 = r9 - r1
            short r9 = (short) r9
            r2[r11] = r9
            int r9 = r0.getInt(r8)
            int r9 = net.jpountz.lz4.LZ4Utils.hash64k(r9)
            short r11 = r2[r9]
            r11 = r11 & r16
            int r15 = r1 + r11
            int r11 = r8 - r1
            short r11 = (short) r11
            r2[r9] = r11
            boolean r9 = net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r0, r8, r15)
            if (r9 != 0) goto L_0x00e5
            int r9 = r8 + 1
            r17 = r9
            r9 = r8
            r8 = r17
            goto L_0x001d
        L_0x00e5:
            int r9 = r10 + 1
            r11 = 0
            byte r11 = (byte) r11
            r3.put(r10, r11)
            r12 = r9
            goto L_0x007a
        L_0x00ee:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r14)
            throw r0
        L_0x00f4:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r14)
            throw r0
        L_0x00fa:
            r8 = r12
            r11 = r13
            r12 = r20
            goto L_0x0022
        L_0x0100:
            r10 = r22
        L_0x0102:
            int r2 = r4 - r1
            r0 = r18
            r3 = r21
            r4 = r10
            r5 = r23
            int r0 = net.jpountz.lz4.LZ4ByteBufferUtils.lastLiterals(r0, r1, r2, r3, r4, r5)
            int r0 = r0 - r22
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress64k(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0098, code lost:
        r14 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r5, r12, r6, r1, r9);
        r6 = r6 - r14;
        r12 = r12 - r14;
        r14 = r6 - r9;
        r15 = r11 + 1;
        r18 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ae, code lost:
        if ((((r15 + r14) + 8) + (r14 >>> 8)) > r10) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b2, code lost:
        if (r14 < 15) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b4, code lost:
        r8.put(r11, (byte) 240);
        r15 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r14 - 15, r8, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c1, code lost:
        r8.put(r11, (byte) (r14 << 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c7, code lost:
        net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r5, r9, r8, r15, r14);
        r15 = r15 + r14;
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cd, code lost:
        defpackage.ow0.e(r8, r15, r13);
        r9 = r15 + 2;
        r1 = r1 + 4;
        r12 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r5, r12 + 4, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00df, code lost:
        if (((r15 + 8) + (r12 >>> 8)) > r10) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e1, code lost:
        r1 = r1 + r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e4, code lost:
        if (r12 < 15) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e6, code lost:
        r8.put(r11, (byte) (r8.get(r11) | 15));
        r9 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r12 - 15, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f5, code lost:
        r11 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f7, code lost:
        r8.put(r11, (byte) (r12 | r8.get(r11)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0101, code lost:
        if (r1 <= r3) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0103, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010e, code lost:
        r9 = r1 - 2;
        r7[net.jpountz.lz4.LZ4Utils.hash(r5.getInt(r9))] = r9;
        r9 = net.jpountz.lz4.LZ4Utils.hash(r5.getInt(r1));
        r12 = r7[r9];
        r7[r9] = r1;
        r9 = r1 - r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012a, code lost:
        if (r9 >= 65536) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0130, code lost:
        if (net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r5, r12, r1) != false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0133, code lost:
        r15 = r11 + 1;
        r8.put(r11, (byte) 0);
        r13 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0148, code lost:
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014e, code lost:
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
            goto L_0x0106
        L_0x007c:
            int r15 = r5.getInt(r6)
            int r15 = net.jpountz.lz4.LZ4Utils.hash(r15)
            r18 = r12
            r12 = r7[r15]
            r19 = r13
            int r13 = r6 - r12
            r7[r15] = r6
            r15 = 65536(0x10000, float:9.18355E-41)
            if (r13 >= r15) goto L_0x014f
            boolean r16 = net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r5, r12, r6)
            if (r16 == 0) goto L_0x014f
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
            if (r1 > r10) goto L_0x0149
            r1 = 15
            if (r14 < r1) goto L_0x00c1
            r1 = 240(0xf0, float:3.36E-43)
            byte r1 = (byte) r1
            r8.put(r11, r1)
            int r1 = r14 + -15
            int r15 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r1, r8, r15)
            goto L_0x00c7
        L_0x00c1:
            int r1 = r14 << 4
            byte r1 = (byte) r1
            r8.put(r11, r1)
        L_0x00c7:
            net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r5, r9, r8, r15, r14)
            int r15 = r15 + r14
            r1 = r18
        L_0x00cd:
            defpackage.ow0.e(r8, r15, r13)
            int r9 = r15 + 2
            int r1 = r1 + 4
            int r12 = r12 + 4
            int r12 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r5, r12, r1, r2)
            int r15 = r15 + 8
            int r13 = r12 >>> 8
            int r15 = r15 + r13
            if (r15 > r10) goto L_0x0143
            int r1 = r1 + r12
            r13 = 15
            if (r12 < r13) goto L_0x00f7
            byte r14 = r8.get(r11)
            r14 = r14 | r13
            byte r14 = (byte) r14
            r8.put(r11, r14)
            int r12 = r12 + -15
            int r9 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r12, r8, r9)
        L_0x00f5:
            r11 = r9
            goto L_0x0101
        L_0x00f7:
            byte r14 = r8.get(r11)
            r12 = r12 | r14
            byte r12 = (byte) r12
            r8.put(r11, r12)
            goto L_0x00f5
        L_0x0101:
            if (r1 <= r3) goto L_0x010e
            r6 = r1
            goto L_0x0079
        L_0x0106:
            int r7 = r0 - r6
            int r0 = net.jpountz.lz4.LZ4ByteBufferUtils.lastLiterals(r5, r6, r7, r8, r9, r10)
            int r0 = r0 - r4
            return r0
        L_0x010e:
            int r9 = r1 + -2
            int r12 = r5.getInt(r9)
            int r12 = net.jpountz.lz4.LZ4Utils.hash(r12)
            r7[r12] = r9
            int r9 = r5.getInt(r1)
            int r9 = net.jpountz.lz4.LZ4Utils.hash(r9)
            r12 = r7[r9]
            r7[r9] = r1
            int r9 = r1 - r12
            r14 = 65536(0x10000, float:9.18355E-41)
            if (r9 >= r14) goto L_0x013c
            boolean r15 = net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r5, r12, r1)
            if (r15 != 0) goto L_0x0133
            goto L_0x013c
        L_0x0133:
            int r15 = r11 + 1
            r13 = 0
            byte r13 = (byte) r13
            r8.put(r11, r13)
            r13 = r9
            goto L_0x00cd
        L_0x013c:
            int r6 = r1 + 1
            r9 = r1
            r1 = r20
            goto L_0x006b
        L_0x0143:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r6)
            throw r0
        L_0x0149:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>(r6)
            throw r0
        L_0x014f:
            r13 = r18
            r6 = r19
            r1 = r20
            r12 = r14
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }
}
