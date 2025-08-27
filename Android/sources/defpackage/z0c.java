package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: z0c  reason: default package */
public final class z0c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ j1c b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z0c(j1c j1c, Continuation continuation) {
        super(2, continuation);
        this.b = j1c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        z0c z0c = new z0c(this.b, continuation);
        z0c.a = obj;
        return z0c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((z0c) create((wz4) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        wz4 wz4 = (wz4) this.a;
        j1c j1c = this.b;
        j1c.Z.setValue(wz4.a);
        j1c.X.setValue(wz4.b);
        return Unit.INSTANCE;
    }
}
