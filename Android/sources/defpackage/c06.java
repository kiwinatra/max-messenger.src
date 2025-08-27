package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: c06  reason: default package */
public final class c06 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Collection b;
    public final /* synthetic */ m06 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c06(Collection collection, m06 m06, Continuation continuation) {
        super(2, continuation);
        this.b = collection;
        this.c = m06;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new c06(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c06) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Iterable<Object> iterable = this.b;
            jx3 a2 = e14.a(getContext());
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (Object b06 : iterable) {
                arrayList.add(ev0.d(a2, (q04) null, new b06(b06, (Continuation) null, this.c), 3));
            }
            this.a = 1;
            obj = j4b.g(arrayList, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return CollectionsKt.filterNotNull((Iterable) obj);
    }
}
