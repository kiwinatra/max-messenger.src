package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: wue  reason: default package */
public final class wue extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ zue b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wue(zue zue, long j, Continuation continuation) {
        super(2, continuation);
        this.b = zue;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wue(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wue) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        zue zue = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = zue.C0;
            bb3 h = ((ai5) zue.x.getValue()).h(this.c, false);
            this.a = 1;
            if (bs0.e(h, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xag.h(zue.X, new s0e(cad.y, new igf(n1b.l)));
        return Unit.INSTANCE;
    }
}
