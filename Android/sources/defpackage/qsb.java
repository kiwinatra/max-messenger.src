package defpackage;

import java.io.Serializable;
import java.util.List;

/* renamed from: qsb  reason: default package */
public final class qsb implements msb, Serializable {
    public final List a;

    public qsb(List list) {
        this.a = list;
    }

    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return true;
            }
            if (!((msb) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qsb) {
            return this.a.equals(((qsb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object next : this.a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(next);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
