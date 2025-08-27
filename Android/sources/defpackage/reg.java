package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: reg  reason: default package */
public final class reg {
    public static final long n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService o = null;
    public static final Object p = new Object();
    public final Object a = new Object();
    public final PowerManager.WakeLock b;
    public int c = 0;
    public ScheduledFuture d;
    public long e;
    public final HashSet f = new HashSet();
    public boolean g = true;
    public pyg h;
    public final mz4 i = mz4.b;
    public final String j;
    public final HashMap k = new HashMap();
    public final AtomicInteger l = new AtomicInteger(0);
    public final ScheduledExecutorService m;

    public reg(Context context) {
        boolean z;
        String packageName = context.getPackageName();
        vzg.j("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        } else {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            Method method = upg.a;
            synchronized (upg.class) {
                Boolean bool = upg.e;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = q8.d(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                    upg.e = Boolean.valueOf(z);
                }
            }
            if (z) {
                int i2 = eye.a;
                packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
                if (!(context.getPackageManager() == null || packageName == null)) {
                    try {
                        ApplicationInfo applicationInfo = rqg.a(context).a.getPackageManager().getApplicationInfo(packageName, 0);
                        if (applicationInfo == null) {
                            "Could not get applicationInfo from package: ".concat(packageName);
                        } else {
                            int i3 = applicationInfo.uid;
                            workSource = new WorkSource();
                            upg.a(workSource, i3, packageName);
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        "Could not find package: ".concat(packageName);
                    }
                }
                if (workSource != null) {
                    try {
                        this.b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e2) {
                        Log.wtf("WakeLock", e2.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = o;
            if (scheduledExecutorService == null) {
                synchronized (p) {
                    try {
                        scheduledExecutorService = o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            o = scheduledExecutorService;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.m = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("expected a non-null reference", 0, 29);
        throw new RuntimeException(sb.toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: jzg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: jzg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: jzg} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r9) {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r8.l
            r0.incrementAndGet()
            long r0 = n
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r0 = java.lang.Math.min(r2, r0)
            r4 = 1
            long r0 = java.lang.Math.max(r0, r4)
            r4 = 0
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0020
            long r0 = java.lang.Math.min(r9, r0)
        L_0x0020:
            java.lang.Object r9 = r8.a
            monitor-enter(r9)
            boolean r10 = r8.b()     // Catch:{ all -> 0x003b }
            if (r10 != 0) goto L_0x003d
            pyg r10 = defpackage.pyg.a     // Catch:{ all -> 0x003b }
            r8.h = r10     // Catch:{ all -> 0x003b }
            android.os.PowerManager$WakeLock r10 = r8.b     // Catch:{ all -> 0x003b }
            r10.acquire()     // Catch:{ all -> 0x003b }
            mz4 r10 = r8.i     // Catch:{ all -> 0x003b }
            r10.getClass()     // Catch:{ all -> 0x003b }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x003b }
            goto L_0x003d
        L_0x003b:
            r8 = move-exception
            goto L_0x0099
        L_0x003d:
            int r10 = r8.c     // Catch:{ all -> 0x003b }
            int r10 = r10 + 1
            r8.c = r10     // Catch:{ all -> 0x003b }
            boolean r10 = r8.g     // Catch:{ all -> 0x003b }
            r4 = 0
            if (r10 == 0) goto L_0x004b
            android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x003b }
        L_0x004b:
            java.util.HashMap r10 = r8.k     // Catch:{ all -> 0x003b }
            java.lang.Object r10 = r10.get(r4)     // Catch:{ all -> 0x003b }
            jzg r10 = (defpackage.jzg) r10     // Catch:{ all -> 0x003b }
            if (r10 != 0) goto L_0x005f
            jzg r10 = new jzg     // Catch:{ all -> 0x003b }
            r10.<init>()     // Catch:{ all -> 0x003b }
            java.util.HashMap r5 = r8.k     // Catch:{ all -> 0x003b }
            r5.put(r4, r10)     // Catch:{ all -> 0x003b }
        L_0x005f:
            int r4 = r10.a     // Catch:{ all -> 0x003b }
            int r4 = r4 + 1
            r10.a = r4     // Catch:{ all -> 0x003b }
            mz4 r10 = r8.i     // Catch:{ all -> 0x003b }
            r10.getClass()     // Catch:{ all -> 0x003b }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x003b }
            long r6 = r2 - r4
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x0076
            long r2 = r4 + r0
        L_0x0076:
            long r4 = r8.e     // Catch:{ all -> 0x003b }
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x0097
            r8.e = r2     // Catch:{ all -> 0x003b }
            java.util.concurrent.ScheduledFuture r10 = r8.d     // Catch:{ all -> 0x003b }
            if (r10 == 0) goto L_0x0086
            r2 = 0
            r10.cancel(r2)     // Catch:{ all -> 0x003b }
        L_0x0086:
            java.util.concurrent.ScheduledExecutorService r10 = r8.m     // Catch:{ all -> 0x003b }
            haf r2 = new haf     // Catch:{ all -> 0x003b }
            r3 = 18
            r2.<init>((int) r3, (java.lang.Object) r8)     // Catch:{ all -> 0x003b }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x003b }
            java.util.concurrent.ScheduledFuture r10 = r10.schedule(r2, r0, r3)     // Catch:{ all -> 0x003b }
            r8.d = r10     // Catch:{ all -> 0x003b }
        L_0x0097:
            monitor-exit(r9)     // Catch:{ all -> 0x003b }
            return
        L_0x0099:
            monitor-exit(r9)     // Catch:{ all -> 0x003b }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.reg.a(long):void");
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.c > 0;
        }
        return z;
    }

    public final void c() {
        if (this.l.decrementAndGet() < 0) {
            String.valueOf(this.j).concat(" release without a matched acquire!");
        }
        synchronized (this.a) {
            try {
                if (this.g) {
                    TextUtils.isEmpty((CharSequence) null);
                }
                if (this.k.containsKey((Object) null)) {
                    jzg jzg = (jzg) this.k.get((Object) null);
                    if (jzg != null) {
                        int i2 = jzg.a - 1;
                        jzg.a = i2;
                        if (i2 == 0) {
                            this.k.remove((Object) null);
                        }
                    }
                } else {
                    String.valueOf(this.j).concat(" counter does not exist");
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f;
        if (!hashSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(hashSet);
            hashSet.clear();
            if (arrayList.size() > 0) {
                rae.w(arrayList.get(0));
                throw null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0098, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.a
            monitor-enter(r0)
            boolean r1 = r5.b()     // Catch:{ all -> 0x000b }
            if (r1 != 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            return
        L_0x000b:
            r5 = move-exception
            goto L_0x0099
        L_0x000e:
            boolean r1 = r5.g     // Catch:{ all -> 0x000b }
            r2 = 0
            if (r1 == 0) goto L_0x001e
            int r1 = r5.c     // Catch:{ all -> 0x000b }
            int r1 = r1 + -1
            r5.c = r1     // Catch:{ all -> 0x000b }
            if (r1 > 0) goto L_0x001c
            goto L_0x0020
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            return
        L_0x001e:
            r5.c = r2     // Catch:{ all -> 0x000b }
        L_0x0020:
            r5.d()     // Catch:{ all -> 0x000b }
            java.util.HashMap r1 = r5.k     // Catch:{ all -> 0x000b }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x000b }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x000b }
        L_0x002d:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x000b }
            if (r3 == 0) goto L_0x003c
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x000b }
            jzg r3 = (defpackage.jzg) r3     // Catch:{ all -> 0x000b }
            r3.a = r2     // Catch:{ all -> 0x000b }
            goto L_0x002d
        L_0x003c:
            java.util.HashMap r1 = r5.k     // Catch:{ all -> 0x000b }
            r1.clear()     // Catch:{ all -> 0x000b }
            java.util.concurrent.ScheduledFuture r1 = r5.d     // Catch:{ all -> 0x000b }
            r3 = 0
            if (r1 == 0) goto L_0x004f
            r1.cancel(r2)     // Catch:{ all -> 0x000b }
            r5.d = r3     // Catch:{ all -> 0x000b }
            r1 = 0
            r5.e = r1     // Catch:{ all -> 0x000b }
        L_0x004f:
            android.os.PowerManager$WakeLock r1 = r5.b     // Catch:{ all -> 0x000b }
            boolean r1 = r1.isHeld()     // Catch:{ all -> 0x000b }
            if (r1 == 0) goto L_0x008c
            android.os.PowerManager$WakeLock r1 = r5.b     // Catch:{ RuntimeException -> 0x0065 }
            r1.release()     // Catch:{ RuntimeException -> 0x0065 }
            pyg r1 = r5.h     // Catch:{ all -> 0x000b }
            if (r1 == 0) goto L_0x0097
            r5.h = r3     // Catch:{ all -> 0x000b }
            goto L_0x0097
        L_0x0063:
            r1 = move-exception
            goto L_0x0085
        L_0x0065:
            r1 = move-exception
            java.lang.Class r2 = r1.getClass()     // Catch:{ all -> 0x0063 }
            java.lang.Class<java.lang.RuntimeException> r4 = java.lang.RuntimeException.class
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0063 }
            if (r2 == 0) goto L_0x0084
            java.lang.String r1 = r5.j     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = " failed to release!"
            r1.concat(r2)     // Catch:{ all -> 0x0063 }
            pyg r1 = r5.h     // Catch:{ all -> 0x000b }
            if (r1 == 0) goto L_0x0097
            r5.h = r3     // Catch:{ all -> 0x000b }
            goto L_0x0097
        L_0x0084:
            throw r1     // Catch:{ all -> 0x0063 }
        L_0x0085:
            pyg r2 = r5.h     // Catch:{ all -> 0x000b }
            if (r2 == 0) goto L_0x008b
            r5.h = r3     // Catch:{ all -> 0x000b }
        L_0x008b:
            throw r1     // Catch:{ all -> 0x000b }
        L_0x008c:
            java.lang.String r5 = r5.j     // Catch:{ all -> 0x000b }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x000b }
            java.lang.String r1 = " should be held!"
            r5.concat(r1)     // Catch:{ all -> 0x000b }
        L_0x0097:
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            return
        L_0x0099:
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.reg.e():void");
    }
}
