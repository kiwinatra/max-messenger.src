package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: ld3  reason: default package */
public final class ld3 extends f5b implements Serializable {
    public final Comparator[] a;

    public ld3(mw0 mw0, mw0 mw02) {
        this.a = new Comparator[]{mw0, mw02};
    }

    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ld3) {
            return Arrays.equals(this.a, ((ld3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return wj6.n(new StringBuilder("Ordering.compound("), Arrays.toString(this.a), ")");
    }
}
