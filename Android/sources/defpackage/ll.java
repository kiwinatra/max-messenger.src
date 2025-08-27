package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ll  reason: default package */
public final class ll extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ g6d c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ll(g6d g6d, Continuation continuation) {
        super(2, continuation);
        this.c = g6d;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ll llVar = new ll(this.c, continuation);
        llVar.b = obj;
        return llVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ll) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d14 = (d14) this.b;
            this.b = d14;
            g6d g6d = this.c;
            this.a = 1;
            lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(this));
            lw1.u();
            ((gc8) g6d.c).p0(d14.U(), new cf(2, lw1));
            Object t = lw1.t();
            if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (t == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            d14 d142 = (d14) this.b;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
