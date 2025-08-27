package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: qnb  reason: default package */
public final class qnb implements rnb {
    public final String a;

    public qnb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qnb) && Intrinsics.areEqual((Object) this.a, (Object) ((qnb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("UserPhoto(url="), this.a, ")");
    }
}
