package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;

/* renamed from: m33  reason: default package */
public final class m33 extends sqg {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final ArrayList q;
    public final hkf r;
    public k33 s;
    public ClippingMediaSource$IllegalClippingException t;
    public long u;
    public long v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m33(yj0 yj0, long j, long j2, boolean z, boolean z2, boolean z3) {
        super(yj0);
        yj0.getClass();
        n79.g(j >= 0);
        this.l = j;
        this.m = j2;
        this.n = z;
        this.o = z2;
        this.p = z3;
        this.q = new ArrayList();
        this.r = new hkf();
    }

    public final void A(jkf jkf) {
        if (this.t == null) {
            C(jkf);
        }
    }

    public final void C(jkf jkf) {
        long j;
        long j2;
        long j3;
        hkf hkf = this.r;
        jkf.o(0, hkf);
        long j4 = hkf.p;
        k33 k33 = this.s;
        ArrayList arrayList = this.q;
        long j5 = this.m;
        long j6 = Long.MIN_VALUE;
        if (k33 == null || arrayList.isEmpty() || this.o) {
            boolean z = this.p;
            long j7 = this.l;
            if (z) {
                long j8 = hkf.l;
                j7 += j8;
                j3 = j8 + j5;
            } else {
                j3 = j5;
            }
            this.u = j4 + j7;
            if (j5 != Long.MIN_VALUE) {
                j6 = j4 + j3;
            }
            this.v = j6;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                i33 i33 = (i33) arrayList.get(i);
                long j9 = this.u;
                long j10 = this.v;
                i33.v = j9;
                i33.w = j10;
            }
            j2 = j7;
            j = j3;
        } else {
            long j11 = this.u - j4;
            if (j5 != Long.MIN_VALUE) {
                j6 = this.v - j4;
            }
            j = j6;
            j2 = j11;
        }
        try {
            k33 k332 = new k33(jkf, j2, j);
            this.s = k332;
            n(k332);
        } catch (ClippingMediaSource$IllegalClippingException e) {
            this.t = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((i33) arrayList.get(i2)).x = this.t;
            }
        }
    }

    public final boolean a(ir8 ir8) {
        yj0 yj0 = this.k;
        return yj0.i().e.equals(ir8.e) && yj0.a(ir8);
    }

    public final mt8 c(nz8 nz8, cb4 cb4, long j) {
        i33 i33 = new i33(this.k.c(nz8, cb4, j), this.n, this.u, this.v);
        this.q.add(i33);
        return i33;
    }

    public final void k() {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.t;
        if (clippingMediaSource$IllegalClippingException == null) {
            super.k();
            return;
        }
        throw clippingMediaSource$IllegalClippingException;
    }

    public final void o(mt8 mt8) {
        ArrayList arrayList = this.q;
        n79.n(arrayList.remove(mt8));
        this.k.o(((i33) mt8).a);
        if (arrayList.isEmpty() && !this.o) {
            k33 k33 = this.s;
            k33.getClass();
            C(k33.e);
        }
    }

    public final void q() {
        super.q();
        this.t = null;
        this.s = null;
    }
}
