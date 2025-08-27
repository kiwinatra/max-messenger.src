package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: l4d  reason: default package */
public final class l4d {
    public final CharSequence a;
    public final Long b;
    public final Long c;

    public l4d(CharSequence charSequence, Long l, Long l2) {
        this.a = charSequence;
        this.b = l;
        this.c = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4d)) {
            return false;
        }
        l4d l4d = (l4d) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) l4d.a) && Intrinsics.areEqual((Object) this.b, (Object) l4d.b) && Intrinsics.areEqual((Object) this.c, (Object) l4d.c);
    }

    public final int hashCode() {
        int i = 0;
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "Result(text=" + this.a + ", editMsgId=" + this.b + ", replyMsgId=" + this.c + ")";
    }
}
