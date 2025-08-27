package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;

/* renamed from: ju9  reason: default package */
public final class ju9 implements sf5 {
    public static final p79 u = new p79(19);
    public final int a;
    public final long b;
    public final g1g c;
    public final bv9 d;
    public final lp6 e;
    public final y35 f;
    public final xx4 g;
    public wf5 h;
    public ypf i;
    public ypf j;
    public int k;
    public rp9 l;
    public long m;
    public long n;
    public long o;
    public int p;
    public znd q;
    public boolean r;
    public boolean s;
    public long t;

    public ju9() {
        this(-9223372036854775807L);
    }

    public static long b(rp9 rp9) {
        if (rp9 == null) {
            return -9223372036854775807L;
        }
        for (pp9 pp9 : rp9.a) {
            if (pp9 instanceof mff) {
                mff mff = (mff) pp9;
                if (mff.a.equals("TLEN")) {
                    return t0g.D(Long.parseLong(mff.c));
                }
            }
        }
        return -9223372036854775807L;
    }

    public final vi3 a(gf4 gf4, boolean z) {
        g1g g1g = this.c;
        gf4.q(g1g.a, 0, 4, false);
        g1g.H(0);
        int h2 = g1g.h();
        bv9 bv9 = this.d;
        bv9.a(h2);
        return new ti3(gf4.c, gf4.o, bv9.g, bv9.d, z);
    }

    public final boolean c(gf4 gf4) {
        znd znd = this.q;
        if (znd != null) {
            long a2 = znd.a();
            if (a2 != -1 && gf4.r() > a2 - 4) {
                return true;
            }
        }
        try {
            return !gf4.q(this.c.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final void d(long j2, long j3) {
        this.k = 0;
        this.m = -9223372036854775807L;
        this.n = 0;
        this.p = 0;
        this.t = j3;
        znd znd = this.q;
        if ((znd instanceof xe7) && !((xe7) znd).d(j3)) {
            this.s = true;
            this.j = this.g;
        }
    }

    public final boolean e(gf4 gf4, boolean z) {
        int i2;
        int i3;
        int n2;
        gf4 gf42 = gf4;
        int i4 = z ? 32768 : 131072;
        gf42.w = 0;
        if (gf42.o == 0) {
            rp9 r2 = this.f.r(gf42, (this.a & 8) == 0 ? null : u);
            this.l = r2;
            if (r2 != null) {
                this.e.b(r2);
            }
            i2 = (int) gf4.r();
            if (!z) {
                gf42.z(i2);
            }
            i3 = 0;
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i5 = i3;
        int i6 = i5;
        while (true) {
            if (!c(gf4)) {
                g1g g1g = this.c;
                g1g.H(0);
                int h2 = g1g.h();
                if ((i3 == 0 || ((long) (-128000 & h2)) == (((long) i3) & -128000)) && (n2 = gsg.n(h2)) != -1) {
                    i5++;
                    if (i5 != 1) {
                        if (i5 == 4) {
                            break;
                        }
                    } else {
                        this.d.a(h2);
                        i3 = h2;
                    }
                    gf42.a(n2 - 4, false);
                } else {
                    int i7 = i6 + 1;
                    if (i6 != i4) {
                        if (z) {
                            gf42.w = 0;
                            gf42.a(i2 + i7, false);
                        } else {
                            gf42.z(1);
                        }
                        i5 = 0;
                        i6 = i7;
                        i3 = 0;
                    } else if (z) {
                        return false;
                    } else {
                        throw ParserException.a("Searched too many bytes.", (RuntimeException) null);
                    }
                }
            } else if (i5 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            gf42.z(i2 + i6);
        } else {
            gf42.w = 0;
        }
        this.k = i3;
        return true;
    }

    public final void g(wf5 wf5) {
        this.h = wf5;
        ypf B = wf5.B(0, 1);
        this.i = B;
        this.j = B;
        this.h.v();
    }

    public final boolean h(uf5 uf5) {
        return e((gf4) uf5, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: znd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: os9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: xe7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: xe7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: xe7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: xe7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: os9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: os9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: hrg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: h1g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v64, resolved type: xe7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v65, resolved type: xe7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v66, resolved type: xe7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v67, resolved type: vi3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v4, resolved type: xe7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v68, resolved type: vi3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v69, resolved type: vi3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v5, resolved type: h1g} */
    /* JADX WARNING: type inference failed for: r1v45, types: [tq5] */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02ca, code lost:
        if (r1 == null) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02cd, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02d9, code lost:
        if ((r5 & 1) != 0) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (r11 != 1231971951) goto L_0x006b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0218  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(defpackage.uf5 r37, defpackage.yl4 r38) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r3 = 4
            r4 = 1
            ypf r5 = r0.i
            defpackage.y64.k(r5)
            int r5 = defpackage.t0g.a
            int r5 = r0.k
            r7 = 1000000(0xf4240, double:4.940656E-318)
            bv9 r9 = r0.d
            r10 = 0
            if (r5 != 0) goto L_0x0023
            r5 = r1
            gf4 r5 = (defpackage.gf4) r5     // Catch:{ EOFException -> 0x001e }
            r0.e(r5, r10)     // Catch:{ EOFException -> 0x001e }
            goto L_0x0023
        L_0x001e:
            r4 = r0
            r0 = -1
            r5 = -1
            goto L_0x0432
        L_0x0023:
            znd r5 = r0.q
            g1g r13 = r0.c
            if (r5 != 0) goto L_0x0325
            g1g r5 = new g1g
            int r11 = r9.d
            r5.<init>((int) r11)
            byte[] r11 = r5.a
            int r12 = r9.d
            r14 = r1
            gf4 r14 = (defpackage.gf4) r14
            r14.q(r11, r10, r12, r10)
            int r11 = r9.b
            r11 = r11 & r4
            r12 = 21
            r14 = 36
            if (r11 == 0) goto L_0x0049
            int r11 = r9.f
            if (r11 == r4) goto L_0x0050
            r12 = r14
            goto L_0x0050
        L_0x0049:
            int r11 = r9.f
            if (r11 == r4) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r12 = 13
        L_0x0050:
            int r11 = r5.c
            int r15 = r12 + 4
            r6 = 1447187017(0x56425249, float:5.3414667E13)
            r10 = 1483304551(0x58696e67, float:1.02664153E15)
            r3 = 1231971951(0x496e666f, float:976486.94)
            if (r11 < r15) goto L_0x006b
            r5.H(r12)
            int r11 = r5.h()
            if (r11 == r10) goto L_0x007d
            if (r11 != r3) goto L_0x006b
            goto L_0x007d
        L_0x006b:
            int r11 = r5.c
            r15 = 40
            if (r11 < r15) goto L_0x007c
            r5.H(r14)
            int r11 = r5.h()
            if (r11 != r6) goto L_0x007c
            r11 = r6
            goto L_0x007d
        L_0x007c:
            r11 = 0
        L_0x007d:
            lp6 r14 = r0.e
            r15 = 3
            if (r11 == r10) goto L_0x0084
            if (r11 != r3) goto L_0x008b
        L_0x0084:
            r0 = r1
            r21 = r13
            r22 = r14
            goto L_0x0155
        L_0x008b:
            if (r11 != r6) goto L_0x0141
            r3 = r1
            gf4 r3 = (defpackage.gf4) r3
            long r10 = r3.o
            r6 = 10
            r5.I(r6)
            int r6 = r5.h()
            if (r6 > 0) goto L_0x00a6
            r25 = r3
            r21 = r13
            r22 = r14
        L_0x00a3:
            r0 = 0
            goto L_0x012f
        L_0x00a6:
            int r12 = r9.e
            r25 = r3
            long r2 = (long) r6
            r6 = 32000(0x7d00, float:4.4842E-41)
            if (r12 < r6) goto L_0x00b4
            r6 = 1152(0x480, float:1.614E-42)
        L_0x00b1:
            r27 = r5
            goto L_0x00b7
        L_0x00b4:
            r6 = 576(0x240, float:8.07E-43)
            goto L_0x00b1
        L_0x00b7:
            long r4 = (long) r6
            long r21 = r4 * r7
            long r4 = (long) r12
            r19 = r2
            r23 = r4
            long r31 = defpackage.t0g.J(r19, r21, r23)
            int r2 = r27.A()
            int r3 = r27.A()
            int r4 = r27.A()
            r5 = r27
            r6 = 2
            r5.I(r6)
            int r6 = r9.d
            long r7 = (long) r6
            long r7 = r7 + r10
            long[] r6 = new long[r2]
            long[] r12 = new long[r2]
            r21 = r13
            r22 = r14
            r13 = r10
            r10 = 0
        L_0x00e3:
            if (r10 >= r2) goto L_0x0122
            long r0 = (long) r10
            long r0 = r0 * r31
            r11 = r3
            r23 = r4
            long r3 = (long) r2
            long r0 = r0 / r3
            r6[r10] = r0
            long r0 = java.lang.Math.max(r13, r7)
            r12[r10] = r0
            r0 = r23
            r1 = 1
            if (r0 == r1) goto L_0x0112
            r1 = 2
            if (r0 == r1) goto L_0x010d
            if (r0 == r15) goto L_0x0108
            r1 = 4
            if (r0 == r1) goto L_0x0103
            goto L_0x00a3
        L_0x0103:
            int r1 = r5.y()
            goto L_0x0116
        L_0x0108:
            int r1 = r5.x()
            goto L_0x0116
        L_0x010d:
            int r1 = r5.A()
            goto L_0x0116
        L_0x0112:
            int r1 = r5.v()
        L_0x0116:
            int r1 = r1 * r11
            long r3 = (long) r1
            long r13 = r13 + r3
            r1 = 1
            int r10 = r10 + r1
            r1 = r37
            r4 = r0
            r3 = r11
            r0 = r36
            goto L_0x00e3
        L_0x0122:
            h1g r0 = new h1g
            r28 = r0
            r29 = r6
            r30 = r12
            r33 = r13
            r28.<init>(r29, r30, r31, r33)
        L_0x012f:
            int r1 = r9.d
            r2 = r25
            r2.z(r1)
            r4 = r36
            r2 = r0
            r5 = r21
            r3 = r22
            r0 = r37
            goto L_0x020e
        L_0x0141:
            r0 = r1
            r21 = r13
            r22 = r14
            r1 = r0
            gf4 r1 = (defpackage.gf4) r1
            r2 = 0
            r1.w = r2
            r4 = r36
            r5 = r21
            r3 = r22
            r2 = 0
            goto L_0x020e
        L_0x0155:
            r1 = r0
            gf4 r1 = (defpackage.gf4) r1
            long r6 = r1.o
            int r2 = r9.h
            int r4 = r9.e
            int r8 = r5.h()
            r10 = 1
            r13 = r8 & 1
            if (r13 != r10) goto L_0x01ba
            int r10 = r5.y()
            if (r10 != 0) goto L_0x016e
            goto L_0x01ba
        L_0x016e:
            long r13 = (long) r10
            long r2 = (long) r2
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r29 = r2 * r19
            long r2 = (long) r4
            r27 = r13
            r31 = r2
            long r31 = defpackage.t0g.J(r27, r29, r31)
            r2 = 6
            r3 = r8 & 6
            if (r3 == r2) goto L_0x0195
            hrg r2 = new hrg
            int r3 = r9.d
            r33 = -1
            r35 = 0
            r27 = r2
            r28 = r6
            r30 = r3
            r27.<init>(r28, r30, r31, r33, r35)
            goto L_0x01bb
        L_0x0195:
            long r33 = r5.w()
            r2 = 100
            long[] r3 = new long[r2]
            r4 = 0
        L_0x019e:
            if (r4 >= r2) goto L_0x01aa
            int r8 = r5.v()
            long r13 = (long) r8
            r3[r4] = r13
            r8 = 1
            int r4 = r4 + r8
            goto L_0x019e
        L_0x01aa:
            hrg r2 = new hrg
            int r4 = r9.d
            r27 = r2
            r28 = r6
            r30 = r4
            r35 = r3
            r27.<init>(r28, r30, r31, r33, r35)
            goto L_0x01bb
        L_0x01ba:
            r2 = 0
        L_0x01bb:
            if (r2 == 0) goto L_0x01ee
            r3 = r22
            int r4 = r3.a
            r5 = -1
            if (r4 == r5) goto L_0x01cb
            int r4 = r3.b
            if (r4 == r5) goto L_0x01cb
            r5 = r21
            goto L_0x01f2
        L_0x01cb:
            r4 = 0
            r1.w = r4
            int r12 = r12 + 141
            r1.a(r12, r4)
            r5 = r21
            byte[] r6 = r5.a
            r1.q(r6, r4, r15, r4)
            r5.H(r4)
            int r4 = r5.x()
            int r6 = r4 >> 12
            r4 = r4 & 4095(0xfff, float:5.738E-42)
            if (r6 > 0) goto L_0x01e9
            if (r4 <= 0) goto L_0x01f2
        L_0x01e9:
            r3.a = r6
            r3.b = r4
            goto L_0x01f2
        L_0x01ee:
            r5 = r21
            r3 = r22
        L_0x01f2:
            int r4 = r9.d
            r1.z(r4)
            if (r2 == 0) goto L_0x020c
            boolean r4 = r2.c()
            if (r4 != 0) goto L_0x020c
            r4 = 1231971951(0x496e666f, float:976486.94)
            if (r11 != r4) goto L_0x020c
            r6 = 0
            r4 = r36
            vi3 r1 = r4.a(r1, r6)
            goto L_0x020f
        L_0x020c:
            r4 = r36
        L_0x020e:
            r1 = r2
        L_0x020f:
            rp9 r2 = r4.l
            r6 = r0
            gf4 r6 = (defpackage.gf4) r6
            long r7 = r6.o
            if (r2 == 0) goto L_0x0281
            pp9[] r10 = r2.a
            int r11 = r10.length
            r12 = 0
        L_0x021c:
            if (r12 >= r11) goto L_0x0281
            r13 = r10[r12]
            boolean r14 = r13 instanceof defpackage.ms9
            if (r14 == 0) goto L_0x0278
            ms9 r13 = (defpackage.ms9) r13
            long r10 = b(r2)
            int[] r2 = r13.v
            int r2 = r2.length
            r26 = 1
            int r12 = r2 + 1
            long[] r14 = new long[r12]
            long[] r12 = new long[r12]
            r15 = 0
            r14[r15] = r7
            r17 = 0
            r12[r15] = r17
            r15 = r26
            r21 = 0
        L_0x0240:
            if (r15 > r2) goto L_0x026c
            int r23 = r15 + -1
            r24 = r2
            int[] r2 = r13.v
            r2 = r2[r23]
            r25 = r5
            int r5 = r13.c
            int r5 = r5 + r2
            r27 = r3
            long r2 = (long) r5
            long r7 = r7 + r2
            int[] r2 = r13.w
            r2 = r2[r23]
            int r3 = r13.o
            int r3 = r3 + r2
            long r2 = (long) r3
            long r21 = r21 + r2
            r14[r15] = r7
            r12[r15] = r21
            r3 = 1
            int r15 = r15 + r3
            r26 = r3
            r2 = r24
            r5 = r25
            r3 = r27
            goto L_0x0240
        L_0x026c:
            r27 = r3
            r25 = r5
            r3 = r26
            os9 r2 = new os9
            r2.<init>(r10, r14, r12)
            goto L_0x0286
        L_0x0278:
            r27 = r3
            r25 = r5
            r3 = 1
            int r12 = r12 + r3
            r3 = r27
            goto L_0x021c
        L_0x0281:
            r27 = r3
            r25 = r5
            r2 = 0
        L_0x0286:
            boolean r3 = r4.r
            int r5 = r4.a
            if (r3 == 0) goto L_0x0297
            xnd r1 = new xnd
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r2)
            goto L_0x02e6
        L_0x0297:
            r3 = 4
            r3 = r3 & r5
            if (r3 == 0) goto L_0x02c6
            r7 = -1
            if (r2 == 0) goto L_0x02a6
            long r1 = r2.c
        L_0x02a1:
            r29 = r1
        L_0x02a3:
            r33 = r7
            goto L_0x02ba
        L_0x02a6:
            if (r1 == 0) goto L_0x02b3
            long r2 = r1.f()
            long r7 = r1.a()
            r29 = r2
            goto L_0x02a3
        L_0x02b3:
            rp9 r1 = r4.l
            long r1 = b(r1)
            goto L_0x02a1
        L_0x02ba:
            xe7 r1 = new xe7
            long r2 = r6.o
            r28 = r1
            r31 = r2
            r28.<init>(r29, r31, r33)
            goto L_0x02ce
        L_0x02c6:
            if (r2 == 0) goto L_0x02ca
            r1 = r2
            goto L_0x02ce
        L_0x02ca:
            if (r1 == 0) goto L_0x02cd
            goto L_0x02ce
        L_0x02cd:
            r1 = 0
        L_0x02ce:
            if (r1 == 0) goto L_0x02db
            boolean r2 = r1.c()
            if (r2 != 0) goto L_0x02e6
            r2 = 1
            r3 = r5 & 1
            if (r3 == 0) goto L_0x02e6
        L_0x02db:
            r1 = 2
            r1 = r1 & r5
            if (r1 == 0) goto L_0x02e1
            r1 = 1
            goto L_0x02e2
        L_0x02e1:
            r1 = 0
        L_0x02e2:
            vi3 r1 = r4.a(r6, r1)
        L_0x02e6:
            r4.q = r1
            wf5 r2 = r4.h
            r2.K(r1)
            ypf r1 = r4.j
            aa6 r2 = new aa6
            r2.<init>()
            java.lang.String r3 = r9.c
            r2.k = r3
            r3 = 4096(0x1000, float:5.74E-42)
            r2.l = r3
            int r3 = r9.f
            r2.x = r3
            int r3 = r9.e
            r2.y = r3
            r3 = r27
            int r7 = r3.a
            r2.A = r7
            int r3 = r3.b
            r2.B = r3
            r3 = r5 & 8
            if (r3 == 0) goto L_0x0314
            r15 = 0
            goto L_0x0316
        L_0x0314:
            rp9 r15 = r4.l
        L_0x0316:
            r2.i = r15
            ca6 r3 = new ca6
            r3.<init>(r2)
            r1.d(r3)
            long r1 = r6.o
            r4.o = r1
            goto L_0x0342
        L_0x0325:
            r4 = r0
            r0 = r1
            r25 = r13
            long r1 = r4.o
            r5 = 0
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0342
            r3 = r0
            gf4 r3 = (defpackage.gf4) r3
            long r5 = r3.o
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x0342
            long r1 = r1 - r5
            int r1 = (int) r1
            r2 = r0
            gf4 r2 = (defpackage.gf4) r2
            r2.z(r1)
        L_0x0342:
            int r1 = r4.p
            if (r1 != 0) goto L_0x03ed
            r1 = r0
            gf4 r1 = (defpackage.gf4) r1
            r2 = 0
            r1.w = r2
            r1 = r0
            gf4 r1 = (defpackage.gf4) r1
            boolean r3 = r4.c(r1)
            if (r3 == 0) goto L_0x0358
        L_0x0355:
            r10 = -1
            goto L_0x0430
        L_0x0358:
            r3 = r25
            r3.H(r2)
            int r2 = r3.h()
            int r3 = r4.k
            long r5 = (long) r3
            r3 = -128000(0xfffffffffffe0c00, float:NaN)
            r3 = r3 & r2
            long r7 = (long) r3
            r10 = -128000(0xfffffffffffe0c00, double:NaN)
            long r5 = r5 & r10
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0378
            int r3 = defpackage.gsg.n(r2)
            r5 = -1
            if (r3 != r5) goto L_0x037c
        L_0x0378:
            r2 = 0
            r3 = 1
            goto L_0x03ef
        L_0x037c:
            r9.a(r2)
            long r2 = r4.m
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x03a8
            znd r2 = r4.q
            long r7 = r1.o
            long r2 = r2.b(r7)
            r4.m = r2
            long r2 = r4.b
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x03a8
            znd r5 = r4.q
            r6 = 0
            long r5 = r5.b(r6)
            long r7 = r4.m
            long r2 = r2 - r5
            long r2 = r2 + r7
            r4.m = r2
        L_0x03a8:
            int r2 = r9.d
            r4.p = r2
            znd r3 = r4.q
            boolean r5 = r3 instanceof defpackage.xe7
            if (r5 == 0) goto L_0x03ed
            xe7 r3 = (defpackage.xe7) r3
            long r5 = r4.n
            int r7 = r9.h
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r4.m
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r5 * r10
            int r10 = r9.e
            long r10 = (long) r10
            long r5 = r5 / r10
            long r5 = r5 + r7
            long r7 = r1.o
            long r1 = (long) r2
            long r7 = r7 + r1
            boolean r1 = r3.d(r5)
            if (r1 == 0) goto L_0x03d0
            goto L_0x03da
        L_0x03d0:
            pa8 r1 = r3.b
            r1.a(r5)
            pa8 r1 = r3.c
            r1.a(r7)
        L_0x03da:
            boolean r1 = r4.s
            if (r1 == 0) goto L_0x03ed
            long r1 = r4.t
            boolean r1 = r3.d(r1)
            if (r1 == 0) goto L_0x03ed
            r2 = 0
            r4.s = r2
            ypf r1 = r4.i
            r4.j = r1
        L_0x03ed:
            r3 = 1
            goto L_0x03f6
        L_0x03ef:
            r1.z(r3)
            r4.k = r2
        L_0x03f4:
            r10 = 0
            goto L_0x0430
        L_0x03f6:
            ypf r1 = r4.j
            int r2 = r4.p
            int r0 = r1.a(r0, r2, r3)
            r1 = -1
            if (r0 != r1) goto L_0x0403
            goto L_0x0355
        L_0x0403:
            int r1 = r4.p
            int r1 = r1 - r0
            r4.p = r1
            if (r1 <= 0) goto L_0x040b
            goto L_0x03f4
        L_0x040b:
            ypf r10 = r4.j
            long r0 = r4.n
            long r2 = r4.m
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r5
            int r5 = r9.e
            long r5 = (long) r5
            long r0 = r0 / r5
            long r11 = r0 + r2
            int r14 = r9.d
            r15 = 0
            r16 = 0
            r13 = 1
            r10.b(r11, r13, r14, r15, r16)
            long r0 = r4.n
            int r2 = r9.h
            long r2 = (long) r2
            long r0 = r0 + r2
            r4.n = r0
            r0 = 0
            r4.p = r0
            r10 = r0
        L_0x0430:
            r5 = r10
            r0 = -1
        L_0x0432:
            if (r5 != r0) goto L_0x045b
            znd r0 = r4.q
            boolean r1 = r0 instanceof defpackage.xe7
            if (r1 == 0) goto L_0x045b
            long r1 = r4.n
            long r6 = r4.m
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 * r10
            int r3 = r9.e
            long r8 = (long) r3
            long r1 = r1 / r8
            long r1 = r1 + r6
            long r6 = r0.f()
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x045b
            znd r0 = r4.q
            r3 = r0
            xe7 r3 = (defpackage.xe7) r3
            r3.d = r1
            wf5 r1 = r4.h
            r1.K(r0)
        L_0x045b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju9.i(uf5, yl4):int");
    }

    public final void release() {
    }

    public ju9(long j2) {
        this.a = 0;
        this.b = j2;
        this.c = new g1g(10);
        this.d = new bv9(0);
        this.e = new lp6();
        this.m = -9223372036854775807L;
        this.f = new y35(23);
        xx4 xx4 = new xx4();
        this.g = xx4;
        this.j = xx4;
    }
}
