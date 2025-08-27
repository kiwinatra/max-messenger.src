package defpackage;

import java.util.TreeSet;

/* renamed from: ps7  reason: default package */
public final class ps7 implements lx0 {
    public final long a;
    public final TreeSet b = new TreeSet(new oj4(9));
    public long c;

    public ps7(long j) {
        this.a = j;
    }

    public final void a(bx0 bx0, yx0 yx0) {
        this.b.remove(yx0);
        this.c -= yx0.c;
    }

    public final void b(bx0 bx0, yx0 yx0) {
        this.b.add(yx0);
        this.c += yx0.c;
        e(bx0, 0);
    }

    public final void c(bx0 bx0, String str, long j, long j2) {
        if (j2 != -1) {
            e(bx0, j2);
        }
    }

    public final void d(bx0 bx0, yx0 yx0, wae wae) {
        a(bx0, yx0);
        b(bx0, wae);
    }

    public final void e(bx0 bx0, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            yx0 yx0 = (yx0) this.b.first();
            tae tae = (tae) bx0;
            synchronized (tae) {
                tae.m(yx0);
            }
        }
    }
}
