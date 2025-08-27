package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: fw4  reason: default package */
public final class fw4 {
    public final int a;
    public final mz8 b;
    public final CopyOnWriteArrayList c;

    public fw4() {
        this(new CopyOnWriteArrayList(), 0, (mz8) null);
    }

    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            dw4 dw4 = (dw4) it.next();
            t0g.H(dw4.a, new bw4(this, dw4.b, 3));
        }
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            dw4 dw4 = (dw4) it.next();
            t0g.H(dw4.a, new bw4(this, dw4.b, 1));
        }
    }

    public final void c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            dw4 dw4 = (dw4) it.next();
            t0g.H(dw4.a, new bw4(this, dw4.b, 2));
        }
    }

    public final void d(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            dw4 dw4 = (dw4) it.next();
            t0g.H(dw4.a, new kh1((Object) this, (Object) dw4.b, i, 8));
        }
    }

    public final void e(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            dw4 dw4 = (dw4) it.next();
            t0g.H(dw4.a, new ktg(this, dw4.b, exc, 24));
        }
    }

    public final void f() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            dw4 dw4 = (dw4) it.next();
            t0g.H(dw4.a, new bw4(this, dw4.b, 0));
        }
    }

    public fw4(CopyOnWriteArrayList copyOnWriteArrayList, int i, mz8 mz8) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = mz8;
    }
}
