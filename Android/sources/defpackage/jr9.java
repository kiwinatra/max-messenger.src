package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: jr9  reason: default package */
public final class jr9 {
    public final String a;
    public final CharSequence b;
    public final r14 c;
    public final Set d;

    public jr9(String str, CharSequence charSequence, r14 r14, Set set) {
        this.a = str;
        this.b = charSequence;
        this.c = r14;
        this.d = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr9)) {
            return false;
        }
        jr9 jr9 = (jr9) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) jr9.a) && Intrinsics.areEqual((Object) this.b, (Object) jr9.b) && Intrinsics.areEqual((Object) this.c, (Object) jr9.c) && Intrinsics.areEqual((Object) this.d, (Object) jr9.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rae.h(this.c.a, wj6.e(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "MiniFolder(id=" + this.a + ", name=" + this.b + ", counter=" + this.c + ", options=" + this.d + ")";
    }
}
