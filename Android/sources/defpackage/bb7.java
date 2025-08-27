package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* renamed from: bb7  reason: default package */
public final class bb7 extends q1 implements lc7, c1g, Iterable {
    public static final bb7 b = new bb7(new c1g[0]);
    public final c1g[] a;

    public bb7(c1g[] c1gArr) {
        this.a = c1gArr;
    }

    public final String b() {
        c1g[] c1gArr = this.a;
        if (c1gArr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(c1gArr[0].b());
        for (int i = 1; i < c1gArr.length; i++) {
            sb.append(",");
            sb.append(c1gArr[i].b());
        }
        sb.append("]");
        return sb.toString();
    }

    public final bb7 e() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c1g)) {
            return false;
        }
        c1g c1g = (c1g) obj;
        boolean z = c1g instanceof bb7;
        c1g[] c1gArr = this.a;
        if (z) {
            return Arrays.equals(c1gArr, ((bb7) c1g).a);
        }
        int g = ((q1) c1g).g();
        if (g == 0) {
            throw null;
        } else if (g != 7) {
            return false;
        } else {
            bb7 e = c1g.e();
            if (c1gArr.length != e.a.length) {
                return false;
            }
            Iterator it = e.iterator();
            for (c1g equals : c1gArr) {
                ab7 ab7 = (ab7) it;
                if (!ab7.hasNext() || !equals.equals(ab7.next())) {
                    return false;
                }
            }
            return true;
        }
    }

    public final int g() {
        return 7;
    }

    public final int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            c1g[] c1gArr = this.a;
            if (i2 >= c1gArr.length) {
                return i;
            }
            i = (i * 31) + c1gArr[i2].hashCode();
            i2++;
        }
    }

    public final Iterator iterator() {
        return new ab7(this.a, 0);
    }

    public final String toString() {
        c1g[] c1gArr = this.a;
        if (c1gArr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        c1g c1g = c1gArr[0];
        if (wzf.d(((q1) c1g).g())) {
            sb.append(c1g.b());
        } else {
            sb.append(c1g.toString());
        }
        for (int i = 1; i < c1gArr.length; i++) {
            sb.append(",");
            c1g c1g2 = c1gArr[i];
            if (wzf.d(((q1) c1g2).g())) {
                sb.append(c1g2.b());
            } else {
                sb.append(c1g2.toString());
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final bb7 x() {
        return this;
    }
}
