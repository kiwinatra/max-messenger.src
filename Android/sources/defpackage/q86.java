package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: q86  reason: default package */
public final class q86 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ w86 b;
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q86(w86 w86, String str, Continuation continuation) {
        super(2, continuation);
        this.b = w86;
        this.c = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new q86(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q86) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (((ia2) ((u82) this.b.x.getValue())).c(this.c, this) == coroutine_suspended) {
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
