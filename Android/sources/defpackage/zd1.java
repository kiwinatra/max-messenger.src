package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zd1  reason: default package */
public final class zd1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ he1 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zd1(he1 he1, Continuation continuation) {
        super(2, continuation);
        this.a = he1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new zd1(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zd1) create((i9b) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        he1 he1 = this.a;
        String str = he1.X;
        ev0.v(he1.a, ((osa) he1.c).e(), (f14) null, new de1(he1, str, (Continuation) null), 2);
        return Unit.INSTANCE;
    }
}
