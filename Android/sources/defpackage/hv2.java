package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: hv2  reason: default package */
public final class hv2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ ov2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hv2(Object obj, Continuation continuation, ov2 ov2) {
        super(2, continuation);
        this.b = obj;
        this.c = ov2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new hv2(this.b, continuation, this.c);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hv2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            dld dld = this.c.w;
            this.a = 1;
            obj = dld.b((ald) this.b, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
