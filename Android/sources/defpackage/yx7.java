package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: yx7  reason: default package */
public final class yx7 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ by7 b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yx7(by7 by7, long j, Continuation continuation) {
        super(2, continuation);
        this.b = by7;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new yx7(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yx7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            wn3 wn3 = new wn3(((qw7) this.b.i.getValue()).a, this.c, 2);
            this.a = 1;
            obj = bs0.z(wn3, this);
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
