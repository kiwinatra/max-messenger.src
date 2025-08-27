package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ma2  reason: default package */
public final class ma2 extends ibf {
    public final List c;
    public final b32 o;
    public final Set v;

    public ma2(List list, b32 b32, LinkedHashSet linkedHashSet) {
        this.c = list;
        this.o = b32;
        this.v = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma2)) {
            return false;
        }
        ma2 ma2 = (ma2) obj;
        return Intrinsics.areEqual((Object) this.c, (Object) ma2.c) && Intrinsics.areEqual((Object) this.o, (Object) ma2.o) && Intrinsics.areEqual((Object) this.v, (Object) ma2.v);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        b32 b32 = this.o;
        return this.v.hashCode() + ((hashCode + (b32 == null ? 0 : b32.hashCode())) * 31);
    }

    public final String toString() {
        return "Response(messages=" + this.c + ", chat=" + this.o + ", messageIds=" + this.v + ")";
    }
}
