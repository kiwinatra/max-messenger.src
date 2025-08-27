package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: bd7  reason: default package */
public final class bd7 extends SuspendLambda implements Function2 {
    public ConcurrentHashMap a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yd7 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bd7(yd7 yd7, Continuation continuation) {
        super(2, continuation);
        this.o = yd7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        bd7 bd7 = new bd7(this.o, continuation);
        bd7.c = obj;
        return bd7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bd7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        zcf zcf;
        ConcurrentHashMap concurrentHashMap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d14 = (d14) this.c;
            String str = yd7.C0;
            zcf zcf2 = new zcf("fetchAlbums");
            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
            Iterable<pk6> iterable = pk6.e;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (pk6 ad7 : iterable) {
                yd7 yd7 = this.o;
                arrayList.add(ev0.v(d14, ((osa) yd7.c).b(), (f14) null, new ad7(ad7, yd7, zcf2, concurrentHashMap2, (Continuation) null), 2));
            }
            this.c = zcf2;
            this.a = concurrentHashMap2;
            this.b = 1;
            if (j4b.V(arrayList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            zcf = zcf2;
            concurrentHashMap = concurrentHashMap2;
        } else if (i == 1) {
            concurrentHashMap = this.a;
            zcf = (zcf) this.c;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zcf.getClass();
        return CollectionsKt.toList(concurrentHashMap.values());
    }
}
