package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: pz6  reason: default package */
public final class pz6 extends tz6 {
    public final CharSequence a;

    public pz6(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pz6) && Intrinsics.areEqual((Object) this.a, (Object) ((pz6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Description(description=" + this.a + ")";
    }
}
