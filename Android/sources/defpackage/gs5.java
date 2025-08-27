package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: gs5  reason: default package */
public final class gs5 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function3 c;
    public final /* synthetic */ ds5 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gs5(Function3 function3, ds5 ds5, Continuation continuation) {
        super(2, continuation);
        this.c = function3;
        this.o = ds5;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        gs5 gs5 = new gs5(this.c, this.o, continuation);
        gs5.b = obj;
        return gs5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gs5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (this.c.invoke((d14) this.b, this.o, this) == coroutine_suspended) {
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
