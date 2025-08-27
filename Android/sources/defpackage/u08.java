package defpackage;

import java.util.Map;

/* renamed from: u08  reason: default package */
public abstract class u08 {
    public static final Object k = new Object();
    public final Object a;
    public final xbd b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final tj7 j;

    public u08(Object obj) {
        this.a = new Object();
        this.b = new xbd();
        this.c = 0;
        this.f = k;
        this.j = new tj7(5, this);
        this.e = obj;
        this.g = 0;
    }

    public static void a(String str) {
        if (!gs.U().o.U()) {
            throw new IllegalStateException(wj6.k("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(t08 t08) {
        if (t08.b) {
            if (!t08.e()) {
                t08.a(false);
                return;
            }
            int i2 = t08.c;
            int i3 = this.g;
            if (i2 < i3) {
                t08.c = i3;
                t08.a.a(this.e);
            }
        }
    }

    public final void c(t08 t08) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (t08 == null) {
                xbd xbd = this.b;
                xbd.getClass();
                vbd vbd = new vbd(xbd);
                xbd.c.put(vbd, Boolean.FALSE);
                while (vbd.hasNext()) {
                    b((t08) ((Map.Entry) vbd.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            } else {
                b(t08);
                t08 = null;
            }
        } while (this.i);
        this.h = false;
    }

    public Object d() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public final void e(jv7 jv7, dla dla) {
        a("observe");
        if (((lv7) jv7.getLifecycle()).d != iu7.a) {
            s08 s08 = new s08(this, jv7, dla);
            t08 t08 = (t08) this.b.d(dla, s08);
            if (t08 != null && !t08.c(jv7)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (t08 == null) {
                jv7.getLifecycle().a(s08);
            }
        }
    }

    public final void f(dla dla) {
        a("observeForever");
        t08 t08 = new t08(this, dla);
        t08 t082 = (t08) this.b.d(dla, t08);
        if (t082 instanceof s08) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (t082 == null) {
            t08.a(true);
        }
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = obj;
        }
        if (z) {
            gs.U().V(this.j);
        }
    }

    public void j(dla dla) {
        a("removeObserver");
        t08 t08 = (t08) this.b.e(dla);
        if (t08 != null) {
            t08.b();
            t08.a(false);
        }
    }

    public void k(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c((t08) null);
    }

    public u08() {
        this.a = new Object();
        this.b = new xbd();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new tj7(5, this);
        this.e = obj;
        this.g = -1;
    }
}
