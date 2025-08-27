package defpackage;

import android.os.Handler;
import java.util.HashMap;

/* renamed from: rc3  reason: default package */
public abstract class rc3 extends xj0 {
    public final HashMap h = new HashMap();
    public Handler i;
    public arf j;

    public final void c() {
        for (pc3 pc3 : this.h.values()) {
            pc3.a.b(pc3.b);
        }
    }

    public final void e() {
        for (pc3 pc3 : this.h.values()) {
            pc3.a.d(pc3.b);
        }
    }

    public void g() {
        for (pc3 pc3 : this.h.values()) {
            pc3.a.g();
        }
    }

    public void m() {
        HashMap hashMap = this.h;
        for (pc3 pc3 : hashMap.values()) {
            pc3.a.l(pc3.b);
            xj0 xj0 = pc3.a;
            srd srd = pc3.c;
            xj0.o(srd);
            xj0.n(srd);
        }
        hashMap.clear();
    }

    public mz8 p(Object obj, mz8 mz8) {
        return mz8;
    }

    public abstract void q(Integer num, xj0 xj0, ikf ikf);

    /* JADX WARNING: type inference failed for: r2v0, types: [srd, hw4, vz8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v4, types: [sz8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v5, types: [dw4, java.lang.Object] */
    public final void r(Integer num, xj0 xj0) {
        HashMap hashMap = this.h;
        y64.g(!hashMap.containsKey(num));
        nc3 nc3 = new nc3(this, num);
        ? obj = new Object();
        obj.o = this;
        obj.b = new uz8(this.c.c, 0, (mz8) null, 0);
        obj.c = new fw4(this.d.c, 0, (mz8) null);
        obj.a = num;
        hashMap.put(num, new pc3(xj0, nc3, obj));
        Handler handler = this.i;
        handler.getClass();
        xj0.getClass();
        uz8 uz8 = xj0.c;
        uz8.getClass();
        ? obj2 = new Object();
        obj2.a = handler;
        obj2.b = obj;
        uz8.c.add(obj2);
        Handler handler2 = this.i;
        handler2.getClass();
        fw4 fw4 = xj0.d;
        fw4.getClass();
        ? obj3 = new Object();
        obj3.a = handler2;
        obj3.b = obj;
        fw4.c.add(obj3);
        arf arf = this.j;
        lpb lpb = this.g;
        y64.k(lpb);
        xj0.h(nc3, arf, lpb);
        if (!(!this.b.isEmpty())) {
            xj0.b(nc3);
        }
    }
}
