package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: p07  reason: default package */
public final class p07 extends ym8 {
    public static final AtomicInteger V0 = new AtomicInteger();
    public final pv0 A0;
    public final boolean B0;
    public final boolean C0;
    public final rkf D0;
    public final m07 E0;
    public final List F0;
    public final yv4 G0;
    public final s77 H0;
    public final l8b I0;
    public final boolean J0;
    public final boolean K0;
    public final long L0;
    public pv0 M0;
    public e27 N0;
    public int O0;
    public boolean P0;
    public volatile boolean Q0;
    public boolean R0;
    public tb7 S0;
    public boolean T0;
    public boolean U0;
    public final int Y;
    public final int Z;
    public final Uri v0;
    public final boolean w0;
    public final int x0;
    public final j74 y0;
    public final q74 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p07(m07 m07, j74 j74, q74 q74, ea6 ea6, boolean z, j74 j742, q74 q742, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, rkf rkf, long j4, yv4 yv4, pv0 pv0, s77 s77, l8b l8b, boolean z6, mpb mpb) {
        super(j74, q74, ea6, i, obj, j, j2, j3);
        q74 q743 = q742;
        this.J0 = z;
        this.x0 = i2;
        this.U0 = z3;
        this.Z = i3;
        this.z0 = q743;
        this.y0 = j742;
        this.P0 = q743 != null;
        this.K0 = z2;
        this.v0 = uri;
        this.B0 = z5;
        this.D0 = rkf;
        this.L0 = j4;
        this.C0 = z4;
        this.E0 = m07;
        this.F0 = list;
        this.G0 = yv4;
        this.A0 = pv0;
        this.H0 = s77;
        this.I0 = l8b;
        this.w0 = z6;
        lx5 lx5 = tb7.b;
        this.S0 = k0d.v;
        this.Y = V0.getAndIncrement();
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
        this.Q0 = true;
    }

    public final boolean c() {
        throw null;
    }

    public final void d(j74 j74, q74 q74, boolean z, boolean z2) {
        q74 q742;
        hf4 g;
        long j;
        long j2;
        pv0 pv0;
        boolean z3 = false;
        if (z) {
            if (this.O0 != 0) {
                z3 = true;
            }
            q742 = q74;
        } else {
            q742 = q74.b((long) this.O0);
        }
        try {
            g = g(j74, q742, z2);
            if (z3) {
                g.z(this.O0);
            }
            do {
                if (!this.Q0) {
                    pv0 = this.M0;
                }
                break;
            } while (((tf5) pv0.c).g(g, pv0.x) == 0);
            break;
            j = g.o;
            j2 = q74.f;
        } catch (EOFException e) {
            if ((this.o.f & 16384) != 0) {
                ((tf5) this.M0.c).d(0, 0);
                j = g.o;
                j2 = q74.f;
            } else {
                throw e;
            }
        } catch (Throwable th) {
            b0h.l(j74);
            throw th;
        }
        this.O0 = (int) (j - j2);
        b0h.l(j74);
    }

    public final int f(int i) {
        n79.n(!this.w0);
        if (i >= this.S0.size()) {
            return 0;
        }
        return ((Integer) this.S0.get(i)).intValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: k0d} */
    /* JADX WARNING: type inference failed for: r4v13, types: [tf5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v44 */
    /* JADX WARNING: type inference failed for: r4v45 */
    /* JADX WARNING: type inference failed for: r4v46 */
    /* JADX WARNING: type inference failed for: r4v47 */
    /* JADX WARNING: type inference failed for: r4v48 */
    /* JADX WARNING: type inference failed for: r4v49 */
    /* JADX WARNING: type inference failed for: r23v2, types: [vd6] */
    /* JADX WARNING: type inference failed for: r23v3, types: [ntf] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.hf4 g(defpackage.j74 r32, defpackage.q74 r33, boolean r34) {
        /*
            r31 = this;
            r0 = r31
            r1 = r33
            long r6 = r32.G(r33)
            if (r34 == 0) goto L_0x0023
            rkf r8 = r0.D0     // Catch:{ InterruptedException -> 0x001d, TimeoutException -> 0x0016 }
            boolean r13 = r0.B0     // Catch:{ InterruptedException -> 0x001d, TimeoutException -> 0x0016 }
            long r9 = r0.x     // Catch:{ InterruptedException -> 0x001d, TimeoutException -> 0x0016 }
            long r11 = r0.L0     // Catch:{ InterruptedException -> 0x001d, TimeoutException -> 0x0016 }
            r8.g(r9, r11, r13)     // Catch:{ InterruptedException -> 0x001d, TimeoutException -> 0x0016 }
            goto L_0x0023
        L_0x0016:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L_0x001d:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
        L_0x0023:
            hf4 r8 = new hf4
            long r4 = r1.f
            r2 = r8
            r3 = r32
            r2.<init>(r3, r4, r6)
            pv0 r2 = r0.M0
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x03da
            l8b r2 = r0.I0
            r8.w = r3
            r5 = 10
            r6 = 8
            r2.D(r5)     // Catch:{ EOFException -> 0x004c }
            byte[] r7 = r2.a     // Catch:{ EOFException -> 0x004c }
            r8.q(r7, r3, r5, r3)     // Catch:{ EOFException -> 0x004c }
            int r7 = r2.x()
            r11 = 4801587(0x494433, float:6.728456E-39)
            if (r7 == r11) goto L_0x0052
        L_0x004c:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00ac
        L_0x0052:
            r7 = 3
            r2.H(r7)
            int r7 = r2.t()
            int r11 = r7 + 10
            byte[] r12 = r2.a
            int r13 = r12.length
            if (r11 <= r13) goto L_0x0069
            r2.D(r11)
            byte[] r11 = r2.a
            java.lang.System.arraycopy(r12, r3, r11, r3, r5)
        L_0x0069:
            byte[] r11 = r2.a
            r8.q(r11, r5, r7, r3)
            byte[] r5 = r2.a
            s77 r11 = r0.H0
            sp9 r5 = r11.N(r7, r5)
            if (r5 != 0) goto L_0x0079
            goto L_0x004c
        L_0x0079:
            qp9[] r5 = r5.a
            int r7 = r5.length
            r11 = r3
        L_0x007d:
            if (r11 >= r7) goto L_0x004c
            r12 = r5[r11]
            boolean r13 = r12 instanceof defpackage.yub
            if (r13 == 0) goto L_0x00a9
            yub r12 = (defpackage.yub) r12
            java.lang.String r13 = r12.b
            java.lang.String r14 = "com.apple.streaming.transportStreamTimestamp"
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x00a9
            byte[] r5 = r2.a
            byte[] r7 = r12.c
            java.lang.System.arraycopy(r7, r3, r5, r3, r6)
            r2.G(r3)
            r2.F(r6)
            long r11 = r2.o()
            r13 = 8589934591(0x1ffffffff, double:4.2439915814E-314)
            long r11 = r11 & r13
            goto L_0x00ac
        L_0x00a9:
            int r11 = r11 + 1
            goto L_0x007d
        L_0x00ac:
            r8.w = r3
            pv0 r2 = r0.A0
            if (r2 == 0) goto L_0x0165
            java.lang.Object r1 = r2.c
            tf5 r1 = (defpackage.tf5) r1
            tf5 r5 = r1.m()
            boolean r6 = r5 instanceof defpackage.ntf
            if (r6 != 0) goto L_0x00c5
            boolean r5 = r5 instanceof defpackage.vd6
            if (r5 == 0) goto L_0x00c3
            goto L_0x00c5
        L_0x00c3:
            r5 = r3
            goto L_0x00c6
        L_0x00c5:
            r5 = r4
        L_0x00c6:
            r5 = r5 ^ r4
            defpackage.n79.n(r5)
            tf5 r5 = r1.m()
            if (r5 != r1) goto L_0x00d2
            r5 = r4
            goto L_0x00d3
        L_0x00d2:
            r5 = r3
        L_0x00d3:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Can't recreate wrapped extractors. Outer type: "
            r6.<init>(r7)
            java.lang.Class r7 = r1.getClass()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            defpackage.n79.m(r6, r5)
            boolean r5 = r1 instanceof defpackage.qmg
            java.lang.Object r6 = r2.w
            gze r6 = (defpackage.gze) r6
            if (r5 == 0) goto L_0x0107
            qmg r1 = new qmg
            java.lang.Object r5 = r2.o
            ea6 r5 = (defpackage.ea6) r5
            java.lang.String r5 = r5.d
            java.lang.Object r7 = r2.v
            rkf r7 = (defpackage.rkf) r7
            r15 = r6
            ece r15 = (defpackage.ece) r15
            boolean r9 = r2.b
            r1.<init>(r5, r7, r15, r9)
        L_0x0104:
            r17 = r1
            goto L_0x012f
        L_0x0107:
            boolean r5 = r1 instanceof defpackage.ac
            if (r5 == 0) goto L_0x0111
            ac r1 = new ac
            r1.<init>(r3)
            goto L_0x0104
        L_0x0111:
            boolean r5 = r1 instanceof defpackage.m3
            if (r5 == 0) goto L_0x011b
            m3 r1 = new m3
            r1.<init>()
            goto L_0x0104
        L_0x011b:
            boolean r5 = r1 instanceof defpackage.q3
            if (r5 == 0) goto L_0x0125
            q3 r1 = new q3
            r1.<init>()
            goto L_0x0104
        L_0x0125:
            boolean r5 = r1 instanceof defpackage.ku9
            if (r5 == 0) goto L_0x0151
            ku9 r1 = new ku9
            r1.<init>(r3)
            goto L_0x0104
        L_0x012f:
            pv0 r1 = new pv0
            boolean r5 = r2.b
            r20 = r6
            ece r20 = (defpackage.ece) r20
            java.lang.Object r6 = r2.o
            r18 = r6
            ea6 r18 = (defpackage.ea6) r18
            java.lang.Object r2 = r2.v
            r19 = r2
            rkf r19 = (defpackage.rkf) r19
            r22 = 0
            r16 = r1
            r21 = r5
            r16.<init>((java.lang.Object) r17, (java.lang.Object) r18, (java.lang.Object) r19, (java.lang.Object) r20, (boolean) r21, (int) r22)
            r10 = r3
            r29 = r11
            goto L_0x0351
        L_0x0151:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = "Unexpected extractor type for recreation: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x0165:
            java.util.Map r2 = r32.x()
            m07 r5 = r0.E0
            qf4 r5 = (defpackage.qf4) r5
            r5.getClass()
            ea6 r7 = r0.o
            java.lang.String r9 = r7.n
            int r9 = defpackage.fqc.w(r9)
            java.lang.String r10 = "Content-Type"
            java.lang.Object r2 = r2.get(r10)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0190
            boolean r15 = r2.isEmpty()
            if (r15 == 0) goto L_0x0189
            goto L_0x0190
        L_0x0189:
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0191
        L_0x0190:
            r2 = 0
        L_0x0191:
            int r2 = defpackage.fqc.w(r2)
            android.net.Uri r1 = r1.a
            int r1 = defpackage.fqc.x(r1)
            java.util.ArrayList r15 = new java.util.ArrayList
            r10 = 7
            r15.<init>(r10)
            defpackage.qf4.a(r9, r15)
            defpackage.qf4.a(r2, r15)
            defpackage.qf4.a(r1, r15)
            int[] r16 = defpackage.qf4.d
            r13 = r3
        L_0x01ad:
            if (r13 >= r10) goto L_0x01b7
            r14 = r16[r13]
            defpackage.qf4.a(r14, r15)
            int r13 = r13 + 1
            goto L_0x01ad
        L_0x01b7:
            r8.w = r3
            r13 = r3
            r17 = 0
        L_0x01bc:
            int r14 = r15.size()
            rkf r3 = r0.D0
            if (r13 >= r14) goto L_0x0334
            java.lang.Object r14 = r15.get(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r6 = 11
            if (r14 == 0) goto L_0x02df
            if (r14 == r4) goto L_0x02d5
            r4 = 2
            if (r14 == r4) goto L_0x02ca
            if (r14 == r10) goto L_0x02bd
            nfd r4 = defpackage.gze.d0
            java.util.List r10 = r0.F0
            r18 = r4
            r4 = 8
            if (r14 == r4) goto L_0x0268
            if (r14 == r6) goto L_0x0204
            r10 = 13
            if (r14 == r10) goto L_0x01f0
            r29 = r11
            r20 = r15
            r4 = 0
            goto L_0x02e8
        L_0x01f0:
            qmg r10 = new qmg
            gze r4 = r5.b
            boolean r6 = r5.c
            r20 = r15
            java.lang.String r15 = r7.d
            ece r4 = (defpackage.ece) r4
            r10.<init>(r15, r3, r4, r6)
            r4 = r10
            r29 = r11
            goto L_0x02e8
        L_0x0204:
            r20 = r15
            gze r4 = r5.b
            boolean r6 = r5.c
            if (r10 == 0) goto L_0x0211
            r15 = 48
        L_0x020e:
            r21 = r4
            goto L_0x022a
        L_0x0211:
            ba6 r10 = new ba6
            r10.<init>()
            java.lang.String r15 = "application/cea-608"
            java.lang.String r15 = defpackage.vq9.l(r15)
            r10.m = r15
            ea6 r15 = new ea6
            r15.<init>(r10)
            java.util.List r10 = java.util.Collections.singletonList(r15)
            r15 = 16
            goto L_0x020e
        L_0x022a:
            java.lang.String r4 = r7.j
            boolean r22 = android.text.TextUtils.isEmpty(r4)
            r29 = r11
            if (r22 != 0) goto L_0x024a
            java.lang.String r11 = "audio/mp4a-latm"
            java.lang.String r11 = defpackage.vq9.a(r4, r11)
            if (r11 == 0) goto L_0x023d
            goto L_0x023f
        L_0x023d:
            r15 = r15 | 2
        L_0x023f:
            java.lang.String r11 = "video/avc"
            java.lang.String r4 = defpackage.vq9.a(r4, r11)
            if (r4 == 0) goto L_0x0248
            goto L_0x024a
        L_0x0248:
            r15 = r15 | 4
        L_0x024a:
            if (r6 != 0) goto L_0x024f
            r26 = r18
            goto L_0x0251
        L_0x024f:
            r26 = r21
        L_0x0251:
            r25 = r6 ^ 1
            ntf r4 = new ntf
            kk3 r6 = new kk3
            r11 = 3
            r6.<init>(r10, r15, r11)
            r24 = 2
            r23 = r4
            r27 = r3
            r28 = r6
            r23.<init>(r24, r25, r26, r27, r28)
            goto L_0x02e8
        L_0x0268:
            r29 = r11
            r20 = r15
            gze r4 = r5.b
            boolean r6 = r5.c
            sp9 r11 = r7.k
            if (r11 != 0) goto L_0x0278
            r21 = r4
        L_0x0276:
            r4 = 0
            goto L_0x0296
        L_0x0278:
            r12 = 0
        L_0x0279:
            qp9[] r15 = r11.a
            r21 = r4
            int r4 = r15.length
            if (r12 >= r4) goto L_0x0276
            r4 = r15[r12]
            boolean r15 = r4 instanceof defpackage.j27
            if (r15 == 0) goto L_0x0291
            j27 r4 = (defpackage.j27) r4
            java.util.List r4 = r4.c
            boolean r4 = r4.isEmpty()
            r11 = 1
            r4 = r4 ^ r11
            goto L_0x0296
        L_0x0291:
            int r12 = r12 + 1
            r4 = r21
            goto L_0x0279
        L_0x0296:
            if (r4 == 0) goto L_0x029a
            r4 = 4
            goto L_0x029b
        L_0x029a:
            r4 = 0
        L_0x029b:
            if (r6 != 0) goto L_0x02a4
            r4 = r4 | 32
            r25 = r4
            r24 = r18
            goto L_0x02a8
        L_0x02a4:
            r25 = r4
            r24 = r21
        L_0x02a8:
            vd6 r4 = new vd6
            if (r10 == 0) goto L_0x02af
            r27 = r10
            goto L_0x02b3
        L_0x02af:
            k0d r6 = defpackage.k0d.v
            r27 = r6
        L_0x02b3:
            r28 = 0
            r23 = r4
            r26 = r3
            r23.<init>(r24, r25, r26, r27, r28)
            goto L_0x02e8
        L_0x02bd:
            r29 = r11
            r20 = r15
            ku9 r4 = new ku9
            r6 = 0
            r10 = 0
            r4.<init>(r6, r10)
            goto L_0x02e8
        L_0x02ca:
            r29 = r11
            r20 = r15
            r6 = 0
            ac r4 = new ac
            r4.<init>(r6)
            goto L_0x02e8
        L_0x02d5:
            r29 = r11
            r20 = r15
            q3 r4 = new q3
            r4.<init>()
            goto L_0x02e8
        L_0x02df:
            r29 = r11
            r20 = r15
            m3 r4 = new m3
            r4.<init>()
        L_0x02e8:
            r4.getClass()
            boolean r6 = r4.n(r8)     // Catch:{ EOFException -> 0x02f9, all -> 0x02f3 }
            r10 = 0
            r8.w = r10
            goto L_0x02fd
        L_0x02f3:
            r0 = move-exception
            r10 = 0
            r1 = r0
            r8.w = r10
            throw r1
        L_0x02f9:
            r10 = 0
            r8.w = r10
            r6 = r10
        L_0x02fd:
            if (r6 == 0) goto L_0x0319
            pv0 r1 = new pv0
            gze r2 = r5.b
            boolean r5 = r5.c
            r20 = r2
            ece r20 = (defpackage.ece) r20
            r22 = 0
            r16 = r1
            r17 = r4
            r18 = r7
            r19 = r3
            r21 = r5
            r16.<init>((java.lang.Object) r17, (java.lang.Object) r18, (java.lang.Object) r19, (java.lang.Object) r20, (boolean) r21, (int) r22)
            goto L_0x0351
        L_0x0319:
            if (r17 != 0) goto L_0x0327
            if (r14 == r9) goto L_0x0325
            if (r14 == r2) goto L_0x0325
            if (r14 == r1) goto L_0x0325
            r3 = 11
            if (r14 != r3) goto L_0x0327
        L_0x0325:
            r17 = r4
        L_0x0327:
            int r13 = r13 + 1
            r3 = r10
            r15 = r20
            r11 = r29
            r4 = 1
            r6 = 8
            r10 = 7
            goto L_0x01bc
        L_0x0334:
            r29 = r11
            r10 = 0
            pv0 r1 = new pv0
            r17.getClass()
            gze r2 = r5.b
            boolean r4 = r5.c
            r20 = r2
            ece r20 = (defpackage.ece) r20
            r22 = 0
            r16 = r1
            r18 = r7
            r19 = r3
            r21 = r4
            r16.<init>((java.lang.Object) r17, (java.lang.Object) r18, (java.lang.Object) r19, (java.lang.Object) r20, (boolean) r21, (int) r22)
        L_0x0351:
            r0.M0 = r1
            java.lang.Object r1 = r1.c
            tf5 r1 = (defpackage.tf5) r1
            tf5 r1 = r1.m()
            boolean r2 = r1 instanceof defpackage.ac
            if (r2 != 0) goto L_0x036e
            boolean r2 = r1 instanceof defpackage.m3
            if (r2 != 0) goto L_0x036e
            boolean r2 = r1 instanceof defpackage.q3
            if (r2 != 0) goto L_0x036e
            boolean r1 = r1 instanceof defpackage.ku9
            if (r1 == 0) goto L_0x036c
            goto L_0x036e
        L_0x036c:
            r1 = r10
            goto L_0x036f
        L_0x036e:
            r1 = 1
        L_0x036f:
            if (r1 == 0) goto L_0x03a5
            e27 r1 = r0.N0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r29 > r2 ? 1 : (r29 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0385
            rkf r2 = r0.D0
            r11 = r29
            long r2 = r2.b(r11)
            goto L_0x0387
        L_0x0385:
            long r2 = r0.x
        L_0x0387:
            long r4 = r1.e1
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x03c7
            r1.e1 = r2
            c27[] r1 = r1.E0
            int r4 = r1.length
            r6 = r10
        L_0x0393:
            if (r6 >= r4) goto L_0x03c7
            r5 = r1[r6]
            long r11 = r5.F
            int r7 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x03a2
            r5.F = r2
            r7 = 1
            r5.z = r7
        L_0x03a2:
            int r6 = r6 + 1
            goto L_0x0393
        L_0x03a5:
            e27 r1 = r0.N0
            long r2 = r1.e1
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x03c7
            r1.e1 = r4
            c27[] r1 = r1.E0
            int r2 = r1.length
            r6 = r10
        L_0x03b5:
            if (r6 >= r2) goto L_0x03c7
            r3 = r1[r6]
            long r11 = r3.F
            int r7 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x03c4
            r3.F = r4
            r7 = 1
            r3.z = r7
        L_0x03c4:
            int r6 = r6 + 1
            goto L_0x03b5
        L_0x03c7:
            e27 r1 = r0.N0
            java.util.HashSet r1 = r1.G0
            r1.clear()
            pv0 r1 = r0.M0
            e27 r2 = r0.N0
            java.lang.Object r1 = r1.c
            tf5 r1 = (defpackage.tf5) r1
            r1.U(r2)
            goto L_0x03db
        L_0x03da:
            r10 = r3
        L_0x03db:
            e27 r1 = r0.N0
            yv4 r2 = r1.f1
            yv4 r0 = r0.G0
            boolean r2 = defpackage.v0g.a(r2, r0)
            if (r2 != 0) goto L_0x0401
            r1.f1 = r0
            r3 = r10
        L_0x03ea:
            c27[] r2 = r1.E0
            int r4 = r2.length
            if (r3 >= r4) goto L_0x0401
            boolean[] r4 = r1.X0
            boolean r4 = r4[r3]
            if (r4 == 0) goto L_0x03fd
            r2 = r2[r3]
            r2.I = r0
            r4 = 1
            r2.z = r4
            goto L_0x03fe
        L_0x03fd:
            r4 = 1
        L_0x03fe:
            int r3 = r3 + 1
            goto L_0x03ea
        L_0x0401:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p07.g(j74, q74, boolean):hf4");
    }

    public final void load() {
        pv0 pv0;
        this.N0.getClass();
        if (this.M0 == null && (pv0 = this.A0) != null) {
            tf5 m = ((tf5) pv0.c).m();
            if ((m instanceof ntf) || (m instanceof vd6)) {
                this.M0 = this.A0;
                this.P0 = false;
            }
        }
        if (this.P0) {
            j74 j74 = this.y0;
            j74.getClass();
            q74 q74 = this.z0;
            q74.getClass();
            d(j74, q74, this.K0, false);
            this.O0 = 0;
            this.P0 = false;
        }
        if (!this.Q0) {
            if (!this.C0) {
                d(this.z, this.b, this.J0, true);
            }
            this.R0 = !this.Q0;
        }
    }
}
