package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: r7e  reason: default package */
public final class r7e extends o54 {
    public final ngf o;
    public final ngf p;
    public final Integer q;

    public r7e(igf igf, igf igf2, Integer num) {
        this.o = igf;
        this.p = igf2;
        this.q = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7e)) {
            return false;
        }
        r7e r7e = (r7e) obj;
        return Intrinsics.areEqual((Object) this.o, (Object) r7e.o) && Intrinsics.areEqual((Object) this.p, (Object) r7e.p) && Intrinsics.areEqual((Object) this.q, (Object) r7e.q);
    }

    public final int hashCode() {
        int hashCode = this.o.hashCode() * 31;
        int i = 0;
        ngf ngf = this.p;
        int hashCode2 = (hashCode + (ngf == null ? 0 : ngf.hashCode())) * 31;
        Integer num = this.q;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public final ngf m() {
        return this.p;
    }

    public final Integer n() {
        return this.q;
    }

    public final String toString() {
        return "Button(text=" + this.o + ", hint=" + this.p + ", hintColor=" + this.q + ")";
    }
}
