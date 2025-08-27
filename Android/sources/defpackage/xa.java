package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: xa  reason: default package */
public final class xa implements dk9 {
    public final hqc a;
    public final String b;
    public final long c;

    public xa(long j, hqc hqc, String str) {
        this.a = hqc;
        this.b = str;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa)) {
            return false;
        }
        xa xaVar = (xa) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) xaVar.a) && Intrinsics.areEqual((Object) this.b, (Object) xaVar.b) && this.c == xaVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + g63.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddReactionEffect(reaction=");
        sb.append(this.a);
        sb.append(", effectUrl=");
        sb.append(this.b);
        sb.append(", msgId=");
        return wj6.m(sb, this.c, ")");
    }
}
