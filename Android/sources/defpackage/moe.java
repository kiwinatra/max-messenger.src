package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;

/* renamed from: moe  reason: default package */
public final class moe implements nre {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final hs7 d;
    public final jtb e;
    public final hs7 f;
    public final hs7 g;
    public final lfd h;
    public final lfd i;
    public final hs7 j;
    public final hs7 k;
    public ao1 l;
    public final om0 m = om0.I(Collections.emptyList());

    public moe(hs7 hs7, jtb jtb, hs7 hs72, hs7 hs73, lfd lfd, lfd lfd2, hs7 hs74, hs7 hs75) {
        this.d = hs7;
        this.e = jtb;
        this.f = hs72;
        this.g = hs73;
        this.h = lfd;
        this.i = lfd2;
        this.j = hs74;
        this.k = hs75;
    }

    public final yia a() {
        return new yia(((gvc) this.k.get()).b().a(CollectionsKt.listOf(cvc.STICKER)), new joe(this, 5), 3);
    }

    public final ArrayList b(a32 a32, List list, boolean z) {
        boolean z2;
        mmd mmd;
        ArrayList arrayList = new ArrayList();
        for (j72 j72 : a32.b.y) {
            arrayList.add(new vte(j72.a, j72.b, j72.c, j72.d));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                }
                vte vte = (vte) it2.next();
                if (str.equals(vte.b)) {
                    arrayList2.add(vte);
                    z2 = true;
                    break;
                }
            }
            if (z2 || (mmd = (mmd) this.b.get(str)) == null || mmd.a != 2) {
                if (!z2 && !z) {
                    arrayList2.clear();
                    break;
                }
            } else {
                arrayList2.add((vte) mmd);
            }
        }
        return arrayList2;
    }

    public final boe c(long j2) {
        return (boe) this.a.get(Long.valueOf(j2));
    }

    public final ArrayList d(vte vte) {
        ArrayList arrayList = new ArrayList();
        Iterator it = vte.o.iterator();
        while (it.hasNext()) {
            Long l2 = (Long) it.next();
            l2.getClass();
            boe boe = (boe) this.a.get(l2);
            if (boe != null) {
                arrayList.add(boe);
            }
        }
        return arrayList;
    }

    public final wbe e(List list) {
        z68.c("moe", "getStickersByIds: ids count=%d", Integer.valueOf(list.size()));
        return new oa3(4, new wbe(new yia(new mha(jha.n(this.a.entrySet()), new x52(28, list), 1), new mqd(5), 3).B(), new ioe(this, list, 1), 0), new q0a(0)).C(new fcf(list, new mqd(19)));
    }

    public final ArrayList f(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long l2 = (Long) it.next();
            l2.getClass();
            if (((boe) this.a.get(l2)) == null) {
                arrayList.add(l2);
            }
        }
        return arrayList;
    }

    public final fce g(List list) {
        z68.c("moe", "loadNetworkStickers: %s", list);
        cjf.N(list);
        oa3 h2 = jha.n(cjf.Q(list)).h(new joe(this, 0));
        ArrayList arrayList = new ArrayList();
        return new sha(h2, new fj6(arrayList), new mqd(6)).n(this.h);
    }

    public final synchronized void h(List list) {
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                boe boe = (boe) it.next();
                this.a.put(Long.valueOf(boe.a), boe);
            }
            jbd.a(new p00(21, this, list), this.i, (x6) null, new mqd(11), (lfd) null);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void i() {
        if (!cjf.R(((po5) ((ln5) this.f.get())).q(), this.b)) {
            z68.c("moe", "Failed to store initial showcase", new Object[0]);
        }
    }

    public final void j(List list) {
        ConcurrentHashMap concurrentHashMap;
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            concurrentHashMap = this.b;
            if (!hasNext) {
                break;
            }
            mmd mmd = (mmd) it.next();
            Iterator it2 = concurrentHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                if (((String) ((Map.Entry) it2.next()).getKey()).equals(mmd.b)) {
                    it2.remove();
                }
            }
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            mmd mmd2 = (mmd) it3.next();
            int i2 = mmd2.a;
            String str = mmd2.b;
            if (i2 == 3) {
                if (!((fre) mmd2).o.isEmpty()) {
                    concurrentHashMap.put(str, mmd2);
                }
            } else if (i2 == 2 && !((vte) mmd2).o.isEmpty()) {
                concurrentHashMap.put(str, mmd2);
            }
        }
        this.m.d(concurrentHashMap.values());
    }

    public final void k(List list) {
        z68.c("moe", "Update recent section", new Object[0]);
        int i2 = 0;
        while (i2 < list.size()) {
            mmd mmd = (mmd) list.get(i2);
            if (!"RECENT".equals(mmd.b) || mmd.a != 4) {
                i2++;
            } else {
                jbd.c(this.l);
                gvc gvc = (gvc) this.k.get();
                gvc.getClass();
                List list2 = ((lvc) mmd).c;
                z68.c("gvc", "Replace recents. New size = %d", Integer.valueOf(list2.size()));
                wuc b2 = gvc.b();
                xa3 l2 = new na3(4, b2.b(), new vuc(b2, (ArrayList) list2, 0)).l(this.i);
                ao1 ao1 = new ao1(0, new mqd(9), new ue4(14));
                l2.j(ao1);
                this.l = ao1;
                return;
            }
        }
    }
}
