package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: w56  reason: default package */
public final class w56 implements x56 {
    public final String a;

    public w56(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w56) && Intrinsics.areEqual((Object) this.a, (Object) ((w56) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("OpenUrl(url="), this.a, ")");
    }
}
