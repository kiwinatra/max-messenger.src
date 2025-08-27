package com.my.tracker.campaign;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.my.tracker.obfuscated.m;
import com.my.tracker.obfuscated.p0;
import com.my.tracker.obfuscated.x2;

public final class CampaignService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        x2.a("CampaignService: onCreate");
    }

    public void onDestroy() {
        super.onDestroy();
        x2.a("CampaignService: onDestroy");
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        pr1 pr1 = new pr1(7, this);
        if (intent != null) {
            String stringExtra = intent.getStringExtra("referrer");
            if (!TextUtils.isEmpty(stringExtra)) {
                m.a(new ktg(this, stringExtra, pr1, 16));
                return super.onStartCommand((Intent) null, i, i2);
            }
        }
        m.a(pr1);
        return 2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        p0.a(str, (Context) this, runnable);
    }
}
