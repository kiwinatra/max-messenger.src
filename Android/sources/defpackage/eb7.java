package defpackage;

import java.math.BigInteger;
import kotlin.jvm.internal.LongCompanionObject;
import org.msgpack.core.MessageIntegerOverflowException;

/* renamed from: eb7  reason: default package */
public final class eb7 extends q1 implements pb7 {
    public static final BigInteger b = BigInteger.valueOf(-2147483648L);
    public static final BigInteger c = BigInteger.valueOf(2147483647L);
    public static final BigInteger o = BigInteger.valueOf(Long.MIN_VALUE);
    public static final BigInteger v = BigInteger.valueOf(LongCompanionObject.MAX_VALUE);
    public final BigInteger a;

    static {
        BigInteger.valueOf(-128);
        BigInteger.valueOf(127);
        BigInteger.valueOf(-32768);
        BigInteger.valueOf(32767);
    }

    public eb7(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    public final String b() {
        return this.a.toString();
    }

    public final long d() {
        return this.a.longValue();
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
        return this.a.equals(q1Var.l().n());
    }

    public final int f() {
        BigInteger bigInteger = b;
        BigInteger bigInteger2 = this.a;
        if (bigInteger2.compareTo(bigInteger) >= 0 && bigInteger2.compareTo(c) <= 0) {
            return bigInteger2.intValue();
        }
        throw new MessageIntegerOverflowException(bigInteger2);
    }

    public final int g() {
        return 3;
    }

    public final int hashCode() {
        long j;
        BigInteger bigInteger = b;
        BigInteger bigInteger2 = this.a;
        if (bigInteger.compareTo(bigInteger2) <= 0 && bigInteger2.compareTo(c) <= 0) {
            j = bigInteger2.longValue();
        } else if (o.compareTo(bigInteger2) > 0 || bigInteger2.compareTo(v) > 0) {
            return bigInteger2.hashCode();
        } else {
            long longValue = bigInteger2.longValue();
            j = longValue ^ (longValue >>> 32);
        }
        return (int) j;
    }

    public final pb7 l() {
        return this;
    }

    public final BigInteger n() {
        return this.a;
    }

    public final long o() {
        boolean p = p();
        BigInteger bigInteger = this.a;
        if (p) {
            return bigInteger.longValue();
        }
        throw new MessageIntegerOverflowException(bigInteger);
    }

    public final boolean p() {
        BigInteger bigInteger = o;
        BigInteger bigInteger2 = this.a;
        return bigInteger2.compareTo(bigInteger) >= 0 && bigInteger2.compareTo(v) <= 0;
    }

    public final pb7 q() {
        return this;
    }

    public final String toString() {
        return this.a.toString();
    }
}
