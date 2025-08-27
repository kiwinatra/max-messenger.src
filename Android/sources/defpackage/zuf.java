package defpackage;

import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zuf  reason: default package */
public final class zuf extends avf {
    public final tze b;
    public final CharSequence c;
    public final CharSequence d;
    public final Triple e;
    public final boolean f;
    public final erd g;
    public final int h;
    public final long i;
    public final int j;

    public zuf(tze tze, CharSequence charSequence, CharSequence charSequence2, Triple triple, boolean z, erd erd, int i2) {
        this.b = tze;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = triple;
        this.f = z;
        this.g = erd;
        this.h = i2;
        this.i = tze.a;
        this.j = avf.a.contains(tze.b) ? 312 : 878;
    }

    public static zuf c(zuf zuf, tze tze, erd erd) {
        return new zuf(tze, zuf.c, zuf.d, zuf.e, zuf.f, erd, zuf.h);
    }

    public final long a() {
        return this.i;
    }

    public final int b() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zuf)) {
            return false;
        }
        zuf zuf = (zuf) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) zuf.b) && Intrinsics.areEqual((Object) this.c, (Object) zuf.c) && Intrinsics.areEqual((Object) this.d, (Object) zuf.d) && Intrinsics.areEqual((Object) this.e, (Object) zuf.e) && this.f == zuf.f && this.g == zuf.g && this.h == zuf.h;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        int i2 = 0;
        CharSequence charSequence = this.c;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.d;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        Triple triple = this.e;
        if (triple != null) {
            i2 = triple.hashCode();
        }
        return Integer.hashCode(this.h) + ((this.g.hashCode() + g63.e((hashCode3 + i2) * 31, 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestUiItem(origin=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", shortlink=");
        sb.append(this.d);
        sb.append(", avatar=");
        sb.append(this.e);
        sb.append(", fromContacts=");
        sb.append(this.f);
        sb.append(", selectedMentionType=");
        sb.append(this.g);
        sb.append(", highlightAfterReplaceColor=");
        return wj6.l(sb, this.h, ")");
    }
}
