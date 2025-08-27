package defpackage;

/* renamed from: nu6  reason: default package */
public final class nu6 {
    public final ru6 a;
    public final tu6 b;
    public boolean c = true;

    public nu6(ru6 ru6, tu6 tu6) {
        this.a = ru6;
        this.b = tu6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" ");
        sb.append(!this.c ? "+>" : "->");
        sb.append(" ");
        sb.append(this.b);
        return sb.toString();
    }
}
