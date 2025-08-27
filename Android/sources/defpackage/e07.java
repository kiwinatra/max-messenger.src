package defpackage;

import java.util.List;

/* renamed from: e07  reason: default package */
public final class e07 extends vj0 {
    public final List v;
    public final long w;

    public e07(long j, List list) {
        super(1, 0, (long) (list.size() - 1));
        this.w = j;
        this.v = list;
    }

    public final long a() {
        c();
        return this.w + ((z07) this.v.get((int) this.o)).v;
    }

    public final long b() {
        c();
        z07 z07 = (z07) this.v.get((int) this.o);
        return this.w + z07.v + z07.c;
    }
}
