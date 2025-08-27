package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;

/* renamed from: ym4  reason: default package */
public final class ym4 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ ds5 c;
    public /* synthetic */ Object[] o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ym4(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ds5 ds5 = (ds5) obj;
        Object[] objArr = (Object[]) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                ym4 ym4 = new ym4(3, continuation, 0);
                ym4.c = ds5;
                ym4.o = objArr;
                return ym4.invokeSuspend(Unit.INSTANCE);
            case 1:
                ym4 ym42 = new ym4(3, continuation, 1);
                ym42.c = ds5;
                ym42.o = objArr;
                return ym42.invokeSuspend(Unit.INSTANCE);
            case 2:
                ym4 ym43 = new ym4(3, continuation, 2);
                ym43.c = ds5;
                ym43.o = objArr;
                return ym43.invokeSuspend(Unit.INSTANCE);
            case 3:
                ym4 ym44 = new ym4(3, continuation, 3);
                ym44.c = ds5;
                ym44.o = objArr;
                return ym44.invokeSuspend(Unit.INSTANCE);
            default:
                ym4 ym45 = new ym4(3, continuation, 4);
                ym45.c = ds5;
                ym45.o = objArr;
                return ym45.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ds5 ds5 = this.c;
                    List[] listArr = (List[]) this.o;
                    ArrayList arrayList = new ArrayList();
                    for (List a2 : listArr) {
                        CollectionsKt__MutableCollectionsKt.addAll(arrayList, a2);
                    }
                    this.b = 1;
                    if (ds5.a(arrayList, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Unit.INSTANCE;
            case 1:
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.b;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ds5 ds52 = this.c;
                    Unit unit = Unit.INSTANCE;
                    this.b = 1;
                    if (ds52.a(unit, this) == coroutine_suspended2) {
                        return coroutine_suspended2;
                    }
                } else if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Unit.INSTANCE;
            case 2:
                Object coroutine_suspended3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.b;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ds5 ds53 = this.c;
                    cua[] cuaArr = (cua[]) this.o;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(cuaArr.length), 16));
                    for (cua cua : cuaArr) {
                        linkedHashMap.put(cua.a, cua);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        linkedHashMap2.put(entry.getKey(), ((cua) entry.getValue()).b);
                    }
                    j66 j66 = new j66(linkedHashMap2);
                    this.b = 1;
                    if (ds53.a(j66, this) == coroutine_suspended3) {
                        return coroutine_suspended3;
                    }
                } else if (i3 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Unit.INSTANCE;
            case 3:
                Object coroutine_suspended4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.b;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ds5 ds54 = this.c;
                    Iterable filterNotNull = ArraysKt.filterNotNull((a32[]) this.o);
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(filterNotNull, 10)), 16));
                    for (Object next : filterNotNull) {
                        linkedHashMap3.put(Boxing.boxLong(((a32) next).a), next);
                    }
                    this.b = 1;
                    if (ds54.a(linkedHashMap3, this) == coroutine_suspended4) {
                        return coroutine_suspended4;
                    }
                } else if (i4 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Unit.INSTANCE;
            default:
                Object coroutine_suspended5 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = this.b;
                if (i5 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ds5 ds55 = this.c;
                    njb[] njbArr = (njb[]) this.o;
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(njbArr.length), 16));
                    for (njb njb : njbArr) {
                        linkedHashMap4.put(Boxing.boxLong(njb.a), njb);
                    }
                    this.b = 1;
                    if (ds55.a(linkedHashMap4, this) == coroutine_suspended5) {
                        return coroutine_suspended5;
                    }
                } else if (i5 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Unit.INSTANCE;
        }
    }
}
