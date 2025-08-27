package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y16  reason: default package */
public final class y16 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final r14 d;
    public final Set e;

    public y16(String str, CharSequence charSequence, CharSequence charSequence2, r14 r14, Set set) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = r14;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y16)) {
            return false;
        }
        y16 y16 = (y16) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) y16.a) && Intrinsics.areEqual((Object) this.b, (Object) y16.b) && Intrinsics.areEqual((Object) this.c, (Object) y16.c) && Intrinsics.areEqual((Object) this.d, (Object) y16.d) && Intrinsics.areEqual((Object) this.e, (Object) y16.e);
    }

    public final int hashCode() {
        int e2 = wj6.e(this.b, this.a.hashCode() * 31, 31);
        CharSequence charSequence = this.c;
        return this.e.hashCode() + rae.h(this.d.a, (e2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "FolderModel(id=" + this.a + ", name=" + this.b + ", emoji=" + this.c + ", counter=" + this.d + ", options=" + this.e + ")";
    }
}
