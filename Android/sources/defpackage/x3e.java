package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: x3e  reason: default package */
public final class x3e extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ y3e b;
    public final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x3e(y3e y3e, int i, Continuation continuation) {
        super(2, continuation);
        this.b = y3e;
        this.c = i;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new x3e(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x3e) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        y3e y3e = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            pwf pwf = (pwf) y3e.Y.getValue();
            this.a = 1;
            Object I = ev0.I(((osa) ((gaf) pwf.c.getValue())).b(), new owf(pwf, this.c, (Continuation) null), this);
            if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                I = Unit.INSTANCE;
            }
            if (I == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.a = 2;
        if (y3e.j(y3e, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
