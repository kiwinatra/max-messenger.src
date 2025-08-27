package ru.ok.messages.calls.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class CallsMediaButtonReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        w21 k = ((qra) ym.e()).k();
        if (k.a == null) {
            k.d.b.getClass();
            k.a = new ko1(k.b, k, k.e);
            k.c.e();
        }
        k.a.f(this, intent);
    }
}
