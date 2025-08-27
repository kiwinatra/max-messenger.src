package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: zx9  reason: default package */
public final class zx9 extends o5a {
    public final long j;
    public final long k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;

    public zx9(long j2, long j3, String str, String str2, String str3, String str4) {
        this.j = j2;
        this.k = j3;
        this.l = str;
        this.m = str2;
        this.n = str3;
        this.o = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx9)) {
            return false;
        }
        zx9 zx9 = (zx9) obj;
        return this.j == zx9.j && this.k == zx9.k && Intrinsics.areEqual((Object) this.l, (Object) zx9.l) && Intrinsics.areEqual((Object) this.m, (Object) zx9.m) && Intrinsics.areEqual((Object) this.n, (Object) zx9.n) && Intrinsics.areEqual((Object) this.o, (Object) zx9.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + g63.d(g63.d(g63.d(wzf.i(Long.hashCode(this.j) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAttach(chatId=");
        sb.append(this.j);
        sb.append(", messageId=");
        sb.append(this.k);
        sb.append(", attachLocalId=");
        sb.append(this.l);
        sb.append(", audioUrl=");
        sb.append(this.m);
        sb.append(", attachTitle=");
        sb.append(this.n);
        sb.append(", attachSubtitle=");
        return wj6.n(sb, this.o, ")");
    }
}
