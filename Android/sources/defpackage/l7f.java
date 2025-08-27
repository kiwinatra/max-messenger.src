package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: l7f  reason: default package */
public final class l7f {
    public final String a;
    public final int b;
    public final int c;

    public l7f(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7f)) {
            return false;
        }
        l7f l7f = (l7f) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) l7f.a) && this.b == l7f.b && this.c == l7f.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + rae.h(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return tr1.k(sb, this.c, ')');
    }
}
