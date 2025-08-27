package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.os.IBinder;

/* renamed from: xm7  reason: default package */
public final class xm7 extends JobServiceEngine implements tm7 {
    public final /* synthetic */ int a;
    public final an7 b;
    public final Object c;
    public JobParameters d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xm7(an7 an7, int i) {
        super(an7);
        this.a = i;
        switch (i) {
            case 1:
                super(an7);
                this.c = new Object();
                this.b = an7;
                return;
            default:
                this.c = new Object();
                this.b = an7;
                return;
        }
    }

    public final IBinder a() {
        switch (this.a) {
            case 0:
                return getBinder();
            default:
                return getBinder();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0047, code lost:
        r1.getIntent().setExtrasClassLoader(r3.b.getClassLoader());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return new defpackage.wm7(r3, r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.vm7 b() {
        /*
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L_0x0034;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            android.app.job.JobParameters r1 = r3.d     // Catch:{ all -> 0x000f }
            r2 = 0
            if (r1 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            goto L_0x0031
        L_0x000f:
            r3 = move-exception
            goto L_0x0032
        L_0x0011:
            android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ SecurityException -> 0x0016 }
            goto L_0x001b
        L_0x0016:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ all -> 0x000f }
            r1 = r2
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            if (r1 == 0) goto L_0x0031
            android.content.Intent r0 = r1.getIntent()
            an7 r2 = r3.b
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r0.setExtrasClassLoader(r2)
            wm7 r2 = new wm7
            r0 = 1
            r2.<init>(r3, r1, r0)
        L_0x0031:
            return r2
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            throw r3
        L_0x0034:
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            android.app.job.JobParameters r1 = r3.d     // Catch:{ all -> 0x003e }
            r2 = 0
            if (r1 != 0) goto L_0x0040
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            goto L_0x005a
        L_0x003e:
            r3 = move-exception
            goto L_0x005b
        L_0x0040:
            android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x003e }
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x005a
            android.content.Intent r0 = r1.getIntent()
            an7 r2 = r3.b
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r0.setExtrasClassLoader(r2)
            wm7 r2 = new wm7
            r0 = 0
            r2.<init>(r3, r1, r0)
        L_0x005a:
            return r2
        L_0x005b:
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm7.b():vm7");
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        switch (this.a) {
            case 0:
                this.d = jobParameters;
                this.b.ensureProcessorRunningLocked(false);
                return true;
            default:
                this.d = jobParameters;
                this.b.ensureProcessorRunningLocked(false);
                return true;
        }
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        switch (this.a) {
            case 0:
                boolean doStopCurrentWork = this.b.doStopCurrentWork();
                synchronized (this.c) {
                    this.d = null;
                }
                return doStopCurrentWork;
            default:
                boolean doStopCurrentWork2 = this.b.doStopCurrentWork();
                synchronized (this.c) {
                    this.d = null;
                }
                return doStopCurrentWork2;
        }
    }
}
