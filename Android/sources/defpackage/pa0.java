package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: pa0  reason: default package */
public final class pa0 {
    public final q3f a;
    public final q3f b;
    public final List c;

    public pa0(q3f q3f, q3f q3f2, ArrayList arrayList) {
        if (q3f != null) {
            this.a = q3f;
            if (q3f2 != null) {
                this.b = q3f2;
                this.c = arrayList;
                return;
            }
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        throw new NullPointerException("Null primarySurfaceEdge");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa0)) {
            return false;
        }
        pa0 pa0 = (pa0) obj;
        return this.a.equals(pa0.a) && this.b.equals(pa0.b) && this.c.equals(pa0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{primarySurfaceEdge=");
        sb.append(this.a);
        sb.append(", secondarySurfaceEdge=");
        sb.append(this.b);
        sb.append(", outConfigs=");
        return tr1.l(sb, this.c, "}");
    }
}
