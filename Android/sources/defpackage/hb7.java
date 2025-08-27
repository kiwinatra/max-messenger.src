package defpackage;

/* renamed from: hb7  reason: default package */
public final class hb7 extends q1 implements lc7, c1g {
    public static final hb7 b = new hb7(true);
    public static final hb7 c = new hb7(false);
    public final boolean a;

    public hb7(boolean z) {
        this.a = z;
    }

    public final String b() {
        return Boolean.toString(this.a);
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
        } else if (g != 2) {
            return false;
        } else {
            return this.a == c1g.w().a;
        }
    }

    public final int g() {
        return 2;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }

    public final hb7 w() {
        return this;
    }

    public final hb7 z() {
        return this;
    }
}
