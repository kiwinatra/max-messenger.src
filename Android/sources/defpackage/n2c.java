package defpackage;

import java.util.HashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: n2c  reason: default package */
public final class n2c extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ z2c b;
    public final /* synthetic */ a32 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n2c(z2c z2c, a32 a32, Continuation continuation) {
        super(2, continuation);
        this.b = z2c;
        this.c = a32;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new n2c(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n2c) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        z2c z2c = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!((rh3) z2c.y.getValue()).e()) {
                this.a = 1;
                if (xk4.b(500, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                a32 a32 = this.c;
                z2c.w0.set(((jna) ((rl) z2c.v.getValue())).o(a32.a, a32.b.a, 0, (String) null, true, (HashMap) null));
                return Unit.INSTANCE;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        n6e n6e = z2c.x;
        r34 r34 = r34.a;
        this.a = 2;
        if (n6e.a(r34, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
