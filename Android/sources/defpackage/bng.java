package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: bng  reason: default package */
public final class bng extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bng(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.c = function2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        bng bng = new bng(this.c, continuation);
        bng.b = obj;
        return bng;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bng) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.b;
            this.a = 1;
            if (this.c.invoke(obj2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
