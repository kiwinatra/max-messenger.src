package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* renamed from: vnf  reason: default package */
public final class vnf extends BroadcastReceiver {
    public wnf a;

    public final synchronized void onReceive(Context context, Intent intent) {
        wnf wnf = this.a;
        if (wnf != null) {
            if (wnf.c()) {
                wnf wnf2 = this.a;
                ((unf) wnf2.w).f.schedule(wnf2, 0, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.a = null;
            }
        }
    }
}
