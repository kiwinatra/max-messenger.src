package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import org.apache.commons.logging.LogFactory;

/* renamed from: rm7  reason: default package */
public final class rm7 {
    public final Context a;
    public final g95 b;
    public final bc0 c;

    public rm7(Context context, g95 g95, bc0 bc0) {
        this.a = context;
        this.b = g95;
        this.c = bc0;
    }

    /* JADX INFO: finally extract failed */
    public final void a(tc0 tc0, int i, boolean z) {
        tc0 tc02 = tc0;
        int i2 = i;
        Context context = this.a;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(tc02.a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        tub tub = tc02.c;
        adler32.update(allocate.putInt(wub.a(tub)).array());
        byte[] bArr = tc02.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i3 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i3 >= i2) {
                        y64.q(tc02, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        SQLiteDatabase m = ((nbd) this.b).m();
        String valueOf = String.valueOf(wub.a(tub));
        String str = tc02.a;
        Cursor rawQuery = m.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf});
        try {
            Long valueOf2 = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf2.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            bc0 bc0 = this.c;
            JobScheduler jobScheduler2 = jobScheduler;
            int i4 = value;
            builder.setMinimumLatency(bc0.a(tub, longValue, i2));
            Set set = ((cc0) bc0.b.get(tub)).c;
            if (set.contains(ofd.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(ofd.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(ofd.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i2);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt(LogFactory.PRIORITY_KEY, wub.a(tub));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {tc02, Integer.valueOf(i4), Long.valueOf(bc0.a(tub, longValue, i2)), valueOf2, Integer.valueOf(i)};
            if (Log.isLoggable("TRuntime.".concat("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler2.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
