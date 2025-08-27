package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;

/* renamed from: il2  reason: default package */
public final class il2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatNotificationsSettingsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public il2(Continuation continuation, ChatNotificationsSettingsScreen chatNotificationsSettingsScreen) {
        super(2, continuation);
        this.b = chatNotificationsSettingsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        il2 il2 = new il2(continuation, this.b);
        il2.a = obj;
        return il2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((il2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.c.G((List) this.a);
        return Unit.INSTANCE;
    }
}
