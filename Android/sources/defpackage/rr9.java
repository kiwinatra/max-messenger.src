package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: rr9  reason: default package */
public final class rr9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ byte[] c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rr9(f0 f0Var, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.b = f0Var;
        this.c = bArr;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new rr9(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rr9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            obj = this.b.h(this.c);
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
