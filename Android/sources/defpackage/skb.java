package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;

/* renamed from: skb  reason: default package */
public final class skb extends xag {
    public static final /* synthetic */ KProperty[] y = {rae.s(skb.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;", 0)};
    public final long b;
    public final a59 c;
    public final y59 o;
    public final Lazy v;
    public final xme w = f6e.a((Object) null);
    public final wie x = o5a.U();

    public skb(long j, a59 a59, y59 y59, Lazy lazy) {
        this.b = j;
        this.c = a59;
        this.o = y59;
        this.v = lazy;
        l59 l59 = (l59) a59;
        if (l59.g.compareAndSet(false, true)) {
            ev0.v(l59.f, (CoroutineContext) null, (f14) null, new k59(l59, (Continuation) null), 3);
        }
        bs0.K(new ps5(((l59) y59).l, new pkb(this, (Continuation) null), 5), this.a);
    }

    public static final ArrayList j(skb skb, List list) {
        skb.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            hhb hhb = (hhb) next;
            a32 a32 = (a32) ((my2) ((qx2) skb.v.getValue())).o(skb.b).a.getValue();
            if (a32 != null) {
                ArrayList k = a32.k();
                if (!k.isEmpty()) {
                    Iterator it = k.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((vk3) it.next()).r() == hhb.a) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r4 = (defpackage.a32) ((defpackage.my2) ((defpackage.qx2) r4.v.getValue())).o(r2).a.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k() {
        /*
            r4 = this;
            r0 = 0
            long r2 = r4.b
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x002d
            kotlin.Lazy r4 = r4.v
            java.lang.Object r4 = r4.getValue()
            qx2 r4 = (defpackage.qx2) r4
            my2 r4 = (defpackage.my2) r4
            etc r4 = r4.o(r2)
            ome r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            a32 r4 = (defpackage.a32) r4
            if (r4 == 0) goto L_0x002d
            java.util.ArrayList r4 = r4.k()
            boolean r4 = r4.isEmpty()
            r0 = 1
            r4 = r4 ^ r0
            if (r4 != r0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.skb.k():boolean");
    }
}
