package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: b2c  reason: default package */
public final class b2c extends f2c {
    public final String a;

    public b2c(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2c) && Intrinsics.areEqual((Object) this.a, (Object) ((b2c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("CopyToClipboard(text="), this.a, ")");
    }
}
