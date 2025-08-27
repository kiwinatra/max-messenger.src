package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: gw4  reason: default package */
public final class gw4 {
    public final int a;
    public final nz8 b;
    public final CopyOnWriteArrayList c;

    public gw4(CopyOnWriteArrayList copyOnWriteArrayList, int i, nz8 nz8) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = nz8;
    }

    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ew4 ew4 = (ew4) it.next();
            v0g.W(ew4.a, new cw4(this, ew4.b, 3));
        }
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ew4 ew4 = (ew4) it.next();
            v0g.W(ew4.a, new cw4(this, ew4.b, 1));
        }
    }

    public final void c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ew4 ew4 = (ew4) it.next();
            v0g.W(ew4.a, new cw4(this, ew4.b, 2));
        }
    }

    public final void d(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ew4 ew4 = (ew4) it.next();
            v0g.W(ew4.a, new kh1((Object) this, (Object) ew4.b, i, 7));
        }
    }

    public final void e(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ew4 ew4 = (ew4) it.next();
            v0g.W(ew4.a, new ktg(this, ew4.b, exc, 25));
        }
    }

    public final void f() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ew4 ew4 = (ew4) it.next();
            v0g.W(ew4.a, new cw4(this, ew4.b, 0));
        }
    }
}
