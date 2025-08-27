package com.my.tracker.obfuscated;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class p {
    int a = 1;
    int b = -1;

    public o a(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", 1);
        int i = -1;
        int intExtra2 = registerReceiver.getIntExtra("level", -1);
        int intExtra3 = registerReceiver.getIntExtra("scale", -1);
        if (intExtra2 >= 0 && intExtra3 > 0) {
            i = (intExtra2 * 100) / intExtra3;
        }
        return new o(intExtra, i);
    }
}
