package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: bzd  reason: default package */
public final class bzd extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ jzd b;
    public final /* synthetic */ boolean c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bzd(jzd jzd, boolean z, Continuation continuation) {
        super(2, continuation);
        this.b = jzd;
        this.c = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new bzd(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bzd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = jzd.y0;
            jzd jzd = this.b;
            rk rkVar = (rk) jzd.o.getValue();
            ((hq) ((fq) rkVar.c.getValue())).i("app.media.animoji.enabled", this.c);
            aje v = ev0.v(rkVar.h, (CoroutineContext) null, f14.b, new pk(rkVar, (Continuation) null), 1);
            rkVar.i.setValue(rkVar, rk.k[0], v);
            this.a = 1;
            if (jzd.j(jzd, this) == coroutine_suspended) {
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
