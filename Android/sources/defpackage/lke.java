package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.calls.utils.StartCallsViewModel;

/* renamed from: lke  reason: default package */
public final class lke extends SuspendLambda implements Function2 {
    public final /* synthetic */ StartCallsViewModel a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lke(StartCallsViewModel startCallsViewModel, Continuation continuation) {
        super(2, continuation);
        this.a = startCallsViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new lke(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lke) create((a32) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xme xme = this.a.n;
        o85 o85 = new o85(dke.a);
        xme.getClass();
        xme.m((Object) null, o85);
        return Unit.INSTANCE;
    }
}
