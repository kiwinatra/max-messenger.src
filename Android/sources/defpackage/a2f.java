package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a2f  reason: default package */
public final class a2f implements b2f {
    public final List a;
    public final Integer b;
    public final c2f c;

    public a2f(List list, Integer num, c2f c2f) {
        this.a = list;
        this.b = num;
        this.c = c2f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2f)) {
            return false;
        }
        a2f a2f = (a2f) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) a2f.a) && Intrinsics.areEqual((Object) this.b, (Object) a2f.b) && this.c == a2f.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "Result(suggests=" + this.a + ", scrollPosition=" + this.b + ", mentionState=" + this.c + ")";
    }
}
