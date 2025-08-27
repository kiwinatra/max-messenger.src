package defpackage;

/* renamed from: zb7  reason: default package */
public final class zb7 extends q1 implements lc7, c1g {
    public static final zb7 b = new zb7(new c1g[0]);
    public final c1g[] a;

    public zb7(c1g[] c1gArr) {
        this.a = c1gArr;
    }

    public static void D(StringBuilder sb, c1g c1g) {
        if (wzf.d(((q1) c1g).g())) {
            sb.append(c1g.b());
        } else {
            sb.append(c1g.toString());
        }
    }

    public final zb7 C() {
        return this;
    }

    public final String b() {
        c1g[] c1gArr = this.a;
        if (c1gArr.length == 0) {
            return "{}";
        }
        StringBuilder o = tr1.o("{");
        c1g c1g = c1gArr[0];
        if (wzf.d(((q1) c1g).g())) {
            o.append(c1g.b());
        } else {
            p1.D(o, c1g.toString());
        }
        o.append(":");
        o.append(c1gArr[1].b());
        for (int i = 2; i < c1gArr.length; i += 2) {
            o.append(",");
            c1g c1g2 = c1gArr[i];
            if (wzf.d(((q1) c1g2).g())) {
                o.append(c1g2.b());
            } else {
                p1.D(o, c1g2.toString());
            }
            o.append(":");
            o.append(c1gArr[i + 1].b());
        }
        o.append("}");
        return o.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c1g)) {
            return false;
        }
        c1g c1g = (c1g) obj;
        int g = ((q1) c1g).g();
        if (g == 0) {
            throw null;
        } else if (g != 8) {
            return false;
        } else {
            zb7 m = c1g.m();
            yb7 yb7 = new yb7(this.a);
            m.getClass();
            return yb7.equals(new yb7(m.a));
        }
    }

    public final int g() {
        return 8;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            c1g[] c1gArr = this.a;
            if (i >= c1gArr.length) {
                return i2;
            }
            i2 += c1gArr[i + 1].hashCode() ^ c1gArr[i].hashCode();
            i += 2;
        }
    }

    public final zb7 m() {
        return this;
    }

    public final String toString() {
        c1g[] c1gArr = this.a;
        if (c1gArr.length == 0) {
            return "{}";
        }
        StringBuilder o = tr1.o("{");
        D(o, c1gArr[0]);
        o.append(":");
        D(o, c1gArr[1]);
        for (int i = 2; i < c1gArr.length; i += 2) {
            o.append(",");
            D(o, c1gArr[i]);
            o.append(":");
            D(o, c1gArr[i + 1]);
        }
        o.append("}");
        return o.toString();
    }
}
