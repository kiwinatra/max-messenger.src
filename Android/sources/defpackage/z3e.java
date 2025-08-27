package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: z3e  reason: default package */
public final class z3e {
    public static final z3e h = new z3e(-1, (String) null, "", "", "", "", false);
    public final long a;
    public final String b;
    public final String c;
    public final CharSequence d;
    public final String e;
    public final String f;
    public final boolean g;

    public z3e(long j, String str, String str2, CharSequence charSequence, String str3, String str4, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = charSequence;
        this.e = str3;
        this.f = str4;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3e)) {
            return false;
        }
        z3e z3e = (z3e) obj;
        return this.a == z3e.a && Intrinsics.areEqual((Object) this.b, (Object) z3e.b) && Intrinsics.areEqual((Object) this.c, (Object) z3e.c) && Intrinsics.areEqual((Object) this.d, (Object) z3e.d) && Intrinsics.areEqual((Object) this.e, (Object) z3e.e) && Intrinsics.areEqual((Object) this.f, (Object) z3e.f) && this.g == z3e.g;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.g) + g63.d(g63.d(wj6.e(this.d, g63.d((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsProfileDataModel(id=");
        sb.append(this.a);
        sb.append(", avatarUrl=");
        sb.append(this.b);
        sb.append(", fullName=");
        sb.append(this.c);
        sb.append(", abbreviation=");
        sb.append(this.d);
        sb.append(", phone=");
        sb.append(this.e);
        sb.append(", nickName=");
        sb.append(this.f);
        sb.append(", hasEsiaConnection=");
        return tr1.m(sb, this.g, ")");
    }
}
