package defpackage;

import java.util.List;
import java.util.concurrent.Executors;

/* renamed from: jj0  reason: default package */
public abstract class jj0 extends tyc {
    public Object o;

    public jj0(j4b j4b) {
        gz7 gz7 = new gz7(this);
        y35 y35 = new y35(2, (Object) this);
        synchronized (n79.c) {
            try {
                if (n79.d == null) {
                    n79.d = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        ov ovVar = new ov(y35, new dm4(3, (Object) n79.d, (Object) j4b));
        this.o = ovVar;
        ovVar.d.add(gz7);
    }

    public Object E(int i) {
        return ((ov) this.o).f.get(i);
    }

    public void F(List list, List list2) {
    }

    public void G(List list) {
        ((ov) this.o).b(list, (Runnable) null);
    }

    public void H(List list, Runnable runnable) {
        ((ov) this.o).b(list, runnable);
    }

    public int j() {
        return ((ov) this.o).f.size();
    }

    public jj0(dm4 dm4) {
        gz7 gz7 = new gz7(this);
        ov ovVar = new ov(new y35(2, (Object) this), dm4);
        this.o = ovVar;
        ovVar.d.add(gz7);
    }
}
