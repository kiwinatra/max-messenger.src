package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: w6c  reason: default package */
public final class w6c extends SuspendLambda implements Function2 {
    public final /* synthetic */ k7c a;
    public final /* synthetic */ long b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w6c(k7c k7c, long j, Continuation continuation) {
        super(2, continuation);
        this.a = k7c;
        this.b = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new w6c(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w6c) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        k7c k7c = this.a;
        xdb f = ((c7d) k7c.y.getValue()).f(this.b);
        if (f == null) {
            return Unit.INSTANCE;
        }
        xag.h(k7c.x0, new u4c(f.o));
        return Unit.INSTANCE;
    }
}
