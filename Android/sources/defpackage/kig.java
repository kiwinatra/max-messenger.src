package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: kig  reason: default package */
public final class kig implements tig {
    public final String a;

    public kig(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kig) && Intrinsics.areEqual((Object) this.a, (Object) ((kig) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("LoadUrl(url="), this.a, ")");
    }
}
