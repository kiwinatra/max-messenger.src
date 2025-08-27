package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: gb1  reason: default package */
public final class gb1 {
    public final String a;
    public final String b;
    public final long c;

    public gb1(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb1)) {
            return false;
        }
        gb1 gb1 = (gb1) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) gb1.a) && Intrinsics.areEqual((Object) this.b, (Object) gb1.b) && this.c == gb1.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + g63.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallLink(conversationId=");
        sb.append(this.a);
        sb.append(", joinLink=");
        sb.append(this.b);
        sb.append(", startedAt=");
        return wj6.m(sb, this.c, ")");
    }
}
