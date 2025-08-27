package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: hj3  reason: default package */
public abstract class hj3 extends BroadcastReceiver {
    public static final String a = h88.V("ConstraintProxy");

    public final void onReceive(Context context, Intent intent) {
        h88 x = h88.x();
        x.p(a, "onReceive : " + intent);
        String str = f63.v;
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
