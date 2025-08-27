package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xlb  reason: default package */
public final class xlb extends SuspendLambda implements Function2 {
    public final /* synthetic */ zlb a;
    public final /* synthetic */ int b;
    public final /* synthetic */ a32 c;
    public final /* synthetic */ long o;
    public final /* synthetic */ long v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xlb(zlb zlb, int i, a32 a32, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.a = zlb;
        this.b = i;
        this.c = a32;
        this.o = j;
        this.v = j2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new xlb(this.a, this.b, this.c, this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xlb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        e0b e0b = (e0b) this.a.e.getValue();
        e0b.c(new n0b(0, this.b, 3));
        e0b.h(new igf(bxa.b));
        e0b.f(r0b.a);
        e0b.g(new x0b(new igf(bxa.c)));
        e0b.d(new n62(this.a, this.c, this.o, this.v));
        e0b.j();
        return Unit.INSTANCE;
    }
}
