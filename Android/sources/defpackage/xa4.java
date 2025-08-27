package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xa4  reason: default package */
public final class xa4 {
    public static final xa4 c = new xa4();
    public final Function0 a;
    public final Function0 b;

    public xa4(Function0 function0, Function0 function02) {
        this.a = function0;
        this.b = function02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa4)) {
            return false;
        }
        xa4 xa4 = (xa4) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) xa4.a) && Intrinsics.areEqual((Object) this.b, (Object) xa4.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Animations(push=" + this.a + ", pop=" + this.b + ")";
    }

    public /* synthetic */ xa4() {
        this(gy3.v, gy3.w);
    }
}
