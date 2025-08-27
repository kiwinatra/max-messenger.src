package defpackage;

import android.app.job.JobParameters;
import android.net.Uri;

/* renamed from: p7f  reason: default package */
public abstract class p7f {
    public static String[] a(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }

    public static Uri[] b(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }
}
