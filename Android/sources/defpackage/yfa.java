package defpackage;

import android.content.Context;
import android.content.Intent;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.notifications.settings.NotificationsSettingsScreen;

/* renamed from: yfa  reason: default package */
public final class yfa extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ NotificationsSettingsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yfa(Continuation continuation, NotificationsSettingsScreen notificationsSettingsScreen) {
        super(2, continuation);
        this.b = notificationsSettingsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        yfa yfa = new yfa(continuation, this.b);
        yfa.a = obj;
        return yfa;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yfa) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        if (v5a instanceof pa4) {
            wea.b.Y0((pa4) v5a);
        } else if (v5a instanceof tfa) {
            String str = hsg.n;
            Context context = this.b.getContext();
            try {
                Result.Companion companion = Result.Companion;
                Intent intent = new Intent();
                intent.setFlags(268435456);
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                context.startActivity(intent);
                obj2 = Result.m23constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
            }
            Throwable r2 = Result.m26exceptionOrNullimpl(obj2);
            if (r2 != null) {
                z68.f(hsg.n, "openNotificationsSettings: failed", r2);
            }
        }
        return Unit.INSTANCE;
    }
}
