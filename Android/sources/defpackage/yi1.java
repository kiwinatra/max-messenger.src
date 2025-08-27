package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: yi1  reason: default package */
public final class yi1 extends SuspendLambda implements Function6 {
    public /* synthetic */ i9b a;
    public /* synthetic */ ze1 b;
    public /* synthetic */ boolean c;
    public /* synthetic */ me5 o;
    public /* synthetic */ boolean v;
    public final /* synthetic */ jj1 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yi1(jj1 jj1, Continuation continuation) {
        super(6, continuation);
        this.w = jj1;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        boolean booleanValue2 = ((Boolean) obj5).booleanValue();
        yi1 yi1 = new yi1(this.w, (Continuation) obj6);
        yi1.a = (i9b) obj;
        yi1.b = (ze1) obj2;
        yi1.c = booleanValue;
        yi1.o = (me5) obj4;
        yi1.v = booleanValue2;
        return yi1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        jj1 jj1;
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        i9b i9b = this.a;
        ze1 ze1 = this.b;
        boolean z = this.c;
        me5 me5 = this.o;
        boolean z2 = this.v;
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.put(i9b.a.a.getId(), i9b.a);
        ze1 a2 = i9b.a();
        Map map = i9b.c;
        y8b y8b = (y8b) map.get(a2);
        if (y8b != null) {
            y8b y8b2 = (y8b) createMapBuilder.put(y8b.a.getId(), y8b);
        }
        y8b y8b3 = (y8b) map.get(ze1);
        if (y8b3 != null) {
            y8b y8b4 = (y8b) createMapBuilder.put(y8b3.a.getId(), y8b3);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            ze1 ze12 = null;
            if (Intrinsics.areEqual(entry.getKey(), (Object) y8b3 != null ? y8b3.a.getId() : null)) {
                Object key = entry.getKey();
                if (y8b != null) {
                    ze12 = y8b.a.getId();
                }
                if (Intrinsics.areEqual(key, (Object) ze12)) {
                }
            }
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        createMapBuilder.putAll(linkedHashMap);
        Iterable values = MapsKt.build(createMapBuilder).values();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(values, 10)), 16));
        Iterator it = values.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            jj1 = this.w;
            if (!hasNext) {
                break;
            }
            y8b y8b5 = (y8b) it.next();
            linkedHashMap2.put(y8b5.a.getId(), ke8.c(y8b5, y8b5.a.m(), z, z2, jj1.x, me5, ze1));
        }
        xme xme = jj1.D0;
        do {
            value = xme.getValue();
            Map map2 = (Map) value;
        } while (!xme.b(value, linkedHashMap2));
        return Unit.INSTANCE;
    }
}
