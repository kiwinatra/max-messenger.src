package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: on3  reason: default package */
public final class on3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ pn3 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public on3(pn3 pn3, Continuation continuation) {
        super(2, continuation);
        this.b = pn3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new on3(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((on3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        pn3 pn3 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!pn3.C.get()) {
                return Unit.INSTANCE;
            }
            this.a = 1;
            obj = ((ocf) ((dxa) ((mr6) pn3.B.getValue()).a.getValue()).a.getValue()).e(new jw9(x3b.PROFILE_DELETE_TIME, 9), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Long l = ((l1d) obj).c;
        pn3.p(pn3, l != null ? l.longValue() : 0);
        return Unit.INSTANCE;
    }
}
