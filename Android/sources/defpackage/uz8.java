package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: uz8  reason: default package */
public final class uz8 {
    public final int a;
    public final mz8 b;
    public final CopyOnWriteArrayList c;
    public final long d;

    public uz8() {
        this(new CopyOnWriteArrayList(), 0, (mz8) null, 0);
    }

    public final long a(long j) {
        long M = t0g.M(j);
        if (M == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.d + M;
    }

    public final void b(int i, ca6 ca6, int i2, Object obj, long j) {
        c(new es8(1, i, ca6, i2, obj, a(j), -9223372036854775807L));
    }

    public final void c(es8 es8) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            sz8 sz8 = (sz8) it.next();
            t0g.H(sz8.a, new x55((Object) this, (Object) sz8.b, (Object) es8, 19));
        }
    }

    public final void d(k28 k28, int i, int i2, ca6 ca6, int i3, Object obj, long j, long j2) {
        k28 k282 = k28;
        e(k28, new es8(i, i2, ca6, i3, obj, a(j), a(j2)));
    }

    public final void e(k28 k28, es8 es8) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            sz8 sz8 = (sz8) it.next();
            t0g.H(sz8.a, new qz8(this, sz8.b, k28, es8, 2));
        }
    }

    public final void f(k28 k28, int i, int i2, ca6 ca6, int i3, Object obj, long j, long j2) {
        k28 k282 = k28;
        g(k28, new es8(i, i2, ca6, i3, obj, a(j), a(j2)));
    }

    public final void g(k28 k28, es8 es8) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            sz8 sz8 = (sz8) it.next();
            t0g.H(sz8.a, new qz8(this, sz8.b, k28, es8, 1));
        }
    }

    public final void h(k28 k28, int i, int i2, ca6 ca6, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        k28 k282 = k28;
        j(k28, new es8(i, i2, ca6, i3, obj, a(j), a(j2)), iOException, z);
    }

    public final void i(k28 k28, int i, IOException iOException, boolean z) {
        h(k28, i, -1, (ca6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public final void j(k28 k28, es8 es8, IOException iOException, boolean z) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            sz8 sz8 = (sz8) it.next();
            t0g.H(sz8.a, new dl4(this, sz8.b, k28, es8, iOException, z, 1));
        }
    }

    public final void k(k28 k28, int i, int i2, ca6 ca6, int i3, Object obj, long j, long j2) {
        k28 k282 = k28;
        l(k28, new es8(i, i2, ca6, i3, obj, a(j), a(j2)));
    }

    public final void l(k28 k28, es8 es8) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            sz8 sz8 = (sz8) it.next();
            t0g.H(sz8.a, new qz8(this, sz8.b, k28, es8, 0));
        }
    }

    public final void m(es8 es8) {
        mz8 mz8 = this.b;
        mz8.getClass();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            sz8 sz8 = (sz8) it.next();
            t0g.H(sz8.a, new jh3(12, this, sz8.b, mz8, es8));
        }
    }

    public uz8(CopyOnWriteArrayList copyOnWriteArrayList, int i, mz8 mz8, long j) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = mz8;
        this.d = j;
    }
}
