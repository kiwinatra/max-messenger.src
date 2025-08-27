package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: oig  reason: default package */
public final class oig implements tig {
    public final String a;

    public oig(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oig) && Intrinsics.areEqual((Object) this.a, (Object) ((oig) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("ShowCloseDialog(appName="), this.a, ")");
    }
}
