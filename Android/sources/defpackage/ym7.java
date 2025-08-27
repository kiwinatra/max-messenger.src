package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;

/* renamed from: ym7  reason: default package */
public final class ym7 extends zm7 {
    public final JobInfo c;
    public final JobScheduler d;

    public ym7(Context context, ComponentName componentName, int i) {
        a(i);
        this.c = new JobInfo.Builder(i, componentName).setOverrideDeadline(0).build();
        this.d = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }
}
