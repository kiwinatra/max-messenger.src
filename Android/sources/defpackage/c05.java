package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: c05  reason: default package */
public final class c05 {
    public final String a;
    public final m58 b;
    public final CharSequence c;
    public final boolean d;

    public c05(String str, m58 m58, CharSequence charSequence, boolean z) {
        this.a = str;
        this.b = m58;
        this.c = charSequence;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c05)) {
            return false;
        }
        c05 c05 = (c05) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) c05.a) && Intrinsics.areEqual((Object) this.b, (Object) c05.b) && Intrinsics.areEqual((Object) this.c, (Object) c05.c) && this.d == c05.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Boolean.hashCode(this.d) + wj6.e(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "EditableFolderModel(id=" + this.a + ", icon=" + this.b + ", name=" + this.c + ", isHiddenForAllFolder=" + this.d + ")";
    }
}
