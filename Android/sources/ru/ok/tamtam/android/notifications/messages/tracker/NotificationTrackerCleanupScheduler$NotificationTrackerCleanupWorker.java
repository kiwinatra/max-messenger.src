package ru.ok.tamtam.android.notifications.messages.tracker;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"ru/ok/tamtam/android/notifications/messages/tracker/NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lhga;", "notificationsTracker", "Lx23;", "clientPrefs", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lhga;Lx23;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker extends Worker {
    public final hga b;
    public final x23 c;

    public NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker(Context context, WorkerParameters workerParameters, hga hga, x23 x23) {
        super(context, workerParameters);
        this.b = hga;
        this.c = x23;
    }

    public final d08 b() {
        long m = ((qjd) this.c).m() - TimeUnit.DAYS.toMillis(7);
        hga hga = this.b;
        synchronized (hga) {
            String str = hga.f;
            z68.c(str, "removeTrackerDataToTime: started, time=" + m, new Object[0]);
            int intValue = ((Number) new hce(new tbe(new wbe(hga.b().a.n().i(pf6.v), new yl4(m, 2), 0), ece.v, 1), new q0a(20), (List) null).f()).intValue();
            int intValue2 = ((Number) new hce(new tbe(new wbe(hga.d().b(), new yl4(m, 14), 0), bk3.w, 1), new q0a(20), (List) null).f()).intValue();
            z68.c(str, "removeTrackerDataToTime: finished, time=" + m + ", removed " + intValue + " analyticsEntries, " + intValue2 + " trackerMessages entries", new Object[0]);
        }
        return d08.b();
    }
}
