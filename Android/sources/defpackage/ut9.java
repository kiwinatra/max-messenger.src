package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ut9  reason: default package */
public final class ut9 extends te8 {
    public final long i;
    public final TimeUnit j;

    public ut9(long j2, TimeUnit timeUnit) {
        this.i = j2;
        this.j = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut9)) {
            return false;
        }
        ut9 ut9 = (ut9) obj;
        return this.i == ut9.i && this.j == ut9.j;
    }

    public final int hashCode() {
        return this.j.hashCode() + (Long.hashCode(this.i) * 31);
    }

    public final String toString() {
        return "Value(value=" + this.i + ", timeUnit=" + this.j + ")";
    }
}
