package androidx.work.impl.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    public static final String a = h88.V("ForceStopRunnable$Rcvr");

    public final void onReceive(Context context, Intent intent) {
        if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            h88.x().X();
            l96.c(context);
        }
    }
}
