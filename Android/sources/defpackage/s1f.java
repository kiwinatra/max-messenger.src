package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: s1f  reason: default package */
public final class s1f {
    public final tze a;
    public final boolean b;

    public s1f(tze tze, boolean z) {
        this.a = tze;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1f)) {
            return false;
        }
        s1f s1f = (s1f) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) s1f.a) && this.b == s1f.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Item(suggest=");
        sb.append(this.a);
        sb.append(", fromContacts=");
        return tr1.m(sb, this.b, ")");
    }
}
