package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: x84  reason: default package */
public final class x84 extends SuspendLambda implements Function2 {
    public final /* synthetic */ z84 a;
    public final /* synthetic */ x6 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x84(z84 z84, x6 x6Var, Continuation continuation) {
        super(2, continuation);
        this.a = z84;
        this.b = x6Var;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new x84(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x84) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        z84 z84 = this.a;
        int incrementAndGet = z84.i.incrementAndGet();
        String str = z84.k;
        z68.c(str, "start " + incrementAndGet, new Object[0]);
        try {
            this.b.run();
            z68.c(str, "finish " + incrementAndGet, new Object[0]);
        } catch (Throwable th) {
            String str2 = z84.k;
            z68.c(str2, "finish " + incrementAndGet, new Object[0]);
            throw th;
        }
        return Unit.INSTANCE;
    }
}
