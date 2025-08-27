package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: d40  reason: default package */
public final class d40 extends SuspendLambda implements Function2 {
    public final /* synthetic */ f40 a;
    public final /* synthetic */ long b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d40(f40 f40, long j, Continuation continuation) {
        super(2, continuation);
        this.a = f40;
        this.b = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new d40(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d40) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return ((fa9) this.a.y.getValue()).r(this.b);
    }
}
