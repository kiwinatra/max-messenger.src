package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import ru.ok.tamtam.calls.CallDialogFragment;

/* renamed from: tke  reason: default package */
public final class tke extends SuspendLambda implements Function2 {
    public final /* synthetic */ Ref.ObjectRef a;
    public final /* synthetic */ CallDialogFragment b;
    public final /* synthetic */ d19 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tke(Ref.ObjectRef objectRef, CallDialogFragment callDialogFragment, d19 d19, Continuation continuation) {
        super(2, continuation);
        this.a = objectRef;
        this.b = callDialogFragment;
        this.c = d19;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new tke(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tke) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        T mq1 = new mq1(this.b, this.c);
        this.a.element = mq1;
        mq1.b();
        return Unit.INSTANCE;
    }
}
