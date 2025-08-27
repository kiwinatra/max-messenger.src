package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ff2  reason: default package */
public final class ff2 extends mf2 {
    public final long b;
    public final long c;
    public final String d;
    public final boolean e;

    public ff2(long j, long j2, String str, boolean z) {
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff2)) {
            return false;
        }
        ff2 ff2 = (ff2) obj;
        return this.b == ff2.b && this.c == ff2.c && Intrinsics.areEqual((Object) this.d, (Object) ff2.d) && this.e == ff2.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + g63.d(wzf.i(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenImage(chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", attachLocalId=");
        sb.append(this.d);
        sb.append(", isSingleAttach=");
        return tr1.m(sb, this.e, ")");
    }
}
