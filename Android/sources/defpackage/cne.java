package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cne  reason: default package */
public abstract class cne implements Runnable {
    public final AtomicInteger a = new AtomicInteger(0);
    public final zi0 b;
    public final bwb c;
    public final yvb o;
    public final String v;

    public cne(zi0 zi0, bwb bwb, yvb yvb, String str) {
        this.b = zi0;
        this.c = bwb;
        this.o = yvb;
        this.v = str;
        bwb.j(yvb, str);
    }

    public final void a() {
        if (this.a.compareAndSet(0, 2)) {
            e();
        }
    }

    public abstract void b(Object obj);

    public Map c(Object obj) {
        return null;
    }

    public abstract Object d();

    public void e() {
        bwb bwb = this.c;
        yvb yvb = this.o;
        String str = this.v;
        bwb.i(yvb, str);
        bwb.k(yvb, str);
        this.b.c();
    }

    public void f(Exception exc) {
        bwb bwb = this.c;
        yvb yvb = this.o;
        String str = this.v;
        bwb.i(yvb, str);
        bwb.d(yvb, str, exc, (Map) null);
        this.b.e(exc);
    }

    public void g(Object obj) {
        bwb bwb = this.c;
        yvb yvb = this.o;
        String str = this.v;
        bwb.a(yvb, str, bwb.i(yvb, str) ? c(obj) : null);
        this.b.g(1, obj);
    }

    public final void run() {
        AtomicInteger atomicInteger = this.a;
        if (atomicInteger.compareAndSet(0, 1)) {
            try {
                Object d = d();
                atomicInteger.set(3);
                try {
                    g(d);
                } finally {
                    b(d);
                }
            } catch (Exception e) {
                atomicInteger.set(4);
                f(e);
            }
        }
    }
}
