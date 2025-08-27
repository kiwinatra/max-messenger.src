package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import java.util.HashMap;

public class SystemJobService extends JobService implements u95 {
    public static final String o = h88.V("SystemJobService");
    public dpg a;
    public final HashMap b = new HashMap();
    public final dm4 c = new dm4(26);

    public static wog a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new wog(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public final void b(wog wog, boolean z) {
        JobParameters jobParameters;
        h88 x = h88.x();
        String str = o;
        x.p(str, wog.a + " executed on JobScheduler");
        synchronized (this.b) {
            jobParameters = (JobParameters) this.b.remove(wog);
        }
        this.c.r(wog);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    public final void onCreate() {
        super.onCreate();
        try {
            dpg d = dpg.d(getApplicationContext());
            this.a = d;
            d.f.a(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                h88.x().Z(o, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        dpg dpg = this.a;
        if (dpg != null) {
            dpg.f.e(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        r0 = new defpackage.aqg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (defpackage.p7f.b(r8) == null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r0.b = java.util.Arrays.asList(defpackage.p7f.b(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0083, code lost:
        if (defpackage.p7f.a(r8) == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        r0.a = java.util.Arrays.asList(defpackage.p7f.a(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        r0.c = defpackage.q7f.a(r8);
        r7.a.h(r7.c.w(r2), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a0, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onStartJob(android.app.job.JobParameters r8) {
        /*
            r7 = this;
            java.lang.String r0 = "onStartJob for "
            java.lang.String r1 = "Job is already being executed by SystemJobService: "
            dpg r2 = r7.a
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0019
            h88 r0 = defpackage.h88.x()
            java.lang.String r1 = o
            java.lang.String r2 = "WorkManager is not initialized; requesting retry."
            r0.p(r1, r2)
            r7.jobFinished(r8, r3)
            return r4
        L_0x0019:
            wog r2 = a(r8)
            if (r2 != 0) goto L_0x002b
            h88 r7 = defpackage.h88.x()
            java.lang.String r8 = o
            java.lang.String r0 = "WorkSpec id not found!"
            r7.t(r8, r0)
            return r4
        L_0x002b:
            java.util.HashMap r5 = r7.b
            monitor-enter(r5)
            java.util.HashMap r6 = r7.b     // Catch:{ all -> 0x004d }
            boolean r6 = r6.containsKey(r2)     // Catch:{ all -> 0x004d }
            if (r6 == 0) goto L_0x004f
            h88 r7 = defpackage.h88.x()     // Catch:{ all -> 0x004d }
            java.lang.String r8 = o     // Catch:{ all -> 0x004d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r0.<init>(r1)     // Catch:{ all -> 0x004d }
            r0.append(r2)     // Catch:{ all -> 0x004d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x004d }
            r7.p(r8, r0)     // Catch:{ all -> 0x004d }
            monitor-exit(r5)     // Catch:{ all -> 0x004d }
            return r4
        L_0x004d:
            r7 = move-exception
            goto L_0x00a1
        L_0x004f:
            h88 r1 = defpackage.h88.x()     // Catch:{ all -> 0x004d }
            java.lang.String r4 = o     // Catch:{ all -> 0x004d }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r6.<init>(r0)     // Catch:{ all -> 0x004d }
            r6.append(r2)     // Catch:{ all -> 0x004d }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x004d }
            r1.p(r4, r0)     // Catch:{ all -> 0x004d }
            java.util.HashMap r0 = r7.b     // Catch:{ all -> 0x004d }
            r0.put(r2, r8)     // Catch:{ all -> 0x004d }
            monitor-exit(r5)     // Catch:{ all -> 0x004d }
            aqg r0 = new aqg
            r0.<init>()
            android.net.Uri[] r1 = defpackage.p7f.b(r8)
            if (r1 == 0) goto L_0x007f
            android.net.Uri[] r1 = defpackage.p7f.b(r8)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.b = r1
        L_0x007f:
            java.lang.String[] r1 = defpackage.p7f.a(r8)
            if (r1 == 0) goto L_0x008f
            java.lang.String[] r1 = defpackage.p7f.a(r8)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.a = r1
        L_0x008f:
            android.net.Network r8 = defpackage.q7f.a(r8)
            r0.c = r8
            dpg r8 = r7.a
            dm4 r7 = r7.c
            bme r7 = r7.w(r2)
            r8.h(r7, r0)
            return r3
        L_0x00a1:
            monitor-exit(r5)     // Catch:{ all -> 0x004d }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.a == null) {
            h88.x().p(o, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        wog a2 = a(jobParameters);
        if (a2 == null) {
            h88.x().t(o, "WorkSpec id not found!");
            return false;
        }
        h88 x = h88.x();
        String str = o;
        x.p(str, "onStopJob for " + a2);
        synchronized (this.b) {
            this.b.remove(a2);
        }
        bme r = this.c.r(a2);
        if (r != null) {
            dpg dpg = this.a;
            dpg.d.h(new swe(dpg, r, false));
        }
        rvb rvb = this.a.f;
        String str2 = a2.a;
        synchronized (rvb.Z) {
            contains = rvb.X.contains(str2);
        }
        return !contains;
    }
}
