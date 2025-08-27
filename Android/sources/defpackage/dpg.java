package defpackage;

import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: dpg  reason: default package */
public final class dpg extends apg {
    public static dpg k = null;
    public static dpg l = null;
    public static final Object m = new Object();
    public final Context a;
    public final ve3 b;
    public final WorkDatabase c;
    public final wdf d;
    public final List e;
    public final rvb f;
    public final b8d g;
    public boolean h;
    public BroadcastReceiver.PendingResult i;
    public final m7f j;

    static {
        h88.V("WorkManagerImpl");
    }

    /* JADX WARNING: type inference failed for: r5v17, types: [java.lang.Object, m7f] */
    public dpg(Context context, ve3 ve3, g6d g6d) {
        h6d h6d;
        boolean z = context.getResources().getBoolean(jdc.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        qn qnVar = (qn) g6d.b;
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z) {
            h6d = new h6d(applicationContext, (String) null, cls);
            h6d.j = true;
        } else {
            h6d = b0h.o(applicationContext, "androidx.work.workdb", cls);
            h6d.i = new bq(applicationContext);
        }
        h6d.g = qnVar;
        h6d.d.add(o13.b);
        h6d.a(qq9.g);
        h6d.a(new p3d(2, 3, applicationContext));
        h6d.a(qq9.h);
        h6d.a(qq9.i);
        h6d.a(new p3d(5, 6, applicationContext));
        h6d.a(qq9.j);
        h6d.a(qq9.k);
        h6d.a(qq9.l);
        h6d.a(new p3d(applicationContext));
        h6d.a(new p3d(10, 11, applicationContext));
        h6d.a(qq9.d);
        h6d.a(qq9.e);
        h6d.a(qq9.f);
        h6d.l = false;
        h6d.m = true;
        WorkDatabase workDatabase = (WorkDatabase) h6d.b();
        Context applicationContext2 = context.getApplicationContext();
        int i2 = ve3.f;
        h88 h88 = new h88(0, (byte) 0);
        synchronized (h88.c) {
            h88.d = h88;
        }
        jm0 jm0 = new jm0(applicationContext2.getApplicationContext(), g6d, 0);
        jm0 jm02 = new jm0(applicationContext2.getApplicationContext(), g6d, 1);
        Context applicationContext3 = applicationContext2.getApplicationContext();
        String str = z6a.a;
        y6a y6a = new y6a(applicationContext3, g6d);
        jm0 jm03 = new jm0(applicationContext2.getApplicationContext(), g6d, 2);
        ? obj = new Object();
        obj.a = jm0;
        obj.b = jm02;
        obj.c = y6a;
        obj.o = jm03;
        this.j = obj;
        String str2 = yfd.a;
        mfd o7f = new o7f(applicationContext2, this);
        a7b.a(applicationContext2, SystemJobService.class, true);
        h88.x().p(yfd.a, "Created SystemJobScheduler and enabled SystemJobService");
        List asList = Arrays.asList(new mfd[]{o7f, new iu6(applicationContext2, ve3, obj, this)});
        rvb rvb = new rvb(context, ve3, g6d, workDatabase, asList);
        Context applicationContext4 = context.getApplicationContext();
        this.a = applicationContext4;
        this.b = ve3;
        this.d = g6d;
        this.c = workDatabase;
        this.e = asList;
        this.f = rvb;
        this.g = new b8d((Object) workDatabase);
        this.h = false;
        if (!cpg.a(applicationContext4)) {
            this.d.h(new l96(applicationContext4, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static defpackage.dpg d(android.content.Context r2) {
        /*
            java.lang.Object r0 = m
            monitor-enter(r0)
            monitor-enter(r0)     // Catch:{ all -> 0x0028 }
            dpg r1 = k     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            goto L_0x000f
        L_0x000a:
            r2 = move-exception
            goto L_0x0034
        L_0x000c:
            dpg r1 = l     // Catch:{ all -> 0x000a }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
        L_0x000f:
            if (r1 != 0) goto L_0x0032
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0028 }
            boolean r1 = r2 instanceof defpackage.te3     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x002a
            r1 = r2
            te3 r1 = (defpackage.te3) r1     // Catch:{ all -> 0x0028 }
            ve3 r1 = r1.c()     // Catch:{ all -> 0x0028 }
            e(r2, r1)     // Catch:{ all -> 0x0028 }
            dpg r1 = d(r2)     // Catch:{ all -> 0x0028 }
            goto L_0x0032
        L_0x0028:
            r2 = move-exception
            goto L_0x0036
        L_0x002a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."
            r2.<init>(r1)     // Catch:{ all -> 0x0028 }
            throw r2     // Catch:{ all -> 0x0028 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return r1
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r2     // Catch:{ all -> 0x0028 }
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpg.d(android.content.Context):dpg");
    }

    public static void e(Context context, ve3 ve3) {
        synchronized (m) {
            try {
                dpg dpg = k;
                if (dpg != null) {
                    if (l != null) {
                        throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                    }
                }
                if (dpg == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (l == null) {
                        l = new dpg(applicationContext, ve3, new g6d(ve3.b));
                    }
                    k = l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final u4b b(String str, int i2, icb icb) {
        if (i2 == 3) {
            ata ata = new ata(19);
            ((qn) ((g6d) this.d).b).execute(new po1(this, str, ata, new lqg(icb, this, str, ata), (WorkRequest) icb));
            return ata;
        }
        return new rog(this, str, i2 == 2 ? fb5.b : fb5.a, Collections.singletonList(icb)).v();
    }

    public final PendingIntent c(UUID uuid) {
        Context context = this.a;
        String uuid2 = uuid.toString();
        String str = e7f.X;
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_CANCEL_WORK");
        intent.setData(Uri.parse("workspec://" + uuid2));
        intent.putExtra("KEY_WORKSPEC_ID", uuid2);
        return PendingIntent.getService(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
    }

    public final void f() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void g() {
        ArrayList b2;
        WorkDatabase workDatabase = this.c;
        Context context = this.a;
        String str = o7f.v;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (!(jobScheduler == null || (b2 = o7f.b(context, jobScheduler)) == null || b2.isEmpty())) {
            Iterator it = b2.iterator();
            while (it.hasNext()) {
                o7f.a(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        ypg y = workDatabase.y();
        i6d i6d = (i6d) y.a;
        i6d.b();
        ppg ppg = (ppg) y.l;
        gf6 E = ppg.E();
        i6d.c();
        try {
            E.n();
            i6d.r();
            i6d.l();
            ppg.S(E);
            yfd.a(this.b, workDatabase, this.e);
        } catch (Throwable th) {
            i6d.l();
            ppg.S(E);
            throw th;
        }
    }

    public final void h(bme bme, aqg aqg) {
        wdf wdf = this.d;
        ij3 ij3 = new ij3(7);
        ij3.b = this;
        ij3.c = bme;
        ij3.o = aqg;
        wdf.h(ij3);
    }
}
