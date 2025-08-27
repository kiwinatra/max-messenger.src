package defpackage;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: fo6  reason: default package */
public final class fo6 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ gp6 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fo6(gp6 gp6, Continuation continuation) {
        super(2, continuation);
        this.b = gp6;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new fo6(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fo6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            gp6 gp6 = this.b;
            om6 om6 = gp6.w;
            ArrayList v = vzg.v(gp6.D0);
            om6.getClass();
            xag.h(om6.c, new im6(v));
            this.a = 1;
            Object I = ev0.I(((osa) gp6.l()).e(), new fp6(gp6, false, (Continuation) null), this);
            if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                I = Unit.INSTANCE;
            }
            if (I == coroutine_suspended) {
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
