package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* renamed from: nod  reason: default package */
public final class nod extends jod {
    public final m7h j;
    public final m7h k;
    public final long l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nod(cpc cpc, long j2, long j3, long j4, long j5, long j6, List list, long j7, m7h m7h, m7h m7h2, long j8, long j9) {
        super(cpc, j2, j3, j4, j6, list, j7, j8, j9);
        this.j = m7h;
        this.k = m7h2;
        this.l = j5;
    }

    public final cpc a(w2d w2d) {
        m7h m7h = this.j;
        if (m7h == null) {
            return (cpc) this.c;
        }
        ca6 ca6 = w2d.a;
        return new cpc(0, m7h.b(ca6.y, 0, 0, ca6.a), -1);
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

    public final cpc i(long j2, w2d w2d) {
        long j3 = this.d;
        List list = this.f;
        long j4 = list != null ? ((pod) list.get((int) (j2 - j3))).a : (j2 - j3) * this.e;
        ca6 ca6 = w2d.a;
        return new cpc(0, this.k.b(ca6.y, j2, j4, ca6.a), -1);
    }
}
