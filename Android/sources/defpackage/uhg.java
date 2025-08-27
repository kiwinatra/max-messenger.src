package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: uhg  reason: default package */
public final class uhg extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ vhg c;
    public final /* synthetic */ yhg o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uhg(vhg vhg, yhg yhg, Continuation continuation) {
        super(2, continuation);
        this.c = vhg;
        this.o = yhg;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        uhg uhg = new uhg(this.c, this.o, continuation);
        uhg.b = obj;
        return uhg;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uhg) create((Throwable) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        vo7 vo7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.b;
            vhg vhg = this.c;
            vhg.getClass();
            qhg qhg = th instanceof qhg ? (qhg) th : null;
            if (qhg instanceof qhg) {
                vo7 = new to7(new wo7("request_denied", 0));
            } else if (qhg == null) {
                vo7 = uo7.d;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            vo7 vo72 = vo7;
            rhg rhg = rhg.b;
            String str = this.o.a;
            this.a = 1;
            if (((d93) vhg.c.getValue()).a(vhg.e, vo72, rhg, str, this) == coroutine_suspended) {
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
