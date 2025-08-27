package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ux7  reason: default package */
public final class ux7 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ by7 b;
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ux7(by7 by7, String str, Continuation continuation) {
        super(2, continuation);
        this.b = by7;
        this.c = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ux7(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ux7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            tx7 tx7 = new tx7(((ia2) ((u82) this.b.p.getValue())).j(), this.c, 0);
            this.a = 1;
            obj = bs0.C(tx7, this);
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
