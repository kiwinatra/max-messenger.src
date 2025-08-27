package defpackage;

import java.math.BigInteger;
import org.msgpack.core.MessageIntegerOverflowException;

/* renamed from: ub7  reason: default package */
public final class ub7 extends q1 implements pb7 {
    public final long a;

    public ub7(long j) {
        this.a = j;
    }

    public final String b() {
        return Long.toString(this.a);
    }

    public final long d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c1g)) {
            return false;
        }
        q1 q1Var = (q1) ((c1g) obj);
        if (q1Var.g() != 3) {
            return false;
        }
        pb7 l = q1Var.l();
        if (!l.p()) {
            return false;
        }
        return this.a == l.d();
    }

    public final int f() {
        long j = this.a;
        if (-2147483648L <= j && j <= 2147483647L) {
            return (int) j;
        }
        throw new MessageIntegerOverflowException(BigInteger.valueOf(j));
    }

    public final int g() {
        return 3;
    }

    public final int hashCode() {
        long j = this.a;
        return (-2147483648L > j || j > 2147483647L) ? (int) ((j >>> 32) ^ j) : (int) j;
    }

    public final pb7 l() {
        return this;
    }

    public final BigInteger n() {
        return BigInteger.valueOf(this.a);
    }

    public final long o() {
        return this.a;
    }

    public final boolean p() {
        return true;
    }

    public final pb7 q() {
        return this;
    }

    public final String toString() {
        return Long.toString(this.a);
    }
}
