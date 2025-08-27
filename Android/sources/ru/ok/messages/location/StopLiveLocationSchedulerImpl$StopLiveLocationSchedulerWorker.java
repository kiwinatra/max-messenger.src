package ru.ok.messages.location;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ru/ok/messages/location/StopLiveLocationSchedulerImpl$StopLiveLocationSchedulerWorker", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Ld18;", "liveLocationManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ld18;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class StopLiveLocationSchedulerImpl$StopLiveLocationSchedulerWorker extends Worker {
    public final d18 b;

    public StopLiveLocationSchedulerImpl$StopLiveLocationSchedulerWorker(Context context, WorkerParameters workerParameters, d18 d18) {
        super(context, workerParameters);
        this.b = d18;
    }

    public final d08 b() {
        UUID id = getId();
        z68.c("qwe", "work " + id + " started", new Object[0]);
        ((j18) this.b).e();
        UUID id2 = getId();
        z68.c("qwe", "work " + id2 + " finished", new Object[0]);
        return d08.b();
    }
}
