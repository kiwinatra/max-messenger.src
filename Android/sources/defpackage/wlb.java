package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: wlb  reason: default package */
public final class wlb extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ zlb b;
    public final /* synthetic */ a32 c;
    public final /* synthetic */ long o;
    public final /* synthetic */ long v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wlb(zlb zlb, a32 a32, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.b = zlb;
        this.c = a32;
        this.o = j;
        this.v = j2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wlb(this.b, this.c, this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wlb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.c.a;
            this.a = 1;
            if (((rl2) this.b.f.getValue()).a(j, this.o, this.v, false, this) == coroutine_suspended) {
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
