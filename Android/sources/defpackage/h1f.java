package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.suggests.SuggestsFragment;

/* renamed from: h1f  reason: default package */
public final class h1f extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ boolean c = false;
    public final /* synthetic */ SuggestsFragment o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h1f(etc etc, Continuation continuation, SuggestsFragment suggestsFragment) {
        super(2, continuation);
        this.b = etc;
        this.o = suggestsFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        h1f h1f = new h1f((etc) this.b, continuation, this.o);
        h1f.a = obj;
        return h1f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h1f) create((o85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Object a2 = ((o85) this.a).a();
        if (Result.m26exceptionOrNullimpl(a2) != null) {
            return Unit.INSTANCE;
        }
        try {
            Unit unit = (Unit) a2;
            SuggestsFragment.T2(this.o);
            obj2 = Result.m23constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (!this.c) {
            ResultKt.throwOnFailure(obj2);
        }
        return Unit.INSTANCE;
    }
}
