package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: exb  reason: default package */
public final class exb extends hxb {
    public final ngf b;
    public final ngf c;
    public final List d;

    public exb(igf igf, igf igf2, List list) {
        this.b = igf;
        this.c = igf2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exb)) {
            return false;
        }
        exb exb = (exb) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) exb.b) && Intrinsics.areEqual((Object) this.c, (Object) exb.c) && Intrinsics.areEqual((Object) this.d, (Object) exb.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        ngf ngf = this.c;
        return this.d.hashCode() + ((hashCode + (ngf == null ? 0 : ngf.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowConfirmation(title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", buttons=");
        return tr1.l(sb, this.d, ")");
    }
}
