package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ga6  reason: default package */
public final class ga6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ long b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ga6(Object obj, Continuation continuation, long j) {
        super(2, continuation);
        this.a = obj;
        this.b = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ga6(this.a, continuation, this.b);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ga6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ha9 ha9 = ((a89) this.a).a;
        return new tud(new sud(ha9.z, ha9.b, this.b));
    }
}
