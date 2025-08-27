package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: hf2  reason: default package */
public final class hf2 extends mf2 {
    public final String b;

    public hf2(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hf2) && Intrinsics.areEqual((Object) this.b, (Object) ((hf2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("OpenLink(attachUrl="), this.b, ")");
    }
}
