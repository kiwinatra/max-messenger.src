package defpackage;

import androidx.media3.common.ParserException;
import java.io.EOFException;

/* renamed from: ku9  reason: default package */
public final class ku9 implements tf5 {
    public static final p79 D0 = new p79(20);
    public boolean A0;
    public boolean B0;
    public long C0;
    public zpf X;
    public int Y;
    public sp9 Z;
    public final int a;
    public final long b;
    public final l8b c;
    public final bv9 o;
    public final mp6 v;
    public long v0;
    public final vs6 w;
    public long w0;
    public final ip4 x;
    public long x0;
    public xf5 y;
    public int y0;
    public zpf z;
    public aod z0;

    public ku9(int i) {
        this(i, -9223372036854775807L);
    }

    public static long a(sp9 sp9) {
        if (sp9 == null) {
            return -9223372036854775807L;
        }
        int d = sp9.d();
        for (int i = 0; i < d; i++) {
            qp9 c2 = sp9.c(i);
            if (c2 instanceof nff) {
                nff nff = (nff) c2;
                if (nff.a.equals("TLEN")) {
                    return v0g.S(Long.parseLong((String) nff.c.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void U(xf5 xf5) {
        this.y = xf5;
        zpf B = xf5.B(0, 1);
        this.z = B;
        this.X = B;
        this.y.v();
    }

    public final boolean b(hf4 hf4) {
        aod aod = this.z0;
        if (aod != null) {
            long a2 = aod.a();
            if (a2 != -1 && hf4.r() > a2 - 4) {
                return true;
            }
        }
        try {
            return !hf4.q(this.c.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean c(hf4 hf4, boolean z2) {
        int i;
        int i2;
        int s;
        hf4 hf42 = hf4;
        int i3 = z2 ? 32768 : 131072;
        hf42.w = 0;
        if (hf42.o == 0) {
            sp9 t = this.w.t(hf42, (this.a & 8) == 0 ? null : D0);
            this.Z = t;
            if (t != null) {
                this.v.b(t);
            }
            i = (int) hf4.r();
            if (!z2) {
                hf42.z(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = i2;
        int i5 = i4;
        while (true) {
            if (!b(hf4)) {
                l8b l8b = this.c;
                l8b.G(0);
                int g = l8b.g();
                if ((i2 == 0 || ((long) (-128000 & g)) == (((long) i2) & -128000)) && (s = hsg.s(g)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.o.a(g);
                        i2 = g;
                    }
                    hf42.a(s - 4, false);
                } else {
                    int i6 = i5 + 1;
                    if (i5 != i3) {
                        if (z2) {
                            hf42.w = 0;
                            hf42.a(i + i6, false);
                        } else {
                            hf42.z(1);
                        }
                        i4 = 0;
                        i5 = i6;
                        i2 = 0;
                    } else if (z2) {
                        return false;
                    } else {
                        throw ParserException.a("Searched too many bytes.", (RuntimeException) null);
                    }
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z2) {
            hf42.z(i + i5);
        } else {
            hf42.w = 0;
        }
        this.Y = i2;
        return true;
    }

    public final void d(long j, long j2) {
        this.Y = 0;
        this.v0 = -9223372036854775807L;
        this.w0 = 0;
        this.y0 = 0;
        this.C0 = j2;
        aod aod = this.z0;
        if ((aod instanceof ye7) && !((ye7) aod).d(j2)) {
            this.B0 = true;
            this.X = this.x;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: i1g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: ps9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: wi3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: ye7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: wi3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: ye7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: ye7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: ye7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: wi3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: wi3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: ps9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: ps9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v55, resolved type: i1g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v56, resolved type: ye7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: ye7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: i1g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: i1g} */
    /* JADX WARNING: type inference failed for: r0v30, types: [me0] */
    /* JADX WARNING: type inference failed for: r2v28 */
    /* JADX WARNING: type inference failed for: r39v5, types: [wi3] */
    /* JADX WARNING: type inference failed for: r40v2, types: [irg] */
    /* JADX WARNING: type inference failed for: r30v3, types: [irg] */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03ac, code lost:
        if (r1 == null) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03af, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        if (r6 != 1231971951) goto L_0x006e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x041a  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x051f  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.vf5 r51, defpackage.yl4 r52) {
        /*
            r50 = this;
            r0 = r50
            r1 = r51
            r2 = 2
            r3 = 4
            r4 = 1
            zpf r5 = r0.z
            defpackage.n79.o(r5)
            int r5 = defpackage.v0g.a
            int r5 = r0.Y
            r7 = 1000000(0xf4240, double:4.940656E-318)
            bv9 r9 = r0.o
            r10 = 0
            if (r5 != 0) goto L_0x0025
            r5 = r1
            hf4 r5 = (defpackage.hf4) r5     // Catch:{ EOFException -> 0x001f }
            r0.c(r5, r10)     // Catch:{ EOFException -> 0x001f }
            goto L_0x0025
        L_0x001f:
            r2 = r0
            r7 = r9
            r0 = -1
            r14 = -1
            goto L_0x054d
        L_0x0025:
            aod r5 = r0.z0
            l8b r11 = r0.c
            if (r5 != 0) goto L_0x0442
            l8b r5 = new l8b
            int r12 = r9.d
            r5.<init>((int) r12)
            byte[] r12 = r5.a
            int r13 = r9.d
            r14 = r1
            hf4 r14 = (defpackage.hf4) r14
            r14.q(r12, r10, r13, r10)
            int r12 = r9.b
            r12 = r12 & r4
            r13 = 36
            if (r12 == 0) goto L_0x004c
            int r12 = r9.f
            if (r12 == r4) goto L_0x0049
            r12 = r13
            goto L_0x0053
        L_0x0049:
            r12 = 21
            goto L_0x0053
        L_0x004c:
            int r12 = r9.f
            if (r12 == r4) goto L_0x0051
            goto L_0x0049
        L_0x0051:
            r12 = 13
        L_0x0053:
            int r15 = r5.c
            int r6 = r12 + 4
            r14 = 1447187017(0x56425249, float:5.3414667E13)
            r3 = 1231971951(0x496e666f, float:976486.94)
            r4 = 1483304551(0x58696e67, float:1.02664153E15)
            if (r15 < r6) goto L_0x006e
            r5.G(r12)
            int r6 = r5.g()
            if (r6 == r4) goto L_0x0080
            if (r6 != r3) goto L_0x006e
            goto L_0x0080
        L_0x006e:
            int r6 = r5.c
            r12 = 40
            if (r6 < r12) goto L_0x007f
            r5.G(r13)
            int r6 = r5.g()
            if (r6 != r14) goto L_0x007f
            r6 = r14
            goto L_0x0080
        L_0x007f:
            r6 = r10
        L_0x0080:
            mp6 r12 = r0.v
            r20 = -1
            if (r6 == r3) goto L_0x0099
            if (r6 == r14) goto L_0x009e
            if (r6 == r4) goto L_0x0099
            r3 = r1
            hf4 r3 = (defpackage.hf4) r3
            r3.w = r10
            r2 = r0
            r0 = r1
            r7 = r9
            r29 = r11
            r24 = r12
            r1 = 0
            goto L_0x02f6
        L_0x0099:
            r7 = r9
            r29 = r11
            goto L_0x0173
        L_0x009e:
            r3 = r1
            hf4 r3 = (defpackage.hf4) r3
            long r14 = r3.o
            r4 = 10
            r5.H(r4)
            int r4 = r5.g()
            if (r4 > 0) goto L_0x00b5
            r0 = r3
            r7 = r9
            r29 = r11
        L_0x00b2:
            r1 = 0
            goto L_0x0166
        L_0x00b5:
            int r6 = r9.e
            r29 = r11
            long r10 = (long) r4
            r4 = 32000(0x7d00, float:4.4842E-41)
            if (r6 < r4) goto L_0x00c3
            r4 = 1152(0x480, float:1.614E-42)
        L_0x00c0:
            r30 = r14
            goto L_0x00c6
        L_0x00c3:
            r4 = 576(0x240, float:8.07E-43)
            goto L_0x00c0
        L_0x00c6:
            long r13 = (long) r4
            long r24 = r13 * r7
            long r13 = (long) r6
            java.math.RoundingMode r28 = java.math.RoundingMode.FLOOR
            r22 = r10
            r26 = r13
            long r35 = defpackage.v0g.a0(r22, r24, r26, r28)
            int r4 = r5.A()
            int r6 = r5.A()
            int r10 = r5.A()
            r5.H(r2)
            int r11 = r9.d
            long r13 = (long) r11
            long r14 = r30 + r13
            long[] r11 = new long[r4]
            long[] r13 = new long[r4]
            r18 = r3
            r2 = r30
            r7 = 0
        L_0x00f1:
            if (r7 >= r4) goto L_0x0133
            r24 = r9
            long r8 = (long) r7
            long r8 = r8 * r35
            long r0 = (long) r4
            long r8 = r8 / r0
            r11[r7] = r8
            long r0 = java.lang.Math.max(r2, r14)
            r13[r7] = r0
            r0 = 1
            if (r10 == r0) goto L_0x0122
            r0 = 2
            if (r10 == r0) goto L_0x011d
            r0 = 3
            if (r10 == r0) goto L_0x0118
            r0 = 4
            if (r10 == r0) goto L_0x0113
            r0 = r18
            r7 = r24
            goto L_0x00b2
        L_0x0113:
            int r0 = r5.y()
            goto L_0x0126
        L_0x0118:
            int r0 = r5.x()
            goto L_0x0126
        L_0x011d:
            int r0 = r5.A()
            goto L_0x0126
        L_0x0122:
            int r0 = r5.u()
        L_0x0126:
            long r0 = (long) r0
            long r8 = (long) r6
            long r0 = r0 * r8
            long r2 = r2 + r0
            r0 = 1
            int r7 = r7 + r0
            r0 = r50
            r1 = r51
            r9 = r24
            goto L_0x00f1
        L_0x0133:
            r24 = r9
            r0 = r18
            long r4 = r0.c
            int r1 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r1 == 0) goto L_0x0153
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0153
            java.lang.String r1 = "VBRI data size mismatch: "
            java.lang.String r6 = ", "
            java.lang.StringBuilder r1 = defpackage.tr1.n(r4, r1, r6)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.i8b.V(r1)
        L_0x0153:
            i1g r1 = new i1g
            r7 = r24
            int r4 = r7.g
            r32 = r1
            r33 = r11
            r34 = r13
            r37 = r2
            r39 = r4
            r32.<init>(r33, r34, r35, r37, r39)
        L_0x0166:
            int r2 = r7.d
            r0.z(r2)
            r2 = r50
            r0 = r51
            r24 = r12
            goto L_0x02f6
        L_0x0173:
            int r0 = r5.g()
            r1 = 1
            r2 = r0 & 1
            if (r2 == 0) goto L_0x0182
            int r1 = r5.y()
        L_0x0180:
            r2 = 2
            goto L_0x0184
        L_0x0182:
            r1 = -1
            goto L_0x0180
        L_0x0184:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0190
            long r2 = r5.w()
            r37 = r2
        L_0x018e:
            r2 = 4
            goto L_0x0193
        L_0x0190:
            r37 = r20
            goto L_0x018e
        L_0x0193:
            r3 = r0 & 4
            if (r3 != r2) goto L_0x01ab
            r2 = 100
            long[] r3 = new long[r2]
            r9 = 0
        L_0x019c:
            if (r9 >= r2) goto L_0x01a8
            int r10 = r5.u()
            long r10 = (long) r10
            r3[r9] = r10
            r10 = 1
            int r9 = r9 + r10
            goto L_0x019c
        L_0x01a8:
            r39 = r3
            goto L_0x01ad
        L_0x01ab:
            r39 = 0
        L_0x01ad:
            r0 = r0 & 8
            if (r0 == 0) goto L_0x01b5
            r0 = 4
            r5.H(r0)
        L_0x01b5:
            int r0 = r5.a()
            r2 = 24
            if (r0 < r2) goto L_0x01cf
            r0 = 21
            r5.H(r0)
            int r0 = r5.x()
            r2 = 16773120(0xfff000, float:2.3504147E-38)
            r2 = r2 & r0
            int r2 = r2 >> 12
            r0 = r0 & 4095(0xfff, float:5.738E-42)
            goto L_0x01d1
        L_0x01cf:
            r0 = -1
            r2 = -1
        L_0x01d1:
            long r9 = (long) r1
            int r1 = r7.d
            int r3 = r7.e
            int r5 = r7.g
            int r11 = r7.h
            int r13 = r12.a
            r14 = -1
            if (r13 == r14) goto L_0x01e6
            int r13 = r12.b
            if (r13 == r14) goto L_0x01e6
        L_0x01e3:
            r0 = r51
            goto L_0x01ef
        L_0x01e6:
            if (r2 == r14) goto L_0x01e3
            if (r0 == r14) goto L_0x01e3
            r12.a = r2
            r12.b = r0
            goto L_0x01e3
        L_0x01ef:
            r2 = r0
            hf4 r2 = (defpackage.hf4) r2
            long r13 = r2.o
            r26 = r9
            long r8 = r2.c
            int r10 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r10 == 0) goto L_0x0224
            int r10 = (r37 > r20 ? 1 : (r37 == r20 ? 0 : -1))
            if (r10 == 0) goto L_0x0224
            r15 = r5
            long r4 = r13 + r37
            int r18 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r18 == 0) goto L_0x0221
            java.lang.String r10 = "Data size mismatch between stream ("
            r24 = r12
            java.lang.String r12 = ") and Xing frame ("
            java.lang.StringBuilder r10 = defpackage.tr1.n(r8, r10, r12)
            r10.append(r4)
            java.lang.String r4 = "), using Xing value."
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            defpackage.i8b.F(r4)
            goto L_0x0226
        L_0x0221:
            r24 = r12
            goto L_0x0226
        L_0x0224:
            r15 = r5
            goto L_0x0221
        L_0x0226:
            int r4 = r7.d
            r2.z(r4)
            r4 = 1
            r2 = 1483304551(0x58696e67, float:1.02664153E15)
            if (r6 != r2) goto L_0x028b
            int r2 = (r26 > r20 ? 1 : (r26 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x024d
            r8 = 0
            int r2 = (r26 > r8 ? 1 : (r26 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x023d
            goto L_0x024d
        L_0x023d:
            long r8 = (long) r11
            long r9 = r26 * r8
            long r9 = r9 - r4
            long r2 = defpackage.v0g.Y(r3, r9)
            r44 = r2
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0257
        L_0x024d:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r44 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0257:
            int r4 = (r44 > r2 ? 1 : (r44 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x025d
        L_0x025b:
            r1 = 0
            goto L_0x0287
        L_0x025d:
            int r2 = (r37 > r20 ? 1 : (r37 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x0275
            if (r39 != 0) goto L_0x0264
            goto L_0x0275
        L_0x0264:
            irg r2 = new irg
            r30 = r2
            r31 = r13
            r33 = r1
            r34 = r44
            r36 = r15
            r30.<init>(r31, r33, r34, r36, r37, r39)
        L_0x0273:
            r1 = r2
            goto L_0x0287
        L_0x0275:
            irg r2 = new irg
            r47 = -1
            r49 = 0
            r40 = r2
            r41 = r13
            r43 = r1
            r46 = r15
            r40.<init>(r41, r43, r44, r46, r47, r49)
            goto L_0x0273
        L_0x0287:
            r2 = r50
            goto L_0x02f6
        L_0x028b:
            int r2 = (r26 > r20 ? 1 : (r26 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x02a6
            r16 = 0
            int r2 = (r26 > r16 ? 1 : (r26 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x0296
            goto L_0x02a6
        L_0x0296:
            long r10 = (long) r11
            long r10 = r10 * r26
            long r10 = r10 - r4
            long r2 = defpackage.v0g.Y(r3, r10)
            r34 = r2
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x02b0
        L_0x02a6:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r34 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x02b0:
            int r4 = (r34 > r2 ? 1 : (r34 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x02b5
            goto L_0x025b
        L_0x02b5:
            int r2 = (r37 > r20 ? 1 : (r37 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x02c3
            long r8 = r13 + r37
            long r2 = (long) r1
            long r37 = r37 - r2
        L_0x02be:
            r40 = r8
            r2 = r37
            goto L_0x02cd
        L_0x02c3:
            int r2 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x025b
            long r2 = r8 - r13
            long r4 = (long) r1
            long r37 = r2 - r4
            goto L_0x02be
        L_0x02cd:
            java.math.RoundingMode r4 = java.math.RoundingMode.HALF_UP
            r32 = 8000000(0x7a1200, double:3.952525E-317)
            r30 = r2
            r36 = r4
            long r5 = defpackage.v0g.a0(r30, r32, r34, r36)
            int r44 = defpackage.cvg.r(r5)
            r5 = r26
            long r2 = defpackage.hi7.k(r2, r5, r4)
            int r45 = defpackage.cvg.r(r2)
            wi3 r2 = new wi3
            long r3 = (long) r1
            long r42 = r13 + r3
            r46 = 0
            r39 = r2
            r39.<init>(r40, r42, r44, r45, r46)
            goto L_0x0273
        L_0x02f6:
            sp9 r3 = r2.Z
            r4 = r0
            hf4 r4 = (defpackage.hf4) r4
            long r5 = r4.o
            if (r3 == 0) goto L_0x0361
            qp9[] r8 = r3.a
            int r9 = r8.length
            r10 = 0
        L_0x0303:
            if (r10 >= r9) goto L_0x0361
            r11 = r8[r10]
            boolean r12 = r11 instanceof defpackage.ns9
            if (r12 == 0) goto L_0x035a
            ns9 r11 = (defpackage.ns9) r11
            long r8 = a(r3)
            int[] r3 = r11.v
            int r3 = r3.length
            r19 = 1
            int r10 = r3 + 1
            long[] r12 = new long[r10]
            long[] r10 = new long[r10]
            r13 = 0
            r12[r13] = r5
            r14 = 0
            r10[r13] = r14
            r15 = r19
            r13 = 0
        L_0x0327:
            if (r15 > r3) goto L_0x0350
            int r18 = r15 + -1
            r26 = r3
            int[] r3 = r11.v
            r3 = r3[r18]
            int r0 = r11.c
            int r0 = r0 + r3
            r27 = r4
            long r3 = (long) r0
            long r5 = r5 + r3
            int[] r0 = r11.w
            r0 = r0[r18]
            int r3 = r11.o
            int r3 = r3 + r0
            long r3 = (long) r3
            long r13 = r13 + r3
            r12[r15] = r5
            r10[r15] = r13
            r0 = 1
            int r15 = r15 + r0
            r19 = r0
            r3 = r26
            r4 = r27
            r0 = r51
            goto L_0x0327
        L_0x0350:
            r27 = r4
            r0 = r19
            ps9 r3 = new ps9
            r3.<init>(r8, r12, r10)
            goto L_0x0364
        L_0x035a:
            r27 = r4
            r0 = 1
            int r10 = r10 + r0
            r0 = r51
            goto L_0x0303
        L_0x0361:
            r27 = r4
            r3 = 0
        L_0x0364:
            boolean r0 = r2.A0
            int r4 = r2.a
            if (r0 == 0) goto L_0x037b
            ynd r0 = new ynd
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.<init>(r5)
            r3 = r0
            r0 = r27
        L_0x0377:
            r1 = r29
            goto L_0x03ea
        L_0x037b:
            r0 = 4
            r5 = r4 & 4
            if (r5 == 0) goto L_0x03a6
            if (r3 == 0) goto L_0x0388
            long r0 = r3.c
        L_0x0384:
            r9 = r0
        L_0x0385:
            r13 = r20
            goto L_0x039b
        L_0x0388:
            if (r1 == 0) goto L_0x0394
            long r5 = r1.f()
            long r20 = r1.a()
            r9 = r5
            goto L_0x0385
        L_0x0394:
            sp9 r0 = r2.Z
            long r0 = a(r0)
            goto L_0x0384
        L_0x039b:
            ye7 r1 = new ye7
            r0 = r27
            long r11 = r0.o
            r8 = r1
            r8.<init>(r9, r11, r13)
            goto L_0x03b0
        L_0x03a6:
            r0 = r27
            if (r3 == 0) goto L_0x03ac
            r1 = r3
            goto L_0x03b0
        L_0x03ac:
            if (r1 == 0) goto L_0x03af
            goto L_0x03b0
        L_0x03af:
            r1 = 0
        L_0x03b0:
            if (r1 == 0) goto L_0x03bd
            boolean r3 = r1.c()
            if (r3 != 0) goto L_0x03bf
            r3 = 1
            r5 = r4 & 1
            if (r5 == 0) goto L_0x03bf
        L_0x03bd:
            r1 = 2
            goto L_0x03c1
        L_0x03bf:
            r3 = r1
            goto L_0x0377
        L_0x03c1:
            r1 = r1 & r4
            if (r1 == 0) goto L_0x03c8
            r1 = r29
            r15 = 1
            goto L_0x03cb
        L_0x03c8:
            r1 = r29
            r15 = 0
        L_0x03cb:
            byte[] r3 = r1.a
            r5 = 0
            r6 = 4
            r0.q(r3, r5, r6, r5)
            r1.G(r5)
            int r3 = r1.g()
            r7.a(r3)
            wi3 r3 = new wi3
            long r11 = r0.o
            int r13 = r7.g
            int r14 = r7.d
            long r9 = r0.c
            r8 = r3
            r8.<init>(r9, r11, r13, r14, r15)
        L_0x03ea:
            r2.z0 = r3
            xf5 r5 = r2.y
            r5.M(r3)
            ba6 r3 = new ba6
            r3.<init>()
            java.lang.String r5 = r7.c
            java.lang.String r5 = defpackage.vq9.l(r5)
            r3.m = r5
            r5 = 4096(0x1000, float:5.74E-42)
            r3.n = r5
            int r5 = r7.f
            r3.A = r5
            int r5 = r7.e
            r3.B = r5
            r5 = r24
            int r6 = r5.a
            r3.D = r6
            int r5 = r5.b
            r3.E = r5
            r4 = r4 & 8
            if (r4 == 0) goto L_0x041a
            r13 = 0
            goto L_0x041c
        L_0x041a:
            sp9 r13 = r2.Z
        L_0x041c:
            r3.j = r13
            aod r4 = r2.z0
            int r4 = r4.h()
            r5 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r4 == r5) goto L_0x0431
            aod r4 = r2.z0
            int r4 = r4.h()
            r3.g = r4
        L_0x0431:
            zpf r4 = r2.X
            ea6 r5 = new ea6
            r5.<init>(r3)
            r4.e(r5)
            long r3 = r0.o
            r2.x0 = r3
        L_0x043f:
            r0 = r51
            goto L_0x0460
        L_0x0442:
            r2 = r0
            r7 = r9
            r1 = r11
            long r3 = r2.x0
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x043f
            r0 = r51
            r5 = r0
            hf4 r5 = (defpackage.hf4) r5
            long r5 = r5.o
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x0460
            long r3 = r3 - r5
            int r3 = (int) r3
            r4 = r0
            hf4 r4 = (defpackage.hf4) r4
            r4.z(r3)
        L_0x0460:
            int r3 = r2.y0
            if (r3 != 0) goto L_0x0509
            r3 = r0
            hf4 r3 = (defpackage.hf4) r3
            r4 = 0
            r3.w = r4
            r3 = r0
            hf4 r3 = (defpackage.hf4) r3
            boolean r5 = r2.b(r3)
            if (r5 == 0) goto L_0x0476
        L_0x0473:
            r10 = -1
            goto L_0x054b
        L_0x0476:
            r1.G(r4)
            int r1 = r1.g()
            int r4 = r2.Y
            long r4 = (long) r4
            r6 = -128000(0xfffffffffffe0c00, float:NaN)
            r6 = r6 & r1
            long r8 = (long) r6
            r10 = -128000(0xfffffffffffe0c00, double:NaN)
            long r4 = r4 & r10
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0494
            int r4 = defpackage.hsg.s(r1)
            r5 = -1
            if (r4 != r5) goto L_0x0498
        L_0x0494:
            r1 = 0
            r4 = 1
            goto L_0x050b
        L_0x0498:
            r7.a(r1)
            long r4 = r2.v0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x04c4
            aod r1 = r2.z0
            long r4 = r3.o
            long r4 = r1.b(r4)
            r2.v0 = r4
            long r4 = r2.b
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x04c4
            aod r1 = r2.z0
            r8 = 0
            long r8 = r1.b(r8)
            long r10 = r2.v0
            long r4 = r4 - r8
            long r4 = r4 + r10
            r2.v0 = r4
        L_0x04c4:
            int r1 = r7.d
            r2.y0 = r1
            aod r4 = r2.z0
            boolean r5 = r4 instanceof defpackage.ye7
            if (r5 == 0) goto L_0x0509
            ye7 r4 = (defpackage.ye7) r4
            long r5 = r2.w0
            int r8 = r7.h
            long r8 = (long) r8
            long r5 = r5 + r8
            long r8 = r2.v0
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r5 * r10
            int r10 = r7.e
            long r10 = (long) r10
            long r5 = r5 / r10
            long r5 = r5 + r8
            long r8 = r3.o
            long r10 = (long) r1
            long r8 = r8 + r10
            boolean r1 = r4.d(r5)
            if (r1 == 0) goto L_0x04ec
            goto L_0x04f6
        L_0x04ec:
            pa8 r1 = r4.b
            r1.a(r5)
            pa8 r1 = r4.c
            r1.a(r8)
        L_0x04f6:
            boolean r1 = r2.B0
            if (r1 == 0) goto L_0x0509
            long r5 = r2.C0
            boolean r1 = r4.d(r5)
            if (r1 == 0) goto L_0x0509
            r1 = 0
            r2.B0 = r1
            zpf r3 = r2.z
            r2.X = r3
        L_0x0509:
            r4 = 1
            goto L_0x0512
        L_0x050b:
            r3.z(r4)
            r2.Y = r1
        L_0x0510:
            r10 = 0
            goto L_0x054b
        L_0x0512:
            zpf r1 = r2.X
            int r3 = r2.y0
            int r0 = r1.c(r0, r3, r4)
            r1 = -1
            if (r0 != r1) goto L_0x051f
            goto L_0x0473
        L_0x051f:
            int r1 = r2.y0
            int r1 = r1 - r0
            r2.y0 = r1
            if (r1 <= 0) goto L_0x0527
            goto L_0x0510
        L_0x0527:
            zpf r8 = r2.X
            long r0 = r2.w0
            long r3 = r2.v0
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r5
            int r5 = r7.e
            long r5 = (long) r5
            long r0 = r0 / r5
            long r9 = r0 + r3
            int r12 = r7.d
            r13 = 0
            r14 = 0
            r11 = 1
            r8.a(r9, r11, r12, r13, r14)
            long r0 = r2.w0
            int r3 = r7.h
            long r3 = (long) r3
            long r0 = r0 + r3
            r2.w0 = r0
            r0 = 0
            r2.y0 = r0
            r10 = r0
        L_0x054b:
            r14 = r10
            r0 = -1
        L_0x054d:
            if (r14 != r0) goto L_0x0576
            aod r0 = r2.z0
            boolean r1 = r0 instanceof defpackage.ye7
            if (r1 == 0) goto L_0x0576
            long r3 = r2.w0
            long r5 = r2.v0
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r8
            int r1 = r7.e
            long r7 = (long) r1
            long r3 = r3 / r7
            long r3 = r3 + r5
            long r0 = r0.f()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0576
            aod r0 = r2.z0
            r1 = r0
            ye7 r1 = (defpackage.ye7) r1
            r1.v = r3
            xf5 r1 = r2.y
            r1.M(r0)
        L_0x0576:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku9.g(vf5, yl4):int");
    }

    public final boolean n(vf5 vf5) {
        return c((hf4) vf5, true);
    }

    public final void release() {
    }

    public ku9(int i, long j) {
        this.a = (i & 2) != 0 ? i | 1 : i;
        this.b = j;
        this.c = new l8b(10);
        this.o = new bv9(1);
        this.v = new mp6();
        this.v0 = -9223372036854775807L;
        this.w = new vs6(23);
        ip4 ip4 = new ip4();
        this.x = ip4;
        this.X = ip4;
    }
}
