package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: t7e  reason: default package */
public final class t7e extends o54 {
    public final ngf o;
    public final ngf p;
    public final Integer q;

    public t7e(mgf mgf, igf igf, Integer num) {
        this.o = mgf;
        this.p = igf;
        this.q = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7e)) {
            return false;
        }
        t7e t7e = (t7e) obj;
        return Intrinsics.areEqual((Object) this.o, (Object) t7e.o) && Intrinsics.areEqual((Object) this.p, (Object) t7e.p) && Intrinsics.areEqual((Object) this.q, (Object) t7e.q);
    }

    public final int hashCode() {
        int e = g63.e(this.o.hashCode() * 31, 31, true);
        int i = 0;
        ngf ngf = this.p;
        int hashCode = (e + (ngf == null ? 0 : ngf.hashCode())) * 31;
        Integer num = this.q;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public final ngf m() {
        return this.p;
    }

    public final Integer n() {
        return this.q;
    }

    public final String toString() {
        return "Text(text=" + this.o + ", shouldShowMore=true, hint=" + this.p + ", hintColor=" + this.q + ")";
    }
}
