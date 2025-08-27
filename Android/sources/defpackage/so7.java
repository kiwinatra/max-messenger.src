package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: so7  reason: default package */
public final class so7 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ tgg b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public so7(tgg tgg, Continuation continuation) {
        super(2, continuation);
        this.b = tgg;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new so7(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((so7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Iterator it = ((List) this.b.c).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((xo7) obj2).c().contains("WebAppBackButtonPressed")) {
                    break;
                }
            }
            xo7 xo7 = (xo7) obj2;
            if (xo7 != null) {
                this.a = 1;
                if (xo7.a("WebAppBackButtonPressed", "{}", this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
