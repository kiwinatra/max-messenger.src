package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: nk9  reason: default package */
public final class nk9 implements qk9 {
    public final String a;

    public nk9(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nk9) && Intrinsics.areEqual((Object) this.a, (Object) ((nk9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("ProcessBotCommand(botCommand="), this.a, ")");
    }
}
