package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: b1c  reason: default package */
public final class b1c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ j1c b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b1c(j1c j1c, Continuation continuation) {
        super(2, continuation);
        this.b = j1c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        b1c b1c = new b1c(this.b, continuation);
        b1c.a = obj;
        return b1c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b1c) create((x0c) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xag.h(this.b.x0, (x0c) this.a);
        return Unit.INSTANCE;
    }
}
