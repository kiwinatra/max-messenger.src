package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: ov  reason: default package */
public final class ov {
    public static final k40 h = new k40(1);
    public final vz7 a;
    public final dm4 b;
    public final k40 c;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public List e;
    public List f = Collections.emptyList();
    public int g;

    public ov(y35 y35, dm4 dm4) {
        this.a = y35;
        this.b = dm4;
        this.c = h;
    }

    public final void a(List list, Runnable runnable) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((gz7) it.next()).a.F(list, this.f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List list, Runnable runnable) {
        int i = this.g + 1;
        this.g = i;
        List list2 = this.e;
        if (list != list2) {
            List list3 = this.f;
            vz7 vz7 = this.a;
            if (list == null) {
                int size = list2.size();
                this.e = null;
                this.f = Collections.emptyList();
                vz7.h(0, size);
                a(list3, runnable);
            } else if (list2 == null) {
                this.e = list;
                this.f = Collections.unmodifiableList(list);
                vz7.f(0, list.size());
                a(list3, runnable);
            } else {
                ((Executor) this.b.b).execute(new nv(this, list2, list, i, runnable));
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
