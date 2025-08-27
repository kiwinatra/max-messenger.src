package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: c8a  reason: default package */
public final class c8a extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ NeuroAvatarsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c8a(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.b = neuroAvatarsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        c8a c8a = new c8a(continuation, this.b);
        c8a.a = obj;
        return c8a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c8a) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.G0.G((List) this.a);
        return Unit.INSTANCE;
    }
}
