package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ft5  reason: default package */
public final class ft5 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ bs5 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ft5(long j, bs5 bs5, Continuation continuation) {
        super(2, continuation);
        this.c = j;
        this.o = bs5;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ft5 ft5 = new ft5(this.c, this.o, continuation);
        ft5.b = obj;
        return ft5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ft5) create((cwb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            bs5 bs5 = this.o;
            et5 et5 = new et5(this.c, bs5, (cwb) this.b, (Continuation) null);
            this.a = 1;
            if (e14.d(et5, this) == coroutine_suspended) {
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
