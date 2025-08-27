package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: s59  reason: default package */
public final class s59 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ x59 b;
    public final /* synthetic */ a32 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s59(x59 x59, a32 a32, Continuation continuation) {
        super(2, continuation);
        this.b = x59;
        this.c = a32;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new s59(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s59) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            x59 x59 = this.b;
            long j = this.c.b.a;
            Integer boxInt = Boxing.boxInt(((Number) x59.G0.getValue()).intValue());
            this.a = 1;
            obj = ((zq6) x59.v0.getValue()).a(j, x59.o, (String) null, (Long) null, boxInt, this);
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
