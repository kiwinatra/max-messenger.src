package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import org.apache.commons.logging.LogFactory;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter(LogFactory.PRIORITY_KEY)).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        qsf.b(context);
        g6d a2 = tc0.a();
        a2.y(queryParameter);
        a2.o = wub.b(intValue);
        if (queryParameter2 != null) {
            a2.c = Base64.decode(queryParameter2, 0);
        }
        zyf zyf = qsf.a().d;
        tc0 k = a2.k();
        gc gcVar = new gc(0);
        zyf.getClass();
        zyf.e.execute(new w55(zyf, k, i, gcVar));
    }
}
