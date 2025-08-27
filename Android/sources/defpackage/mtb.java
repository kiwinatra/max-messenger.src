package defpackage;

/* renamed from: mtb  reason: default package */
public final class mtb {
    public static final mtb c = new mtb(0, 0);
    public static final mtb d = new mtb(30, 0);
    public final int a;
    public final int b;

    public mtb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Presence{type=");
        sb.append(this.a);
        sb.append(",seen=");
        return wj6.l(sb, this.b, "}");
    }
}
