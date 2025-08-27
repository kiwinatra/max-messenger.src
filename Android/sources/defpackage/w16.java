package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: w16  reason: default package */
public final class w16 {
    public final String a;
    public final m58 b;
    public final CharSequence c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public w16(String str, m58 m58, CharSequence charSequence, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = m58;
        this.c = charSequence;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public static w16 a(w16 w16, CharSequence charSequence, boolean z, int i) {
        String str = w16.a;
        m58 m58 = w16.b;
        if ((i & 4) != 0) {
            charSequence = w16.c;
        }
        CharSequence charSequence2 = charSequence;
        if ((i & 8) != 0) {
            z = w16.d;
        }
        boolean z2 = w16.e;
        boolean z3 = w16.f;
        w16.getClass();
        return new w16(str, m58, charSequence2, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w16)) {
            return false;
        }
        w16 w16 = (w16) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) w16.a) && Intrinsics.areEqual((Object) this.b, (Object) w16.b) && Intrinsics.areEqual((Object) this.c, (Object) w16.c) && this.d == w16.d && this.e == w16.e && this.f == w16.f;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Boolean.hashCode(this.f) + g63.e(g63.e(wj6.e(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "FolderModel(id=" + this.a + ", icon=" + this.b + ", name=" + this.c + ", manuallyAdded=" + this.d + ", editable=" + this.e + ", addedByFilters=" + this.f + ")";
    }
}
