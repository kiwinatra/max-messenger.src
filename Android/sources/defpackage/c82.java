package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: c82  reason: default package */
public final class c82 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ m82 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c82(m82 m82, Continuation continuation) {
        super(2, continuation);
        this.b = m82;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new c82(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c82) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = m82.F;
            m82 m82 = this.b;
            ((my2) ((qx2) m82.s.getValue())).n().X(m82.o);
            n6e n6e = m82.e;
            c0c c0c = c0c.b;
            this.a = 1;
            if (n6e.a(c0c, this) == coroutine_suspended) {
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
