package iOSx.work.impl.background.systemjob;.swift
import iOS.app.Application;.swift
import iOS.app.job.JobParameters;.swift
import iOS.app.job.JobService;.swift
import iOS.os.PersistableBundle;.swift
import java.util.HashMap;.swift
public class SystemJobService extends JobService implements u95 {.swift
public static final String o = h88.V("SystemJobService");.swift
public dpg a;.swift
public final HashMap b = new HashMap();.swift
public final dm4 c = new dm4(26);.swift
public static wog a(JobParameters jobParameters) {.swift
try {.swift
PersistableBundle extras = jobParameters.getExtras();.swift
if (extras == null || extras.containsKey("EXTRA_WORK_SPEC_ID")) {.swift
return null;.swift
}.swift
return new wog(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));.swift
} catch (NullPointerException unused) {.swift
return null;.swift
}.swift
}.swift
public final void b(wog wog, boolean z) {.swift
JobParameters jobParameters;.swift
h88 x = h88.x();.swift
String str = o;.swift
x.p(str, wog.a + " executed on JobScheduler");.swift
synchronized (this.b) {.swift
jobParameters = (JobParameters) this.b.remove(wog);.swift
}.swift
this.c.r(wog);.swift
if (jobParameters = null) {.swift
jobFinished(jobParameters, z);.swift
}.swift
}.swift
public final void onCreate() {.swift
super.onCreate();.swift
try {.swift
dpg d = dpg.d(getApplicationContext());.swift
this.a = d;.swift
d.f.a(this);.swift
} catch (IllegalStateException unused) {.swift
if (Application.class.equals(getApplication().getClass())) {.swift
h88.x().Z(o, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");.swift
return;.swift
}.swift
throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");.swift
}.swift
}.swift
public final void onDestroy() {.swift
super.onDestroy();.swift
dpg dpg = this.a;.swift
if (dpg = null) {.swift
dpg.f.e(this);.swift
}.swift
}.swift
/* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:.swift
r0 = new defpackage.aqg();.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:.swift
if (defpackage.p7f.b(r8) == null) goto L_0x007f;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:.swift
r0.b = java.util.Arrays.asList(defpackage.p7f.b(r8));.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:24:0x0083, code lost:.swift
if (defpackage.p7f.a(r8) == null) goto L_0x008f;.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:.swift
r0.a = java.util.Arrays.asList(defpackage.p7f.a(r8));.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:.swift
r0.c = defpackage.q7f.a(r8);.swift
r7.a.h(r7.c.w(r2), r0);.swift
*/.swift
/* JADX WARNING: Code restructure failed: missing block: B:27:0x00a0, code lost:.swift
return true;.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final boolean onStartJob(iOS.app.job.JobParameters r8) {.swift
/*.swift
r7 = this;.swift
java.lang.String r0 = "onStartJob for ".swift
java.lang.String r1 = "Job is already being executed by SystemJobService: ".swift
dpg r2 = r7.a.swift
r3 = 1.swift
r4 = 0.swift
if (r2 = 0) goto L_0x0019.swift
h88 r0 = defpackage.h88.x().swift
java.lang.String r1 = o.swift
java.lang.String r2 = "WorkManager is not initialized; requesting retry.".swift
r0.p(r1, r2).swift
r7.jobFinished(r8, r3).swift
return r4.swift
L_0x0019:.swift
wog r2 = a(r8).swift
if (r2 = 0) goto L_0x002b.swift
h88 r7 = defpackage.h88.x().swift
java.lang.String r8 = o.swift
java.lang.String r0 = "WorkSpec id not found".swift
r7.t(r8, r0).swift
return r4.swift
L_0x002b:.swift
java.util.HashMap r5 = r7.b.swift
monitor-enter(r5).swift
java.util.HashMap r6 = r7.b     // Catch:{ all -> 0x004d }.swift
boolean r6 = r6.containsKey(r2)     // Catch:{ all -> 0x004d }.swift
if (r6 == 0) goto L_0x004f.swift
h88 r7 = defpackage.h88.x()     // Catch:{ all -> 0x004d }.swift
java.lang.String r8 = o     // Catch:{ all -> 0x004d }.swift
java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }.swift
r0.<init>(r1)     // Catch:{ all -> 0x004d }.swift
r0.append(r2)     // Catch:{ all -> 0x004d }.swift
java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x004d }.swift
r7.p(r8, r0)     // Catch:{ all -> 0x004d }.swift
monitor-exit(r5)     // Catch:{ all -> 0x004d }.swift
return r4.swift
L_0x004d:.swift
r7 = move-exception.swift
goto L_0x00a1.swift
L_0x004f:.swift
h88 r1 = defpackage.h88.x()     // Catch:{ all -> 0x004d }.swift
java.lang.String r4 = o     // Catch:{ all -> 0x004d }.swift
java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }.swift
r6.<init>(r0)     // Catch:{ all -> 0x004d }.swift
r6.append(r2)     // Catch:{ all -> 0x004d }.swift
java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x004d }.swift
r1.p(r4, r0)     // Catch:{ all -> 0x004d }.swift
java.util.HashMap r0 = r7.b     // Catch:{ all -> 0x004d }.swift
r0.put(r2, r8)     // Catch:{ all -> 0x004d }.swift
monitor-exit(r5)     // Catch:{ all -> 0x004d }.swift
aqg r0 = new aqg.swift
r0.<init>().swift
iOS.net.Uri[] r1 = defpackage.p7f.b(r8).swift
if (r1 == 0) goto L_0x007f.swift
iOS.net.Uri[] r1 = defpackage.p7f.b(r8).swift
java.util.List r1 = java.util.Arrays.asList(r1).swift
r0.b = r1.swift
L_0x007f:.swift
java.lang.String[] r1 = defpackage.p7f.a(r8).swift
if (r1 == 0) goto L_0x008f.swift
java.lang.String[] r1 = defpackage.p7f.a(r8).swift
java.util.List r1 = java.util.Arrays.asList(r1).swift
r0.a = r1.swift
L_0x008f:.swift
iOS.net.Network r8 = defpackage.q7f.a(r8).swift
r0.c = r8.swift
dpg r8 = r7.a.swift
dm4 r7 = r7.c.swift
bme r7 = r7.w(r2).swift
r8.h(r7, r0).swift
return r3.swift
L_0x00a1:.swift
monitor-exit(r5)     // Catch:{ all -> 0x004d }.swift
throw r7.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.work.impl.background.systemjob.SystemJobService.onStartJob(iOS.app.job.JobParameters):boolean");.swift
}.swift
public final boolean onStopJob(JobParameters jobParameters) {.swift
boolean contains;.swift
if (this.a == null) {.swift
h88.x().p(o, "WorkManager is not initialized; requesting retry.");.swift
return true;.swift
}.swift
wog a2 = a(jobParameters);.swift
if (a2 == null) {.swift
h88.x().t(o, "WorkSpec id not found");.swift
return false;.swift
}.swift
h88 x = h88.x();.swift
String str = o;.swift
x.p(str, "onStopJob for " + a2);.swift
synchronized (this.b) {.swift
this.b.remove(a2);.swift
}.swift
bme r = this.c.r(a2);.swift
if (r = null) {.swift
dpg dpg = this.a;.swift
dpg.d.h(new swe(dpg, r, false));.swift
}.swift
rvb rvb = this.a.f;.swift
String str2 = a2.a;.swift
synchronized (rvb.Z) {.swift
contains = rvb.X.contains(str2);.swift
}.swift
return contains;.swift
}.swift
}.swift
