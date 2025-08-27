package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.text.Charsets;

/* renamed from: vw0  reason: default package */
public class vw0 implements Serializable, Comparable {
    public static final vw0 o = new vw0(new byte[0]);
    public transient int a;
    public transient String b;
    public final byte[] c;

    public vw0(byte[] bArr) {
        this.c = bArr;
    }

    public String a() {
        byte[] bArr = a.a;
        byte[] bArr2 = this.c;
        byte[] bArr3 = new byte[(((bArr2.length + 2) / 3) * 4)];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b2 = bArr2[i];
            int i3 = i + 2;
            byte b3 = bArr2[i + 1];
            i += 3;
            byte b4 = bArr2[i3];
            bArr3[i2] = bArr[(b2 & UByte.MAX_VALUE) >> 2];
            bArr3[i2 + 1] = bArr[((b2 & 3) << 4) | ((b3 & UByte.MAX_VALUE) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr[((b3 & 15) << 2) | ((b4 & UByte.MAX_VALUE) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr[b4 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b5 = bArr2[i];
            bArr3[i2] = bArr[(b5 & UByte.MAX_VALUE) >> 2];
            bArr3[i2 + 1] = bArr[(b5 & 3) << 4];
            byte b6 = (byte) 61;
            bArr3[i2 + 2] = b6;
            bArr3[i2 + 3] = b6;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b7 = bArr2[i];
            byte b8 = bArr2[i5];
            bArr3[i2] = bArr[(b7 & UByte.MAX_VALUE) >> 2];
            bArr3[i2 + 1] = bArr[((b7 & 3) << 4) | ((b8 & UByte.MAX_VALUE) >> 4)];
            bArr3[i2 + 2] = bArr[(b8 & 15) << 2];
            bArr3[i2 + 3] = (byte) 61;
        }
        return new String(bArr3, Charsets.UTF_8);
    }

    public vw0 b(String str) {
        return new vw0(MessageDigest.getInstance(str).digest(this.c));
    }

    public int c() {
        return this.c.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r0 < r1) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (r7 < r8) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compareTo(java.lang.Object r10) {
        /*
            r9 = this;
            vw0 r10 = (defpackage.vw0) r10
            int r0 = r9.c()
            int r1 = r10.c()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0010:
            r5 = 1
            r6 = -1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.f(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.f(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0025
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0025:
            if (r7 >= r8) goto L_0x0029
        L_0x0027:
            r3 = r6
            goto L_0x0031
        L_0x0029:
            r3 = r5
            goto L_0x0031
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            if (r0 >= r1) goto L_0x0029
            goto L_0x0027
        L_0x0031:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw0.compareTo(java.lang.Object):int");
    }

    public String d() {
        byte[] bArr = this.c;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = tf6.b;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public byte[] e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vw0) {
            vw0 vw0 = (vw0) obj;
            int c2 = vw0.c();
            byte[] bArr = this.c;
            if (c2 == bArr.length && vw0.g(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public byte f(int i) {
        return this.c[i];
    }

    public boolean g(int i, int i2, int i3, byte[] bArr) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.c;
        if (i > bArr2.length - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr2[i4 + i] != bArr[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public boolean h(int i, vw0 vw0) {
        return vw0.g(0, 0, i, this.c);
    }

    public int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.c);
        this.a = hashCode;
        return hashCode;
    }

    public vw0 i() {
        byte b2;
        int i = 0;
        while (true) {
            byte[] bArr = this.c;
            if (i >= bArr.length) {
                return this;
            }
            byte b3 = bArr[i];
            byte b4 = (byte) 65;
            if (b3 < b4 || b3 > (b2 = (byte) 90)) {
                i++;
            } else {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                copyOf[i] = (byte) (b3 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b5 = copyOf[i2];
                    if (b5 >= b4 && b5 <= b2) {
                        copyOf[i2] = (byte) (b5 + 32);
                    }
                }
                return new vw0(copyOf);
            }
        }
    }

    public final String j() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        String str2 = new String(e(), Charsets.UTF_8);
        this.b = str2;
        return str2;
    }

    public void k(rt0 rt0, int i) {
        rt0.write(this.c, 0, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x012b, code lost:
        if (r8 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x012f, code lost:
        if (r8 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x013b, code lost:
        if (r8 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0168, code lost:
        if (r8 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0172, code lost:
        if (r8 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0177, code lost:
        if (r8 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01ac, code lost:
        if (r8 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x01af, code lost:
        if (r8 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x01b2, code lost:
        if (r8 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x01b5, code lost:
        if (r8 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0079, code lost:
        if (r8 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x008a, code lost:
        if (r8 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00b9, code lost:
        if (r8 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00cc, code lost:
        if (r8 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00ec, code lost:
        if (r8 == 64) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00f5, code lost:
        if (r8 == 64) goto L_0x01b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r18 = this;
            r1 = 1
            r2 = r18
            byte[] r3 = r2.c
            int r4 = r3.length
            if (r4 != 0) goto L_0x000c
            java.lang.String r0 = "[size=0]"
            goto L_0x0272
        L_0x000c:
            int r4 = r3.length
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0010:
            r10 = 64
            if (r6 >= r4) goto L_0x01b7
            byte r11 = r3[r6]
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 127(0x7f, float:1.78E-43)
            r14 = 159(0x9f, float:2.23E-43)
            r15 = 31
            r5 = 13
            r9 = 10
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r11 < 0) goto L_0x006e
            int r17 = r8 + 1
            if (r8 != r10) goto L_0x002d
            goto L_0x01b7
        L_0x002d:
            if (r11 == r9) goto L_0x003b
            if (r11 == r5) goto L_0x003b
            if (r11 < 0) goto L_0x0035
            if (r15 >= r11) goto L_0x003d
        L_0x0035:
            if (r13 <= r11) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            if (r14 < r11) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            if (r11 != r12) goto L_0x0040
        L_0x003d:
            r7 = -1
            goto L_0x01b7
        L_0x0040:
            if (r11 >= r0) goto L_0x0044
            r8 = r1
            goto L_0x0045
        L_0x0044:
            r8 = 2
        L_0x0045:
            int r7 = r7 + r8
            int r6 = r6 + r1
        L_0x0047:
            r8 = r17
            if (r6 >= r4) goto L_0x0010
            byte r11 = r3[r6]
            if (r11 < 0) goto L_0x0010
            int r6 = r6 + r1
            int r17 = r8 + 1
            if (r8 != r10) goto L_0x0056
            goto L_0x01b7
        L_0x0056:
            if (r11 == r9) goto L_0x0064
            if (r11 == r5) goto L_0x0064
            if (r11 < 0) goto L_0x005e
            if (r15 >= r11) goto L_0x003d
        L_0x005e:
            if (r13 <= r11) goto L_0x0061
            goto L_0x0064
        L_0x0061:
            if (r14 < r11) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            if (r11 != r12) goto L_0x0067
        L_0x0066:
            goto L_0x003d
        L_0x0067:
            if (r11 >= r0) goto L_0x006b
            r8 = r1
            goto L_0x006c
        L_0x006b:
            r8 = 2
        L_0x006c:
            int r7 = r7 + r8
            goto L_0x0047
        L_0x006e:
            int r0 = r11 >> 5
            r12 = -2
            r14 = 128(0x80, float:1.794E-43)
            if (r0 != r12) goto L_0x00bd
            int r0 = r6 + 1
            if (r4 > r0) goto L_0x007d
            if (r8 != r10) goto L_0x003d
            goto L_0x01b7
        L_0x007d:
            byte r0 = r3[r0]
            r12 = r0 & 192(0xc0, float:2.69E-43)
            if (r12 != r14) goto L_0x00b9
            r0 = r0 ^ 3968(0xf80, float:5.56E-42)
            int r11 = r11 << 6
            r0 = r0 ^ r11
            if (r0 >= r14) goto L_0x008e
            if (r8 != r10) goto L_0x003d
            goto L_0x01b7
        L_0x008e:
            int r11 = r8 + 1
            if (r8 != r10) goto L_0x0094
            goto L_0x01b7
        L_0x0094:
            if (r0 == r9) goto L_0x00a4
            if (r0 == r5) goto L_0x00a4
            if (r0 < 0) goto L_0x009c
            if (r15 >= r0) goto L_0x003d
        L_0x009c:
            if (r13 <= r0) goto L_0x009f
            goto L_0x00a4
        L_0x009f:
            r5 = 159(0x9f, float:2.23E-43)
            if (r5 < r0) goto L_0x00a4
            goto L_0x00a9
        L_0x00a4:
            r5 = 65533(0xfffd, float:9.1831E-41)
            if (r0 != r5) goto L_0x00aa
        L_0x00a9:
            goto L_0x003d
        L_0x00aa:
            r5 = 65536(0x10000, float:9.18355E-41)
            if (r0 >= r5) goto L_0x00b0
            r0 = r1
            goto L_0x00b1
        L_0x00b0:
            r0 = 2
        L_0x00b1:
            int r7 = r7 + r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r0 = 2
            int r6 = r6 + r0
            r8 = r11
            goto L_0x0010
        L_0x00b9:
            if (r8 != r10) goto L_0x003d
            goto L_0x01b7
        L_0x00bd:
            r0 = 2
            int r13 = r11 >> 4
            r15 = 55296(0xd800, float:7.7486E-41)
            r5 = 57343(0xdfff, float:8.0355E-41)
            if (r13 != r12) goto L_0x0133
            int r12 = r6 + 2
            if (r4 > r12) goto L_0x00d0
            if (r8 != r10) goto L_0x003d
            goto L_0x01b7
        L_0x00d0:
            int r0 = r6 + 1
            byte r0 = r3[r0]
            r13 = r0 & 192(0xc0, float:2.69E-43)
            if (r13 != r14) goto L_0x012f
            byte r12 = r3[r12]
            r13 = r12 & 192(0xc0, float:2.69E-43)
            if (r13 != r14) goto L_0x012b
            r13 = -123008(0xfffffffffffe1f80, float:NaN)
            r12 = r12 ^ r13
            int r0 = r0 << 6
            r0 = r0 ^ r12
            int r11 = r11 << 12
            r0 = r0 ^ r11
            r11 = 2048(0x800, float:2.87E-42)
            if (r0 >= r11) goto L_0x00f0
            if (r8 != r10) goto L_0x003d
            goto L_0x01b7
        L_0x00f0:
            if (r15 <= r0) goto L_0x00f3
            goto L_0x00f9
        L_0x00f3:
            if (r5 < r0) goto L_0x00f9
            if (r8 != r10) goto L_0x003d
            goto L_0x01b7
        L_0x00f9:
            int r5 = r8 + 1
            if (r8 != r10) goto L_0x00ff
            goto L_0x01b7
        L_0x00ff:
            if (r0 == r9) goto L_0x0115
            r8 = 13
            if (r0 == r8) goto L_0x0115
            if (r0 < 0) goto L_0x010b
            r8 = 31
            if (r8 >= r0) goto L_0x003d
        L_0x010b:
            r8 = 127(0x7f, float:1.78E-43)
            if (r8 <= r0) goto L_0x0110
            goto L_0x0115
        L_0x0110:
            r8 = 159(0x9f, float:2.23E-43)
            if (r8 < r0) goto L_0x0115
            goto L_0x011a
        L_0x0115:
            r8 = 65533(0xfffd, float:9.1831E-41)
            if (r0 != r8) goto L_0x011c
        L_0x011a:
            goto L_0x003d
        L_0x011c:
            r8 = 65536(0x10000, float:9.18355E-41)
            if (r0 >= r8) goto L_0x0122
            r0 = r1
            goto L_0x0123
        L_0x0122:
            r0 = 2
        L_0x0123:
            int r7 = r7 + r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            int r6 = r6 + 3
        L_0x0128:
            r8 = r5
            goto L_0x0010
        L_0x012b:
            if (r8 != r10) goto L_0x003d
            goto L_0x01b7
        L_0x012f:
            if (r8 != r10) goto L_0x003d
            goto L_0x01b7
        L_0x0133:
            int r0 = r11 >> 3
            if (r0 != r12) goto L_0x01b5
            int r0 = r6 + 3
            if (r4 > r0) goto L_0x013f
            if (r8 != r10) goto L_0x003d
            goto L_0x01b7
        L_0x013f:
            int r12 = r6 + 1
            byte r12 = r3[r12]
            r13 = r12 & 192(0xc0, float:2.69E-43)
            if (r13 != r14) goto L_0x01b2
            r13 = 2
            int r16 = r6 + 2
            byte r13 = r3[r16]
            r9 = r13 & 192(0xc0, float:2.69E-43)
            if (r9 != r14) goto L_0x01af
            byte r0 = r3[r0]
            r9 = r0 & 192(0xc0, float:2.69E-43)
            if (r9 != r14) goto L_0x01ac
            r9 = 3678080(0x381f80, float:5.154088E-39)
            r0 = r0 ^ r9
            int r9 = r13 << 6
            r0 = r0 ^ r9
            int r9 = r12 << 12
            r0 = r0 ^ r9
            int r9 = r11 << 18
            r0 = r0 ^ r9
            r9 = 1114111(0x10ffff, float:1.561202E-39)
            if (r0 <= r9) goto L_0x016b
            if (r8 != r10) goto L_0x003d
            goto L_0x01b7
        L_0x016b:
            if (r15 <= r0) goto L_0x0170
        L_0x016d:
            r5 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0175
        L_0x0170:
            if (r5 < r0) goto L_0x016d
            if (r8 != r10) goto L_0x003d
            goto L_0x01b7
        L_0x0175:
            if (r0 >= r5) goto L_0x017a
            if (r8 != r10) goto L_0x003d
            goto L_0x01b7
        L_0x017a:
            int r5 = r8 + 1
            if (r8 != r10) goto L_0x017f
            goto L_0x01b7
        L_0x017f:
            r8 = 10
            if (r0 == r8) goto L_0x0197
            r8 = 13
            if (r0 == r8) goto L_0x0197
            if (r0 < 0) goto L_0x018d
            r8 = 31
            if (r8 >= r0) goto L_0x003d
        L_0x018d:
            r8 = 127(0x7f, float:1.78E-43)
            if (r8 <= r0) goto L_0x0192
            goto L_0x0197
        L_0x0192:
            r8 = 159(0x9f, float:2.23E-43)
            if (r8 < r0) goto L_0x0197
            goto L_0x019c
        L_0x0197:
            r8 = 65533(0xfffd, float:9.1831E-41)
            if (r0 != r8) goto L_0x019e
        L_0x019c:
            goto L_0x003d
        L_0x019e:
            r8 = 65536(0x10000, float:9.18355E-41)
            if (r0 >= r8) goto L_0x01a4
            r0 = r1
            goto L_0x01a5
        L_0x01a4:
            r0 = 2
        L_0x01a5:
            int r7 = r7 + r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            int r6 = r6 + 4
            goto L_0x0128
        L_0x01ac:
            if (r8 != r10) goto L_0x003d
            goto L_0x01b7
        L_0x01af:
            if (r8 != r10) goto L_0x003d
            goto L_0x01b7
        L_0x01b2:
            if (r8 != r10) goto L_0x003d
            goto L_0x01b7
        L_0x01b5:
            if (r8 != r10) goto L_0x003d
        L_0x01b7:
            java.lang.String r0 = "…]"
            java.lang.String r1 = "[size="
            r4 = 93
            r5 = -1
            if (r7 != r5) goto L_0x0221
            int r5 = r3.length
            if (r5 > r10) goto L_0x01da
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[hex="
            r0.<init>(r1)
            java.lang.String r1 = r18.d()
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            goto L_0x0272
        L_0x01da:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            int r1 = r3.length
            r4.append(r1)
            java.lang.String r1 = " hex="
            r4.append(r1)
            int r1 = r3.length
            if (r10 > r1) goto L_0x0209
            int r1 = r3.length
            if (r10 != r1) goto L_0x01f0
            r1 = r2
            goto L_0x01fa
        L_0x01f0:
            vw0 r1 = new vw0
            r2 = 0
            byte[] r2 = kotlin.collections.ArraysKt.copyOfRange((byte[]) r3, (int) r2, (int) r10)
            r1.<init>(r2)
        L_0x01fa:
            java.lang.String r1 = r1.d()
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            goto L_0x0272
        L_0x0209:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "endIndex > length("
            r0.<init>(r1)
            int r1 = r3.length
            r2 = 41
            java.lang.String r0 = defpackage.tr1.k(r0, r1, r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0221:
            java.lang.String r2 = r18.j()
            r5 = 0
            java.lang.String r5 = r2.substring(r5, r7)
            java.lang.String r6 = "\\"
            java.lang.String r8 = "\\\\"
            java.lang.String r5 = kotlin.text.StringsKt__StringsJVMKt.replace$default((java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r8, false, 4, (java.lang.Object) null)
            java.lang.String r6 = "\n"
            java.lang.String r8 = "\\n"
            java.lang.String r5 = kotlin.text.StringsKt__StringsJVMKt.replace$default((java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r8, false, 4, (java.lang.Object) null)
            java.lang.String r6 = "\r"
            java.lang.String r8 = "\\r"
            java.lang.String r5 = kotlin.text.StringsKt__StringsJVMKt.replace$default((java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r8, false, 4, (java.lang.Object) null)
            int r2 = r2.length()
            if (r7 >= r2) goto L_0x0261
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            int r1 = r3.length
            r2.append(r1)
            java.lang.String r1 = " text="
            r2.append(r1)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x0272
        L_0x0261:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[text="
            r0.<init>(r1)
            r0.append(r5)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
        L_0x0272:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw0.toString():java.lang.String");
    }
}
