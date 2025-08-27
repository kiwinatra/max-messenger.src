package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: p73  reason: default package */
public final class p73 extends SuspendLambda implements Function2 {
    public final /* synthetic */ t73 a;
    public final /* synthetic */ f73 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p73(t73 t73, f73 f73, Continuation continuation) {
        super(2, continuation);
        this.a = t73;
        this.b = f73;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new p73(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p73) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = t73.m;
        return ((my2) ((qx2) this.a.f.getValue())).o(((e73) this.b).a).a.getValue();
    }
}
