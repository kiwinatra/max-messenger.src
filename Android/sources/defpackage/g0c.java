package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g0c  reason: default package */
public final class g0c extends j91 {
    public final ngf b;
    public final ngf c;
    public final List d;

    public g0c(ngf ngf, ngf ngf2, List list) {
        super(10);
        this.b = ngf;
        this.c = ngf2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0c)) {
            return false;
        }
        g0c g0c = (g0c) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) g0c.b) && Intrinsics.areEqual((Object) this.c, (Object) g0c.c) && Intrinsics.areEqual((Object) this.d, (Object) g0c.d);
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
