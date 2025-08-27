package defpackage;

/* renamed from: qqf  reason: default package */
public final class qqf {
    public static final qqf b = new qqf(k0d.v);
    public static final String c = Integer.toString(0, 36);
    public final tb7 a;

    static {
        lx5 lx5 = tb7.b;
        int i = v0g.a;
    }

    public qqf(k0d k0d) {
        this.a = tb7.p(k0d);
    }

    public final tb7 a() {
        return this.a;
    }

    public final boolean b(int i) {
        int i2 = 0;
        while (true) {
            tb7 tb7 = this.a;
            if (i2 >= tb7.size()) {
                return false;
            }
            pqf pqf = (pqf) tb7.get(i2);
            if (pqf.f() && pqf.e() == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qqf.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((qqf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
