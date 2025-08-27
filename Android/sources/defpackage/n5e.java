package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: n5e  reason: default package */
public final class n5e {
    public final ngf a;
    public final String b;

    public n5e(ngf ngf, String str) {
        this.a = ngf;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5e)) {
            return false;
        }
        n5e n5e = (n5e) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) n5e.a) && Intrinsics.areEqual((Object) this.b, (Object) n5e.b);
    }

    public final int hashCode() {
        int i = 0;
        ngf ngf = this.a;
        int hashCode = (ngf == null ? 0 : ngf.hashCode()) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "QuoteContent(body=" + this.a + ", imageUri=" + this.b + ")";
    }
}
