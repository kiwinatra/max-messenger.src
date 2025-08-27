package net.jpountz.lz4;

final class LZ4JavaUnsafeSafeDecompressor extends LZ4SafeDecompressor {
    public static final LZ4SafeDecompressor INSTANCE = new LZ4JavaUnsafeSafeDecompressor();

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d5  */
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
            r6 = 15
            r7 = 1
            sun.misc.Unsafe r8 = defpackage.gwf.a
            defpackage.acd.b(r1, r0, r2)
            defpackage.acd.b(r4, r3, r5)
            if (r5 != 0) goto L_0x002b
            if (r2 != r7) goto L_0x0023
            byte r0 = defpackage.gwf.a(r1, r0)
            if (r0 != 0) goto L_0x0023
            r0 = 0
            return r0
        L_0x0023:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = "Output buffer too small"
            r0.<init>(r1)
            throw r0
        L_0x002b:
            int r2 = r2 + r1
            int r5 = r5 + r4
            r8 = r4
        L_0x002e:
            byte r9 = defpackage.gwf.a(r1, r0)
            r10 = r9 & 255(0xff, float:3.57E-43)
            int r1 = r1 + r7
            int r10 = r10 >>> 4
            r11 = -1
            if (r10 != r6) goto L_0x0055
            r12 = r11
        L_0x003b:
            if (r1 >= r2) goto L_0x0052
            int r12 = r1 + 1
            byte r1 = defpackage.gwf.a(r1, r0)
            if (r1 != r11) goto L_0x004d
            int r10 = r10 + 255
            r16 = r12
            r12 = r1
            r1 = r16
            goto L_0x003b
        L_0x004d:
            r16 = r12
            r12 = r1
            r1 = r16
        L_0x0052:
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r10 = r10 + r12
        L_0x0055:
            int r12 = r8 + r10
            int r13 = r5 + -8
            java.lang.String r14 = "Malformed input at "
            if (r12 > r13) goto L_0x00c0
            int r15 = r1 + r10
            int r11 = r2 + -8
            if (r15 <= r11) goto L_0x0064
            goto L_0x00c0
        L_0x0064:
            net.jpountz.lz4.LZ4UnsafeUtils.wildArraycopy(r0, r1, r3, r8, r10)
            short r1 = defpackage.gwf.f(r15, r0)
            java.nio.ByteOrder r8 = defpackage.w0g.a
            java.nio.ByteOrder r10 = java.nio.ByteOrder.BIG_ENDIAN
            if (r8 != r10) goto L_0x0075
            short r1 = java.lang.Short.reverseBytes(r1)
        L_0x0075:
            r8 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r8
            int r15 = r15 + 2
            int r1 = r12 - r1
            if (r1 < r4) goto L_0x00b6
            r8 = r9 & 15
            if (r8 != r6) goto L_0x0099
            r9 = -1
        L_0x0084:
            if (r15 >= r2) goto L_0x0096
            int r9 = r15 + 1
            byte r10 = defpackage.gwf.a(r15, r0)
            r11 = -1
            if (r10 != r11) goto L_0x0094
            int r8 = r8 + 255
            r15 = r9
            r9 = r10
            goto L_0x0084
        L_0x0094:
            r15 = r9
            r9 = r10
        L_0x0096:
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r8 = r8 + r9
        L_0x0099:
            int r8 = r8 + 4
            int r9 = r12 + r8
            if (r9 <= r13) goto L_0x00af
            if (r9 > r5) goto L_0x00a5
            net.jpountz.lz4.LZ4UnsafeUtils.safeIncrementalCopy(r3, r1, r12, r8)
            goto L_0x00b2
        L_0x00a5:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = defpackage.wj6.h(r15, r14)
            r0.<init>(r1)
            throw r0
        L_0x00af:
            net.jpountz.lz4.LZ4UnsafeUtils.wildIncrementalCopy(r3, r1, r12, r9)
        L_0x00b2:
            r8 = r9
            r1 = r15
            goto L_0x002e
        L_0x00b6:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = defpackage.wj6.h(r15, r14)
            r0.<init>(r1)
            throw r0
        L_0x00c0:
            if (r12 > r5) goto L_0x00d5
            int r5 = r1 + r10
            if (r5 != r2) goto L_0x00cb
            net.jpountz.lz4.LZ4UnsafeUtils.safeArraycopy(r0, r1, r3, r8, r10)
            int r12 = r12 - r4
            return r12
        L_0x00cb:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r1 = defpackage.wj6.h(r1, r14)
            r0.<init>(r1)
            throw r0
        L_0x00d5:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeSafeDecompressor.decompress(byte[], int, int, byte[], int, int):int");
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
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeSafeDecompressor.decompress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }
}
