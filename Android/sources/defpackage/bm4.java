package defpackage;

/* renamed from: bm4  reason: default package */
public final class bm4 {
    public final pac a;
    public final int b;
    public final int c;

    public bm4(int i, int i2, Class cls) {
        this(pac.a(cls), i, i2);
    }

    public static bm4 a(Class cls) {
        return new bm4(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bm4)) {
            return false;
        }
        bm4 bm4 = (bm4) obj;
        return this.a.equals(bm4.a) && this.b == bm4.b && this.c == bm4.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else if (i2 == 2) {
            str = "deferred";
        } else {
            throw new AssertionError(wj6.h(i2, "Unsupported injection: "));
        }
        return wj6.n(sb, str, "}");
    }

    public bm4(pac pac, int i, int i2) {
        this.a = pac;
        this.b = i;
        this.c = i2;
    }
}
