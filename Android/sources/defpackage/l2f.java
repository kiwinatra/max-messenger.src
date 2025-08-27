package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.suggests.SuggestsViewModel;

/* renamed from: l2f  reason: default package */
public final class l2f extends SuspendLambda implements Function2 {
    public final /* synthetic */ SuggestsViewModel a;
    public final /* synthetic */ zuf b;
    public final /* synthetic */ CharSequence c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l2f(SuggestsViewModel suggestsViewModel, zuf zuf, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.a = suggestsViewModel;
        this.b = zuf;
        this.c = charSequence;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new l2f(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l2f) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zuf zuf = this.b;
        zuf c2 = zuf.c(zuf, tze.a(zuf.b, this.c), erd.a);
        SuggestsViewModel suggestsViewModel = this.a;
        p1a p1a = suggestsViewModel.D;
        if (p1a == null) {
            p1a = null;
        }
        suggestsViewModel.n(c2, p1a.Y());
        return Unit.INSTANCE;
    }
}
