package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;

/* renamed from: l33  reason: default package */
public final class l33 extends rc3 {
    public final xj0 k;
    public final long l = 0;
    public final long m;
    public final boolean n;
    public final ArrayList o;
    public final gkf p;
    public j33 q;
    public ClippingMediaSource$IllegalClippingException r;
    public long s;
    public long t;

    public l33(h8c h8c, long j) {
        this.k = h8c;
        this.m = j;
        this.n = true;
        this.o = new ArrayList();
        this.p = new gkf();
    }

    public final lt8 a(mz8 mz8, cb4 cb4, long j) {
        h33 h33 = new h33(this.k.a(mz8, cb4, j), this.n, this.s, this.t);
        this.o.add(h33);
        return h33;
    }

    public final gr8 f() {
        return this.k.f();
    }

    public final void g() {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.r;
        if (clippingMediaSource$IllegalClippingException == null) {
            super.g();
            return;
        }
        throw clippingMediaSource$IllegalClippingException;
    }

    public final void i(arf arf) {
        this.j = arf;
        this.i = t0g.m((Handler.Callback) null);
        r((Integer) null, this.k);
    }

    public final void k(lt8 lt8) {
        ArrayList arrayList = this.o;
        y64.j(arrayList.remove(lt8));
        this.k.k(((h33) lt8).a);
        if (arrayList.isEmpty()) {
            j33 j33 = this.q;
            j33.getClass();
            s(j33.b);
        }
    }

    public final void m() {
        super.m();
        this.r = null;
        this.q = null;
    }

    public final void q(Integer num, xj0 xj0, ikf ikf) {
        Void voidR = (Void) num;
        if (this.r == null) {
            s(ikf);
        }
    }

    public final void s(ikf ikf) {
        long j;
        gkf gkf = this.p;
        ikf.o(0, gkf);
        long j2 = gkf.z0;
        j33 j33 = this.q;
        ArrayList arrayList = this.o;
        long j3 = this.m;
        long j4 = Long.MIN_VALUE;
        if (j33 == null || arrayList.isEmpty()) {
            j = this.l;
            this.s = j2 + j;
            if (j3 != Long.MIN_VALUE) {
                j4 = j2 + j3;
            }
            this.t = j4;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                h33 h33 = (h33) arrayList.get(i);
                long j5 = this.s;
                long j6 = this.t;
                h33.v = j5;
                h33.w = j6;
            }
        } else {
            j = this.s - j2;
            if (j3 != Long.MIN_VALUE) {
                j4 = this.t - j2;
            }
            j3 = j4;
        }
        try {
            j33 j332 = new j33(ikf, j, j3);
            this.q = j332;
            j(j332);
        } catch (ClippingMediaSource$IllegalClippingException e) {
            this.r = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((h33) arrayList.get(i2)).x = this.r;
            }
        }
    }
}
