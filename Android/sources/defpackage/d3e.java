package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: d3e  reason: default package */
public final class d3e extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ q4 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d3e(q4 q4Var, Continuation continuation) {
        super(2, continuation);
        this.b = q4Var;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new d3e(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d3e) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (((ywf) this.b.g(ywf.class)).a(false, this) == coroutine_suspended) {
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
