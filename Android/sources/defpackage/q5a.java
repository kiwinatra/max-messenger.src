package defpackage;

import java.io.Serializable;

/* renamed from: q5a  reason: default package */
public final class q5a extends f5b implements Serializable {
    public static final q5a a = new f5b();

    public final f5b b() {
        return d5d.a;
    }

    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
