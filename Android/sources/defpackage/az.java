package defpackage;

import android.util.Pair;
import kotlin.uuid.Uuid;

/* renamed from: az  reason: default package */
public abstract class az {
    public static final byte[] a = "OpusHead".getBytes(x22.c);

    static {
        int i = t0g.a;
    }

    public static Pair a(int i, g1g g1g) {
        g1g.H(i + 12);
        g1g.I(1);
        b(g1g);
        g1g.I(2);
        int v = g1g.v();
        if ((v & Uuid.SIZE_BITS) != 0) {
            g1g.I(2);
        }
        if ((v & 64) != 0) {
            g1g.I(g1g.A());
        }
        if ((v & 32) != 0) {
            g1g.I(2);
        }
        g1g.I(1);
        b(g1g);
        String d = uq9.d(g1g.v());
        if ("audio/mpeg".equals(d) || "audio/vnd.dts".equals(d) || "audio/vnd.dts.hd".equals(d)) {
            return Pair.create(d, (Object) null);
        }
        g1g.I(12);
        g1g.I(1);
        int b = b(g1g);
        byte[] bArr = new byte[b];
        g1g.g(0, bArr, b);
        return Pair.create(d, bArr);
    }

    public static int b(g1g g1g) {
        int v = g1g.v();
        int i = v & 127;
        while ((v & Uuid.SIZE_BITS) == 128) {
            v = g1g.v();
            i = (i << 7) | (v & 127);
        }
        return i;
    }

    public static Pair c(g1g g1g, int i, int i2) {
        Pair pair;
        Integer num;
        opf opf;
        int i3;
        int i4;
        byte[] bArr;
        g1g g1g2 = g1g;
        int i5 = g1g2.b;
        while (i5 - i < i2) {
            g1g2.H(i5);
            int h = g1g.h();
            boolean z = false;
            te8.e("childAtomSize must be positive", h > 0);
            if (g1g.h() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                String str = null;
                Integer num2 = null;
                while (i6 - i5 < h) {
                    g1g2.H(i6);
                    int h2 = g1g.h();
                    int h3 = g1g.h();
                    if (h3 == 1718775137) {
                        num2 = Integer.valueOf(g1g.h());
                    } else if (h3 == 1935894637) {
                        g1g2.I(4);
                        str = g1g2.t(4, x22.c);
                    } else if (h3 == 1935894633) {
                        i8 = i6;
                        i7 = h2;
                    }
                    i6 += h2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    te8.e("frma atom is mandatory", num2 != null);
                    te8.e("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = num2;
                            opf = null;
                            break;
                        }
                        g1g2.H(i9);
                        int h4 = g1g.h();
                        if (g1g.h() == 1952804451) {
                            int x = ty.x(g1g.h());
                            g1g2.I(1);
                            if (x == 0) {
                                g1g2.I(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int v = g1g.v();
                                i4 = v & 15;
                                i3 = (v & 240) >> 4;
                            }
                            boolean z2 = g1g.v() == 1;
                            int v2 = g1g.v();
                            byte[] bArr2 = new byte[16];
                            g1g2.g(0, bArr2, 16);
                            if (!z2 || v2 != 0) {
                                bArr = null;
                            } else {
                                int v3 = g1g.v();
                                byte[] bArr3 = new byte[v3];
                                g1g2.g(0, bArr3, v3);
                                bArr = bArr3;
                            }
                            num = num2;
                            opf = new opf(z2, str, v2, bArr2, i3, i4, bArr);
                        } else {
                            Integer num3 = num2;
                            i9 += h4;
                        }
                    }
                    if (opf != null) {
                        z = true;
                    }
                    te8.e("tenc atom is mandatory", z);
                    int i10 = t0g.a;
                    pair = Pair.create(num, opf);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    return pair;
                }
            }
            i5 += h;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x043b  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x045f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.aqf d(defpackage.kpf r41, defpackage.py r42, defpackage.lp6 r43) {
        /*
            r1 = r41
            r0 = r42
            r2 = r43
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            ry r3 = r0.A(r3)
            ca6 r4 = r1.f
            if (r3 == 0) goto L_0x0017
            ila r6 = new ila
            r6.<init>((defpackage.ry) r3, (defpackage.ca6) r4)
            goto L_0x0025
        L_0x0017:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            ry r3 = r0.A(r3)
            if (r3 == 0) goto L_0x0517
            zy r6 = new zy
            r6.<init>((defpackage.ry) r3)
        L_0x0025:
            int r3 = r6.b()
            r7 = 0
            if (r3 != 0) goto L_0x0040
            aqf r9 = new aqf
            long[] r2 = new long[r7]
            int[] r3 = new int[r7]
            long[] r5 = new long[r7]
            int[] r6 = new int[r7]
            r7 = 0
            r4 = 0
            r0 = r9
            r1 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0040:
            r8 = 1937007471(0x7374636f, float:1.9362445E31)
            ry r8 = r0.A(r8)
            r9 = 1
            if (r8 != 0) goto L_0x0056
            r8 = 1668232756(0x636f3634, float:4.4126776E21)
            ry r8 = r0.A(r8)
            r8.getClass()
            r10 = r9
            goto L_0x0057
        L_0x0056:
            r10 = r7
        L_0x0057:
            r11 = 1937011555(0x73747363, float:1.9367382E31)
            ry r11 = r0.A(r11)
            r11.getClass()
            r12 = 1937011827(0x73747473, float:1.9367711E31)
            ry r12 = r0.A(r12)
            r12.getClass()
            r13 = 1937011571(0x73747373, float:1.9367401E31)
            ry r13 = r0.A(r13)
            if (r13 == 0) goto L_0x0077
            g1g r13 = r13.c
            goto L_0x0078
        L_0x0077:
            r13 = 0
        L_0x0078:
            r14 = 1668576371(0x63747473, float:4.5093966E21)
            ry r0 = r0.A(r14)
            if (r0 == 0) goto L_0x0084
            g1g r0 = r0.c
            goto L_0x0085
        L_0x0084:
            r0 = 0
        L_0x0085:
            uy r14 = new uy
            g1g r11 = r11.c
            g1g r8 = r8.c
            r14.<init>((defpackage.g1g) r11, (defpackage.g1g) r8, (boolean) r10)
            g1g r8 = r12.c
            r10 = 12
            r8.H(r10)
            int r11 = r8.y()
            int r11 = r11 - r9
            int r12 = r8.y()
            int r15 = r8.y()
            if (r0 == 0) goto L_0x00ac
            r0.H(r10)
            int r16 = r0.y()
            goto L_0x00ae
        L_0x00ac:
            r16 = r7
        L_0x00ae:
            r5 = -1
            if (r13 == 0) goto L_0x00c5
            r13.H(r10)
            int r10 = r13.y()
            if (r10 <= 0) goto L_0x00c1
            int r17 = r13.y()
            int r17 = r17 + -1
            goto L_0x00c8
        L_0x00c1:
            r17 = r5
            r13 = 0
            goto L_0x00c8
        L_0x00c5:
            r17 = r5
            r10 = r7
        L_0x00c8:
            int r7 = r6.a()
            java.lang.String r9 = r4.Z
            if (r7 == r5) goto L_0x00f2
            java.lang.String r5 = "audio/raw"
            boolean r5 = r5.equals(r9)
            if (r5 != 0) goto L_0x00e8
            java.lang.String r5 = "audio/g711-mlaw"
            boolean r5 = r5.equals(r9)
            if (r5 != 0) goto L_0x00e8
            java.lang.String r5 = "audio/g711-alaw"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x00f2
        L_0x00e8:
            if (r11 != 0) goto L_0x00f2
            if (r16 != 0) goto L_0x00f2
            if (r10 != 0) goto L_0x00f2
            r42 = r10
            r5 = 1
            goto L_0x00f5
        L_0x00f2:
            r42 = r10
            r5 = 0
        L_0x00f5:
            if (r5 == 0) goto L_0x018c
            int r0 = r14.b
            long[] r5 = new long[r0]
            int[] r6 = new int[r0]
        L_0x00fd:
            boolean r8 = r14.a()
            if (r8 == 0) goto L_0x010e
            int r8 = r14.c
            long r11 = r14.e
            r5[r8] = r11
            int r11 = r14.d
            r6[r8] = r11
            goto L_0x00fd
        L_0x010e:
            long r11 = (long) r15
            r8 = 8192(0x2000, float:1.14794E-41)
            int r8 = r8 / r7
            r13 = 0
            r14 = 0
        L_0x0114:
            if (r13 >= r0) goto L_0x0120
            r15 = r6[r13]
            int r15 = defpackage.t0g.g(r15, r8)
            int r14 = r14 + r15
            int r13 = r13 + 1
            goto L_0x0114
        L_0x0120:
            long[] r13 = new long[r14]
            int[] r15 = new int[r14]
            long[] r9 = new long[r14]
            int[] r10 = new int[r14]
            r2 = 0
            r14 = 0
            r16 = 0
            r17 = 0
        L_0x012e:
            if (r14 >= r0) goto L_0x017e
            r22 = r6[r14]
            r23 = r5[r14]
            r39 = r17
            r17 = r0
            r0 = r16
            r16 = r39
            r40 = r22
            r22 = r5
            r5 = r40
        L_0x0142:
            if (r5 <= 0) goto L_0x016d
            int r25 = java.lang.Math.min(r8, r5)
            r13[r16] = r23
            r42 = r6
            int r6 = r7 * r25
            r15[r16] = r6
            int r0 = java.lang.Math.max(r0, r6)
            r26 = r7
            long r6 = (long) r2
            long r6 = r6 * r11
            r9[r16] = r6
            r6 = 1
            r10[r16] = r6
            r6 = r15[r16]
            long r6 = (long) r6
            long r23 = r23 + r6
            int r2 = r2 + r25
            int r5 = r5 - r25
            int r16 = r16 + 1
            r6 = r42
            r7 = r26
            goto L_0x0142
        L_0x016d:
            r42 = r6
            r26 = r7
            int r14 = r14 + 1
            r5 = r22
            r39 = r16
            r16 = r0
            r0 = r17
            r17 = r39
            goto L_0x012e
        L_0x017e:
            long r5 = (long) r2
            long r11 = r11 * r5
            r0 = r3
            r22 = r4
            r5 = r9
            r6 = r10
            r2 = r13
            r3 = r15
            r4 = r16
        L_0x0189:
            r13 = r11
            goto L_0x029e
        L_0x018c:
            long[] r2 = new long[r3]
            int[] r5 = new int[r3]
            long[] r7 = new long[r3]
            int[] r9 = new int[r3]
            r10 = r42
            r22 = r4
            r24 = r8
            r4 = r17
            r1 = 0
            r8 = 0
            r17 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r28 = 0
        L_0x01a8:
            if (r1 >= r3) goto L_0x025a
            r29 = r28
            r28 = 1
        L_0x01ae:
            if (r17 != 0) goto L_0x01cb
            boolean r28 = r14.a()
            if (r28 == 0) goto L_0x01cb
            r42 = r11
            r31 = r12
            long r11 = r14.e
            r32 = r3
            int r3 = r14.d
            r17 = r3
            r29 = r11
            r12 = r31
            r3 = r32
            r11 = r42
            goto L_0x01ae
        L_0x01cb:
            r32 = r3
            r42 = r11
            r31 = r12
            if (r28 != 0) goto L_0x01e8
            long[] r2 = java.util.Arrays.copyOf(r2, r1)
            int[] r5 = java.util.Arrays.copyOf(r5, r1)
            long[] r7 = java.util.Arrays.copyOf(r7, r1)
            int[] r9 = java.util.Arrays.copyOf(r9, r1)
            r3 = r1
        L_0x01e4:
            r1 = r27
            goto L_0x0263
        L_0x01e8:
            if (r0 == 0) goto L_0x01fb
        L_0x01ea:
            if (r23 != 0) goto L_0x01f9
            if (r16 <= 0) goto L_0x01f9
            int r23 = r0.y()
            int r27 = r0.h()
            int r16 = r16 + -1
            goto L_0x01ea
        L_0x01f9:
            int r23 = r23 + -1
        L_0x01fb:
            r3 = r27
            r2[r1] = r29
            int r11 = r6.c()
            r5[r1] = r11
            if (r11 <= r8) goto L_0x0208
            r8 = r11
        L_0x0208:
            long r11 = (long) r3
            long r11 = r25 + r11
            r7[r1] = r11
            if (r13 != 0) goto L_0x0211
            r11 = 1
            goto L_0x0212
        L_0x0211:
            r11 = 0
        L_0x0212:
            r9[r1] = r11
            if (r1 != r4) goto L_0x0225
            r11 = 1
            r9[r1] = r11
            int r10 = r10 + -1
            if (r10 <= 0) goto L_0x0225
            r13.getClass()
            int r4 = r13.y()
            int r4 = r4 - r11
        L_0x0225:
            long r11 = (long) r15
            long r25 = r25 + r11
            int r12 = r31 + -1
            if (r12 != 0) goto L_0x0241
            if (r42 <= 0) goto L_0x0241
            int r11 = r24.y()
            int r12 = r24.h()
            int r15 = r42 + -1
            r28 = r2
            r39 = r12
            r12 = r11
            r11 = r15
            r15 = r39
            goto L_0x0245
        L_0x0241:
            r11 = r42
            r28 = r2
        L_0x0245:
            r2 = r5[r1]
            r27 = r3
            long r2 = (long) r2
            long r2 = r29 + r2
            int r17 = r17 + -1
            int r1 = r1 + 1
            r39 = r2
            r2 = r28
            r28 = r39
            r3 = r32
            goto L_0x01a8
        L_0x025a:
            r28 = r2
            r32 = r3
            r42 = r11
            r31 = r12
            goto L_0x01e4
        L_0x0263:
            long r11 = (long) r1
            long r11 = r25 + r11
            if (r0 == 0) goto L_0x0278
        L_0x0268:
            if (r16 <= 0) goto L_0x0278
            int r1 = r0.y()
            if (r1 == 0) goto L_0x0272
            r0 = 0
            goto L_0x0279
        L_0x0272:
            r0.h()
            int r16 = r16 + -1
            goto L_0x0268
        L_0x0278:
            r0 = 1
        L_0x0279:
            if (r10 != 0) goto L_0x0285
            if (r31 != 0) goto L_0x0285
            if (r17 != 0) goto L_0x0285
            if (r42 != 0) goto L_0x0285
            if (r23 != 0) goto L_0x0285
            if (r0 != 0) goto L_0x0297
        L_0x0285:
            if (r0 != 0) goto L_0x028a
            java.lang.String r0 = ", ctts invalid"
            goto L_0x028c
        L_0x028a:
            java.lang.String r0 = ""
        L_0x028c:
            int r0 = r0.length()
            int r0 = r0 + 262
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
        L_0x0297:
            r0 = r3
            r3 = r5
            r5 = r7
            r4 = r8
            r6 = r9
            goto L_0x0189
        L_0x029e:
            r9 = 1000000(0xf4240, double:4.940656E-318)
            r1 = r41
            long r11 = r1.c
            r7 = r13
            long r7 = defpackage.t0g.J(r7, r9, r11)
            long r9 = r1.c
            long[] r11 = r1.h
            if (r11 != 0) goto L_0x02bc
            defpackage.t0g.K(r5, r9)
            aqf r9 = new aqf
            r0 = r9
            r1 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x02bc:
            int r7 = r11.length
            int r8 = r1.b
            long[] r12 = r1.i
            r15 = 1
            if (r7 != r15) goto L_0x0371
            if (r8 != r15) goto L_0x0371
            int r7 = r5.length
            r15 = 2
            if (r7 < r15) goto L_0x0371
            r12.getClass()
            r7 = 0
            r15 = r12[r7]
            r23 = r11[r7]
            r17 = r8
            long r7 = r1.c
            r42 = r3
            r29 = r4
            long r3 = r1.d
            r25 = r7
            r27 = r3
            long r3 = defpackage.t0g.J(r23, r25, r27)
            long r3 = r3 + r15
            int r7 = r5.length
            r8 = 1
            int r7 = r7 - r8
            r8 = 4
            r23 = r0
            r0 = 0
            int r24 = defpackage.t0g.j(r8, r0, r7)
            r25 = r12
            int r12 = r5.length
            int r12 = r12 - r8
            int r7 = defpackage.t0g.j(r12, r0, r7)
            r26 = r5[r0]
            int r0 = (r26 > r15 ? 1 : (r26 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x0310
            r30 = r5[r24]
            int r0 = (r15 > r30 ? 1 : (r15 == r30 ? 0 : -1))
            if (r0 >= 0) goto L_0x0310
            r7 = r5[r7]
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0310
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x0310
            r0 = 1
            goto L_0x0311
        L_0x0310:
            r0 = 0
        L_0x0311:
            if (r0 == 0) goto L_0x036f
            long r30 = r13 - r3
            long r32 = r15 - r26
            r0 = r22
            int r3 = r0.I0
            long r3 = (long) r3
            long r7 = r1.c
            r34 = r3
            r36 = r7
            long r3 = defpackage.t0g.J(r32, r34, r36)
            int r0 = r0.I0
            long r7 = (long) r0
            r15 = r13
            long r12 = r1.c
            r32 = r7
            r34 = r12
            long r7 = defpackage.t0g.J(r30, r32, r34)
            r12 = 0
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x033e
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x037c
        L_0x033e:
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x037c
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x037c
            int r0 = (int) r3
            r3 = r43
            r3.a = r0
            int r0 = (int) r7
            r3.b = r0
            defpackage.t0g.K(r5, r9)
            r0 = 0
            r12 = r11[r0]
            r14 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r1.d
            r16 = r3
            long r7 = defpackage.t0g.J(r12, r14, r16)
            aqf r9 = new aqf
            r0 = r9
            r1 = r41
            r3 = r42
            r4 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x036f:
            r15 = r13
            goto L_0x037c
        L_0x0371:
            r23 = r0
            r42 = r3
            r29 = r4
            r17 = r8
            r25 = r12
            goto L_0x036f
        L_0x037c:
            int r0 = r11.length
            r3 = 1
            if (r0 != r3) goto L_0x03c2
            r0 = 0
            r3 = r11[r0]
            r7 = 0
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x03be
            r25.getClass()
            r3 = r25[r0]
            r7 = r0
        L_0x038f:
            int r0 = r5.length
            if (r7 >= r0) goto L_0x03a6
            r8 = r5[r7]
            long r17 = r8 - r3
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r1.c
            r21 = r8
            long r8 = defpackage.t0g.J(r17, r19, r21)
            r5[r7] = r8
            int r7 = r7 + 1
            goto L_0x038f
        L_0x03a6:
            long r8 = r15 - r3
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r1.c
            long r7 = defpackage.t0g.J(r8, r10, r12)
            aqf r9 = new aqf
            r0 = r9
            r1 = r41
            r3 = r42
            r4 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x03be:
            r4 = r17
            r3 = 1
            goto L_0x03c5
        L_0x03c2:
            r0 = 0
            r4 = r17
        L_0x03c5:
            if (r4 != r3) goto L_0x03c9
            r3 = 1
            goto L_0x03ca
        L_0x03c9:
            r3 = r0
        L_0x03ca:
            int r4 = r11.length
            int[] r4 = new int[r4]
            int r7 = r11.length
            int[] r7 = new int[r7]
            r25.getClass()
            r8 = r0
            r9 = r8
            r10 = r9
            r12 = r10
        L_0x03d7:
            int r13 = r11.length
            if (r8 >= r13) goto L_0x0433
            r13 = r25[r8]
            r15 = -1
            int r15 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r15 == 0) goto L_0x0428
            r30 = r11[r8]
            r15 = r11
            r16 = r12
            long r11 = r1.c
            r43 = r9
            r17 = r10
            long r9 = r1.d
            r32 = r11
            r34 = r9
            long r9 = defpackage.t0g.J(r30, r32, r34)
            r11 = 1
            int r12 = defpackage.t0g.f(r5, r13, r11)
            r4[r8] = r12
            long r13 = r13 + r9
            int r9 = defpackage.t0g.b(r5, r13, r3)
            r7[r8] = r9
        L_0x0405:
            r9 = r4[r8]
            r10 = r7[r8]
            if (r9 >= r10) goto L_0x0415
            r12 = r6[r9]
            r12 = r12 & r11
            if (r12 != 0) goto L_0x0415
            int r9 = r9 + 1
            r4[r8] = r9
            goto L_0x0405
        L_0x0415:
            int r12 = r10 - r9
            int r12 = r12 + r17
            r13 = r16
            if (r13 == r9) goto L_0x041f
            r9 = r11
            goto L_0x0420
        L_0x041f:
            r9 = r0
        L_0x0420:
            r9 = r43 | r9
            r39 = r12
            r12 = r10
            r10 = r39
            goto L_0x042f
        L_0x0428:
            r43 = r9
            r17 = r10
            r15 = r11
            r13 = r12
            r11 = 1
        L_0x042f:
            int r8 = r8 + 1
            r11 = r15
            goto L_0x03d7
        L_0x0433:
            r43 = r9
            r15 = r11
            r8 = r23
            r11 = 1
            if (r10 == r8) goto L_0x043d
            r9 = r11
            goto L_0x043e
        L_0x043d:
            r9 = r0
        L_0x043e:
            r3 = r43 | r9
            if (r3 == 0) goto L_0x0445
            long[] r8 = new long[r10]
            goto L_0x0446
        L_0x0445:
            r8 = r2
        L_0x0446:
            if (r3 == 0) goto L_0x044b
            int[] r9 = new int[r10]
            goto L_0x044d
        L_0x044b:
            r9 = r42
        L_0x044d:
            if (r3 == 0) goto L_0x0451
            r29 = r0
        L_0x0451:
            if (r3 == 0) goto L_0x0456
            int[] r11 = new int[r10]
            goto L_0x0457
        L_0x0456:
            r11 = r6
        L_0x0457:
            long[] r10 = new long[r10]
            r12 = r0
            r22 = 0
        L_0x045c:
            int r13 = r15.length
            if (r0 >= r13) goto L_0x04fa
            r26 = r25[r0]
            r13 = r4[r0]
            r14 = r7[r0]
            r19 = r4
            if (r3 == 0) goto L_0x0479
            int r4 = r14 - r13
            java.lang.System.arraycopy(r2, r13, r8, r12, r4)
            r16 = r15
            r15 = r42
            java.lang.System.arraycopy(r15, r13, r9, r12, r4)
            java.lang.System.arraycopy(r6, r13, r11, r12, r4)
            goto L_0x047d
        L_0x0479:
            r16 = r15
            r15 = r42
        L_0x047d:
            r4 = r13
            r13 = r29
        L_0x0480:
            if (r4 >= r14) goto L_0x04d5
            r17 = 1000000(0xf4240, double:4.940656E-318)
            r42 = r6
            r24 = r7
            long r6 = r1.d
            r30 = r2
            r2 = r13
            r28 = r14
            r13 = r22
            r31 = r15
            r32 = r16
            r15 = r17
            r17 = r6
            long r6 = defpackage.t0g.J(r13, r15, r17)
            r13 = r5[r4]
            long r13 = r13 - r26
            r16 = r4
            r15 = r5
            r4 = 0
            long r33 = java.lang.Math.max(r4, r13)
            r35 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = r1.c
            r37 = r13
            long r13 = defpackage.t0g.J(r33, r35, r37)
            long r6 = r6 + r13
            r10[r12] = r6
            if (r3 == 0) goto L_0x04c1
            r6 = r9[r12]
            if (r6 <= r2) goto L_0x04c1
            r2 = r31[r16]
        L_0x04c1:
            r13 = r2
            int r12 = r12 + 1
            int r2 = r16 + 1
            r6 = r42
            r4 = r2
            r5 = r15
            r7 = r24
            r14 = r28
            r2 = r30
            r15 = r31
            r16 = r32
            goto L_0x0480
        L_0x04d5:
            r30 = r2
            r42 = r6
            r24 = r7
            r2 = r13
            r31 = r15
            r32 = r16
            r15 = r5
            r4 = 0
            r6 = r32[r0]
            long r22 = r22 + r6
            int r0 = r0 + 1
            r6 = r42
            r29 = r2
            r5 = r15
            r4 = r19
            r7 = r24
            r2 = r30
            r42 = r31
            r15 = r32
            goto L_0x045c
        L_0x04fa:
            r15 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r1.d
            r13 = r22
            r17 = r2
            long r12 = defpackage.t0g.J(r13, r15, r17)
            aqf r14 = new aqf
            r0 = r14
            r1 = r41
            r2 = r8
            r3 = r9
            r4 = r29
            r5 = r10
            r6 = r11
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r14
        L_0x0517:
            java.lang.String r0 = "Track has no sample table size information"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az.d(kpf, py, lp6):aqf");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d8, code lost:
        if (r13 == 0) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00da, code lost:
        r13 = -9223372036854775807L;
     */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x07e2  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x07e7  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x081d  */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x086c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:615:0x0cce  */
    /* JADX WARNING: Removed duplicated region for block: B:638:0x0d40  */
    /* JADX WARNING: Removed duplicated region for block: B:641:0x0d47  */
    /* JADX WARNING: Removed duplicated region for block: B:642:0x0d49  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList e(defpackage.py r70, defpackage.lp6 r71, long r72, defpackage.xv4 r74, boolean r75, boolean r76, defpackage.yi6 r77) {
        /*
            r0 = r70
            r1 = r74
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4 = 0
        L_0x000a:
            java.util.ArrayList r5 = r0.v
            int r6 = r5.size()
            if (r4 >= r6) goto L_0x0dac
            java.lang.Object r5 = r5.get(r4)
            py r5 = (defpackage.py) r5
            int r6 = r5.b
            r7 = 1953653099(0x7472616b, float:7.681346E31)
            if (r6 == r7) goto L_0x0027
            r3 = r71
            r0 = r77
            r31 = r4
            goto L_0x0da4
        L_0x0027:
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            ry r6 = r0.A(r6)
            r6.getClass()
            r7 = 1835297121(0x6d646961, float:4.4181236E27)
            py r8 = r5.z(r7)
            r8.getClass()
            r9 = 1751411826(0x68646c72, float:4.3148E24)
            ry r9 = r8.A(r9)
            r9.getClass()
            g1g r9 = r9.c
            r10 = 16
            r9.H(r10)
            int r9 = r9.h()
            r11 = 1936684398(0x736f756e, float:1.8971874E31)
            r12 = -1
            if (r9 != r11) goto L_0x0058
            r9 = 1
            goto L_0x007e
        L_0x0058:
            r11 = 1986618469(0x76696465, float:1.1834389E33)
            if (r9 != r11) goto L_0x005f
            r9 = 2
            goto L_0x007e
        L_0x005f:
            r11 = 1952807028(0x74657874, float:7.272211E31)
            if (r9 == r11) goto L_0x007d
            r11 = 1935832172(0x7362746c, float:1.7941596E31)
            if (r9 == r11) goto L_0x007d
            r11 = 1937072756(0x73756274, float:1.944137E31)
            if (r9 == r11) goto L_0x007d
            r11 = 1668047728(0x636c6370, float:4.3605968E21)
            if (r9 != r11) goto L_0x0074
            goto L_0x007d
        L_0x0074:
            r11 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r9 != r11) goto L_0x007b
            r9 = 5
            goto L_0x007e
        L_0x007b:
            r9 = r12
            goto L_0x007e
        L_0x007d:
            r9 = 3
        L_0x007e:
            if (r9 != r12) goto L_0x0089
            r0 = r77
            r32 = r2
            r31 = r4
            r15 = 0
            goto L_0x0d6e
        L_0x0089:
            r15 = 1953196132(0x746b6864, float:7.46037E31)
            ry r15 = r5.A(r15)
            r15.getClass()
            g1g r15 = r15.c
            r7 = 8
            r15.H(r7)
            int r20 = r15.h()
            int r20 = defpackage.ty.x(r20)
            if (r20 != 0) goto L_0x00a6
            r3 = r7
            goto L_0x00a7
        L_0x00a6:
            r3 = r10
        L_0x00a7:
            r15.I(r3)
            int r3 = r15.h()
            r13 = 4
            r15.I(r13)
            int r11 = r15.b
            if (r20 != 0) goto L_0x00b8
            r14 = r13
            goto L_0x00b9
        L_0x00b8:
            r14 = r7
        L_0x00b9:
            r7 = 0
        L_0x00ba:
            r23 = 0
            r25 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 >= r14) goto L_0x00e1
            byte[] r13 = r15.a
            int r28 = r11 + r7
            byte r13 = r13[r28]
            if (r13 == r12) goto L_0x00dd
            if (r20 != 0) goto L_0x00d2
            long r13 = r15.w()
            goto L_0x00d6
        L_0x00d2:
            long r13 = r15.z()
        L_0x00d6:
            int r7 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r7 != 0) goto L_0x00e5
        L_0x00da:
            r13 = r25
            goto L_0x00e5
        L_0x00dd:
            int r7 = r7 + 1
            r13 = 4
            goto L_0x00ba
        L_0x00e1:
            r15.I(r14)
            goto L_0x00da
        L_0x00e5:
            r15.I(r10)
            int r7 = r15.h()
            int r11 = r15.h()
            r12 = 4
            r15.I(r12)
            int r12 = r15.h()
            int r15 = r15.h()
            r10 = 65536(0x10000, float:9.18355E-41)
            if (r7 != 0) goto L_0x010b
            if (r11 != r10) goto L_0x010b
            r10 = -65536(0xffffffffffff0000, float:NaN)
            if (r12 != r10) goto L_0x010d
            if (r15 != 0) goto L_0x010d
            r7 = 90
            goto L_0x0128
        L_0x010b:
            r10 = -65536(0xffffffffffff0000, float:NaN)
        L_0x010d:
            if (r7 != 0) goto L_0x011c
            if (r11 != r10) goto L_0x011c
            r10 = 65536(0x10000, float:9.18355E-41)
            if (r12 != r10) goto L_0x011a
            if (r15 != 0) goto L_0x011a
            r7 = 270(0x10e, float:3.78E-43)
            goto L_0x0128
        L_0x011a:
            r10 = -65536(0xffffffffffff0000, float:NaN)
        L_0x011c:
            if (r7 != r10) goto L_0x0127
            if (r11 != 0) goto L_0x0127
            if (r12 != 0) goto L_0x0127
            if (r15 != r10) goto L_0x0127
            r7 = 180(0xb4, float:2.52E-43)
            goto L_0x0128
        L_0x0127:
            r7 = 0
        L_0x0128:
            int r10 = (r72 > r25 ? 1 : (r72 == r25 ? 0 : -1))
            if (r10 != 0) goto L_0x012f
            r31 = r13
            goto L_0x0131
        L_0x012f:
            r31 = r72
        L_0x0131:
            g1g r6 = r6.c
            r10 = 8
            r6.H(r10)
            int r10 = r6.h()
            int r10 = defpackage.ty.x(r10)
            if (r10 != 0) goto L_0x0145
            r10 = 8
            goto L_0x0147
        L_0x0145:
            r10 = 16
        L_0x0147:
            r6.I(r10)
            long r10 = r6.w()
            int r6 = (r31 > r25 ? 1 : (r31 == r25 ? 0 : -1))
            if (r6 != 0) goto L_0x0156
        L_0x0152:
            r6 = 1835626086(0x6d696e66, float:4.515217E27)
            goto L_0x0162
        L_0x0156:
            r33 = 1000000(0xf4240, double:4.940656E-318)
            r35 = r10
            long r12 = defpackage.t0g.J(r31, r33, r35)
            r25 = r12
            goto L_0x0152
        L_0x0162:
            py r12 = r8.z(r6)
            r12.getClass()
            r6 = 1937007212(0x7374626c, float:1.9362132E31)
            py r12 = r12.z(r6)
            r12.getClass()
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            ry r6 = r8.A(r6)
            r6.getClass()
            g1g r6 = r6.c
            r8 = 8
            r6.H(r8)
            int r8 = r6.h()
            int r8 = defpackage.ty.x(r8)
            if (r8 != 0) goto L_0x0191
            r13 = 8
            goto L_0x0193
        L_0x0191:
            r13 = 16
        L_0x0193:
            r6.I(r13)
            long r13 = r6.w()
            if (r8 != 0) goto L_0x019e
            r8 = 4
            goto L_0x01a0
        L_0x019e:
            r8 = 8
        L_0x01a0:
            r6.I(r8)
            int r6 = r6.A()
            int r8 = r6 >> 10
            r8 = r8 & 31
            int r8 = r8 + 96
            char r8 = (char) r8
            int r15 = r6 >> 5
            r15 = r15 & 31
            int r15 = r15 + 96
            char r15 = (char) r15
            r6 = r6 & 31
            int r6 = r6 + 96
            char r6 = (char) r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r31 = r4
            r4 = 3
            r0.<init>(r4)
            r0.append(r8)
            r0.append(r15)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            android.util.Pair r0 = android.util.Pair.create(r4, r0)
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            ry r4 = r12.A(r4)
            r4.getClass()
            java.lang.Object r6 = r0.second
            java.lang.String r6 = (java.lang.String) r6
            g1g r4 = r4.c
            r8 = 12
            r4.H(r8)
            int r8 = r4.h()
            opf[] r12 = new defpackage.opf[r8]
            r32 = r2
            r2 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x01f8:
            if (r2 >= r8) goto L_0x0cbb
            r29 = r8
            int r8 = r4.b
            r30 = r15
            int r15 = r4.h()
            r34 = r10
            r33 = r14
            if (r15 <= 0) goto L_0x020c
            r14 = 1
            goto L_0x020d
        L_0x020c:
            r14 = 0
        L_0x020d:
            java.lang.String r10 = "childAtomSize must be positive"
            defpackage.te8.e(r10, r14)
            int r11 = r4.h()
            r14 = 1635148593(0x61766331, float:2.840654E20)
            if (r11 == r14) goto L_0x0266
            r14 = 1635148595(0x61766333, float:2.8406544E20)
            if (r11 == r14) goto L_0x0266
            r14 = 1701733238(0x656e6376, float:7.035987E22)
            if (r11 == r14) goto L_0x0266
            r14 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r11 == r14) goto L_0x0266
            r14 = 1836070006(0x6d703476, float:4.646239E27)
            if (r11 == r14) goto L_0x0266
            r14 = 1752589105(0x68766331, float:4.6541277E24)
            if (r11 == r14) goto L_0x0266
            r14 = 1751479857(0x68657631, float:4.3344087E24)
            if (r11 == r14) goto L_0x0266
            r14 = 1932670515(0x73323633, float:1.4119387E31)
            if (r11 == r14) goto L_0x0266
            r14 = 1211250227(0x48323633, float:182488.8)
            if (r11 == r14) goto L_0x0266
            r14 = 1987063864(0x76703038, float:1.21789965E33)
            if (r11 == r14) goto L_0x0266
            r14 = 1987063865(0x76703039, float:1.2178997E33)
            if (r11 == r14) goto L_0x0266
            r14 = 1635135537(0x61763031, float:2.8383572E20)
            if (r11 == r14) goto L_0x0266
            r14 = 1685479798(0x64766176, float:1.8179687E22)
            if (r11 == r14) goto L_0x0266
            r14 = 1685479729(0x64766131, float:1.817961E22)
            if (r11 == r14) goto L_0x0266
            r14 = 1685481573(0x64766865, float:1.8181686E22)
            if (r11 == r14) goto L_0x0266
            r14 = 1685481521(0x64766831, float:1.8181627E22)
            if (r11 != r14) goto L_0x027c
        L_0x0266:
            r52 = r0
            r43 = r2
            r67 = r5
            r38 = r7
            r46 = r8
            r62 = r9
            r8 = r10
            r44 = r12
            r66 = r13
            r45 = r15
            r9 = 0
            goto L_0x08a6
        L_0x027c:
            r14 = 1701733217(0x656e6361, float:7.0359778E22)
            r62 = r9
            r9 = 1836069985(0x6d703461, float:4.6462328E27)
            if (r11 == r9) goto L_0x02fb
            if (r11 == r14) goto L_0x02fb
            r9 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r11 == r9) goto L_0x02fb
            r9 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r11 == r9) goto L_0x02fb
            r9 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r11 == r9) goto L_0x02fb
            r9 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r11 == r9) goto L_0x02fb
            r9 = 1685353315(0x64747363, float:1.803728E22)
            if (r11 == r9) goto L_0x02fb
            r9 = 1685353317(0x64747365, float:1.8037282E22)
            if (r11 == r9) goto L_0x02fb
            r9 = 1685353320(0x64747368, float:1.8037286E22)
            if (r11 == r9) goto L_0x02fb
            r9 = 1685353324(0x6474736c, float:1.803729E22)
            if (r11 == r9) goto L_0x02fb
            r9 = 1685353336(0x64747378, float:1.8037304E22)
            if (r11 == r9) goto L_0x02fb
            r9 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r11 == r9) goto L_0x02fb
            r9 = 1935767394(0x73617762, float:1.7863284E31)
            if (r11 == r9) goto L_0x02fb
            r9 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r11 == r9) goto L_0x02fb
            r9 = 1936684916(0x736f7774, float:1.89725E31)
            if (r11 == r9) goto L_0x02fb
            r9 = 1953984371(0x74776f73, float:7.841539E31)
            if (r11 == r9) goto L_0x02fb
            r9 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r11 == r9) goto L_0x02fb
            r9 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r11 == r9) goto L_0x02fb
            r9 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r11 == r9) goto L_0x02fb
            r9 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r11 == r9) goto L_0x02fb
            r9 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r11 == r9) goto L_0x02fb
            r9 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r11 == r9) goto L_0x02fb
            r9 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r11 == r9) goto L_0x02fb
            r9 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r11 == r9) goto L_0x02fb
            r9 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r11 != r9) goto L_0x02ff
        L_0x02fb:
            r52 = r0
            goto L_0x03d7
        L_0x02ff:
            r14 = 2004251764(0x77767474, float:4.998699E33)
            r9 = 1954034535(0x74783367, float:7.865797E31)
            r10 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r11 == r10) goto L_0x0374
            if (r11 == r9) goto L_0x0374
            if (r11 == r14) goto L_0x0374
            r14 = 1937010800(0x73747070, float:1.9366469E31)
            if (r11 == r14) goto L_0x0374
            r14 = 1664495672(0x63363038, float:3.360782E21)
            if (r11 != r14) goto L_0x0319
            goto L_0x0374
        L_0x0319:
            r9 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r11 != r9) goto L_0x035a
            int r10 = r8 + 16
            r4.H(r10)
            if (r11 != r9) goto L_0x0340
            r4.q()
            java.lang.String r9 = r4.q()
            if (r9 == 0) goto L_0x0340
            aa6 r10 = new aa6
            r10.<init>()
            java.lang.String r11 = java.lang.Integer.toString(r3)
            r10.a = r11
            r10.k = r9
            ca6 r13 = new ca6
            r13.<init>(r10)
        L_0x0340:
            r52 = r0
        L_0x0342:
            r43 = r2
            r67 = r5
            r40 = r6
            r2 = r7
            r53 = r8
            r44 = r12
            r54 = r15
            r15 = r30
            r14 = r33
        L_0x0353:
            r1 = 0
            r5 = -1
            r7 = 3
            r10 = 16
            goto L_0x0ca0
        L_0x035a:
            r9 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r11 != r9) goto L_0x0340
            aa6 r9 = new aa6
            r9.<init>()
            java.lang.String r10 = java.lang.Integer.toString(r3)
            r9.a = r10
            java.lang.String r10 = "application/x-camera-motion"
            r9.k = r10
            ca6 r13 = new ca6
            r13.<init>(r9)
            goto L_0x0340
        L_0x0374:
            int r13 = r8 + 16
            r4.H(r13)
            java.lang.String r13 = "application/ttml+xml"
            r39 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r11 != r10) goto L_0x0386
        L_0x0382:
            r10 = r39
        L_0x0384:
            r9 = 0
            goto L_0x03b5
        L_0x0386:
            if (r11 != r9) goto L_0x0399
            int r9 = r15 + -16
            byte[] r10 = new byte[r9]
            r11 = 0
            r4.g(r11, r10, r9)
            k0d r9 = defpackage.tb7.t(r10)
            java.lang.String r13 = "application/x-quicktime-tx3g"
            r10 = r39
            goto L_0x03b5
        L_0x0399:
            r9 = 2004251764(0x77767474, float:4.998699E33)
            if (r11 != r9) goto L_0x03a1
            java.lang.String r13 = "application/x-mp4-vtt"
            goto L_0x0382
        L_0x03a1:
            r9 = 1937010800(0x73747070, float:1.9366469E31)
            if (r11 != r9) goto L_0x03a9
            r10 = r23
            goto L_0x0384
        L_0x03a9:
            r9 = 1664495672(0x63363038, float:3.360782E21)
            if (r11 != r9) goto L_0x03d1
            java.lang.String r13 = "application/x-mp4-cea-608"
            r10 = r39
            r9 = 0
            r33 = 1
        L_0x03b5:
            aa6 r14 = new aa6
            r14.<init>()
            r52 = r0
            java.lang.String r0 = java.lang.Integer.toString(r3)
            r14.a = r0
            r14.k = r13
            r14.c = r6
            r14.o = r10
            r14.m = r9
            ca6 r13 = new ca6
            r13.<init>(r14)
            goto L_0x0342
        L_0x03d1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x03d7:
            int r0 = r8 + 16
            r4.H(r0)
            if (r76 == 0) goto L_0x03e7
            int r0 = r4.A()
            r9 = 6
            r4.I(r9)
            goto L_0x03ed
        L_0x03e7:
            r0 = 8
            r4.I(r0)
            r0 = 0
        L_0x03ed:
            if (r0 == 0) goto L_0x03f2
            r14 = 1
            if (r0 != r14) goto L_0x03f4
        L_0x03f2:
            r14 = r10
            goto L_0x042a
        L_0x03f4:
            r14 = 2
            if (r0 != r14) goto L_0x041b
            r0 = 16
            r4.I(r0)
            long r64 = r4.p()
            double r64 = java.lang.Double.longBitsToDouble(r64)
            r14 = r10
            long r9 = java.lang.Math.round(r64)
            int r0 = (int) r9
            int r9 = r4.y()
            r10 = 20
            r4.I(r10)
            r67 = r5
            r66 = r13
            r65 = r14
            r5 = 0
            goto L_0x046a
        L_0x041b:
            r43 = r2
            r67 = r5
            r38 = r7
            r46 = r8
            r44 = r12
            r45 = r15
            r9 = 0
            goto L_0x0898
        L_0x042a:
            int r9 = r4.A()
            r10 = 6
            r4.I(r10)
            byte[] r10 = r4.a
            r64 = r9
            int r9 = r4.b
            r65 = r14
            int r14 = r9 + 1
            r4.b = r14
            r66 = r13
            byte r13 = r10[r9]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r22 = 8
            int r13 = r13 << 8
            r67 = r5
            int r5 = r9 + 2
            r4.b = r5
            byte r5 = r10[r14]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r13
            int r10 = r9 + 4
            r4.b = r10
            r4.H(r9)
            int r9 = r4.h()
            r10 = 1
            if (r0 != r10) goto L_0x0466
            r0 = 16
            r4.I(r0)
        L_0x0466:
            r0 = r5
            r5 = r9
            r9 = r64
        L_0x046a:
            int r10 = r4.b
            r13 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r11 != r13) goto L_0x0499
            android.util.Pair r13 = c(r4, r8, r15)
            if (r13 == 0) goto L_0x0494
            java.lang.Object r11 = r13.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r1 != 0) goto L_0x0483
            r14 = 0
            goto L_0x048d
        L_0x0483:
            java.lang.Object r14 = r13.second
            opf r14 = (defpackage.opf) r14
            java.lang.String r14 = r14.b
            xv4 r14 = r1.a(r14)
        L_0x048d:
            java.lang.Object r13 = r13.second
            opf r13 = (defpackage.opf) r13
            r12[r2] = r13
            goto L_0x0495
        L_0x0494:
            r14 = r1
        L_0x0495:
            r4.H(r10)
            goto L_0x049a
        L_0x0499:
            r14 = r1
        L_0x049a:
            java.lang.String r13 = "audio/ac4"
            java.lang.String r63 = "audio/eac3"
            r64 = r0
            java.lang.String r0 = "audio/ac3"
            r68 = r9
            r9 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r11 != r9) goto L_0x04ae
            r50 = r0
        L_0x04ab:
            r9 = -1
            goto L_0x0568
        L_0x04ae:
            r9 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r11 != r9) goto L_0x04b6
            r50 = r63
            goto L_0x04ab
        L_0x04b6:
            r9 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r11 != r9) goto L_0x04be
            r50 = r13
            goto L_0x04ab
        L_0x04be:
            r9 = 1685353315(0x64747363, float:1.803728E22)
            if (r11 != r9) goto L_0x04c8
            java.lang.String r9 = "audio/vnd.dts"
        L_0x04c5:
            r50 = r9
            goto L_0x04ab
        L_0x04c8:
            r9 = 1685353320(0x64747368, float:1.8037286E22)
            if (r11 == r9) goto L_0x0564
            r9 = 1685353324(0x6474736c, float:1.803729E22)
            if (r11 != r9) goto L_0x04d4
            goto L_0x0564
        L_0x04d4:
            r9 = 1685353317(0x64747365, float:1.8037282E22)
            if (r11 != r9) goto L_0x04dc
            java.lang.String r9 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x04c5
        L_0x04dc:
            r9 = 1685353336(0x64747378, float:1.8037304E22)
            if (r11 != r9) goto L_0x04e4
            java.lang.String r9 = "audio/vnd.dts.uhd;profile=p2"
            goto L_0x04c5
        L_0x04e4:
            r9 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r11 != r9) goto L_0x04ec
            java.lang.String r9 = "audio/3gpp"
            goto L_0x04c5
        L_0x04ec:
            r9 = 1935767394(0x73617762, float:1.7863284E31)
            if (r11 != r9) goto L_0x04f4
            java.lang.String r9 = "audio/amr-wb"
            goto L_0x04c5
        L_0x04f4:
            java.lang.String r9 = "audio/raw"
            r50 = r9
            r9 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r11 == r9) goto L_0x0562
            r9 = 1936684916(0x736f7774, float:1.89725E31)
            if (r11 != r9) goto L_0x0504
            goto L_0x0562
        L_0x0504:
            r9 = 1953984371(0x74776f73, float:7.841539E31)
            if (r11 != r9) goto L_0x050c
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0568
        L_0x050c:
            r9 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r11 == r9) goto L_0x055e
            r9 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r11 != r9) goto L_0x0517
            goto L_0x055e
        L_0x0517:
            r9 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r11 != r9) goto L_0x051f
            java.lang.String r9 = "audio/mha1"
            goto L_0x04c5
        L_0x051f:
            r9 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r11 != r9) goto L_0x0527
            java.lang.String r9 = "audio/mhm1"
            goto L_0x04c5
        L_0x0527:
            r9 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r11 != r9) goto L_0x052f
            java.lang.String r9 = "audio/alac"
            goto L_0x04c5
        L_0x052f:
            r9 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r11 != r9) goto L_0x0537
            java.lang.String r9 = "audio/g711-alaw"
            goto L_0x04c5
        L_0x0537:
            r9 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r11 != r9) goto L_0x053f
            java.lang.String r9 = "audio/g711-mlaw"
            goto L_0x04c5
        L_0x053f:
            r9 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r11 != r9) goto L_0x0548
            java.lang.String r9 = "audio/opus"
            goto L_0x04c5
        L_0x0548:
            r9 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r11 != r9) goto L_0x0551
            java.lang.String r9 = "audio/flac"
            goto L_0x04c5
        L_0x0551:
            r9 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r11 != r9) goto L_0x055a
            java.lang.String r9 = "audio/true-hd"
            goto L_0x04c5
        L_0x055a:
            r9 = -1
            r50 = 0
            goto L_0x0568
        L_0x055e:
            java.lang.String r9 = "audio/mpeg"
            goto L_0x04c5
        L_0x0562:
            r9 = 2
            goto L_0x0568
        L_0x0564:
            java.lang.String r9 = "audio/vnd.dts.hd"
            goto L_0x04c5
        L_0x0568:
            r43 = r2
            r38 = r7
            r11 = r10
            r44 = r12
            r1 = r50
            r10 = r64
            r7 = r68
            r2 = 0
            r39 = 0
        L_0x0578:
            int r12 = r11 - r8
            if (r12 >= r15) goto L_0x0861
            r4.H(r11)
            int r12 = r4.h()
            r46 = r8
            r45 = r15
            r8 = r65
            if (r12 <= 0) goto L_0x058d
            r15 = 1
            goto L_0x058e
        L_0x058d:
            r15 = 0
        L_0x058e:
            defpackage.te8.e(r8, r15)
            int r15 = r4.h()
            r40 = r9
            r9 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r15 != r9) goto L_0x05b8
            int r9 = r12 + -13
            byte[] r15 = new byte[r9]
            r41 = r2
            int r2 = r11 + 13
            r4.H(r2)
            r2 = 0
            r4.g(r2, r15, r9)
            k0d r2 = defpackage.tb7.t(r15)
            r47 = r0
            r39 = r2
            r2 = r41
        L_0x05b5:
            r9 = 0
            goto L_0x0854
        L_0x05b8:
            r41 = r2
            r2 = 1702061171(0x65736473, float:7.183675E22)
            if (r15 == r2) goto L_0x07d5
            if (r76 == 0) goto L_0x05d3
            r2 = 2002876005(0x77617665, float:4.5729223E33)
            if (r15 != r2) goto L_0x05d3
            r47 = r0
            r65 = r8
            r0 = 1702061171(0x65736473, float:7.183675E22)
            r2 = 20
            r8 = 4
            r9 = 5
            goto L_0x07e0
        L_0x05d3:
            int[] r2 = defpackage.bs0.d
            int[] r9 = defpackage.bs0.b
            r65 = r8
            r8 = 1684103987(0x64616333, float:1.6630662E22)
            if (r15 != r8) goto L_0x062a
            int r8 = r11 + 8
            r4.H(r8)
            java.lang.String r8 = java.lang.Integer.toString(r3)
            int r15 = r4.v()
            r15 = r15 & 192(0xc0, float:2.69E-43)
            r37 = 6
            int r15 = r15 >> 6
            r9 = r9[r15]
            int r15 = r4.v()
            r47 = r15 & 56
            r21 = 3
            int r47 = r47 >> 3
            r2 = r2[r47]
            r27 = 4
            r15 = r15 & 4
            if (r15 == 0) goto L_0x0607
            int r2 = r2 + 1
        L_0x0607:
            aa6 r15 = new aa6
            r15.<init>()
            r15.a = r8
            r15.k = r0
            r15.x = r2
            r15.y = r9
            r15.n = r14
            r15.c = r6
            ca6 r2 = new ca6
            r2.<init>(r15)
            r47 = r0
        L_0x061f:
            r66 = r2
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            r8 = 4
            r9 = 5
        L_0x0626:
            r15 = 20
            goto L_0x074e
        L_0x062a:
            r8 = 1684366131(0x64656333, float:1.692581E22)
            if (r15 != r8) goto L_0x06a1
            int r8 = r11 + 8
            r4.H(r8)
            java.lang.String r8 = java.lang.Integer.toString(r3)
            r15 = 2
            r4.I(r15)
            int r15 = r4.v()
            r15 = r15 & 192(0xc0, float:2.69E-43)
            r37 = 6
            int r15 = r15 >> 6
            r9 = r9[r15]
            int r15 = r4.v()
            r47 = r15 & 14
            r19 = 1
            int r47 = r47 >> 1
            r2 = r2[r47]
            r15 = r15 & 1
            if (r15 == 0) goto L_0x065a
            int r2 = r2 + 1
        L_0x065a:
            int r15 = r4.v()
            r15 = r15 & 30
            int r15 = r15 >> 1
            if (r15 <= 0) goto L_0x0670
            int r15 = r4.v()
            r17 = 2
            r15 = r15 & 2
            if (r15 == 0) goto L_0x0670
            int r2 = r2 + 2
        L_0x0670:
            int r15 = r4.c()
            if (r15 <= 0) goto L_0x0685
            int r15 = r4.v()
            r19 = 1
            r15 = r15 & 1
            if (r15 == 0) goto L_0x0685
            java.lang.String r15 = "audio/eac3-joc"
            r47 = r0
            goto L_0x0689
        L_0x0685:
            r47 = r0
            r15 = r63
        L_0x0689:
            aa6 r0 = new aa6
            r0.<init>()
            r0.a = r8
            r0.k = r15
            r0.x = r2
            r0.y = r9
            r0.n = r14
            r0.c = r6
            ca6 r2 = new ca6
            r2.<init>(r0)
            goto L_0x061f
        L_0x06a1:
            r47 = r0
            r0 = 1684103988(0x64616334, float:1.6630663E22)
            if (r15 != r0) goto L_0x06e5
            int r0 = r11 + 8
            r4.H(r0)
            java.lang.String r0 = java.lang.Integer.toString(r3)
            r2 = 1
            r4.I(r2)
            int r8 = r4.v()
            r8 = r8 & 32
            r9 = 5
            int r8 = r8 >> r9
            if (r8 != r2) goto L_0x06c3
            r2 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x06c6
        L_0x06c3:
            r2 = 44100(0xac44, float:6.1797E-41)
        L_0x06c6:
            aa6 r8 = new aa6
            r8.<init>()
            r8.a = r0
            r8.k = r13
            r0 = 2
            r8.x = r0
            r8.y = r2
            r8.n = r14
            r8.c = r6
            ca6 r0 = new ca6
            r0.<init>(r8)
            r66 = r0
        L_0x06df:
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            r8 = 4
            goto L_0x0626
        L_0x06e5:
            r9 = 5
            r0 = 1684892784(0x646d6c70, float:1.7518768E22)
            if (r15 != r0) goto L_0x070e
            if (r5 <= 0) goto L_0x06f5
            r10 = r5
            r2 = r41
            r8 = r65
            r7 = 2
            goto L_0x05b5
        L_0x06f5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 60
            r0.<init>(r1)
            java.lang.String r1 = "Invalid sample rate for Dolby TrueHD MLP stream: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x070e:
            r0 = 1684305011(0x64647473, float:1.6856995E22)
            if (r15 != r0) goto L_0x0730
            aa6 r0 = new aa6
            r0.<init>()
            java.lang.String r2 = java.lang.Integer.toString(r3)
            r0.a = r2
            r0.k = r1
            r0.x = r7
            r0.y = r10
            r0.n = r14
            r0.c = r6
            ca6 r2 = new ca6
            r2.<init>(r0)
            r66 = r2
            goto L_0x06df
        L_0x0730:
            r0 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r15 != r0) goto L_0x0754
            int r0 = r12 + -8
            byte[] r2 = a
            int r8 = r2.length
            int r8 = r8 + r0
            byte[] r8 = java.util.Arrays.copyOf(r2, r8)
            int r15 = r11 + 8
            r4.H(r15)
            int r2 = r2.length
            r4.g(r2, r8, r0)
            java.util.ArrayList r0 = defpackage.tf6.f(r8)
        L_0x074c:
            r39 = r0
        L_0x074e:
            r2 = r41
            r8 = r65
            goto L_0x05b5
        L_0x0754:
            r0 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r15 != r0) goto L_0x0781
            int r0 = r12 + -12
            int r2 = r12 + -8
            byte[] r2 = new byte[r2]
            r8 = 102(0x66, float:1.43E-43)
            r15 = 0
            r2[r15] = r8
            r8 = 76
            r15 = 1
            r2[r15] = r8
            r8 = 97
            r15 = 2
            r2[r15] = r8
            r8 = 67
            r15 = 3
            r2[r15] = r8
            int r8 = r11 + 12
            r4.H(r8)
            r8 = 4
            r4.g(r8, r2, r0)
            k0d r0 = defpackage.tb7.t(r2)
            goto L_0x074c
        L_0x0781:
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            r8 = 4
            if (r15 != r0) goto L_0x0626
            int r2 = r12 + -12
            byte[] r7 = new byte[r2]
            int r10 = r11 + 12
            r4.H(r10)
            r10 = 0
            r4.g(r10, r7, r2)
            g1g r2 = new g1g
            r2.<init>((byte[]) r7)
            r10 = 9
            r2.H(r10)
            int r10 = r2.v()
            r15 = 20
            r2.H(r15)
            int r2 = r2.y()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r2 = android.util.Pair.create(r2, r10)
            java.lang.Object r10 = r2.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Object r2 = r2.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            k0d r7 = defpackage.tb7.t(r7)
            r39 = r7
            r8 = r65
            r9 = 0
            r7 = r2
        L_0x07d1:
            r2 = r41
            goto L_0x0854
        L_0x07d5:
            r47 = r0
            r65 = r8
            r2 = 20
            r8 = 4
            r9 = 5
            r0 = 1702061171(0x65736473, float:7.183675E22)
        L_0x07e0:
            if (r15 != r0) goto L_0x07e7
            r0 = r11
            r8 = r65
        L_0x07e5:
            r2 = -1
            goto L_0x081b
        L_0x07e7:
            int r0 = r4.b
            r2 = 0
            if (r0 < r11) goto L_0x07ee
            r15 = 1
            goto L_0x07ef
        L_0x07ee:
            r15 = 0
        L_0x07ef:
            defpackage.te8.e(r2, r15)
        L_0x07f2:
            int r2 = r0 - r11
            if (r2 >= r12) goto L_0x0817
            r4.H(r0)
            int r2 = r4.h()
            r8 = r65
            if (r2 <= 0) goto L_0x0803
            r15 = 1
            goto L_0x0804
        L_0x0803:
            r15 = 0
        L_0x0804:
            defpackage.te8.e(r8, r15)
            int r15 = r4.h()
            r9 = 1702061171(0x65736473, float:7.183675E22)
            if (r15 != r9) goto L_0x0811
            goto L_0x07e5
        L_0x0811:
            int r0 = r0 + r2
            r65 = r8
            r8 = 4
            r9 = 5
            goto L_0x07f2
        L_0x0817:
            r8 = r65
            r0 = -1
            goto L_0x07e5
        L_0x081b:
            if (r0 == r2) goto L_0x0851
            android.util.Pair r0 = a(r0, r4)
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.second
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L_0x0851
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0847
            ky1 r2 = new ky1
            int r7 = r0.length
            r9 = 1
            r10 = 0
            r2.<init>((byte[]) r0, (byte) r10, (int) r7, (int) r9)
            r9 = 0
            e r2 = defpackage.q8.J(r2, r9)
            int r10 = r2.a
            int r7 = r2.b
            java.lang.String r2 = r2.c
            goto L_0x084a
        L_0x0847:
            r9 = 0
            r2 = r41
        L_0x084a:
            k0d r0 = defpackage.tb7.t(r0)
            r39 = r0
            goto L_0x0854
        L_0x0851:
            r9 = 0
            goto L_0x07d1
        L_0x0854:
            int r11 = r11 + r12
            r65 = r8
            r9 = r40
            r15 = r45
            r8 = r46
            r0 = r47
            goto L_0x0578
        L_0x0861:
            r41 = r2
            r46 = r8
            r40 = r9
            r45 = r15
            r9 = 0
            if (r66 != 0) goto L_0x0896
            if (r1 == 0) goto L_0x0896
            aa6 r0 = new aa6
            r0.<init>()
            java.lang.String r2 = java.lang.Integer.toString(r3)
            r0.a = r2
            r0.k = r1
            r2 = r41
            r0.h = r2
            r0.x = r7
            r0.y = r10
            r1 = r40
            r0.z = r1
            r1 = r39
            r0.m = r1
            r0.n = r14
            r0.c = r6
            ca6 r1 = new ca6
            r1.<init>(r0)
            r13 = r1
            goto L_0x0898
        L_0x0896:
            r13 = r66
        L_0x0898:
            r40 = r6
            r15 = r30
            r14 = r33
            r2 = r38
            r54 = r45
            r53 = r46
            goto L_0x0353
        L_0x08a6:
            int r0 = r46 + 16
            r4.H(r0)
            r0 = 16
            r4.I(r0)
            int r0 = r4.A()
            int r1 = r4.A()
            r2 = 50
            r4.I(r2)
            int r2 = r4.b
            r5 = 1701733238(0x656e6376, float:7.035987E22)
            if (r11 != r5) goto L_0x08f4
            r7 = r45
            r5 = r46
            android.util.Pair r10 = c(r4, r5, r7)
            if (r10 == 0) goto L_0x08ed
            java.lang.Object r11 = r10.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r12 = r74
            if (r12 != 0) goto L_0x08dc
            r13 = 0
            goto L_0x08e6
        L_0x08dc:
            java.lang.Object r13 = r10.second
            opf r13 = (defpackage.opf) r13
            java.lang.String r13 = r13.b
            xv4 r13 = r12.a(r13)
        L_0x08e6:
            java.lang.Object r10 = r10.second
            opf r10 = (defpackage.opf) r10
            r44[r43] = r10
            goto L_0x08f0
        L_0x08ed:
            r12 = r74
            r13 = r12
        L_0x08f0:
            r4.H(r2)
            goto L_0x08fb
        L_0x08f4:
            r12 = r74
            r7 = r45
            r5 = r46
            r13 = r12
        L_0x08fb:
            java.lang.String r10 = "video/3gpp"
            r14 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r11 != r14) goto L_0x0905
            java.lang.String r14 = "video/mpeg"
            goto L_0x090d
        L_0x0905:
            r14 = 1211250227(0x48323633, float:182488.8)
            if (r11 != r14) goto L_0x090c
            r14 = r10
            goto L_0x090d
        L_0x090c:
            r14 = 0
        L_0x090d:
            r15 = 1065353216(0x3f800000, float:1.0)
            r40 = r6
            r42 = r9
            r41 = r10
            r48 = r13
            r12 = r14
            r10 = r15
            r47 = r30
            r6 = -1
            r14 = 0
            r15 = 0
            r30 = 0
            r45 = -1
            r46 = -1
            r69 = -1
            r9 = r2
            r2 = 0
        L_0x0928:
            int r13 = r9 - r5
            if (r13 >= r7) goto L_0x0c36
            r4.H(r9)
            int r13 = r4.b
            r49 = r2
            int r2 = r4.h()
            r50 = r6
            if (r2 != 0) goto L_0x0952
            int r6 = r4.b
            int r6 = r6 - r5
            if (r6 != r7) goto L_0x0952
            r63 = r0
            r57 = r1
            r53 = r5
        L_0x0946:
            r54 = r7
            r56 = r10
            r55 = r15
            r1 = 0
            r7 = 3
            r10 = 16
            goto L_0x0c42
        L_0x0952:
            if (r2 <= 0) goto L_0x0956
            r6 = 1
            goto L_0x0957
        L_0x0956:
            r6 = 0
        L_0x0957:
            defpackage.te8.e(r8, r6)
            int r6 = r4.h()
            r65 = r8
            r8 = 1635148611(0x61766343, float:2.8406573E20)
            if (r6 != r8) goto L_0x09a1
            if (r12 != 0) goto L_0x096a
            r6 = 1
        L_0x0968:
            r8 = 0
            goto L_0x096c
        L_0x096a:
            r6 = 0
            goto L_0x0968
        L_0x096c:
            defpackage.te8.e(r8, r6)
            int r13 = r13 + 8
            r4.H(r13)
            je0 r6 = defpackage.je0.a(r4)
            if (r42 != 0) goto L_0x097c
            float r10 = r6.e
        L_0x097c:
            int r8 = r6.b
            java.lang.String r12 = "video/avc"
            java.util.List r13 = r6.a
            java.lang.String r6 = r6.f
        L_0x0984:
            r63 = r0
            r57 = r1
            r53 = r5
            r14 = r6
            r54 = r7
            r47 = r8
            r56 = r10
            r51 = r11
            r49 = r13
        L_0x0995:
            r6 = r50
        L_0x0997:
            r0 = 1702061171(0x65736473, float:7.183675E22)
            r1 = 0
        L_0x099b:
            r7 = 3
        L_0x099c:
            r10 = 16
            r11 = 6
            goto L_0x0c23
        L_0x09a1:
            r8 = 1752589123(0x68766343, float:4.6541328E24)
            if (r6 != r8) goto L_0x09c6
            if (r12 != 0) goto L_0x09ab
            r6 = 1
        L_0x09a9:
            r8 = 0
            goto L_0x09ad
        L_0x09ab:
            r6 = 0
            goto L_0x09a9
        L_0x09ad:
            defpackage.te8.e(r8, r6)
            int r13 = r13 + 8
            r4.H(r13)
            dy6 r6 = defpackage.dy6.a(r4)
            if (r42 != 0) goto L_0x09bd
            float r10 = r6.c
        L_0x09bd:
            int r8 = r6.b
            java.lang.String r12 = "video/hevc"
            java.util.List r13 = r6.a
            java.lang.String r6 = r6.d
            goto L_0x0984
        L_0x09c6:
            r8 = 1685480259(0x64766343, float:1.8180206E22)
            if (r6 == r8) goto L_0x09d0
            r8 = 1685485123(0x64767643, float:1.8185683E22)
            if (r6 != r8) goto L_0x09e8
        L_0x09d0:
            r63 = r0
            r57 = r1
            r53 = r5
            r54 = r7
            r56 = r10
            r51 = r11
            r55 = r15
            r0 = 1702061171(0x65736473, float:7.183675E22)
            r1 = 0
            r7 = 3
            r10 = 16
            r11 = 6
            goto L_0x0c18
        L_0x09e8:
            r8 = 1987076931(0x76706343, float:1.21891066E33)
            if (r6 != r8) goto L_0x0a0f
            if (r12 != 0) goto L_0x09f2
            r6 = 1
        L_0x09f0:
            r8 = 0
            goto L_0x09f4
        L_0x09f2:
            r6 = 0
            goto L_0x09f0
        L_0x09f4:
            defpackage.te8.e(r8, r6)
            r8 = 1987063864(0x76703038, float:1.21789965E33)
            if (r11 != r8) goto L_0x09ff
            java.lang.String r6 = "video/x-vnd.on2.vp8"
            goto L_0x0a01
        L_0x09ff:
            java.lang.String r6 = "video/x-vnd.on2.vp9"
        L_0x0a01:
            r63 = r0
            r57 = r1
            r53 = r5
            r12 = r6
        L_0x0a08:
            r54 = r7
            r56 = r10
            r51 = r11
            goto L_0x0995
        L_0x0a0f:
            r8 = 1635135811(0x61763143, float:2.8384055E20)
            if (r6 != r8) goto L_0x0a21
            if (r12 != 0) goto L_0x0a19
            r6 = 1
        L_0x0a17:
            r8 = 0
            goto L_0x0a1b
        L_0x0a19:
            r6 = 0
            goto L_0x0a17
        L_0x0a1b:
            defpackage.te8.e(r8, r6)
            java.lang.String r6 = "video/av01"
            goto L_0x0a01
        L_0x0a21:
            r8 = 1668050025(0x636c6c69, float:4.3612434E21)
            r51 = 25
            if (r6 != r8) goto L_0x0a52
            if (r30 != 0) goto L_0x0a34
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r51)
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r30 = r6.order(r8)
        L_0x0a34:
            r6 = r30
            r8 = 21
            r6.position(r8)
            short r8 = r4.s()
            r6.putShort(r8)
            short r8 = r4.s()
            r6.putShort(r8)
            r63 = r0
            r57 = r1
            r53 = r5
            r30 = r6
            goto L_0x0a08
        L_0x0a52:
            r8 = 1835295606(0x6d646376, float:4.4176764E27)
            if (r6 != r8) goto L_0x0acf
            if (r30 != 0) goto L_0x0a63
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r51)
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r30 = r6.order(r8)
        L_0x0a63:
            r6 = r30
            short r8 = r4.s()
            short r13 = r4.s()
            r51 = r11
            short r11 = r4.s()
            r53 = r5
            short r5 = r4.s()
            r54 = r7
            short r7 = r4.s()
            r55 = r15
            short r15 = r4.s()
            r56 = r10
            short r10 = r4.s()
            r57 = r1
            short r1 = r4.s()
            long r58 = r4.w()
            long r60 = r4.w()
            r63 = r0
            r0 = 1
            r6.position(r0)
            r6.putShort(r7)
            r6.putShort(r15)
            r6.putShort(r8)
            r6.putShort(r13)
            r6.putShort(r11)
            r6.putShort(r5)
            r6.putShort(r10)
            r6.putShort(r1)
            r0 = 10000(0x2710, double:4.9407E-320)
            long r7 = r58 / r0
            int r5 = (int) r7
            short r5 = (short) r5
            r6.putShort(r5)
            long r0 = r60 / r0
            int r0 = (int) r0
            short r0 = (short) r0
            r6.putShort(r0)
            r30 = r6
            r6 = r50
            r15 = r55
            goto L_0x0997
        L_0x0acf:
            r63 = r0
            r57 = r1
            r53 = r5
            r54 = r7
            r56 = r10
            r51 = r11
            r55 = r15
            r0 = 1681012275(0x64323633, float:1.3149704E22)
            if (r6 != r0) goto L_0x0af7
            if (r12 != 0) goto L_0x0ae7
            r0 = 1
        L_0x0ae5:
            r1 = 0
            goto L_0x0ae9
        L_0x0ae7:
            r0 = 0
            goto L_0x0ae5
        L_0x0ae9:
            defpackage.te8.e(r1, r0)
            r12 = r41
            r6 = r50
            r15 = r55
            r0 = 1702061171(0x65736473, float:7.183675E22)
            goto L_0x099b
        L_0x0af7:
            r0 = 1702061171(0x65736473, float:7.183675E22)
            r1 = 0
            if (r6 != r0) goto L_0x0b23
            if (r12 != 0) goto L_0x0b01
            r5 = 1
            goto L_0x0b02
        L_0x0b01:
            r5 = 0
        L_0x0b02:
            defpackage.te8.e(r1, r5)
            android.util.Pair r5 = a(r13, r4)
            java.lang.Object r6 = r5.first
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.second
            byte[] r5 = (byte[]) r5
            if (r5 == 0) goto L_0x0b18
            k0d r5 = defpackage.tb7.t(r5)
            goto L_0x0b1a
        L_0x0b18:
            r5 = r49
        L_0x0b1a:
            r49 = r5
            r12 = r6
            r6 = r50
            r15 = r55
            goto L_0x099b
        L_0x0b23:
            r5 = 1885434736(0x70617370, float:2.7909473E29)
            if (r6 != r5) goto L_0x0b46
            int r13 = r13 + 8
            r4.H(r13)
            int r5 = r4.y()
            int r6 = r4.y()
            float r5 = (float) r5
            float r6 = (float) r6
            float r5 = r5 / r6
            r56 = r5
            r6 = r50
            r15 = r55
            r7 = 3
            r10 = 16
            r11 = 6
            r42 = 1
            goto L_0x0c23
        L_0x0b46:
            r5 = 1937126244(0x73763364, float:1.9506033E31)
            if (r6 != r5) goto L_0x0b71
            int r5 = r13 + 8
        L_0x0b4d:
            int r6 = r5 - r13
            if (r6 >= r2) goto L_0x0b6b
            r4.H(r5)
            int r6 = r4.h()
            int r7 = r4.h()
            r8 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r7 != r8) goto L_0x0b69
            byte[] r7 = r4.a
            int r6 = r6 + r5
            byte[] r5 = java.util.Arrays.copyOfRange(r7, r5, r6)
            goto L_0x0b6c
        L_0x0b69:
            int r5 = r5 + r6
            goto L_0x0b4d
        L_0x0b6b:
            r5 = r1
        L_0x0b6c:
            r15 = r5
            r6 = r50
            goto L_0x099b
        L_0x0b71:
            r5 = 1936995172(0x73743364, float:1.9347576E31)
            if (r6 != r5) goto L_0x0ba0
            int r5 = r4.v()
            r7 = 3
            r4.I(r7)
            if (r5 != 0) goto L_0x0b9a
            int r5 = r4.v()
            if (r5 == 0) goto L_0x0b98
            r6 = 1
            if (r5 == r6) goto L_0x0b95
            r6 = 2
            if (r5 == r6) goto L_0x0b92
            if (r5 == r7) goto L_0x0b8f
            goto L_0x0b9a
        L_0x0b8f:
            r50 = r7
            goto L_0x0b9a
        L_0x0b92:
            r50 = 2
            goto L_0x0b9a
        L_0x0b95:
            r50 = 1
            goto L_0x0b9a
        L_0x0b98:
            r50 = 0
        L_0x0b9a:
            r6 = r50
            r15 = r55
            goto L_0x099c
        L_0x0ba0:
            r7 = 3
            r5 = 1668246642(0x636f6c72, float:4.4165861E21)
            if (r6 != r5) goto L_0x0bc8
            int r5 = r4.h()
            r6 = 1852009592(0x6e636c78, float:1.7596057E28)
            if (r5 == r6) goto L_0x0bcc
            r6 = 1852009571(0x6e636c63, float:1.7596032E28)
            if (r5 != r6) goto L_0x0bb5
            goto L_0x0bcc
        L_0x0bb5:
            java.lang.String r5 = defpackage.ty.f(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x0bc8
            java.lang.String r6 = "Unsupported color type: "
            r6.concat(r5)
        L_0x0bc8:
            r10 = 16
            r11 = 6
            goto L_0x0c13
        L_0x0bcc:
            int r5 = r4.A()
            int r6 = r4.A()
            r8 = 2
            r4.I(r8)
            r8 = 19
            if (r2 != r8) goto L_0x0be6
            int r8 = r4.v()
            r8 = r8 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0be6
            r8 = 1
            goto L_0x0be7
        L_0x0be6:
            r8 = 0
        L_0x0be7:
            int r5 = defpackage.l53.a(r5)
            if (r8 == 0) goto L_0x0bf0
            r8 = 1
        L_0x0bee:
            r10 = 1
            goto L_0x0bf2
        L_0x0bf0:
            r8 = 2
            goto L_0x0bee
        L_0x0bf2:
            if (r6 == r10) goto L_0x0c09
            r10 = 16
            if (r6 == r10) goto L_0x0c06
            r11 = 18
            r13 = 7
            if (r6 == r11) goto L_0x0c04
            r11 = 6
            if (r6 == r11) goto L_0x0c0c
            if (r6 == r13) goto L_0x0c0c
            r13 = -1
            goto L_0x0c0d
        L_0x0c04:
            r11 = 6
            goto L_0x0c0d
        L_0x0c06:
            r11 = 6
            r13 = r11
            goto L_0x0c0d
        L_0x0c09:
            r10 = 16
            r11 = 6
        L_0x0c0c:
            r13 = r7
        L_0x0c0d:
            r46 = r5
            r45 = r8
            r69 = r13
        L_0x0c13:
            r6 = r50
            r15 = r55
            goto L_0x0c23
        L_0x0c18:
            dr4 r5 = defpackage.dr4.a(r4)
            if (r5 == 0) goto L_0x0c13
            java.lang.String r14 = r5.a
            java.lang.String r12 = "video/dolby-vision"
            goto L_0x0c13
        L_0x0c23:
            int r9 = r9 + r2
            r2 = r49
            r11 = r51
            r5 = r53
            r7 = r54
            r10 = r56
            r1 = r57
            r0 = r63
            r8 = r65
            goto L_0x0928
        L_0x0c36:
            r63 = r0
            r57 = r1
            r49 = r2
            r53 = r5
            r50 = r6
            goto L_0x0946
        L_0x0c42:
            if (r12 != 0) goto L_0x0c4a
            r2 = r38
            r13 = r66
            r5 = -1
            goto L_0x0c9c
        L_0x0c4a:
            aa6 r0 = new aa6
            r0.<init>()
            java.lang.String r2 = java.lang.Integer.toString(r3)
            r0.a = r2
            r0.k = r12
            r0.h = r14
            r2 = r63
            r0.p = r2
            r2 = r57
            r0.q = r2
            r15 = r56
            r0.t = r15
            r2 = r38
            r0.s = r2
            r15 = r55
            r0.u = r15
            r6 = r50
            r0.v = r6
            r5 = r49
            r0.m = r5
            r12 = r48
            r0.n = r12
            r6 = r46
            r5 = -1
            r8 = r45
            r9 = r69
            if (r6 != r5) goto L_0x0c88
            if (r8 != r5) goto L_0x0c88
            if (r9 != r5) goto L_0x0c88
            if (r30 == 0) goto L_0x0c97
        L_0x0c88:
            l53 r11 = new l53
            if (r30 == 0) goto L_0x0c91
            byte[] r12 = r30.array()
            goto L_0x0c92
        L_0x0c91:
            r12 = r1
        L_0x0c92:
            r11.<init>(r6, r8, r9, r12)
            r0.w = r11
        L_0x0c97:
            ca6 r13 = new ca6
            r13.<init>(r0)
        L_0x0c9c:
            r14 = r33
            r15 = r47
        L_0x0ca0:
            int r8 = r53 + r54
            r4.H(r8)
            int r0 = r43 + 1
            r1 = r74
            r7 = r2
            r8 = r29
            r10 = r34
            r6 = r40
            r12 = r44
            r9 = r62
            r5 = r67
            r2 = r0
            r0 = r52
            goto L_0x01f8
        L_0x0cbb:
            r52 = r0
            r67 = r5
            r62 = r9
            r34 = r10
            r44 = r12
            r66 = r13
            r33 = r14
            r30 = r15
            r1 = 0
            if (r75 != 0) goto L_0x0d40
            r0 = 1701082227(0x65647473, float:6.742798E22)
            r5 = r67
            py r0 = r5.z(r0)
            if (r0 == 0) goto L_0x0d42
            r2 = 1701606260(0x656c7374, float:6.9788014E22)
            ry r0 = r0.A(r2)
            if (r0 != 0) goto L_0x0ce4
            r0 = r1
            goto L_0x0d33
        L_0x0ce4:
            g1g r0 = r0.c
            r2 = 8
            r0.H(r2)
            int r2 = r0.h()
            int r2 = defpackage.ty.x(r2)
            int r4 = r0.y()
            long[] r6 = new long[r4]
            long[] r7 = new long[r4]
            r11 = 0
        L_0x0cfc:
            if (r11 >= r4) goto L_0x0d2f
            r8 = 1
            if (r2 != r8) goto L_0x0d06
            long r9 = r0.z()
            goto L_0x0d0a
        L_0x0d06:
            long r9 = r0.w()
        L_0x0d0a:
            r6[r11] = r9
            if (r2 != r8) goto L_0x0d13
            long r9 = r0.p()
            goto L_0x0d18
        L_0x0d13:
            int r9 = r0.h()
            long r9 = (long) r9
        L_0x0d18:
            r7[r11] = r9
            short r9 = r0.s()
            if (r9 != r8) goto L_0x0d27
            r9 = 2
            r0.I(r9)
            int r11 = r11 + 1
            goto L_0x0cfc
        L_0x0d27:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x0d2f:
            android.util.Pair r0 = android.util.Pair.create(r6, r7)
        L_0x0d33:
            if (r0 == 0) goto L_0x0d42
            java.lang.Object r2 = r0.first
            long[] r2 = (long[]) r2
            java.lang.Object r0 = r0.second
            long[] r0 = (long[]) r0
            r29 = r2
            goto L_0x0d45
        L_0x0d40:
            r5 = r67
        L_0x0d42:
            r0 = r1
            r29 = r0
        L_0x0d45:
            if (r66 != 0) goto L_0x0d49
            r15 = r1
            goto L_0x0d6c
        L_0x0d49:
            kpf r15 = new kpf
            r1 = r52
            java.lang.Object r1 = r1.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r19 = r1.longValue()
            r16 = r15
            r17 = r3
            r18 = r62
            r21 = r34
            r23 = r25
            r25 = r66
            r26 = r33
            r27 = r44
            r28 = r30
            r30 = r0
            r16.<init>(r17, r18, r19, r21, r23, r25, r26, r27, r28, r29, r30)
        L_0x0d6c:
            r0 = r77
        L_0x0d6e:
            java.lang.Object r1 = r0.apply(r15)
            kpf r1 = (defpackage.kpf) r1
            if (r1 != 0) goto L_0x0d7b
            r3 = r71
            r2 = r32
            goto L_0x0da4
        L_0x0d7b:
            r2 = 1835297121(0x6d646961, float:4.4181236E27)
            py r2 = r5.z(r2)
            r2.getClass()
            r3 = 1835626086(0x6d696e66, float:4.515217E27)
            py r2 = r2.z(r3)
            r2.getClass()
            r3 = 1937007212(0x7374626c, float:1.9362132E31)
            py r2 = r2.z(r3)
            r2.getClass()
            r3 = r71
            aqf r1 = d(r1, r2, r3)
            r2 = r32
            r2.add(r1)
        L_0x0da4:
            int r4 = r31 + 1
            r0 = r70
            r1 = r74
            goto L_0x000a
        L_0x0dac:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az.e(py, lp6, long, xv4, boolean, boolean, yi6):java.util.ArrayList");
    }
}
