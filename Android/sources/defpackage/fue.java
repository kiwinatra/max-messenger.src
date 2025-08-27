package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fue  reason: default package */
public final class fue {
    public final List a;
    public final boolean b;

    public fue(int i, boolean z, List list) {
        list = (i & 1) != 0 ? null : list;
        z = (i & 2) != 0 ? false : z;
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fue)) {
            return false;
        }
        fue fue = (fue) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) fue.a) && this.b == fue.b;
    }

    public final int hashCode() {
        List list = this.a;
        return Boolean.hashCode(this.b) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "SearchState(sets=" + this.a + ", loading=" + this.b + ")";
    }
}
