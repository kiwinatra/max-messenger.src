package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: uyd  reason: default package */
public final class uyd extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ wyd b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uyd(wyd wyd, Continuation continuation) {
        super(2, continuation);
        this.b = wyd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new uyd(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uyd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        wyd wyd = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (((my2) ((qx2) wyd.Y.getValue())).i(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s85 s85 = wyd.v0;
        z1e.b.getClass();
        xag.h(s85, new pa4(":saved-messages"));
        return Unit.INSTANCE;
    }
}
