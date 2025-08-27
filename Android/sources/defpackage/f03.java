package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: f03  reason: default package */
public final class f03 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ int b;
    public final /* synthetic */ fu4 c;
    public final /* synthetic */ Function0 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f03(fu4 fu4, t68 t68, Continuation continuation) {
        super(2, continuation);
        this.c = fu4;
        this.o = t68;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        f03 f03 = new f03(this.c, (t68) this.o, continuation);
        f03.b = ((Number) obj).intValue();
        return f03;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f03) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int i2 = this.b;
            String str = (String) this.c.b;
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                a67.d(w78.o, str, wj6.h(i2, "onNewActivityFlow "), (Throwable) null);
            }
            npg npg = (npg) this.c.c;
            this.a = 1;
            npg.getClass();
            bi4 bi4 = dq4.a;
            Object I = ev0.I(lc8.a.t0(), new m9(npg, (List) this.o.invoke(), (Continuation) null), this);
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
