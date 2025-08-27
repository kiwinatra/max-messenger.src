package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: c78  reason: default package */
public final class c78 extends SuspendLambda implements Function2 {
    public sv0 a;
    public int b;
    public final /* synthetic */ d78 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c78(d78 d78, Continuation continuation) {
        super(2, continuation);
        this.c = d78;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new c78(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c78) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        sv0 sv0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        d78 d78 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = d78.x;
            StringBuilder sb = new StringBuilder("onSuccess: tasksIds=");
            List list = d78.v;
            sb.append(list);
            z68.c(str, sb.toString(), new Object[0]);
            k78 n = d78.n();
            this.b = 1;
            o7d b2 = n.b();
            Object I = ev0.I(((osa) b2.a).b(), new g7d(b2, list, (Continuation) null), this);
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
        } else if (i == 2) {
            sv0 = this.a;
            ResultKt.throwOnFailure(obj);
            ((Number) obj).longValue();
            sv0.c(new js3(3));
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (d78.w) {
            sv0 k = d78.k();
            k78 n2 = d78.n();
            this.a = k;
            this.b = 2;
            o7d b3 = n2.b();
            Object I2 = ev0.I(((osa) b3.a).b(), new f7d(b3, (Continuation) null), this);
            if (I2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            sv0 sv02 = k;
            obj = I2;
            sv0 = sv02;
            ((Number) obj).longValue();
            sv0.c(new js3(3));
        }
        return Unit.INSTANCE;
    }
}
