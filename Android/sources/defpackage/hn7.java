package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: hn7  reason: default package */
public final class hn7 {
    public final String a;
    public final pm7 b;

    public hn7(String str, aje aje) {
        this.a = str;
        this.b = aje;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn7)) {
            return false;
        }
        hn7 hn7 = (hn7) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) hn7.a) && Intrinsics.areEqual((Object) this.b, (Object) hn7.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "JobWrapper(name=" + this.a + ", job=" + this.b + ")";
    }
}
