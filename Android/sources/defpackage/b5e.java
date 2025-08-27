package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: b5e  reason: default package */
public final class b5e {
    public final ngf a;
    public final ngf b;
    public final String c;
    public final Integer d;

    public b5e(igf igf, ngf ngf, String str, Integer num) {
        this.a = igf;
        this.b = ngf;
        this.c = str;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5e)) {
            return false;
        }
        b5e b5e = (b5e) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) b5e.a) && Intrinsics.areEqual((Object) this.b, (Object) b5e.b) && Intrinsics.areEqual((Object) this.c, (Object) b5e.c) && Intrinsics.areEqual((Object) this.d, (Object) b5e.d) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        ngf ngf = this.b;
        int hashCode2 = (hashCode + (ngf == null ? 0 : ngf.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        if (num != null) {
            i = num.hashCode();
        }
        return (hashCode3 + i) * 31;
    }

    public final String toString() {
        return "QuoteData(title=" + this.a + ", body=" + this.b + ", image=" + this.c + ", count=" + this.d + ", placeholder=null)";
    }
}
