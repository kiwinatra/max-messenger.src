package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* renamed from: wm7  reason: default package */
public final class wm7 implements vm7 {
    public final /* synthetic */ int a;
    public final JobWorkItem b;
    public final /* synthetic */ JobServiceEngine c;

    public /* synthetic */ wm7(JobServiceEngine jobServiceEngine, JobWorkItem jobWorkItem, int i) {
        this.a = i;
        this.c = jobServiceEngine;
        this.b = jobWorkItem;
    }

    public final void e() {
        switch (this.a) {
            case 0:
                synchronized (((xm7) this.c).c) {
                    try {
                        JobParameters jobParameters = ((xm7) this.c).d;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.b);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                synchronized (((xm7) this.c).c) {
                    JobParameters jobParameters2 = ((xm7) this.c).d;
                    if (jobParameters2 != null) {
                        try {
                            jobParameters2.completeWork(this.b);
                        } catch (IllegalArgumentException | SecurityException e) {
                            e.printStackTrace();
                        }
                    }
                }
                return;
        }
    }

    public final Intent getIntent() {
        switch (this.a) {
            case 0:
                return this.b.getIntent();
            default:
                return this.b.getIntent();
        }
    }
}
