package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: a1c  reason: default package */
public final class a1c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ j1c b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a1c(j1c j1c, Continuation continuation) {
        super(2, continuation);
        this.b = j1c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        a1c a1c = new a1c(this.b, continuation);
        a1c.a = obj;
        return a1c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a1c) create((v5a) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xag.h(this.b.w0, (v5a) this.a);
        return Unit.INSTANCE;
    }
}
