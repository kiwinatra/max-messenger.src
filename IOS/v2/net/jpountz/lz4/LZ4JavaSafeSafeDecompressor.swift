package net.jpountz.lz4;

final class LZ4JavaSafeSafeDecompressor extends LZ4SafeDecompressor {
    public static final LZ4SafeDecompressor INSTANCE = new LZ4JavaSafeSafeDecompressor();

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int decompress(byte[] r18, int r19, int r20, byte[] r21, int r22, int r23) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            defpackage.acd.b(r1, r0, r2)
            defpackage.acd.b(r4, r3, r5)
            if (r5 != 0) goto L_0x0025
            r3 = 1
            if (r2 != r3) goto L_0x001d
            byte r0 = r0[r1]
            if (r0 != 0) goto L_0x001d
            r0 = 0
            return r0
        L_0x001d:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = "Output buffer too small"
            r0.<init>(r1)
            throw r0
        L_0x0025:
            int r2 = r2 + r1
            int r5 = r5 + r4
            r6 = r4
        L_0x0028:
            byte r7 = r0[r1]
            r8 = r7 & 255(0xff, float:3.57E-43)
            int r1 = r1 + 1
            int r8 = r8 >>> 4
            r9 = 15
            r10 = -1
            if (r8 != r9) goto L_0x004e
            r11 = r10
        L_0x0036:
            if (r1 >= r2) goto L_0x004b
            int r11 = r1 + 1
            byte r1 = r0[r1]
            if (r1 != r10) goto L_0x0046
            int r8 = r8 + 255
            r16 = r11
            r11 = r1
            r1 = r16
            goto L_0x0036
        L_0x0046:
            r16 = r11
            r11 = r1
            r1 = r16
        L_0x004b:
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r8 = r8 + r11
        L_0x004e:
            int r11 = r6 + r8
            int r12 = r5 + -8
            java.lang.String r13 = "Malformed input at "
            if (r11 > r12) goto L_0x00b0
            int r14 = r1 + r8
            int r15 = r2 + -8
            if (r14 <= r15) goto L_0x005d
            goto L_0x00b0
        L_0x005d:
            net.jpountz.lz4.LZ4SafeUtils.wildArraycopy(r0, r1, r3, r6, r8)
            byte r1 = r0[r14]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r6 = r14 + 1
            byte r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r1 = r1 | r6
            int r14 = r14 + 2
            int r1 = r11 - r1
            if (r1 < r4) goto L_0x00a6
            r6 = r7 & 15
            if (r6 != r9) goto L_0x008a
            r7 = r10
        L_0x0078:
            if (r14 >= r2) goto L_0x0087
            int r7 = r14 + 1
            byte r8 = r0[r14]
            if (r8 != r10) goto L_0x0085
            int r6 = r6 + 255
            r14 = r7
            r7 = r8
            goto L_0x0078
        L_0x0085:
            r14 = r7
            r7 = r8
        L_0x0087:
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r6 = r6 + r7
        L_0x008a:
            int r6 = r6 + 4
            int r7 = r11 + r6
            if (r7 <= r12) goto L_0x00a0
            if (r7 > r5) goto L_0x0096
            net.jpountz.lz4.LZ4SafeUtils.safeIncrementalCopy(r3, r1, r11, r6)
            goto L_0x00a3
        L_0x0096:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = defpackage.wj6.h(r14, r13)
            r0.<init>(r1)
            throw r0
        L_0x00a0:
            net.jpountz.lz4.LZ4SafeUtils.wildIncrementalCopy(r3, r1, r11, r7)
        L_0x00a3:
            r6 = r7
            r1 = r14
            goto L_0x0028
        L_0x00a6:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = defpackage.wj6.h(r14, r13)
            r0.<init>(r1)
            throw r0
        L_0x00b0:
            if (r11 > r5) goto L_0x00c5
            int r5 = r1 + r8
            if (r5 != r2) goto L_0x00bb
            net.jpountz.lz4.LZ4SafeUtils.safeArraycopy(r0, r1, r3, r6, r8)
            int r11 = r11 - r4
            return r11
        L_0x00bb:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = defpackage.wj6.h(r1, r13)
            r0.<init>(r1)
            throw r0
        L_0x00c5:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeSafeDecompressor.decompress(byte[], int, int, byte[], int, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int decompress(java.nio.ByteBuffer r18, int r19, int r20, java.nio.ByteBuffer r21, int r22, int r23) {
        /*
            r17 = this;
            r0 = r19
            r3 = r20
            r1 = r22
            r6 = r23
            boolean r2 = r18.hasArray()
            if (r2 == 0) goto L_0x0036
            boolean r2 = r21.hasArray()
            if (r2 == 0) goto L_0x0036
            byte[] r2 = r18.array()
            int r4 = r18.arrayOffset()
            int r4 = r4 + r0
            byte[] r5 = r21.array()
            int r0 = r21.arrayOffset()
            int r7 = r0 + r1
            r0 = r17
            r1 = r2
            r2 = r4
            r3 = r20
            r4 = r5
            r5 = r7
            r6 = r23
            int r0 = r0.decompress((byte[]) r1, (int) r2, (int) r3, (byte[]) r4, (int) r5, (int) r6)
            return r0
        L_0x0036:
            java.nio.ByteBuffer r2 = defpackage.ow0.c(r18)
            java.nio.ByteBuffer r4 = defpackage.ow0.c(r21)
            defpackage.ow0.b(r2, r0, r3)
            defpackage.ow0.b(r4, r1, r6)
            if (r6 != 0) goto L_0x0059
            r1 = 1
            if (r3 != r1) goto L_0x0051
            byte r0 = r2.get(r0)
            if (r0 != 0) goto L_0x0051
            r0 = 0
            return r0
        L_0x0051:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = "Output buffer too small"
            r0.<init>(r1)
            throw r0
        L_0x0059:
            int r3 = r3 + r0
            int r5 = r1 + r6
            r6 = r1
        L_0x005d:
            byte r7 = r2.get(r0)
            r8 = r7 & 255(0xff, float:3.57E-43)
            int r0 = r0 + 1
            int r8 = r8 >>> 4
            r9 = 15
            r10 = -1
            if (r8 != r9) goto L_0x0087
            r11 = r10
        L_0x006d:
            if (r0 >= r3) goto L_0x0084
            int r11 = r0 + 1
            byte r0 = r2.get(r0)
            if (r0 != r10) goto L_0x007f
            int r8 = r8 + 255
            r16 = r11
            r11 = r0
            r0 = r16
            goto L_0x006d
        L_0x007f:
            r16 = r11
            r11 = r0
            r0 = r16
        L_0x0084:
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r8 = r8 + r11
        L_0x0087:
            int r11 = r6 + r8
            int r12 = r5 + -8
            java.lang.String r13 = "Malformed input at "
            if (r11 > r12) goto L_0x00e2
            int r14 = r0 + r8
            int r15 = r3 + -8
            if (r14 <= r15) goto L_0x0096
            goto L_0x00e2
        L_0x0096:
            net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r2, r0, r4, r6, r8)
            int r0 = defpackage.ow0.d(r14, r2)
            int r14 = r14 + 2
            int r0 = r11 - r0
            if (r0 < r1) goto L_0x00d8
            r6 = r7 & 15
            if (r6 != r9) goto L_0x00bc
            r7 = r10
        L_0x00a8:
            if (r14 >= r3) goto L_0x00b9
            int r7 = r14 + 1
            byte r8 = r2.get(r14)
            if (r8 != r10) goto L_0x00b7
            int r6 = r6 + 255
            r14 = r7
            r7 = r8
            goto L_0x00a8
        L_0x00b7:
            r14 = r7
            r7 = r8
        L_0x00b9:
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r6 = r6 + r7
        L_0x00bc:
            int r6 = r6 + 4
            int r7 = r11 + r6
            if (r7 <= r12) goto L_0x00d2
            if (r7 > r5) goto L_0x00c8
            net.jpountz.lz4.LZ4ByteBufferUtils.safeIncrementalCopy(r4, r0, r11, r6)
            goto L_0x00d5
        L_0x00c8:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = defpackage.wj6.h(r14, r13)
            r0.<init>(r1)
            throw r0
        L_0x00d2:
            net.jpountz.lz4.LZ4ByteBufferUtils.wildIncrementalCopy(r4, r0, r11, r7)
        L_0x00d5:
            r6 = r7
            r0 = r14
            goto L_0x005d
        L_0x00d8:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = defpackage.wj6.h(r14, r13)
            r0.<init>(r1)
            throw r0
        L_0x00e2:
            if (r11 > r5) goto L_0x00f7
            int r5 = r0 + r8
            if (r5 != r3) goto L_0x00ed
            net.jpountz.lz4.LZ4ByteBufferUtils.safeArraycopy(r2, r0, r4, r6, r8)
            int r11 = r11 - r1
            return r11
        L_0x00ed:
            net.jpountz.lz4.LZ4Exception r1 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r0 = defpackage.wj6.h(r0, r13)
            r1.<init>(r0)
            throw r1
        L_0x00f7:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeSafeDecompressor.decompress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }
}
