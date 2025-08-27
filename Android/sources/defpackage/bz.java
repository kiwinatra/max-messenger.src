package defpackage;

import android.util.Pair;
import kotlin.uuid.Uuid;

/* renamed from: bz  reason: default package */
public abstract class bz {
    public static final byte[] a = "OpusHead".getBytes(x22.c);

    static {
        int i = v0g.a;
    }

    public static vy a(int i, l8b l8b) {
        l8b.G(i + 12);
        l8b.H(1);
        b(l8b);
        l8b.H(2);
        int u = l8b.u();
        if ((u & Uuid.SIZE_BITS) != 0) {
            l8b.H(2);
        }
        if ((u & 64) != 0) {
            l8b.H(l8b.u());
        }
        if ((u & 32) != 0) {
            l8b.H(2);
        }
        l8b.H(1);
        b(l8b);
        String d = vq9.d(l8b.u());
        if ("audio/mpeg".equals(d) || "audio/vnd.dts".equals(d) || "audio/vnd.dts.hd".equals(d)) {
            return new vy(d, (byte[]) null, -1, -1);
        }
        l8b.H(4);
        long w = l8b.w();
        long w2 = l8b.w();
        l8b.H(1);
        int b = b(l8b);
        byte[] bArr = new byte[b];
        l8b.e(0, bArr, b);
        return new vy(d, bArr, w2 > 0 ? w2 : -1, w > 0 ? w : -1);
    }

    public static int b(l8b l8b) {
        int u = l8b.u();
        int i = u & 127;
        while ((u & Uuid.SIZE_BITS) == 128) {
            u = l8b.u();
            i = (i << 7) | (u & 127);
        }
        return i;
    }

    public static tu9 c(l8b l8b) {
        long o;
        long o2;
        l8b.G(8);
        if (ty.y(l8b.g()) == 0) {
            o = l8b.w();
            o2 = l8b.w();
        } else {
            o = l8b.o();
            o2 = l8b.o();
        }
        return new tu9(o, o2, l8b.w());
    }

    public static Pair d(l8b l8b, int i, int i2) {
        Pair pair;
        Integer num;
        ppf ppf;
        int i3;
        int i4;
        byte[] bArr;
        l8b l8b2 = l8b;
        int i5 = l8b2.b;
        while (i5 - i < i2) {
            l8b2.G(i5);
            int g = l8b.g();
            boolean z = false;
            b59.h("childAtomSize must be positive", g > 0);
            if (l8b.g() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                String str = null;
                Integer num2 = null;
                while (i6 - i5 < g) {
                    l8b2.G(i6);
                    int g2 = l8b.g();
                    int g3 = l8b.g();
                    if (g3 == 1718775137) {
                        num2 = Integer.valueOf(l8b.g());
                    } else if (g3 == 1935894637) {
                        l8b2.H(4);
                        str = l8b2.s(4, x22.c);
                    } else if (g3 == 1935894633) {
                        i8 = i6;
                        i7 = g2;
                    }
                    i6 += g2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    b59.h("frma atom is mandatory", num2 != null);
                    b59.h("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = num2;
                            ppf = null;
                            break;
                        }
                        l8b2.G(i9);
                        int g4 = l8b.g();
                        if (l8b.g() == 1952804451) {
                            int y = ty.y(l8b.g());
                            l8b2.H(1);
                            if (y == 0) {
                                l8b2.H(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int u = l8b.u();
                                i4 = u & 15;
                                i3 = (u & 240) >> 4;
                            }
                            boolean z2 = l8b.u() == 1;
                            int u2 = l8b.u();
                            byte[] bArr2 = new byte[16];
                            l8b2.e(0, bArr2, 16);
                            if (!z2 || u2 != 0) {
                                bArr = null;
                            } else {
                                int u3 = l8b.u();
                                byte[] bArr3 = new byte[u3];
                                l8b2.e(0, bArr3, u3);
                                bArr = bArr3;
                            }
                            num = num2;
                            ppf = new ppf(z2, str, u2, bArr2, i3, i4, bArr);
                        } else {
                            Integer num3 = num2;
                            i9 += g4;
                        }
                    }
                    if (ppf != null) {
                        z = true;
                    }
                    b59.h("tenc atom is mandatory", z);
                    int i10 = v0g.a;
                    pair = Pair.create(num, ppf);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    return pair;
                }
            }
            i5 += g;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v7, resolved type: k0d} */
    /* JADX WARNING: type inference failed for: r5v0, types: [yy, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:622:0x0e03, code lost:
        if (r3 != 3) goto L_0x0e0e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:497:0x0ad7  */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x0aff  */
    /* JADX WARNING: Removed duplicated region for block: B:564:0x0c5d  */
    /* JADX WARNING: Removed duplicated region for block: B:565:0x0c5f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.yy e(defpackage.l8b r59, int r60, int r61, java.lang.String r62, defpackage.yv4 r63, boolean r64) {
        /*
            r0 = r59
            r1 = r62
            r2 = r63
            r3 = 12
            r0.G(r3)
            int r4 = r59.g()
            yy r5 = new yy
            r5.<init>()
            ppf[] r6 = new defpackage.ppf[r4]
            r5.c = r6
            r6 = 0
            r5.b = r6
            r7 = 0
        L_0x001c:
            if (r7 >= r4) goto L_0x0f32
            int r8 = r0.b
            int r9 = r59.g()
            if (r9 <= 0) goto L_0x0028
            r11 = 1
            goto L_0x0029
        L_0x0028:
            r11 = 0
        L_0x0029:
            java.lang.String r12 = "childAtomSize must be positive"
            defpackage.b59.h(r12, r11)
            int r11 = r59.g()
            r13 = 1635148593(0x61766331, float:2.840654E20)
            r15 = 1987063864(0x76703038, float:1.21789965E33)
            r14 = 1211250227(0x48323633, float:182488.8)
            r3 = 1831958048(0x6d317620, float:3.4326032E27)
            r10 = 1701733238(0x656e6376, float:7.035987E22)
            if (r11 == r13) goto L_0x0082
            r13 = 1635148595(0x61766333, float:2.8406544E20)
            if (r11 == r13) goto L_0x0082
            if (r11 == r10) goto L_0x0082
            if (r11 == r3) goto L_0x0082
            r13 = 1836070006(0x6d703476, float:4.646239E27)
            if (r11 == r13) goto L_0x0082
            r13 = 1752589105(0x68766331, float:4.6541277E24)
            if (r11 == r13) goto L_0x0082
            r13 = 1751479857(0x68657631, float:4.3344087E24)
            if (r11 == r13) goto L_0x0082
            r13 = 1932670515(0x73323633, float:1.4119387E31)
            if (r11 == r13) goto L_0x0082
            if (r11 == r14) goto L_0x0082
            if (r11 == r15) goto L_0x0082
            r13 = 1987063865(0x76703039, float:1.2178997E33)
            if (r11 == r13) goto L_0x0082
            r13 = 1635135537(0x61763031, float:2.8383572E20)
            if (r11 == r13) goto L_0x0082
            r13 = 1685479798(0x64766176, float:1.8179687E22)
            if (r11 == r13) goto L_0x0082
            r13 = 1685479729(0x64766131, float:1.817961E22)
            if (r11 == r13) goto L_0x0082
            r13 = 1685481573(0x64766865, float:1.8181686E22)
            if (r11 == r13) goto L_0x0082
            r13 = 1685481521(0x64766831, float:1.8181627E22)
            if (r11 != r13) goto L_0x008c
        L_0x0082:
            r43 = r4
            r20 = r7
            r24 = r8
            r23 = r9
            goto L_0x086c
        L_0x008c:
            r13 = 1836069985(0x6d703461, float:4.6462328E27)
            r6 = 1835823201(0x6d6c7061, float:4.573395E27)
            r3 = 1633889588(0x61632d34, float:2.6191676E20)
            r10 = 1700998451(0x65632d33, float:6.7050686E22)
            r14 = 1633889587(0x61632d33, float:2.6191674E20)
            r15 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r11 == r13) goto L_0x01ef
            if (r11 == r15) goto L_0x01ef
            if (r11 == r14) goto L_0x01ef
            if (r11 == r10) goto L_0x01ef
            if (r11 == r3) goto L_0x01ef
            if (r11 == r6) goto L_0x01ef
            r13 = 1685353315(0x64747363, float:1.803728E22)
            if (r11 == r13) goto L_0x01ef
            r13 = 1685353317(0x64747365, float:1.8037282E22)
            if (r11 == r13) goto L_0x01ef
            r13 = 1685353320(0x64747368, float:1.8037286E22)
            if (r11 == r13) goto L_0x01ef
            r13 = 1685353324(0x6474736c, float:1.803729E22)
            if (r11 == r13) goto L_0x01ef
            r13 = 1685353336(0x64747378, float:1.8037304E22)
            if (r11 == r13) goto L_0x01ef
            r13 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r11 == r13) goto L_0x01ef
            r13 = 1935767394(0x73617762, float:1.7863284E31)
            if (r11 == r13) goto L_0x01ef
            r13 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r11 == r13) goto L_0x01ef
            r13 = 1936684916(0x736f7774, float:1.89725E31)
            if (r11 == r13) goto L_0x01ef
            r13 = 1953984371(0x74776f73, float:7.841539E31)
            if (r11 == r13) goto L_0x01ef
            r13 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r11 == r13) goto L_0x01ef
            r13 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r11 == r13) goto L_0x01ef
            r13 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r11 == r13) goto L_0x01ef
            r13 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r11 == r13) goto L_0x01ef
            r13 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r11 == r13) goto L_0x01ef
            r13 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r11 == r13) goto L_0x01ef
            r13 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r11 == r13) goto L_0x01ef
            r13 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r11 == r13) goto L_0x01ef
            r13 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r11 != r13) goto L_0x010b
            goto L_0x01ef
        L_0x010b:
            r3 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r11 == r3) goto L_0x0182
            r3 = 1954034535(0x74783367, float:7.865797E31)
            if (r11 == r3) goto L_0x0182
            r3 = 2004251764(0x77767474, float:4.998699E33)
            if (r11 == r3) goto L_0x0182
            r3 = 1937010800(0x73747070, float:1.9366469E31)
            if (r11 == r3) goto L_0x0182
            r3 = 1664495672(0x63363038, float:3.360782E21)
            if (r11 != r3) goto L_0x0125
            goto L_0x0182
        L_0x0125:
            r3 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r11 != r3) goto L_0x0162
            int r3 = r8 + 16
            r0.G(r3)
            r3 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r11 != r3) goto L_0x0155
            r59.p()
            java.lang.String r3 = r59.p()
            if (r3 == 0) goto L_0x0155
            ba6 r6 = new ba6
            r6.<init>()
            java.lang.String r10 = java.lang.Integer.toString(r60)
            r6.a = r10
            java.lang.String r3 = defpackage.vq9.l(r3)
            r6.m = r3
            ea6 r3 = new ea6
            r3.<init>(r6)
            r5.o = r3
        L_0x0155:
            r3 = r61
            r43 = r4
            r1 = r5
            r20 = r7
            r19 = r8
            r36 = r9
            goto L_0x0f20
        L_0x0162:
            r3 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r11 != r3) goto L_0x0155
            ba6 r3 = new ba6
            r3.<init>()
            java.lang.String r6 = java.lang.Integer.toString(r60)
            r3.a = r6
            java.lang.String r6 = "application/x-camera-motion"
            java.lang.String r6 = defpackage.vq9.l(r6)
            r3.m = r6
            ea6 r6 = new ea6
            r6.<init>(r3)
            r5.o = r6
            goto L_0x0155
        L_0x0182:
            int r3 = r8 + 16
            r0.G(r3)
            r3 = 1414810956(0x54544d4c, float:3.64731957E12)
            java.lang.String r6 = "application/ttml+xml"
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r11 != r3) goto L_0x0195
        L_0x0193:
            r3 = 0
            goto L_0x01c9
        L_0x0195:
            r3 = 1954034535(0x74783367, float:7.865797E31)
            if (r11 != r3) goto L_0x01ae
            int r3 = r9 + -16
            byte[] r6 = new byte[r3]
            r10 = 0
            r0.e(r10, r6, r3)
            k0d r6 = defpackage.tb7.t(r6)
            java.lang.String r3 = "application/x-quicktime-tx3g"
            r58 = r6
            r6 = r3
            r3 = r58
            goto L_0x01c9
        L_0x01ae:
            r3 = 2004251764(0x77767474, float:4.998699E33)
            if (r11 != r3) goto L_0x01b6
            java.lang.String r6 = "application/x-mp4-vtt"
            goto L_0x0193
        L_0x01b6:
            r3 = 1937010800(0x73747070, float:1.9366469E31)
            if (r11 != r3) goto L_0x01be
            r12 = 0
            goto L_0x0193
        L_0x01be:
            r3 = 1664495672(0x63363038, float:3.360782E21)
            if (r11 != r3) goto L_0x01e9
            r3 = 1
            r5.b = r3
            java.lang.String r6 = "application/x-mp4-cea-608"
            goto L_0x0193
        L_0x01c9:
            ba6 r10 = new ba6
            r10.<init>()
            java.lang.String r11 = java.lang.Integer.toString(r60)
            r10.a = r11
            java.lang.String r6 = defpackage.vq9.l(r6)
            r10.m = r6
            r10.d = r1
            r10.r = r12
            r10.p = r3
            ea6 r3 = new ea6
            r3.<init>(r10)
            r5.o = r3
            goto L_0x0155
        L_0x01e9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x01ef:
            int r13 = r8 + 16
            r0.G(r13)
            r13 = 6
            if (r64 == 0) goto L_0x0201
            int r35 = r59.A()
            r0.H(r13)
            r6 = r35
            goto L_0x0207
        L_0x0201:
            r6 = 8
            r0.H(r6)
            r6 = 0
        L_0x0207:
            r35 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = 32
            if (r6 == 0) goto L_0x028b
            r10 = 1
            if (r6 != r10) goto L_0x0212
            goto L_0x028b
        L_0x0212:
            r10 = 2
            if (r6 != r10) goto L_0x0281
            r6 = 16
            r0.H(r6)
            long r41 = r59.o()
            double r41 = java.lang.Double.longBitsToDouble(r41)
            long r14 = java.lang.Math.round(r41)
            int r6 = (int) r14
            int r14 = r59.y()
            r15 = 4
            r0.H(r15)
            int r15 = r59.y()
            int r41 = r59.y()
            r42 = r41 & 1
            if (r42 == 0) goto L_0x023e
            r42 = 1
            goto L_0x0240
        L_0x023e:
            r42 = 0
        L_0x0240:
            r41 = r41 & 2
            if (r41 == 0) goto L_0x0247
            r41 = 1
            goto L_0x0249
        L_0x0247:
            r41 = 0
        L_0x0249:
            if (r42 != 0) goto L_0x0275
            r10 = 8
            if (r15 != r10) goto L_0x0252
            r15 = r10
            r10 = 3
            goto L_0x027b
        L_0x0252:
            r10 = 16
            if (r15 != r10) goto L_0x025f
            if (r41 == 0) goto L_0x025b
            r10 = r35
            goto L_0x025c
        L_0x025b:
            r10 = 2
        L_0x025c:
            r15 = 8
            goto L_0x027b
        L_0x025f:
            r10 = 24
            if (r15 != r10) goto L_0x026b
            if (r41 == 0) goto L_0x0268
            r10 = 1342177280(0x50000000, float:8.5899346E9)
            goto L_0x025c
        L_0x0268:
            r10 = 21
            goto L_0x025c
        L_0x026b:
            if (r15 != r3) goto L_0x0279
            if (r41 == 0) goto L_0x0272
            r10 = 1610612736(0x60000000, float:3.6893488E19)
            goto L_0x025c
        L_0x0272:
            r10 = 22
            goto L_0x025c
        L_0x0275:
            if (r15 != r3) goto L_0x0279
            r10 = 4
            goto L_0x025c
        L_0x0279:
            r10 = -1
            goto L_0x025c
        L_0x027b:
            r0.H(r15)
            r3 = r10
            r10 = 0
            goto L_0x02ae
        L_0x0281:
            r43 = r4
            r20 = r7
            r24 = r8
            r23 = r9
            goto L_0x0863
        L_0x028b:
            int r14 = r59.A()
            r0.H(r13)
            int r10 = r59.v()
            int r15 = r0.b
            r16 = 4
            int r15 = r15 + -4
            r0.G(r15)
            int r15 = r59.g()
            r3 = 1
            if (r6 != r3) goto L_0x02ab
            r3 = 16
            r0.H(r3)
        L_0x02ab:
            r6 = r10
            r10 = r15
            r3 = -1
        L_0x02ae:
            int r15 = r0.b
            r13 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r11 != r13) goto L_0x02eb
            android.util.Pair r13 = d(r0, r8, r9)
            if (r13 == 0) goto L_0x02e4
            java.lang.Object r11 = r13.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r2 != 0) goto L_0x02c9
            r43 = r4
            r4 = 0
            goto L_0x02d5
        L_0x02c9:
            r43 = r4
            java.lang.Object r4 = r13.second
            ppf r4 = (defpackage.ppf) r4
            java.lang.String r4 = r4.b
            yv4 r4 = r2.a(r4)
        L_0x02d5:
            java.lang.Object r13 = r13.second
            ppf r13 = (defpackage.ppf) r13
            r44 = r4
            java.lang.Object r4 = r5.c
            ppf[] r4 = (defpackage.ppf[]) r4
            r4[r7] = r13
            r4 = r44
            goto L_0x02e7
        L_0x02e4:
            r43 = r4
            r4 = r2
        L_0x02e7:
            r0.G(r15)
            goto L_0x02ee
        L_0x02eb:
            r43 = r4
            r4 = r2
        L_0x02ee:
            java.lang.String r13 = "audio/mhm1"
            java.lang.String r44 = "audio/ac4"
            java.lang.String r45 = "audio/eac3"
            java.lang.String r46 = "audio/ac3"
            r47 = r6
            r6 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r11 != r6) goto L_0x0301
            r6 = r46
            goto L_0x03c2
        L_0x0301:
            r6 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r11 != r6) goto L_0x030a
            r6 = r45
            goto L_0x03c2
        L_0x030a:
            r6 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r11 != r6) goto L_0x0313
            r6 = r44
            goto L_0x03c2
        L_0x0313:
            r6 = 1685353315(0x64747363, float:1.803728E22)
            if (r11 != r6) goto L_0x031c
            java.lang.String r6 = "audio/vnd.dts"
            goto L_0x03c2
        L_0x031c:
            r6 = 1685353320(0x64747368, float:1.8037286E22)
            if (r11 == r6) goto L_0x03c0
            r6 = 1685353324(0x6474736c, float:1.803729E22)
            if (r11 != r6) goto L_0x0328
            goto L_0x03c0
        L_0x0328:
            r6 = 1685353317(0x64747365, float:1.8037282E22)
            if (r11 != r6) goto L_0x0331
            java.lang.String r6 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x03c2
        L_0x0331:
            r6 = 1685353336(0x64747378, float:1.8037304E22)
            if (r11 != r6) goto L_0x033a
            java.lang.String r6 = "audio/vnd.dts.uhd;profile=p2"
            goto L_0x03c2
        L_0x033a:
            r6 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r11 != r6) goto L_0x0343
            java.lang.String r6 = "audio/3gpp"
            goto L_0x03c2
        L_0x0343:
            r6 = 1935767394(0x73617762, float:1.7863284E31)
            if (r11 != r6) goto L_0x034c
            java.lang.String r6 = "audio/amr-wb"
            goto L_0x03c2
        L_0x034c:
            java.lang.String r6 = "audio/raw"
            r29 = r6
            r6 = 1936684916(0x736f7774, float:1.89725E31)
            if (r11 != r6) goto L_0x035a
        L_0x0355:
            r6 = r29
            r3 = 2
            goto L_0x03c2
        L_0x035a:
            r6 = 1953984371(0x74776f73, float:7.841539E31)
            if (r11 != r6) goto L_0x0365
            r6 = r29
            r3 = r35
            goto L_0x03c2
        L_0x0365:
            r6 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r11 != r6) goto L_0x0371
            r6 = -1
            if (r3 != r6) goto L_0x036e
            goto L_0x0355
        L_0x036e:
            r6 = r29
            goto L_0x03c2
        L_0x0371:
            r6 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r11 == r6) goto L_0x03bd
            r6 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r11 != r6) goto L_0x037c
            goto L_0x03bd
        L_0x037c:
            r6 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r11 != r6) goto L_0x0384
            java.lang.String r6 = "audio/mha1"
            goto L_0x03c2
        L_0x0384:
            r6 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r11 != r6) goto L_0x038b
            r6 = r13
            goto L_0x03c2
        L_0x038b:
            r6 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r11 != r6) goto L_0x0393
            java.lang.String r6 = "audio/alac"
            goto L_0x03c2
        L_0x0393:
            r6 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r11 != r6) goto L_0x039b
            java.lang.String r6 = "audio/g711-alaw"
            goto L_0x03c2
        L_0x039b:
            r6 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r11 != r6) goto L_0x03a3
            java.lang.String r6 = "audio/g711-mlaw"
            goto L_0x03c2
        L_0x03a3:
            r6 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r11 != r6) goto L_0x03ab
            java.lang.String r6 = "audio/opus"
            goto L_0x03c2
        L_0x03ab:
            r6 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r11 != r6) goto L_0x03b3
            java.lang.String r6 = "audio/flac"
            goto L_0x03c2
        L_0x03b3:
            r6 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r11 != r6) goto L_0x03bb
            java.lang.String r6 = "audio/true-hd"
            goto L_0x03c2
        L_0x03bb:
            r6 = 0
            goto L_0x03c2
        L_0x03bd:
            java.lang.String r6 = "audio/mpeg"
            goto L_0x03c2
        L_0x03c0:
            java.lang.String r6 = "audio/vnd.dts.hd"
        L_0x03c2:
            r22 = r3
            r20 = r7
            r11 = r47
            r2 = 0
            r7 = 0
            r48 = 0
        L_0x03cc:
            int r3 = r15 - r8
            if (r3 >= r9) goto L_0x0812
            r0.G(r15)
            int r3 = r59.g()
            r23 = r9
            if (r3 <= 0) goto L_0x03dd
            r9 = 1
            goto L_0x03de
        L_0x03dd:
            r9 = 0
        L_0x03de:
            defpackage.b59.h(r12, r9)
            int r9 = r59.g()
            r24 = r8
            r8 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r9 != r8) goto L_0x0444
            int r7 = r15 + 8
            r0.G(r7)
            r7 = 1
            r0.H(r7)
            int r8 = r59.u()
            r0.H(r7)
            boolean r7 = java.util.Objects.equals(r6, r13)
            if (r7 == 0) goto L_0x0411
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r8 = "mhm1.%02X"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            goto L_0x041f
        L_0x0411:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r8 = "mha1.%02X"
            java.lang.String r7 = java.lang.String.format(r8, r7)
        L_0x041f:
            int r8 = r59.A()
            byte[] r9 = new byte[r8]
            r25 = r7
            r7 = 0
            r0.e(r7, r9, r8)
            if (r2 != 0) goto L_0x0432
            k0d r2 = defpackage.tb7.t(r9)
            goto L_0x043c
        L_0x0432:
            java.lang.Object r2 = r2.get(r7)
            byte[] r2 = (byte[]) r2
            k0d r2 = defpackage.tb7.u(r9, r2)
        L_0x043c:
            r29 = r10
            r7 = r25
            r25 = r13
            goto L_0x0807
        L_0x0444:
            r8 = 1835557200(0x6d686150, float:4.4948854E27)
            if (r9 != r8) goto L_0x0474
            int r8 = r15 + 8
            r0.G(r8)
            int r8 = r59.u()
            if (r8 <= 0) goto L_0x046e
            byte[] r9 = new byte[r8]
            r25 = r13
            r13 = 0
            r0.e(r13, r9, r8)
            if (r2 != 0) goto L_0x0463
            k0d r2 = defpackage.tb7.t(r9)
            goto L_0x0470
        L_0x0463:
            java.lang.Object r2 = r2.get(r13)
            byte[] r2 = (byte[]) r2
            k0d r2 = defpackage.tb7.u(r2, r9)
            goto L_0x0470
        L_0x046e:
            r25 = r13
        L_0x0470:
            r29 = r10
            goto L_0x0807
        L_0x0474:
            r25 = r13
            r8 = 1702061171(0x65736473, float:7.183675E22)
            if (r9 == r8) goto L_0x0482
            if (r64 == 0) goto L_0x0491
            r13 = 2002876005(0x77617665, float:4.5729223E33)
            if (r9 != r13) goto L_0x0491
        L_0x0482:
            r26 = r2
            r27 = r7
            r13 = r11
            r28 = r12
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r11 = 32
            r12 = 3
            goto L_0x0710
        L_0x0491:
            r8 = 1684103987(0x64616333, float:1.6630662E22)
            if (r9 != r8) goto L_0x050c
            int r8 = r15 + 8
            r0.G(r8)
            java.lang.String r8 = java.lang.Integer.toString(r60)
            ky1 r9 = new ky1
            r13 = 2
            r9.<init>(r13)
            r9.p(r0)
            r13 = 2
            int r26 = r9.i(r13)
            int[] r13 = defpackage.ev0.b
            r13 = r13[r26]
            r26 = r2
            r2 = 8
            r9.t(r2)
            int[] r2 = defpackage.ev0.d
            r27 = r7
            r7 = 3
            int r28 = r9.i(r7)
            r2 = r2[r28]
            r7 = 1
            int r28 = r9.i(r7)
            if (r28 == 0) goto L_0x04cc
            int r2 = r2 + 1
        L_0x04cc:
            r7 = 5
            int r28 = r9.i(r7)
            int[] r7 = defpackage.ev0.e
            r7 = r7[r28]
            int r7 = r7 * 1000
            r9.c()
            int r9 = r9.f()
            r0.G(r9)
            ba6 r9 = new ba6
            r9.<init>()
            r9.a = r8
            java.lang.String r8 = defpackage.vq9.l(r46)
            r9.m = r8
            r9.A = r2
            r9.B = r13
            r9.q = r4
            r9.d = r1
            r9.g = r7
            r9.h = r7
            ea6 r2 = new ea6
            r2.<init>(r9)
            r5.o = r2
            r13 = r11
            r28 = r12
        L_0x0504:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r11 = 32
        L_0x0509:
            r12 = 3
            goto L_0x070a
        L_0x050c:
            r26 = r2
            r27 = r7
            r2 = 1684366131(0x64656333, float:1.692581E22)
            if (r9 != r2) goto L_0x05ba
            int r2 = r15 + 8
            r0.G(r2)
            java.lang.String r2 = java.lang.Integer.toString(r60)
            ky1 r7 = new ky1
            r8 = 2
            r7.<init>(r8)
            r7.p(r0)
            r8 = 13
            int r8 = r7.i(r8)
            int r8 = r8 * 1000
            r9 = 3
            r7.t(r9)
            r13 = 2
            int r28 = r7.i(r13)
            int[] r13 = defpackage.ev0.b
            r13 = r13[r28]
            r9 = 10
            r7.t(r9)
            int[] r9 = defpackage.ev0.d
            r28 = r12
            r12 = 3
            int r29 = r7.i(r12)
            r9 = r9[r29]
            r12 = 1
            int r18 = r7.i(r12)
            if (r18 == 0) goto L_0x0555
            int r9 = r9 + 1
        L_0x0555:
            r12 = 3
            r7.t(r12)
            r12 = 4
            int r29 = r7.i(r12)
            r12 = 1
            r7.t(r12)
            if (r29 <= 0) goto L_0x0576
            r29 = r11
            r11 = 6
            r7.t(r11)
            int r17 = r7.i(r12)
            if (r17 == 0) goto L_0x0572
            int r9 = r9 + 2
        L_0x0572:
            r7.t(r12)
            goto L_0x0578
        L_0x0576:
            r29 = r11
        L_0x0578:
            int r11 = r7.b()
            r12 = 7
            if (r11 <= r12) goto L_0x058c
            r7.t(r12)
            r11 = 1
            int r12 = r7.i(r11)
            if (r12 == 0) goto L_0x058c
            java.lang.String r11 = "audio/eac3-joc"
            goto L_0x058e
        L_0x058c:
            r11 = r45
        L_0x058e:
            r7.c()
            int r7 = r7.f()
            r0.G(r7)
            ba6 r7 = new ba6
            r7.<init>()
            r7.a = r2
            java.lang.String r2 = defpackage.vq9.l(r11)
            r7.m = r2
            r7.A = r9
            r7.B = r13
            r7.q = r4
            r7.d = r1
            r7.h = r8
            ea6 r2 = new ea6
            r2.<init>(r7)
            r5.o = r2
            r13 = r29
            goto L_0x0504
        L_0x05ba:
            r29 = r11
            r28 = r12
            r2 = 1684103988(0x64616334, float:1.6630663E22)
            if (r9 != r2) goto L_0x0606
            int r2 = r15 + 8
            r0.G(r2)
            java.lang.String r2 = java.lang.Integer.toString(r60)
            r7 = 1
            r0.H(r7)
            int r8 = r59.u()
            r11 = 32
            r8 = r8 & r11
            r9 = 5
            int r8 = r8 >> r9
            if (r8 != r7) goto L_0x05df
            r7 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x05e2
        L_0x05df:
            r7 = 44100(0xac44, float:6.1797E-41)
        L_0x05e2:
            ba6 r8 = new ba6
            r8.<init>()
            r8.a = r2
            java.lang.String r2 = defpackage.vq9.l(r44)
            r8.m = r2
            r2 = 2
            r8.A = r2
            r8.B = r7
            r8.q = r4
            r8.d = r1
            ea6 r2 = new ea6
            r2.<init>(r8)
            r5.o = r2
            r13 = r29
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x0509
        L_0x0606:
            r11 = 32
            r2 = 1684892784(0x646d6c70, float:1.7518768E22)
            if (r9 != r2) goto L_0x062f
            if (r10 <= 0) goto L_0x061b
            r11 = r10
            r29 = r11
            r2 = r26
            r7 = r27
            r12 = r28
            r14 = 2
            goto L_0x0807
        L_0x061b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid sample rate for Dolby TrueHD MLP stream: "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x062f:
            r2 = 1684305011(0x64647473, float:1.6856995E22)
            if (r9 == r2) goto L_0x0639
            r2 = 1969517683(0x75647473, float:2.8960097E32)
            if (r9 != r2) goto L_0x063f
        L_0x0639:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r12 = 3
            goto L_0x06e8
        L_0x063f:
            r2 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r9 != r2) goto L_0x0663
            int r2 = r3 + -8
            byte[] r7 = a
            int r8 = r7.length
            int r8 = r8 + r2
            byte[] r8 = java.util.Arrays.copyOf(r7, r8)
            int r9 = r15 + 8
            r0.G(r9)
            int r7 = r7.length
            r0.e(r7, r8, r2)
            java.util.ArrayList r2 = defpackage.hi7.c(r8)
        L_0x065b:
            r7 = r27
            r12 = r28
            r11 = r29
            goto L_0x0470
        L_0x0663:
            r2 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r9 != r2) goto L_0x0690
            int r2 = r3 + -12
            int r7 = r3 + -8
            byte[] r7 = new byte[r7]
            r8 = 102(0x66, float:1.43E-43)
            r9 = 0
            r7[r9] = r8
            r8 = 76
            r9 = 1
            r7[r9] = r8
            r8 = 97
            r9 = 2
            r7[r9] = r8
            r8 = 67
            r12 = 3
            r7[r12] = r8
            int r8 = r15 + 12
            r0.G(r8)
            r8 = 4
            r0.e(r8, r7, r2)
            k0d r2 = defpackage.tb7.t(r7)
            goto L_0x065b
        L_0x0690:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r12 = 3
            if (r9 != r2) goto L_0x06e5
            int r7 = r3 + -12
            byte[] r8 = new byte[r7]
            int r9 = r15 + 12
            r0.G(r9)
            r9 = 0
            r0.e(r9, r8, r7)
            l8b r7 = new l8b
            r7.<init>((byte[]) r8)
            r9 = 9
            r7.G(r9)
            int r9 = r7.u()
            r13 = 20
            r7.G(r13)
            int r7 = r7.y()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r7 = android.util.Pair.create(r7, r9)
            java.lang.Object r9 = r7.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r7 = r7.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            k0d r8 = defpackage.tb7.t(r8)
            r14 = r7
            r2 = r8
            r11 = r9
            r29 = r10
        L_0x06df:
            r7 = r27
            r12 = r28
            goto L_0x0807
        L_0x06e5:
            r13 = r29
            goto L_0x070a
        L_0x06e8:
            ba6 r7 = new ba6
            r7.<init>()
            java.lang.String r8 = java.lang.Integer.toString(r60)
            r7.a = r8
            java.lang.String r8 = defpackage.vq9.l(r6)
            r7.m = r8
            r7.A = r14
            r13 = r29
            r7.B = r13
            r7.q = r4
            r7.d = r1
            ea6 r8 = new ea6
            r8.<init>(r7)
            r5.o = r8
        L_0x070a:
            r29 = r10
            r11 = r13
            r2 = r26
            goto L_0x06df
        L_0x0710:
            if (r9 != r8) goto L_0x0717
            r7 = r15
            r12 = r28
        L_0x0715:
            r2 = -1
            goto L_0x0747
        L_0x0717:
            int r7 = r0.b
            r2 = 0
            if (r7 < r15) goto L_0x071e
            r9 = 1
            goto L_0x071f
        L_0x071e:
            r9 = 0
        L_0x071f:
            defpackage.b59.h(r2, r9)
        L_0x0722:
            int r2 = r7 - r15
            if (r2 >= r3) goto L_0x0743
            r0.G(r7)
            int r2 = r59.g()
            r12 = r28
            if (r2 <= 0) goto L_0x0733
            r9 = 1
            goto L_0x0734
        L_0x0733:
            r9 = 0
        L_0x0734:
            defpackage.b59.h(r12, r9)
            int r9 = r59.g()
            if (r9 != r8) goto L_0x073e
            goto L_0x0715
        L_0x073e:
            int r7 = r7 + r2
            r28 = r12
            r12 = 3
            goto L_0x0722
        L_0x0743:
            r12 = r28
            r7 = -1
            goto L_0x0715
        L_0x0747:
            if (r7 == r2) goto L_0x0800
            vy r6 = a(r7, r0)
            java.lang.Object r7 = r6.o
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r6.v
            byte[] r8 = (byte[]) r8
            if (r8 == 0) goto L_0x07f7
            java.lang.String r9 = "audio/vorbis"
            boolean r9 = r9.equals(r7)
            if (r9 == 0) goto L_0x07ce
            l8b r9 = new l8b
            r9.<init>((byte[]) r8)
            r2 = 1
            r9.H(r2)
            r2 = 0
        L_0x0769:
            int r26 = r9.a()
            if (r26 <= 0) goto L_0x0787
            byte[] r11 = r9.a
            r28 = r6
            int r6 = r9.b
            byte r6 = r11[r6]
            r11 = 255(0xff, float:3.57E-43)
            r6 = r6 & r11
            if (r6 != r11) goto L_0x0789
            int r2 = r2 + 255
            r6 = 1
            r9.H(r6)
            r6 = r28
            r11 = 32
            goto L_0x0769
        L_0x0787:
            r28 = r6
        L_0x0789:
            int r6 = r9.u()
            int r6 = r6 + r2
            r2 = 0
        L_0x078f:
            int r11 = r9.a()
            if (r11 <= 0) goto L_0x07ab
            byte[] r11 = r9.a
            r29 = r10
            int r10 = r9.b
            byte r10 = r11[r10]
            r11 = 255(0xff, float:3.57E-43)
            r10 = r10 & r11
            if (r10 != r11) goto L_0x07ad
            int r2 = r2 + 255
            r10 = 1
            r9.H(r10)
            r10 = r29
            goto L_0x078f
        L_0x07ab:
            r29 = r10
        L_0x07ad:
            int r10 = r9.u()
            int r10 = r10 + r2
            byte[] r2 = new byte[r6]
            int r9 = r9.b
            r11 = 0
            java.lang.System.arraycopy(r8, r9, r2, r11, r6)
            int r9 = r9 + r6
            int r9 = r9 + r10
            int r6 = r8.length
            int r6 = r6 - r9
            byte[] r10 = new byte[r6]
            java.lang.System.arraycopy(r8, r9, r10, r11, r6)
            k0d r2 = defpackage.tb7.u(r2, r10)
            r6 = r7
            r11 = r13
        L_0x07c9:
            r7 = r27
            r48 = r28
            goto L_0x0807
        L_0x07ce:
            r28 = r6
            r29 = r10
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x07f0
            ky1 r2 = new ky1
            int r6 = r8.length
            r9 = 2
            r10 = 0
            r2.<init>((byte[]) r8, (byte) r10, (int) r6, (int) r9)
            r6 = 0
            e r2 = defpackage.iq.T(r2, r6)
            int r11 = r2.a
            int r14 = r2.b
            java.lang.String r2 = r2.c
            r27 = r2
            goto L_0x07f1
        L_0x07f0:
            r11 = r13
        L_0x07f1:
            k0d r2 = defpackage.tb7.t(r8)
            r6 = r7
            goto L_0x07c9
        L_0x07f7:
            r28 = r6
            r29 = r10
            r6 = r7
            r11 = r13
            r2 = r26
            goto L_0x07c9
        L_0x0800:
            r29 = r10
            r11 = r13
            r2 = r26
            r7 = r27
        L_0x0807:
            int r15 = r15 + r3
            r9 = r23
            r8 = r24
            r13 = r25
            r10 = r29
            goto L_0x03cc
        L_0x0812:
            r26 = r2
            r27 = r7
            r24 = r8
            r23 = r9
            r13 = r11
            java.lang.Object r2 = r5.o
            ea6 r2 = (defpackage.ea6) r2
            if (r2 != 0) goto L_0x0863
            if (r6 == 0) goto L_0x0863
            ba6 r2 = new ba6
            r2.<init>()
            java.lang.String r3 = java.lang.Integer.toString(r60)
            r2.a = r3
            java.lang.String r3 = defpackage.vq9.l(r6)
            r2.m = r3
            r7 = r27
            r2.i = r7
            r2.A = r14
            r2.B = r13
            r3 = r22
            r2.C = r3
            r3 = r26
            r2.p = r3
            r2.q = r4
            r2.d = r1
            r3 = r48
            if (r3 == 0) goto L_0x085c
            long r6 = r3.b
            int r4 = defpackage.cvg.K(r6)
            r2.g = r4
            long r3 = r3.c
            int r3 = defpackage.cvg.K(r3)
            r2.h = r3
        L_0x085c:
            ea6 r3 = new ea6
            r3.<init>(r2)
            r5.o = r3
        L_0x0863:
            r3 = r61
            r1 = r5
            r36 = r23
            r19 = r24
            goto L_0x0f20
        L_0x086c:
            int r8 = r24 + 16
            r0.G(r8)
            r2 = 16
            r0.H(r2)
            int r2 = r59.A()
            int r4 = r59.A()
            r6 = 50
            r0.H(r6)
            int r6 = r0.b
            if (r11 != r10) goto L_0x08bb
            r8 = r23
            r7 = r24
            android.util.Pair r9 = d(r0, r7, r8)
            if (r9 == 0) goto L_0x08b4
            java.lang.Object r10 = r9.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r11 = r10.intValue()
            r10 = r63
            if (r10 != 0) goto L_0x089f
            r13 = 0
            goto L_0x08a9
        L_0x089f:
            java.lang.Object r13 = r9.second
            ppf r13 = (defpackage.ppf) r13
            java.lang.String r13 = r13.b
            yv4 r13 = r10.a(r13)
        L_0x08a9:
            java.lang.Object r9 = r9.second
            ppf r9 = (defpackage.ppf) r9
            java.lang.Object r15 = r5.c
            ppf[] r15 = (defpackage.ppf[]) r15
            r15[r20] = r9
            goto L_0x08b7
        L_0x08b4:
            r10 = r63
            r13 = r10
        L_0x08b7:
            r0.G(r6)
            goto L_0x08c2
        L_0x08bb:
            r10 = r63
            r8 = r23
            r7 = r24
            r13 = r10
        L_0x08c2:
            java.lang.String r9 = "video/3gpp"
            if (r11 != r3) goto L_0x08c9
            java.lang.String r3 = "video/mpeg"
            goto L_0x08ce
        L_0x08c9:
            if (r11 != r14) goto L_0x08cd
            r3 = r9
            goto L_0x08ce
        L_0x08cd:
            r3 = 0
        L_0x08ce:
            r15 = 1065353216(0x3f800000, float:1.0)
            r22 = r3
            r14 = r6
            r25 = r9
            r27 = r13
            r9 = r15
            r1 = -1
            r6 = 0
            r10 = -1
            r13 = -1
            r15 = 0
            r21 = 0
            r24 = 0
            r26 = -1
            r28 = 8
            r29 = 8
            r30 = 0
            r49 = 0
            r50 = -1
        L_0x08ed:
            int r3 = r14 - r7
            if (r3 >= r8) goto L_0x0e9a
            r0.G(r14)
            int r3 = r0.b
            r31 = r1
            int r1 = r59.g()
            r32 = r15
            if (r1 != 0) goto L_0x0914
            int r15 = r0.b
            int r15 = r15 - r7
            if (r15 != r8) goto L_0x0914
            r42 = r2
            r39 = r4
            r37 = r5
            r19 = r7
            r36 = r8
            r38 = r9
        L_0x0911:
            r2 = 0
            goto L_0x0eac
        L_0x0914:
            if (r1 <= 0) goto L_0x0918
            r15 = 1
            goto L_0x0919
        L_0x0918:
            r15 = 0
        L_0x0919:
            defpackage.b59.h(r12, r15)
            int r15 = r59.g()
            r33 = r12
            r12 = 1635148611(0x61766343, float:2.8406573E20)
            if (r15 != r12) goto L_0x097a
            if (r22 != 0) goto L_0x092c
            r6 = 1
        L_0x092a:
            r10 = 0
            goto L_0x092e
        L_0x092c:
            r6 = 0
            goto L_0x092a
        L_0x092e:
            defpackage.b59.h(r10, r6)
            int r3 = r3 + 8
            r0.G(r3)
            ke0 r3 = defpackage.ke0.a(r59)
            int r6 = r3.b
            r5.a = r6
            if (r24 != 0) goto L_0x0942
            float r9 = r3.k
        L_0x0942:
            java.lang.String r6 = "video/avc"
            java.util.List r10 = r3.a
            java.lang.String r12 = r3.l
            int r13 = r3.j
            int r15 = r3.g
            r22 = r6
            int r6 = r3.h
            r26 = r6
            int r6 = r3.i
            r28 = r6
            int r6 = r3.e
            int r3 = r3.f
            r42 = r2
            r29 = r3
            r39 = r4
            r37 = r5
            r19 = r7
            r36 = r8
            r30 = r10
            r34 = r11
            r50 = r13
            r10 = r15
            r13 = r28
            r15 = r32
            r2 = 0
            r3 = -1
            r5 = 1
            r8 = 2
            r28 = r6
            r6 = r12
            goto L_0x0e87
        L_0x097a:
            r12 = 1752589123(0x68766343, float:4.6541328E24)
            if (r15 != r12) goto L_0x09d4
            if (r22 != 0) goto L_0x0984
            r6 = 1
        L_0x0982:
            r10 = 0
            goto L_0x0986
        L_0x0984:
            r6 = 0
            goto L_0x0982
        L_0x0986:
            defpackage.b59.h(r10, r6)
            int r3 = r3 + 8
            r0.G(r3)
            ey6 r3 = defpackage.ey6.a(r59)
            int r6 = r3.b
            r5.a = r6
            if (r24 != 0) goto L_0x099a
            float r9 = r3.h
        L_0x099a:
            java.lang.String r6 = "video/hevc"
            java.util.List r10 = r3.a
            int r12 = r3.i
            java.lang.String r13 = r3.j
            int r15 = r3.e
            r22 = r6
            int r6 = r3.f
            r26 = r6
            int r6 = r3.g
            r28 = r6
            int r6 = r3.c
            int r3 = r3.d
            r42 = r2
            r29 = r3
            r39 = r4
            r37 = r5
            r19 = r7
            r36 = r8
            r30 = r10
            r34 = r11
            r50 = r12
            r10 = r15
            r15 = r32
            r2 = 0
            r3 = -1
            r5 = 1
            r8 = 2
            r58 = r28
            r28 = r6
            r6 = r13
            r13 = r58
            goto L_0x0e87
        L_0x09d4:
            r12 = 1685480259(0x64766343, float:1.8180206E22)
            if (r15 == r12) goto L_0x09de
            r12 = 1685485123(0x64767643, float:1.8185683E22)
            if (r15 != r12) goto L_0x09f2
        L_0x09de:
            r42 = r2
            r39 = r4
            r37 = r5
            r19 = r7
            r36 = r8
            r38 = r9
            r34 = r11
            r2 = 0
            r3 = -1
            r5 = 1
            r8 = 2
            goto L_0x0e7c
        L_0x09f2:
            r12 = 1987076931(0x76706343, float:1.21891066E33)
            if (r15 != r12) goto L_0x0a55
            if (r22 != 0) goto L_0x09fc
            r10 = 1
        L_0x09fa:
            r12 = 0
            goto L_0x09fe
        L_0x09fc:
            r10 = 0
            goto L_0x09fa
        L_0x09fe:
            defpackage.b59.h(r12, r10)
            r12 = 1987063864(0x76703038, float:1.21789965E33)
            if (r11 != r12) goto L_0x0a09
            java.lang.String r10 = "video/x-vnd.on2.vp8"
            goto L_0x0a0b
        L_0x0a09:
            java.lang.String r10 = "video/x-vnd.on2.vp9"
        L_0x0a0b:
            int r3 = r3 + 12
            r0.G(r3)
            r3 = 2
            r0.H(r3)
            int r3 = r59.u()
            int r13 = r3 >> 4
            r15 = 1
            r3 = r3 & r15
            if (r3 == 0) goto L_0x0a20
            r3 = 1
            goto L_0x0a21
        L_0x0a20:
            r3 = 0
        L_0x0a21:
            int r15 = r59.u()
            int r17 = r59.u()
            int r15 = defpackage.m53.h(r15)
            if (r3 == 0) goto L_0x0a31
            r3 = 1
            goto L_0x0a32
        L_0x0a31:
            r3 = 2
        L_0x0a32:
            int r17 = defpackage.m53.i(r17)
            r42 = r2
            r26 = r3
            r39 = r4
            r37 = r5
            r19 = r7
            r36 = r8
            r22 = r10
            r34 = r11
            r28 = r13
            r29 = r28
            r10 = r15
            r13 = r17
        L_0x0a4d:
            r15 = r32
        L_0x0a4f:
            r2 = 0
        L_0x0a50:
            r3 = -1
            r5 = 1
        L_0x0a52:
            r8 = 2
            goto L_0x0e87
        L_0x0a55:
            r12 = 1635135811(0x61763143, float:2.8384055E20)
            r34 = r11
            if (r15 != r12) goto L_0x0ca4
            int r10 = r1 + -8
            byte[] r12 = new byte[r10]
            r13 = 0
            r0.e(r13, r12, r10)
            k0d r10 = defpackage.tb7.t(r12)
            int r3 = r3 + 8
            r0.G(r3)
            ky1 r3 = new ky1
            byte[] r12 = r0.a
            int r15 = r12.length
            r13 = 2
            r11 = 0
            r3.<init>((byte[]) r12, (byte) r11, (int) r15, (int) r13)
            int r11 = r0.b
            r12 = 8
            int r11 = r11 * r12
            r3.q(r11)
            r11 = 1
            r3.u(r11)
            r11 = 3
            int r12 = r3.i(r11)
            r11 = 6
            r3.t(r11)
            boolean r11 = r3.h()
            boolean r13 = r3.h()
            r38 = -1
            r15 = 2
            if (r12 != r15) goto L_0x0aae
            if (r11 == 0) goto L_0x0aae
            if (r13 == 0) goto L_0x0aa0
            r11 = 12
            goto L_0x0aa2
        L_0x0aa0:
            r11 = 10
        L_0x0aa2:
            if (r13 == 0) goto L_0x0aa7
            r22 = 12
            goto L_0x0aa9
        L_0x0aa7:
            r22 = 10
        L_0x0aa9:
            r55 = r11
        L_0x0aab:
            r56 = r22
            goto L_0x0ac5
        L_0x0aae:
            if (r12 > r15) goto L_0x0ac1
            if (r11 == 0) goto L_0x0ab5
            r12 = 10
            goto L_0x0ab7
        L_0x0ab5:
            r12 = 8
        L_0x0ab7:
            if (r11 == 0) goto L_0x0abc
            r22 = 10
            goto L_0x0abe
        L_0x0abc:
            r22 = 8
        L_0x0abe:
            r55 = r12
            goto L_0x0aab
        L_0x0ac1:
            r55 = r38
            r56 = r55
        L_0x0ac5:
            r11 = 13
            r3.t(r11)
            r3.s()
            r12 = 4
            int r13 = r3.i(r12)
            r57 = 0
            r12 = 1
            if (r13 == r12) goto L_0x0aff
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r11 = "Unsupported obu_type: "
            r3.<init>(r11)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            defpackage.i8b.F(r3)
            m53 r3 = new m53
            r35 = r3
            r36 = r38
            r37 = r38
            r39 = r55
            r40 = r56
            r41 = r57
            r35.<init>(r36, r37, r38, r39, r40, r41)
        L_0x0af9:
            r26 = r10
            r12 = 8
            goto L_0x0c7a
        L_0x0aff:
            boolean r12 = r3.h()
            if (r12 == 0) goto L_0x0b1c
            java.lang.String r3 = "Unsupported obu_extension_flag"
            defpackage.i8b.F(r3)
            m53 r3 = new m53
            r35 = r3
            r36 = r38
            r37 = r38
            r39 = r55
            r40 = r56
            r41 = r57
            r35.<init>(r36, r37, r38, r39, r40, r41)
            goto L_0x0af9
        L_0x0b1c:
            boolean r12 = r3.h()
            r3.s()
            if (r12 == 0) goto L_0x0b46
            r12 = 8
            int r13 = r3.i(r12)
            r12 = 127(0x7f, float:1.78E-43)
            if (r13 <= r12) goto L_0x0b46
            java.lang.String r3 = "Excessive obu_size"
            defpackage.i8b.F(r3)
            m53 r3 = new m53
            r35 = r3
            r36 = r38
            r37 = r38
            r39 = r55
            r40 = r56
            r41 = r57
            r35.<init>(r36, r37, r38, r39, r40, r41)
            goto L_0x0af9
        L_0x0b46:
            r12 = 3
            int r13 = r3.i(r12)
            r3.s()
            boolean r12 = r3.h()
            if (r12 == 0) goto L_0x0b6b
            java.lang.String r3 = "Unsupported reduced_still_picture_header"
            defpackage.i8b.F(r3)
            m53 r3 = new m53
            r35 = r3
            r36 = r38
            r37 = r38
            r39 = r55
            r40 = r56
            r41 = r57
            r35.<init>(r36, r37, r38, r39, r40, r41)
            goto L_0x0af9
        L_0x0b6b:
            boolean r12 = r3.h()
            if (r12 == 0) goto L_0x0b89
            java.lang.String r3 = "Unsupported timing_info_present_flag"
            defpackage.i8b.F(r3)
            m53 r3 = new m53
            r35 = r3
            r36 = r38
            r37 = r38
            r39 = r55
            r40 = r56
            r41 = r57
            r35.<init>(r36, r37, r38, r39, r40, r41)
            goto L_0x0af9
        L_0x0b89:
            boolean r12 = r3.h()
            if (r12 == 0) goto L_0x0ba7
            java.lang.String r3 = "Unsupported initial_display_delay_present_flag"
            defpackage.i8b.F(r3)
            m53 r3 = new m53
            r35 = r3
            r36 = r38
            r37 = r38
            r39 = r55
            r40 = r56
            r41 = r57
            r35.<init>(r36, r37, r38, r39, r40, r41)
            goto L_0x0af9
        L_0x0ba7:
            r12 = 5
            int r15 = r3.i(r12)
            r11 = 0
        L_0x0bad:
            if (r11 > r15) goto L_0x0bc6
            r12 = 12
            r3.t(r12)
            r26 = r10
            r12 = 5
            int r10 = r3.i(r12)
            r12 = 7
            if (r10 <= r12) goto L_0x0bc1
            r3.s()
        L_0x0bc1:
            int r11 = r11 + 1
            r10 = r26
            goto L_0x0bad
        L_0x0bc6:
            r26 = r10
            r11 = 4
            int r10 = r3.i(r11)
            int r12 = r3.i(r11)
            r15 = 1
            int r10 = r10 + r15
            r3.t(r10)
            int r12 = r12 + r15
            r3.t(r12)
            boolean r10 = r3.h()
            if (r10 == 0) goto L_0x0be5
            r10 = 7
            r3.t(r10)
            goto L_0x0be6
        L_0x0be5:
            r10 = 7
        L_0x0be6:
            r3.t(r10)
            boolean r10 = r3.h()
            if (r10 == 0) goto L_0x0bf3
            r12 = 2
            r3.t(r12)
        L_0x0bf3:
            boolean r12 = r3.h()
            if (r12 == 0) goto L_0x0bfc
            r12 = 1
            r15 = 2
            goto L_0x0c01
        L_0x0bfc:
            r12 = 1
            int r15 = r3.i(r12)
        L_0x0c01:
            if (r15 <= 0) goto L_0x0c0c
            boolean r15 = r3.h()
            if (r15 != 0) goto L_0x0c0c
            r3.t(r12)
        L_0x0c0c:
            if (r10 == 0) goto L_0x0c13
            r10 = 3
            r3.t(r10)
            goto L_0x0c14
        L_0x0c13:
            r10 = 3
        L_0x0c14:
            r3.t(r10)
            boolean r10 = r3.h()
            r12 = 2
            if (r13 != r12) goto L_0x0c23
            if (r10 == 0) goto L_0x0c23
            r3.s()
        L_0x0c23:
            r10 = 1
            if (r13 == r10) goto L_0x0c2e
            boolean r10 = r3.h()
            if (r10 == 0) goto L_0x0c2e
            r10 = 1
            goto L_0x0c2f
        L_0x0c2e:
            r10 = 0
        L_0x0c2f:
            boolean r12 = r3.h()
            if (r12 == 0) goto L_0x0c6b
            r12 = 8
            int r13 = r3.i(r12)
            int r15 = r3.i(r12)
            int r16 = r3.i(r12)
            if (r10 != 0) goto L_0x0c50
            r10 = 1
            if (r13 != r10) goto L_0x0c51
            r11 = 13
            if (r15 != r11) goto L_0x0c51
            if (r16 != 0) goto L_0x0c51
            r3 = r10
            goto L_0x0c57
        L_0x0c50:
            r10 = 1
        L_0x0c51:
            int r18 = r3.i(r10)
            r3 = r18
        L_0x0c57:
            int r38 = defpackage.m53.h(r13)
            if (r3 != r10) goto L_0x0c5f
            r3 = 1
            goto L_0x0c60
        L_0x0c5f:
            r3 = 2
        L_0x0c60:
            int r10 = defpackage.m53.i(r15)
            r53 = r3
            r54 = r10
            r52 = r38
            goto L_0x0c73
        L_0x0c6b:
            r12 = 8
            r52 = r38
            r53 = r52
            r54 = r53
        L_0x0c73:
            m53 r3 = new m53
            r51 = r3
            r51.<init>(r52, r53, r54, r55, r56, r57)
        L_0x0c7a:
            java.lang.String r10 = "video/av01"
            int r11 = r3.e
            int r13 = r3.f
            int r15 = r3.a
            int r12 = r3.b
            int r3 = r3.c
            r42 = r2
            r39 = r4
            r37 = r5
            r19 = r7
            r36 = r8
            r22 = r10
            r28 = r11
            r29 = r13
            r10 = r15
            r30 = r26
            r15 = r32
            r2 = 0
            r5 = 1
            r8 = 2
            r13 = r3
            r26 = r12
            r3 = -1
            goto L_0x0e87
        L_0x0ca4:
            r11 = 0
            r12 = 1668050025(0x636c6c69, float:4.3612434E21)
            if (r15 != r12) goto L_0x0cdb
            if (r21 != 0) goto L_0x0cb8
            r3 = 25
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
            java.nio.ByteOrder r12 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r21 = r3.order(r12)
        L_0x0cb8:
            r3 = r21
            r12 = 21
            r3.position(r12)
            short r12 = r59.r()
            r3.putShort(r12)
            short r12 = r59.r()
            r3.putShort(r12)
            r42 = r2
            r21 = r3
            r39 = r4
            r37 = r5
            r19 = r7
            r36 = r8
            goto L_0x0a4d
        L_0x0cdb:
            r12 = 1835295606(0x6d646376, float:4.4176764E27)
            if (r15 != r12) goto L_0x0d58
            if (r21 != 0) goto L_0x0cee
            r3 = 25
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
            java.nio.ByteOrder r12 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r21 = r3.order(r12)
        L_0x0cee:
            r3 = r21
            short r12 = r59.r()
            short r15 = r59.r()
            short r11 = r59.r()
            r19 = r7
            short r7 = r59.r()
            r36 = r8
            short r8 = r59.r()
            r37 = r5
            short r5 = r59.r()
            r38 = r9
            short r9 = r59.r()
            r39 = r4
            short r4 = r59.r()
            long r40 = r59.w()
            long r44 = r59.w()
            r42 = r2
            r2 = 1
            r3.position(r2)
            r3.putShort(r8)
            r3.putShort(r5)
            r3.putShort(r12)
            r3.putShort(r15)
            r3.putShort(r11)
            r3.putShort(r7)
            r3.putShort(r9)
            r3.putShort(r4)
            r4 = 10000(0x2710, double:4.9407E-320)
            long r7 = r40 / r4
            int r2 = (int) r7
            short r2 = (short) r2
            r3.putShort(r2)
            long r4 = r44 / r4
            int r2 = (int) r4
            short r2 = (short) r2
            r3.putShort(r2)
            r21 = r3
            r15 = r32
            r9 = r38
            goto L_0x0a4f
        L_0x0d58:
            r42 = r2
            r39 = r4
            r37 = r5
            r19 = r7
            r36 = r8
            r38 = r9
            r2 = 1681012275(0x64323633, float:1.3149704E22)
            if (r15 != r2) goto L_0x0d7a
            r2 = 0
            if (r22 != 0) goto L_0x0d6e
            r3 = 1
            goto L_0x0d6f
        L_0x0d6e:
            r3 = 0
        L_0x0d6f:
            defpackage.b59.h(r2, r3)
            r22 = r25
        L_0x0d74:
            r15 = r32
        L_0x0d76:
            r9 = r38
            goto L_0x0a50
        L_0x0d7a:
            r2 = 0
            r4 = 1702061171(0x65736473, float:7.183675E22)
            if (r15 != r4) goto L_0x0da1
            if (r22 != 0) goto L_0x0d84
            r4 = 1
            goto L_0x0d85
        L_0x0d84:
            r4 = 0
        L_0x0d85:
            defpackage.b59.h(r2, r4)
            vy r3 = a(r3, r0)
            java.lang.Object r4 = r3.v
            byte[] r4 = (byte[]) r4
            if (r4 == 0) goto L_0x0d98
            k0d r4 = defpackage.tb7.t(r4)
            r30 = r4
        L_0x0d98:
            java.lang.Object r4 = r3.o
            java.lang.String r4 = (java.lang.String) r4
            r49 = r3
            r22 = r4
            goto L_0x0d74
        L_0x0da1:
            r4 = 1885434736(0x70617370, float:2.7909473E29)
            if (r15 != r4) goto L_0x0dc0
            int r3 = r3 + 8
            r0.G(r3)
            int r3 = r59.y()
            int r4 = r59.y()
            float r3 = (float) r3
            float r4 = (float) r4
            float r3 = r3 / r4
            r9 = r3
            r15 = r32
            r3 = -1
            r5 = 1
            r8 = 2
            r24 = 1
            goto L_0x0e87
        L_0x0dc0:
            r4 = 1937126244(0x73763364, float:1.9506033E31)
            if (r15 != r4) goto L_0x0de8
            int r4 = r3 + 8
        L_0x0dc7:
            int r5 = r4 - r3
            if (r5 >= r1) goto L_0x0de5
            r0.G(r4)
            int r5 = r59.g()
            int r7 = r59.g()
            r8 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r7 != r8) goto L_0x0de3
            byte[] r3 = r0.a
            int r5 = r5 + r4
            byte[] r3 = java.util.Arrays.copyOfRange(r3, r4, r5)
            goto L_0x0de6
        L_0x0de3:
            int r4 = r4 + r5
            goto L_0x0dc7
        L_0x0de5:
            r3 = r2
        L_0x0de6:
            r15 = r3
            goto L_0x0d76
        L_0x0de8:
            r3 = 1936995172(0x73743364, float:1.9347576E31)
            if (r15 != r3) goto L_0x0e19
            int r3 = r59.u()
            r4 = 3
            r0.H(r4)
            if (r3 != 0) goto L_0x0e0d
            int r3 = r59.u()
            if (r3 == 0) goto L_0x0e0a
            r5 = 1
            if (r3 == r5) goto L_0x0e08
            r7 = 2
            if (r3 == r7) goto L_0x0e06
            if (r3 == r4) goto L_0x0e10
            goto L_0x0e0e
        L_0x0e06:
            r4 = 2
            goto L_0x0e10
        L_0x0e08:
            r4 = r5
            goto L_0x0e10
        L_0x0e0a:
            r5 = 1
            r4 = 0
            goto L_0x0e10
        L_0x0e0d:
            r5 = 1
        L_0x0e0e:
            r4 = r31
        L_0x0e10:
            r31 = r4
            r15 = r32
            r9 = r38
            r3 = -1
            goto L_0x0a52
        L_0x0e19:
            r5 = 1
            r3 = 1668246642(0x636f6c72, float:4.4165861E21)
            if (r15 != r3) goto L_0x0e7a
            r3 = -1
            if (r10 != r3) goto L_0x0e48
            if (r13 != r3) goto L_0x0e48
            int r4 = r59.g()
            r7 = 1852009592(0x6e636c78, float:1.7596057E28)
            if (r4 == r7) goto L_0x0e4a
            r7 = 1852009571(0x6e636c63, float:1.7596032E28)
            if (r4 != r7) goto L_0x0e33
            goto L_0x0e4a
        L_0x0e33:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Unsupported color type: "
            r7.<init>(r8)
            java.lang.String r4 = defpackage.ty.g(r4)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            defpackage.i8b.V(r4)
        L_0x0e48:
            r8 = 2
            goto L_0x0e75
        L_0x0e4a:
            int r4 = r59.A()
            int r7 = r59.A()
            r8 = 2
            r0.H(r8)
            r9 = 19
            if (r1 != r9) goto L_0x0e64
            int r9 = r59.u()
            r9 = r9 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0e64
            r10 = r5
            goto L_0x0e65
        L_0x0e64:
            r10 = 0
        L_0x0e65:
            int r4 = defpackage.m53.h(r4)
            if (r10 == 0) goto L_0x0e6d
            r9 = r5
            goto L_0x0e6e
        L_0x0e6d:
            r9 = r8
        L_0x0e6e:
            int r13 = defpackage.m53.i(r7)
            r10 = r4
            r26 = r9
        L_0x0e75:
            r15 = r32
            r9 = r38
            goto L_0x0e87
        L_0x0e7a:
            r3 = -1
            goto L_0x0e48
        L_0x0e7c:
            er4 r4 = defpackage.er4.a(r59)
            if (r4 == 0) goto L_0x0e75
            java.lang.String r6 = r4.a
            java.lang.String r22 = "video/dolby-vision"
            goto L_0x0e75
        L_0x0e87:
            int r14 = r14 + r1
            r7 = r19
            r1 = r31
            r12 = r33
            r11 = r34
            r8 = r36
            r5 = r37
            r4 = r39
            r2 = r42
            goto L_0x08ed
        L_0x0e9a:
            r31 = r1
            r42 = r2
            r39 = r4
            r37 = r5
            r19 = r7
            r36 = r8
            r38 = r9
            r32 = r15
            goto L_0x0911
        L_0x0eac:
            if (r22 != 0) goto L_0x0eb4
            r3 = r61
            r1 = r37
            goto L_0x0f20
        L_0x0eb4:
            ba6 r1 = new ba6
            r1.<init>()
            java.lang.String r3 = java.lang.Integer.toString(r60)
            r1.a = r3
            java.lang.String r3 = defpackage.vq9.l(r22)
            r1.m = r3
            r1.i = r6
            r3 = r42
            r1.s = r3
            r3 = r39
            r1.t = r3
            r15 = r38
            r1.w = r15
            r3 = r61
            r1.v = r3
            r15 = r32
            r1.x = r15
            r14 = r31
            r1.y = r14
            r4 = r30
            r1.p = r4
            r14 = r50
            r1.o = r14
            r4 = r27
            r1.q = r4
            if (r21 == 0) goto L_0x0ef4
            byte[] r6 = r21.array()
            r30 = r6
            goto L_0x0ef6
        L_0x0ef4:
            r30 = r2
        L_0x0ef6:
            m53 r2 = new m53
            r24 = r2
            r25 = r10
            r27 = r13
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r1.z = r2
            r2 = r49
            if (r2 == 0) goto L_0x0f17
            long r4 = r2.b
            int r4 = defpackage.cvg.K(r4)
            r1.g = r4
            long r4 = r2.c
            int r2 = defpackage.cvg.K(r4)
            r1.h = r2
        L_0x0f17:
            ea6 r2 = new ea6
            r2.<init>(r1)
            r1 = r37
            r1.o = r2
        L_0x0f20:
            int r8 = r19 + r36
            r0.G(r8)
            int r7 = r20 + 1
            r2 = r63
            r5 = r1
            r4 = r43
            r3 = 12
            r1 = r62
            goto L_0x001c
        L_0x0f32:
            r1 = r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bz.e(l8b, int, int, java.lang.String, yv4, boolean):yy");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00db, code lost:
        if (r6 == 0) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dd, code lost:
        r6 = -9223372036854775807L;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0556  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x056d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x05af  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x05b2  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x05db  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x05ee  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x06c5  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0710  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0716  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0718  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0729  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x077d  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x077f  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0783  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0787  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x078b  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x078f  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0793  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0797  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x079a  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x07a7  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x089a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x0547 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList f(defpackage.qy r45, defpackage.mp6 r46, long r47, defpackage.yv4 r49, boolean r50, boolean r51, defpackage.yi6 r52) {
        /*
            r0 = r45
            r1 = r46
            r3 = -1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r7 = 0
        L_0x000b:
            java.util.ArrayList r8 = r0.v
            int r9 = r8.size()
            if (r7 >= r9) goto L_0x08a2
            java.lang.Object r8 = r8.get(r7)
            qy r8 = (defpackage.qy) r8
            int r9 = r8.b
            r10 = 1953653099(0x7472616b, float:7.681346E31)
            if (r9 == r10) goto L_0x0026
            r0 = r5
            r33 = r7
        L_0x0023:
            r1 = 1
            goto L_0x0888
        L_0x0026:
            r9 = 1836476516(0x6d766864, float:4.7662196E27)
            sy r9 = r0.A(r9)
            r9.getClass()
            r10 = 1835297121(0x6d646961, float:4.4181236E27)
            qy r11 = r8.z(r10)
            r11.getClass()
            r12 = 1751411826(0x68646c72, float:4.3148E24)
            sy r12 = r11.A(r12)
            r12.getClass()
            l8b r12 = r12.c
            r13 = 16
            r12.G(r13)
            int r12 = r12.g()
            r14 = 1936684398(0x736f756e, float:1.8971874E31)
            if (r12 != r14) goto L_0x0056
            r12 = 1
            goto L_0x007c
        L_0x0056:
            r14 = 1986618469(0x76696465, float:1.1834389E33)
            if (r12 != r14) goto L_0x005d
            r12 = 2
            goto L_0x007c
        L_0x005d:
            r14 = 1952807028(0x74657874, float:7.272211E31)
            if (r12 == r14) goto L_0x007b
            r14 = 1935832172(0x7362746c, float:1.7941596E31)
            if (r12 == r14) goto L_0x007b
            r14 = 1937072756(0x73756274, float:1.944137E31)
            if (r12 == r14) goto L_0x007b
            r14 = 1668047728(0x636c6370, float:4.3605968E21)
            if (r12 != r14) goto L_0x0072
            goto L_0x007b
        L_0x0072:
            r14 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r12 != r14) goto L_0x0079
            r12 = 5
            goto L_0x007c
        L_0x0079:
            r12 = r3
            goto L_0x007c
        L_0x007b:
            r12 = 3
        L_0x007c:
            java.lang.String r14 = ""
            r33 = r7
            r15 = 4
            if (r12 != r3) goto L_0x008c
            r0 = r52
            r40 = r5
            r39 = r14
            r3 = 0
            goto L_0x02b0
        L_0x008c:
            r2 = 1953196132(0x746b6864, float:7.46037E31)
            sy r2 = r8.A(r2)
            r2.getClass()
            l8b r2 = r2.c
            r10 = 8
            r2.G(r10)
            int r16 = r2.g()
            int r16 = defpackage.ty.y(r16)
            if (r16 != 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r10 = r13
        L_0x00a9:
            r2.H(r10)
            int r10 = r2.g()
            r2.H(r15)
            int r15 = r2.b
            if (r16 != 0) goto L_0x00b9
            r13 = 4
            goto L_0x00bb
        L_0x00b9:
            r13 = 8
        L_0x00bb:
            r4 = 0
        L_0x00bc:
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r13) goto L_0x00e5
            byte[] r6 = r2.a
            int r7 = r15 + r4
            byte r6 = r6[r7]
            if (r6 == r3) goto L_0x00e2
            if (r16 != 0) goto L_0x00d4
            long r6 = r2.w()
        L_0x00d1:
            r15 = 0
            goto L_0x00d9
        L_0x00d4:
            long r6 = r2.z()
            goto L_0x00d1
        L_0x00d9:
            int r4 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r4 != 0) goto L_0x00df
        L_0x00dd:
            r6 = r19
        L_0x00df:
            r4 = 16
            goto L_0x00e9
        L_0x00e2:
            r6 = 1
            int r4 = r4 + r6
            goto L_0x00bc
        L_0x00e5:
            r2.H(r13)
            goto L_0x00dd
        L_0x00e9:
            r2.H(r4)
            int r13 = r2.g()
            int r15 = r2.g()
            r4 = 4
            r2.H(r4)
            int r4 = r2.g()
            int r2 = r2.g()
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r13 != 0) goto L_0x010f
            if (r15 != r3) goto L_0x010f
            r3 = -65536(0xffffffffffff0000, float:NaN)
            if (r4 != r3) goto L_0x0111
            if (r2 != 0) goto L_0x0111
            r2 = 90
            goto L_0x012c
        L_0x010f:
            r3 = -65536(0xffffffffffff0000, float:NaN)
        L_0x0111:
            if (r13 != 0) goto L_0x0120
            if (r15 != r3) goto L_0x0120
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r4 != r3) goto L_0x011e
            if (r2 != 0) goto L_0x011e
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x012c
        L_0x011e:
            r3 = -65536(0xffffffffffff0000, float:NaN)
        L_0x0120:
            if (r13 != r3) goto L_0x012b
            if (r15 != 0) goto L_0x012b
            if (r4 != 0) goto L_0x012b
            if (r2 != r3) goto L_0x012b
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x012c
        L_0x012b:
            r2 = 0
        L_0x012c:
            int r3 = (r47 > r19 ? 1 : (r47 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x0133
            r21 = r6
            goto L_0x0135
        L_0x0133:
            r21 = r47
        L_0x0135:
            l8b r3 = r9.c
            tu9 r3 = c(r3)
            int r4 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            long r6 = r3.c
            if (r4 != 0) goto L_0x0147
            r3 = r19
        L_0x0143:
            r9 = 1835626086(0x6d696e66, float:4.515217E27)
            goto L_0x0155
        L_0x0147:
            int r3 = defpackage.v0g.a
            java.math.RoundingMode r27 = java.math.RoundingMode.FLOOR
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r25 = r6
            long r3 = defpackage.v0g.a0(r21, r23, r25, r27)
            goto L_0x0143
        L_0x0155:
            qy r13 = r11.z(r9)
            r13.getClass()
            r9 = 1937007212(0x7374626c, float:1.9362132E31)
            qy r13 = r13.z(r9)
            r13.getClass()
            r9 = 1835296868(0x6d646864, float:4.418049E27)
            sy r9 = r11.A(r9)
            r9.getClass()
            l8b r9 = r9.c
            r11 = 8
            r9.G(r11)
            int r11 = r9.g()
            int r11 = defpackage.ty.y(r11)
            if (r11 != 0) goto L_0x0184
            r15 = 8
            goto L_0x0186
        L_0x0184:
            r15 = 16
        L_0x0186:
            r9.H(r15)
            long r15 = r9.w()
            if (r11 != 0) goto L_0x0191
            r11 = 4
            goto L_0x0193
        L_0x0191:
            r11 = 8
        L_0x0193:
            r9.H(r11)
            int r9 = r9.A()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r14)
            int r18 = r9 >> 10
            r18 = r18 & 31
            int r0 = r18 + 96
            char r0 = (char) r0
            r11.append(r0)
            r0 = 5
            int r18 = r9 >> 5
            r18 = r18 & 31
            int r0 = r18 + 96
            char r0 = (char) r0
            r11.append(r0)
            r0 = r9 & 31
            int r0 = r0 + 96
            char r0 = (char) r0
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            java.lang.Long r9 = java.lang.Long.valueOf(r15)
            android.util.Pair r0 = android.util.Pair.create(r9, r0)
            r9 = 1937011556(0x73747364, float:1.9367383E31)
            sy r9 = r13.A(r9)
            if (r9 == 0) goto L_0x089a
            java.lang.Object r11 = r0.second
            r21 = r11
            java.lang.String r21 = (java.lang.String) r21
            l8b r9 = r9.c
            r18 = r9
            r19 = r10
            r20 = r2
            r22 = r49
            r23 = r51
            yy r2 = e(r18, r19, r20, r21, r22, r23)
            if (r50 != 0) goto L_0x0273
            r9 = 1701082227(0x65647473, float:6.742798E22)
            qy r9 = r8.z(r9)
            if (r9 == 0) goto L_0x0273
            r11 = 1701606260(0x656c7374, float:6.9788014E22)
            sy r9 = r9.A(r11)
            if (r9 != 0) goto L_0x0203
            r23 = r3
            r40 = r5
            r39 = r14
            r3 = 0
            goto L_0x0264
        L_0x0203:
            l8b r9 = r9.c
            r11 = 8
            r9.G(r11)
            int r11 = r9.g()
            int r11 = defpackage.ty.y(r11)
            int r13 = r9.y()
            long[] r15 = new long[r13]
            r39 = r14
            long[] r14 = new long[r13]
            r40 = r5
            r5 = 0
        L_0x021f:
            if (r5 >= r13) goto L_0x025e
            r16 = r13
            r13 = 1
            if (r11 != r13) goto L_0x022b
            long r17 = r9.z()
            goto L_0x022f
        L_0x022b:
            long r17 = r9.w()
        L_0x022f:
            r15[r5] = r17
            if (r11 != r13) goto L_0x023a
            long r17 = r9.o()
            r23 = r3
            goto L_0x0243
        L_0x023a:
            int r13 = r9.g()
            r23 = r3
            long r3 = (long) r13
            r17 = r3
        L_0x0243:
            r14[r5] = r17
            short r3 = r9.r()
            r4 = 1
            if (r3 != r4) goto L_0x0256
            r3 = 2
            r9.H(r3)
            int r5 = r5 + r4
            r13 = r16
            r3 = r23
            goto L_0x021f
        L_0x0256:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x025e:
            r23 = r3
            android.util.Pair r3 = android.util.Pair.create(r15, r14)
        L_0x0264:
            if (r3 == 0) goto L_0x0279
            java.lang.Object r4 = r3.first
            long[] r4 = (long[]) r4
            java.lang.Object r3 = r3.second
            long[] r3 = (long[]) r3
            r30 = r3
            r29 = r4
            goto L_0x027d
        L_0x0273:
            r23 = r3
            r40 = r5
            r39 = r14
        L_0x0279:
            r29 = 0
            r30 = 0
        L_0x027d:
            java.lang.Object r3 = r2.o
            ea6 r3 = (defpackage.ea6) r3
            if (r3 != 0) goto L_0x0285
            r3 = 0
            goto L_0x02ae
        L_0x0285:
            lpf r3 = new lpf
            java.lang.Object r0 = r0.first
            java.lang.Long r0 = (java.lang.Long) r0
            long r19 = r0.longValue()
            java.lang.Object r0 = r2.o
            r25 = r0
            ea6 r25 = (defpackage.ea6) r25
            int r0 = r2.b
            java.lang.Object r4 = r2.c
            r27 = r4
            ppf[] r27 = (defpackage.ppf[]) r27
            int r2 = r2.a
            r16 = r3
            r17 = r10
            r18 = r12
            r21 = r6
            r26 = r0
            r28 = r2
            r16.<init>(r17, r18, r19, r21, r23, r25, r26, r27, r28, r29, r30)
        L_0x02ae:
            r0 = r52
        L_0x02b0:
            java.lang.Object r2 = r0.apply(r3)
            r10 = r2
            lpf r10 = (defpackage.lpf) r10
            if (r10 != 0) goto L_0x02bd
            r0 = r40
            goto L_0x0023
        L_0x02bd:
            r2 = 1835297121(0x6d646961, float:4.4181236E27)
            qy r2 = r8.z(r2)
            r2.getClass()
            r3 = 1835626086(0x6d696e66, float:4.515217E27)
            qy r2 = r2.z(r3)
            r2.getClass()
            r3 = 1937007212(0x7374626c, float:1.9362132E31)
            qy r2 = r2.z(r3)
            r2.getClass()
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            sy r3 = r2.A(r3)
            ea6 r4 = r10.f
            if (r3 == 0) goto L_0x02ec
            ila r5 = new ila
            r5.<init>((defpackage.sy) r3, (defpackage.ea6) r4)
            goto L_0x02fa
        L_0x02ec:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            sy r3 = r2.A(r3)
            if (r3 == 0) goto L_0x0892
            zy r5 = new zy
            r5.<init>((defpackage.sy) r3)
        L_0x02fa:
            int r3 = r5.b()
            if (r3 != 0) goto L_0x0316
            bqf r2 = new bqf
            r3 = 0
            long[] r11 = new long[r3]
            int[] r12 = new int[r3]
            long[] r14 = new long[r3]
            int[] r15 = new int[r3]
            r16 = 0
            r13 = 0
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
        L_0x0312:
            r0 = r40
            goto L_0x0883
        L_0x0316:
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            sy r6 = r2.A(r6)
            if (r6 != 0) goto L_0x032b
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            sy r6 = r2.A(r6)
            r6.getClass()
            r7 = 1
            goto L_0x032c
        L_0x032b:
            r7 = 0
        L_0x032c:
            r8 = 1937011555(0x73747363, float:1.9367382E31)
            sy r8 = r2.A(r8)
            r8.getClass()
            r9 = 1937011827(0x73747473, float:1.9367711E31)
            sy r9 = r2.A(r9)
            r9.getClass()
            r11 = 1937011571(0x73747373, float:1.9367401E31)
            sy r11 = r2.A(r11)
            if (r11 == 0) goto L_0x034c
            l8b r11 = r11.c
            goto L_0x034d
        L_0x034c:
            r11 = 0
        L_0x034d:
            r12 = 1668576371(0x63747473, float:4.5093966E21)
            sy r2 = r2.A(r12)
            if (r2 == 0) goto L_0x0359
            l8b r2 = r2.c
            goto L_0x035a
        L_0x0359:
            r2 = 0
        L_0x035a:
            uy r12 = new uy
            l8b r8 = r8.c
            l8b r6 = r6.c
            r12.<init>((defpackage.l8b) r8, (defpackage.l8b) r6, (boolean) r7)
            l8b r6 = r9.c
            r7 = 12
            r6.G(r7)
            int r8 = r6.y()
            r9 = 1
            int r8 = r8 - r9
            int r9 = r6.y()
            int r13 = r6.y()
            if (r2 == 0) goto L_0x0382
            r2.G(r7)
            int r14 = r2.y()
            goto L_0x0383
        L_0x0382:
            r14 = 0
        L_0x0383:
            if (r11 == 0) goto L_0x039a
            r11.G(r7)
            int r7 = r11.y()
            if (r7 <= 0) goto L_0x0397
            int r15 = r11.y()
            r16 = 1
            int r15 = r15 + -1
            goto L_0x039c
        L_0x0397:
            r11 = 0
        L_0x0398:
            r15 = -1
            goto L_0x039c
        L_0x039a:
            r7 = 0
            goto L_0x0398
        L_0x039c:
            int r0 = r5.a()
            r16 = r9
            java.lang.String r9 = r4.n
            r17 = r15
            r15 = -1
            if (r0 == r15) goto L_0x03c2
            java.lang.String r15 = "audio/raw"
            boolean r15 = r15.equals(r9)
            if (r15 != 0) goto L_0x03c6
            java.lang.String r15 = "audio/g711-mlaw"
            boolean r15 = r15.equals(r9)
            if (r15 != 0) goto L_0x03c6
            java.lang.String r15 = "audio/g711-alaw"
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L_0x03c2
            goto L_0x03c6
        L_0x03c2:
            r23 = r10
            goto L_0x0467
        L_0x03c6:
            if (r8 != 0) goto L_0x03c2
            if (r14 != 0) goto L_0x03c2
            if (r7 != 0) goto L_0x03c2
            int r2 = r12.b
            long[] r5 = new long[r2]
            int[] r6 = new int[r2]
        L_0x03d2:
            boolean r7 = r12.a()
            if (r7 == 0) goto L_0x03e3
            int r7 = r12.c
            long r8 = r12.e
            r5[r7] = r8
            int r8 = r12.d
            r6[r7] = r8
            goto L_0x03d2
        L_0x03e3:
            long r7 = (long) r13
            r9 = 8192(0x2000, float:1.14794E-41)
            int r9 = r9 / r0
            r11 = 0
            r12 = 0
        L_0x03e9:
            if (r11 >= r2) goto L_0x03f5
            r13 = r6[r11]
            int r13 = defpackage.v0g.g(r13, r9)
            int r12 = r12 + r13
            r13 = 1
            int r11 = r11 + r13
            goto L_0x03e9
        L_0x03f5:
            long[] r11 = new long[r12]
            int[] r13 = new int[r12]
            long[] r14 = new long[r12]
            int[] r12 = new int[r12]
            r1 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0403:
            if (r15 >= r2) goto L_0x045a
            r18 = r6[r15]
            r19 = r5[r15]
            r43 = r17
            r17 = r2
            r2 = r16
            r16 = r43
            r44 = r18
            r18 = r5
            r5 = r44
        L_0x0417:
            if (r5 <= 0) goto L_0x0445
            int r21 = java.lang.Math.min(r9, r5)
            r11[r16] = r19
            r22 = r6
            int r6 = r0 * r21
            r13[r16] = r6
            int r2 = java.lang.Math.max(r2, r6)
            r6 = r9
            r23 = r10
            long r9 = (long) r1
            long r9 = r9 * r7
            r14[r16] = r9
            r9 = 1
            r12[r16] = r9
            r10 = r13[r16]
            long r9 = (long) r10
            long r19 = r19 + r9
            int r1 = r1 + r21
            int r5 = r5 - r21
            r9 = 1
            int r16 = r16 + 1
            r9 = r6
            r6 = r22
            r10 = r23
            goto L_0x0417
        L_0x0445:
            r22 = r6
            r6 = r9
            r23 = r10
            r9 = 1
            int r15 = r15 + r9
            r9 = r6
            r5 = r18
            r6 = r22
            r43 = r16
            r16 = r2
            r2 = r17
            r17 = r43
            goto L_0x0403
        L_0x045a:
            r23 = r10
            long r0 = (long) r1
            long r7 = r7 * r0
            r17 = r4
            r0 = r11
            r1 = r12
            r15 = r23
            r11 = r7
            goto L_0x05c6
        L_0x0467:
            long[] r0 = new long[r3]
            int[] r1 = new int[r3]
            long[] r9 = new long[r3]
            int[] r10 = new int[r3]
            r19 = r6
            r15 = r17
            r6 = 0
            r18 = 0
            r20 = 0
            r24 = 0
            r41 = 0
            r42 = 0
            r17 = r4
            r4 = 0
            r43 = r14
            r14 = r13
            r13 = r16
            r16 = r43
        L_0x0488:
            if (r4 >= r3) goto L_0x0547
            r22 = 1
        L_0x048c:
            if (r18 != 0) goto L_0x04a9
            boolean r22 = r12.a()
            if (r22 == 0) goto L_0x04a9
            r26 = r13
            r27 = r14
            long r13 = r12.e
            r28 = r3
            int r3 = r12.d
            r18 = r3
            r24 = r13
            r13 = r26
            r14 = r27
            r3 = r28
            goto L_0x048c
        L_0x04a9:
            r28 = r3
            r26 = r13
            r27 = r14
            if (r22 != 0) goto L_0x04cd
            java.lang.String r3 = "Unexpected end of chunk data"
            defpackage.i8b.V(r3)
            long[] r0 = java.util.Arrays.copyOf(r0, r4)
            int[] r1 = java.util.Arrays.copyOf(r1, r4)
            long[] r9 = java.util.Arrays.copyOf(r9, r4)
            int[] r10 = java.util.Arrays.copyOf(r10, r4)
            r3 = r4
        L_0x04c7:
            r4 = r18
            r5 = r41
            goto L_0x0551
        L_0x04cd:
            if (r2 == 0) goto L_0x04e2
        L_0x04cf:
            if (r42 != 0) goto L_0x04df
            if (r16 <= 0) goto L_0x04df
            int r42 = r2.y()
            int r41 = r2.g()
            r3 = -1
            int r16 = r16 + -1
            goto L_0x04cf
        L_0x04df:
            r3 = -1
            int r42 = r42 + -1
        L_0x04e2:
            r3 = r41
            r0[r4] = r24
            int r13 = r5.c()
            r1[r4] = r13
            if (r13 <= r6) goto L_0x04ef
            r6 = r13
        L_0x04ef:
            long r13 = (long) r3
            long r13 = r20 + r13
            r9[r4] = r13
            if (r11 != 0) goto L_0x04f8
            r13 = 1
            goto L_0x04f9
        L_0x04f8:
            r13 = 0
        L_0x04f9:
            r10[r4] = r13
            if (r4 != r15) goto L_0x0513
            r13 = 1
            r10[r4] = r13
            r14 = -1
            int r7 = r7 + r14
            if (r7 <= 0) goto L_0x050c
            r11.getClass()
            int r15 = r11.y()
            int r15 = r15 - r13
        L_0x050c:
            r22 = r5
            r13 = r27
            r27 = r6
            goto L_0x0515
        L_0x0513:
            r14 = -1
            goto L_0x050c
        L_0x0515:
            long r5 = (long) r13
            long r20 = r20 + r5
            int r5 = r26 + -1
            if (r5 != 0) goto L_0x0529
            if (r8 <= 0) goto L_0x0529
            int r5 = r19.y()
            int r6 = r19.g()
            int r8 = r8 + r14
        L_0x0527:
            r13 = r5
            goto L_0x052b
        L_0x0529:
            r6 = r13
            goto L_0x0527
        L_0x052b:
            r5 = r1[r4]
            r29 = r0
            r30 = r1
            long r0 = (long) r5
            long r24 = r24 + r0
            int r18 = r18 + -1
            r0 = 1
            int r4 = r4 + r0
            r41 = r3
            r14 = r6
            r5 = r22
            r6 = r27
            r3 = r28
            r0 = r29
            r1 = r30
            goto L_0x0488
        L_0x0547:
            r29 = r0
            r30 = r1
            r28 = r3
            r26 = r13
            goto L_0x04c7
        L_0x0551:
            long r11 = (long) r5
            long r11 = r20 + r11
            if (r2 == 0) goto L_0x0569
            r15 = r16
        L_0x0558:
            if (r15 <= 0) goto L_0x0569
            int r5 = r2.y()
            if (r5 == 0) goto L_0x0563
            r2 = 0
            r5 = -1
            goto L_0x056b
        L_0x0563:
            r2.g()
            r5 = -1
            int r15 = r15 + r5
            goto L_0x0558
        L_0x0569:
            r5 = -1
            r2 = 1
        L_0x056b:
            if (r7 != 0) goto L_0x0581
            if (r26 != 0) goto L_0x0581
            if (r4 != 0) goto L_0x0581
            if (r8 != 0) goto L_0x0581
            r13 = r42
            if (r13 != 0) goto L_0x0583
            if (r2 != 0) goto L_0x057a
            goto L_0x0583
        L_0x057a:
            r16 = r0
            r18 = r1
            r15 = r23
            goto L_0x05be
        L_0x0581:
            r13 = r42
        L_0x0583:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "Inconsistent stbl box for track "
            r14.<init>(r15)
            r15 = r23
            int r5 = r15.a
            r16 = r0
            java.lang.String r0 = ": remainingSynchronizationSamples "
            r18 = r1
            java.lang.String r1 = ", remainingSamplesAtTimestampDelta "
            defpackage.g63.o(r14, r5, r0, r7, r1)
            java.lang.String r0 = ", remainingSamplesInChunk "
            java.lang.String r1 = ", remainingTimestampDeltaChanges "
            r5 = r26
            defpackage.g63.o(r14, r5, r0, r4, r1)
            r14.append(r8)
            java.lang.String r0 = ", remainingSamplesAtTimestampOffset "
            r14.append(r0)
            r14.append(r13)
            if (r2 != 0) goto L_0x05b2
            java.lang.String r0 = ", ctts invalid"
            goto L_0x05b4
        L_0x05b2:
            r0 = r39
        L_0x05b4:
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            defpackage.i8b.V(r0)
        L_0x05be:
            r14 = r9
            r1 = r10
            r0 = r16
            r13 = r18
            r16 = r6
        L_0x05c6:
            int r2 = defpackage.v0g.a
            java.math.RoundingMode r2 = java.math.RoundingMode.FLOOR
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r15.c
            r4 = r11
            r10 = r2
            long r4 = defpackage.v0g.a0(r4, r6, r8, r10)
            long r8 = r15.c
            long[] r10 = r15.h
            if (r10 != 0) goto L_0x05ee
            defpackage.v0g.Z(r14, r8)
            bqf r2 = new bqf
            r9 = r2
            r10 = r15
            r11 = r0
            r12 = r13
            r13 = r16
            r15 = r1
            r16 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0312
        L_0x05ee:
            int r4 = r10.length
            int r6 = r15.b
            long[] r7 = r15.i
            r5 = 1
            if (r4 != r5) goto L_0x06b5
            if (r6 != r5) goto L_0x06b5
            int r4 = r14.length
            r5 = 2
            if (r4 < r5) goto L_0x06b5
            r7.getClass()
            r4 = 0
            r18 = r7[r4]
            r20 = r10[r4]
            long r4 = r15.c
            r22 = r8
            long r8 = r15.d
            r24 = r4
            r4 = r20
            r20 = r3
            r3 = r6
            r21 = r7
            r6 = r24
            r24 = r0
            r25 = r1
            r0 = r22
            r22 = r3
            r3 = r10
            r10 = r2
            long r4 = defpackage.v0g.a0(r4, r6, r8, r10)
            long r4 = r18 + r4
            int r6 = r14.length
            r7 = 1
            int r6 = r6 - r7
            r7 = 0
            r8 = 4
            int r9 = defpackage.v0g.j(r8, r7, r6)
            int r10 = r14.length
            int r10 = r10 - r8
            int r6 = defpackage.v0g.j(r10, r7, r6)
            r26 = r14[r7]
            int r7 = (r26 > r18 ? 1 : (r26 == r18 ? 0 : -1))
            if (r7 > 0) goto L_0x064c
            r7 = r14[r9]
            int r7 = (r18 > r7 ? 1 : (r18 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x064c
            r6 = r14[r6]
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x064c
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x064c
            r6 = 1
            goto L_0x064d
        L_0x064c:
            r6 = 0
        L_0x064d:
            if (r6 == 0) goto L_0x06b0
            long r28 = r11 - r4
            long r4 = r18 - r26
            r6 = r17
            int r10 = r6.C
            long r6 = (long) r10
            long r8 = r15.c
            r17 = r11
            r11 = r10
            r10 = r2
            long r8 = defpackage.v0g.a0(r4, r6, r8, r10)
            long r6 = (long) r11
            long r10 = r15.c
            r4 = r28
            r19 = r13
            r12 = r8
            r8 = r10
            r10 = r2
            long r4 = defpackage.v0g.a0(r4, r6, r8, r10)
            r6 = 0
            int r8 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x067a
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x06c1
        L_0x067a:
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x06c1
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x06c1
            int r6 = (int) r12
            r13 = r46
            r13.a = r6
            int r4 = (int) r4
            r13.b = r4
            defpackage.v0g.Z(r14, r0)
            r0 = 0
            r4 = r3[r0]
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r15.d
            r10 = r2
            long r0 = defpackage.v0g.a0(r4, r6, r8, r10)
            bqf r2 = new bqf
            r9 = r2
            r10 = r15
            r11 = r24
            r12 = r19
            r13 = r16
            r15 = r25
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0312
        L_0x06b0:
            r17 = r11
            r19 = r13
            goto L_0x06c1
        L_0x06b5:
            r24 = r0
            r25 = r1
            r20 = r3
            r22 = r6
            r21 = r7
            r3 = r10
            goto L_0x06b0
        L_0x06c1:
            int r0 = r3.length
            r1 = 1
            if (r0 != r1) goto L_0x0710
            r0 = 0
            r1 = r3[r0]
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x070c
            r21.getClass()
            r1 = r21[r0]
            r3 = r0
        L_0x06d4:
            int r4 = r14.length
            if (r3 >= r4) goto L_0x06eb
            r4 = r14[r3]
            long r6 = r4 - r1
            java.math.RoundingMode r12 = java.math.RoundingMode.FLOOR
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r15.c
            long r4 = defpackage.v0g.a0(r6, r8, r10, r12)
            r14[r3] = r4
            r4 = 1
            int r3 = r3 + r4
            goto L_0x06d4
        L_0x06eb:
            long r5 = r17 - r1
            java.math.RoundingMode r11 = java.math.RoundingMode.FLOOR
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r15.c
            long r1 = defpackage.v0g.a0(r5, r7, r9, r11)
            bqf r3 = new bqf
            r9 = r3
            r10 = r15
            r11 = r24
            r12 = r19
            r13 = r16
            r15 = r25
            r16 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
        L_0x0709:
            r2 = r3
            goto L_0x0312
        L_0x070c:
            r1 = r22
            r2 = 1
            goto L_0x0714
        L_0x0710:
            r0 = 0
            r2 = r1
            r1 = r22
        L_0x0714:
            if (r1 != r2) goto L_0x0718
            r2 = 1
            goto L_0x0719
        L_0x0718:
            r2 = r0
        L_0x0719:
            int r4 = r3.length
            int[] r4 = new int[r4]
            int r5 = r3.length
            int[] r5 = new int[r5]
            r21.getClass()
            r6 = r0
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x0726:
            int r10 = r3.length
            if (r6 >= r10) goto L_0x0777
            r10 = r21[r6]
            r12 = -1
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 == 0) goto L_0x076f
            r26 = r3[r6]
            java.math.RoundingMode r32 = java.math.RoundingMode.FLOOR
            long r12 = r15.c
            r22 = r1
            long r0 = r15.d
            r28 = r12
            r30 = r0
            long r0 = defpackage.v0g.a0(r26, r28, r30, r32)
            r12 = 1
            int r13 = defpackage.v0g.f(r14, r10, r12)
            r4[r6] = r13
            long r10 = r10 + r0
            int r0 = defpackage.v0g.b(r14, r10, r2)
            r5[r6] = r0
        L_0x0751:
            r0 = r4[r6]
            r1 = r5[r6]
            if (r0 >= r1) goto L_0x0761
            r10 = r25[r0]
            r10 = r10 & r12
            if (r10 != 0) goto L_0x0761
            int r0 = r0 + r12
            r4[r6] = r0
            r12 = 1
            goto L_0x0751
        L_0x0761:
            int r10 = r1 - r0
            int r10 = r10 + r8
            if (r9 == r0) goto L_0x0768
            r0 = 1
            goto L_0x0769
        L_0x0768:
            r0 = 0
        L_0x0769:
            r0 = r0 | r7
            r7 = r0
            r9 = r1
            r8 = r10
        L_0x076d:
            r0 = 1
            goto L_0x0772
        L_0x076f:
            r22 = r1
            goto L_0x076d
        L_0x0772:
            int r6 = r6 + r0
            r1 = r22
            r0 = 0
            goto L_0x0726
        L_0x0777:
            r22 = r1
            r0 = r20
            if (r8 == r0) goto L_0x077f
            r0 = 1
            goto L_0x0780
        L_0x077f:
            r0 = 0
        L_0x0780:
            r0 = r0 | r7
            if (r0 == 0) goto L_0x0787
            long[] r1 = new long[r8]
            r11 = r1
            goto L_0x0789
        L_0x0787:
            r11 = r24
        L_0x0789:
            if (r0 == 0) goto L_0x078f
            int[] r1 = new int[r8]
            r12 = r1
            goto L_0x0791
        L_0x078f:
            r12 = r19
        L_0x0791:
            if (r0 == 0) goto L_0x0795
            r16 = 0
        L_0x0795:
            if (r0 == 0) goto L_0x079a
            int[] r1 = new int[r8]
            goto L_0x079c
        L_0x079a:
            r1 = r25
        L_0x079c:
            long[] r2 = new long[r8]
            r13 = r16
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x07a4:
            int r10 = r3.length
            if (r6 >= r10) goto L_0x085b
            r16 = r21[r6]
            r10 = r4[r6]
            r20 = r4
            r4 = r5[r6]
            r23 = r5
            if (r0 == 0) goto L_0x07c9
            int r5 = r4 - r10
            r34 = r13
            r13 = r24
            java.lang.System.arraycopy(r13, r10, r11, r7, r5)
            r13 = r19
            java.lang.System.arraycopy(r13, r10, r12, r7, r5)
            r19 = r11
            r11 = r25
            java.lang.System.arraycopy(r11, r10, r1, r7, r5)
            goto L_0x07d1
        L_0x07c9:
            r34 = r13
            r13 = r19
            r19 = r11
            r11 = r25
        L_0x07d1:
            r5 = r34
        L_0x07d3:
            if (r10 >= r4) goto L_0x0834
            java.math.RoundingMode r34 = java.math.RoundingMode.FLOOR
            r28 = 1000000(0xf4240, double:4.940656E-318)
            r35 = r3
            r36 = r4
            long r3 = r15.d
            r26 = r8
            r30 = r3
            r32 = r34
            long r3 = defpackage.v0g.a0(r26, r28, r30, r32)
            r25 = r14[r10]
            long r25 = r25 - r16
            r27 = 1000000(0xf4240, double:4.940656E-318)
            r37 = r8
            long r8 = r15.c
            r29 = r8
            r31 = r34
            long r8 = defpackage.v0g.a0(r25, r27, r29, r31)
            r25 = r11
            r11 = r22
            r22 = r14
            r14 = 1
            if (r11 == r14) goto L_0x0808
            r14 = 1
            goto L_0x0809
        L_0x0808:
            r14 = 0
        L_0x0809:
            r39 = r15
            if (r14 == 0) goto L_0x0814
            r14 = 0
            long r8 = java.lang.Math.max(r14, r8)
            goto L_0x0816
        L_0x0814:
            r14 = 0
        L_0x0816:
            long r3 = r3 + r8
            r2[r7] = r3
            if (r0 == 0) goto L_0x0822
            r3 = r12[r7]
            if (r3 <= r5) goto L_0x0822
            r3 = r13[r10]
            r5 = r3
        L_0x0822:
            r3 = 1
            int r7 = r7 + r3
            int r10 = r10 + r3
            r14 = r22
            r3 = r35
            r4 = r36
            r8 = r37
            r15 = r39
            r22 = r11
            r11 = r25
            goto L_0x07d3
        L_0x0834:
            r35 = r3
            r37 = r8
            r25 = r11
            r39 = r15
            r11 = r22
            r3 = 1
            r22 = r14
            r14 = 0
            r8 = r35[r6]
            long r8 = r37 + r8
            int r6 = r6 + r3
            r4 = r20
            r14 = r22
            r3 = r35
            r15 = r39
            r22 = r11
            r11 = r19
            r19 = r13
            r13 = r5
            r5 = r23
            goto L_0x07a4
        L_0x085b:
            r37 = r8
            r19 = r11
            r34 = r13
            r39 = r15
            java.math.RoundingMode r32 = java.math.RoundingMode.FLOOR
            r28 = 1000000(0xf4240, double:4.940656E-318)
            r0 = r39
            long r3 = r0.d
            r26 = r37
            r30 = r3
            long r16 = defpackage.v0g.a0(r26, r28, r30, r32)
            bqf r3 = new bqf
            r9 = r3
            r10 = r0
            r11 = r19
            r13 = r34
            r14 = r2
            r15 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0709
        L_0x0883:
            r0.add(r2)
            goto L_0x0023
        L_0x0888:
            int r7 = r33 + 1
            r1 = r46
            r5 = r0
            r3 = -1
            r0 = r45
            goto L_0x000b
        L_0x0892:
            java.lang.String r0 = "Track has no sample table size information"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x089a:
            r1 = 0
            java.lang.String r0 = "Malformed sample table (stbl) missing sample description (stsd)"
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x08a2:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bz.f(qy, mp6, long, yv4, boolean, boolean, yi6):java.util.ArrayList");
    }
}
