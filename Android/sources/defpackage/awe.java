package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: awe  reason: default package */
public final class awe extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ sve c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awe(sve sve, Continuation continuation) {
        super(2, continuation);
        this.c = sve;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        awe awe = new awe(this.c, continuation);
        awe.b = obj;
        return awe;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((awe) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (((ds5) this.b).a(this.c, this) == coroutine_suspended) {
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
