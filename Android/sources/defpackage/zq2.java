package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zq2  reason: default package */
public final class zq2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ fr2 a;
    public final /* synthetic */ m24 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zq2(fr2 fr2, m24 m24, Continuation continuation) {
        super(2, continuation);
        this.a = fr2;
        this.b = m24;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new zq2(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zq2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        fr2.j(this.a, ((l24) this.b).b);
        return Unit.INSTANCE;
    }
}
