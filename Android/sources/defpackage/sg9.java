package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: sg9  reason: default package */
public final class sg9 {
    public final long a;
    public final CharSequence b;
    public final vg9 c;
    public final boolean d;
    public final boolean e;

    public sg9(long j, CharSequence charSequence, vg9 vg9, boolean z, boolean z2) {
        this.a = j;
        this.b = charSequence;
        this.c = vg9;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg9)) {
            return false;
        }
        sg9 sg9 = (sg9) obj;
        return this.a == sg9.a && Intrinsics.areEqual((Object) this.b, (Object) sg9.b) && Intrinsics.areEqual((Object) this.c, (Object) sg9.c) && this.d == sg9.d && this.e == sg9.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + g63.e((this.c.hashCode() + wj6.e(this.b, Long.hashCode(this.a) * 31, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditData(messageId=");
        sb.append(this.a);
        sb.append(", messageText=");
        sb.append(this.b);
        sb.append(", quoteData=");
        sb.append(this.c);
        sb.append(", hasMediaAttaches=");
        sb.append(this.d);
        sb.append(", shouldInsertOriginalText=");
        return tr1.m(sb, this.e, ")");
    }
}
