package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: th0  reason: default package */
public final class th0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ wh0 b;
    public final /* synthetic */ Lazy c;
    public final /* synthetic */ boolean o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public th0(wh0 wh0, Lazy lazy, boolean z, Continuation continuation) {
        super(2, continuation);
        this.b = wh0;
        this.c = lazy;
        this.o = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new th0(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((th0) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        wh0 wh0 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ei0 ei0 = wh0.c;
            this.a = 1;
            ei0.getClass();
            Object d = e14.d(new di0(ei0, (qh0) this.c.getValue(), (Continuation) null), this);
            if (d != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                d = Unit.INSTANCE;
            }
            if (d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wh0.x.setValue(wh0.j(this.o));
        return Unit.INSTANCE;
    }
}
