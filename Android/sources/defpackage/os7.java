package defpackage;

import java.util.TreeSet;

/* renamed from: os7  reason: default package */
public final class os7 {
    public final TreeSet a = new TreeSet(new oj4(8));
    public long b;

    public final void a(cx0 cx0, long j) {
        while (this.b + j > 104857600 && !this.a.isEmpty()) {
            xx0 xx0 = (xx0) this.a.first();
            sae sae = (sae) cx0;
            synchronized (sae) {
                sae.j(xx0);
            }
        }
    }

    public final void b(cx0 cx0, xx0 xx0) {
        this.a.add(xx0);
        this.b += xx0.c;
        a(cx0, 0);
    }
}
