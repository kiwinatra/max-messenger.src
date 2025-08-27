package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: pw7  reason: default package */
public final class pw7 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ qw7 b;
    public final /* synthetic */ hj0 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pw7(qw7 qw7, hj0 hj0, Continuation continuation) {
        super(2, continuation);
        this.b = qw7;
        this.c = hj0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new pw7(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pw7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.b.a;
            hj0 hj0 = this.c;
            long j = hj0.a;
            qaf qaf = hj0.b;
            String str = qaf.o;
            if (str == null) {
                str = qaf.c;
            }
            hw7 hw7 = new hw7(j, str);
            this.a = 1;
            if (n6e.a(hw7, this) == coroutine_suspended) {
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
