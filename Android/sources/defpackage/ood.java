package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* renamed from: ood  reason: default package */
public final class ood extends kod {
    public final l15 j;
    public final l15 k;
    public final long l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ood(dpc dpc, long j2, long j3, long j4, long j5, long j6, List list, long j7, l15 l15, l15 l152, long j8, long j9) {
        super(dpc, j2, j3, j4, j6, list, j7, j8, j9);
        this.j = l15;
        this.k = l152;
        this.l = j5;
    }

    public final dpc b(x2d x2d) {
        l15 l15 = this.j;
        if (l15 == null) {
            return (dpc) this.c;
        }
        ea6 ea6 = x2d.a;
        return new dpc(0, l15.i(ea6.i, 0, 0, ea6.a), -1);
    }

    public final long e(long j2) {
        List list = this.f;
        if (list != null) {
            return (long) list.size();
        }
        long j3 = this.l;
        if (j3 != -1) {
            return (j3 - this.d) + 1;
        }
        if (j2 == -9223372036854775807L) {
            return -1;
        }
        BigInteger multiply = BigInteger.valueOf(j2).multiply(BigInteger.valueOf(this.a));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = fn0.a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    public final dpc i(long j2, x2d x2d) {
        long j3 = this.d;
        List list = this.f;
        long j4 = list != null ? ((qod) list.get((int) (j2 - j3))).a : (j2 - j3) * this.e;
        ea6 ea6 = x2d.a;
        return new dpc(0, this.k.i(ea6.i, j2, j4, ea6.a), -1);
    }
}
