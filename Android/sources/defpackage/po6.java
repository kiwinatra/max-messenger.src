package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: po6  reason: default package */
public final class po6 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ wk6 b;
    public final /* synthetic */ gp6 c;
    public final /* synthetic */ wk6 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public po6(wk6 wk6, gp6 gp6, wk6 wk62, Continuation continuation) {
        super(2, continuation);
        this.b = wk6;
        this.c = gp6;
        this.o = wk62;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new po6(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((po6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        gp6 gp6 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            wk6 wk6 = this.b;
            if (wk6 != null) {
                s48 s48 = gp6.v;
                int i2 = gp6.w0.b;
                this.a = 1;
                if (((yd7) s48).h(wk6.a, i2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gp6.F0 = xag.g(gp6, ((osa) gp6.l()).e().plus(gp6.o), (f14) null, new tn6(gp6, this.o, (Continuation) null), 2);
        return Unit.INSTANCE;
    }
}
