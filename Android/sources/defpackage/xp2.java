package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xp2  reason: default package */
public final class xp2 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dq2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xp2(dq2 dq2, Continuation continuation) {
        super(2, continuation);
        this.c = dq2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        xp2 xp2 = new xp2(this.c, continuation);
        xp2.b = obj;
        return xp2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xp2) create((a32) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            m72 m72 = ((a32) this.b).b;
            long j = m72.a;
            k72 k72 = m72.c;
            if (!(this.c.h == j && this.c.g == k72)) {
                this.c.g = k72;
                this.c.h = j;
                dq2 dq2 = this.c;
                this.a = 1;
                if (dq2.c(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                z68.f("dq2", "catch error in chatUpdateFlow.onEach", th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
