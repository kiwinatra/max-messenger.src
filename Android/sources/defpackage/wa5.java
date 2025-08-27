package defpackage;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: wa5  reason: default package */
public final class wa5 {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public wa5(int i, byte[] bArr, int i2) {
        this(-1, bArr, i, i2);
    }

    public static wa5 a(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(ab5.b0);
        return new wa5(2, bytes, bytes.length);
    }

    public static wa5 b(long j, ByteOrder byteOrder) {
        return c(new long[]{j}, byteOrder);
    }

    public static wa5 c(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(ab5.S[4] * jArr.length)]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new wa5(4, wrap.array(), jArr.length);
    }

    public static wa5 d(ya5[] ya5Arr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(ab5.S[5] * ya5Arr.length)]);
        wrap.order(byteOrder);
        for (ya5 ya5 : ya5Arr) {
            wrap.putInt((int) ya5.a);
            wrap.putInt((int) ya5.b);
        }
        return new wa5(5, wrap.array(), ya5Arr.length);
    }

    public static wa5 e(int i, ByteOrder byteOrder) {
        return f(new int[]{i}, byteOrder);
    }

    public static wa5 f(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(ab5.S[3] * iArr.length)]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putShort((short) i);
        }
        return new wa5(3, wrap.array(), iArr.length);
    }

    public final double g(ByteOrder byteOrder) {
        Serializable j = j(byteOrder);
        if (j == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        } else if (j instanceof String) {
            return Double.parseDouble((String) j);
        } else {
            if (j instanceof long[]) {
                long[] jArr = (long[]) j;
                if (jArr.length == 1) {
                    return (double) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (j instanceof int[]) {
                int[] iArr = (int[]) j;
                if (iArr.length == 1) {
                    return (double) iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (j instanceof double[]) {
                double[] dArr = (double[]) j;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (j instanceof ya5[]) {
                ya5[] ya5Arr = (ya5[]) j;
                if (ya5Arr.length == 1) {
                    ya5 ya5 = ya5Arr[0];
                    return ((double) ya5.a) / ((double) ya5.b);
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
    }

    public final int h(ByteOrder byteOrder) {
        Serializable j = j(byteOrder);
        if (j == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        } else if (j instanceof String) {
            return Integer.parseInt((String) j);
        } else {
            if (j instanceof long[]) {
                long[] jArr = (long[]) j;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (j instanceof int[]) {
                int[] iArr = (int[]) j;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
    }

    public final String i(ByteOrder byteOrder) {
        Serializable j = j(byteOrder);
        if (j == null) {
            return null;
        }
        if (j instanceof String) {
            return (String) j;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (j instanceof long[]) {
            long[] jArr = (long[]) j;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (j instanceof int[]) {
            int[] iArr = (int[]) j;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (j instanceof double[]) {
            double[] dArr = (double[]) j;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (!(j instanceof ya5[])) {
            return null;
        } else {
            ya5[] ya5Arr = (ya5[]) j;
            while (i < ya5Arr.length) {
                sb.append(ya5Arr[i].a);
                sb.append('/');
                sb.append(ya5Arr[i].b);
                i++;
                if (i != ya5Arr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
    }

    /* JADX WARNING: type inference failed for: r12v10, types: [int[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r12v11, types: [long[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r12v12, types: [ya5[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r12v13, types: [int[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r12v14, types: [int[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r12v15, types: [ya5[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r12v16, types: [double[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r12v17, types: [double[], java.io.Serializable] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x011e A[SYNTHETIC, Splitter:B:132:0x011e] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0124 A[SYNTHETIC, Splitter:B:138:0x0124] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable j(java.nio.ByteOrder r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = 1
            byte[] r2 = r11.d
            r3 = 0
            va5 r4 = new va5     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            r4.<init>((byte[]) r2)     // Catch:{ IOException -> 0x011a, all -> 0x0118 }
            r4.b = r12     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            int r12 = r11.a     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r11 = r11.b
            switch(r12) {
                case 1: goto L_0x00f4;
                case 2: goto L_0x00bb;
                case 3: goto L_0x00ab;
                case 4: goto L_0x0099;
                case 5: goto L_0x007c;
                case 6: goto L_0x00f4;
                case 7: goto L_0x00bb;
                case 8: goto L_0x006c;
                case 9: goto L_0x005c;
                case 10: goto L_0x0041;
                case 11: goto L_0x0030;
                case 12: goto L_0x001c;
                default: goto L_0x0018;
            }
        L_0x0018:
            r4.close()     // Catch:{ IOException -> 0x001b }
        L_0x001b:
            return r3
        L_0x001c:
            double[] r12 = new double[r11]     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
        L_0x001e:
            if (r0 >= r11) goto L_0x002c
            double r5 = r4.readDouble()     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            r12[r0] = r5     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            int r0 = r0 + r1
            goto L_0x001e
        L_0x0028:
            r11 = move-exception
            r3 = r4
            goto L_0x011c
        L_0x002c:
            r4.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            return r12
        L_0x0030:
            double[] r12 = new double[r11]     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
        L_0x0032:
            if (r0 >= r11) goto L_0x003d
            float r2 = r4.readFloat()     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            double r5 = (double) r2     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            r12[r0] = r5     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            int r0 = r0 + r1
            goto L_0x0032
        L_0x003d:
            r4.close()     // Catch:{ IOException -> 0x0040 }
        L_0x0040:
            return r12
        L_0x0041:
            ya5[] r12 = new defpackage.ya5[r11]     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
        L_0x0043:
            if (r0 >= r11) goto L_0x0058
            int r2 = r4.readInt()     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            long r5 = (long) r2     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            int r2 = r4.readInt()     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            long r7 = (long) r2     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            ya5 r2 = new ya5     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            r2.<init>(r5, r7)     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            r12[r0] = r2     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            int r0 = r0 + r1
            goto L_0x0043
        L_0x0058:
            r4.close()     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            return r12
        L_0x005c:
            int[] r12 = new int[r11]     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
        L_0x005e:
            if (r0 >= r11) goto L_0x0068
            int r2 = r4.readInt()     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            r12[r0] = r2     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            int r0 = r0 + r1
            goto L_0x005e
        L_0x0068:
            r4.close()     // Catch:{ IOException -> 0x006b }
        L_0x006b:
            return r12
        L_0x006c:
            int[] r12 = new int[r11]     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
        L_0x006e:
            if (r0 >= r11) goto L_0x0078
            short r2 = r4.readShort()     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            r12[r0] = r2     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            int r0 = r0 + r1
            goto L_0x006e
        L_0x0078:
            r4.close()     // Catch:{ IOException -> 0x007b }
        L_0x007b:
            return r12
        L_0x007c:
            ya5[] r12 = new defpackage.ya5[r11]     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
        L_0x007e:
            if (r0 >= r11) goto L_0x0095
            int r2 = r4.readInt()     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            long r7 = (long) r2     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            long r7 = r7 & r5
            int r2 = r4.readInt()     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            long r9 = (long) r2     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            long r9 = r9 & r5
            ya5 r2 = new ya5     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            r2.<init>(r7, r9)     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            r12[r0] = r2     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            int r0 = r0 + r1
            goto L_0x007e
        L_0x0095:
            r4.close()     // Catch:{ IOException -> 0x0098 }
        L_0x0098:
            return r12
        L_0x0099:
            long[] r12 = new long[r11]     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
        L_0x009b:
            if (r0 >= r11) goto L_0x00a7
            int r2 = r4.readInt()     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            long r7 = (long) r2     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            long r7 = r7 & r5
            r12[r0] = r7     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            int r0 = r0 + r1
            goto L_0x009b
        L_0x00a7:
            r4.close()     // Catch:{ IOException -> 0x00aa }
        L_0x00aa:
            return r12
        L_0x00ab:
            int[] r12 = new int[r11]     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
        L_0x00ad:
            if (r0 >= r11) goto L_0x00b7
            int r2 = r4.readUnsignedShort()     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            r12[r0] = r2     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            int r0 = r0 + r1
            goto L_0x00ad
        L_0x00b7:
            r4.close()     // Catch:{ IOException -> 0x00ba }
        L_0x00ba:
            return r12
        L_0x00bb:
            byte[] r12 = defpackage.ab5.T     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            int r12 = r12.length     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            if (r11 < r12) goto L_0x00d0
            r12 = r0
        L_0x00c1:
            byte[] r5 = defpackage.ab5.T     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            int r6 = r5.length     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            if (r12 >= r6) goto L_0x00cf
            byte r6 = r2[r12]     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            byte r5 = r5[r12]     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            if (r6 == r5) goto L_0x00cd
            goto L_0x00d0
        L_0x00cd:
            int r12 = r12 + r1
            goto L_0x00c1
        L_0x00cf:
            int r0 = r5.length     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
        L_0x00d0:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            r12.<init>()     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
        L_0x00d5:
            if (r0 >= r11) goto L_0x00ec
            byte r5 = r2[r0]     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            if (r5 != 0) goto L_0x00dc
            goto L_0x00ec
        L_0x00dc:
            r6 = 32
            if (r5 < r6) goto L_0x00e5
            char r5 = (char) r5     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            r12.append(r5)     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            goto L_0x00ea
        L_0x00e5:
            r5 = 63
            r12.append(r5)     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
        L_0x00ea:
            int r0 = r0 + r1
            goto L_0x00d5
        L_0x00ec:
            java.lang.String r11 = r12.toString()     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            r4.close()     // Catch:{ IOException -> 0x00f3 }
        L_0x00f3:
            return r11
        L_0x00f4:
            int r11 = r2.length     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            if (r11 != r1) goto L_0x010d
            byte r11 = r2[r0]     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            if (r11 < 0) goto L_0x010d
            if (r11 > r1) goto L_0x010d
            java.lang.String r12 = new java.lang.String     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            int r11 = r11 + 48
            char r11 = (char) r11     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            char[] r1 = new char[r1]     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            r1[r0] = r11     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            r12.<init>(r1)     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            r4.close()     // Catch:{ IOException -> 0x010c }
        L_0x010c:
            return r12
        L_0x010d:
            java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            java.nio.charset.Charset r12 = defpackage.ab5.b0     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            r11.<init>(r2, r12)     // Catch:{ IOException -> 0x0122, all -> 0x0028 }
            r4.close()     // Catch:{ IOException -> 0x0117 }
        L_0x0117:
            return r11
        L_0x0118:
            r11 = move-exception
            goto L_0x011c
        L_0x011a:
            r4 = r3
            goto L_0x0122
        L_0x011c:
            if (r3 == 0) goto L_0x0121
            r3.close()     // Catch:{ IOException -> 0x0121 }
        L_0x0121:
            throw r11
        L_0x0122:
            if (r4 == 0) goto L_0x0127
            r4.close()     // Catch:{ IOException -> 0x0127 }
        L_0x0127:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wa5.j(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(ab5.R[this.a]);
        sb.append(", data length:");
        return wj6.l(sb, this.d.length, ")");
    }

    public wa5(long j, byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }
}
