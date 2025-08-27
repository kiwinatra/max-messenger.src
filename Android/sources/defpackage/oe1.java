package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: oe1  reason: default package */
public final class oe1 {
    public static final oe1 e = new oe1(CollectionsKt.emptyList(), CollectionsKt.emptyList(), "", false);
    public final List a;
    public final List b;
    public final CharSequence c;
    public final boolean d;

    public oe1(List list, List list2, CharSequence charSequence, boolean z) {
        this.a = list;
        this.b = list2;
        this.c = charSequence;
        this.d = z;
    }

    public static oe1 a(oe1 oe1, List list, List list2, CharSequence charSequence, int i) {
        if ((i & 1) != 0) {
            list = oe1.a;
        }
        if ((i & 2) != 0) {
            list2 = oe1.b;
        }
        if ((i & 4) != 0) {
            charSequence = oe1.c;
        }
        boolean z = (i & 8) != 0 ? oe1.d : false;
        oe1.getClass();
        return new oe1(list, list2, charSequence, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe1)) {
            return false;
        }
        oe1 oe1 = (oe1) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) oe1.a) && Intrinsics.areEqual((Object) this.b, (Object) oe1.b) && Intrinsics.areEqual((Object) this.c, (Object) oe1.c) && this.d == oe1.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + wj6.e(this.c, rae.i(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "CallOpponentsState(opponents=" + this.a + ", buttons=" + this.b + ", title=" + this.c + ", canOpenSettings=" + this.d + ")";
    }
}
