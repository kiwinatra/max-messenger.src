package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: iq1  reason: default package */
public final class iq1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ kq1 b;
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iq1(kq1 kq1, String str, Continuation continuation) {
        super(2, continuation);
        this.b = kq1;
        this.c = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new iq1(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((iq1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            obj = ev0.I(((osa) ((gaf) this.b.b.getValue())).b(), new hq1(this.c, (Continuation) null), this);
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
