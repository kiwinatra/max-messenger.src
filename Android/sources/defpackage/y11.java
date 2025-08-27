package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: y11  reason: default package */
public final class y11 {
    public static final y11 f = new y11((Long) null, (String) null, (String) null, (Long) null, 30);
    public final Long a;
    public final CharSequence b;
    public final String c;
    public final Long d;
    public final CharSequence e;

    public y11(Long l, CharSequence charSequence, String str, Long l2, CharSequence charSequence2) {
        this.a = l;
        this.b = charSequence;
        this.c = str;
        this.d = l2;
        this.e = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y11)) {
            return false;
        }
        y11 y11 = (y11) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) y11.a) && Intrinsics.areEqual((Object) this.b, (Object) y11.b) && Intrinsics.areEqual((Object) this.c, (Object) y11.c) && Intrinsics.areEqual((Object) this.d, (Object) y11.d) && Intrinsics.areEqual((Object) this.e, (Object) y11.e);
    }

    public final int hashCode() {
        int i = 0;
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.d;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        CharSequence charSequence2 = this.e;
        if (charSequence2 != null) {
            i = charSequence2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "CallChatInfo(chatId=" + this.a + ", name=" + this.b + ", avatar=" + this.c + ", avatarColorId=" + this.d + ", avatarAbbreviation=" + this.e + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y11(Long l, String str, String str2, Long l2, int i) {
        this(l, (CharSequence) (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : l2, (CharSequence) null);
    }
}
