package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: nig  reason: default package */
public final class nig implements tig {
    public final String a;
    public final String b;

    public nig(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nig)) {
            return false;
        }
        nig nig = (nig) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) nig.a) && Intrinsics.areEqual((Object) this.b, (Object) nig.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendJsEvent(name=");
        sb.append(this.a);
        sb.append(", data=");
        return wj6.n(sb, this.b, ")");
    }
}
