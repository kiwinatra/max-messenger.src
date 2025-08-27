package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String a = h88.V("ConstrntProxyUpdtRecvr");

    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            h88.x().p(a, a81.m("Ignoring unknown action ", action));
        } else {
            dpg.d(context).d.h(new ij3(intent, context, goAsync(), 0));
        }
    }
}
