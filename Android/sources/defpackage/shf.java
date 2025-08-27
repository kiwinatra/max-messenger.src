package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: shf  reason: default package */
public final class shf {
    public final o5f a;

    public shf(o5f o5f) {
        this.a = o5f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof shf) && Intrinsics.areEqual((Object) this.a, (Object) ((shf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SvgPattern(svgPattern=" + this.a + ")";
    }
}
