package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: yj0  reason: default package */
public abstract class yj0 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final cs c = new cs(new CopyOnWriteArrayList(), 0, (nz8) null);
    public final gw4 d = new gw4(new CopyOnWriteArrayList(), 0, (nz8) null);
    public Looper e;
    public jkf f;
    public mpb g;

    public boolean a(ir8 ir8) {
        return false;
    }

    public final cs b(nz8 nz8) {
        return new cs((CopyOnWriteArrayList) this.c.o, 0, nz8);
    }

    public abstract mt8 c(nz8 nz8, cb4 cb4, long j);

    public final void d(pz8 pz8) {
        HashSet hashSet = this.b;
        boolean z = !hashSet.isEmpty();
        hashSet.remove(pz8);
        if (z && hashSet.isEmpty()) {
            e();
        }
    }

    public void e() {
    }

    public final void f(pz8 pz8) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(pz8);
        if (isEmpty) {
            g();
        }
    }

    public void g() {
    }

    public jkf h() {
        return null;
    }

    public abstract ir8 i();

    public boolean j() {
        return true;
    }

    public abstract void k();

    public final void l(pz8 pz8, brf brf, mpb mpb) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        n79.g(looper == null || looper == myLooper);
        this.g = mpb;
        jkf jkf = this.f;
        this.a.add(pz8);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(pz8);
            m(brf);
        } else if (jkf != null) {
            f(pz8);
            pz8.a(this, jkf);
        }
    }

    public abstract void m(brf brf);

    public final void n(jkf jkf) {
        this.f = jkf;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((pz8) it.next()).a(this, jkf);
        }
    }

    public abstract void o(mt8 mt8);

    public final void p(pz8 pz8) {
        ArrayList arrayList = this.a;
        arrayList.remove(pz8);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.b.clear();
            q();
            return;
        }
        d(pz8);
    }

    public abstract void q();

    public final void r(iw4 iw4) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ew4 ew4 = (ew4) it.next();
            if (ew4.b == iw4) {
                copyOnWriteArrayList.remove(ew4);
            }
        }
    }

    public final void s(wz8 wz8) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.o;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            tz8 tz8 = (tz8) it.next();
            if (tz8.b == wz8) {
                copyOnWriteArrayList.remove(tz8);
            }
        }
    }

    public void t(ir8 ir8) {
    }
}
