package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: b78  reason: default package */
public final class b78 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ d78 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b78(d78 d78, Continuation continuation) {
        super(2, continuation);
        this.b = d78;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new b78(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b78) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d78 d78 = this.b;
            String str = d78.x;
            StringBuilder sb = new StringBuilder("onFail: tasksIds=");
            List list = d78.v;
            sb.append(list);
            z68.c(str, sb.toString(), new Object[0]);
            k78 n = d78.n();
            this.a = 1;
            o7d b2 = n.b();
            Object I = ev0.I(((osa) b2.a).b(), new n7d(b2, list, r78.WAITING, (Continuation) null), this);
            if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                I = Unit.INSTANCE;
            }
            if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                I = Unit.INSTANCE;
            }
            if (I == coroutine_suspended) {
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
