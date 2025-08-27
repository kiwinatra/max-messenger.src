package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.notifications.settings.NotificationsSettingsScreen;

/* renamed from: wfa  reason: default package */
public final class wfa extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ NotificationsSettingsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wfa(Continuation continuation, NotificationsSettingsScreen notificationsSettingsScreen) {
        super(2, continuation);
        this.b = notificationsSettingsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        wfa wfa = new wfa(continuation, this.b);
        wfa.a = obj;
        return wfa;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wfa) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.x.G((List) this.a);
        return Unit.INSTANCE;
    }
}
