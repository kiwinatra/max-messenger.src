package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: hzd  reason: default package */
public final class hzd extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ jzd b;
    public final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hzd(jzd jzd, int i, Continuation continuation) {
        super(2, continuation);
        this.b = jzd;
        this.c = i;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new hzd(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hzd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = jzd.y0;
            jzd jzd = this.b;
            jzd.k().j(this.c, "app.video.auto.play");
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
