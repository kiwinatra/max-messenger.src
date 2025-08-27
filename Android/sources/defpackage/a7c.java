package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: a7c  reason: default package */
public final class a7c extends SuspendLambda implements Function2 {
    public final /* synthetic */ k7c a;
    public final /* synthetic */ long b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a7c(k7c k7c, long j, Continuation continuation) {
        super(2, continuation);
        this.a = k7c;
        this.b = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new a7c(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a7c) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = k7c.M0;
        k7c k7c = this.a;
        ((my2) k7c.m()).n().X(this.b);
        xag.h(k7c.x0, c5c.b);
        return Unit.INSTANCE;
    }
}
