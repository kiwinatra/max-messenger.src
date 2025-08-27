package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: j82  reason: default package */
public final class j82 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bs5 c;
    public final /* synthetic */ m82 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j82(on2 on2, Continuation continuation, m82 m82) {
        super(2, continuation);
        this.c = on2;
        this.o = m82;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        j82 j82 = new j82((on2) this.c, continuation, this.o);
        j82.b = obj;
        return j82;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j82) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            a52 a52 = new a52((ds5) this.b, (Object) this.o, 1);
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
