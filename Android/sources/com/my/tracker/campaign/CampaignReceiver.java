package com.my.tracker.campaign;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.my.tracker.obfuscated.x2;

public class CampaignReceiver extends BroadcastReceiver {
    public static void a(Context context, Intent intent) {
        Bundle extras;
        if (intent != null && (extras = intent.getExtras()) != null) {
            String string = extras.getString("referrer");
            if (TextUtils.isEmpty(string)) {
                x2.a("CampaignReceiver: referrer is null or empty");
                return;
            }
            x2.a("CampaignReceiver: got referrer " + string);
            try {
                context.startService(new Intent(context, CampaignService.class).putExtra("referrer", string));
            } catch (Throwable th) {
                x2.b("CampaignReceiver error: " + th);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        a(context, intent);
    }
}
