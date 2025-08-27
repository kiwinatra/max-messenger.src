package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: da0  reason: default package */
public final class da0 extends gm0 {
    public final List a;

    public da0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gm0)) {
            return false;
        }
        return this.a.equals(((da0) ((gm0) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return tr1.l(new StringBuilder("BatchedLogRequest{logRequests="), this.a, "}");
    }
}
