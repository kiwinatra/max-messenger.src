package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: n24  reason: default package */
public final class n24 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ p24 b;
    public final /* synthetic */ a12 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n24(p24 p24, a12 a12, Continuation continuation) {
        super(2, continuation);
        this.b = p24;
        this.c = a12;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new n24(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n24) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.a;
            a12 a12 = this.c;
            l24 l24 = new l24(a12.a, a12.b);
            this.a = 1;
            if (n6e.a(l24, this) == coroutine_suspended) {
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
