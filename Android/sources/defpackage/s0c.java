package defpackage;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: s0c  reason: default package */
public final class s0c extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ CoordinatorLayout b;
    public /* synthetic */ k2b c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0c(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
        k2b k2b = (k2b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                s0c s0c = new s0c(3, continuation, 0);
                s0c.b = coordinatorLayout;
                s0c.c = k2b;
                return s0c.invokeSuspend(Unit.INSTANCE);
            default:
                s0c s0c2 = new s0c(3, continuation, 1);
                s0c2.b = coordinatorLayout;
                s0c2.c = k2b;
                return s0c2.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().h);
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().h);
                return Unit.INSTANCE;
        }
    }
}
