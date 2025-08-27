package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;

public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = h88.V("DiagnosticsRcvr");

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            h88 x = h88.x();
            String str = a;
            x.p(str, "Requesting diagnostics");
            try {
                dpg.d(context).a((w3b) new v3b(DiagnosticsWorker.class).build());
            } catch (IllegalStateException e) {
                h88.x().u(str, "WorkManager is not initialized", e);
            }
        }
    }
}
