package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.notifications.settings.NotificationsSettingsScreen;

/* renamed from: xfa  reason: default package */
public final class xfa extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ NotificationsSettingsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xfa(Continuation continuation, NotificationsSettingsScreen notificationsSettingsScreen) {
        super(2, continuation);
        this.b = notificationsSettingsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        xfa xfa = new xfa(continuation, this.b);
        xfa.a = obj;
        return xfa;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xfa) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.v.G((List) this.a);
        return Unit.INSTANCE;
    }
}
