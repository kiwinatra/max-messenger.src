package defpackage;

import java.util.List;

/* renamed from: sk2  reason: default package */
public final class sk2 extends ij0 {
    public final String b;
    public final List c;
    public final long o;
    public final int v;

    public sk2(long j, String str, List list, long j2, int i) {
        super(j);
        this.b = str;
        this.c = list;
        this.o = j2;
        this.v = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatMessageSearchResultEvent{query='");
        sb.append(this.b);
        sb.append("', results=");
        sb.append(this.c);
        sb.append(", marker=");
        sb.append(this.o);
        sb.append(", total=");
        return tr1.k(sb, this.v, '}');
    }
}
