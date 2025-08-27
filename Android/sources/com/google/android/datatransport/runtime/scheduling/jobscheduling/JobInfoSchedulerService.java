package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import org.apache.commons.logging.LogFactory;

public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt(LogFactory.PRIORITY_KEY);
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        qsf.b(getApplicationContext());
        g6d a2 = tc0.a();
        a2.y(string);
        a2.o = wub.b(i);
        if (string2 != null) {
            a2.c = Base64.decode(string2, 0);
        }
        zyf zyf = qsf.a().d;
        tc0 k = a2.k();
        uo5 uo5 = new uo5(16, (Object) this, (Object) jobParameters);
        zyf.getClass();
        zyf.e.execute(new w55(zyf, k, i2, uo5));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
