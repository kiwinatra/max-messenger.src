package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o0f  reason: default package */
public final class o0f implements lz7 {
    public final long a;
    public final CharSequence b;
    public final String c;
    public final CharSequence o;
    public final String v;
    public final List w;
    public final sze x;

    public o0f(long j, CharSequence charSequence, String str, CharSequence charSequence2, String str2, List list, sze sze) {
        this.a = j;
        this.b = charSequence;
        this.c = str;
        this.o = charSequence2;
        this.v = str2;
        this.w = list;
        this.x = sze;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0f)) {
            return false;
        }
        o0f o0f = (o0f) obj;
        return this.a == o0f.a && Intrinsics.areEqual((Object) this.b, (Object) o0f.b) && Intrinsics.areEqual((Object) this.c, (Object) o0f.c) && Intrinsics.areEqual((Object) this.o, (Object) o0f.o) && Intrinsics.areEqual((Object) this.v, (Object) o0f.v) && Intrinsics.areEqual((Object) this.w, (Object) o0f.w) && this.x == o0f.x;
    }

    public final long getItemId() {
        return this.a;
    }

    public final CharSequence h() {
        sze sze = sze.c;
        CharSequence charSequence = this.b;
        if (this.x == sze) {
            return charSequence;
        }
        CharSequence charSequence2 = this.o;
        return charSequence2.length() == 0 ? charSequence : charSequence2;
    }

    public final int hashCode() {
        return this.x.hashCode() + rae.i(this.w, g63.d(wj6.e(this.o, g63.d(wj6.e(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c), 31), 31, this.v), 31);
    }

    public final int i() {
        return 1;
    }

    public final String toString() {
        return "SuggestionsState(id=" + this.a + ", name=" + this.b + ", avatar=" + this.c + ", shortName=" + this.o + ", query=" + this.v + ", contextActions=" + this.w + ", type=" + this.x + ")";
    }
}
