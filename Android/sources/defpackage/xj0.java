package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: xj0  reason: default package */
public abstract class xj0 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final uz8 c = new uz8();
    public final fw4 d = new fw4();
    public Looper e;
    public ikf f;
    public lpb g;

    public abstract lt8 a(mz8 mz8, cb4 cb4, long j);

    public final void b(oz8 oz8) {
        HashSet hashSet = this.b;
        boolean z = !hashSet.isEmpty();
        hashSet.remove(oz8);
        if (z && hashSet.isEmpty()) {
            c();
        }
    }

    public void c() {
    }

    public final void d(oz8 oz8) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(oz8);
        if (isEmpty) {
            e();
        }
    }

    public void e() {
    }

    public abstract gr8 f();

    public abstract void g();

    public final void h(oz8 oz8, arf arf, lpb lpb) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        y64.g(looper == null || looper == myLooper);
        this.g = lpb;
        ikf ikf = this.f;
        this.a.add(oz8);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(oz8);
            i(arf);
        } else if (ikf != null) {
            d(oz8);
            oz8.a(this, ikf);
        }
    }

    public abstract void i(arf arf);

    public final void j(ikf ikf) {
        this.f = ikf;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((oz8) it.next()).a(this, ikf);
        }
    }

    public abstract void k(lt8 lt8);

    public final void l(oz8 oz8) {
        ArrayList arrayList = this.a;
        arrayList.remove(oz8);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.b.clear();
            m();
            return;
        }
        b(oz8);
    }

    public abstract void m();

    public final void n(hw4 hw4) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            dw4 dw4 = (dw4) it.next();
            if (dw4.b == hw4) {
                copyOnWriteArrayList.remove(dw4);
            }
        }
    }

    public final void o(vz8 vz8) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            sz8 sz8 = (sz8) it.next();
            if (sz8.b == vz8) {
                copyOnWriteArrayList.remove(sz8);
            }
        }
    }
}
