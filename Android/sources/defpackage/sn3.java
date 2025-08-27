package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: sn3  reason: default package */
public final class sn3 implements tn3 {
    public final va8 a;

    public sn3(jz9 jz9) {
        this.a = jz9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sn3) && Intrinsics.areEqual((Object) this.a, (Object) ((sn3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Update(contactIds=" + this.a + ")";
    }
}
