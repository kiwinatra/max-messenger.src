package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* renamed from: ksg  reason: default package */
public final class ksg {
    public final mq9 a;
    public final long b;
    public long c = SystemClock.elapsedRealtime();

    public ksg(long j, mq9 mq9) {
        this.a = mq9;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ksg.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((ksg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
