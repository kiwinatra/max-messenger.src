package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zm0  reason: default package */
public final class zm0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ bn0 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zm0(bn0 bn0, Continuation continuation) {
        super(2, continuation);
        this.b = bn0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new zm0(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zm0) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        xme xme;
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        bn0 bn0 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = bn0.l.get();
            this.a = 1;
            obj = bn0.e(bn0, (String) null, j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Pair pair = (Pair) obj;
        if (pair == null) {
            return Unit.INSTANCE;
        }
        long longValue = ((Number) pair.component1()).longValue();
        List list = (List) pair.component2();
        bn0.l.set(longValue);
        do {
            xme = bn0.h;
            value = xme.getValue();
        } while (!xme.b(value, CollectionsKt.plus((List) value, list)));
        return Unit.INSTANCE;
    }
}
