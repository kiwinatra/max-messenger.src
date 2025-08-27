package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: lf2  reason: default package */
public final class lf2 extends mf2 {
    public final m29 b;
    public final ngf c;
    public final ngf d;
    public final List e;

    public lf2(m29 m29, ngf ngf, ngf ngf2, List list) {
        this.b = m29;
        this.c = ngf;
        this.d = ngf2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf2)) {
            return false;
        }
        lf2 lf2 = (lf2) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) lf2.b) && Intrinsics.areEqual((Object) this.c, (Object) lf2.c) && Intrinsics.areEqual((Object) this.d, (Object) lf2.d) && Intrinsics.areEqual((Object) this.e, (Object) lf2.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + i2a.g(i2a.g(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "ShowConfirmationBottomSheet(model=" + this.b + ", title=" + this.c + ", description=" + this.d + ", actions=" + this.e + ")";
    }
}
