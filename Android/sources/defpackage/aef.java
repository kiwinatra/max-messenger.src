package defpackage;

import java.util.UUID;
import one.me.sdk.tasks.TaskMonitor$TaskMonitorWorker;

/* renamed from: aef  reason: default package */
public final class aef implements nsb, zi6 {
    public final /* synthetic */ TaskMonitor$TaskMonitorWorker a;

    public /* synthetic */ aef(TaskMonitor$TaskMonitorWorker taskMonitor$TaskMonitorWorker) {
        this.a = taskMonitor$TaskMonitorWorker;
    }

    public Object apply(Object obj) {
        UUID id = this.a.getId();
        z68.f("bef", "work " + id + " on error", (Throwable) obj);
        return Boolean.FALSE;
    }

    public boolean test(Object obj) {
        Boolean bool = (Boolean) obj;
        TaskMonitor$TaskMonitorWorker taskMonitor$TaskMonitorWorker = this.a;
        UUID id = taskMonitor$TaskMonitorWorker.getId();
        z68.c("bef", "work " + id + " Receive task remove callback", new Object[0]);
        return taskMonitor$TaskMonitorWorker.c();
    }
}
