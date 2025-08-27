package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zwf  reason: default package */
public final class zwf {
    public final long a;
    public final String b;
    public final List c;
    public final qe9 d;

    public zwf(long j, String str, List list, qe9 qe9) {
        this.a = j;
        this.b = str;
        this.c = list;
        this.d = qe9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwf)) {
            return false;
        }
        zwf zwf = (zwf) obj;
        return this.a == zwf.a && Intrinsics.areEqual((Object) this.b, (Object) zwf.b) && Intrinsics.areEqual((Object) this.c, (Object) zwf.c) && this.d == zwf.d;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return this.d.hashCode() + rae.i(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "UpdateTextEntity(id=" + this.a + ", text=" + this.b + ", elements=" + this.c + ", status=" + this.d + ")";
    }
}
