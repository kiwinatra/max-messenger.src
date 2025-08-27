package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: nd8  reason: default package */
public final class nd8 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hr6 c;
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nd8(hr6 hr6, int i, Continuation continuation) {
        super(2, continuation);
        this.c = hr6;
        this.o = i;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        nd8 nd8 = new nd8(this.c, this.o, continuation);
        nd8.b = obj;
        return nd8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nd8) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        d14 d14;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        hr6 hr6 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d142 = (d14) this.b;
            this.b = d142;
            this.a = 1;
            yd7 yd7 = (yd7) ((y35) hr6.c).b;
            Object I = ev0.I(((osa) yd7.c).b(), new md7(yd7, (Continuation) null), this);
            if (I == coroutine_suspended) {
                return coroutine_suspended;
            }
            d14 = d142;
            obj = I;
        } else if (i == 1) {
            d14 = (d14) this.b;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t4d t4d = (t4d) obj;
        z68.c("hr6", "onStateChanged: allMediaCountResult is " + t4d, new Object[0]);
        if (t4d instanceof r4d) {
            z68.o("hr6", "onStateChanged: error", ((r4d) t4d).a);
        } else if (t4d instanceof s4d) {
            if (this.o != ((Number) ((s4d) t4d).a).intValue() && e14.f(d14)) {
                ((Function0) hr6.o).invoke();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
