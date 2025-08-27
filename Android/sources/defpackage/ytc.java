package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ytc  reason: default package */
public final class ytc extends i8b {
    public final String e;

    public ytc(String str) {
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ytc) && Intrinsics.areEqual((Object) this.e, (Object) ((ytc) obj).e);
    }

    public final int hashCode() {
        String str = this.e;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("Avatar(avatarUrl="), this.e, ")");
    }
}
