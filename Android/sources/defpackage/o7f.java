package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: o7f  reason: default package */
public final class o7f implements mfd {
    public static final String v = h88.V("SystemJobScheduler");
    public final Context a;
    public final JobScheduler b;
    public final dpg c;
    public final n7f o;

    public o7f(Context context, dpg dpg) {
        n7f n7f = new n7f(context);
        this.a = context;
        this.c = dpg;
        this.b = (JobScheduler) context.getSystemService("jobscheduler");
        this.o = n7f;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            h88.x().u(v, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }

    public static ArrayList b(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            h88.x().u(v, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static wog f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new wog(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public final boolean c() {
        return true;
    }

    public final void d(String str) {
        ArrayList arrayList;
        Context context = this.a;
        JobScheduler jobScheduler = this.b;
        ArrayList b2 = b(context, jobScheduler);
        if (b2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = b2.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                wog f = f(jobInfo);
                if (f != null && str.equals(f.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a(jobScheduler, ((Integer) it2.next()).intValue());
            }
            m7f v2 = this.c.c.v();
            i6d i6d = (i6d) v2.a;
            i6d.b();
            t5d t5d = (t5d) v2.o;
            gf6 E = t5d.E();
            if (str == null) {
                E.X(1);
            } else {
                E.h(1, str);
            }
            i6d.c();
            try {
                E.n();
                i6d.r();
            } finally {
                i6d.l();
                t5d.S(E);
            }
        }
    }

    public final void e(xpg... xpgArr) {
        int i;
        dpg dpg = this.c;
        WorkDatabase workDatabase = dpg.c;
        rt6 rt6 = new rt6(22, (Object) workDatabase);
        int length = xpgArr.length;
        int i2 = 0;
        while (i2 < length) {
            xpg xpg = xpgArr[i2];
            workDatabase.c();
            try {
                xpg m = workDatabase.y().m(xpg.a);
                String str = v;
                String str2 = xpg.a;
                if (m == null) {
                    h88 x = h88.x();
                    x.Z(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.r();
                } else if (m.b != xog.a) {
                    h88 x2 = h88.x();
                    x2.Z(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.r();
                } else {
                    int i3 = xpg.t;
                    l7f m2 = workDatabase.v().m(new wog(str2, i3));
                    if (m2 != null) {
                        i = m2.c;
                    } else {
                        dpg.b.getClass();
                        i = ((Number) ((WorkDatabase) rt6.b).p(new w77(rt6, dpg.b.g))).intValue();
                    }
                    if (m2 == null) {
                        dpg.c.v().o(new l7f(str2, i3, i));
                    }
                    g(xpg, i);
                    workDatabase.r();
                }
                i2++;
            } finally {
                workDatabase.l();
            }
        }
    }

    public final void g(xpg xpg, int i) {
        int i2;
        JobScheduler jobScheduler = this.b;
        n7f n7f = this.o;
        n7f.getClass();
        wj3 wj3 = xpg.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = xpg.a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", xpg.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", xpg.d());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, n7f.a).setRequiresCharging(wj3.b);
        boolean z = wj3.c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z).setExtras(persistableBundle);
        int i3 = Build.VERSION.SDK_INT;
        boolean z2 = true;
        int i4 = 0;
        int i5 = wj3.a;
        if (i3 < 30 || i5 != 6) {
            int y = tr1.y(i5);
            if (y != 0) {
                if (y != 1) {
                    i2 = 2;
                    if (y != 2) {
                        i2 = 3;
                        if (y != 3) {
                            i2 = 4;
                            if (y != 4) {
                                h88.x().p(n7f.b, "API version too low. Cannot convert network type value ".concat(i2a.p(i5)));
                            }
                        }
                    }
                }
                i2 = 1;
            } else {
                i2 = 0;
            }
            extras.setRequiredNetworkType(i2);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z) {
            extras.setBackoffCriteria(xpg.m, xpg.l == ag0.b ? 0 : 1);
        }
        long max = Math.max(xpg.a() - System.currentTimeMillis(), 0);
        int i6 = (max > 0 ? 1 : (max == 0 ? 0 : -1));
        if (i6 > 0) {
            extras.setMinimumLatency(max);
        } else if (!xpg.q) {
            extras.setImportantWhileForeground(true);
        }
        Set<vj3> set = wj3.h;
        if (!set.isEmpty()) {
            for (vj3 vj3 : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(vj3.a, vj3.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(wj3.f);
            extras.setTriggerContentMaxDelay(wj3.g);
        }
        extras.setPersisted(false);
        int i7 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(wj3.d);
        extras.setRequiresStorageNotLow(wj3.e);
        boolean z3 = xpg.k > 0;
        if (i6 <= 0) {
            z2 = false;
        }
        if (i7 >= 31 && xpg.q && !z3 && !z2) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        String str2 = v;
        h88.x().p(str2, "Scheduling work ID " + str + "Job ID " + i);
        try {
            if (jobScheduler.schedule(build) == 0) {
                h88.x().Z(str2, "Unable to schedule work ID " + str);
                if (xpg.q && xpg.r == t5b.a) {
                    xpg.q = false;
                    h88.x().p(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                    g(xpg, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList b2 = b(this.a, jobScheduler);
            if (b2 != null) {
                i4 = b2.size();
            }
            Locale locale = Locale.getDefault();
            Integer valueOf = Integer.valueOf(i4);
            dpg dpg = this.c;
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{valueOf, Integer.valueOf(dpg.c.y().i().size()), Integer.valueOf(dpg.b.h)});
            h88.x().t(str2, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e);
            dpg.b.getClass();
            throw illegalStateException;
        } catch (Throwable th) {
            h88.x().u(str2, "Unable to schedule " + xpg, th);
        }
    }
}
