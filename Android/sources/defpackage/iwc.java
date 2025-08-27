package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: iwc  reason: default package */
public final class iwc extends SuspendLambda implements Function2 {
    public final /* synthetic */ pwc a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iwc(pwc pwc, Continuation continuation) {
        super(2, continuation);
        this.a = pwc;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new iwc(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((iwc) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        yvc yvc = this.a.c;
        igf igf = new igf(yya.e);
        yvc.getClass();
        xag.h(yvc.b, new vvc(igf));
        return Unit.INSTANCE;
    }
}
