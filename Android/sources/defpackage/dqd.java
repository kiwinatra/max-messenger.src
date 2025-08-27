package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: dqd  reason: default package */
public final class dqd extends fqd {
    public final String b;
    public final long c;
    public final int d;

    public dqd(int i, String str, long j) {
        super(str);
        this.b = str;
        this.c = j;
        this.d = i;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqd)) {
            return false;
        }
        dqd dqd = (dqd) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) dqd.b) && this.c == dqd.c && this.d == dqd.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + wzf.i(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Neuro(uri=");
        sb.append(this.b);
        sb.append(", photoId=");
        sb.append(this.c);
        sb.append(", categoryId=");
        return wj6.l(sb, this.d, ")");
    }
}
