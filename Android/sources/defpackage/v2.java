package defpackage;

import android.view.View;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: v2  reason: default package */
public final class v2 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ View b;
    public /* synthetic */ k2b c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        k2b k2b = (k2b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                v2 v2Var = new v2(3, continuation, 0);
                v2Var.b = view;
                v2Var.c = k2b;
                return v2Var.invokeSuspend(Unit.INSTANCE);
            case 1:
                v2 v2Var2 = new v2(3, continuation, 1);
                v2Var2.b = view;
                v2Var2.c = k2b;
                return v2Var2.invokeSuspend(Unit.INSTANCE);
            default:
                v2 v2Var3 = new v2(3, continuation, 2);
                v2Var3.b = view;
                v2Var3.c = k2b;
                return v2Var3.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.h().j);
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.h().k);
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().i);
                return Unit.INSTANCE;
        }
    }
}
