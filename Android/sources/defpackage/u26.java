package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: u26  reason: default package */
public final class u26 extends y26 {
    public final n26 a;

    public u26(n26 n26) {
        this.a = n26;
    }

    public final long a() {
        return (long) this.a.a;
    }

    public final int b() {
        return 31292;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u26) && Intrinsics.areEqual((Object) this.a, (Object) ((u26) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ButtonItem(button=" + this.a + ")";
    }
}
