package defpackage;

import java.util.Arrays;

/* renamed from: m53  reason: default package */
public final class m53 {
    public static final m53 h = new m53(1, 2, 3, -1, -1, (byte[]) null);
    public static final m53 i = new m53(1, 1, 2, -1, -1, (byte[]) null);
    public static final String j = Integer.toString(0, 36);
    public static final String k = Integer.toString(1, 36);
    public static final String l = Integer.toString(2, 36);
    public static final String m = Integer.toString(3, 36);
    public static final String n = Integer.toString(4, 36);
    public static final String o = Integer.toString(5, 36);
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        int i2 = v0g.a;
    }

    public m53(int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = bArr;
        this.e = i5;
        this.f = i6;
    }

    public static String b(int i2) {
        return i2 != -1 ? i2 != 1 ? i2 != 2 ? wj6.h(i2, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String c(int i2) {
        return i2 != -1 ? i2 != 6 ? i2 != 1 ? i2 != 2 ? wj6.h(i2, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String d(int i2) {
        return i2 != -1 ? i2 != 10 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 6 ? i2 != 7 ? wj6.h(i2, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r1 = r4.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001f, code lost:
        r3 = r4.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0027, code lost:
        r4 = r4.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r3 = r4.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean f(defpackage.m53 r4) {
        /*
            r0 = 1
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 2
            r2 = -1
            int r3 = r4.a
            if (r3 == r2) goto L_0x000e
            if (r3 == r0) goto L_0x000e
            if (r3 != r1) goto L_0x002e
        L_0x000e:
            int r3 = r4.b
            if (r3 == r2) goto L_0x0014
            if (r3 != r1) goto L_0x002e
        L_0x0014:
            int r1 = r4.c
            if (r1 == r2) goto L_0x001b
            r3 = 3
            if (r1 != r3) goto L_0x002e
        L_0x001b:
            byte[] r1 = r4.d
            if (r1 != 0) goto L_0x002e
            r1 = 8
            int r3 = r4.f
            if (r3 == r2) goto L_0x0027
            if (r3 != r1) goto L_0x002e
        L_0x0027:
            int r4 = r4.e
            if (r4 == r2) goto L_0x002f
            if (r4 != r1) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m53.f(m53):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = r1.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean g(defpackage.m53 r1) {
        /*
            if (r1 == 0) goto L_0x000c
            r0 = 7
            int r1 = r1.c
            if (r1 == r0) goto L_0x000a
            r0 = 6
            if (r1 != r0) goto L_0x000c
        L_0x000a:
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m53.g(m53):boolean");
    }

    public static int h(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int i(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 4) {
            return 10;
        }
        if (i2 == 13) {
            return 2;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [k53, java.lang.Object] */
    public final k53 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        return obj;
    }

    public final boolean e() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m53.class != obj.getClass()) {
            return false;
        }
        m53 m53 = (m53) obj;
        return this.a == m53.a && this.b == m53.b && this.c == m53.c && Arrays.equals(this.d, m53.d) && this.e == m53.e && this.f == m53.f;
    }

    public final int hashCode() {
        if (this.g == 0) {
            this.g = ((((Arrays.hashCode(this.d) + ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
        }
        return this.g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(c(this.a));
        sb.append(", ");
        sb.append(b(this.b));
        sb.append(", ");
        sb.append(d(this.c));
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(", ");
        String str2 = "NA";
        int i2 = this.e;
        if (i2 != -1) {
            str = i2 + "bit Luma";
        } else {
            str = str2;
        }
        sb.append(str);
        sb.append(", ");
        int i3 = this.f;
        if (i3 != -1) {
            str2 = i3 + "bit Chroma";
        }
        return wj6.n(sb, str2, ")");
    }
}
