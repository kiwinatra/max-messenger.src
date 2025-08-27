package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: nle  reason: default package */
public final class nle extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rle c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nle(rle rle, Continuation continuation) {
        super(2, continuation);
        this.c = rle;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        nle nle = new nle(this.c, continuation);
        nle.b = obj;
        return nle;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nle) create((po3) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            xme xme = this.c.x;
            this.a = 1;
            xme.setValue((po3) this.b);
            if (Unit.INSTANCE == coroutine_suspended) {
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
