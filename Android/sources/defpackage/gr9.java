package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: gr9  reason: default package */
public final class gr9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ir9 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gr9(ir9 ir9, Continuation continuation) {
        super(2, continuation);
        this.b = ir9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        gr9 gr9 = new gr9(this.b, continuation);
        gr9.a = obj;
        return gr9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gr9) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = (List) this.a;
        uua uua = this.b.a;
        a67 a67 = z68.b;
        if (a67 != null) {
            uua.getClass();
            if (a67.c()) {
                a67.d(w78.o, "OneMeInitialDataStorage", wj6.h(list.size(), "updateMiniChats by count: "), (Throwable) null);
            }
        }
        ((AtomicReference) ((zq9) uua.b.getValue()).c).set(list);
        ((zq9) uua.b.getValue()).J();
        return Unit.INSTANCE;
    }
}
