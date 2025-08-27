package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: iwf  reason: default package */
public final class iwf {
    public final long a;
    public final w28 b;
    public final int c;

    public iwf(long j, w28 w28, int i) {
        this.a = j;
        this.b = w28;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwf)) {
            return false;
        }
        iwf iwf = (iwf) obj;
        return this.a == iwf.a && Intrinsics.areEqual((Object) this.b, (Object) iwf.b) && this.c == iwf.c;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        w28 w28 = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (w28 == null ? 0 : w28.hashCode())) * 31);
    }

    public final String toString() {
        return "UpdateAttachesEntity(id=" + this.a + ", attaches=" + this.b + ", mediaType=" + this.c + ")";
    }
}
