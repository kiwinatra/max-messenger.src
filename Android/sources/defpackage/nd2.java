package defpackage;

import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: nd2  reason: default package */
public final class nd2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ wd2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nd2(wd2 wd2, Continuation continuation) {
        super(2, continuation);
        this.b = wd2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new nd2(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nd2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            wd2 wd2 = this.b;
            ld2 ld2 = (ld2) wd2.x0.getAndUpdate(new md2(0));
            if (ld2 == null) {
                return Unit.INSTANCE;
            }
            sr4 sr4 = ld2.d;
            sr4.getClass();
            if ((sr4 == sr4.b || sr4 == sr4.c) && !ld2.e) {
                File t = ((po5) ((ln5) wd2.y.getValue())).t(ld2.b);
                this.a = 1;
                if (((k4f) wd2.w.getValue()).a.c(t, ld2.c, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
