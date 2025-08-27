package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j49  reason: default package */
public final class j49 {
    public final List a;
    public final List b;
    public final List c;
    public final boolean d;
    public final boolean e;

    public j49(List list, ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2) {
        this.a = list;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j49)) {
            return false;
        }
        j49 j49 = (j49) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) j49.a) && Intrinsics.areEqual((Object) this.b, (Object) j49.b) && Intrinsics.areEqual((Object) this.c, (Object) j49.c) && this.d == j49.d && this.e == j49.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + g63.e(rae.i(this.c, rae.i(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(items=");
        sb.append(this.a);
        sb.append(", topActions=");
        sb.append(this.b);
        sb.append(", bottomAction=");
        sb.append(this.c);
        sb.append(", isSearch=");
        sb.append(this.d);
        sb.append(", isLoading=");
        return tr1.m(sb, this.e, ")");
    }
}
