package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: xgd  reason: default package */
public final class xgd extends BroadcastReceiver {
    public final HashSet a = new HashSet();

    public xgd(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                udg udg = (udg) it.next();
                udg.getClass();
                z68.c("udg", "onScreenOff", new Object[0]);
                if (udg.l) {
                    udg.l = false;
                    if (udg.k) {
                        udg.a();
                    }
                }
            }
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                udg udg2 = (udg) it2.next();
                z68.c("udg", "onScreenOn, isAppVisible=" + udg2.k + ", isScreenOn=" + udg2.l, new Object[0]);
                if (!udg2.l) {
                    udg2.l = true;
                    if (udg2.k) {
                        udg2.b();
                    }
                }
            }
        }
    }
}
