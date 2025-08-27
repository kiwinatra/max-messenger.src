package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ur7  reason: default package */
public final class ur7 {
    public final String a;
    public final List b;

    public ur7(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur7)) {
            return false;
        }
        ur7 ur7 = (ur7) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ur7.a) && Intrinsics.areEqual((Object) this.b, (Object) ur7.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "LastInputText(text=" + this.a + ", messageElementsData=" + this.b + ")";
    }
}
