package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: sf3  reason: default package */
public final class sf3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ wf3 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sf3(wf3 wf3, Continuation continuation) {
        super(2, continuation);
        this.b = wf3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new sf3(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sf3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        wf3 wf3 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            w80 w80 = w80.RESEND;
            this.a = 1;
            obj = ((x80) wf3.y.getValue()).a(wf3.v, w80, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        v80 v80 = (v80) obj;
        wf3.o = v80.c;
        wf3.x0.setValue(Boxing.boxLong(Duration.m1374getInWholeSecondsimpl(DurationKt.toDuration(v80.v, DurationUnit.MILLISECONDS))));
        aje aje = wf3.C0;
        if (aje != null) {
            aje.b((CancellationException) null);
        }
        wf3.C0 = xag.g(wf3, (CoroutineContext) null, (f14) null, new vf3(wf3, (Continuation) null), 3);
        wt6 wt6 = (wt6) ((bfe) wf3.Y.getValue());
        wt6.h = wf3.c;
        wt6.b();
        return Unit.INSTANCE;
    }
}
