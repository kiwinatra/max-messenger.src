package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ua6  reason: default package */
public final class ua6 {
    public final ngf a;
    public final ngf b;
    public final String c;
    public final Integer d;
    public final Integer e;

    public ua6(ngf ngf, mgf mgf, String str, Integer num, Integer num2) {
        this.a = ngf;
        this.b = mgf;
        this.c = str;
        this.d = num;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua6)) {
            return false;
        }
        ua6 ua6 = (ua6) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ua6.a) && Intrinsics.areEqual((Object) this.b, (Object) ua6.b) && Intrinsics.areEqual((Object) this.c, (Object) ua6.c) && Intrinsics.areEqual((Object) this.d, (Object) ua6.d) && Intrinsics.areEqual((Object) this.e, (Object) ua6.e);
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
