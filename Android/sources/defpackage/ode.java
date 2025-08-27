package defpackage;

/* renamed from: ode  reason: default package */
public final class ode {
    public static final ode c = new ode(-1, -1);
    public final int a;
    public final int b;

    static {
        new ode(0, 0);
    }

    public ode(int i, int i2) {
        n79.g((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ode)) {
            return false;
        }
        ode ode = (ode) obj;
        return this.a == ode.a && this.b == ode.b;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i << 16;
        return this.b ^ ((i >>> 16) | i2);
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
