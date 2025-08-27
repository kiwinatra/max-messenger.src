package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: y27  reason: default package */
public final class y27 implements a37 {
    public final String a;

    public y27(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y27) && Intrinsics.areEqual((Object) this.a, (Object) ((y27) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("CustomMode(host="), this.a, ")");
    }
}
