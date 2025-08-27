package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: go2  reason: default package */
public final class go2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ lp2 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public go2(lp2 lp2, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.a = lp2;
        this.b = j;
        this.c = j2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new go2(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((go2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ((my2) this.a.o).n().Y(this.b, this.c);
        return Unit.INSTANCE;
    }
}
