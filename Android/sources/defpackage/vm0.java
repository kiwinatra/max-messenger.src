package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: vm0  reason: default package */
public final class vm0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Lazy b;
    public final /* synthetic */ bn0 c;
    public final /* synthetic */ Lazy o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vm0(Lazy lazy, bn0 bn0, Lazy lazy2, Continuation continuation) {
        super(2, continuation);
        this.b = lazy;
        this.c = bn0;
        this.o = lazy2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new vm0(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vm0) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            on2 on2 = new on2(((my2) ((qx2) this.b.getValue())).o(this.c.a), 28);
            this.a = 1;
            obj = bs0.z(on2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        is9 is9 = (is9) this.o.getValue();
        this.a = 2;
        if (is9.q((a32) obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
