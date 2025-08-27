package defpackage;

import java.util.List;

/* renamed from: mc0  reason: default package */
public final class mc0 {
    public final q3f a;
    public final List b;

    public mc0(q3f q3f, List list) {
        if (q3f != null) {
            this.a = q3f;
            if (list != null) {
                this.b = list;
                return;
            }
            throw new NullPointerException("Null outConfigs");
        }
        throw new NullPointerException("Null surfaceEdge");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mc0)) {
            return false;
        }
        mc0 mc0 = (mc0) obj;
        return this.a.equals(mc0.a) && this.b.equals(mc0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{surfaceEdge=");
        sb.append(this.a);
        sb.append(", outConfigs=");
        return tr1.l(sb, this.b, "}");
    }
}
