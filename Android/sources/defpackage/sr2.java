package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: sr2  reason: default package */
public final class sr2 {
    public final long a;
    public final CharSequence b;

    public sr2(CharSequence charSequence, long j) {
        this.a = j;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr2)) {
            return false;
        }
        sr2 sr2 = (sr2) obj;
        return this.a == sr2.a && Intrinsics.areEqual((Object) this.b, (Object) sr2.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ChatTyping(chatId=" + this.a + ", typingText=" + this.b + ")";
    }
}
