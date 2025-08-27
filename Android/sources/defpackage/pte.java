package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: pte  reason: default package */
public final class pte {
    public final String a;
    public final long b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pte(String str, int i) {
        this((i & 1) != 0 ? null : str, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pte)) {
            return false;
        }
        pte pte = (pte) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) pte.a) && this.b == pte.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Long.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueryState(query=");
        sb.append(this.a);
        sb.append(", marker=");
        return wj6.m(sb, this.b, ")");
    }

    public pte(String str, long j) {
        this.a = str;
        this.b = j;
    }
}
