package defpackage;

import com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: h33  reason: default package */
public final class h33 implements lt8, jt8 {
    public final lt8 a;
    public jt8 b;
    public f33[] c = new f33[0];
    public long o;
    public long v;
    public long w;
    public ClippingMediaSource$IllegalClippingException x;

    public h33(lt8 lt8, boolean z, long j, long j2) {
        this.a = lt8;
        this.o = z ? j : -9223372036854775807L;
        this.v = j;
        this.w = j2;
    }

    public final void A(long j) {
        this.a.A(j);
    }

    public final long F(long j, tnd tnd) {
        long j2 = this.v;
        if (j == j2) {
            return j2;
        }
        long k = t0g.k(tnd.a, 0, j - j2);
        long j3 = this.w;
        long k2 = t0g.k(tnd.b, 0, j3 == Long.MIN_VALUE ? LongCompanionObject.MAX_VALUE : j3 - j);
        if (!(k == tnd.a && k2 == tnd.b)) {
            tnd = new tnd(k, k2);
        }
        return this.a.F(j, tnd);
    }

    public final boolean M(long j) {
        return this.a.M(j);
    }

    public final void S(jt8 jt8, long j) {
        this.b = jt8;
        this.a.S(this, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x011f, code lost:
        if (r1 > r3) goto L_0x0122;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long T(defpackage.ld5[] r16, boolean[] r17, defpackage.kcd[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            r10 = 1
            int r1 = r9.length
            f33[] r1 = new defpackage.f33[r1]
            r0.c = r1
            int r1 = r9.length
            kcd[] r11 = new defpackage.kcd[r1]
            r12 = 0
            r1 = r12
        L_0x0010:
            int r2 = r9.length
            r13 = 0
            if (r1 >= r2) goto L_0x0024
            f33[] r2 = r0.c
            r3 = r9[r1]
            f33 r3 = (defpackage.f33) r3
            r2[r1] = r3
            if (r3 == 0) goto L_0x0020
            kcd r13 = r3.a
        L_0x0020:
            r11[r1] = r13
            int r1 = r1 + r10
            goto L_0x0010
        L_0x0024:
            lt8 r1 = r0.a
            r2 = r16
            r3 = r17
            r4 = r11
            r5 = r19
            r6 = r20
            long r1 = r1.T(r2, r3, r4, r5, r6)
            boolean r3 = r15.a()
            if (r3 == 0) goto L_0x0104
            long r3 = r0.v
            int r5 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0104
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0104
            int r3 = r8.length
            r4 = r12
        L_0x0047:
            if (r4 >= r3) goto L_0x0104
            r5 = r8[r4]
            if (r5 == 0) goto L_0x0101
            ca6 r5 = r5.j()
            java.lang.String r6 = r5.Z
            java.util.ArrayList r7 = defpackage.uq9.a
            if (r6 != 0) goto L_0x0059
            goto L_0x00ff
        L_0x0059:
            r7 = -1
            int r14 = r6.hashCode()
            switch(r14) {
                case -2123537834: goto L_0x00da;
                case -432837260: goto L_0x00cf;
                case -432837259: goto L_0x00c4;
                case -53558318: goto L_0x00b9;
                case 187078296: goto L_0x00ae;
                case 187094639: goto L_0x00a3;
                case 1504578661: goto L_0x0098;
                case 1504619009: goto L_0x008d;
                case 1504831518: goto L_0x007f;
                case 1903231877: goto L_0x0071;
                case 1903589369: goto L_0x0063;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x00e4
        L_0x0063:
            java.lang.String r14 = "audio/g711-mlaw"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x006d
            goto L_0x00e4
        L_0x006d:
            r7 = 10
            goto L_0x00e4
        L_0x0071:
            java.lang.String r14 = "audio/g711-alaw"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x007b
            goto L_0x00e4
        L_0x007b:
            r7 = 9
            goto L_0x00e4
        L_0x007f:
            java.lang.String r14 = "audio/mpeg"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x0089
            goto L_0x00e4
        L_0x0089:
            r7 = 8
            goto L_0x00e4
        L_0x008d:
            java.lang.String r14 = "audio/flac"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x0096
            goto L_0x00e4
        L_0x0096:
            r7 = 7
            goto L_0x00e4
        L_0x0098:
            java.lang.String r14 = "audio/eac3"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x00a1
            goto L_0x00e4
        L_0x00a1:
            r7 = 6
            goto L_0x00e4
        L_0x00a3:
            java.lang.String r14 = "audio/raw"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x00ac
            goto L_0x00e4
        L_0x00ac:
            r7 = 5
            goto L_0x00e4
        L_0x00ae:
            java.lang.String r14 = "audio/ac3"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x00b7
            goto L_0x00e4
        L_0x00b7:
            r7 = 4
            goto L_0x00e4
        L_0x00b9:
            java.lang.String r14 = "audio/mp4a-latm"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x00c2
            goto L_0x00e4
        L_0x00c2:
            r7 = 3
            goto L_0x00e4
        L_0x00c4:
            java.lang.String r14 = "audio/mpeg-L2"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x00cd
            goto L_0x00e4
        L_0x00cd:
            r7 = 2
            goto L_0x00e4
        L_0x00cf:
            java.lang.String r14 = "audio/mpeg-L1"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x00d8
            goto L_0x00e4
        L_0x00d8:
            r7 = r10
            goto L_0x00e4
        L_0x00da:
            java.lang.String r14 = "audio/eac3-joc"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r7 = r12
        L_0x00e4:
            switch(r7) {
                case 0: goto L_0x0101;
                case 1: goto L_0x0101;
                case 2: goto L_0x0101;
                case 3: goto L_0x00e8;
                case 4: goto L_0x0101;
                case 5: goto L_0x0101;
                case 6: goto L_0x0101;
                case 7: goto L_0x0101;
                case 8: goto L_0x0101;
                case 9: goto L_0x0101;
                case 10: goto L_0x0101;
                default: goto L_0x00e7;
            }
        L_0x00e7:
            goto L_0x00ff
        L_0x00e8:
            java.lang.String r5 = r5.z
            if (r5 != 0) goto L_0x00ed
            goto L_0x00ff
        L_0x00ed:
            ft r5 = defpackage.uq9.e(r5)
            if (r5 != 0) goto L_0x00f4
            goto L_0x00ff
        L_0x00f4:
            int r5 = r5.b()
            if (r5 == 0) goto L_0x00ff
            r6 = 16
            if (r5 == r6) goto L_0x00ff
            goto L_0x0101
        L_0x00ff:
            r3 = r1
            goto L_0x0109
        L_0x0101:
            int r4 = r4 + r10
            goto L_0x0047
        L_0x0104:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0109:
            r0.o = r3
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L_0x0124
            long r3 = r0.v
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0122
            long r3 = r0.w
            r5 = -9223372036854775808
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x0124
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r3 = r12
            goto L_0x0125
        L_0x0124:
            r3 = r10
        L_0x0125:
            defpackage.y64.j(r3)
        L_0x0128:
            int r3 = r9.length
            if (r12 >= r3) goto L_0x014d
            r3 = r11[r12]
            if (r3 != 0) goto L_0x0134
            f33[] r3 = r0.c
            r3[r12] = r13
            goto L_0x0145
        L_0x0134:
            f33[] r4 = r0.c
            r5 = r4[r12]
            if (r5 == 0) goto L_0x013e
            kcd r5 = r5.a
            if (r5 == r3) goto L_0x0145
        L_0x013e:
            f33 r5 = new f33
            r5.<init>(r15, r3)
            r4[r12] = r5
        L_0x0145:
            f33[] r3 = r0.c
            r3 = r3[r12]
            r9[r12] = r3
            int r12 = r12 + r10
            goto L_0x0128
        L_0x014d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h33.T(ld5[], boolean[], kcd[], boolean[], long):long");
    }

    public final boolean a() {
        return this.o != -9223372036854775807L;
    }

    public final void b(psd psd) {
        lt8 lt8 = (lt8) psd;
        jt8 jt8 = this.b;
        jt8.getClass();
        jt8.b(this);
    }

    public final void c(lt8 lt8) {
        if (this.x == null) {
            jt8 jt8 = this.b;
            jt8.getClass();
            jt8.c(this);
        }
    }

    public final boolean d() {
        return this.a.d();
    }

    public final long i() {
        long i = this.a.i();
        if (i != Long.MIN_VALUE) {
            long j = this.w;
            if (j == Long.MIN_VALUE || i < j) {
                return i;
            }
        }
        return Long.MIN_VALUE;
    }

    public final void r() {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.x;
        if (clippingMediaSource$IllegalClippingException == null) {
            this.a.r();
            return;
        }
        throw clippingMediaSource$IllegalClippingException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 > r5) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long s(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.o = r0
            f33[] r0 = r5.c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x000c:
            if (r3 >= r1) goto L_0x0017
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0014
            r4.b = r2
        L_0x0014:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0017:
            lt8 r0 = r5.a
            long r0 = r0.s(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0033
            long r6 = r5.v
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0034
            long r5 = r5.w
            r3 = -9223372036854775808
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0033
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0034
        L_0x0033:
            r2 = 1
        L_0x0034:
            defpackage.y64.j(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h33.s(long):long");
    }

    public final long w() {
        if (a()) {
            long j = this.o;
            this.o = -9223372036854775807L;
            long w2 = w();
            return w2 != -9223372036854775807L ? w2 : j;
        }
        long w3 = this.a.w();
        if (w3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = false;
        y64.j(w3 >= this.v);
        long j2 = this.w;
        if (j2 == Long.MIN_VALUE || w3 <= j2) {
            z = true;
        }
        y64.j(z);
        return w3;
    }

    public final tpf x() {
        return this.a.x();
    }

    public final long y() {
        long y = this.a.y();
        if (y != Long.MIN_VALUE) {
            long j = this.w;
            if (j == Long.MIN_VALUE || y < j) {
                return y;
            }
        }
        return Long.MIN_VALUE;
    }

    public final void z(long j, boolean z) {
        this.a.z(j, z);
    }
}
