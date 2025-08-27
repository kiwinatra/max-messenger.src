package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: gw2  reason: default package */
public final class gw2 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ po3 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gw2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        po3 po3 = (po3) obj;
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                gw2 gw2 = new gw2(3, continuation, 0);
                gw2.b = po3;
                return gw2.invokeSuspend(Unit.INSTANCE);
            default:
                gw2 gw22 = new gw2(3, continuation, 1);
                gw22.b = po3;
                return gw22.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                return this.b;
            default:
                ResultKt.throwOnFailure(obj);
                return this.b.a;
        }
    }
}
