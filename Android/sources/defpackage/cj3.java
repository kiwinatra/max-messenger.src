package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;

/* renamed from: cj3  reason: default package */
public abstract class cj3 {
    public final qj3 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public Object d;
    public d19 e;

    public cj3(qj3 qj3) {
        this.a = qj3;
    }

    public abstract boolean a(xpg xpg);

    public abstract boolean b(Object obj);

    public final void c(Iterable iterable) {
        this.b.clear();
        this.c.clear();
        ArrayList arrayList = this.b;
        for (Object next : iterable) {
            if (a((xpg) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = this.b;
        ArrayList arrayList3 = this.c;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((xpg) it.next()).a);
        }
        if (this.b.isEmpty()) {
            this.a.n(this);
        } else {
            qj3 qj3 = this.a;
            synchronized (qj3.c) {
                try {
                    if (((LinkedHashSet) qj3.v).add(this)) {
                        if (((LinkedHashSet) qj3.v).size() == 1) {
                            qj3.o = qj3.i();
                            h88 x = h88.x();
                            String str = rj3.a;
                            x.p(str, qj3.getClass().getSimpleName() + ": initial state = " + qj3.o);
                            qj3.r();
                        }
                        Object obj = qj3.o;
                        this.d = obj;
                        d(this.e, obj);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.e, this.d);
    }

    public final void d(d19 d19, Object obj) {
        if (!this.b.isEmpty() && d19 != null) {
            if (obj == null || b(obj)) {
                ArrayList arrayList = this.b;
                synchronized (d19.a) {
                    pog pog = (pog) d19.b;
                    if (pog != null) {
                        pog.a(arrayList);
                        Unit unit = Unit.INSTANCE;
                    }
                }
                return;
            }
            ArrayList arrayList2 = this.b;
            synchronized (d19.a) {
                try {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (d19.e(((xpg) next).a)) {
                            arrayList3.add(next);
                        }
                    }
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        h88 x = h88.x();
                        String str = qog.a;
                        x.p(str, "Constraints met for " + ((xpg) it2.next()));
                    }
                    pog pog2 = (pog) d19.b;
                    if (pog2 != null) {
                        pog2.f(arrayList3);
                        Unit unit2 = Unit.INSTANCE;
                    }
                } finally {
                }
            }
        }
    }
}
