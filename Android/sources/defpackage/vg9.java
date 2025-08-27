package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: vg9  reason: default package */
public final class vg9 {
    public final ngf a;
    public final boolean b;
    public final ngf c;
    public final String d;
    public final Integer e;
    public final Integer f;

    public vg9(ngf ngf, boolean z, mgf mgf, String str, Integer num, Integer num2) {
        this.a = ngf;
        this.b = z;
        this.c = mgf;
        this.d = str;
        this.e = num;
        this.f = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg9)) {
            return false;
        }
        vg9 vg9 = (vg9) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) vg9.a) && this.b == vg9.b && Intrinsics.areEqual((Object) this.c, (Object) vg9.c) && Intrinsics.areEqual((Object) this.d, (Object) vg9.d) && Intrinsics.areEqual((Object) this.e, (Object) vg9.e) && Intrinsics.areEqual((Object) this.f, (Object) vg9.f);
    }

    public final int hashCode() {
        int e2 = g63.e(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        ngf ngf = this.c;
        int hashCode = (e2 + (ngf == null ? 0 : ngf.hashCode())) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "QuoteData(title=" + this.a + ", showVerificationMark=" + this.b + ", body=" + this.c + ", image=" + this.d + ", placeholder=" + this.e + ", count=" + this.f + ")";
    }
}
