package defpackage;

/* renamed from: r3h  reason: default package */
public abstract class r3h {
    public static final js9 a = new Object();

    /* JADX WARNING: type inference failed for: r0v1, types: [js9, java.lang.Object] */
    static {
        if (k3h.e && k3h.d) {
            int i = czg.a;
        }
    }

    public static /* bridge */ /* synthetic */ int a(int i, byte[] bArr, int i2) {
        int i3 = i2 - i;
        byte b = bArr[i - 1];
        if (i3 != 0) {
            if (i3 == 1) {
                byte b2 = bArr[i];
                if (b > -12 || b2 > -65) {
                    return -1;
                }
                return (b2 << 8) ^ b;
            } else if (i3 == 2) {
                byte b3 = bArr[i];
                byte b4 = bArr[i + 1];
                if (b > -12 || b3 > -65 || b4 > -65) {
                    return -1;
                }
                return (b4 << 16) ^ ((b3 << 8) ^ b);
            } else {
                throw new AssertionError();
            }
        } else if (b <= -12) {
            return b;
        } else {
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(byte[] r8, int r9, int r10, java.lang.String r11) {
        /*
            int r0 = r11.length()
            r1 = 0
        L_0x0005:
            int r2 = r9 + r10
            r3 = 128(0x80, float:1.794E-43)
            if (r1 >= r0) goto L_0x001b
            int r4 = r1 + r9
            if (r4 >= r2) goto L_0x001b
            char r5 = r11.charAt(r1)
            if (r5 >= r3) goto L_0x001b
            byte r2 = (byte) r5
            r8[r4] = r2
            int r1 = r1 + 1
            goto L_0x0005
        L_0x001b:
            if (r1 != r0) goto L_0x0020
            int r9 = r9 + r0
            goto L_0x00fe
        L_0x0020:
            int r9 = r9 + r1
        L_0x0021:
            if (r1 >= r0) goto L_0x00fe
            char r10 = r11.charAt(r1)
            if (r10 >= r3) goto L_0x0033
            if (r9 >= r2) goto L_0x0033
            int r4 = r9 + 1
            byte r10 = (byte) r10
            r8[r9] = r10
            r9 = r4
            goto L_0x00b9
        L_0x0033:
            r4 = 2048(0x800, float:2.87E-42)
            if (r10 >= r4) goto L_0x004e
            int r4 = r2 + -2
            if (r9 > r4) goto L_0x004e
            int r4 = r9 + 1
            int r5 = r9 + 2
            int r6 = r10 >>> 6
            r6 = r6 | 960(0x3c0, float:1.345E-42)
            byte r6 = (byte) r6
            r8[r9] = r6
            r9 = r10 & 63
            r9 = r9 | r3
            byte r9 = (byte) r9
            r8[r4] = r9
            r9 = r5
            goto L_0x00b9
        L_0x004e:
            r4 = 57343(0xdfff, float:8.0355E-41)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r10 < r5) goto L_0x0058
            if (r10 <= r4) goto L_0x0079
        L_0x0058:
            int r6 = r2 + -3
            if (r9 > r6) goto L_0x0079
            int r4 = r9 + 1
            int r5 = r9 + 2
            int r6 = r9 + 3
            int r7 = r10 >>> 12
            r7 = r7 | 480(0x1e0, float:6.73E-43)
            byte r7 = (byte) r7
            r8[r9] = r7
            int r9 = r10 >>> 6
            r9 = r9 & 63
            r9 = r9 | r3
            byte r9 = (byte) r9
            r8[r4] = r9
            r9 = r10 & 63
            r9 = r9 | r3
            byte r9 = (byte) r9
            r8[r5] = r9
            r9 = r6
            goto L_0x00b9
        L_0x0079:
            int r6 = r2 + -4
            if (r9 > r6) goto L_0x00c6
            int r4 = r1 + 1
            int r5 = r11.length()
            if (r4 == r5) goto L_0x00be
            char r1 = r11.charAt(r4)
            boolean r5 = java.lang.Character.isSurrogatePair(r10, r1)
            if (r5 == 0) goto L_0x00bd
            int r5 = r9 + 1
            int r6 = r9 + 2
            int r7 = r9 + 3
            int r10 = java.lang.Character.toCodePoint(r10, r1)
            int r1 = r10 >>> 18
            r1 = r1 | 240(0xf0, float:3.36E-43)
            byte r1 = (byte) r1
            r8[r9] = r1
            int r1 = r10 >>> 12
            r1 = r1 & 63
            r1 = r1 | r3
            byte r1 = (byte) r1
            r8[r5] = r1
            int r1 = r10 >>> 6
            r1 = r1 & 63
            r1 = r1 | r3
            byte r1 = (byte) r1
            r8[r6] = r1
            int r9 = r9 + 4
            r10 = r10 & 63
            r10 = r10 | r3
            byte r10 = (byte) r10
            r8[r7] = r10
            r1 = r4
        L_0x00b9:
            int r1 = r1 + 1
            goto L_0x0021
        L_0x00bd:
            r1 = r4
        L_0x00be:
            q3h r8 = new q3h
            int r1 = r1 + -1
            r8.<init>(r1, r0)
            throw r8
        L_0x00c6:
            if (r10 < r5) goto L_0x00e2
            if (r10 > r4) goto L_0x00e2
            int r8 = r1 + 1
            int r2 = r11.length()
            if (r8 == r2) goto L_0x00dc
            char r8 = r11.charAt(r8)
            boolean r8 = java.lang.Character.isSurrogatePair(r10, r8)
            if (r8 != 0) goto L_0x00e2
        L_0x00dc:
            q3h r8 = new q3h
            r8.<init>(r1, r0)
            throw r8
        L_0x00e2:
            java.lang.ArrayIndexOutOfBoundsException r8 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed writing "
            r11.<init>(r0)
            r11.append(r10)
            java.lang.String r10 = " at index "
            r11.append(r10)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r8.<init>(r9)
            throw r8
        L_0x00fe:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r3h.b(byte[], int, int, java.lang.String):int");
    }

    public static int c(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new q3h(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    public static boolean d(int i, byte[] bArr, int i2) {
        a.getClass();
        return js9.n(i, bArr, i2);
    }
}
