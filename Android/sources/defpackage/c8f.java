package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* renamed from: c8f  reason: default package */
public final class c8f extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ f8f b;
    public final /* synthetic */ SystemServicesManager$PushTokenGeneratedListener c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c8f(f8f f8f, SystemServicesManager$PushTokenGeneratedListener systemServicesManager$PushTokenGeneratedListener, Continuation continuation) {
        super(2, continuation);
        this.b = f8f;
        this.c = systemServicesManager$PushTokenGeneratedListener;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new c8f(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c8f) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (this.b.h(this.c, this) == coroutine_suspended) {
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
