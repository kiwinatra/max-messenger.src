package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: yjf  reason: default package */
public final class yjf {
    public final Object a;
    public final long b;
    public final TimeUnit c;

    public yjf(Object obj, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(obj, "value is null");
        this.a = obj;
        this.b = j;
        Objects.requireNonNull(timeUnit, "unit is null");
        this.c = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yjf)) {
            return false;
        }
        yjf yjf = (yjf) obj;
        return Objects.equals(this.a, yjf.a) && this.b == yjf.b && Objects.equals(this.c, yjf.c);
    }

    public final int hashCode() {
        long j = this.b;
        return this.c.hashCode() + (((this.a.hashCode() * 31) + ((int) (j ^ (j >>> 31)))) * 31);
    }

    public final String toString() {
        return "Timed[time=" + this.b + ", unit=" + this.c + ", value=" + this.a + "]";
    }
}
