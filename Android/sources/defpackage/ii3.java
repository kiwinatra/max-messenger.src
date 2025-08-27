package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ii3  reason: default package */
public final class ii3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ji3 b;
    public final /* synthetic */ sh3 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ii3(ji3 ji3, sh3 sh3, Continuation continuation) {
        super(2, continuation);
        this.b = ji3;
        this.c = sh3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ii3(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ii3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            xme xme = this.b.b;
            Integer boxInt = Boxing.boxInt(this.c.b);
            this.a = 1;
            xme.setValue(boxInt);
            if (Unit.INSTANCE == coroutine_suspended) {
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
