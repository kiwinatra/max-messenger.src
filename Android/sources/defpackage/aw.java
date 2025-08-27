package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: aw  reason: default package */
public final class aw extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ gx b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ra3 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aw(gx gxVar, long j, sa3 sa3, Continuation continuation) {
        super(2, continuation);
        this.b = gxVar;
        this.c = j;
        this.o = sa3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new aw(this.b, this.c, (sa3) this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((aw) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            gx gxVar = this.b;
            tu tuVar = gxVar.j;
            xv1 xv1 = new xv1(4, (Object) (sa3) this.o);
            this.a = 1;
            if (gxVar.u(tuVar, this.c, xv1, this) == coroutine_suspended) {
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
