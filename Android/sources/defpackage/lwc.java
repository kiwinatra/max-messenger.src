package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: lwc  reason: default package */
public final class lwc extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ pwc b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lwc(pwc pwc, Continuation continuation) {
        super(2, continuation);
        this.b = pwc;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new lwc(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lwc) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.b.Z.getValue() instanceof ewc) {
                return Unit.INSTANCE;
            }
            long currentTimeMillis = System.currentTimeMillis();
            ((c50) this.b.n()).f = Boxing.boxLong(currentTimeMillis);
            pwc pwc = this.b;
            this.a = 1;
            obj = pwc.l(pwc, currentTimeMillis, this);
            if (obj == coroutine_suspended) {
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
        if (((Boolean) obj).booleanValue()) {
            yvc yvc = this.b.c;
            yvc.getClass();
            xag.h(yvc.b, new tvc(true));
        } else {
            pwc pwc2 = this.b;
            this.a = 2;
            if (pwc.j(pwc2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
