package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: yig  reason: default package */
public final class yig extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ hjg b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yig(hjg hjg, Continuation continuation) {
        super(2, continuation);
        this.b = hjg;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new yig(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yig) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        hjg hjg = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (((Boolean) hjg.D0.getValue()).booleanValue()) {
                this.a = 1;
                obj = bs0.z(hjg.E0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                xag.h(hjg.I0, new iig(false));
                return Unit.INSTANCE;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xag.h(hjg.I0, new oig((String) obj));
        return Unit.INSTANCE;
    }
}
