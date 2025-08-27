package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wxb  reason: default package */
public final class wxb implements yxb {
    public final ngf a;
    public final ngf b;
    public final List c;

    public wxb(ngf ngf, ngf ngf2, List list) {
        this.a = ngf;
        this.b = ngf2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxb)) {
            return false;
        }
        wxb wxb = (wxb) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) wxb.a) && Intrinsics.areEqual((Object) this.b, (Object) wxb.b) && Intrinsics.areEqual((Object) this.c, (Object) wxb.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ngf ngf = this.b;
        return this.c.hashCode() + ((hashCode + (ngf == null ? 0 : ngf.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowConfirmation(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", buttons=");
        return tr1.l(sb, this.c, ")");
    }
}
