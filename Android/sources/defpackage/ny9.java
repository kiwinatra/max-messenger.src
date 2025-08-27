package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ny9  reason: default package */
public final class ny9 extends SuspendLambda implements Function2 {
    public final /* synthetic */ xy9 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ny9(xy9 xy9, Continuation continuation) {
        super(2, continuation);
        this.a = xy9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ny9(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ny9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        qo8 qo8 = this.a.o;
        if (qo8 != null) {
            qo8.pause();
        }
        return Unit.INSTANCE;
    }
}
