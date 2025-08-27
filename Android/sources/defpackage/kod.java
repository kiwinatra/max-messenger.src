package defpackage;

import java.math.RoundingMode;
import java.util.List;

/* renamed from: kod  reason: default package */
public abstract class kod extends tod {
    public final long d;
    public final long e;
    public final List f;
    public final long g;
    public final long h;
    public final long i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kod(dpc dpc, long j, long j2, long j3, long j4, List list, long j5, long j6, long j7) {
        super(dpc, j, j2);
        this.d = j3;
        this.e = j4;
        this.f = list;
        this.i = j5;
        this.g = j6;
        this.h = j7;
    }

    public final long c(long j, long j2) {
        long e2 = e(j);
        return e2 != -1 ? e2 : (long) ((int) (g((j2 - this.h) + this.i, j) - d(j, j2)));
    }

    public final long d(long j, long j2) {
        int i2 = (e(j) > -1 ? 1 : (e(j) == -1 ? 0 : -1));
        long j3 = this.d;
        if (i2 == 0) {
            long j4 = this.g;
            if (j4 != -9223372036854775807L) {
                return Math.max(j3, g((j2 - this.h) - j4, j));
            }
        }
        return j3;
    }

    public abstract long e(long j);

    public final long f(long j, long j2) {
        long j3 = this.a;
        long j4 = this.d;
        List list = this.f;
        if (list != null) {
            return (((qod) list.get((int) (j - j4))).b * 1000000) / j3;
        }
        long e2 = e(j2);
        return (e2 == -1 || j != (j4 + e2) - 1) ? (this.e * 1000000) / j3 : j2 - h(j);
    }

    public final long g(long j, long j2) {
        long e2 = e(j2);
        int i2 = (e2 > 0 ? 1 : (e2 == 0 ? 0 : -1));
        long j3 = this.d;
        if (i2 == 0) {
            return j3;
        }
        if (this.f == null) {
            long j4 = (j / ((this.e * 1000000) / this.a)) + j3;
            return j4 < j3 ? j3 : e2 == -1 ? j4 : Math.min(j4, (j3 + e2) - 1);
        }
        long j5 = (e2 + j3) - 1;
        long j6 = j3;
        while (j6 <= j5) {
            long j7 = ((j5 - j6) / 2) + j6;
            int i3 = (h(j7) > j ? 1 : (h(j7) == j ? 0 : -1));
            if (i3 < 0) {
                j6 = j7 + 1;
            } else if (i3 <= 0) {
                return j7;
            } else {
                j5 = j7 - 1;
            }
        }
        return j6 == j3 ? j6 : j5;
    }

    public final long h(long j) {
        long j2 = this.d;
        List list = this.f;
        long j3 = list != null ? ((qod) list.get((int) (j - j2))).a - this.b : (j - j2) * this.e;
        int i2 = v0g.a;
        return v0g.a0(j3, 1000000, this.a, RoundingMode.FLOOR);
    }

    public abstract dpc i(long j, x2d x2d);

    public boolean j() {
        return this.f != null;
    }
}
