package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ru3  reason: default package */
public final class ru3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ su3 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ru3(su3 su3, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.b = su3;
        this.c = str;
        this.o = i;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ru3(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ru3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            su3 su3 = this.b;
            obj = ev0.I(((osa) su3.c).a(), new pu3(su3, this.c, this.o, (Continuation) null), this);
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
