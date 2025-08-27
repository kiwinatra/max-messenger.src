package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: pnb  reason: default package */
public final class pnb implements rnb {
    public final String a;
    public final long b;
    public final int c;

    public pnb(int i, String str, long j) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnb)) {
            return false;
        }
        pnb pnb = (pnb) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) pnb.a) && this.b == pnb.b && this.c == pnb.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + wzf.i(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeuroAvatar(url=");
        sb.append(this.a);
        sb.append(", photoId=");
        sb.append(this.b);
        sb.append(", categoryId=");
        return wj6.l(sb, this.c, ")");
    }
}
