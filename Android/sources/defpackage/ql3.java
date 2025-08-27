package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ql3  reason: default package */
public final class ql3 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ cm3 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ql3(cm3 cm3, Continuation continuation) {
        super(2, continuation);
        this.c = cm3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ql3 ql3 = new ql3(this.c, continuation);
        ql3.b = obj;
        return ql3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ql3) create((mzb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mzb mzb = (mzb) this.b;
            if (mzb instanceof jzb) {
                Long l = ((jzb) mzb).a;
                cm3 cm3 = this.c;
                long j = cm3.r.get();
                if (l == null || l.longValue() != j) {
                    return Unit.INSTANCE;
                }
                n6e n6e = cm3.e;
                p33 p33 = p33.b;
                this.a = 1;
                if (n6e.a(p33, this) == coroutine_suspended) {
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
