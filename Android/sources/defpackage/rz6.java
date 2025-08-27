package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: rz6  reason: default package */
public final class rz6 extends tz6 {
    public final CharSequence a;

    public rz6(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rz6) && Intrinsics.areEqual((Object) this.a, (Object) ((rz6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Name(name=" + this.a + ")";
    }
}
