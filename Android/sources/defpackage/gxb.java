package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: gxb  reason: default package */
public final class gxb extends hxb {
    public final ngf b;
    public final ngf c;
    public final boolean d;
    public final Integer e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gxb(ngf ngf, Integer num, int i) {
        this(ngf, (ngf) null, false, (i & 8) != 0 ? null : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxb)) {
            return false;
        }
        gxb gxb = (gxb) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) gxb.b) && Intrinsics.areEqual((Object) this.c, (Object) gxb.c) && this.d == gxb.d && Intrinsics.areEqual((Object) this.e, (Object) gxb.e);
    }

    public final int hashCode() {
        int i = 0;
        ngf ngf = this.b;
        int hashCode = (ngf == null ? 0 : ngf.hashCode()) * 31;
        ngf ngf2 = this.c;
        int e2 = g63.e((hashCode + (ngf2 == null ? 0 : ngf2.hashCode())) * 31, 31, this.d);
        Integer num = this.e;
        if (num != null) {
            i = num.hashCode();
        }
        return e2 + i;
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.b + ", description=" + this.c + ", showOnTop=" + this.d + ", icon=" + this.e + ")";
    }

    public gxb(ngf ngf, ngf ngf2, boolean z, Integer num) {
        this.b = ngf;
        this.c = ngf2;
        this.d = z;
        this.e = num;
    }
}
