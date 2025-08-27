package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: vyb  reason: default package */
public final class vyb extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ h3b b;
    public /* synthetic */ k2b c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vyb(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        h3b h3b = (h3b) obj;
        k2b k2b = (k2b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                vyb vyb = new vyb(3, continuation, 0);
                vyb.b = h3b;
                vyb.c = k2b;
                return vyb.invokeSuspend(Unit.INSTANCE);
            default:
                vyb vyb2 = new vyb(3, continuation, 1);
                vyb2.b = h3b;
                vyb2.c = k2b;
                return vyb2.invokeSuspend(Unit.INSTANCE);
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
                this.b.setBackgroundColor(this.c.c().i);
                return Unit.INSTANCE;
        }
    }
}
