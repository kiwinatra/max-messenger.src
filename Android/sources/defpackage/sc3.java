package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: sc3  reason: default package */
public abstract class sc3 extends yj0 {
    public final HashMap h = new HashMap();
    public Handler i;
    public brf j;

    public final void e() {
        for (qc3 qc3 : this.h.values()) {
            qc3.a.d(qc3.b);
        }
    }

    public final void g() {
        for (qc3 qc3 : this.h.values()) {
            qc3.a.f(qc3.b);
        }
    }

    public void k() {
        for (qc3 qc3 : this.h.values()) {
            qc3.a.k();
        }
    }

    public void q() {
        HashMap hashMap = this.h;
        for (qc3 qc3 : hashMap.values()) {
            qc3.a.p(qc3.b);
            yj0 yj0 = qc3.a;
            eud eud = qc3.c;
            yj0.s(eud);
            yj0.r(eud);
        }
        hashMap.clear();
    }

    public abstract nz8 u(Object obj, nz8 nz8);

    public long v(long j2, Object obj) {
        return j2;
    }

    public int w(int i2, Object obj) {
        return i2;
    }

    public abstract void x(Object obj, yj0 yj0, jkf jkf);

    /* JADX WARNING: type inference failed for: r3v1, types: [tz8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v2, types: [ew4, java.lang.Object] */
    public final void y(Object obj, yj0 yj0) {
        HashMap hashMap = this.h;
        n79.g(!hashMap.containsKey(obj));
        oc3 oc3 = new oc3(this, obj);
        eud eud = new eud(this, obj);
        hashMap.put(obj, new qc3(yj0, oc3, eud));
        Handler handler = this.i;
        handler.getClass();
        yj0.getClass();
        cs csVar = yj0.c;
        csVar.getClass();
        ? obj2 = new Object();
        obj2.a = handler;
        obj2.b = eud;
        ((CopyOnWriteArrayList) csVar.o).add(obj2);
        Handler handler2 = this.i;
        handler2.getClass();
        gw4 gw4 = yj0.d;
        gw4.getClass();
        ? obj3 = new Object();
        obj3.a = handler2;
        obj3.b = eud;
        gw4.c.add(obj3);
        brf brf = this.j;
        mpb mpb = this.g;
        n79.o(mpb);
        yj0.l(oc3, brf, mpb);
        if (!(!this.b.isEmpty())) {
            yj0.d(oc3);
        }
    }
}
