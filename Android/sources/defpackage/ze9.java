package defpackage;

import android.text.Layout;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ze9  reason: default package */
public final class ze9 extends SuspendLambda implements Function2 {
    public final /* synthetic */ gs7 a;
    public final /* synthetic */ Lazy b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ze9(gs7 gs7, Lazy lazy, Continuation continuation) {
        super(2, continuation);
        this.a = gs7;
        this.b = lazy;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ze9(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ze9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.a.b.b((Layout) this.b.getValue());
        return Unit.INSTANCE;
    }
}
