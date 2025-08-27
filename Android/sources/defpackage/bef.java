package defpackage;

import androidx.work.WorkRequest;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KProperty;
import one.me.sdk.tasks.TaskMonitor$TaskMonitorWorker;

/* renamed from: bef  reason: default package */
public final class bef {
    public static final /* synthetic */ int b = 0;
    public final ipg a;

    public bef(ipg ipg) {
        this.a = ipg;
        icb icb = (icb) ((hcb) ((hcb) new hcb(TaskMonitor$TaskMonitorWorker.class, 6, TimeUnit.HOURS).setConstraints(new wj3(2, false, true, false, false, -1, -1, CollectionsKt.toSet(new LinkedHashSet())))).addTag("TASK_MONITOR_PERIODIC_TASK")).build();
        UUID id = icb.getId();
        z68.c("bef", "work " + id + " try to add TASK_MONITOR_PERIODIC_TASK request", new Object[0]);
        ipg.e(ipg, "TASK_MONITOR_PERIODIC_TASK", 2, icb, false, 24);
    }

    public final void a() {
        w3b w3b = (w3b) ((v3b) ((v3b) ((v3b) new v3b(TaskMonitor$TaskMonitorWorker.class).setBackoffCriteria(ag0.a, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).setConstraints(new wj3(2, false, false, false, false, -1, -1, CollectionsKt.toSet(new LinkedHashSet())))).addTag("TASK_MONITOR_ONE_TIME_TASK")).build();
        UUID id = w3b.getId();
        z68.c("bef", "work " + id + " try to add TASK_MONITOR_ONE_TIME_TASK request", new Object[0]);
        fb5 fb5 = fb5.b;
        KProperty[] kPropertyArr = ipg.n;
        this.a.b("TASK_MONITOR_ONE_TIME_TASK", fb5, w3b, false).v();
    }
}
