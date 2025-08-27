package defpackage;

import android.os.Bundle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ut6  reason: default package */
public final class ut6 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ wt6 b;
    public final /* synthetic */ Bundle c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ut6(wt6 wt6, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.b = wt6;
        this.c = bundle;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ut6(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ut6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String string = this.c.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
            this.a = 1;
            if (wt6.a(this.b, string, this) == coroutine_suspended) {
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
