package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: npd  reason: default package */
public final class npd extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bs5 c;
    public final /* synthetic */ opd o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public npd(kpd kpd, Continuation continuation, opd opd) {
        super(2, continuation);
        this.c = kpd;
        this.o = opd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        npd npd = new npd((kpd) this.c, continuation, this.o);
        npd.b = obj;
        return npd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((npd) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            a52 a52 = new a52((ds5) this.b, (Object) this.o, 9);
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
