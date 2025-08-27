package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: vn5  reason: default package */
public final class vn5 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ float b;
    public final /* synthetic */ cwb c;
    public final /* synthetic */ do5 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vn5(cwb cwb, do5 do5, Continuation continuation) {
        super(2, continuation);
        this.c = cwb;
        this.o = do5;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        vn5 vn5 = new vn5(this.c, this.o, continuation);
        vn5.b = ((Number) obj).floatValue();
        return vn5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vn5) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            float f = this.b;
            Result.Companion companion = Result.Companion;
            Result r7 = Result.m22boximpl(Result.m23constructorimpl(new nyf(f * 100.0f, this.o.j, (String) null)));
            this.a = 1;
            if (((zvb) this.c).o.t(r7, this) == coroutine_suspended) {
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
