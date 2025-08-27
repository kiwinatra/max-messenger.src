package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: wt9  reason: default package */
public final class wt9 extends yt9 {
    public final long a;
    public final TimeUnit b;

    public wt9(long j, TimeUnit timeUnit) {
        this.a = j;
        this.b = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt9)) {
            return false;
        }
        wt9 wt9 = (wt9) obj;
        return this.a == wt9.a && this.b == wt9.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Defined(position=" + this.a + ", timeUnit=" + this.b + ")";
    }
}
