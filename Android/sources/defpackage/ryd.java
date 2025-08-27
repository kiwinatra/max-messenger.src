package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ryd  reason: default package */
public final class ryd extends SuspendLambda implements Function2 {
    public xme a;
    public int b;
    public final /* synthetic */ wyd c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ryd(wyd wyd, Continuation continuation) {
        super(2, continuation);
        this.c = wyd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ryd(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ryd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        xme xme;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            wyd wyd = this.c;
            xme xme2 = wyd.x0;
            this.a = xme2;
            this.b = 1;
            obj = wyd.c.a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            xme = xme2;
        } else if (i == 1) {
            xme = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xme.setValue(obj);
        return Unit.INSTANCE;
    }
}
