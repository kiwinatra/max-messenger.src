package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: tze  reason: default package */
public final class tze {
    public final long a;
    public final sze b;
    public final String c;
    public final String d;
    public final CharSequence e;
    public final String f;
    public final mtb g;
    public final String h;

    public tze(long j, sze sze, String str, String str2, CharSequence charSequence, String str3, mtb mtb, String str4) {
        this.a = j;
        this.b = sze;
        this.c = str;
        this.d = str2;
        this.e = charSequence;
        this.f = str3;
        this.g = mtb;
        this.h = str4;
    }

    public static tze a(tze tze, CharSequence charSequence) {
        long j = tze.a;
        sze sze = tze.b;
        String str = tze.c;
        String str2 = tze.d;
        String str3 = tze.f;
        mtb mtb = tze.g;
        String str4 = tze.h;
        tze.getClass();
        return new tze(j, sze, str, str2, charSequence, str3, mtb, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tze)) {
            return false;
        }
        tze tze = (tze) obj;
        return this.a == tze.a && this.b == tze.b && Intrinsics.areEqual((Object) this.c, (Object) tze.c) && Intrinsics.areEqual((Object) this.d, (Object) tze.d) && Intrinsics.areEqual((Object) this.e, (Object) tze.e) && Intrinsics.areEqual((Object) this.f, (Object) tze.f) && Intrinsics.areEqual((Object) this.g, (Object) tze.g) && Intrinsics.areEqual((Object) this.h, (Object) tze.h);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        int i = 0;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CharSequence charSequence = this.e;
        int hashCode4 = (hashCode3 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str3 = this.f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        mtb mtb = this.g;
        int hashCode6 = (hashCode5 + (mtb == null ? 0 : mtb.hashCode())) * 31;
        String str4 = this.h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Suggest(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", inputResult=");
        sb.append(this.e);
        sb.append(", avatarUrl=");
        sb.append(this.f);
        sb.append(", presence=");
        sb.append(this.g);
        sb.append(", query=");
        return wj6.n(sb, this.h, ")");
    }
}
