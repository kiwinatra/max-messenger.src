package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: yo2  reason: default package */
public final class yo2 extends SuspendLambda implements Function2 {
    public long a;
    public int b;
    public final /* synthetic */ lp2 c;
    public final /* synthetic */ Long o;
    public final /* synthetic */ long v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yo2(lp2 lp2, Long l, long j, Continuation continuation) {
        super(2, continuation);
        this.c = lp2;
        this.o = l;
        this.v = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new yo2(this.c, this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yo2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        lp2 lp2 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            a32 a32 = (a32) lp2.Q0.a.getValue();
            if (a32 == null) {
                return Unit.INSTANCE;
            }
            long j2 = a32.a;
            this.a = j2;
            this.b = 1;
            obj = ((ej9) lp2.A0.getValue()).a(j2, this.o, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = j2;
        } else if (i == 1) {
            long j3 = this.a;
            ResultKt.throwOnFailure(obj);
            j = j3;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xud xud = new xud(1, j, this.v);
        xud.b = (mc9) obj;
        ((jqg) lp2.z0.getValue()).a(new yud(xud));
        return Unit.INSTANCE;
    }
}
