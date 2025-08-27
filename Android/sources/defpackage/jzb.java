package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: jzb  reason: default package */
public final class jzb implements mzb {
    public final Long a;
    public final String b;
    public final String c;
    public final String d;

    public jzb(Long l, String str, String str2, String str3) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzb)) {
            return false;
        }
        jzb jzb = (jzb) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) jzb.a) && Intrinsics.areEqual((Object) this.b, (Object) jzb.b) && Intrinsics.areEqual((Object) this.c, (Object) jzb.c) && Intrinsics.areEqual((Object) this.d, (Object) jzb.d);
    }

    public final int hashCode() {
        int i = 0;
        Long l = this.a;
        int d2 = g63.d(g63.d((l == null ? 0 : l.hashCode()) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return d2 + i;
    }

    public final String toString() {
        return "ContactUpdate(requestId=" + this.a + ", fullName=" + this.b + ", nickName=" + this.c + ", avatarUrl=" + this.d + ")";
    }
}
