package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: z45  reason: default package */
public final class z45 implements c55 {
    public final String a;
    public final CharSequence b;
    public final long c;
    public final ngf d;
    public final ngf e;

    public z45(String str, CharSequence charSequence, long j, igf igf, igf igf2) {
        this.a = str;
        this.b = charSequence;
        this.c = j;
        this.d = igf;
        this.e = igf2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z45)) {
            return false;
        }
        z45 z45 = (z45) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) z45.a) && Intrinsics.areEqual((Object) this.b, (Object) z45.b) && this.c == z45.c && Intrinsics.areEqual((Object) this.d, (Object) z45.d) && Intrinsics.areEqual((Object) this.e, (Object) z45.e);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return this.e.hashCode() + i2a.g(wzf.i((hashCode + i) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "EmptyBot(avatar=" + this.a + ", avatarPlaceholder=" + this.b + ", avatarPlaceholderId=" + this.c + ", title=" + this.d + ", subtitle=" + this.e + ")";
    }
}
