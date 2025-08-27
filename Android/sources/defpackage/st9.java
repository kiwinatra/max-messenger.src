package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: st9  reason: default package */
public final class st9 {
    public final vt9 a;
    public final String b;
    public final String c;
    public final au9 d;
    public final te8 e;
    public final hu9 f;

    public st9(vt9 vt9, String str, String str2, au9 au9, te8 te8, hu9 hu9) {
        this.a = vt9;
        this.b = str;
        this.c = str2;
        this.d = au9;
        this.e = te8;
        this.f = hu9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st9)) {
            return false;
        }
        st9 st9 = (st9) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) st9.a) && Intrinsics.areEqual((Object) this.b, (Object) st9.b) && Intrinsics.areEqual((Object) this.c, (Object) st9.c) && this.d == st9.d && Intrinsics.areEqual((Object) this.e, (Object) st9.e) && Intrinsics.areEqual((Object) this.f, (Object) st9.f);
    }

    public final int hashCode() {
        int d2 = g63.d(g63.d(Long.hashCode(this.a.a) * 31, 31, this.b), 31, this.c);
        int hashCode = this.e.hashCode();
        return this.f.a.hashCode() + ((hashCode + ((this.d.hashCode() + d2) * 31)) * 31);
    }

    public final String toString() {
        return "Movie(movieId=" + this.a + ", externalMovieId=" + this.b + ", title=" + this.c + ", sourceType=" + this.d + ", duration=" + this.e + ", thumbnail=" + this.f + ")";
    }
}
