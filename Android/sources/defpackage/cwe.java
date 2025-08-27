package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* renamed from: cwe  reason: default package */
public final class cwe extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ hwe b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cwe(hwe hwe, Continuation continuation) {
        super(2, continuation);
        this.b = hwe;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        cwe cwe = new cwe(this.b, continuation);
        cwe.a = obj;
        return cwe;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cwe) create((pve) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        List list;
        List<bqe> list2;
        w8e w8e;
        mqe mqe;
        int i;
        xme xme;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        pve pve = (pve) this.a;
        List list3 = pve.a;
        if (!(list3 == null || (list = pve.b) == null || (list2 = pve.c) == null || (w8e = pve.d) == null)) {
            KProperty[] kPropertyArr = hwe.z0;
            hwe hwe = this.b;
            hwe.getClass();
            ArrayList arrayList = new ArrayList();
            boolean z = !list3.isEmpty();
            xme xme2 = hwe.Z;
            if (z) {
                mqe = new mqe(-9223372036854775807L, new igf(ava.l), (String) null, Integer.valueOf(cad.d2), hwe.l(-9223372036854775807L, list3), lqe.a, ((qve) xme2.getValue()).a == 0, false, 132);
            } else {
                mqe = null;
            }
            mqe mqe2 = list.isEmpty() ^ true ? new mqe(-9223372036854775806L, new igf(ava.j), (String) null, Integer.valueOf(cad.M), hwe.l(-9223372036854775806L, list), lqe.b, mqe == null, false, 132) : null;
            boolean z2 = mqe == null && mqe2 == null;
            List list4 = w8e.a;
            mqe mqe3 = list4.isEmpty() ^ true ? new mqe(-9223372036854775805L, new igf(ava.k), (String) null, Integer.valueOf(yua.e), hwe.l(-9223372036854775805L, list4), lqe.c, z2, false, 132) : null;
            ArrayList arrayList2 = new ArrayList();
            for (Object next : CollectionsKt.take(w8e.b, 100)) {
                bqe bqe = (bqe) next;
                Iterable iterable = list2;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        xme = xme2;
                        if (bqe.a == ((bqe) it.next()).a) {
                            break;
                        }
                        xme2 = xme;
                    }
                }
                xme = xme2;
                arrayList2.add(next);
                xme2 = xme;
            }
            xme xme3 = xme2;
            List createListBuilder = CollectionsKt.createListBuilder();
            createListBuilder.add(zg5.a);
            if (mqe != null) {
                hwe.j(createListBuilder, mqe, arrayList);
            }
            if (mqe2 != null) {
                hwe.j(createListBuilder, mqe2, arrayList);
            }
            if (mqe3 != null) {
                hwe.j(createListBuilder, mqe3, arrayList);
            }
            for (bqe k : list2) {
                hwe.j(createListBuilder, hwe.k(k, lqe.o), arrayList);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                mqe k2 = hwe.k((bqe) it2.next(), lqe.v);
                arrayList.add(new wx1(k2.a, k2));
                createListBuilder.add(k2);
            }
            List build = CollectionsKt.build(createListBuilder);
            z68.c(hwe.class.getName(), "stickers loaded, sets:" + arrayList.size() + ",content:" + build.size(), new Object[0]);
            rve rve = new rve(arrayList, build);
            xme xme4 = hwe.z;
            xme4.getClass();
            xme4.m((Object) null, rve);
            long andSet = hwe.Y.getAndSet(0);
            if (andSet > 0) {
                Iterator it3 = ((rve) xme4.getValue()).a.iterator();
                int i2 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i = 1;
                        i2 = -1;
                        break;
                    } else if (((wx1) it3.next()).b.a == andSet) {
                        i = 1;
                        break;
                    } else {
                        i2++;
                    }
                }
                qve qve = new qve(0, RangesKt.coerceAtLeast(i2 - i, 0), 2, andSet);
                xme3.getClass();
                xme3.m((Object) null, qve);
                hwe.m(andSet, (Function1) null);
            }
        }
        return Unit.INSTANCE;
    }
}
