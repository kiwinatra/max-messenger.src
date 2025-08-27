package defpackage;

import android.graphics.RectF;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: c7c  reason: default package */
public final class c7c extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ k7c b;
    public final /* synthetic */ String c;
    public final /* synthetic */ RectF o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c7c(k7c k7c, String str, RectF rectF, Continuation continuation) {
        super(2, continuation);
        this.b = k7c;
        this.c = str;
        this.o = rectF;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new c7c(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c7c) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            gwb gwb = this.b.I0;
            this.a = 1;
            if (gwb.c(this.c, this.o, this) == coroutine_suspended) {
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
