package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.android.OneMeApplication;

/* renamed from: sna  reason: default package */
public final class sna extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ OneMeApplication b;
    public final /* synthetic */ tna c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sna(OneMeApplication oneMeApplication, tna tna, Continuation continuation) {
        super(2, continuation);
        this.b = oneMeApplication;
        this.c = tna;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new sna(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sna) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            fu4 e = fu4.k.e(this.b);
            t68 t68 = new t68(1, this.c);
            this.a = 1;
            e.getClass();
            Object d = e14.d(new i03(e, t68, (Continuation) null), this);
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
        return Unit.INSTANCE;
    }
}
