package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: of9  reason: default package */
public final class of9 {
    public final a89 a;
    public final boolean b;

    public of9(a89 a89, boolean z) {
        this.a = a89;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of9)) {
            return false;
        }
        of9 of9 = (of9) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) of9.a) && this.b == of9.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
