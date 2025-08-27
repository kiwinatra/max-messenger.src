package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: s66  reason: default package */
public final class s66 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ w66 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s66(w66 w66, Continuation continuation) {
        super(2, continuation);
        this.b = w66;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new s66(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s66) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        zx5 zx5;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            w66 w66 = this.b;
            g0g g0g = w66.z;
            if (g0g == null || (zx5 = g0g.a) == null || (str = zx5.a) == null) {
                return Unit.INSTANCE;
            }
            u82 u82 = w66.b;
            this.a = 1;
            if (((ia2) u82).c(str, this) == coroutine_suspended) {
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
