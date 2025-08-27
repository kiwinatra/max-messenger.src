package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: nu9  reason: default package */
public final class nu9 implements sf5, rnd {
    public final g1g a = new g1g(vzg.b);
    public final g1g b = new g1g(4);
    public final g1g c = new g1g(3, false);
    public final g1g d = new g1g(16);
    public final ArrayDeque e = new ArrayDeque();
    public final dod f = new dod();
    public final ArrayList g = new ArrayList();
    public int h = 0;
    public int i;
    public long j;
    public int k;
    public g1g l;
    public int m = -1;
    public int n;
    public int o;
    public int p;
    public wf5 q;
    public lu9[] r;
    public long[][] s;
    public int t;
    public long u;
    public int v;

    public final boolean c() {
        return true;
    }

    public final void d(long j2, long j3) {
        this.e.clear();
        this.k = 0;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        if (j2 != 0) {
            lu9[] lu9Arr = this.r;
            if (lu9Arr != null) {
                for (lu9 lu9 : lu9Arr) {
                    aqf aqf = lu9.b;
                    int f2 = t0g.f(aqf.f, j3, false);
                    while (true) {
                        if (f2 < 0) {
                            f2 = -1;
                            break;
                        } else if ((aqf.g[f2] & 1) != 0) {
                            break;
                        } else {
                            f2--;
                        }
                    }
                    if (f2 == -1) {
                        f2 = aqf.a(j3);
                    }
                    lu9.e = f2;
                    etf etf = lu9.d;
                    if (etf != null) {
                        etf.b = false;
                        etf.c = 0;
                    }
                }
            }
        } else if (this.h != 3) {
            this.h = 0;
            this.k = 0;
        } else {
            dod dod = this.f;
            dod.a.clear();
            dod.b = 0;
            this.g.clear();
        }
    }

    public final pnd e(long j2) {
        long j3;
        long j4;
        long j5;
        long j6;
        boolean z;
        int[] iArr;
        long j7;
        int a2;
        nu9 nu9 = this;
        long j8 = j2;
        lu9[] lu9Arr = nu9.r;
        lu9Arr.getClass();
        int length = lu9Arr.length;
        vnd vnd = vnd.c;
        if (length == 0) {
            return new pnd(vnd, vnd);
        }
        int i2 = nu9.t;
        boolean z2 = false;
        if (i2 != -1) {
            aqf aqf = nu9.r[i2].b;
            int f2 = t0g.f(aqf.f, j8, false);
            while (true) {
                if (f2 < 0) {
                    f2 = -1;
                    break;
                } else if ((aqf.g[f2] & 1) != 0) {
                    break;
                } else {
                    f2--;
                }
            }
            if (f2 == -1) {
                f2 = aqf.a(j8);
            }
            if (f2 == -1) {
                return new pnd(vnd, vnd);
            }
            long[] jArr = aqf.f;
            long j9 = jArr[f2];
            long[] jArr2 = aqf.c;
            j3 = jArr2[f2];
            if (j9 >= j8 || f2 >= aqf.b - 1 || (a2 = aqf.a(j8)) == -1 || a2 == f2) {
                j7 = -9223372036854775807L;
                j4 = -1;
            } else {
                j7 = jArr[a2];
                j4 = jArr2[a2];
            }
            j5 = j7;
            j8 = j9;
        } else {
            j3 = LongCompanionObject.MAX_VALUE;
            j5 = -9223372036854775807L;
            j4 = -1;
        }
        int i3 = 0;
        long j10 = j3;
        while (true) {
            lu9[] lu9Arr2 = nu9.r;
            if (i3 >= lu9Arr2.length) {
                break;
            }
            if (i3 != nu9.t) {
                aqf aqf2 = lu9Arr2[i3].b;
                int f3 = t0g.f(aqf2.f, j8, z2);
                while (true) {
                    iArr = aqf2.g;
                    if (f3 < 0) {
                        f3 = -1;
                        break;
                    } else if ((iArr[f3] & 1) != 0) {
                        break;
                    } else {
                        f3--;
                    }
                }
                if (f3 == -1) {
                    f3 = aqf2.a(j8);
                }
                long[] jArr3 = aqf2.c;
                if (f3 == -1) {
                    j6 = j8;
                } else {
                    j6 = j8;
                    j10 = Math.min(jArr3[f3], j10);
                }
                if (j5 != -9223372036854775807L) {
                    z = false;
                    int f4 = t0g.f(aqf2.f, j5, false);
                    while (true) {
                        if (f4 < 0) {
                            f4 = -1;
                            break;
                        } else if ((iArr[f4] & 1) != 0) {
                            break;
                        } else {
                            f4--;
                        }
                    }
                    if (f4 == -1) {
                        f4 = aqf2.a(j5);
                    }
                    if (f4 != -1) {
                        j4 = Math.min(jArr3[f4], j4);
                    }
                } else {
                    z = false;
                }
            } else {
                j6 = j8;
                z = z2;
            }
            i3++;
            nu9 = this;
            z2 = z;
            j8 = j6;
        }
        long j11 = j8;
        vnd vnd2 = new vnd(j8, j10);
        return j5 == -9223372036854775807L ? new pnd(vnd2, vnd2) : new pnd(vnd2, new vnd(j5, j4));
    }

    public final long f() {
        return this.u;
    }

    public final void g(wf5 wf5) {
        this.q = wf5;
    }

    public final boolean h(uf5 uf5) {
        return i8b.R(uf5, false, false);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0466, code lost:
        r3 = r10;
        r6 = r18;
        r9 = r0.k;
        r10 = r0.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x046e, code lost:
        if (r9 != 0) goto L_0x048e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0477, code lost:
        if (r1.j(r10.a, 0, 8, r3) != false) goto L_0x047b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0479, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x047b, code lost:
        r0.k = 8;
        r10.H(0);
        r0.j = r10.w();
        r0.i = r10.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x048f, code lost:
        r13 = r0.j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0495, code lost:
        if (r13 != 1) goto L_0x04a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0497, code lost:
        r1.readFully(r10.a, 8, 8);
        r0.k += 8;
        r0.j = r10.z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04ac, code lost:
        if (r13 != 0) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04ae, code lost:
        r13 = r37.w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04b4, code lost:
        if (r13 != -1) goto L_0x04c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04b6, code lost:
        r9 = (defpackage.py) r12.peek();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04bc, code lost:
        if (r9 == null) goto L_0x04c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04be, code lost:
        r13 = r9.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x04c2, code lost:
        if (r13 == -1) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x04c4, code lost:
        r0.j = (r13 - r37.h()) + ((long) r0.k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04cf, code lost:
        r3 = r0.j;
        r9 = r0.k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04d6, code lost:
        if (r3 < ((long) r9)) goto L_0x0614;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04d8, code lost:
        r3 = r0.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x04e3, code lost:
        if (r3 == 1836019574) goto L_0x0500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04e8, code lost:
        if (r3 == 1953653099) goto L_0x0500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04ed, code lost:
        if (r3 == 1835297121) goto L_0x0500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x04f2, code lost:
        if (r3 == 1835626086) goto L_0x0500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04f7, code lost:
        if (r3 == 1937007212) goto L_0x0500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04fc, code lost:
        if (r3 == 1701082227) goto L_0x0500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x04fe, code lost:
        if (r3 != 1835365473) goto L_0x0503;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0506, code lost:
        if (r3 == 1835296868) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x050b, code lost:
        if (r3 == 1836476516) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x050d, code lost:
        if (r3 == 1751411826) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0512, code lost:
        if (r3 == 1937011556) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0517, code lost:
        if (r3 == 1937011827) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x051c, code lost:
        if (r3 == 1937011571) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0521, code lost:
        if (r3 == 1668576371) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0526, code lost:
        if (r3 == 1701606260) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x052b, code lost:
        if (r3 == 1937011555) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0530, code lost:
        if (r3 == 1937011578) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0535, code lost:
        if (r3 == 1937013298) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x053a, code lost:
        if (r3 == 1937007471) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x053f, code lost:
        if (r3 == 1668232756) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0544, code lost:
        if (r3 == 1953196132) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0549, code lost:
        if (r3 == 1718909296) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x054e, code lost:
        if (r3 == 1969517665) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0553, code lost:
        if (r3 == 1801812339) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0558, code lost:
        if (r3 != 1768715124) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x055b, code lost:
        r3 = r37.h();
        r9 = (long) r0.k;
        r28 = r3 - r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0569, code lost:
        if (r0.i != 1836086884) goto L_0x057d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x056b, code lost:
        new defpackage.nt9(0, r28, -9223372036854775807L, r28 + r9, r0.j - r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x057d, code lost:
        r0.l = null;
        r0.h = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0583, code lost:
        r3 = 0;
        r4 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0587, code lost:
        if (r9 != 8) goto L_0x058b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0589, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x058b, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x058c, code lost:
        defpackage.y64.j(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0596, code lost:
        if (r0.j > 2147483647L) goto L_0x059a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0598, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x059a, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x059b, code lost:
        defpackage.y64.j(r3);
        r3 = new defpackage.g1g((int) r0.j);
        java.lang.System.arraycopy(r10.a, 0, r3.a, 0, 8);
        r0.l = r3;
        r0.h = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x05b4, code lost:
        r9 = r37.h();
        r15 = r12;
        r11 = r0.j;
        r4 = (long) r0.k;
        r9 = (r9 + r11) - r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x05c2, code lost:
        if (r11 == r4) goto L_0x05ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x05c6, code lost:
        if (r0.i != 1835365473) goto L_0x05ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x05c8, code lost:
        r6.E(8);
        r1.m(0, r6.a, 8);
        r3 = defpackage.az.a;
        r3 = r6.b;
        r4 = 4;
        r6.I(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x05e0, code lost:
        if (r6.h() == 1751411826) goto L_0x05e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x05e2, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x05e3, code lost:
        r6.H(r3);
        r1.z(r6.b);
        r37.y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x05ef, code lost:
        r4 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x05f0, code lost:
        r15.push(new defpackage.py(r0.i, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0602, code lost:
        if (r0.j != ((long) r0.k)) goto L_0x0609;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0604, code lost:
        j(r9);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0609, code lost:
        r3 = 0;
        r0.h = 0;
        r0.k = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x061a, code lost:
        throw com.google.android.exoplayer2.ParserException.c("Atom size less than header length (unsupported).");
     */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x045f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(defpackage.uf5 r37, defpackage.yl4 r38) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r2 = r38
            r4 = 3
            r5 = 2
            r7 = 0
            r8 = 8
            r9 = 4
        L_0x000c:
            r10 = 1
        L_0x000d:
            int r11 = r0.h
            java.util.ArrayDeque r12 = r0.e
            g1g r14 = r0.c
            r15 = -1
            r18 = r14
            if (r11 == 0) goto L_0x0466
            r19 = 262144(0x40000, double:1.295163E-318)
            if (r11 == r10) goto L_0x03d0
            r21 = 8
            if (r11 == r5) goto L_0x0239
            if (r11 != r4) goto L_0x0233
            java.util.ArrayList r3 = r0.g
            dod r11 = r0.f
            int r12 = r11.b
            if (r12 == 0) goto L_0x020e
            if (r12 == r10) goto L_0x01dc
            java.util.ArrayList r15 = r11.a
            r6 = 2817(0xb01, float:3.947E-42)
            r14 = 2816(0xb00, float:3.946E-42)
            r13 = 2192(0x890, float:3.072E-42)
            if (r12 == r5) goto L_0x016b
            if (r12 != r4) goto L_0x0165
            long r17 = r37.h()
            long r19 = r37.w()
            long r21 = r37.h()
            long r19 = r19 - r21
            int r11 = r11.c
            long r11 = (long) r11
            long r11 = r19 - r11
            int r11 = (int) r11
            g1g r12 = new g1g
            r12.<init>((int) r11)
            byte[] r5 = r12.a
            r1.readFully(r5, r7, r11)
            r1 = r7
        L_0x0059:
            int r5 = r15.size()
            if (r1 >= r5) goto L_0x015e
            java.lang.Object r5 = r15.get(r1)
            bod r5 = (defpackage.bod) r5
            long r10 = r5.a
            long r10 = r10 - r17
            int r10 = (int) r10
            r12.H(r10)
            r12.I(r9)
            int r10 = r12.j()
            java.nio.charset.Charset r11 = defpackage.x22.c
            java.lang.String r9 = r12.t(r10, r11)
            int r20 = r9.hashCode()
            switch(r20) {
                case -1711564334: goto L_0x00af;
                case -1332107749: goto L_0x00a4;
                case -1251387154: goto L_0x0099;
                case -830665521: goto L_0x008e;
                case 1760745220: goto L_0x0083;
                default: goto L_0x0081;
            }
        L_0x0081:
            r7 = -1
            goto L_0x00b9
        L_0x0083:
            java.lang.String r7 = "Super_SlowMotion_BGM"
            boolean r7 = r9.equals(r7)
            if (r7 != 0) goto L_0x008c
            goto L_0x0081
        L_0x008c:
            r7 = 4
            goto L_0x00b9
        L_0x008e:
            java.lang.String r7 = "Super_SlowMotion_Deflickering_On"
            boolean r7 = r9.equals(r7)
            if (r7 != 0) goto L_0x0097
            goto L_0x0081
        L_0x0097:
            r7 = r4
            goto L_0x00b9
        L_0x0099:
            java.lang.String r7 = "Super_SlowMotion_Data"
            boolean r7 = r9.equals(r7)
            if (r7 != 0) goto L_0x00a2
            goto L_0x0081
        L_0x00a2:
            r7 = 2
            goto L_0x00b9
        L_0x00a4:
            java.lang.String r7 = "Super_SlowMotion_Edit_Data"
            boolean r7 = r9.equals(r7)
            if (r7 != 0) goto L_0x00ad
            goto L_0x0081
        L_0x00ad:
            r7 = 1
            goto L_0x00b9
        L_0x00af:
            java.lang.String r7 = "SlowMotion_Data"
            boolean r7 = r9.equals(r7)
            if (r7 != 0) goto L_0x00b8
            goto L_0x0081
        L_0x00b8:
            r7 = 0
        L_0x00b9:
            switch(r7) {
                case 0: goto L_0x00ce;
                case 1: goto L_0x00cb;
                case 2: goto L_0x00c9;
                case 3: goto L_0x00c6;
                case 4: goto L_0x00c4;
                default: goto L_0x00bc;
            }
        L_0x00bc:
            java.lang.String r0 = "Invalid SEF name"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x00c4:
            r7 = r6
            goto L_0x00cf
        L_0x00c6:
            r7 = 2820(0xb04, float:3.952E-42)
            goto L_0x00cf
        L_0x00c9:
            r7 = r14
            goto L_0x00cf
        L_0x00cb:
            r7 = 2819(0xb03, float:3.95E-42)
            goto L_0x00cf
        L_0x00ce:
            r7 = r13
        L_0x00cf:
            int r10 = r10 + r8
            int r5 = r5.b
            int r5 = r5 - r10
            if (r7 == r13) goto L_0x00ea
            if (r7 == r14) goto L_0x00e8
            if (r7 == r6) goto L_0x00e8
            r5 = 2819(0xb03, float:3.95E-42)
            if (r7 == r5) goto L_0x00e8
            r5 = 2820(0xb04, float:3.952E-42)
            if (r7 != r5) goto L_0x00e2
            goto L_0x00e8
        L_0x00e2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00e8:
            r5 = 1
            goto L_0x0159
        L_0x00ea:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r5 = r12.t(r5, r11)
            cs r9 = defpackage.dod.e
            java.util.List r5 = r9.L(r5)
            r9 = 0
        L_0x00fa:
            int r10 = r5.size()
            if (r9 >= r10) goto L_0x0150
            java.lang.Object r10 = r5.get(r9)
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            cs r11 = defpackage.dod.d
            java.util.List r10 = r11.L(r10)
            int r11 = r10.size()
            if (r11 != r4) goto L_0x014a
            r11 = 0
            java.lang.Object r20 = r10.get(r11)     // Catch:{ NumberFormatException -> 0x0143 }
            java.lang.String r20 = (java.lang.String) r20     // Catch:{ NumberFormatException -> 0x0143 }
            long r27 = java.lang.Long.parseLong(r20)     // Catch:{ NumberFormatException -> 0x0143 }
            r11 = 1
            java.lang.Object r20 = r10.get(r11)     // Catch:{ NumberFormatException -> 0x0143 }
            java.lang.String r20 = (java.lang.String) r20     // Catch:{ NumberFormatException -> 0x0143 }
            long r29 = java.lang.Long.parseLong(r20)     // Catch:{ NumberFormatException -> 0x0143 }
            r11 = 2
            java.lang.Object r10 = r10.get(r11)     // Catch:{ NumberFormatException -> 0x0143 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x0143 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x0143 }
            r11 = 1
            int r10 = r10 - r11
            int r26 = r11 << r10
            eee r10 = new eee     // Catch:{ NumberFormatException -> 0x0143 }
            r25 = r10
            r25.<init>(r26, r27, r29)     // Catch:{ NumberFormatException -> 0x0143 }
            r7.add(r10)     // Catch:{ NumberFormatException -> 0x0143 }
            int r9 = r9 + r11
            goto L_0x00fa
        L_0x0143:
            r0 = move-exception
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r1, r0)
            throw r0
        L_0x014a:
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r1, r1)
            throw r0
        L_0x0150:
            gee r5 = new gee
            r5.<init>(r7)
            r3.add(r5)
            goto L_0x00e8
        L_0x0159:
            int r1 = r1 + r5
            r7 = 0
            r9 = 4
            goto L_0x0059
        L_0x015e:
            r9 = 0
            r2.b = r9
        L_0x0162:
            r1 = 1
            goto L_0x0225
        L_0x0165:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x016b:
            long r9 = r37.w()
            int r3 = r11.c
            int r3 = r3 + -20
            g1g r5 = new g1g
            r5.<init>((int) r3)
            byte[] r7 = r5.a
            r12 = 0
            r1.readFully(r7, r12, r3)
            r1 = 0
        L_0x017f:
            int r7 = r3 / 12
            if (r1 >= r7) goto L_0x01c2
            r7 = 2
            r5.I(r7)
            short r7 = r5.l()
            if (r7 == r13) goto L_0x019e
            if (r7 == r14) goto L_0x019e
            if (r7 == r6) goto L_0x019e
            r12 = 2819(0xb03, float:3.95E-42)
            r6 = 2820(0xb04, float:3.952E-42)
            if (r7 == r12) goto L_0x01a2
            if (r7 == r6) goto L_0x01a2
            r5.I(r8)
        L_0x019c:
            r6 = 1
            goto L_0x01ba
        L_0x019e:
            r6 = 2820(0xb04, float:3.952E-42)
            r12 = 2819(0xb03, float:3.95E-42)
        L_0x01a2:
            int r7 = r11.c
            long r6 = (long) r7
            long r6 = r9 - r6
            int r12 = r5.j()
            long r13 = (long) r12
            long r6 = r6 - r13
            int r12 = r5.j()
            bod r13 = new bod
            r13.<init>(r6, r12)
            r15.add(r13)
            goto L_0x019c
        L_0x01ba:
            int r1 = r1 + r6
            r6 = 2817(0xb01, float:3.947E-42)
            r13 = 2192(0x890, float:3.072E-42)
            r14 = 2816(0xb00, float:3.946E-42)
            goto L_0x017f
        L_0x01c2:
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L_0x01ce
            r5 = 0
            r2.b = r5
            r3 = 0
            goto L_0x0162
        L_0x01ce:
            r11.b = r4
            r3 = 0
            java.lang.Object r1 = r15.get(r3)
            bod r1 = (defpackage.bod) r1
            long r4 = r1.a
            r2.b = r4
            goto L_0x0162
        L_0x01dc:
            r3 = r7
            g1g r4 = new g1g
            r4.<init>((int) r8)
            byte[] r5 = r4.a
            r1.readFully(r5, r3, r8)
            int r3 = r4.j()
            int r3 = r3 + r8
            r11.c = r3
            int r3 = r4.h()
            r4 = 1397048916(0x53454654, float:8.4728847E11)
            if (r3 == r4) goto L_0x01fd
            r3 = 0
            r2.b = r3
            goto L_0x0162
        L_0x01fd:
            long r3 = r37.h()
            int r1 = r11.c
            int r1 = r1 + -12
            long r5 = (long) r1
            long r3 = r3 - r5
            r2.b = r3
            r1 = 2
            r11.b = r1
            goto L_0x0162
        L_0x020e:
            long r3 = r37.w()
            int r1 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r1 == 0) goto L_0x021e
            int r1 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r1 >= 0) goto L_0x021b
            goto L_0x021e
        L_0x021b:
            long r3 = r3 - r21
            goto L_0x0220
        L_0x021e:
            r3 = 0
        L_0x0220:
            r2.b = r3
            r1 = 1
            r11.b = r1
        L_0x0225:
            long r2 = r2.b
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0232
            r2 = 0
            r0.h = r2
            r0.k = r2
        L_0x0232:
            return r1
        L_0x0233:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0239:
            long r4 = r37.h()
            int r6 = r0.m
            r7 = -1
            if (r6 != r7) goto L_0x02b8
            r8 = -1
            r9 = -1
            r10 = 1
            r11 = 1
            r12 = 0
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r25 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0256:
            lu9[] r3 = r0.r
            int r17 = defpackage.t0g.a
            int r6 = r3.length
            if (r12 >= r6) goto L_0x029c
            r3 = r3[r12]
            int r6 = r3.e
            aqf r3 = r3.b
            int r7 = r3.b
            if (r6 != r7) goto L_0x0269
        L_0x0267:
            r3 = 1
            goto L_0x029a
        L_0x0269:
            long[] r3 = r3.c
            r30 = r3[r6]
            long[][] r3 = r0.s
            r3 = r3[r12]
            r6 = r3[r6]
            long r30 = r30 - r4
            r23 = 0
            int r3 = (r30 > r23 ? 1 : (r30 == r23 ? 0 : -1))
            if (r3 < 0) goto L_0x0282
            int r3 = (r30 > r19 ? 1 : (r30 == r19 ? 0 : -1))
            if (r3 < 0) goto L_0x0280
            goto L_0x0282
        L_0x0280:
            r3 = 0
            goto L_0x0283
        L_0x0282:
            r3 = 1
        L_0x0283:
            if (r3 != 0) goto L_0x0287
            if (r11 != 0) goto L_0x028d
        L_0x0287:
            if (r3 != r11) goto L_0x0292
            int r17 = (r30 > r25 ? 1 : (r30 == r25 ? 0 : -1))
            if (r17 >= 0) goto L_0x0292
        L_0x028d:
            r11 = r3
            r15 = r6
            r9 = r12
            r25 = r30
        L_0x0292:
            int r17 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r17 >= 0) goto L_0x0267
            r10 = r3
            r13 = r6
            r8 = r12
            goto L_0x0267
        L_0x029a:
            int r12 = r12 + r3
            goto L_0x0256
        L_0x029c:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x02af
            if (r10 == 0) goto L_0x02af
            r6 = 10485760(0xa00000, double:5.180654E-317)
            long r13 = r13 + r6
            int r3 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x02b0
        L_0x02af:
            r8 = r9
        L_0x02b0:
            r0.m = r8
            r3 = -1
            if (r8 != r3) goto L_0x02b8
            r6 = -1
            goto L_0x03cf
        L_0x02b8:
            lu9[] r3 = r0.r
            int r6 = defpackage.t0g.a
            int r6 = r0.m
            r3 = r3[r6]
            ypf r14 = r3.c
            int r15 = r3.e
            aqf r13 = r3.b
            long[] r6 = r13.c
            r6 = r6[r15]
            int[] r8 = r13.d
            r8 = r8[r15]
            long r4 = r6 - r4
            int r9 = r0.n
            long r9 = (long) r9
            long r4 = r4 + r9
            r9 = 0
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x03cc
            int r9 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r9 < 0) goto L_0x02e0
            goto L_0x03cc
        L_0x02e0:
            kpf r2 = r3.a
            int r6 = r2.g
            r7 = 1
            if (r6 != r7) goto L_0x02eb
            long r4 = r4 + r21
            int r8 = r8 + -8
        L_0x02eb:
            int r4 = (int) r4
            r1.z(r4)
            int r4 = r2.j
            etf r5 = r3.d
            if (r4 == 0) goto L_0x034f
            g1g r2 = r0.b
            byte[] r6 = r2.a
            r7 = 0
            r6[r7] = r7
            r9 = 1
            r6[r9] = r7
            r9 = 2
            r6[r9] = r7
            r9 = 4
            int r10 = 4 - r4
        L_0x0305:
            int r9 = r0.o
            if (r9 >= r8) goto L_0x034d
            int r9 = r0.p
            if (r9 != 0) goto L_0x0339
            r1.readFully(r6, r10, r4)
            int r9 = r0.n
            int r9 = r9 + r4
            r0.n = r9
            r2.H(r7)
            int r9 = r2.h()
            if (r9 < 0) goto L_0x0331
            r0.p = r9
            g1g r9 = r0.a
            r9.H(r7)
            r7 = 4
            r14.c(r7, r9)
            int r9 = r0.o
            int r9 = r9 + r7
            r0.o = r9
            int r8 = r8 + r10
        L_0x032f:
            r7 = 0
            goto L_0x0305
        L_0x0331:
            java.lang.String r0 = "Invalid NAL length"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x0339:
            int r9 = r14.a(r1, r9, r7)
            int r7 = r0.n
            int r7 = r7 + r9
            r0.n = r7
            int r7 = r0.o
            int r7 = r7 + r9
            r0.o = r7
            int r7 = r0.p
            int r7 = r7 - r9
            r0.p = r7
            goto L_0x032f
        L_0x034d:
            r1 = r8
            goto L_0x0391
        L_0x034f:
            ca6 r2 = r2.f
            java.lang.String r2 = r2.Z
            java.lang.String r4 = "audio/ac4"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0371
            int r2 = r0.o
            if (r2 != 0) goto L_0x036e
            r6 = r18
            defpackage.kv0.v(r8, r6)
            r7 = 7
            r14.c(r7, r6)
            int r2 = r0.o
            int r2 = r2 + r7
            r0.o = r2
            goto L_0x036f
        L_0x036e:
            r7 = 7
        L_0x036f:
            int r8 = r8 + r7
            goto L_0x0376
        L_0x0371:
            if (r5 == 0) goto L_0x0376
            r5.e(r1)
        L_0x0376:
            int r2 = r0.o
            if (r2 >= r8) goto L_0x034d
            int r2 = r8 - r2
            r4 = 0
            int r2 = r14.a(r1, r2, r4)
            int r4 = r0.n
            int r4 = r4 + r2
            r0.n = r4
            int r4 = r0.o
            int r4 = r4 + r2
            r0.o = r4
            int r4 = r0.p
            int r4 = r4 - r2
            r0.p = r4
            goto L_0x0376
        L_0x0391:
            long[] r2 = r13.f
            r8 = r2[r15]
            int[] r2 = r13.g
            r2 = r2[r15]
            if (r5 == 0) goto L_0x03b1
            r12 = 0
            r4 = 0
            r6 = r5
            r7 = r14
            r10 = r2
            r11 = r1
            r1 = r13
            r13 = r4
            r6.c(r7, r8, r10, r11, r12, r13)
            r2 = 1
            int r15 = r15 + r2
            int r1 = r1.b
            if (r15 != r1) goto L_0x03ba
            r1 = 0
            r5.a(r14, r1)
            goto L_0x03ba
        L_0x03b1:
            r11 = 0
            r12 = 0
            r6 = r14
            r7 = r8
            r9 = r2
            r10 = r1
            r6.b(r7, r9, r10, r11, r12)
        L_0x03ba:
            int r1 = r3.e
            r2 = 1
            int r1 = r1 + r2
            r3.e = r1
            r1 = -1
            r0.m = r1
            r1 = 0
            r0.n = r1
            r0.o = r1
            r0.p = r1
            r6 = 0
            goto L_0x03cf
        L_0x03cc:
            r2.b = r6
            r6 = 1
        L_0x03cf:
            return r6
        L_0x03d0:
            r7 = 7
            long r5 = r0.j
            int r3 = r0.k
            long r9 = (long) r3
            long r5 = r5 - r9
            long r9 = r37.h()
            long r9 = r9 + r5
            g1g r3 = r0.l
            if (r3 == 0) goto L_0x043f
            byte[] r11 = r3.a
            int r13 = r0.k
            int r5 = (int) r5
            r1.readFully(r11, r13, r5)
            int r5 = r0.i
            r6 = 1718909296(0x66747970, float:2.8862439E23)
            if (r5 != r6) goto L_0x0426
            r3.H(r8)
            int r5 = r3.h()
            r6 = 1903435808(0x71742020, float:1.2088509E30)
            r11 = 1751476579(0x68656963, float:4.333464E24)
            if (r5 == r11) goto L_0x0404
            if (r5 == r6) goto L_0x0402
            r5 = 0
            goto L_0x0405
        L_0x0402:
            r5 = 1
            goto L_0x0405
        L_0x0404:
            r5 = 2
        L_0x0405:
            if (r5 == 0) goto L_0x0408
            goto L_0x0423
        L_0x0408:
            r5 = 4
            r3.I(r5)
        L_0x040c:
            int r5 = r3.c()
            if (r5 <= 0) goto L_0x0422
            int r5 = r3.h()
            if (r5 == r11) goto L_0x041e
            if (r5 == r6) goto L_0x041c
            r5 = 0
            goto L_0x041f
        L_0x041c:
            r5 = 1
            goto L_0x041f
        L_0x041e:
            r5 = 2
        L_0x041f:
            if (r5 == 0) goto L_0x040c
            goto L_0x0423
        L_0x0422:
            r5 = 0
        L_0x0423:
            r0.v = r5
            goto L_0x0447
        L_0x0426:
            boolean r5 = r12.isEmpty()
            if (r5 != 0) goto L_0x0447
            java.lang.Object r5 = r12.peek()
            py r5 = (defpackage.py) r5
            ry r6 = new ry
            int r11 = r0.i
            r6.<init>(r11, r3)
            java.util.ArrayList r3 = r5.o
            r3.add(r6)
            goto L_0x0447
        L_0x043f:
            int r3 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r3 >= 0) goto L_0x0449
            int r3 = (int) r5
            r1.z(r3)
        L_0x0447:
            r3 = 0
            goto L_0x0451
        L_0x0449:
            long r11 = r37.h()
            long r11 = r11 + r5
            r2.b = r11
            r3 = 1
        L_0x0451:
            r0.j(r9)
            if (r3 == 0) goto L_0x045f
            int r3 = r0.h
            r5 = 2
            if (r3 == r5) goto L_0x045d
            r3 = 1
            return r3
        L_0x045d:
            r3 = 1
            goto L_0x0461
        L_0x045f:
            r3 = 1
            r5 = 2
        L_0x0461:
            r10 = r3
            r7 = 0
            r9 = 4
            goto L_0x000d
        L_0x0466:
            r3 = r10
            r6 = r18
            r7 = 7
            int r9 = r0.k
            g1g r10 = r0.d
            if (r9 != 0) goto L_0x048e
            byte[] r9 = r10.a
            r11 = 0
            boolean r9 = r1.j(r9, r11, r8, r3)
            if (r9 != 0) goto L_0x047b
            r3 = -1
            return r3
        L_0x047b:
            r3 = -1
            r0.k = r8
            r10.H(r11)
            long r13 = r10.w()
            r0.j = r13
            int r9 = r10.h()
            r0.i = r9
            goto L_0x048f
        L_0x048e:
            r3 = -1
        L_0x048f:
            long r13 = r0.j
            r19 = 1
            int r9 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r9 != 0) goto L_0x04a8
            byte[] r9 = r10.a
            r1.readFully(r9, r8, r8)
            int r9 = r0.k
            int r9 = r9 + r8
            r0.k = r9
            long r13 = r10.z()
            r0.j = r13
            goto L_0x04cf
        L_0x04a8:
            r19 = 0
            int r9 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r9 != 0) goto L_0x04cf
            long r13 = r37.w()
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 != 0) goto L_0x04c0
            java.lang.Object r9 = r12.peek()
            py r9 = (defpackage.py) r9
            if (r9 == 0) goto L_0x04c0
            long r13 = r9.c
        L_0x04c0:
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 == 0) goto L_0x04cf
            long r15 = r37.h()
            long r13 = r13 - r15
            int r9 = r0.k
            long r3 = (long) r9
            long r13 = r13 + r3
            r0.j = r13
        L_0x04cf:
            long r3 = r0.j
            int r9 = r0.k
            long r13 = (long) r9
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 < 0) goto L_0x0614
            int r3 = r0.i
            r4 = 1751411826(0x68646c72, float:4.3148E24)
            r13 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r14 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r3 == r13) goto L_0x0500
            r13 = 1953653099(0x7472616b, float:7.681346E31)
            if (r3 == r13) goto L_0x0500
            r13 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r3 == r13) goto L_0x0500
            r13 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r3 == r13) goto L_0x0500
            r13 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r3 == r13) goto L_0x0500
            r13 = 1701082227(0x65647473, float:6.742798E22)
            if (r3 == r13) goto L_0x0500
            if (r3 != r14) goto L_0x0503
        L_0x0500:
            r3 = 1
            goto L_0x05b4
        L_0x0503:
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            if (r3 == r6) goto L_0x0587
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r3 == r6) goto L_0x0587
            if (r3 == r4) goto L_0x0587
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            if (r3 == r4) goto L_0x0587
            r4 = 1937011827(0x73747473, float:1.9367711E31)
            if (r3 == r4) goto L_0x0587
            r4 = 1937011571(0x73747373, float:1.9367401E31)
            if (r3 == r4) goto L_0x0587
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            if (r3 == r4) goto L_0x0587
            r4 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r3 == r4) goto L_0x0587
            r4 = 1937011555(0x73747363, float:1.9367382E31)
            if (r3 == r4) goto L_0x0587
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            if (r3 == r4) goto L_0x0587
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r3 == r4) goto L_0x0587
            r4 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r3 == r4) goto L_0x0587
            r4 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r3 == r4) goto L_0x0587
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            if (r3 == r4) goto L_0x0587
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            if (r3 == r4) goto L_0x0587
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            if (r3 == r4) goto L_0x0587
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r3 == r4) goto L_0x0587
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r3 != r4) goto L_0x055b
            goto L_0x0587
        L_0x055b:
            long r3 = r37.h()
            int r6 = r0.k
            long r9 = (long) r6
            long r28 = r3 - r9
            int r3 = r0.i
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r3 != r4) goto L_0x057d
            nt9 r25 = new nt9
            long r32 = r28 + r9
            long r3 = r0.j
            long r34 = r3 - r9
            r26 = 0
            r30 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r25.<init>(r26, r28, r30, r32, r34)
        L_0x057d:
            r3 = 0
            r0.l = r3
            r3 = 1
            r0.h = r3
        L_0x0583:
            r3 = 0
            r4 = 4
            goto L_0x060e
        L_0x0587:
            if (r9 != r8) goto L_0x058b
            r3 = 1
            goto L_0x058c
        L_0x058b:
            r3 = 0
        L_0x058c:
            defpackage.y64.j(r3)
            long r3 = r0.j
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 > 0) goto L_0x059a
            r3 = 1
            goto L_0x059b
        L_0x059a:
            r3 = 0
        L_0x059b:
            defpackage.y64.j(r3)
            g1g r3 = new g1g
            long r12 = r0.j
            int r4 = (int) r12
            r3.<init>((int) r4)
            byte[] r4 = r10.a
            byte[] r6 = r3.a
            r9 = 0
            java.lang.System.arraycopy(r4, r9, r6, r9, r8)
            r0.l = r3
            r3 = 1
            r0.h = r3
            goto L_0x0583
        L_0x05b4:
            long r9 = r37.h()
            r15 = r12
            long r11 = r0.j
            long r9 = r9 + r11
            int r3 = r0.k
            long r4 = (long) r3
            long r9 = r9 - r4
            int r3 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x05ef
            int r3 = r0.i
            if (r3 != r14) goto L_0x05ef
            r6.E(r8)
            byte[] r3 = r6.a
            r4 = 0
            r1.m(r4, r3, r8)
            byte[] r3 = defpackage.az.a
            int r3 = r6.b
            r4 = 4
            r6.I(r4)
            int r5 = r6.h()
            r11 = 1751411826(0x68646c72, float:4.3148E24)
            if (r5 == r11) goto L_0x05e3
            int r3 = r3 + r4
        L_0x05e3:
            r6.H(r3)
            int r3 = r6.b
            r1.z(r3)
            r37.y()
            goto L_0x05f0
        L_0x05ef:
            r4 = 4
        L_0x05f0:
            py r3 = new py
            int r5 = r0.i
            r3.<init>(r5, r9)
            r5 = r15
            r5.push(r3)
            long r5 = r0.j
            int r3 = r0.k
            long r11 = (long) r3
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0609
            r0.j(r9)
            r3 = 0
            goto L_0x060e
        L_0x0609:
            r3 = 0
            r0.h = r3
            r0.k = r3
        L_0x060e:
            r7 = r3
            r9 = r4
            r4 = 3
            r5 = 2
            goto L_0x000c
        L_0x0614:
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu9.i(uf5, yl4):int");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v25, resolved type: rp9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v33, resolved type: mff} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v35, resolved type: mff} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v81, resolved type: mff} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0342 A[Catch:{ all -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x05e7  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x05e9  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x05fd  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0608  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0648  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x067e  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x068d  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0697  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x035f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x0679 A[EDGE_INSN: B:402:0x0679->B:330:0x0679 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(long r30) {
        /*
            r29 = this;
            r0 = r29
            r1 = 4
            r5 = 1
        L_0x0004:
            java.util.ArrayDeque r6 = r0.e
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x0759
            java.lang.Object r7 = r6.peek()
            py r7 = (defpackage.py) r7
            long r9 = r7.c
            int r7 = (r9 > r30 ? 1 : (r9 == r30 ? 0 : -1))
            if (r7 != 0) goto L_0x0759
            java.lang.Object r7 = r6.pop()
            r9 = r7
            py r9 = (defpackage.py) r9
            int r7 = r9.b
            r10 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r7 != r10) goto L_0x0741
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r10 = r0.v
            if (r10 != r5) goto L_0x0031
            r15 = r5
            goto L_0x0032
        L_0x0031:
            r15 = 0
        L_0x0032:
            lp6 r14 = new lp6
            r14.<init>()
            r10 = 1969517665(0x75647461, float:2.8960062E32)
            ry r10 = r9.A(r10)
            r11 = 1751411826(0x68646c72, float:4.3148E24)
            r12 = 8
            r8 = 1768715124(0x696c7374, float:1.7865732E25)
            r4 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r10 == 0) goto L_0x0431
            byte[] r16 = defpackage.az.a
            g1g r10 = r10.c
            r10.H(r12)
            r18 = 0
            r19 = 0
        L_0x0056:
            int r2 = r10.c()
            if (r2 < r12) goto L_0x0413
            int r2 = r10.b
            int r16 = r10.h()
            int r3 = r10.h()
            if (r3 != r4) goto L_0x0398
            r10.H(r2)
            int r3 = r2 + r16
            r10.I(r12)
            int r4 = r10.b
            r10.I(r1)
            int r5 = r10.h()
            if (r5 == r11) goto L_0x007c
            int r4 = r4 + r1
        L_0x007c:
            r10.H(r4)
        L_0x007f:
            int r4 = r10.b
            if (r4 >= r3) goto L_0x0393
            int r5 = r10.h()
            int r11 = r10.h()
            if (r11 != r8) goto L_0x0382
            r10.H(r4)
            int r4 = r4 + r5
            r10.I(r12)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0099:
            int r5 = r10.b
            if (r5 >= r4) goto L_0x036f
            int r11 = r10.h()
            int r11 = r11 + r5
            int r5 = r10.h()
            int r8 = r5 >> 24
            r8 = r8 & 255(0xff, float:3.57E-43)
            r12 = 169(0xa9, float:2.37E-43)
            r18 = 16777215(0xffffff, float:2.3509886E-38)
            java.lang.String r13 = "TCON"
            if (r8 == r12) goto L_0x00b7
            r12 = 253(0xfd, float:3.55E-43)
            if (r8 != r12) goto L_0x00bd
        L_0x00b7:
            r27 = r4
            r28 = r6
            goto L_0x0287
        L_0x00bd:
            r8 = 1735291493(0x676e7265, float:1.1260334E24)
            if (r5 != r8) goto L_0x00fb
            r10.I(r1)     // Catch:{ all -> 0x010f }
            int r5 = r10.h()     // Catch:{ all -> 0x010f }
            r8 = 1684108385(0x64617461, float:1.6635614E22)
            if (r5 != r8) goto L_0x00d8
            r5 = 8
            r10.I(r5)     // Catch:{ all -> 0x010f }
            int r5 = r10.v()     // Catch:{ all -> 0x010f }
            goto L_0x00d9
        L_0x00d8:
            r5 = -1
        L_0x00d9:
            if (r5 <= 0) goto L_0x00e6
            r8 = 192(0xc0, float:2.69E-43)
            if (r5 > r8) goto L_0x00e6
            java.lang.String[] r8 = defpackage.cjf.b     // Catch:{ all -> 0x010f }
            r12 = 1
            int r5 = r5 - r12
            r5 = r8[r5]     // Catch:{ all -> 0x010f }
            goto L_0x00e7
        L_0x00e6:
            r5 = 0
        L_0x00e7:
            if (r5 == 0) goto L_0x00f0
            mff r8 = new mff     // Catch:{ all -> 0x010f }
            r12 = 0
            r8.<init>(r13, r12, r5)     // Catch:{ all -> 0x010f }
            goto L_0x00f1
        L_0x00f0:
            r8 = 0
        L_0x00f1:
            r10.H(r11)
            r27 = r4
            r28 = r6
            r12 = r8
            goto L_0x035a
        L_0x00fb:
            r8 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r5 != r8) goto L_0x0112
            java.lang.String r8 = "TPOS"
            mff r12 = defpackage.cjf.J(r5, r10, r8)     // Catch:{ all -> 0x010f }
        L_0x0106:
            r10.H(r11)
            r27 = r4
        L_0x010b:
            r28 = r6
            goto L_0x035a
        L_0x010f:
            r0 = move-exception
            goto L_0x036b
        L_0x0112:
            r8 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r5 != r8) goto L_0x011e
            java.lang.String r8 = "TRCK"
            mff r12 = defpackage.cjf.J(r5, r10, r8)     // Catch:{ all -> 0x010f }
            goto L_0x0106
        L_0x011e:
            r8 = 1953329263(0x746d706f, float:7.5247484E31)
            if (r5 != r8) goto L_0x0132
            java.lang.String r8 = "TBPM"
            r12 = 1
            r13 = 0
            t77 r5 = defpackage.cjf.L(r5, r8, r10, r12, r13)     // Catch:{ all -> 0x010f }
        L_0x012b:
            r10.H(r11)
            r27 = r4
            r12 = r5
            goto L_0x010b
        L_0x0132:
            r8 = 1668311404(0x6370696c, float:4.434815E21)
            if (r5 != r8) goto L_0x013f
            java.lang.String r8 = "TCMP"
            r12 = 1
            t77 r5 = defpackage.cjf.L(r5, r8, r10, r12, r12)     // Catch:{ all -> 0x010f }
            goto L_0x012b
        L_0x013f:
            r8 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r5 != r8) goto L_0x0183
            int r5 = r10.h()     // Catch:{ all -> 0x010f }
            int r8 = r10.h()     // Catch:{ all -> 0x010f }
            r12 = 1684108385(0x64617461, float:1.6635614E22)
            if (r8 != r12) goto L_0x0180
            int r8 = r10.h()     // Catch:{ all -> 0x010f }
            r8 = r8 & r18
            r12 = 13
            if (r8 != r12) goto L_0x015e
            java.lang.String r12 = "image/jpeg"
            goto L_0x0166
        L_0x015e:
            r12 = 14
            if (r8 != r12) goto L_0x0165
            java.lang.String r12 = "image/png"
            goto L_0x0166
        L_0x0165:
            r12 = 0
        L_0x0166:
            if (r12 != 0) goto L_0x016b
            r1 = 0
            r12 = 0
            goto L_0x0106
        L_0x016b:
            r10.I(r1)     // Catch:{ all -> 0x010f }
            r8 = 16
            int r5 = r5 - r8
            byte[] r8 = new byte[r5]     // Catch:{ all -> 0x010f }
            r13 = 0
            r10.g(r13, r8, r5)     // Catch:{ all -> 0x010f }
            vm r5 = new vm     // Catch:{ all -> 0x010f }
            r13 = 3
            r1 = 0
            r5.<init>(r12, r1, r13, r8)     // Catch:{ all -> 0x010f }
            r12 = r5
            goto L_0x0106
        L_0x0180:
            r1 = 0
            r12 = r1
            goto L_0x0106
        L_0x0183:
            r1 = 0
            r8 = 1631670868(0x61415254, float:2.2288462E20)
            if (r5 != r8) goto L_0x0191
            java.lang.String r8 = "TPE2"
            mff r12 = defpackage.cjf.K(r5, r10, r8)     // Catch:{ all -> 0x010f }
            goto L_0x0106
        L_0x0191:
            r8 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r5 != r8) goto L_0x019e
            java.lang.String r8 = "TSOT"
            mff r12 = defpackage.cjf.K(r5, r10, r8)     // Catch:{ all -> 0x010f }
            goto L_0x0106
        L_0x019e:
            r8 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r5 != r8) goto L_0x01ab
            java.lang.String r8 = "TSO2"
            mff r12 = defpackage.cjf.K(r5, r10, r8)     // Catch:{ all -> 0x010f }
            goto L_0x0106
        L_0x01ab:
            r8 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r5 != r8) goto L_0x01b8
            java.lang.String r8 = "TSOA"
            mff r12 = defpackage.cjf.K(r5, r10, r8)     // Catch:{ all -> 0x010f }
            goto L_0x0106
        L_0x01b8:
            r8 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r5 != r8) goto L_0x01c5
            java.lang.String r8 = "TSOP"
            mff r12 = defpackage.cjf.K(r5, r10, r8)     // Catch:{ all -> 0x010f }
            goto L_0x0106
        L_0x01c5:
            r8 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r5 != r8) goto L_0x01d2
            java.lang.String r8 = "TSOC"
            mff r12 = defpackage.cjf.K(r5, r10, r8)     // Catch:{ all -> 0x010f }
            goto L_0x0106
        L_0x01d2:
            r8 = 1920233063(0x72746e67, float:4.84146E30)
            if (r5 != r8) goto L_0x01e0
            java.lang.String r8 = "ITUNESADVISORY"
            r12 = 0
            t77 r5 = defpackage.cjf.L(r5, r8, r10, r12, r12)     // Catch:{ all -> 0x010f }
            goto L_0x012b
        L_0x01e0:
            r8 = 1885823344(0x70676170, float:2.8643533E29)
            if (r5 != r8) goto L_0x01ef
            java.lang.String r8 = "ITUNESGAPLESS"
            r12 = 1
            r13 = 0
            t77 r5 = defpackage.cjf.L(r5, r8, r10, r13, r12)     // Catch:{ all -> 0x010f }
            goto L_0x012b
        L_0x01ef:
            r8 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r5 != r8) goto L_0x01fc
            java.lang.String r8 = "TVSHOWSORT"
            mff r12 = defpackage.cjf.K(r5, r10, r8)     // Catch:{ all -> 0x010f }
            goto L_0x0106
        L_0x01fc:
            r8 = 1953919848(0x74767368, float:7.810338E31)
            if (r5 != r8) goto L_0x0209
            java.lang.String r8 = "TVSHOW"
            mff r12 = defpackage.cjf.K(r5, r10, r8)     // Catch:{ all -> 0x010f }
            goto L_0x0106
        L_0x0209:
            r8 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r5 != r8) goto L_0x0281
            r5 = r1
            r12 = r5
            r8 = -1
            r13 = -1
        L_0x0212:
            int r1 = r10.b     // Catch:{ all -> 0x010f }
            if (r1 >= r11) goto L_0x025b
            int r18 = r10.h()     // Catch:{ all -> 0x010f }
            r26 = r1
            int r1 = r10.h()     // Catch:{ all -> 0x010f }
            r27 = r4
            r4 = 4
            r10.I(r4)     // Catch:{ all -> 0x010f }
            r4 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r1 != r4) goto L_0x0237
            r4 = 12
            int r1 = r18 + -12
            java.lang.String r1 = r10.r(r1)     // Catch:{ all -> 0x010f }
            r12 = r1
            r28 = r6
            goto L_0x0256
        L_0x0237:
            r28 = r6
            r4 = 12
            r6 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r1 != r6) goto L_0x0248
            int r1 = r18 + -12
            java.lang.String r1 = r10.r(r1)     // Catch:{ all -> 0x010f }
            r5 = r1
            goto L_0x0256
        L_0x0248:
            r6 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r6) goto L_0x0251
            r13 = r18
            r8 = r26
        L_0x0251:
            int r1 = r18 + -12
            r10.I(r1)     // Catch:{ all -> 0x010f }
        L_0x0256:
            r4 = r27
            r6 = r28
            goto L_0x0212
        L_0x025b:
            r27 = r4
            r28 = r6
            if (r12 == 0) goto L_0x027b
            if (r5 == 0) goto L_0x027b
            r1 = -1
            if (r8 != r1) goto L_0x0267
            goto L_0x027b
        L_0x0267:
            r10.H(r8)     // Catch:{ all -> 0x010f }
            r1 = 16
            r10.I(r1)     // Catch:{ all -> 0x010f }
            int r13 = r13 - r1
            java.lang.String r1 = r10.r(r13)     // Catch:{ all -> 0x010f }
            xi7 r4 = new xi7     // Catch:{ all -> 0x010f }
            r4.<init>(r12, r5, r1)     // Catch:{ all -> 0x010f }
            r12 = r4
            goto L_0x027c
        L_0x027b:
            r12 = 0
        L_0x027c:
            r10.H(r11)
            goto L_0x035a
        L_0x0281:
            r27 = r4
            r28 = r6
            goto L_0x0332
        L_0x0287:
            r1 = r5 & r18
            r4 = 6516084(0x636d74, float:9.130979E-39)
            if (r1 != r4) goto L_0x02c3
            int r1 = r10.h()     // Catch:{ all -> 0x010f }
            int r4 = r10.h()     // Catch:{ all -> 0x010f }
            r6 = 1684108385(0x64617461, float:1.6635614E22)
            if (r4 != r6) goto L_0x02af
            r4 = 8
            r10.I(r4)     // Catch:{ all -> 0x010f }
            r4 = 16
            int r1 = r1 - r4
            java.lang.String r1 = r10.r(r1)     // Catch:{ all -> 0x010f }
            i63 r12 = new i63     // Catch:{ all -> 0x010f }
            java.lang.String r4 = "und"
            r12.<init>(r4, r1, r1)     // Catch:{ all -> 0x010f }
            goto L_0x027c
        L_0x02af:
            java.lang.String r1 = defpackage.ty.f(r5)     // Catch:{ all -> 0x010f }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x010f }
            int r4 = r1.length()     // Catch:{ all -> 0x010f }
            if (r4 == 0) goto L_0x027b
            java.lang.String r4 = "Failed to parse comment attribute: "
            r4.concat(r1)     // Catch:{ all -> 0x010f }
            goto L_0x027b
        L_0x02c3:
            r4 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r1 == r4) goto L_0x0352
            r4 = 7631467(0x74726b, float:1.0693963E-38)
            if (r1 != r4) goto L_0x02cf
            goto L_0x0352
        L_0x02cf:
            r4 = 6516589(0x636f6d, float:9.131686E-39)
            if (r1 == r4) goto L_0x034a
            r4 = 7828084(0x777274, float:1.0969482E-38)
            if (r1 != r4) goto L_0x02db
            goto L_0x034a
        L_0x02db:
            r4 = 6578553(0x646179, float:9.218516E-39)
            if (r1 != r4) goto L_0x02e7
            java.lang.String r1 = "TDRC"
            mff r12 = defpackage.cjf.K(r5, r10, r1)     // Catch:{ all -> 0x010f }
            goto L_0x027c
        L_0x02e7:
            r4 = 4280916(0x415254, float:5.998841E-39)
            if (r1 != r4) goto L_0x02f3
            java.lang.String r1 = "TPE1"
            mff r12 = defpackage.cjf.K(r5, r10, r1)     // Catch:{ all -> 0x010f }
            goto L_0x027c
        L_0x02f3:
            r4 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r1 != r4) goto L_0x0300
            java.lang.String r1 = "TSSE"
            mff r12 = defpackage.cjf.K(r5, r10, r1)     // Catch:{ all -> 0x010f }
            goto L_0x027c
        L_0x0300:
            r4 = 6384738(0x616c62, float:8.946924E-39)
            if (r1 != r4) goto L_0x030d
            java.lang.String r1 = "TALB"
            mff r12 = defpackage.cjf.K(r5, r10, r1)     // Catch:{ all -> 0x010f }
            goto L_0x027c
        L_0x030d:
            r4 = 7108978(0x6c7972, float:9.9618E-39)
            if (r1 != r4) goto L_0x031a
            java.lang.String r1 = "USLT"
            mff r12 = defpackage.cjf.K(r5, r10, r1)     // Catch:{ all -> 0x010f }
            goto L_0x027c
        L_0x031a:
            r4 = 6776174(0x67656e, float:9.495442E-39)
            if (r1 != r4) goto L_0x0325
            mff r12 = defpackage.cjf.K(r5, r10, r13)     // Catch:{ all -> 0x010f }
            goto L_0x027c
        L_0x0325:
            r4 = 6779504(0x677270, float:9.500109E-39)
            if (r1 != r4) goto L_0x0332
            java.lang.String r1 = "TIT1"
            mff r12 = defpackage.cjf.K(r5, r10, r1)     // Catch:{ all -> 0x010f }
            goto L_0x027c
        L_0x0332:
            java.lang.String r1 = "Skipped unknown metadata entry: "
            java.lang.String r4 = defpackage.ty.f(r5)     // Catch:{ all -> 0x010f }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x010f }
            int r5 = r4.length()     // Catch:{ all -> 0x010f }
            if (r5 == 0) goto L_0x0345
            r1.concat(r4)     // Catch:{ all -> 0x010f }
        L_0x0345:
            r10.H(r11)
            r12 = 0
            goto L_0x035a
        L_0x034a:
            java.lang.String r1 = "TCOM"
            mff r12 = defpackage.cjf.K(r5, r10, r1)     // Catch:{ all -> 0x010f }
            goto L_0x027c
        L_0x0352:
            java.lang.String r1 = "TIT2"
            mff r12 = defpackage.cjf.K(r5, r10, r1)     // Catch:{ all -> 0x010f }
            goto L_0x027c
        L_0x035a:
            if (r12 == 0) goto L_0x035f
            r3.add(r12)
        L_0x035f:
            r4 = r27
            r6 = r28
            r1 = 4
            r8 = 1768715124(0x696c7374, float:1.7865732E25)
            r12 = 8
            goto L_0x0099
        L_0x036b:
            r10.H(r11)
            throw r0
        L_0x036f:
            r28 = r6
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x0379
            r12 = 0
            goto L_0x037e
        L_0x0379:
            rp9 r12 = new rp9
            r12.<init>((java.util.List) r3)
        L_0x037e:
            r18 = r12
            goto L_0x03fd
        L_0x0382:
            r28 = r6
            int r4 = r4 + r5
            r10.H(r4)
            r1 = 4
            r8 = 1768715124(0x696c7374, float:1.7865732E25)
            r11 = 1751411826(0x68646c72, float:4.3148E24)
            r12 = 8
            goto L_0x007f
        L_0x0393:
            r28 = r6
            r18 = 0
            goto L_0x03fd
        L_0x0398:
            r28 = r6
            r1 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r3 != r1) goto L_0x03fd
            r10.H(r2)
            int r1 = r2 + r16
            r3 = 12
            r10.I(r3)
        L_0x03a9:
            int r3 = r10.b
            if (r3 >= r1) goto L_0x03be
            int r4 = r10.h()
            int r5 = r10.h()
            r6 = 1935766900(0x73617574, float:1.7862687E31)
            if (r5 != r6) goto L_0x03f4
            r5 = 14
            if (r4 >= r5) goto L_0x03c1
        L_0x03be:
            r19 = 0
            goto L_0x03fd
        L_0x03c1:
            r1 = 5
            r10.I(r1)
            int r1 = r10.v()
            r3 = 12
            if (r1 == r3) goto L_0x03d2
            r6 = 13
            if (r1 == r6) goto L_0x03d2
            goto L_0x03be
        L_0x03d2:
            if (r1 != r3) goto L_0x03d8
            r1 = 1131413504(0x43700000, float:240.0)
        L_0x03d6:
            r3 = 1
            goto L_0x03db
        L_0x03d8:
            r1 = 1123024896(0x42f00000, float:120.0)
            goto L_0x03d6
        L_0x03db:
            r10.I(r3)
            int r4 = r10.v()
            rp9 r5 = new rp9
            cfe r6 = new cfe
            r6.<init>(r1, r4)
            pp9[] r1 = new defpackage.pp9[r3]
            r3 = 0
            r1[r3] = r6
            r5.<init>((defpackage.pp9[]) r1)
            r19 = r5
            goto L_0x03fd
        L_0x03f4:
            r5 = 14
            r6 = 13
            int r3 = r3 + r4
            r10.H(r3)
            goto L_0x03a9
        L_0x03fd:
            int r2 = r2 + r16
            r10.H(r2)
            r6 = r28
            r1 = 4
            r4 = 1835365473(0x6d657461, float:4.4382975E27)
            r5 = 1
            r8 = 1768715124(0x696c7374, float:1.7865732E25)
            r11 = 1751411826(0x68646c72, float:4.3148E24)
            r12 = 8
            goto L_0x0056
        L_0x0413:
            r28 = r6
            r3 = r18
            r1 = r19
            android.util.Pair r1 = android.util.Pair.create(r3, r1)
            java.lang.Object r2 = r1.first
            r12 = r2
            rp9 r12 = (defpackage.rp9) r12
            java.lang.Object r1 = r1.second
            rp9 r1 = (defpackage.rp9) r1
            if (r12 == 0) goto L_0x042b
            r14.b(r12)
        L_0x042b:
            r2 = r1
            r1 = r12
            r3 = 1835365473(0x6d657461, float:4.4382975E27)
            goto L_0x0436
        L_0x0431:
            r28 = r6
            r3 = r4
            r1 = 0
            r2 = 0
        L_0x0436:
            py r3 = r9.z(r3)
            if (r3 == 0) goto L_0x052d
            byte[] r4 = defpackage.az.a
            r4 = 1751411826(0x68646c72, float:4.3148E24)
            ry r4 = r3.A(r4)
            r5 = 1801812339(0x6b657973, float:2.7741754E26)
            ry r5 = r3.A(r5)
            r6 = 1768715124(0x696c7374, float:1.7865732E25)
            ry r3 = r3.A(r6)
            if (r4 == 0) goto L_0x0469
            if (r5 == 0) goto L_0x0469
            if (r3 == 0) goto L_0x0469
            g1g r4 = r4.c
            r6 = 16
            r4.H(r6)
            int r4 = r4.h()
            r6 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r4 == r6) goto L_0x046d
        L_0x0469:
            r20 = r7
            goto L_0x052a
        L_0x046d:
            g1g r4 = r5.c
            r5 = 12
            r4.H(r5)
            int r6 = r4.h()
            java.lang.String[] r8 = new java.lang.String[r6]
            r10 = 0
        L_0x047b:
            if (r10 >= r6) goto L_0x0495
            int r11 = r4.h()
            r13 = 4
            r4.I(r13)
            r12 = 8
            int r11 = r11 - r12
            java.nio.charset.Charset r5 = defpackage.x22.c
            java.lang.String r5 = r4.t(r11, r5)
            r8[r10] = r5
            r5 = 1
            int r10 = r10 + r5
            r5 = 12
            goto L_0x047b
        L_0x0495:
            r12 = 8
            r13 = 4
            g1g r3 = r3.c
            r3.H(r12)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x04a2:
            int r5 = r3.c()
            if (r5 <= r12) goto L_0x051b
            int r5 = r3.b
            int r10 = r3.h()
            int r11 = r3.h()
            r16 = 1
            int r11 = r11 + -1
            if (r11 < 0) goto L_0x0507
            if (r11 >= r6) goto L_0x0507
            r11 = r8[r11]
            int r12 = r5 + r10
        L_0x04be:
            int r13 = r3.b
            if (r13 >= r12) goto L_0x04fa
            int r16 = r3.h()
            r18 = r6
            int r6 = r3.h()
            r19 = r8
            r8 = 1684108385(0x64617461, float:1.6635614E22)
            if (r6 != r8) goto L_0x04ee
            int r6 = r3.h()
            int r12 = r3.h()
            r13 = 16
            int r8 = r16 + -16
            byte[] r13 = new byte[r8]
            r20 = r7
            r7 = 0
            r3.g(r7, r13, r8)
            xi8 r7 = new xi8
            r7.<init>(r13, r12, r6, r11)
            r12 = r7
            goto L_0x0501
        L_0x04ee:
            r20 = r7
            int r13 = r13 + r16
            r3.H(r13)
            r6 = r18
            r8 = r19
            goto L_0x04be
        L_0x04fa:
            r18 = r6
            r20 = r7
            r19 = r8
            r12 = 0
        L_0x0501:
            if (r12 == 0) goto L_0x050d
            r4.add(r12)
            goto L_0x050d
        L_0x0507:
            r18 = r6
            r20 = r7
            r19 = r8
        L_0x050d:
            int r5 = r5 + r10
            r3.H(r5)
            r6 = r18
            r8 = r19
            r7 = r20
            r12 = 8
            r13 = 4
            goto L_0x04a2
        L_0x051b:
            r20 = r7
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L_0x0524
            goto L_0x052a
        L_0x0524:
            rp9 r12 = new rp9
            r12.<init>((java.util.List) r4)
            goto L_0x052b
        L_0x052a:
            r12 = 0
        L_0x052b:
            r3 = r12
            goto L_0x0530
        L_0x052d:
            r20 = r7
            r3 = 0
        L_0x0530:
            p79 r4 = new p79
            r5 = 21
            r4.<init>(r5)
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = 0
            r5 = 0
            r10 = r14
            r6 = 4
            r7 = r14
            r14 = r5
            r16 = r4
            java.util.ArrayList r4 = defpackage.az.e(r9, r10, r11, r13, r14, r15, r16)
            wf5 r5 = r0.q
            r5.getClass()
            int r8 = r4.size()
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = r9
            r11 = -1
            r12 = 0
        L_0x0559:
            if (r12 >= r8) goto L_0x06b4
            java.lang.Object r18 = r4.get(r12)
            r6 = r18
            aqf r6 = (defpackage.aqf) r6
            int r15 = r6.b
            if (r15 != 0) goto L_0x0578
            r19 = r1
            r26 = r2
            r21 = r4
            r23 = r8
            r24 = r13
            r2 = r20
            r1 = -1
            r13 = r3
        L_0x0575:
            r3 = 1
            goto L_0x069e
        L_0x0578:
            kpf r15 = r6.a
            r16 = r3
            r21 = r4
            long r3 = r15.e
            int r22 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r22 == 0) goto L_0x0585
            goto L_0x0587
        L_0x0585:
            long r3 = r6.h
        L_0x0587:
            long r13 = java.lang.Math.max(r13, r3)
            lu9 r9 = new lu9
            int r10 = r15.b
            r23 = r8
            ypf r8 = r5.B(r12, r10)
            r9.<init>(r15, r6, r8)
            ca6 r8 = r15.f
            java.lang.String r15 = r8.Z
            r24 = r13
            java.lang.String r13 = "audio/true-hd"
            boolean r13 = r13.equals(r15)
            int r14 = r6.e
            if (r13 == 0) goto L_0x05ac
            r15 = 16
            int r14 = r14 * r15
            goto L_0x05b0
        L_0x05ac:
            r15 = 16
            int r14 = r14 + 30
        L_0x05b0:
            aa6 r8 = r8.a()
            r8.l = r14
            r13 = 2
            if (r10 != r13) goto L_0x05cd
            r17 = 0
            int r13 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r13 <= 0) goto L_0x05cd
            int r6 = r6.b
            r13 = 1
            if (r6 <= r13) goto L_0x05cf
            float r6 = (float) r6
            float r3 = (float) r3
            r4 = 1232348160(0x49742400, float:1000000.0)
            float r3 = r3 / r4
            float r6 = r6 / r3
            r8.r = r6
        L_0x05cd:
            r3 = 1
            goto L_0x05d0
        L_0x05cf:
            r3 = r13
        L_0x05d0:
            if (r10 != r3) goto L_0x05df
            int r3 = r7.a
            r4 = -1
            if (r3 == r4) goto L_0x05df
            int r6 = r7.b
            if (r6 == r4) goto L_0x05df
            r8.A = r3
            r8.B = r6
        L_0x05df:
            java.util.ArrayList r3 = r0.g
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x05e9
            r4 = 0
            goto L_0x05ee
        L_0x05e9:
            rp9 r4 = new rp9
            r4.<init>((java.util.List) r3)
        L_0x05ee:
            rp9[] r3 = new defpackage.rp9[]{r2, r4}
            rp9 r4 = new rp9
            r6 = 0
            pp9[] r13 = new defpackage.pp9[r6]
            r4.<init>((defpackage.pp9[]) r13)
            r6 = 1
            if (r10 != r6) goto L_0x0608
            if (r1 == 0) goto L_0x0605
            r4 = r1
            r19 = r4
        L_0x0602:
            r13 = r16
            goto L_0x0642
        L_0x0605:
            r19 = r1
            goto L_0x0602
        L_0x0608:
            r6 = 2
            if (r10 != r6) goto L_0x0605
            if (r16 == 0) goto L_0x0605
            r13 = r16
            r6 = 0
        L_0x0610:
            pp9[] r14 = r13.a
            int r15 = r14.length
            if (r6 >= r15) goto L_0x0640
            r14 = r14[r6]
            boolean r15 = r14 instanceof defpackage.xi8
            if (r15 == 0) goto L_0x0637
            xi8 r14 = (defpackage.xi8) r14
            java.lang.String r15 = r14.a
            r19 = r1
            java.lang.String r1 = "com.android.capture.fps"
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x0635
            rp9 r4 = new rp9
            r1 = 1
            pp9[] r6 = new defpackage.pp9[r1]
            r15 = 0
            r6[r15] = r14
            r4.<init>((defpackage.pp9[]) r6)
            goto L_0x0642
        L_0x0635:
            r1 = 1
            goto L_0x063a
        L_0x0637:
            r19 = r1
            goto L_0x0635
        L_0x063a:
            int r6 = r6 + r1
            r1 = r19
            r15 = 16
            goto L_0x0610
        L_0x0640:
            r19 = r1
        L_0x0642:
            r1 = 0
        L_0x0643:
            pp9[] r6 = r4.a
            r14 = 2
            if (r1 >= r14) goto L_0x0679
            r14 = r3[r1]
            if (r14 != 0) goto L_0x0652
        L_0x064c:
            r26 = r2
            r17 = r3
        L_0x0650:
            r2 = 1
            goto L_0x0673
        L_0x0652:
            pp9[] r14 = r14.a
            int r15 = r14.length
            if (r15 != 0) goto L_0x0658
            goto L_0x064c
        L_0x0658:
            rp9 r4 = new rp9
            int r15 = defpackage.t0g.a
            int r15 = r6.length
            r26 = r2
            int r2 = r14.length
            int r15 = r15 + r2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r6, r15)
            int r6 = r6.length
            int r15 = r14.length
            r17 = r3
            r3 = 0
            java.lang.System.arraycopy(r14, r3, r2, r6, r15)
            pp9[] r2 = (defpackage.pp9[]) r2
            r4.<init>((defpackage.pp9[]) r2)
            goto L_0x0650
        L_0x0673:
            int r1 = r1 + r2
            r3 = r17
            r2 = r26
            goto L_0x0643
        L_0x0679:
            r26 = r2
            int r1 = r6.length
            if (r1 <= 0) goto L_0x0680
            r8.i = r4
        L_0x0680:
            ca6 r1 = new ca6
            r1.<init>(r8)
            ypf r2 = r9.c
            r2.d(r1)
            r1 = 2
            if (r10 != r1) goto L_0x0697
            r1 = -1
            if (r11 != r1) goto L_0x0694
            int r11 = r20.size()
        L_0x0694:
            r2 = r20
            goto L_0x0699
        L_0x0697:
            r1 = -1
            goto L_0x0694
        L_0x0699:
            r2.add(r9)
            goto L_0x0575
        L_0x069e:
            int r12 = r12 + r3
            r20 = r2
            r3 = r13
            r1 = r19
            r4 = r21
            r8 = r23
            r13 = r24
            r2 = r26
            r6 = 4
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0559
        L_0x06b4:
            r2 = r20
            r1 = -1
            r17 = 0
            r0.t = r11
            r0.u = r13
            r3 = 0
            lu9[] r4 = new defpackage.lu9[r3]
            java.lang.Object[] r2 = r2.toArray(r4)
            lu9[] r2 = (defpackage.lu9[]) r2
            r0.r = r2
            int r3 = r2.length
            long[][] r3 = new long[r3][]
            int r4 = r2.length
            int[] r4 = new int[r4]
            int r6 = r2.length
            long[] r6 = new long[r6]
            int r7 = r2.length
            boolean[] r7 = new boolean[r7]
            r13 = 0
        L_0x06d5:
            int r8 = r2.length
            if (r13 >= r8) goto L_0x06f0
            r8 = r2[r13]
            aqf r8 = r8.b
            int r8 = r8.b
            long[] r8 = new long[r8]
            r3[r13] = r8
            r8 = r2[r13]
            aqf r8 = r8.b
            long[] r8 = r8.f
            r9 = 0
            r10 = r8[r9]
            r6[r13] = r10
            r8 = 1
            int r13 = r13 + r8
            goto L_0x06d5
        L_0x06f0:
            r13 = 0
        L_0x06f1:
            int r8 = r2.length
            if (r13 >= r8) goto L_0x0731
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r8
            r11 = 0
            r8 = r1
        L_0x06fc:
            int r12 = r2.length
            if (r11 >= r12) goto L_0x070e
            boolean r12 = r7[r11]
            if (r12 != 0) goto L_0x070b
            r14 = r6[r11]
            int r12 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r12 > 0) goto L_0x070b
            r8 = r11
            r9 = r14
        L_0x070b:
            r12 = 1
            int r11 = r11 + r12
            goto L_0x06fc
        L_0x070e:
            r12 = 1
            r9 = r4[r8]
            r10 = r3[r8]
            r10[r9] = r17
            r11 = r2[r8]
            aqf r11 = r11.b
            int[] r14 = r11.d
            r14 = r14[r9]
            long r14 = (long) r14
            long r17 = r17 + r14
            int r9 = r9 + r12
            r4[r8] = r9
            int r10 = r10.length
            if (r9 >= r10) goto L_0x072d
            long[] r10 = r11.f
            r9 = r10[r9]
            r6[r8] = r9
            goto L_0x06f1
        L_0x072d:
            r7[r8] = r12
            int r13 = r13 + r12
            goto L_0x06f1
        L_0x0731:
            r12 = 1
            r0.s = r3
            r5.v()
            r5.K(r0)
            r28.clear()
            r1 = 2
            r0.h = r1
            goto L_0x0755
        L_0x0741:
            r12 = r5
            r28 = r6
            boolean r1 = r28.isEmpty()
            if (r1 != 0) goto L_0x0755
            java.lang.Object r1 = r28.peek()
            py r1 = (defpackage.py) r1
            java.util.ArrayList r1 = r1.v
            r1.add(r9)
        L_0x0755:
            r5 = r12
            r1 = 4
            goto L_0x0004
        L_0x0759:
            int r1 = r0.h
            r2 = 2
            if (r1 == r2) goto L_0x0763
            r1 = 0
            r0.h = r1
            r0.k = r1
        L_0x0763:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu9.j(long):void");
    }

    public final void release() {
    }
}
