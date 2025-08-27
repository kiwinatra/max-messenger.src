package defpackage;

import kotlin.time.Duration;

/* renamed from: hl  reason: default package */
public final class hl {
    public final long a;

    public hl(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hl) && Duration.m1358equalsimpl0(this.a, ((hl) obj).a);
    }

    public final int hashCode() {
        return Duration.m1381hashCodeimpl(this.a);
    }

    public final String toString() {
        return wj6.k("AnrConfig(timeout=", Duration.m1402toStringimpl(this.a), ")");
    }
}
