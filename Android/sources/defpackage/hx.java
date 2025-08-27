package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: hx  reason: default package */
public final class hx extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Lazy b;
    public final /* synthetic */ nx c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hx(Lazy lazy, nx nxVar, Continuation continuation) {
        super(2, continuation);
        this.b = lazy;
        this.c = nxVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new hx(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hx) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            nx nxVar = this.c;
            long j = nxVar.a;
            long p = nxVar.d.p();
            bl4 bl4 = bl4.DELAYED;
            this.a = 1;
            z6d z6d = ((to9) this.b.getValue()).a;
            Object I = ev0.I(((osa) z6d.c()).b(), new r6d(bl4, z6d, j, p, (Continuation) null), this);
            if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                I = Unit.INSTANCE;
            }
            if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                I = Unit.INSTANCE;
            }
            if (I == coroutine_suspended) {
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
