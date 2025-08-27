package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.profile.ProfileScreen;

/* renamed from: q5c  reason: default package */
public final class q5c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ProfileScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q5c(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.b = profileScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        q5c q5c = new q5c(continuation, this.b);
        q5c.a = obj;
        return q5c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q5c) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = (List) this.a;
        KProperty[] kPropertyArr = ProfileScreen.D0;
        tyc adapter = this.b.f0().getAdapter();
        x5c x5c = adapter instanceof x5c ? (x5c) adapter : null;
        if (x5c != null) {
            x5c.G(list);
        }
        return Unit.INSTANCE;
    }
}
