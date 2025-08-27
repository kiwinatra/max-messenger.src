package defpackage;

import java.util.concurrent.Callable;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: p14  reason: default package */
public final class p14 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Callable a;
    public final /* synthetic */ kw1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p14(Callable callable, lw1 lw1, Continuation continuation) {
        super(2, continuation);
        this.a = callable;
        this.b = lw1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new p14(this.a, (lw1) this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p14) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        kw1 kw1 = this.b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            kw1.resumeWith(Result.m23constructorimpl(this.a.call()));
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            kw1.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(th)));
        }
        return Unit.INSTANCE;
    }
}
