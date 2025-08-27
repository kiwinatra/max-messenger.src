package defpackage;

import android.os.Build;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.notifications.settings.NotificationsSettingsScreen;

/* renamed from: vfa  reason: default package */
public final class vfa extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ NotificationsSettingsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vfa(Continuation continuation, NotificationsSettingsScreen notificationsSettingsScreen) {
        super(2, continuation);
        this.b = notificationsSettingsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        vfa vfa = new vfa(continuation, this.b);
        vfa.a = obj;
        return vfa;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vfa) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (((Boolean) this.a).booleanValue()) {
            NotificationsSettingsScreen notificationsSettingsScreen = this.b;
            edb edb = (edb) notificationsSettingsScreen.o.getValue();
            eng eng = new eng(notificationsSettingsScreen, 1);
            if (Build.VERSION.SDK_INT >= 33) {
                edb.d(eng, edb.k, 177, bmc.permissions_post_notification_request_rationale, bmc.permissions_post_notification_request_title, bmc.permissions_post_notification_request_positive_button);
            } else {
                edb.getClass();
            }
        }
        return Unit.INSTANCE;
    }
}
