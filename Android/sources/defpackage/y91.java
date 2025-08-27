package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import one.me.android.calls.CallNotifierBroadcastReceiver;
import one.me.android.calls.CallNotifierFixActivity;

/* renamed from: y91  reason: default package */
public final class y91 {
    public final Lazy a;

    public y91(Lazy lazy) {
        this.a = lazy;
    }

    public static void b(Intent intent, y11 y11, boolean z) {
        intent.setAction("action-open-incoming");
        CharSequence charSequence = y11.b;
        if (charSequence == null) {
            charSequence = "";
        }
        intent.putExtra("incoming_param_name", charSequence);
        String str = y11.c;
        intent.putExtra("incoming_param_avatar", str != null ? Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 0) : null);
        Long l = y11.a;
        intent.putExtra("incoming_param_chat_id", l != null ? l.longValue() : 0);
        intent.putExtra("incoming_param_is_video", z);
        intent.setFlags(268435456);
    }

    public final PendingIntent a(Application application, Function1 function1) {
        if (o2g.a >= 31) {
            Intent intent = new Intent(application, CallNotifierFixActivity.class);
            function1.invoke(intent);
            return PendingIntent.getActivity(application, 0, intent, 201326592);
        }
        Intent intent2 = new Intent(application, CallNotifierBroadcastReceiver.class);
        function1.invoke(intent2);
        return PendingIntent.getBroadcast(application, 0, intent2, 201326592);
    }

    public final Application c() {
        return (Application) this.a.getValue();
    }

    public final PendingIntent d() {
        Application c = c();
        if (o2g.a >= 31) {
            Intent intent = new Intent(c, CallNotifierFixActivity.class);
            intent.setAction("action-microphone-state");
            Unit unit = Unit.INSTANCE;
            return PendingIntent.getActivity(c, 0, intent, 201326592);
        }
        Intent intent2 = new Intent(c, CallNotifierBroadcastReceiver.class);
        intent2.setAction("action-microphone-state");
        Unit unit2 = Unit.INSTANCE;
        return PendingIntent.getBroadcast(c, 0, intent2, 201326592);
    }
}
