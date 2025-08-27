package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: s26  reason: default package */
public final class s26 {
    public final CharSequence a;
    public final CharSequence b;
    public final a32 c;
    public final boolean d;

    public s26(CharSequence charSequence, CharSequence charSequence2, a32 a32, boolean z) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = a32;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s26)) {
            return false;
        }
        s26 s26 = (s26) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) s26.a) && Intrinsics.areEqual((Object) this.b, (Object) s26.b) && Intrinsics.areEqual((Object) this.c, (Object) s26.c) && this.d == s26.d;
    }

    public final int hashCode() {
        int e = wj6.e(this.b, this.a.hashCode() * 31, 31);
        a32 a32 = this.c;
        return Boolean.hashCode(this.d) + ((e + (a32 == null ? 0 : a32.hashCode())) * 31);
    }

    public final String toString() {
        return "FolderChatModel(preProcessedTitle=" + this.a + ", preProcessedSubtitle=" + this.b + ", chat=" + this.c + ", editable=" + this.d + ")";
    }
}
