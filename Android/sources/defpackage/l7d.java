package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: l7d  reason: default package */
public final class l7d extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ o7d b;
    public final /* synthetic */ Function1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l7d(o7d o7d, ued ued, Continuation continuation) {
        super(2, continuation);
        this.b = o7d;
        this.c = ued;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new l7d(this.b, (ued) this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l7d) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o7d o7d = this.b;
            i6d m = o7d.b.m();
            k7d k7d = new k7d(o7d, (ued) this.c, (Continuation) null);
            this.a = 1;
            if (n6d.a(m, k7d, this) == coroutine_suspended) {
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
