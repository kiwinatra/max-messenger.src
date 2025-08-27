package defpackage;

import kotlin.collections.ArraysKt;

/* renamed from: dg4  reason: default package */
public final class dg4 implements g97 {
    public static final byte[] b = {-1, -40, -1};
    public static final int c = 3;
    public static final byte[] d = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final int e = 8;
    public static final byte[] f = te8.d("GIF87a");
    public static final byte[] g = te8.d("GIF89a");
    public static final byte[] h;
    public static final int i;
    public static final byte[] j = {0, 0, 1, 0};
    public static final int k = 4;
    public static final byte[] l = te8.d("ftyp");
    public static final byte[][] m = {te8.d("heic"), te8.d("heix"), te8.d("hevc"), te8.d("hevx"), te8.d("mif1"), te8.d("msf1")};
    public static final byte[] n = {73, 73, 42, 0};
    public static final byte[] o = {77, 77, 0, 42};
    public static final int p = 4;
    public static final byte[] q = {3, 0, 8, 0};
    public static final byte[] r = te8.d("ftyp");
    public static final byte[] s = te8.d("avif");
    public final int a;

    static {
        byte[] d2 = te8.d("BM");
        h = d2;
        i = d2.length;
    }

    public dg4() {
        Comparable maxOrNull = ArraysKt.maxOrNull((T[]) (Comparable[]) new Integer[]{21, 20, Integer.valueOf(c), Integer.valueOf(e), 6, Integer.valueOf(i), Integer.valueOf(k), 12, 4, 12});
        if (maxOrNull != null) {
            this.a = ((Number) maxOrNull).intValue();
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.h97 a(int r11, byte[] r12) {
        /*
            r10 = this;
            boolean r10 = defpackage.ylg.b(r11, r12)
            h97 r0 = defpackage.h97.c
            r1 = 0
            r2 = 16
            r3 = 2
            r4 = 12
            r5 = 1
            if (r10 == 0) goto L_0x006e
            boolean r10 = defpackage.ylg.b(r11, r12)
            if (r10 == 0) goto L_0x0062
            byte[] r10 = defpackage.ylg.e
            boolean r10 = defpackage.ylg.c(r12, r10, r4)
            if (r10 == 0) goto L_0x0020
            h97 r0 = defpackage.eg4.f
            goto L_0x0061
        L_0x0020:
            byte[] r10 = defpackage.ylg.f
            boolean r10 = defpackage.ylg.c(r12, r10, r4)
            if (r10 == 0) goto L_0x002b
            h97 r0 = defpackage.eg4.g
            goto L_0x0061
        L_0x002b:
            r10 = 21
            if (r11 < r10) goto L_0x0061
            byte[] r10 = defpackage.ylg.g
            boolean r11 = defpackage.ylg.c(r12, r10, r4)
            if (r11 == 0) goto L_0x0061
            boolean r11 = defpackage.ylg.c(r12, r10, r4)
            r0 = 20
            byte r6 = r12[r0]
            r6 = r6 & r3
            if (r6 != r3) goto L_0x0044
            r3 = r5
            goto L_0x0045
        L_0x0044:
            r3 = r1
        L_0x0045:
            if (r11 == 0) goto L_0x004c
            if (r3 == 0) goto L_0x004c
            h97 r0 = defpackage.eg4.j
            goto L_0x0061
        L_0x004c:
            boolean r10 = defpackage.ylg.c(r12, r10, r4)
            byte r11 = r12[r0]
            r11 = r11 & r2
            if (r11 != r2) goto L_0x0056
            r1 = r5
        L_0x0056:
            if (r10 == 0) goto L_0x005e
            if (r1 == 0) goto L_0x005e
            h97 r10 = defpackage.eg4.i
        L_0x005c:
            r0 = r10
            goto L_0x0061
        L_0x005e:
            h97 r10 = defpackage.eg4.h
            goto L_0x005c
        L_0x0061:
            return r0
        L_0x0062:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Check failed."
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x006e:
            byte[] r10 = b
            r6 = 3
            if (r11 < r6) goto L_0x007c
            boolean r10 = defpackage.te8.p(r12, r10, r1)
            if (r10 == 0) goto L_0x007c
            h97 r10 = defpackage.eg4.a
            return r10
        L_0x007c:
            byte[] r10 = d
            r7 = 8
            if (r11 < r7) goto L_0x008b
            boolean r10 = defpackage.te8.p(r12, r10, r1)
            if (r10 == 0) goto L_0x008b
            h97 r10 = defpackage.eg4.b
            return r10
        L_0x008b:
            r10 = 6
            if (r11 >= r10) goto L_0x008f
            goto L_0x00a1
        L_0x008f:
            byte[] r10 = f
            boolean r10 = defpackage.te8.p(r12, r10, r1)
            if (r10 != 0) goto L_0x0150
            byte[] r10 = g
            boolean r10 = defpackage.te8.p(r12, r10, r1)
            if (r10 == 0) goto L_0x00a1
            goto L_0x0150
        L_0x00a1:
            byte[] r10 = h
            int r8 = r10.length
            if (r11 >= r8) goto L_0x00a8
            r10 = r1
            goto L_0x00ac
        L_0x00a8:
            boolean r10 = defpackage.te8.p(r12, r10, r1)
        L_0x00ac:
            if (r10 == 0) goto L_0x00b1
            h97 r10 = defpackage.eg4.d
            return r10
        L_0x00b1:
            byte[] r10 = j
            int r8 = r10.length
            if (r11 >= r8) goto L_0x00b8
            r10 = r1
            goto L_0x00bc
        L_0x00b8:
            boolean r10 = defpackage.te8.p(r12, r10, r1)
        L_0x00bc:
            if (r10 == 0) goto L_0x00c1
            h97 r10 = defpackage.eg4.e
            return r10
        L_0x00c1:
            r10 = 4
            if (r11 >= r4) goto L_0x00c6
        L_0x00c4:
            r2 = r1
            goto L_0x00f5
        L_0x00c6:
            int r8 = r12.length
            if (r8 >= r10) goto L_0x00cb
            r2 = -1
            goto L_0x00e3
        L_0x00cb:
            byte r8 = r12[r1]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 24
            byte r9 = r12[r5]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r2 = r9 << 16
            r2 = r2 | r8
            byte r3 = r12[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r7
            r2 = r2 | r3
            byte r3 = r12[r6]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r2 = r2 | r3
        L_0x00e3:
            if (r2 >= r7) goto L_0x00e6
            goto L_0x00c4
        L_0x00e6:
            byte[] r2 = r
            boolean r2 = defpackage.te8.p(r12, r2, r10)
            if (r2 != 0) goto L_0x00ef
            goto L_0x00c4
        L_0x00ef:
            byte[] r2 = s
            boolean r2 = defpackage.te8.p(r12, r2, r7)
        L_0x00f5:
            if (r2 == 0) goto L_0x00fa
            h97 r10 = defpackage.eg4.n
            return r10
        L_0x00fa:
            if (r11 >= r4) goto L_0x00fe
        L_0x00fc:
            r2 = r1
            goto L_0x011f
        L_0x00fe:
            byte r2 = r12[r6]
            if (r2 >= r7) goto L_0x0103
            goto L_0x00fc
        L_0x0103:
            byte[] r2 = l
            boolean r2 = defpackage.te8.p(r12, r2, r10)
            if (r2 != 0) goto L_0x010c
            goto L_0x00fc
        L_0x010c:
            byte[][] r2 = m
            int r3 = r2.length
            r4 = r1
        L_0x0110:
            if (r4 >= r3) goto L_0x00fc
            r6 = r2[r4]
            boolean r6 = defpackage.te8.p(r12, r6, r7)
            if (r6 == 0) goto L_0x011c
            r2 = r5
            goto L_0x011f
        L_0x011c:
            int r4 = r4 + 1
            goto L_0x0110
        L_0x011f:
            if (r2 == 0) goto L_0x0124
            h97 r10 = defpackage.eg4.k
            return r10
        L_0x0124:
            if (r11 < r10) goto L_0x0130
            byte[] r10 = q
            boolean r10 = defpackage.te8.p(r12, r10, r1)
            if (r10 == 0) goto L_0x0130
            r10 = r5
            goto L_0x0131
        L_0x0130:
            r10 = r1
        L_0x0131:
            if (r10 == 0) goto L_0x0136
            h97 r10 = defpackage.eg4.m
            return r10
        L_0x0136:
            int r10 = p
            if (r11 < r10) goto L_0x014b
            byte[] r10 = n
            boolean r10 = defpackage.te8.p(r12, r10, r1)
            if (r10 != 0) goto L_0x014a
            byte[] r10 = o
            boolean r10 = defpackage.te8.p(r12, r10, r1)
            if (r10 == 0) goto L_0x014b
        L_0x014a:
            r1 = r5
        L_0x014b:
            if (r1 == 0) goto L_0x014f
            h97 r0 = defpackage.eg4.l
        L_0x014f:
            return r0
        L_0x0150:
            h97 r10 = defpackage.eg4.c
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dg4.a(int, byte[]):h97");
    }

    public final int b() {
        return this.a;
    }
}
