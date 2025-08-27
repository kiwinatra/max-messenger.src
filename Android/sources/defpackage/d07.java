package defpackage;

import java.util.List;

/* renamed from: d07  reason: default package */
public final class d07 extends vj0 {
    public final List v;
    public final long w;

    public d07(long j, List list) {
        super(0, 0, (long) (list.size() - 1));
        this.w = j;
        this.v = list;
    }

    public final long a() {
        c();
        return this.w + ((y07) this.v.get((int) this.o)).v;
    }

    public final long b() {
        c();
        y07 y07 = (y07) this.v.get((int) this.o);
        return this.w + y07.v + y07.c;
    }
}
