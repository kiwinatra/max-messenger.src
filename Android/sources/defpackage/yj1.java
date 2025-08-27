package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: yj1  reason: default package */
public final class yj1 {
    public final voc a;
    public final ef1 b;
    public final ata c;
    public final mc1 d;
    public final jc1 e;
    public final xe8 f;
    public final ox0 g;
    public final rjf h;

    public yj1(voc voc, ef1 ef1, ata ata, mc1 mc1, jc1 jc1, xe8 xe8, ox0 ox0, rjf rjf) {
        this.a = voc;
        this.b = ef1;
        this.c = ata;
        this.d = mc1;
        this.e = jc1;
        this.f = xe8;
        this.g = ox0;
        this.h = rjf;
    }

    public final void a(eae eae) {
        eae eae2 = eae;
        ywd ywd = new ywd(eae2.a);
        g8b v9a = new v9a(16);
        g8b v9a2 = new v9a(16);
        g8b v9a3 = new v9a(16);
        g8b v9a4 = new v9a(16);
        g8b v9a5 = new v9a(16);
        g8b v9a6 = new v9a(16);
        xga xga = new xga(1, eae2.b);
        Boolean bool = eae2.c;
        if (bool != null) {
            v9a = new xga(1, bool);
        }
        g8b g8b = v9a;
        List list = eae2.d;
        if (list != null) {
            v9a2 = new xga(1, list);
        }
        g8b g8b2 = v9a2;
        List list2 = eae2.e;
        g8b xga2 = list2 != null ? new xga(1, list2) : v9a3;
        List list3 = eae2.f;
        g8b xga3 = list3 != null ? new xga(1, list3) : v9a4;
        Integer num = eae2.h;
        g8b xga4 = num != null ? new xga(1, Integer.valueOf(num.intValue())) : v9a5;
        Long l = null;
        Long l2 = eae2.g;
        if (l2 != null) {
            long longValue = l2.longValue();
            Long a2 = ((sjf) this.h).a();
            if (a2 != null) {
                l = Long.valueOf(System.currentTimeMillis() + (longValue - a2.longValue()));
            }
        }
        y30 y30 = r2;
        y30 y302 = new y30(ywd, xga, g8b, g8b2, xga2, xga3, xga4, new xga(1, eae2.m), l != null ? new xga(1, Long.valueOf(l.longValue())) : v9a6, false);
        qj1 k = this.c.k(y30);
        if (k != null) {
            ef1 ef1 = this.b;
            ywd ywd2 = k.a;
            List list4 = k.d;
            if (list4 != null && CollectionsKt.contains(list4, ef1.a.a)) {
                ef1.p(ywd2);
            } else if (Intrinsics.areEqual((Object) ywd2, (Object) ef1.j)) {
                ef1.p(xwd.a);
            }
            jc1 jc1 = this.e;
            cae cae = eae2.l;
            if (cae != null && (ef1.a.a() || Intrinsics.areEqual((Object) ef1.k, (Object) ywd2))) {
                w8b w8b = cae.a;
                ef1.g(ywd2, w8b.a);
                for (we1 we1 : w8b.b) {
                    jc1.n.onStateChanged(we1.b, we1);
                }
            }
            jc1.f.onRoomUpdated(new wj1(ywd2, b59.e0(k)));
        }
    }

    public final void b(boolean z, ue1 ue1, ywd ywd) {
        v9a v9a = new v9a(16);
        v9a v9a2 = new v9a(16);
        v9a v9a3 = new v9a(16);
        v9a v9a4 = new v9a(16);
        v9a v9a5 = new v9a(16);
        v9a v9a6 = new v9a(16);
        v9a v9a7 = new v9a(16);
        if (z) {
            ue1 = null;
        }
        this.c.k(new y30(ywd, v9a, v9a2, v9a3, v9a4, v9a5, v9a6, new xga(1, ue1), v9a7, true));
    }

    public final void c(boolean z) {
        if (z) {
            hq7 hq7 = new hq7(24, (Object) this);
            hq7 hq72 = new hq7(25, (Object) this);
            ox0 ox0 = this.g;
            o9e o9e = (o9e) ((Function0) ox0.b).invoke();
            if (o9e == null) {
                hq72.invoke(new IllegalStateException("Signaling is not ready or released"));
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "get-rooms");
            o9e.j(jSONObject, new zy0(ox0, hq72, hq7, 1), new ir6(ox0, hq72, 1));
        }
    }

    public final void d(cxd cxd) {
        cxd cxd2 = cxd;
        boolean contains = cxd2.a.contains(dxd.a);
        eae eae = cxd2.c;
        if (contains && eae != null) {
            a(eae);
        }
        dxd dxd = dxd.c;
        Set set = cxd2.a;
        boolean contains2 = set.contains(dxd);
        ata ata = this.c;
        int i = cxd2.b;
        if (contains2) {
            ywd ywd = new ywd(i);
            v9a v9a = new v9a(16);
            v9a v9a2 = new v9a(16);
            v9a v9a3 = new v9a(16);
            v9a v9a4 = new v9a(16);
            v9a v9a5 = new v9a(16);
            v9a v9a6 = new v9a(16);
            xga xga = new xga(1, Boolean.valueOf(!cxd2.d));
            Long l = null;
            Long l2 = eae != null ? eae.g : null;
            if (l2 != null) {
                long longValue = l2.longValue();
                Long a2 = ((sjf) this.h).a();
                if (a2 != null) {
                    l = Long.valueOf(System.currentTimeMillis() + (longValue - a2.longValue()));
                }
            }
            ata.k(new y30(ywd, v9a, xga, v9a2, v9a3, v9a4, v9a5, v9a6, new xga(1, l), false));
        }
        set.contains(dxd.o);
        if (set.contains(dxd.b)) {
            ywd ywd2 = new ywd(i);
            ef1 ef1 = this.b;
            if (Intrinsics.areEqual((Object) ef1.j, (Object) ywd2)) {
                ef1.p(xwd.a);
            }
            ((HashMap) ata.c).remove(ywd2);
            ((jc1) ata.b).f.onRoomRemoved(new vj1(ywd2));
        }
    }

    public final void e(fae fae) {
        jc1 jc1;
        List<eae> list = fae.b;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (eae eae : list) {
            arrayList.add(new ywd(eae.a));
        }
        Set set = CollectionsKt.toSet(arrayList);
        ata ata = this.c;
        for (ywd ywd : CollectionsKt.toSet(((HashMap) ata.c).keySet())) {
            if (!set.contains(ywd)) {
                ((HashMap) ata.c).remove(ywd);
                ((jc1) ata.b).f.onRoomRemoved(new vj1(ywd));
            }
        }
        List<eae> list2 = fae.b;
        for (eae a2 : list2) {
            a(a2);
        }
        Iterator it = list2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            jc1 = this.e;
            if (!hasNext) {
                break;
            }
            eae eae2 = (eae) it.next();
            jc1.g.a(new ox0(4, (Object) eae2.i, (Object) new ywd(eae2.a)));
        }
        for (eae eae3 : list2) {
            jc1.q.onUrlSharingInfoUpdated(new hm1(new ywd(eae3.a), eae3.n));
        }
        for (eae eae4 : list2) {
            jc1.h.a(new xe8(5, eae4.j, new ywd(eae4.a)));
        }
        for (eae eae5 : list2) {
            this.d.l(eae5.k, new JSONObject(), "CallSessionRoomsManager#applyMuteStates", kc1.a, new ywd(eae5.a), true);
        }
        zwd zwd = fae.a;
        if (!(zwd instanceof xwd)) {
            ef1 ef1 = this.b;
            if (!Intrinsics.areEqual((Object) ef1.k, (Object) zwd)) {
                ef1.n(zwd);
                jc1.f.onCurrentParticipantActiveRoomChanged(new tj1(zwd, zwd instanceof ywd ? ata.v((ywd) zwd) : null));
            }
            x8b[] x8bArr = x8b.a;
            this.f.A(new rt6(zwd), new o14(1, this, zwd), new hq7(23, (Object) this));
        }
    }
}
