package defpackage;

import android.os.Bundle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ee1  reason: default package */
public final class ee1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ he1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ee1(Bundle bundle, he1 he1, Continuation continuation) {
        super(2, continuation);
        this.b = bundle;
        this.c = he1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ee1(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ee1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ze1 ze1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        he1 he1 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Bundle bundle = this.b;
            if (bundle == null || (ze1 = (ze1) bundle.getParcelable("call_participant_id")) == null) {
                return Unit.INSTANCE;
            }
            if (Intrinsics.areEqual((Object) ze1, (Object) ze1.c)) {
                return Unit.INSTANCE;
            }
            this.a = 1;
            obj = ((my2) ((qx2) he1.w.getValue())).u(ze1.a, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xag.h(he1.w0, id1.b.o1(((a32) obj).a));
        return Unit.INSTANCE;
    }
}
