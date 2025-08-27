package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: jp1  reason: default package */
public final class jp1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ mp1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jp1(mp1 mp1, Continuation continuation) {
        super(2, continuation);
        this.b = mp1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new jp1(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jp1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mp1 mp1 = this.b;
            n6e n6e = ((rp1) mp1.r.getValue()).a;
            bx bxVar = new bx(4, (Object) mp1);
            this.a = 1;
            Object e = n6e.e(new oc(bxVar, 25), this);
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
