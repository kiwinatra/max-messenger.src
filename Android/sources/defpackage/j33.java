package defpackage;

import com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException;

/* renamed from: j33  reason: default package */
public final class j33 extends bc6 {
    public final long c;
    public final long o;
    public final long v;
    public final boolean w;

    public j33(ikf ikf, long j, long j2) {
        super(ikf);
        boolean z = false;
        if (ikf.i() == 1) {
            gkf n = ikf.n(0, new gkf(), 0);
            long max = Math.max(0, j);
            if (n.Z || max == 0 || n.y) {
                long max2 = j2 == Long.MIN_VALUE ? n.w0 : Math.max(0, j2);
                long j3 = n.w0;
                if (j3 != -9223372036854775807L) {
                    max2 = max2 > j3 ? j3 : max2;
                    if (max > max2) {
                        throw new ClippingMediaSource$IllegalClippingException(2);
                    }
                }
                this.c = max;
                this.o = max2;
                int i = (max2 > -9223372036854775807L ? 1 : (max2 == -9223372036854775807L ? 0 : -1));
                this.v = i == 0 ? -9223372036854775807L : max2 - max;
                if (n.z && (i == 0 || (j3 != -9223372036854775807L && max2 == j3))) {
                    z = true;
                }
                this.w = z;
                return;
            }
            throw new ClippingMediaSource$IllegalClippingException(1);
        }
        throw new ClippingMediaSource$IllegalClippingException(0);
    }

    public final dkf g(int i, dkf dkf, boolean z) {
        this.b.g(0, dkf, z);
        long j = dkf.v - this.c;
        long j2 = this.v;
        dkf.h(dkf.a, dkf.b, 0, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j, p9.w, false);
        return dkf;
    }

    public final gkf n(int i, gkf gkf, long j) {
        this.b.n(0, gkf, 0);
        long j2 = gkf.z0;
        long j3 = this.c;
        gkf.z0 = j2 + j3;
        gkf.w0 = this.v;
        gkf.z = this.w;
        long j4 = gkf.v0;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            gkf.v0 = max;
            long j5 = this.o;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            gkf.v0 = max - j3;
        }
        long M = t0g.M(j3);
        long j6 = gkf.v;
        if (j6 != -9223372036854775807L) {
            gkf.v = j6 + M;
        }
        long j7 = gkf.w;
        if (j7 != -9223372036854775807L) {
            gkf.w = j7 + M;
        }
        return gkf;
    }
}
