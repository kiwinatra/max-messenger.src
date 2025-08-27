package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: hs5  reason: default package */
public final class hs5 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ wtc b;
    public final /* synthetic */ int c;
    public final /* synthetic */ cwb o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hs5(wtc wtc, int i, cwb cwb, Continuation continuation) {
        super(1, continuation);
        this.b = wtc;
        this.c = i;
        this.o = cwb;
    }

    public final Continuation create(Continuation continuation) {
        return new hs5(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj) {
        return ((hs5) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List b2 = gt5.b(this.b, this.c);
            if (!b2.isEmpty()) {
                this.a = 1;
                if (((zvb) this.o).o.t(b2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Boxing.boxBoolean(false);
    }
}
