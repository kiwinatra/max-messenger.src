package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: s7e  reason: default package */
public final class s7e extends o54 {
    public final String o;
    public final String p;
    public final ngf q;
    public final boolean r;
    public final boolean s;
    public final ngf t;
    public final Integer u;

    public s7e(String str, String str2, igf igf, boolean z, boolean z2, ngf ngf, Integer num) {
        this.o = str;
        this.p = str2;
        this.q = igf;
        this.r = z;
        this.s = z2;
        this.t = ngf;
        this.u = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7e)) {
            return false;
        }
        s7e s7e = (s7e) obj;
        return Intrinsics.areEqual((Object) this.o, (Object) s7e.o) && Intrinsics.areEqual((Object) this.p, (Object) s7e.p) && Intrinsics.areEqual((Object) this.q, (Object) s7e.q) && this.r == s7e.r && this.s == s7e.s && Intrinsics.areEqual((Object) this.t, (Object) s7e.t) && Intrinsics.areEqual((Object) this.u, (Object) s7e.u);
    }

    public final int hashCode() {
        int hashCode = this.o.hashCode() * 31;
        int i = 0;
        String str = this.p;
        int e = g63.e(g63.e(i2a.g((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.q), 31, this.r), 31, this.s);
        ngf ngf = this.t;
        int hashCode2 = (e + (ngf == null ? 0 : ngf.hashCode())) * 31;
        Integer num = this.u;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public final ngf m() {
        return this.t;
    }

    public final Integer n() {
        return this.u;
    }

    public final String toString() {
        return "Input(prefix=" + this.o + ", link=" + this.p + ", placeholder=" + this.q + ", shouldShowMore=" + this.r + ", shouldShowDescription=" + this.s + ", hint=" + this.t + ", hintColor=" + this.u + ")";
    }
}
