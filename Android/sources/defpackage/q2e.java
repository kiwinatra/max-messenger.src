package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: q2e  reason: default package */
public final class q2e {
    public final ngf a;
    public final int b;
    public final boolean c = false;

    public q2e(int i, igf igf) {
        this.a = igf;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2e)) {
            return false;
        }
        q2e q2e = (q2e) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) q2e.a) && this.b == q2e.b && this.c == q2e.c;
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
