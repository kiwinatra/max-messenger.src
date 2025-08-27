package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: za9  reason: default package */
public final class za9 implements fb9 {
    public final Collection a;
    public final boolean b;

    public za9(Set set, boolean z) {
        this.a = set;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za9)) {
            return false;
        }
        za9 za9 = (za9) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) za9.a) && this.b == za9.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Add(messageIds=");
        sb.append(this.a);
        sb.append(", isSelf=");
        return tr1.m(sb, this.b, ")");
    }
}
