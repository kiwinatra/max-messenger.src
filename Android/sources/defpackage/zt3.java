package defpackage;

import android.view.View;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: zt3  reason: default package */
public final class zt3 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ View b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zt3(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        k2b k2b = (k2b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                zt3 zt3 = new zt3(3, continuation, 0);
                zt3.b = view;
                return zt3.invokeSuspend(Unit.INSTANCE);
            default:
                zt3 zt32 = new zt3(3, continuation, 1);
                zt32.b = view;
                return zt32.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                View view = this.b;
                view.setBackgroundColor(fu4.k.f(view).c().i);
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                View view2 = this.b;
                view2.setBackgroundColor(fu4.k.f(view2).h().k);
                return Unit.INSTANCE;
        }
    }
}
