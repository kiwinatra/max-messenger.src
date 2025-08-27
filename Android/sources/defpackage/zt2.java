package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zt2  reason: default package */
public final class zt2 implements au2 {
    public final Set a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Map e;
    public final Function1 f;
    public final Comparator g;

    public zt2(Set set, Set set2, Set set3, Set set4, Map map) {
        gl1 gl1 = ekd.c;
        v00 v00 = r62.I;
        this.a = set;
        this.b = set2;
        this.c = set3;
        this.d = set4;
        this.e = map;
        this.f = gl1;
        this.g = v00;
    }

    public final Comparator a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt2)) {
            return false;
        }
        zt2 zt2 = (zt2) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) zt2.a) && Intrinsics.areEqual((Object) this.b, (Object) zt2.b) && Intrinsics.areEqual((Object) this.c, (Object) zt2.c) && Intrinsics.areEqual((Object) this.d, (Object) zt2.d) && Intrinsics.areEqual((Object) this.e, (Object) zt2.e) && Intrinsics.areEqual((Object) this.f, (Object) zt2.f) && Intrinsics.areEqual((Object) this.g, (Object) zt2.g);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        int hashCode5 = this.f.hashCode();
        return this.g.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Filter(includedChats=" + this.a + ", includedFilters=" + this.b + ", excludedChats=" + this.c + ", excludedFilters=" + this.d + ", subjects=" + this.e + ", filterPredicate=" + this.f + ", comparator=" + this.g + ")";
    }
}
