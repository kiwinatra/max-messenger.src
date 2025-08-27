package defpackage;

import java.util.Collection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xi1  reason: default package */
public final class xi1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;

    /* JADX WARNING: type inference failed for: r1v1, types: [xi1, kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.SuspendLambda] */
    public final Continuation create(Object obj, Continuation continuation) {
        ? suspendLambda = new SuspendLambda(2, continuation);
        suspendLambda.a = obj;
        return suspendLambda;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xi1) create((Collection) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ((sz9) ((lq4) m21.a.getAccessor().g(lq4.class)).c.getValue()).d((Collection) this.a);
        return Unit.INSTANCE;
    }
}
