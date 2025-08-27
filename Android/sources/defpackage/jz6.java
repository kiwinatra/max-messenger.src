package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: jz6  reason: default package */
public final class jz6 implements mz6 {
    public final String a;
    public final long b;
    public final CharSequence c;
    public final String d;

    public jz6(String str, long j, String str2, String str3) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz6)) {
            return false;
        }
        jz6 jz6 = (jz6) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) jz6.a) && this.b == jz6.b && Intrinsics.areEqual((Object) this.c, (Object) jz6.c) && Intrinsics.areEqual((Object) this.d, (Object) jz6.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + wj6.e(this.c, wzf.i(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Link(link=");
        sb.append(this.a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", chatName=");
        sb.append(this.c);
        sb.append(", conversationId=");
        return wj6.n(sb, this.d, ")");
    }
}
