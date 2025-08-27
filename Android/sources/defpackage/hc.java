package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* renamed from: hc  reason: default package */
public abstract class hc {
    public static void a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        alarmManager.setExact(i, j, pendingIntent);
    }
}
