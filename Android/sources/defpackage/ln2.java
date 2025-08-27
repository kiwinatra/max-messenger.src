package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: ln2  reason: default package */
public final class ln2 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ oz1 b;
    public /* synthetic */ k2b c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ln2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        oz1 oz1 = (oz1) obj;
        k2b k2b = (k2b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                ln2 ln2 = new ln2(3, continuation, 0);
                ln2.b = oz1;
                ln2.c = k2b;
                return ln2.invokeSuspend(Unit.INSTANCE);
            default:
                ln2 ln22 = new ln2(3, continuation, 1);
                ln22.b = oz1;
                ln22.c = k2b;
                return ln22.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.a().j().a.a);
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().f);
                return Unit.INSTANCE;
        }
    }
}
