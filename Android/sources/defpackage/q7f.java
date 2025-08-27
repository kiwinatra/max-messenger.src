package defpackage;

import android.app.job.JobParameters;
import android.net.Network;

/* renamed from: q7f  reason: default package */
public abstract class q7f {
    public static Network a(JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }
}
