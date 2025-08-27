package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: unf  reason: default package */
public final class unf {
    public static final long i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;
    public final Context a;
    public final jv3 b;
    public final kwd c;
    public final FirebaseMessaging d;
    public final ts e = new qae(0);
    public final ScheduledExecutorService f;
    public boolean g = false;
    public final snf h;

    /* JADX WARNING: type inference failed for: r0v0, types: [qae, ts] */
    public unf(FirebaseMessaging firebaseMessaging, jv3 jv3, snf snf, kwd kwd, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = jv3;
        this.h = snf;
        this.c = kwd;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void a(s7h s7h) {
        try {
            hsg.d(s7h, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e2);
            }
        } catch (InterruptedException | TimeoutException e3) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e3);
        }
    }

    public final void b(String str) {
        String a2 = this.d.a();
        kwd kwd = this.c;
        kwd.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(kwd.d(kwd.h(bundle, a2, "/topics/" + str)));
    }

    public final void c(String str) {
        String a2 = this.d.a();
        kwd kwd = this.c;
        kwd.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(kwd.d(kwd.h(bundle, a2, "/topics/" + str)));
    }

    public final synchronized void d(boolean z) {
        this.g = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r3 = r0.b;
        r4 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r4 == 83) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        if (r4 == 85) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        if (r3.equals("U") == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        if (r3.equals("S") == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0035, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0037, code lost:
        r3 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0038, code lost:
        r4 = r0.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003a, code lost:
        if (r3 == 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003c, code lost:
        if (r3 == 1) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        c(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0043, code lost:
        b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0046, code lost:
        r1 = r6.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r2 = r1.a;
        r3 = r0.c;
        r4 = (java.util.ArrayDeque) r2.v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0051, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005a, code lost:
        if (((java.util.ArrayDeque) r2.v).remove(r3) == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005c, code lost:
        ((java.util.concurrent.Executor) r2.w).execute(new defpackage.mgd(6, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0069, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006a, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006b, code lost:
        r2 = r6.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006d, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r0 = r0.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0076, code lost:
        if (r6.e.containsKey(r0) != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0078, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007a, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x007c, code lost:
        r1 = (java.util.ArrayDeque) r6.e.get(r0);
        r3 = (defpackage.qdf) r1.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x008a, code lost:
        if (r3 == null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x008c, code lost:
        r3.b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0094, code lost:
        if (r1.isEmpty() == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0096, code lost:
        r6.e.remove(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x009b, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x009f, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00b0, code lost:
        if ("SERVICE_NOT_AVAILABLE".equals(r6.getMessage()) != false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00cf, code lost:
        if (r6.getMessage() != null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00d2, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00d3, code lost:
        r6.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00d6, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r6 = this;
        L_0x0000:
            monitor-enter(r6)
            snf r0 = r6.h     // Catch:{ all -> 0x000c }
            rnf r0 = r0.a()     // Catch:{ all -> 0x000c }
            r1 = 1
            if (r0 != 0) goto L_0x000f
            monitor-exit(r6)     // Catch:{ all -> 0x000c }
            return r1
        L_0x000c:
            r0 = move-exception
            goto L_0x00d7
        L_0x000f:
            monitor-exit(r6)     // Catch:{ all -> 0x000c }
            r2 = 0
            java.lang.String r3 = r0.b     // Catch:{ IOException -> 0x002a }
            int r4 = r3.hashCode()     // Catch:{ IOException -> 0x002a }
            r5 = 83
            if (r4 == r5) goto L_0x002d
            r5 = 85
            if (r4 == r5) goto L_0x0020
            goto L_0x0037
        L_0x0020:
            java.lang.String r4 = "U"
            boolean r3 = r3.equals(r4)     // Catch:{ IOException -> 0x002a }
            if (r3 == 0) goto L_0x0037
            r3 = r1
            goto L_0x0038
        L_0x002a:
            r6 = move-exception
            goto L_0x00a6
        L_0x002d:
            java.lang.String r4 = "S"
            boolean r3 = r3.equals(r4)     // Catch:{ IOException -> 0x002a }
            if (r3 == 0) goto L_0x0037
            r3 = r2
            goto L_0x0038
        L_0x0037:
            r3 = -1
        L_0x0038:
            java.lang.String r4 = r0.a
            if (r3 == 0) goto L_0x0043
            if (r3 == r1) goto L_0x003f
            goto L_0x0046
        L_0x003f:
            r6.c(r4)     // Catch:{ IOException -> 0x002a }
            goto L_0x0046
        L_0x0043:
            r6.b(r4)     // Catch:{ IOException -> 0x002a }
        L_0x0046:
            snf r1 = r6.h
            monitor-enter(r1)
            soc r2 = r1.a     // Catch:{ all -> 0x00a3 }
            java.lang.String r3 = r0.c     // Catch:{ all -> 0x00a3 }
            java.lang.Object r4 = r2.v     // Catch:{ all -> 0x00a3 }
            java.util.ArrayDeque r4 = (java.util.ArrayDeque) r4     // Catch:{ all -> 0x00a3 }
            monitor-enter(r4)     // Catch:{ all -> 0x00a3 }
            java.lang.Object r5 = r2.v     // Catch:{ all -> 0x00a0 }
            java.util.ArrayDeque r5 = (java.util.ArrayDeque) r5     // Catch:{ all -> 0x00a0 }
            boolean r3 = r5.remove(r3)     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x0069
            mgd r3 = new mgd     // Catch:{ all -> 0x00a0 }
            r5 = 6
            r3.<init>(r5, r2)     // Catch:{ all -> 0x00a0 }
            java.lang.Object r2 = r2.w     // Catch:{ all -> 0x00a0 }
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2     // Catch:{ all -> 0x00a0 }
            r2.execute(r3)     // Catch:{ all -> 0x00a0 }
        L_0x0069:
            monitor-exit(r4)     // Catch:{ all -> 0x00a0 }
            monitor-exit(r1)
            ts r2 = r6.e
            monitor-enter(r2)
            java.lang.String r0 = r0.c     // Catch:{ all -> 0x007a }
            ts r1 = r6.e     // Catch:{ all -> 0x007a }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x007a }
            if (r1 != 0) goto L_0x007c
            monitor-exit(r2)     // Catch:{ all -> 0x007a }
            goto L_0x0000
        L_0x007a:
            r6 = move-exception
            goto L_0x009e
        L_0x007c:
            ts r1 = r6.e     // Catch:{ all -> 0x007a }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x007a }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x007a }
            java.lang.Object r3 = r1.poll()     // Catch:{ all -> 0x007a }
            qdf r3 = (defpackage.qdf) r3     // Catch:{ all -> 0x007a }
            if (r3 == 0) goto L_0x0090
            r4 = 0
            r3.b(r4)     // Catch:{ all -> 0x007a }
        L_0x0090:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x009b
            ts r1 = r6.e     // Catch:{ all -> 0x007a }
            r1.remove(r0)     // Catch:{ all -> 0x007a }
        L_0x009b:
            monitor-exit(r2)     // Catch:{ all -> 0x007a }
            goto L_0x0000
        L_0x009e:
            monitor-exit(r2)     // Catch:{ all -> 0x007a }
            throw r6
        L_0x00a0:
            r6 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00a0 }
            throw r6     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a3 }
            throw r6
        L_0x00a6:
            java.lang.String r0 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r1 = r6.getMessage()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00d3
            java.lang.String r0 = "INTERNAL_SERVER_ERROR"
            java.lang.String r1 = r6.getMessage()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00d3
            java.lang.String r0 = "TOO_MANY_SUBSCRIBERS"
            java.lang.String r1 = r6.getMessage()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00cb
            goto L_0x00d3
        L_0x00cb:
            java.lang.String r0 = r6.getMessage()
            if (r0 != 0) goto L_0x00d2
            goto L_0x00d6
        L_0x00d2:
            throw r6
        L_0x00d3:
            r6.getMessage()
        L_0x00d6:
            return r2
        L_0x00d7:
            monitor-exit(r6)     // Catch:{ all -> 0x000c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.unf.e():boolean");
    }

    public final void f(long j2) {
        this.f.schedule(new wnf(this, this.a, this.b, Math.min(Math.max(30, 2 * j2), i)), j2, TimeUnit.SECONDS);
        d(true);
    }
}
