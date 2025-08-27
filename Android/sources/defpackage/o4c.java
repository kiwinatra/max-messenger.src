package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: o4c  reason: default package */
public final class o4c extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bs5 c;
    public final /* synthetic */ q4c o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o4c(l4c l4c, Continuation continuation, q4c q4c) {
        super(2, continuation);
        this.c = l4c;
        this.o = q4c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        o4c o4c = new o4c((l4c) this.c, continuation, this.o);
        o4c.b = obj;
        return o4c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o4c) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            a52 a52 = new a52((ds5) this.b, (Object) this.o, 8);
            this.a = 1;
            if (this.c.e(a52, this) == coroutine_suspended) {
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
