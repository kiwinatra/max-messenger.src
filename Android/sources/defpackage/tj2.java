package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: tj2  reason: default package */
public final class tj2 {
    public final long a;
    public final r62 b;
    public final rl c;
    public final lfd d;
    public final gcf e;
    public final ArrayList f = new ArrayList();
    public mq4 g;
    public long h = 0;

    public tj2(long j, r62 r62, rl rlVar, lfd lfd, gcf gcf) {
        this.a = j;
        this.b = r62;
        this.c = rlVar;
        this.d = lfd;
        this.e = gcf;
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bj2 bj2 = (bj2) it.next();
            long j = bj2.a.a;
            ArrayList arrayList = this.f;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((bj2) it2.next()).a.a == j) {
                        break;
                    }
                } else {
                    arrayList.add(bj2);
                    break;
                }
            }
        }
    }
}
