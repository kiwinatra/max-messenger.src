package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: mx7  reason: default package */
public final class mx7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ long a;
    public final /* synthetic */ by7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mx7(long j, by7 by7, long j2, long j3, Continuation continuation) {
        super(2, continuation);
        this.a = j;
        this.b = by7;
        this.c = j2;
        this.o = j3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new mx7(this.a, this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mx7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i = (this.a > 0 ? 1 : (this.a == 0 ? 0 : -1));
        by7 by7 = this.b;
        long j = this.c;
        if (i > 0) {
            return ((fa9) by7.c.getValue()).r(j);
        }
        if (j > 0) {
            return ((fa9) by7.c.getValue()).k(this.o, j);
        }
        return null;
    }
}
