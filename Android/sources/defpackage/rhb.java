package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: rhb  reason: default package */
public final class rhb {
    public final ngf a;
    public final ngf b;
    public final String c;
    public final Integer d;
    public final Integer e;

    public rhb(ngf ngf, ngf ngf2, String str, Integer num, Integer num2) {
        this.a = ngf;
        this.b = ngf2;
        this.c = str;
        this.d = num;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhb)) {
            return false;
        }
        rhb rhb = (rhb) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) rhb.a) && Intrinsics.areEqual((Object) this.b, (Object) rhb.b) && Intrinsics.areEqual((Object) this.c, (Object) rhb.c) && Intrinsics.areEqual((Object) this.d, (Object) rhb.d) && Intrinsics.areEqual((Object) this.e, (Object) rhb.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        ngf ngf = this.b;
        int hashCode2 = (hashCode + (ngf == null ? 0 : ngf.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "QuoteData(title=" + this.a + ", body=" + this.b + ", image=" + this.c + ", count=" + this.d + ", placeholder=" + this.e + ")";
    }
}
