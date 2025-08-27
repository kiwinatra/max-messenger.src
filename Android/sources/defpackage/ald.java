package defpackage;

import java.io.Serializable;
import java.util.List;

/* renamed from: ald  reason: default package */
public final class ald implements Serializable, Comparable {
    public final int a;
    public final String b;
    public final List c;
    public final a32 o;
    public final vk3 v;
    public final b89 w;
    public final long x;
    public final bac y;

    public ald(int i, String str, List list, a32 a32, vk3 vk3, b89 b89, long j, bac bac) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.o = a32;
        this.v = vk3;
        this.w = b89;
        this.x = j;
        this.y = bac;
    }

    public final int compareTo(Object obj) {
        ald ald = (ald) obj;
        if (ald == null) {
            return 0;
        }
        a32 a32 = this.o;
        a32 a322 = ald.o;
        return (a32 == null || a322 == null) ? (a32 == null || a322 != null) ? 0 : -1 : Long.compare(a322.n(), a32.n());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchResult{type=");
        sb.append(i2a.q(this.a));
        sb.append(", feedback='");
        sb.append(this.b);
        sb.append("', highlights=");
        sb.append(this.c.size());
        sb.append(", chat=");
        sb.append(this.o);
        sb.append(", contact=");
        sb.append(this.v);
        sb.append(", message=");
        sb.append(this.w);
        sb.append(", chatId=");
        return i2a.j(sb, this.x, '}');
    }
}
