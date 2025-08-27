package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m1g  reason: default package */
public final class m1g {
    public final l1g a;
    public final k1g b;
    public final List c;

    public m1g(l1g l1g, k1g k1g, List list) {
        this.a = l1g;
        this.b = k1g;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1g)) {
            return false;
        }
        m1g m1g = (m1g) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) m1g.a) && Intrinsics.areEqual((Object) this.b, (Object) m1g.b) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) this.c, (Object) m1g.c);
    }

    public final int hashCode() {
        int i = 0;
        l1g l1g = this.a;
        int hashCode = (l1g == null ? 0 : l1g.hashCode()) * 31;
        k1g k1g = this.b;
        if (k1g != null) {
            i = k1g.hashCode();
        }
        return this.c.hashCode() + ((hashCode + i) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VectorBackgroundModel(pattern=");
        sb.append(this.a);
        sb.append(", gradient=");
        sb.append(this.b);
        sb.append(", blur=null, colorEllipse=");
        return tr1.l(sb, this.c, ")");
    }
}
