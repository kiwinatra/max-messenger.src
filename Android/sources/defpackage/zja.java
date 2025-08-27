package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zja  reason: default package */
public final class zja extends AtomicReference implements wja {
    public vja a;
    public int b;
    public final boolean c = false;
    public final int o;

    public zja() {
        vja vja = new vja((Object) null);
        this.a = vja;
        set(vja);
        this.o = 1;
    }

    public final void b(Object obj) {
        vja vja = new vja(obj);
        this.a.set(vja);
        this.a = vja;
        int i = this.b + 1;
        this.b = i;
        if (i > this.o) {
            vja vja2 = (vja) ((vja) get()).get();
            this.b--;
            if (this.c) {
                vja vja3 = new vja((Object) null);
                vja3.lazySet(vja2.get());
                vja2 = vja3;
            }
            set(vja2);
        }
    }

    public final void d(uja uja) {
        if (uja.getAndIncrement() == 0) {
            int i = 1;
            do {
                vja vja = (vja) uja.c;
                if (vja == null) {
                    vja = (vja) get();
                    uja.c = vja;
                }
                while (!uja.o) {
                    vja vja2 = (vja) vja.get();
                    if (vja2 != null) {
                        if (lea.a(uja.b, vja2.a)) {
                            uja.c = null;
                            return;
                        }
                        vja = vja2;
                    } else {
                        uja.c = vja;
                        i = uja.addAndGet(-i);
                    }
                }
                uja.c = null;
                return;
            } while (i != 0);
        }
    }

    public final void e() {
        vja vja = new vja(lea.a);
        this.a.set(vja);
        this.a = vja;
        this.b++;
        vja vja2 = (vja) get();
        if (vja2.a != null) {
            vja vja3 = new vja((Object) null);
            vja3.lazySet(vja2.get());
            set(vja3);
        }
    }

    public final void f(Throwable th) {
        vja vja = new vja(new jea(th));
        this.a.set(vja);
        this.a = vja;
        this.b++;
        vja vja2 = (vja) get();
        if (vja2.a != null) {
            vja vja3 = new vja((Object) null);
            vja3.lazySet(vja2.get());
            set(vja3);
        }
    }
}
