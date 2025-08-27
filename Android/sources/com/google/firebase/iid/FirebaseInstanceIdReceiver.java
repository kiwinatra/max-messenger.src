package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {
    public static SoftReference a;
    public static SoftReference b;

    public static int a(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (!Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            return 500;
        }
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(extras);
        if (!n79.R(putExtras)) {
            return -1;
        }
        n79.G("_nd", putExtras.getExtras());
        return -1;
    }

    public final void onReceive(Context context, Intent intent) {
        ExecutorService executorService;
        if (intent != null) {
            boolean isOrderedBroadcast = isOrderedBroadcast();
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (FirebaseInstanceIdReceiver.class) {
                try {
                    SoftReference softReference = a;
                    ExecutorService executorService2 = softReference != null ? (ExecutorService) softReference.get() : null;
                    if (executorService2 == null) {
                        executorService2 = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new j5a("firebase-iid-executor", 0)));
                        a = new SoftReference(executorService2);
                    }
                    executorService = executorService2;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            executorService.execute(new f4h(this, intent, context, isOrderedBroadcast, goAsync));
        }
    }
}
