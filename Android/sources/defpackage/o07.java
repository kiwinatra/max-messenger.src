package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o07  reason: default package */
public final class o07 extends xm8 {
    public static final AtomicInteger U0 = new AtomicInteger();
    public final jk3 A0;
    public final boolean B0;
    public final boolean C0;
    public final qkf D0;
    public final l07 E0;
    public final List F0;
    public final xv4 G0;
    public final r77 H0;
    public final g1g I0;
    public final boolean J0;
    public final boolean K0;
    public jk3 L0;
    public d27 M0;
    public int N0;
    public boolean O0;
    public volatile boolean P0;
    public boolean Q0;
    public tb7 R0;
    public boolean S0;
    public boolean T0;
    public final int Y;
    public final int Z;
    public final Uri v0;
    public final boolean w0;
    public final int x0;
    public final h74 y0;
    public final p74 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o07(l07 l07, h74 h74, p74 p74, ca6 ca6, boolean z, h74 h742, p74 p742, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, qkf qkf, xv4 xv4, jk3 jk3, r77 r77, g1g g1g, boolean z6, lpb lpb) {
        super(h74, p74, ca6, i, obj, j, j2, j3);
        p74 p743 = p742;
        this.J0 = z;
        this.x0 = i2;
        this.T0 = z3;
        this.Z = i3;
        this.z0 = p743;
        this.y0 = h742;
        this.O0 = p743 != null;
        this.K0 = z2;
        this.v0 = uri;
        this.B0 = z5;
        this.D0 = qkf;
        this.C0 = z4;
        this.E0 = l07;
        this.F0 = list;
        this.G0 = xv4;
        this.A0 = jk3;
        this.H0 = r77;
        this.I0 = g1g;
        this.w0 = z6;
        lx5 lx5 = tb7.b;
        this.R0 = k0d.v;
        this.Y = U0.getAndIncrement();
    }

    public static byte[] e(String str) {
        if (o54.P(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    public final void a() {
        this.P0 = true;
    }

    public final boolean c() {
        throw null;
    }

    public final void d(h74 h74, p74 p74, boolean z, boolean z2) {
        p74 p742;
        gf4 g;
        long j;
        long j2;
        jk3 jk3;
        boolean z3 = false;
        if (z) {
            if (this.N0 != 0) {
                z3 = true;
            }
            p742 = p74;
        } else {
            p742 = p74.b((long) this.N0);
        }
        try {
            g = g(h74, p742, z2);
            if (z3) {
                g.z(this.N0);
            }
            do {
                if (!this.P0) {
                    jk3 = this.L0;
                }
                break;
            } while (((sf5) jk3.a).i(g, jk3.o) == 0);
            break;
            j = g.o;
            j2 = p74.f;
        } catch (EOFException e) {
            if ((this.o.v & 16384) != 0) {
                ((sf5) this.L0.a).d(0, 0);
                j = g.o;
                j2 = p74.f;
            } else {
                throw e;
            }
        } catch (Throwable th) {
            vzg.r(h74);
            throw th;
        }
        this.N0 = (int) (j - j2);
        vzg.r(h74);
    }

    public final int f(int i) {
        y64.j(!this.w0);
        if (i >= this.R0.size()) {
            return 0;
        }
        return ((Integer) this.R0.get(i)).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.gf4 g(defpackage.h74 r23, defpackage.p74 r24, boolean r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            long r6 = r23.N(r24)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
            r11 = 1
            if (r25 == 0) goto L_0x0053
            qkf r2 = r0.D0     // Catch:{ InterruptedException -> 0x004d }
            boolean r3 = r0.B0     // Catch:{ InterruptedException -> 0x004d }
            long r4 = r0.x     // Catch:{ InterruptedException -> 0x004d }
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x004d }
            long r12 = r2.a     // Catch:{ all -> 0x003d }
            r14 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x0025
            r12 = r11
            goto L_0x0026
        L_0x0025:
            r12 = r10
        L_0x0026:
            defpackage.y64.j(r12)     // Catch:{ all -> 0x003d }
            long r12 = r2.b     // Catch:{ all -> 0x003d }
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 == 0) goto L_0x0031
            monitor-exit(r2)     // Catch:{ InterruptedException -> 0x004d }
            goto L_0x0053
        L_0x0031:
            if (r3 == 0) goto L_0x003f
            java.lang.ThreadLocal r3 = r2.d     // Catch:{ all -> 0x003d }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x003d }
            r3.set(r4)     // Catch:{ all -> 0x003d }
            goto L_0x0049
        L_0x003d:
            r0 = move-exception
            goto L_0x004b
        L_0x003f:
            long r3 = r2.b     // Catch:{ all -> 0x003d }
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0049
            r2.wait()     // Catch:{ all -> 0x003d }
            goto L_0x003f
        L_0x0049:
            monitor-exit(r2)     // Catch:{ InterruptedException -> 0x004d }
            goto L_0x0053
        L_0x004b:
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ InterruptedException -> 0x004d }
        L_0x004d:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
        L_0x0053:
            gf4 r12 = new gf4
            long r4 = r1.f
            r2 = r12
            r3 = r23
            r2.<init>(r3, r4, r6)
            jk3 r2 = r0.L0
            if (r2 != 0) goto L_0x0371
            g1g r2 = r0.I0
            r12.w = r10
            r3 = 10
            r4 = 8
            r2.E(r3)     // Catch:{ EOFException -> 0x007a }
            byte[] r5 = r2.a     // Catch:{ EOFException -> 0x007a }
            r12.q(r5, r10, r3, r10)     // Catch:{ EOFException -> 0x007a }
            int r5 = r2.x()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r5 == r6) goto L_0x007c
        L_0x007a:
            r2 = r8
            goto L_0x00d6
        L_0x007c:
            r5 = 3
            r2.I(r5)
            int r5 = r2.u()
            int r6 = r5 + 10
            byte[] r7 = r2.a
            int r13 = r7.length
            if (r6 <= r13) goto L_0x0093
            r2.E(r6)
            byte[] r6 = r2.a
            java.lang.System.arraycopy(r7, r10, r6, r10, r3)
        L_0x0093:
            byte[] r6 = r2.a
            r12.q(r6, r3, r5, r10)
            byte[] r3 = r2.a
            r77 r6 = r0.H0
            rp9 r3 = r6.T(r5, r3)
            if (r3 != 0) goto L_0x00a3
            goto L_0x007a
        L_0x00a3:
            pp9[] r3 = r3.a
            int r5 = r3.length
            r6 = r10
        L_0x00a7:
            if (r6 >= r5) goto L_0x007a
            r7 = r3[r6]
            boolean r13 = r7 instanceof defpackage.xub
            if (r13 == 0) goto L_0x00d3
            xub r7 = (defpackage.xub) r7
            java.lang.String r13 = r7.b
            java.lang.String r14 = "com.apple.streaming.transportStreamTimestamp"
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x00d3
            byte[] r3 = r2.a
            byte[] r5 = r7.c
            java.lang.System.arraycopy(r5, r10, r3, r10, r4)
            r2.H(r10)
            r2.G(r4)
            long r2 = r2.p()
            r5 = 8589934591(0x1ffffffff, double:4.2439915814E-314)
            long r2 = r2 & r5
            goto L_0x00d6
        L_0x00d3:
            int r6 = r6 + 1
            goto L_0x00a7
        L_0x00d6:
            r12.w = r10
            jk3 r5 = r0.A0
            if (r5 == 0) goto L_0x0159
            java.lang.Object r1 = r5.a
            sf5 r1 = (defpackage.sf5) r1
            boolean r4 = r1 instanceof defpackage.mtf
            if (r4 != 0) goto L_0x00eb
            boolean r1 = r1 instanceof defpackage.ud6
            if (r1 == 0) goto L_0x00e9
            goto L_0x00eb
        L_0x00e9:
            r1 = r10
            goto L_0x00ec
        L_0x00eb:
            r1 = r11
        L_0x00ec:
            r1 = r1 ^ r11
            defpackage.y64.j(r1)
            java.lang.Object r1 = r5.a
            sf5 r1 = (defpackage.sf5) r1
            boolean r4 = r1 instanceof defpackage.pmg
            java.lang.Object r13 = r5.c
            qkf r13 = (defpackage.qkf) r13
            java.lang.Object r5 = r5.b
            ca6 r5 = (defpackage.ca6) r5
            if (r4 == 0) goto L_0x0108
            pmg r1 = new pmg
            java.lang.String r4 = r5.c
            r1.<init>(r4, r13)
            goto L_0x012f
        L_0x0108:
            boolean r4 = r1 instanceof defpackage.zb
            if (r4 == 0) goto L_0x0112
            zb r1 = new zb
            r1.<init>()
            goto L_0x012f
        L_0x0112:
            boolean r4 = r1 instanceof defpackage.l3
            if (r4 == 0) goto L_0x011c
            l3 r1 = new l3
            r1.<init>()
            goto L_0x012f
        L_0x011c:
            boolean r4 = r1 instanceof defpackage.p3
            if (r4 == 0) goto L_0x0126
            p3 r1 = new p3
            r1.<init>()
            goto L_0x012f
        L_0x0126:
            boolean r4 = r1 instanceof defpackage.ju9
            if (r4 == 0) goto L_0x0139
            ju9 r1 = new ju9
            r1.<init>()
        L_0x012f:
            jk3 r4 = new jk3
            r4.<init>(r1, r5, r13)
            r19 = r2
            r3 = r10
            goto L_0x02ec
        L_0x0139:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            int r2 = r1.length()
            java.lang.String r3 = "Unexpected extractor type for recreation: "
            if (r2 == 0) goto L_0x0150
            java.lang.String r1 = r3.concat(r1)
            goto L_0x0155
        L_0x0150:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x0155:
            r0.<init>(r1)
            throw r0
        L_0x0159:
            l07 r5 = r0.E0
            android.net.Uri r1 = r1.a
            ca6 r13 = r0.o
            java.util.List r14 = r0.F0
            qkf r15 = r0.D0
            java.util.Map r8 = r23.x()
            sx6 r5 = (defpackage.sx6) r5
            r5.getClass()
            java.lang.String r5 = r13.Z
            int r5 = defpackage.h88.E(r5)
            java.lang.String r9 = "Content-Type"
            java.lang.Object r8 = r8.get(r9)
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x018a
            boolean r16 = r8.isEmpty()
            if (r16 == 0) goto L_0x0183
            goto L_0x018a
        L_0x0183:
            java.lang.Object r8 = r8.get(r10)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x018b
        L_0x018a:
            r8 = 0
        L_0x018b:
            int r8 = defpackage.h88.E(r8)
            int r1 = defpackage.h88.F(r1)
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 7
            r6.<init>(r7)
            defpackage.sx6.e(r5, r6)
            defpackage.sx6.e(r8, r6)
            defpackage.sx6.e(r1, r6)
            int[] r17 = defpackage.sx6.c
            r9 = r10
        L_0x01a5:
            if (r9 >= r7) goto L_0x01b1
            r4 = r17[r9]
            defpackage.sx6.e(r4, r6)
            int r9 = r9 + 1
            r4 = 8
            goto L_0x01a5
        L_0x01b1:
            r12.w = r10
            r4 = r10
            r9 = 0
        L_0x01b5:
            int r10 = r6.size()
            if (r4 >= r10) goto L_0x02e0
            java.lang.Object r10 = r6.get(r4)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r7 = 11
            if (r10 == 0) goto L_0x02a1
            if (r10 == r11) goto L_0x0296
            r11 = 2
            if (r10 == r11) goto L_0x028b
            r11 = 7
            if (r10 == r11) goto L_0x027e
            r11 = 8
            if (r10 == r11) goto L_0x0245
            if (r10 == r7) goto L_0x01f1
            r11 = 13
            if (r10 == r11) goto L_0x01e3
            r19 = r2
            r18 = r6
            r6 = 0
            r11 = 0
            goto L_0x02ab
        L_0x01e3:
            pmg r11 = new pmg
            java.lang.String r7 = r13.c
            r11.<init>(r7, r15)
            r19 = r2
            r18 = r6
        L_0x01ee:
            r6 = 0
            goto L_0x02ab
        L_0x01f1:
            if (r14 == 0) goto L_0x01f9
            r7 = 48
            r18 = r6
            r11 = r14
            goto L_0x0214
        L_0x01f9:
            aa6 r7 = new aa6
            r7.<init>()
            java.lang.String r11 = "application/cea-608"
            r7.k = r11
            ca6 r11 = new ca6
            r11.<init>(r7)
            java.util.List r7 = java.util.Collections.singletonList(r11)
            r11 = 16
            r18 = r6
            r21 = r11
            r11 = r7
            r7 = r21
        L_0x0214:
            java.lang.String r6 = r13.z
            boolean r19 = android.text.TextUtils.isEmpty(r6)
            if (r19 != 0) goto L_0x0235
            r19 = r2
            java.lang.String r2 = "audio/mp4a-latm"
            java.lang.String r2 = defpackage.uq9.a(r6, r2)
            if (r2 == 0) goto L_0x0227
            goto L_0x0229
        L_0x0227:
            r7 = r7 | 2
        L_0x0229:
            java.lang.String r2 = "video/avc"
            java.lang.String r2 = defpackage.uq9.a(r6, r2)
            if (r2 == 0) goto L_0x0232
            goto L_0x0237
        L_0x0232:
            r7 = r7 | 4
            goto L_0x0237
        L_0x0235:
            r19 = r2
        L_0x0237:
            mtf r2 = new mtf
            kk3 r3 = new kk3
            r6 = 2
            r3.<init>(r11, r7, r6)
            r6 = 2
            r2.<init>(r6, r15, r3)
            r11 = r2
            goto L_0x01ee
        L_0x0245:
            r19 = r2
            r18 = r6
            ud6 r11 = new ud6
            rp9 r2 = r13.X
            if (r2 != 0) goto L_0x0251
        L_0x024f:
            r2 = 0
            goto L_0x026b
        L_0x0251:
            r3 = 0
        L_0x0252:
            pp9[] r6 = r2.a
            int r7 = r6.length
            if (r3 >= r7) goto L_0x024f
            r6 = r6[r3]
            boolean r7 = r6 instanceof defpackage.i27
            if (r7 == 0) goto L_0x0268
            i27 r6 = (defpackage.i27) r6
            java.util.List r2 = r6.c
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            goto L_0x026b
        L_0x0268:
            int r3 = r3 + 1
            goto L_0x0252
        L_0x026b:
            if (r2 == 0) goto L_0x026f
            r2 = 4
            goto L_0x0270
        L_0x026f:
            r2 = 0
        L_0x0270:
            if (r14 == 0) goto L_0x0275
            r3 = r14
        L_0x0273:
            r6 = 0
            goto L_0x027a
        L_0x0275:
            java.util.List r3 = java.util.Collections.emptyList()
            goto L_0x0273
        L_0x027a:
            r11.<init>(r2, r15, r3, r6)
            goto L_0x02ab
        L_0x027e:
            r19 = r2
            r18 = r6
            r6 = 0
            ju9 r11 = new ju9
            r2 = 0
            r11.<init>(r2)
            goto L_0x02ab
        L_0x028b:
            r19 = r2
            r18 = r6
            r6 = 0
            zb r11 = new zb
            r11.<init>()
            goto L_0x02ab
        L_0x0296:
            r19 = r2
            r18 = r6
            r6 = 0
            p3 r11 = new p3
            r11.<init>()
            goto L_0x02ab
        L_0x02a1:
            r19 = r2
            r18 = r6
            r6 = 0
            l3 r11 = new l3
            r11.<init>()
        L_0x02ab:
            r11.getClass()
            boolean r2 = r11.h(r12)     // Catch:{ EOFException -> 0x02bc, all -> 0x02b6 }
            r3 = 0
            r12.w = r3
            goto L_0x02c0
        L_0x02b6:
            r0 = move-exception
            r3 = 0
            r1 = r0
            r12.w = r3
            throw r1
        L_0x02bc:
            r3 = 0
            r12.w = r3
            r2 = r3
        L_0x02c0:
            if (r2 == 0) goto L_0x02c9
            jk3 r1 = new jk3
            r1.<init>(r11, r13, r15)
        L_0x02c7:
            r4 = r1
            goto L_0x02ec
        L_0x02c9:
            if (r9 != 0) goto L_0x02d6
            if (r10 == r5) goto L_0x02d5
            if (r10 == r8) goto L_0x02d5
            if (r10 == r1) goto L_0x02d5
            r2 = 11
            if (r10 != r2) goto L_0x02d6
        L_0x02d5:
            r9 = r11
        L_0x02d6:
            int r4 = r4 + 1
            r6 = r18
            r2 = r19
            r7 = 7
            r11 = 1
            goto L_0x01b5
        L_0x02e0:
            r19 = r2
            r3 = 0
            jk3 r1 = new jk3
            r9.getClass()
            r1.<init>(r9, r13, r15)
            goto L_0x02c7
        L_0x02ec:
            r0.L0 = r4
            java.lang.Object r1 = r4.a
            sf5 r1 = (defpackage.sf5) r1
            boolean r2 = r1 instanceof defpackage.zb
            if (r2 != 0) goto L_0x0305
            boolean r2 = r1 instanceof defpackage.l3
            if (r2 != 0) goto L_0x0305
            boolean r2 = r1 instanceof defpackage.p3
            if (r2 != 0) goto L_0x0305
            boolean r1 = r1 instanceof defpackage.ju9
            if (r1 == 0) goto L_0x0303
            goto L_0x0305
        L_0x0303:
            r1 = r3
            goto L_0x0306
        L_0x0305:
            r1 = 1
        L_0x0306:
            if (r1 == 0) goto L_0x033c
            d27 r1 = r0.M0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x031c
            qkf r2 = r0.D0
            r8 = r19
            long r4 = r2.b(r8)
            goto L_0x031e
        L_0x031c:
            long r4 = r0.x
        L_0x031e:
            long r6 = r1.e1
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x035e
            r1.e1 = r4
            b27[] r1 = r1.E0
            int r2 = r1.length
            r6 = r3
        L_0x032a:
            if (r6 >= r2) goto L_0x035e
            r7 = r1[r6]
            long r8 = r7.F
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0339
            r7.F = r4
            r8 = 1
            r7.z = r8
        L_0x0339:
            int r6 = r6 + 1
            goto L_0x032a
        L_0x033c:
            d27 r1 = r0.M0
            long r4 = r1.e1
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x035e
            r1.e1 = r6
            b27[] r1 = r1.E0
            int r2 = r1.length
            r4 = r3
        L_0x034c:
            if (r4 >= r2) goto L_0x035e
            r5 = r1[r4]
            long r8 = r5.F
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x035b
            r5.F = r6
            r8 = 1
            r5.z = r8
        L_0x035b:
            int r4 = r4 + 1
            goto L_0x034c
        L_0x035e:
            d27 r1 = r0.M0
            java.util.HashSet r1 = r1.G0
            r1.clear()
            jk3 r1 = r0.L0
            d27 r2 = r0.M0
            java.lang.Object r1 = r1.a
            sf5 r1 = (defpackage.sf5) r1
            r1.g(r2)
            goto L_0x0372
        L_0x0371:
            r3 = r10
        L_0x0372:
            d27 r1 = r0.M0
            xv4 r0 = r0.G0
            xv4 r2 = r1.f1
            boolean r2 = defpackage.t0g.a(r2, r0)
            if (r2 != 0) goto L_0x0398
            r1.f1 = r0
            r10 = r3
        L_0x0381:
            b27[] r2 = r1.E0
            int r3 = r2.length
            if (r10 >= r3) goto L_0x0398
            boolean[] r3 = r1.X0
            boolean r3 = r3[r10]
            if (r3 == 0) goto L_0x0394
            r2 = r2[r10]
            r2.I = r0
            r3 = 1
            r2.z = r3
            goto L_0x0395
        L_0x0394:
            r3 = 1
        L_0x0395:
            int r10 = r10 + 1
            goto L_0x0381
        L_0x0398:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o07.g(h74, p74, boolean):gf4");
    }

    public final void load() {
        jk3 jk3;
        this.M0.getClass();
        if (this.L0 == null && (jk3 = this.A0) != null) {
            sf5 sf5 = (sf5) jk3.a;
            if ((sf5 instanceof mtf) || (sf5 instanceof ud6)) {
                this.L0 = jk3;
                this.O0 = false;
            }
        }
        if (this.O0) {
            h74 h74 = this.y0;
            h74.getClass();
            p74 p74 = this.z0;
            p74.getClass();
            d(h74, p74, this.K0, false);
            this.N0 = 0;
            this.O0 = false;
        }
        if (!this.P0) {
            if (!this.C0) {
                d(this.z, this.b, this.J0, true);
            }
            this.Q0 = !this.P0;
        }
    }
}
