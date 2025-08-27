package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y8f  reason: default package */
public final class y8f {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    public y8f(String str, boolean z, List list, List list2) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        Collection collection = list2;
        boolean isEmpty = collection.isEmpty();
        ArrayList arrayList = collection;
        if (isEmpty) {
            int size = list.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList2.add("ASC");
            }
            arrayList = arrayList2;
        }
        this.d = (List) arrayList;
    }

    public final boolean equals(Object obj) {
        y8f y8f;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8f) || this.b != (y8f = (y8f) obj).b || !Intrinsics.areEqual((Object) this.c, (Object) y8f.c) || !Intrinsics.areEqual((Object) this.d, (Object) y8f.d)) {
            return false;
        }
        String str = this.a;
        boolean F = StringsKt__StringsJVMKt.startsWith$default(str, "index_", false, 2, (Object) null);
        String str2 = y8f.a;
        return F ? StringsKt__StringsJVMKt.startsWith$default(str2, "index_", false, 2, (Object) null) : Intrinsics.areEqual((Object) str, (Object) str2);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + rae.i(this.c, (((StringsKt__StringsJVMKt.startsWith$default(str, "index_", false, 2, (Object) null) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Index{name='");
        sb.append(this.a);
        sb.append("', unique=");
        sb.append(this.b);
        sb.append(", columns=");
        sb.append(this.c);
        sb.append(", orders=");
        return tr1.l(sb, this.d, "'}");
    }
}
