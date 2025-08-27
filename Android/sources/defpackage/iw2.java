package defpackage;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: iw2  reason: default package */
public final class iw2 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tw2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iw2(tw2 tw2, Continuation continuation) {
        super(2, continuation);
        this.c = tw2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        iw2 iw2 = new iw2(this.c, continuation);
        iw2.b = obj;
        return iw2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((iw2) create((ArrayList) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        tw2 tw2 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = (ArrayList) this.b;
            tw2.F0.setValue(arrayList);
            if (tw2.j(tw2, (ss2) tw2.E0.a.getValue())) {
                tw2.G0.setValue(arrayList);
            }
            Duration.Companion companion = Duration.Companion;
            long duration = DurationKt.toDuration(1, DurationUnit.MINUTES);
            this.a = 1;
            if (xk4.c(duration, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        tw2.n();
        return Unit.INSTANCE;
    }
}
