package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ct1  reason: default package */
public final class ct1 extends bt1 {
    public final ArrayList a = new ArrayList();

    public ct1(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bt1 bt1 = (bt1) it.next();
            if (!(bt1 instanceof dt1)) {
                this.a.add(bt1);
            }
        }
    }

    public final void a(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bt1) it.next()).a(i);
        }
    }

    public final void b(int i, it1 it1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bt1) it.next()).b(i, it1);
        }
    }

    public final void c(int i, dbe dbe) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bt1) it.next()).c(i, dbe);
        }
    }

    public final void d(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bt1) it.next()).d(i);
        }
    }
}
