package com.my.tracker.campaign;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.my.tracker.obfuscated.x2;
import java.util.concurrent.atomic.AtomicBoolean;

public class MultipleInstallReceiver extends BroadcastReceiver {
    private static final String a = CampaignReceiver.class.getName();
    private static final String b = MultipleInstallReceiver.class.getName();
    private static final AtomicBoolean c = new AtomicBoolean();

    public void onReceive(Context context, Intent intent) {
        if (intent != null && "com.android.vending.INSTALL_REFERRER".equals(intent.getAction())) {
            if (!c.compareAndSet(false, true)) {
                x2.a("MultipleInstallReceiver: attempt to call, but it was called before");
                return;
            }
            x2.a("MultipleInstallReceiver called");
            CampaignReceiver.a(context, intent);
            for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER").setPackage(context.getPackageName()), 0)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null) {
                    String str = activityInfo.name;
                    if (!a.equals(str) && !b.equals(str)) {
                        x2.a("MultipleInstallReceiver: trigger onReceive class " + str);
                        try {
                            ((BroadcastReceiver) Class.forName(str).newInstance()).onReceive(context, intent);
                        } catch (Throwable th) {
                            StringBuilder p = tr1.p("MultipleInstallReceiver: error in BroadcastReceiver ", str, " : ");
                            p.append(th.getMessage());
                            x2.a(p.toString());
                        }
                    }
                }
            }
        }
    }
}
