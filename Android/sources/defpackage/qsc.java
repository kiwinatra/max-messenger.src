package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: qsc  reason: default package */
public final class qsc extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ReactionsViewModel b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qsc(ReactionsViewModel reactionsViewModel, Continuation continuation) {
        super(2, continuation);
        this.b = reactionsViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new qsc(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qsc) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            dq2 dq2 = (dq2) this.b.y.getValue();
            this.a = 1;
            dq2.getClass();
            Object I = ev0.I(dq2.l, new aq2(dq2, (Continuation) null), this);
            if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                I = Unit.INSTANCE;
            }
            if (I == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                if (!(th instanceof CancellationException)) {
                    z68.f("ru.ok.onechat.reactions.ReactionsViewModel", "runChatSubscribeNotifObserving: fail to run()", th);
                }
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
