package defpackage;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l96  reason: default package */
public final class l96 implements Runnable {
    public static final String v = h88.V("ForceStopRunnable");
    public static final long w = TimeUnit.DAYS.toMillis(3650);
    public final Context a;
    public final dpg b;
    public final b8d c;
    public int o = 0;

    public l96(Context context, dpg dpg) {
        this.a = context.getApplicationContext();
        this.b = dpg;
        this.c = dpg.g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + w;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    public final void a() {
        boolean z;
        i6d i6d;
        ppg ppg;
        gf6 E;
        b8d b8d = this.c;
        String str = o7f.v;
        Context context = this.a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList b2 = o7f.b(context, jobScheduler);
        dpg dpg = this.b;
        m7f v2 = dpg.c.v();
        v2.getClass();
        d7d a2 = d7d.a(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        i6d i6d2 = (i6d) v2.a;
        i6d2.b();
        Cursor o2 = i6d2.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o2.getCount());
            while (o2.moveToNext()) {
                arrayList.add(o2.isNull(0) ? null : o2.getString(0));
            }
            HashSet hashSet = new HashSet(b2 != null ? b2.size() : 0);
            if (b2 != null && !b2.isEmpty()) {
                Iterator it = b2.iterator();
                while (it.hasNext()) {
                    JobInfo jobInfo = (JobInfo) it.next();
                    wog f = o7f.f(jobInfo);
                    if (f != null) {
                        hashSet.add(f.a);
                    } else {
                        o7f.a(jobScheduler, jobInfo.getId());
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!hashSet.contains((String) it2.next())) {
                        h88.x().p(o7f.v, "Reconciling jobs");
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                WorkDatabase workDatabase = dpg.c;
                workDatabase.c();
                try {
                    ypg y = workDatabase.y();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        y.o(-1, (String) it3.next());
                    }
                    workDatabase.r();
                    workDatabase.l();
                } catch (Throwable th) {
                    workDatabase.l();
                    throw th;
                }
            }
            WorkDatabase workDatabase2 = dpg.c;
            ypg y2 = workDatabase2.y();
            qpg x = workDatabase2.x();
            workDatabase2.c();
            try {
                ArrayList h = y2.h();
                boolean z2 = !h.isEmpty();
                if (z2) {
                    Iterator it4 = h.iterator();
                    while (it4.hasNext()) {
                        xpg xpg = (xpg) it4.next();
                        y2.r(xog.a, xpg.a);
                        y2.o(-1, xpg.a);
                    }
                }
                i6d = (i6d) x.a;
                i6d.b();
                ppg = (ppg) x.o;
                E = ppg.E();
                i6d.c();
                E.n();
                i6d.r();
                i6d.l();
                ppg.S(E);
                workDatabase2.r();
                workDatabase2.l();
                boolean z3 = z2 || z;
                Long Z = ((WorkDatabase) dpg.g.a).u().Z("reschedule_needed");
                long j = 0;
                String str2 = v;
                if (Z == null || Z.longValue() != 1) {
                    try {
                        int i = Build.VERSION.SDK_INT;
                        int i2 = i >= 31 ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, ForceStopRunnable$BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i2);
                        if (i >= 30) {
                            if (broadcast != null) {
                                broadcast.cancel();
                            }
                            List t = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
                            if (t != null && !t.isEmpty()) {
                                Long Z2 = ((WorkDatabase) b8d.a).u().Z("last_force_stop_ms");
                                if (Z2 != null) {
                                    j = Z2.longValue();
                                }
                                int i3 = 0;
                                while (i3 < t.size()) {
                                    ApplicationExitInfo e = x3.e(t.get(i3));
                                    if (e.getReason() != 10 || e.getTimestamp() < j) {
                                        i3++;
                                    } else {
                                        h88.x().p(str2, "Application was force-stopped, rescheduling.");
                                        dpg.g();
                                        long currentTimeMillis = System.currentTimeMillis();
                                        b8d.getClass();
                                        ((WorkDatabase) b8d.a).u().b0(new vsb("last_force_stop_ms", Long.valueOf(currentTimeMillis)));
                                        return;
                                    }
                                }
                            }
                        } else if (broadcast == null) {
                            c(context);
                            h88.x().p(str2, "Application was force-stopped, rescheduling.");
                            dpg.g();
                            long currentTimeMillis2 = System.currentTimeMillis();
                            b8d.getClass();
                            ((WorkDatabase) b8d.a).u().b0(new vsb("last_force_stop_ms", Long.valueOf(currentTimeMillis2)));
                            return;
                        }
                        if (z3) {
                            h88.x().p(str2, "Found unfinished work, scheduling it.");
                            yfd.a(dpg.b, dpg.c, dpg.e);
                        }
                    } catch (IllegalArgumentException | SecurityException e2) {
                        h88.x().a0(str2, "Ignoring exception", e2);
                    }
                } else {
                    h88.x().p(str2, "Rescheduling Workers.");
                    dpg.g();
                    b8d b8d2 = dpg.g;
                    b8d2.getClass();
                    ((WorkDatabase) b8d2.a).u().b0(new vsb("reschedule_needed", 0L));
                }
            } catch (Throwable th2) {
                workDatabase2.l();
                throw th2;
            }
        } finally {
            o2.close();
            a2.o();
        }
    }

    public final boolean b() {
        this.b.b.getClass();
        boolean isEmpty = TextUtils.isEmpty((CharSequence) null);
        String str = v;
        if (isEmpty) {
            h88.x().p(str, "The default process name was not specified.");
            return true;
        }
        int i = lvb.a;
        boolean areEqual = Intrinsics.areEqual((Object) tl.a.a(), (Object) this.a.getApplicationInfo().processName);
        h88 x = h88.x();
        x.p(str, "Is default app process = " + areEqual);
        return areEqual;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:6|7|8|9|10|11|33|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000e */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x000e A[LOOP:0: B:6:0x000e->B:32:0x000e, LOOP_START, SYNTHETIC, Splitter:B:6:0x000e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            java.lang.String r0 = v
            dpg r1 = r10.b
            boolean r2 = r10.b()     // Catch:{ all -> 0x0023 }
            if (r2 != 0) goto L_0x000e
            r1.f()
            return
        L_0x000e:
            android.content.Context r2 = r10.a     // Catch:{ SQLiteException -> 0x0067 }
            defpackage.ld9.L(r2)     // Catch:{ SQLiteException -> 0x0067 }
            h88 r2 = defpackage.h88.x()     // Catch:{ all -> 0x0023 }
            java.lang.String r3 = "Performing cleanup operations."
            r2.p(r0, r3)     // Catch:{ all -> 0x0023 }
            r10.a()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x0025 }
            r1.f()
            return
        L_0x0023:
            r10 = move-exception
            goto L_0x007c
        L_0x0025:
            r2 = move-exception
            int r3 = r10.o     // Catch:{ all -> 0x0023 }
            int r3 = r3 + 1
            r10.o = r3     // Catch:{ all -> 0x0023 }
            r4 = 3
            if (r3 >= r4) goto L_0x0053
            long r3 = (long) r3     // Catch:{ all -> 0x0023 }
            r5 = 300(0x12c, double:1.48E-321)
            long r3 = r3 * r5
            h88 r7 = defpackage.h88.x()     // Catch:{ all -> 0x0023 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0023 }
            r8.<init>()     // Catch:{ all -> 0x0023 }
            java.lang.String r9 = "Retrying after "
            r8.append(r9)     // Catch:{ all -> 0x0023 }
            r8.append(r3)     // Catch:{ all -> 0x0023 }
            java.lang.String r3 = r8.toString()     // Catch:{ all -> 0x0023 }
            r7.q(r0, r3, r2)     // Catch:{ all -> 0x0023 }
            int r2 = r10.o     // Catch:{ all -> 0x0023 }
            long r2 = (long) r2
            long r2 = r2 * r5
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x000e }
            goto L_0x000e
        L_0x0053:
            java.lang.String r10 = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store."
            h88 r3 = defpackage.h88.x()     // Catch:{ all -> 0x0023 }
            r3.u(r0, r10, r2)     // Catch:{ all -> 0x0023 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0023 }
            r0.<init>(r10, r2)     // Catch:{ all -> 0x0023 }
            ve3 r10 = r1.b     // Catch:{ all -> 0x0023 }
            r10.getClass()     // Catch:{ all -> 0x0023 }
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x0067:
            r10 = move-exception
            java.lang.String r2 = "Unexpected SQLite exception during migrations"
            h88 r3 = defpackage.h88.x()     // Catch:{ all -> 0x0023 }
            r3.t(r0, r2)     // Catch:{ all -> 0x0023 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0023 }
            r0.<init>(r2, r10)     // Catch:{ all -> 0x0023 }
            ve3 r10 = r1.b     // Catch:{ all -> 0x0023 }
            r10.getClass()     // Catch:{ all -> 0x0023 }
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x007c:
            r1.f()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l96.run():void");
    }
}
