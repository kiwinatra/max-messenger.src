package defpackage;

import android.graphics.RectF;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: e1c  reason: default package */
public final class e1c extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ j1c b;
    public final /* synthetic */ String c;
    public final /* synthetic */ RectF o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e1c(j1c j1c, String str, RectF rectF, Continuation continuation) {
        super(2, continuation);
        this.b = j1c;
        this.c = str;
        this.o = rectF;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new e1c(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e1c) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            xz4 xz4 = this.b.b;
            this.a = 1;
            if (xz4.h(this.c, this.o, this) == coroutine_suspended) {
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
