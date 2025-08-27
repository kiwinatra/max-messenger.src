package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: chg  reason: default package */
public final class chg extends ehg {
    public final String a;

    public chg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chg) && Intrinsics.areEqual((Object) this.a, (Object) ((chg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("InternalNavigation(deeplink="), this.a, ")");
    }
}
