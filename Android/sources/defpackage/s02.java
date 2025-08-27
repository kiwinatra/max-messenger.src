package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: s02  reason: default package */
public final class s02 extends SuspendLambda implements Function2 {
    public final /* synthetic */ t02 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s02(t02 t02, Continuation continuation) {
        super(2, continuation);
        this.a = t02;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new s02(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s02) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        t02 t02 = this.a;
        ((my2) ((qx2) t02.o.getValue())).n().X(t02.b);
        xag.h(t02.x, c5c.b);
        return Unit.INSTANCE;
    }
}
