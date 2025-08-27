package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: owb  reason: default package */
public final class owb {
    public final long a;
    public final boolean b;
    public final List c;
    public final String d;
    public final CharSequence e;
    public final CharSequence f;
    public final ngf g;
    public final ngf h;
    public final boolean i;
    public final boolean j;

    public owb(long j2, boolean z, List list, String str, CharSequence charSequence, CharSequence charSequence2, ngf ngf, ngf ngf2, boolean z2, boolean z3) {
        this.a = j2;
        this.b = z;
        this.c = list;
        this.d = str;
        this.e = charSequence;
        this.f = charSequence2;
        this.g = ngf;
        this.h = ngf2;
        this.i = z2;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owb)) {
            return false;
        }
        owb owb = (owb) obj;
        return this.a == owb.a && this.b == owb.b && Intrinsics.areEqual((Object) this.c, (Object) owb.c) && Intrinsics.areEqual((Object) this.d, (Object) owb.d) && Intrinsics.areEqual((Object) this.e, (Object) owb.e) && Intrinsics.areEqual((Object) this.f, (Object) owb.f) && Intrinsics.areEqual((Object) this.g, (Object) owb.g) && Intrinsics.areEqual((Object) this.h, (Object) owb.h) && this.i == owb.i && this.j == owb.j;
    }

    public final int hashCode() {
        int e2 = g63.e(Long.hashCode(this.a) * 31, 31, this.b);
        int i2 = 0;
        List list = this.c;
        int hashCode = (e2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.e;
        int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f;
        int hashCode4 = (hashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        ngf ngf = this.g;
        int hashCode5 = (hashCode4 + (ngf == null ? 0 : ngf.hashCode())) * 31;
        ngf ngf2 = this.h;
        if (ngf2 != null) {
            i2 = ngf2.hashCode();
        }
        return Boolean.hashCode(this.j) + g63.e((hashCode5 + i2) * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileAppBarState(idForAvatar=");
        sb.append(this.a);
        sb.append(", editEnabled=");
        sb.append(this.b);
        sb.append(", avatarUrls=");
        sb.append(this.c);
        sb.append(", lowResAvatarUrl=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", abbreviation=");
        sb.append(this.f);
        sb.append(", subtitle=");
        sb.append(this.g);
        sb.append(", link=");
        sb.append(this.h);
        sb.append(", isBlocked=");
        sb.append(this.i);
        sb.append(", isVerified=");
        return tr1.m(sb, this.j, ")");
    }
}
