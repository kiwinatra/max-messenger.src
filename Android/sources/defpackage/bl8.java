package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: bl8  reason: default package */
public final class bl8 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ il8 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bl8(il8 il8, Continuation continuation) {
        super(2, continuation);
        this.b = il8;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new bl8(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bl8) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            il8 il8 = this.b;
            xme xme = il8.y;
            bx bxVar = new bx(9, (Object) il8);
            this.a = 1;
            Object e = xme.e(new gu5(new Ref.IntRef(), 1, bxVar), this);
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
