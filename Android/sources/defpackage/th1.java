package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: th1  reason: default package */
public final class th1 extends ji1 {
    public final String b;

    public th1(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof th1) && Intrinsics.areEqual((Object) this.b, (Object) ((th1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("CopyCallLink(link="), this.b, ")");
    }
}
