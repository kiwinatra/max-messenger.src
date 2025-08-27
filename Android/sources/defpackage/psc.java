package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: psc  reason: default package */
public final class psc extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ReactionsViewModel b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public psc(ReactionsViewModel reactionsViewModel, Continuation continuation) {
        super(2, continuation);
        this.b = reactionsViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new psc(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((psc) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            dq2 dq2 = (dq2) this.b.y.getValue();
            this.a = 1;
            dq2.j = true;
            try {
                pm7 pm7 = dq2.f;
                if (pm7 != null) {
                    pm7.b((CancellationException) null);
                }
            } catch (Throwable th) {
                z68.f("dq2", "cancel fail!", th);
            }
            Unit e = dq2.e(this);
            if (e != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                e = Unit.INSTANCE;
            }
            if (e == coroutine_suspended) {
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
