package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;

/* renamed from: do4  reason: default package */
public final class do4 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ DialogNotificationsSettingsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public do4(Continuation continuation, DialogNotificationsSettingsScreen dialogNotificationsSettingsScreen) {
        super(2, continuation);
        this.b = dialogNotificationsSettingsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        do4 do4 = new do4(continuation, this.b);
        do4.a = obj;
        return do4;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((do4) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.c.G((List) this.a);
        return Unit.INSTANCE;
    }
}
