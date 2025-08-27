package defpackage;

/* renamed from: r54  reason: default package */
public final class r54 {
    public final String a;
    public final long b;
    public long c = 200;
    public long d;

    public r54(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Command{seq:");
        sb.append(this.b);
        sb.append("|retry count:");
        sb.append(this.d);
        sb.append("|retry timeout:");
        sb.append(this.c);
        sb.append('|');
        return g63.l(sb, this.a, '}');
    }
}
