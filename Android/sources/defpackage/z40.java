package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: z40  reason: default package */
public final class z40 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Lazy b;
    public final /* synthetic */ c50 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z40(Lazy lazy, c50 c50, Continuation continuation) {
        super(2, continuation);
        this.b = lazy;
        this.c = c50;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new z40(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((z40) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Lazy lazy = this.b;
            etc etc = ((xy9) ((dy9) lazy.getValue())).K;
            c50 c50 = this.c;
            bx bxVar = new bx(1, (Object) c50);
            this.a = 1;
            Object e = etc.a.e(new y40(bxVar, c50, lazy, 0), this);
            if (e != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                e = Unit.INSTANCE;
            }
            if (e == coroutine_suspended) {
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
