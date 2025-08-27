package defpackage;

import java.io.Serializable;

/* renamed from: d5d  reason: default package */
public final class d5d extends f5b implements Serializable {
    public static final d5d a = new f5b();

    public final f5b b() {
        return q5a.a;
    }

    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
