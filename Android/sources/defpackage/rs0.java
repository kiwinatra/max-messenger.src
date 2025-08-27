package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: rs0  reason: default package */
public final class rs0 {
    public final ss0 a;
    public final ts0 b;
    public final us0 c;

    public rs0(ss0 ss0, ts0 ts0, us0 us0) {
        this.a = ss0;
        this.b = ts0;
        this.c = us0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs0)) {
            return false;
        }
        rs0 rs0 = (rs0) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) rs0.a) && Intrinsics.areEqual((Object) this.b, (Object) rs0.b) && Intrinsics.areEqual((Object) this.c, (Object) rs0.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BubbleBackgroundFocusColors(regular=" + this.a + ", singleMedia=" + this.b + ", transparent=" + this.c + ")";
    }
}
