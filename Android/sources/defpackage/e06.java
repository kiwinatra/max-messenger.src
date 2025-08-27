package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: e06  reason: default package */
public final class e06 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ m06 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e06(m06 m06, Set set, Continuation continuation) {
        super(2, continuation);
        this.b = set;
        this.c = m06;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new e06(this.c, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e06) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Set<Number> set;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.b.isEmpty() && (!((Collection) this.c.y0.get()).isEmpty())) {
                m06 m06 = this.c;
                zx5 zx5 = m06.A0;
                if (!(zx5 == null || (set = zx5.Y) == null)) {
                    for (Number longValue : set) {
                        m06.l(longValue.longValue());
                    }
                }
                m06.y0.updateAndGet(new md2(2));
            } else if (!this.b.isEmpty()) {
                m06 m062 = this.c;
                Set set2 = this.b;
                this.a = 1;
                if (m06.j(m062, set2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        m06 m063 = this.c;
        this.a = 2;
        if (m06.k(m063, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
