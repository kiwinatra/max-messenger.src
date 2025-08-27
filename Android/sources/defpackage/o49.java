package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;

/* renamed from: o49  reason: default package */
public final class o49 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ r49 c;
    public final /* synthetic */ n39 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o49(n39 n39, r49 r49, List list, Continuation continuation) {
        super(2, continuation);
        this.b = list;
        this.c = r49;
        this.o = n39;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new o49(this.o, this.c, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o49) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        List list = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List list2 = SequencesKt.toList(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(list), new vq7(11, (Object) this.o)), new wg7(13)));
            if (list2.isEmpty()) {
                return list;
            }
            this.a = 1;
            obj = this.c.k(list2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterable iterable = (Iterable) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(Boxing.boxLong(((z29) next).a), next);
        }
        Iterable<z29> iterable2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
        for (z29 z29 : iterable2) {
            z29 z292 = (z29) linkedHashMap.get(Boxing.boxLong(z29.a));
            if (z292 != null) {
                z29 = z292;
            }
            arrayList.add(z29);
        }
        return arrayList;
    }
}
