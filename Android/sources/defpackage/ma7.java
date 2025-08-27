package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.image.ImageDecoderException;
import java.util.ArrayDeque;

/* renamed from: ma7  reason: default package */
public final class ma7 extends pk0 {
    public final d97 A0;
    public final ba4 B0 = new ba4(0);
    public final ArrayDeque C0 = new ArrayDeque();
    public boolean D0;
    public boolean E0;
    public la7 F0 = la7.c;
    public long G0 = -9223372036854775807L;
    public long H0 = -9223372036854775807L;
    public int I0 = 0;
    public int J0 = 1;
    public ea6 K0;
    public co0 L0;
    public ba4 M0;
    public w97 N0 = w97.a;
    public Bitmap O0;
    public boolean P0;
    public gv1 Q0;
    public gv1 R0;
    public int S0;

    public ma7(vs6 vs6) {
        super(4);
        this.A0 = vs6;
    }

    public final int D(ea6 ea6) {
        return ((vs6) this.A0).x(ea6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0141, code lost:
        if (r14.a == ((r0.J * r1.I) - 1)) goto L_0x0143;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean F(long r13) {
        /*
            r12 = this;
            android.graphics.Bitmap r0 = r12.O0
            r1 = 0
            if (r0 == 0) goto L_0x000a
            gv1 r2 = r12.Q0
            if (r2 != 0) goto L_0x000a
            return r1
        L_0x000a:
            int r2 = r12.J0
            r3 = 2
            if (r2 != 0) goto L_0x0014
            int r2 = r12.y
            if (r2 == r3) goto L_0x0014
            return r1
        L_0x0014:
            java.util.ArrayDeque r2 = r12.C0
            r4 = 3
            r5 = 1
            if (r0 != 0) goto L_0x005b
            co0 r0 = r12.L0
            defpackage.n79.o(r0)
            co0 r0 = r12.L0
            ca4 r0 = r0.d()
            bo0 r0 = (defpackage.bo0) r0
            if (r0 != 0) goto L_0x002a
            return r1
        L_0x002a:
            r6 = 4
            boolean r6 = r0.h(r6)
            if (r6 == 0) goto L_0x004d
            int r13 = r12.I0
            if (r13 != r4) goto L_0x0041
            r12.I()
            ea6 r13 = r12.K0
            defpackage.n79.o(r13)
            r12.H()
            goto L_0x004c
        L_0x0041:
            r0.A()
            boolean r13 = r2.isEmpty()
            if (r13 == 0) goto L_0x004c
            r12.E0 = r5
        L_0x004c:
            return r1
        L_0x004d:
            android.graphics.Bitmap r6 = r0.v
            java.lang.String r7 = "Non-EOS buffer came back from the decoder without bitmap."
            defpackage.n79.p(r6, r7)
            android.graphics.Bitmap r6 = r0.v
            r12.O0 = r6
            r0.A()
        L_0x005b:
            boolean r0 = r12.P0
            if (r0 == 0) goto L_0x014c
            android.graphics.Bitmap r0 = r12.O0
            if (r0 == 0) goto L_0x014c
            gv1 r0 = r12.Q0
            if (r0 == 0) goto L_0x014c
            ea6 r0 = r12.K0
            defpackage.n79.o(r0)
            ea6 r0 = r12.K0
            int r6 = r0.I
            int r0 = r0.J
            if (r6 != r5) goto L_0x0076
            if (r0 == r5) goto L_0x007d
        L_0x0076:
            r7 = -1
            if (r6 == r7) goto L_0x007d
            if (r0 == r7) goto L_0x007d
            r0 = r5
            goto L_0x007e
        L_0x007d:
            r0 = r1
        L_0x007e:
            gv1 r6 = r12.Q0
            java.lang.Object r7 = r6.c
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            if (r7 == 0) goto L_0x0087
            goto L_0x00c3
        L_0x0087:
            if (r0 == 0) goto L_0x00bc
            android.graphics.Bitmap r7 = r12.O0
            defpackage.n79.o(r7)
            android.graphics.Bitmap r7 = r12.O0
            int r7 = r7.getWidth()
            ea6 r8 = r12.K0
            defpackage.n79.o(r8)
            int r8 = r8.I
            int r7 = r7 / r8
            android.graphics.Bitmap r8 = r12.O0
            int r8 = r8.getHeight()
            ea6 r9 = r12.K0
            defpackage.n79.o(r9)
            int r9 = r9.J
            int r8 = r8 / r9
            ea6 r9 = r12.K0
            int r9 = r9.I
            int r10 = r6.a
            int r11 = r10 % r9
            int r11 = r11 * r7
            int r10 = r10 / r9
            int r10 = r10 * r8
            android.graphics.Bitmap r9 = r12.O0
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r9, r11, r10, r7, r8)
            goto L_0x00c1
        L_0x00bc:
            android.graphics.Bitmap r7 = r12.O0
            defpackage.n79.o(r7)
        L_0x00c1:
            r6.c = r7
        L_0x00c3:
            gv1 r6 = r12.Q0
            java.lang.Object r6 = r6.c
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            defpackage.n79.o(r6)
            gv1 r6 = r12.Q0
            long r6 = r6.b
            long r6 = r6 - r13
            int r13 = r12.y
            if (r13 != r3) goto L_0x00d7
            r13 = r5
            goto L_0x00d8
        L_0x00d7:
            r13 = r1
        L_0x00d8:
            int r14 = r12.J0
            if (r14 == 0) goto L_0x00e9
            if (r14 == r5) goto L_0x00e8
            if (r14 != r4) goto L_0x00e2
            r13 = r1
            goto L_0x00e9
        L_0x00e2:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x00e8:
            r13 = r5
        L_0x00e9:
            if (r13 != 0) goto L_0x00f4
            r13 = 30000(0x7530, double:1.4822E-319)
            int r13 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r13 >= 0) goto L_0x00f2
            goto L_0x00f4
        L_0x00f2:
            r13 = r1
            goto L_0x00fe
        L_0x00f4:
            w97 r13 = r12.N0
            la7 r14 = r12.F0
            long r6 = r14.b
            r13.getClass()
            r13 = r5
        L_0x00fe:
            if (r13 != 0) goto L_0x0101
            return r1
        L_0x0101:
            gv1 r13 = r12.Q0
            defpackage.n79.o(r13)
            long r13 = r13.b
            r12.G0 = r13
        L_0x010a:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0125
            java.lang.Object r1 = r2.peek()
            la7 r1 = (defpackage.la7) r1
            long r6 = r1.a
            int r1 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0125
            java.lang.Object r1 = r2.removeFirst()
            la7 r1 = (defpackage.la7) r1
            r12.F0 = r1
            goto L_0x010a
        L_0x0125:
            r12.J0 = r4
            r13 = 0
            if (r0 == 0) goto L_0x0143
            gv1 r14 = r12.Q0
            defpackage.n79.o(r14)
            ea6 r0 = r12.K0
            defpackage.n79.o(r0)
            ea6 r1 = r12.K0
            defpackage.n79.o(r1)
            int r1 = r1.I
            int r0 = r0.J
            int r0 = r0 * r1
            int r0 = r0 - r5
            int r14 = r14.a
            if (r14 != r0) goto L_0x0145
        L_0x0143:
            r12.O0 = r13
        L_0x0145:
            gv1 r14 = r12.R0
            r12.Q0 = r14
            r12.R0 = r13
            return r5
        L_0x014c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ma7.F(long):boolean");
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [gv1, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0104, code lost:
        if (r2 == false) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean G(long r13) {
        /*
            r12 = this;
            boolean r0 = r12.P0
            r1 = 0
            if (r0 == 0) goto L_0x000a
            gv1 r0 = r12.Q0
            if (r0 == 0) goto L_0x000a
            return r1
        L_0x000a:
            ox0 r0 = r12.c
            r0.u()
            co0 r2 = r12.L0
            if (r2 == 0) goto L_0x0149
            int r3 = r12.I0
            r4 = 3
            if (r3 == r4) goto L_0x0149
            boolean r3 = r12.D0
            if (r3 == 0) goto L_0x001e
            goto L_0x0149
        L_0x001e:
            ba4 r3 = r12.M0
            if (r3 != 0) goto L_0x002d
            java.lang.Object r2 = r2.f()
            ba4 r2 = (defpackage.ba4) r2
            r12.M0 = r2
            if (r2 != 0) goto L_0x002d
            return r1
        L_0x002d:
            int r2 = r12.I0
            r3 = 2
            r5 = 0
            r6 = 4
            if (r2 != r3) goto L_0x004c
            ba4 r13 = r12.M0
            defpackage.n79.o(r13)
            ba4 r13 = r12.M0
            r13.b = r6
            co0 r13 = r12.L0
            defpackage.n79.o(r13)
            ba4 r14 = r12.M0
            r13.c(r14)
            r12.M0 = r5
            r12.I0 = r4
            return r1
        L_0x004c:
            ba4 r2 = r12.M0
            int r2 = r12.y(r0, r2, r1)
            r4 = -5
            r7 = 1
            if (r2 == r4) goto L_0x013d
            r0 = -4
            if (r2 == r0) goto L_0x0063
            r12 = -3
            if (r2 != r12) goto L_0x005d
            return r1
        L_0x005d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x0063:
            ba4 r0 = r12.M0
            r0.C()
            ba4 r0 = r12.M0
            java.nio.ByteBuffer r0 = r0.v
            defpackage.n79.o(r0)
            int r0 = r0.remaining()
            if (r0 > 0) goto L_0x0083
            ba4 r0 = r12.M0
            defpackage.n79.o(r0)
            boolean r0 = r0.h(r6)
            if (r0 == 0) goto L_0x0081
            goto L_0x0083
        L_0x0081:
            r0 = r1
            goto L_0x0084
        L_0x0083:
            r0 = r7
        L_0x0084:
            if (r0 == 0) goto L_0x0095
            co0 r2 = r12.L0
            defpackage.n79.o(r2)
            ba4 r3 = r12.M0
            defpackage.n79.o(r3)
            r2.c(r3)
            r12.S0 = r1
        L_0x0095:
            ba4 r2 = r12.M0
            defpackage.n79.o(r2)
            boolean r3 = r2.h(r6)
            if (r3 == 0) goto L_0x00a4
            r12.P0 = r7
            goto L_0x010d
        L_0x00a4:
            gv1 r3 = new gv1
            int r4 = r12.S0
            long r8 = r2.x
            r3.<init>()
            r3.a = r4
            r3.b = r8
            r12.R0 = r3
            int r2 = r4 + 1
            r12.S0 = r2
            boolean r2 = r12.P0
            if (r2 != 0) goto L_0x0107
            r2 = 30000(0x7530, double:1.4822E-319)
            long r10 = r8 - r2
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 > 0) goto L_0x00ca
            long r2 = r2 + r8
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x00ca
            r2 = r7
            goto L_0x00cb
        L_0x00ca:
            r2 = r1
        L_0x00cb:
            gv1 r3 = r12.Q0
            if (r3 == 0) goto L_0x00db
            long r10 = r3.b
            int r3 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r3 > 0) goto L_0x00db
            int r13 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r13 >= 0) goto L_0x00db
            r13 = r7
            goto L_0x00dc
        L_0x00db:
            r13 = r1
        L_0x00dc:
            ea6 r14 = r12.K0
            defpackage.n79.o(r14)
            int r14 = r14.I
            r3 = -1
            if (r14 == r3) goto L_0x00f5
            ea6 r14 = r12.K0
            int r8 = r14.J
            if (r8 == r3) goto L_0x00f5
            int r14 = r14.I
            int r8 = r8 * r14
            int r8 = r8 - r7
            if (r4 != r8) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r14 = r1
            goto L_0x00f6
        L_0x00f5:
            r14 = r7
        L_0x00f6:
            if (r2 != 0) goto L_0x00ff
            if (r13 != 0) goto L_0x00ff
            if (r14 == 0) goto L_0x00fd
            goto L_0x00ff
        L_0x00fd:
            r14 = r1
            goto L_0x0100
        L_0x00ff:
            r14 = r7
        L_0x0100:
            r12.P0 = r14
            if (r13 == 0) goto L_0x0107
            if (r2 != 0) goto L_0x0107
            goto L_0x010d
        L_0x0107:
            gv1 r13 = r12.R0
            r12.Q0 = r13
            r12.R0 = r5
        L_0x010d:
            ba4 r13 = r12.M0
            defpackage.n79.o(r13)
            boolean r13 = r13.h(r6)
            if (r13 == 0) goto L_0x011d
            r12.D0 = r7
            r12.M0 = r5
            return r1
        L_0x011d:
            long r13 = r12.H0
            ba4 r1 = r12.M0
            defpackage.n79.o(r1)
            long r1 = r1.x
            long r13 = java.lang.Math.max(r13, r1)
            r12.H0 = r13
            if (r0 == 0) goto L_0x0131
            r12.M0 = r5
            goto L_0x0139
        L_0x0131:
            ba4 r13 = r12.M0
            defpackage.n79.o(r13)
            r13.z()
        L_0x0139:
            boolean r12 = r12.P0
            r12 = r12 ^ r7
            return r12
        L_0x013d:
            java.lang.Object r13 = r0.b
            ea6 r13 = (defpackage.ea6) r13
            defpackage.n79.o(r13)
            r12.K0 = r13
            r12.I0 = r3
            return r7
        L_0x0149:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ma7.G(long):boolean");
    }

    public final void H() {
        ea6 ea6 = this.K0;
        vs6 vs6 = (vs6) this.A0;
        int x = vs6.x(ea6);
        if (x == pk0.b(4, 0, 0, 0) || x == pk0.b(3, 0, 0, 0)) {
            co0 co0 = this.L0;
            if (co0 != null) {
                co0.release();
            }
            this.L0 = new co0((fm0) vs6.b);
            return;
        }
        throw g(new Exception("Provided decoder factory can't create decoder for format."), this.K0, false, 4005);
    }

    public final void I() {
        this.M0 = null;
        this.I0 = 0;
        this.H0 = -9223372036854775807L;
        co0 co0 = this.L0;
        if (co0 != null) {
            co0.release();
            this.L0 = null;
        }
    }

    public final void a(int i, Object obj) {
        if (i == 15) {
            w97 w97 = obj instanceof w97 ? (w97) obj : null;
            if (w97 == null) {
                w97 = w97.a;
            }
            this.N0 = w97;
        }
    }

    public final String l() {
        return "ImageRenderer";
    }

    public final boolean n() {
        return this.E0;
    }

    public final boolean p() {
        int i = this.J0;
        return i == 3 || (i == 0 && this.P0);
    }

    public final void q() {
        this.K0 = null;
        this.F0 = la7.c;
        this.C0.clear();
        I();
        this.N0.getClass();
    }

    public final void r(boolean z, boolean z2) {
        this.J0 = z2 ? 1 : 0;
    }

    public final void s(long j, boolean z) {
        this.J0 = Math.min(this.J0, 1);
        this.E0 = false;
        this.D0 = false;
        this.O0 = null;
        this.Q0 = null;
        this.R0 = null;
        this.P0 = false;
        this.M0 = null;
        co0 co0 = this.L0;
        if (co0 != null) {
            co0.flush();
        }
        this.C0.clear();
    }

    public final void t() {
        I();
    }

    public final void u() {
        I();
        this.J0 = Math.min(this.J0, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r2 >= r7) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(defpackage.ea6[] r6, long r7, long r9) {
        /*
            r5 = this;
            la7 r6 = r5.F0
            long r6 = r6.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x0031
            java.util.ArrayDeque r6 = r5.C0
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x0026
            long r7 = r5.H0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0031
            long r2 = r5.G0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x0026
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x0026
            goto L_0x0031
        L_0x0026:
            la7 r7 = new la7
            long r0 = r5.H0
            r7.<init>(r0, r9)
            r6.add(r7)
            goto L_0x0038
        L_0x0031:
            la7 r6 = new la7
            r6.<init>(r0, r9)
            r5.F0 = r6
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ma7.x(ea6[], long, long):void");
    }

    public final void z(long j, long j2) {
        if (!this.E0) {
            if (this.K0 == null) {
                ox0 ox0 = this.c;
                ox0.u();
                ba4 ba4 = this.B0;
                ba4.z();
                int y = y(ox0, ba4, 2);
                if (y == -5) {
                    ea6 ea6 = (ea6) ox0.b;
                    n79.o(ea6);
                    this.K0 = ea6;
                    H();
                } else if (y == -4) {
                    n79.n(ba4.h(4));
                    this.D0 = true;
                    this.E0 = true;
                    return;
                } else {
                    return;
                }
            }
            try {
                Trace.beginSection("drainAndFeedDecoder");
                while (F(j)) {
                }
                while (G(j)) {
                }
                Trace.endSection();
            } catch (ImageDecoderException e) {
                throw g(e, (ea6) null, false, 4003);
            }
        }
    }
}
