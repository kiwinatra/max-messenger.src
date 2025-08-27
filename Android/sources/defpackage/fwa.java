package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: fwa  reason: default package */
public final class fwa extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ jwa b;
    public final /* synthetic */ a32 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fwa(jwa jwa, a32 a32, Continuation continuation) {
        super(2, continuation);
        this.b = jwa;
        this.c = a32;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new fwa(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fwa) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            jca b2 = this.b.b();
            this.a = 1;
            obj = b2.b(this.c, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
