package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;

/* renamed from: oj7  reason: default package */
public final class oj7 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    public oj7(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
    }

    public final void a(Collection collection) {
        Collection collection2 = collection;
        if (!collection.isEmpty()) {
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                a67.d(w78.o, "oj7", wj6.h(collection.size(), "invalidateChatsInternal, contactsIds.size() = "), (Throwable) null);
            }
            List<a32> I = ((r62) this.a.getValue()).I(r62.I);
            esb esb = (esb) this.c.getValue();
            r62 r62 = (r62) this.a.getValue();
            esb.getClass();
            ws wsVar = new ws(collection2);
            z68.c("esb", "invalidatePreprocessedDataByContacts, contactIds = %d", Integer.valueOf(wsVar.c));
            ArrayList arrayList = new ArrayList();
            ws wsVar2 = new ws(0);
            for (Map.Entry value : esb.c.entrySet()) {
                gsb gsb = (gsb) value.getValue();
                boolean contains = wsVar.contains(Long.valueOf(gsb.d.w));
                ha9 ha9 = gsb.d;
                if (contains) {
                    arrayList.add(ha9);
                    wsVar2.add(Long.valueOf(ha9.b));
                }
                ha9 ha92 = ha9.A0;
                if (ha92 != null && wsVar.contains(Long.valueOf(ha92.w))) {
                    arrayList.add(ha9);
                    wsVar2.add(Long.valueOf(ha9.b));
                }
                q10 f = ha9.f();
                if (f != null) {
                    if (!wsVar.contains(Long.valueOf(f.b))) {
                        Iterator it = f.c.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (wsVar.contains((Long) it.next())) {
                                    arrayList.add(ha9);
                                    wsVar2.add(Long.valueOf(ha9.b));
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } else {
                        arrayList.add(ha9);
                        wsVar2.add(Long.valueOf(ha9.b));
                    }
                }
            }
            z68.c("esb", "invalidated messages count = %d", Integer.valueOf(arrayList.size()));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ha9 ha93 = (ha9) it2.next();
                a32 G = r62.G(ha93.z);
                if (G == null) {
                    z68.p("esb", "don't create and put preprocessed data, because chat is null");
                } else {
                    esb.b(G, ha93);
                    long j = ha93.z;
                    twf twf = r10;
                    twf twf2 = new twf(0, j, ha93.b);
                    esb.a.c(twf);
                }
            }
            Set unmodifiableSet = Collections.unmodifiableSet(wsVar2);
            ws wsVar3 = new ws(0);
            for (a32 a32 : I) {
                ArrayList k = a32.k();
                ws wsVar4 = new ws(0);
                Iterator it3 = k.iterator();
                while (it3.hasNext()) {
                    wsVar4.add(Long.valueOf(((vk3) it3.next()).r()));
                }
                if (!Collections.disjoint(collection2, wsVar4)) {
                    wsVar3.add(Long.valueOf(a32.b.a));
                    a32.p0((km3) this.b.getValue());
                }
                a89 a89 = a32.c;
                if (a89 != null && unmodifiableSet.contains(Long.valueOf(a89.a.b))) {
                    ((r62) this.a.getValue()).u0(a32.a, a32.c.a, true);
                    wsVar3.add(Long.valueOf(a32.b.a));
                }
            }
            if (!wsVar3.isEmpty()) {
                ((qwa) this.d.getValue()).d(wsVar3);
            }
        }
    }
}
