package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: d12  reason: default package */
public final class d12 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ds5 c;
    public final /* synthetic */ f12 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d12(ds5 ds5, f12 f12, Continuation continuation) {
        super(2, continuation);
        this.c = ds5;
        this.o = f12;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        d12 d12 = new d12(this.c, this.o, continuation);
        d12.b = obj;
        return d12;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d12) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            wtc l = this.o.l((d14) this.b);
            this.a = 1;
            Object j = ev0.j(this.c, l, true, this);
            if (j != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                j = Unit.INSTANCE;
            }
            if (j == coroutine_suspended) {
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
