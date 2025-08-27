package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: wzd  reason: default package */
public final class wzd {
    public final ngf a;
    public final int b;
    public final boolean c;

    public wzd(igf igf, int i, boolean z) {
        this.a = igf;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzd)) {
            return false;
        }
        wzd wzd = (wzd) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) wzd.a) && this.b == wzd.b && this.c == wzd.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rae.h(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(title=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", isNegative=");
        return tr1.m(sb, this.c, ")");
    }
}
