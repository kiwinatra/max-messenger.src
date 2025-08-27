package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* renamed from: pme  reason: default package */
public final class pme extends SuspendLambda implements Function3 {
    public final /* synthetic */ Ref.ObjectRef a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pme(Ref.ObjectRef objectRef, Continuation continuation) {
        super(3, continuation);
        this.a = objectRef;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ds5 ds5 = (ds5) obj;
        Throwable th = (Throwable) obj2;
        return new pme(this.a, (Continuation) obj3).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ((pm7) this.a.element).b((CancellationException) null);
        return Unit.INSTANCE;
    }
}
