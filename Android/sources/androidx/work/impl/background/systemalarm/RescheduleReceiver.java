package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = h88.V("RescheduleReceiver");

    public final void onReceive(Context context, Intent intent) {
        h88 x = h88.x();
        String str = a;
        x.p(str, "Received intent " + intent);
        try {
            dpg d = dpg.d(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            d.getClass();
            synchronized (dpg.m) {
                BroadcastReceiver.PendingResult pendingResult = d.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                d.i = goAsync;
                if (d.h) {
                    goAsync.finish();
                    d.i = null;
                }
            }
        } catch (IllegalStateException e) {
            h88.x().u(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        } catch (Throwable th) {
            throw th;
        }
    }
}
