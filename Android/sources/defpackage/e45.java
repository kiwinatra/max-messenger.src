package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* renamed from: e45  reason: default package */
public final class e45 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ i45 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e45(i45 i45, Continuation continuation) {
        super(2, continuation);
        this.b = i45;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        e45 e45 = new e45(this.b, continuation);
        e45.a = obj;
        return e45;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e45) create((Triple) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        xme xme;
        Object obj2;
        long j;
        long j2;
        hi hiVar;
        Object obj3;
        boolean z = true;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Triple triple = (Triple) this.a;
        List list = (List) triple.component1();
        List list2 = (List) triple.component2();
        List list3 = (List) triple.component3();
        i45 i45 = this.b;
        KProperty[] kPropertyArr = i45.Y;
        i45.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            n25 n25 = null;
            if (!it.hasNext()) {
                break;
            }
            ouc ouc = (ouc) it.next();
            cvc cvc = ouc.a;
            if (cvc == cvc.EMOJI && (ouc instanceof d35)) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    if (Intrinsics.areEqual((Object) ((n25) obj3).c, (Object) ((d35) ouc).c)) {
                        break;
                    }
                }
                n25 n252 = (n25) obj3;
                if (n252 != null) {
                    n25 = new n25(m15.RECENT.a, -n252.b, n252.c, n252.o, n252.v, n252.w);
                }
            } else if (cvc == cvc.ANIMOJI && (hiVar = (hi) ((gk) i45.v.getValue()).i(ouc.b).getValue()) != null) {
                n25 = i45.j(list, hiVar, m15.RECENT.a, 0);
            }
            if (n25 != null) {
                arrayList.add(n25);
            }
        }
        String name = this.b.getClass().getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, name, g63.h("Load emoji. Finish. emojis:", list.size(), list2.size(), ", recent:"), (Throwable) null);
        }
        i45 i452 = this.b;
        i452.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : list) {
            Integer valueOf = Integer.valueOf(((n25) next).a);
            Object obj4 = linkedHashMap.get(valueOf);
            if (obj4 == null) {
                obj4 = new ArrayList();
                linkedHashMap.put(valueOf, obj4);
            }
            ((List) obj4).add(next);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it3 = linkedHashMap.entrySet().iterator();
        while (true) {
            boolean hasNext = it3.hasNext();
            xme = i452.w;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it3.next();
            int intValue = ((Number) entry.getKey()).intValue();
            List list4 = (List) entry.getValue();
            js9 js9 = m15.o;
            int intValue2 = ((Number) entry.getKey()).intValue();
            js9.getClass();
            m15 h = js9.h(intValue2);
            int intValue3 = ((Number) entry.getKey()).intValue();
            arrayList2.add(new vx1(intValue, list4, !arrayList.isEmpty() || !list3.isEmpty() || ((g45) xme.getValue()).a != Integer.MIN_VALUE ? ((g45) xme.getValue()).a == ((Number) entry.getKey()).intValue() : ((Number) entry.getKey()).intValue() == m15.CLASSIC.a, h, (String) null, (String) null, (mgf) null, intValue3 == m15.RECENT.a ? Long.MIN_VALUE : -9223372036854775807L + ((long) intValue3), 496));
        }
        List<vx1> mutableList = CollectionsKt.toMutableList(arrayList2);
        if (!list3.isEmpty()) {
            int i = 0;
            for (Object next2 : list3) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                lk lkVar = (lk) next2;
                boolean isEmpty = arrayList.isEmpty() ^ z;
                ArrayList arrayList3 = new ArrayList();
                int i3 = m15.ANIMOJI.a + i;
                int size = lkVar.d.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList3.add(i452.j(list, (hi) lkVar.d.get(i4), i3, i4));
                }
                m15 m15 = m15.ANIMOJI;
                mgf mgf = new mgf(lkVar.a);
                if (i3 == m15.RECENT.a) {
                    j2 = Long.MIN_VALUE;
                    j = -9223372036854775807L;
                } else {
                    j = -9223372036854775807L;
                    j2 = ((long) i3) - Long.MAX_VALUE;
                }
                mutableList.add(0, new vx1(i3, arrayList3, isEmpty || ((g45) xme.getValue()).a != Integer.MIN_VALUE ? ((g45) xme.getValue()).a == i3 : i == 0, m15, lkVar.b, lkVar.c, mgf, j2, 384));
                i = i2;
                long j3 = j;
                z = true;
            }
        }
        if (!arrayList.isEmpty()) {
            int i5 = m15.RECENT.a;
            m15.o.getClass();
            m15 h2 = js9.h(i5);
            boolean z2 = ((g45) xme.getValue()).a != Integer.MIN_VALUE;
            int i6 = i5;
            obj2 = null;
            mutableList.add(0, new vx1(i6, arrayList, !z2, h2, (String) null, (String) null, (mgf) null, Long.MIN_VALUE, 496));
        } else {
            obj2 = null;
        }
        List createListBuilder = CollectionsKt.createListBuilder();
        for (vx1 vx1 : mutableList) {
            createListBuilder.add(vx1);
            createListBuilder.addAll(vx1.b);
        }
        f45 f45 = new f45(mutableList, CollectionsKt.build(createListBuilder));
        xme xme2 = this.b.z;
        xme2.getClass();
        xme2.m(obj2, f45);
        return Unit.INSTANCE;
    }
}
