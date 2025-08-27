package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: m25  reason: default package */
public final class m25 {
    public final String a;
    public final l25 b;
    public final l25 c;

    public m25(String str, l25 l25, l25 l252) {
        this.a = str;
        this.b = l25;
        this.c = l252;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m25)) {
            return false;
        }
        m25 m25 = (m25) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) m25.a) && Intrinsics.areEqual((Object) this.b, (Object) m25.b) && Intrinsics.areEqual((Object) this.c, (Object) m25.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        l25 l25 = this.b;
        int hashCode2 = (hashCode + (l25 == null ? 0 : l25.hashCode())) * 31;
        l25 l252 = this.c;
        if (l252 != null) {
            i = l252.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "EmojiLottie(emoji=" + this.a + ", emojiAnimation=" + this.b + ", reactionAnimation=" + this.c + ")";
    }
}
