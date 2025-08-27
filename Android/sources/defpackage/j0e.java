package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: j0e  reason: default package */
public final class j0e extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ n0e b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j0e(n0e n0e, Continuation continuation) {
        super(2, continuation);
        this.b = n0e;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new j0e(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j0e) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        n0e n0e = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            Object I = ev0.I(((osa) ((gaf) n0e.y.getValue())).b(), new k0e(n0e, (Continuation) null), this);
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
        KProperty[] kPropertyArr = n0e.x0;
        n0e.j(0);
        return Unit.INSTANCE;
    }
}
