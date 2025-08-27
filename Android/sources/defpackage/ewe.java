package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ewe  reason: default package */
public final class ewe extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ hwe b;
    public final /* synthetic */ mqe c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ewe(hwe hwe, mqe mqe, Continuation continuation) {
        super(2, continuation);
        this.b = hwe;
        this.c = mqe;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ewe(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ewe) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            hwe hwe = this.b;
            AtomicLong atomicLong = hwe.Y;
            mqe mqe = this.c;
            atomicLong.compareAndSet(0, mqe.a);
            bb3 h = ((ai5) hwe.w.getValue()).h(mqe.a, true);
            this.a = 1;
            if (bs0.e(h, this) == coroutine_suspended) {
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
