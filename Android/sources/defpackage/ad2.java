package defpackage;

import java.util.Set;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ad2  reason: default package */
public final class ad2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ t70 b;
    public final /* synthetic */ a32 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ad2(t70 t70, a32 a32, Continuation continuation) {
        super(2, continuation);
        this.b = t70;
        this.c = a32;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ad2(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ad2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            t70 t70 = this.b;
            long j = this.c.a;
            this.a = 1;
            obj = ((my2) ((qx2) ((Lazy) t70.v).getValue())).t(j, (Set) t70.o, this);
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
