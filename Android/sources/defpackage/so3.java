package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* renamed from: so3  reason: default package */
public final class so3 extends qm implements lcf {
    public final int o;
    public final int v = 40;

    public so3(long j, int i) {
        super(j);
        this.o = i;
    }

    public final void e(ibf ibf) {
        List<fo3> list;
        List list2;
        List list3 = ((to3) ibf).c;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object next : list3) {
                try {
                    if (((fo3) next) != do3.y0) {
                        arrayList.add(next);
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            list = arrayList;
        } else {
            list = Collections.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (fo3 fo3 : list) {
            if (m().m(fo3.a)) {
                arrayList2.add(fo3);
            } else {
                arrayList3.add(fo3);
            }
        }
        m().C(arrayList2, tm3.a);
        m().C(arrayList3, tm3.b);
        sv0 k = k();
        if (list.isEmpty()) {
            list2 = CollectionsKt.emptyList();
        } else {
            Collection<fo3> collection = list;
            ArrayList arrayList4 = new ArrayList(collection.size());
            for (fo3 fo32 : collection) {
                try {
                    arrayList4.add(Long.valueOf(fo32.a));
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            }
            list2 = arrayList4;
        }
        k.c(new wo3(this.o, this.a, list2));
    }

    public final fbf g() {
        np2 np2 = new np2((x3b) null, 7);
        np2.t("status", "BLOCKED");
        int i = this.o;
        if (i > 0) {
            np2.h(i, "from");
        }
        int i2 = this.v;
        if (i2 > 0) {
            np2.h(i2, NewHtcHomeBadger.COUNT);
        }
        return np2;
    }

    public final void h(qaf qaf) {
        boolean z = qaf instanceof aaf;
        long j = this.a;
        if (z) {
            k().c(new hj0(j, qaf));
            return;
        }
        k().c(new wo3(this.o, j, CollectionsKt.emptyList()));
    }
}
