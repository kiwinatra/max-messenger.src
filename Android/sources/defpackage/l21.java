package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: l21  reason: default package */
public final class l21 {
    public final Long a;
    public final CharSequence b;
    public final zd0 c;

    public l21(Long l, CharSequence charSequence, zd0 zd0) {
        this.a = l;
        this.b = charSequence;
        this.c = zd0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l21)) {
            return false;
        }
        l21 l21 = (l21) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) l21.a) && Intrinsics.areEqual((Object) this.b, (Object) l21.b) && Intrinsics.areEqual((Object) this.c, (Object) l21.c);
    }

    public final int hashCode() {
        int i = 0;
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        zd0 zd0 = this.c;
        if (zd0 != null) {
            i = zd0.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "CallChatState(chatId=" + this.a + ", name=" + this.b + ", avatar=" + this.c + ")";
    }
}
