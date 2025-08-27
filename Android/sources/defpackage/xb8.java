package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.android.MainActivity;
import ru.ok.tamtam.logout.a;

/* renamed from: xb8  reason: default package */
public final class xb8 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MainActivity a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xb8(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.a = mainActivity;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new xb8(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xb8) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MainActivity mainActivity = this.a;
        bs0.K(new ps5(ct.k(((a) qra.a.getAccessor().g(a.class)).c(fqc.p(mainActivity)), mainActivity.getLifecycle(), iu7.o), new wb8(mainActivity, (Continuation) null), 5), i8b.t(mainActivity.getLifecycle()));
        return Unit.INSTANCE;
    }
}
