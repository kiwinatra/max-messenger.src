package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: f3c  reason: default package */
public final class f3c extends s3c {
    public final CharSequence a;

    public f3c(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f3c) && Intrinsics.areEqual((Object) this.a, (Object) ((f3c) obj).a);
    }

    public final long getItemId() {
        return (long) 32768;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final int i() {
        return 32768;
    }

    public final String toString() {
        return "ChannelLinkItem(link=" + this.a + ")";
    }
}
