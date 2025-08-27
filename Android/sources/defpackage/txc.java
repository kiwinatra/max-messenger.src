package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: txc  reason: default package */
public final class txc {
    public final ngf a;
    public final ngf b;
    public final sxc c;
    public final sxc d;
    public final ngf e;
    public final boolean f;

    public txc(igf igf, igf igf2, sxc sxc, sxc sxc2, mgf mgf, boolean z) {
        this.a = igf;
        this.b = igf2;
        this.c = sxc;
        this.d = sxc2;
        this.e = mgf;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txc)) {
            return false;
        }
        txc txc = (txc) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) txc.a) && Intrinsics.areEqual((Object) this.b, (Object) txc.b) && Intrinsics.areEqual((Object) this.c, (Object) txc.c) && Intrinsics.areEqual((Object) this.d, (Object) txc.d) && Intrinsics.areEqual((Object) this.e, (Object) txc.e) && this.f == txc.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ngf ngf = this.b;
        int hashCode2 = ngf == null ? 0 : ngf.hashCode();
        return Boolean.hashCode(this.f) + i2a.g((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + hashCode2) * 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExitWithRecordState(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", negativeButton=");
        sb.append(this.c);
        sb.append(", positiveButton=");
        sb.append(this.d);
        sb.append(", recordTitle=");
        sb.append(this.e);
        sb.append(", canRemove=");
        return tr1.m(sb, this.f, ")");
    }
}
