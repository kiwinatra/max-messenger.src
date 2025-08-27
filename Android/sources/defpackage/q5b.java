package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;

/* renamed from: q5b  reason: default package */
public final class q5b extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ OtherNotificationsSettingsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q5b(Continuation continuation, OtherNotificationsSettingsScreen otherNotificationsSettingsScreen) {
        super(2, continuation);
        this.b = otherNotificationsSettingsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        q5b q5b = new q5b(continuation, this.b);
        q5b.a = obj;
        return q5b;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q5b) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.c.G((List) this.a);
        return Unit.INSTANCE;
    }
}
