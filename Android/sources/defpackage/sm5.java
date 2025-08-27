package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: sm5  reason: default package */
public final class sm5 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ um5 b;
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sm5(um5 um5, String str, Continuation continuation) {
        super(2, continuation);
        this.b = um5;
        this.c = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new sm5(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sm5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            um5 um5 = this.b;
            sbd sbd = new sbd(new ss5(um5.c, new ps5(um5.l, new pm5(this.c, (Continuation) null)), new rx2(12, um5), (Continuation) null));
            bx bxVar = new bx(7, (Object) um5);
            this.a = 1;
            if (sbd.e(bxVar, this) == coroutine_suspended) {
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
