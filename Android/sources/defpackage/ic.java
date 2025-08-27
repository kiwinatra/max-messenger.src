package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: ic  reason: default package */
public abstract class ic {
    public static final String a = h88.V("Alarms");

    public static void a(Context context, wog wog, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = f63.v;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        f63.d(intent, wog);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service != null && alarmManager != null) {
            h88 x = h88.x();
            x.p(a, "Cancelling existing alarm with (workSpecId, systemId) (" + wog + ", " + i + ")");
            alarmManager.cancel(service);
        }
    }

    public static void b(Context context, WorkDatabase workDatabase, wog wog, long j) {
        m7f v = workDatabase.v();
        l7f m = v.m(wog);
        Class<SystemAlarmService> cls = SystemAlarmService.class;
        if (m != null) {
            int i = m.c;
            a(context, wog, i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = f63.v;
            Intent intent = new Intent(context, cls);
            intent.setAction("ACTION_DELAY_MET");
            f63.d(intent, wog);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            if (alarmManager != null) {
                hc.a(alarmManager, 0, j, service);
                return;
            }
            return;
        }
        int intValue = ((Number) workDatabase.p(new h5(8, new rt6(22, (Object) workDatabase)))).intValue();
        v.o(new l7f(wog.a, wog.b, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = f63.v;
        Intent intent2 = new Intent(context, cls);
        intent2.setAction("ACTION_DELAY_MET");
        f63.d(intent2, wog);
        PendingIntent service2 = PendingIntent.getService(context, intValue, intent2, 201326592);
        if (alarmManager2 != null) {
            hc.a(alarmManager2, 0, j, service2);
        }
    }
}
