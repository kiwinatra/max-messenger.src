package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.suggests.SuggestsFragment;

/* renamed from: n1f  reason: default package */
public final class n1f extends SuspendLambda implements Function2 {
    public final /* synthetic */ SuggestsFragment a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n1f(SuggestsFragment suggestsFragment, Continuation continuation) {
        super(2, continuation);
        this.a = suggestsFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new n1f(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n1f) create((r5a) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SuggestsFragment suggestsFragment = this.a;
        h5a h5a = suggestsFragment.p1;
        if (h5a != null) {
            h5a.dismiss();
        }
        suggestsFragment.p1 = null;
        return Unit.INSTANCE;
    }
}
