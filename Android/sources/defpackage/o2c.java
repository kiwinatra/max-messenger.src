package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: o2c  reason: default package */
public final class o2c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ z2c b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o2c(z2c z2c, Continuation continuation) {
        super(2, continuation);
        this.b = z2c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        o2c o2c = new o2c(this.b, continuation);
        o2c.a = obj;
        return o2c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o2c) create((a32) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        a32 a32 = (a32) this.a;
        if (a32.L() && !a32.B()) {
            xag.h(this.b.A0, p33.b);
        }
        return Unit.INSTANCE;
    }
}
