package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: wi2  reason: default package */
public final class wi2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ aj2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wi2(aj2 aj2, Continuation continuation) {
        super(2, continuation);
        this.b = aj2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        wi2 wi2 = new wi2(this.b, continuation);
        wi2.a = obj;
        return wi2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wi2) create((os8) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.G0.updateAndGet(new n01(3, (os8) this.a));
        return Unit.INSTANCE;
    }
}
