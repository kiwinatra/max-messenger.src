package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: txf  reason: default package */
public final class txf {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;

    public txf(long j, String str, String str2, long j2, long j3, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = j3;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txf)) {
            return false;
        }
        txf txf = (txf) obj;
        return this.a == txf.a && Intrinsics.areEqual((Object) this.b, (Object) txf.b) && Intrinsics.areEqual((Object) this.c, (Object) txf.c) && this.d == txf.d && this.e == txf.e && Intrinsics.areEqual((Object) this.f, (Object) txf.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + wzf.i(wzf.i(g63.d(g63.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Input(requestId=");
        sb.append(this.a);
        sb.append(", externalUrl=");
        sb.append(this.b);
        sb.append(", attachLocalId=");
        sb.append(this.c);
        sb.append(", messageId=");
        sb.append(this.d);
        sb.append(", chatId=");
        sb.append(this.e);
        sb.append(", stickerId=");
        return wj6.n(sb, this.f, ")");
    }
}
