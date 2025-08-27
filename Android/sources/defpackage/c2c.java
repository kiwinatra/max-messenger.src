package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c2c  reason: default package */
public final class c2c extends f2c {
    public final ngf a;
    public final ngf b;
    public final List c;

    public c2c(igf igf, igf igf2, List list) {
        this.a = igf;
        this.b = igf2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2c)) {
            return false;
        }
        c2c c2c = (c2c) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) c2c.a) && Intrinsics.areEqual((Object) this.b, (Object) c2c.b) && Intrinsics.areEqual((Object) this.c, (Object) c2c.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ngf ngf = this.b;
        return this.c.hashCode() + ((hashCode + (ngf == null ? 0 : ngf.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowBottomSheet(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", buttons=");
        return tr1.l(sb, this.c, ")");
    }
}
