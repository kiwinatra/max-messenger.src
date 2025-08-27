package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.suggests.SuggestsViewModel;

/* renamed from: j2f  reason: default package */
public final class j2f extends SuspendLambda implements Function2 {
    public final /* synthetic */ SuggestsViewModel a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j2f(SuggestsViewModel suggestsViewModel, Continuation continuation) {
        super(2, continuation);
        this.a = suggestsViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new j2f(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j2f) create((CharSequence) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SuggestsViewModel.j(this.a);
        return Unit.INSTANCE;
    }
}
