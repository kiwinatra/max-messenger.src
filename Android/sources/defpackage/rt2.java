package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.logout.a;

/* renamed from: rt2  reason: default package */
public final class rt2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ wt2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rt2(wt2 wt2, Continuation continuation) {
        super(2, continuation);
        this.b = wt2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new rt2(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rt2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        wt2 wt2 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            a aVar = wt2.w;
            this.a = 1;
            if (aVar.a(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z68.c(wt2.x0, "handle logout", new Object[0]);
        e14.c(wt2.y0, (CancellationException) null);
        return Unit.INSTANCE;
    }
}
