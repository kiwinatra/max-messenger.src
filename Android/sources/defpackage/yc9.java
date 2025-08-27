package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: yc9  reason: default package */
public final class yc9 {
    public static final yc9 d = new yc9(-1, (CharSequence) null, (String) null);
    public final long a;
    public final String b;
    public final CharSequence c;

    public yc9(long j, CharSequence charSequence, String str) {
        this.a = j;
        this.b = str;
        this.c = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc9)) {
            return false;
        }
        yc9 yc9 = (yc9) obj;
        return this.a == yc9.a && Intrinsics.areEqual((Object) this.b, (Object) yc9.b) && Intrinsics.areEqual((Object) this.c, (Object) yc9.c);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "AvatarParams(id=" + this.a + ", url=" + this.b + ", placeholder=" + this.c + ")";
    }
}
