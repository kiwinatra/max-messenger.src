package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: a82  reason: default package */
public final class a82 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ m82 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a82(m82 m82, Continuation continuation) {
        super(2, continuation);
        this.b = m82;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new a82(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a82) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            m82 m82 = this.b;
            boolean z = m82.C && m82.D;
            long j = m82.o;
            ((jqg) m82.v.getValue()).a(new jud(j, z));
            if (z) {
                n6e n6e = m82.e;
                b0c b0c = new b0c(j);
                this.a = 1;
                if (n6e.a(b0c, this) == coroutine_suspended) {
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
