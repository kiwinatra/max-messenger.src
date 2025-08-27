package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: lm9  reason: default package */
public final class lm9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ en9 b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lm9(en9 en9, long j, Continuation continuation) {
        super(2, continuation);
        this.b = en9;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new lm9(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lm9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.b.z0;
            long j = this.c;
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                a67.d(w78.o, str, wj6.i(j, "Scrolling to requested message with id="), (Throwable) null);
            }
            en9 en9 = this.b;
            long j2 = this.c;
            this.a = 1;
            if (en9.k(en9, j2, this) == coroutine_suspended) {
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
