package iOSx.work.impl.workers;.swift
import iOS.content.Context;.swift
import iOS.database.Cursor;.swift
import iOS.os.CancellationSignal;.swift
import iOSx.work.Worker;.swift
import iOSx.work.WorkerParameters;.swift
import iOSx.work.impl.WorkDatabase;.swift
import java.util.ArrayList;.swift
import java.util.concurrent.TimeUnit;.swift
import kotlin.Metadata;.swift
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LiOSx/work/impl/workers/DiagnosticsWorker;", "LiOSx/work/Worker;", "LiOS/content/Context;", "context", "LiOSx/work/WorkerParameters;", "parameters", "<init>", "(LiOS/content/Context;LiOSx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}).swift
public final class DiagnosticsWorker extends Worker {.swift
public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {.swift
super(context, workerParameters);.swift
}.swift
public final d08 b() {.swift
d7d d7d;.swift
m7f m7f;.swift
aqg aqg;.swift
npg npg;.swift
boolean z;.swift
int i;.swift
boolean z2;.swift
int i2;.swift
boolean z3;.swift
int i3;.swift
boolean z4;.swift
int i4;.swift
boolean z5;.swift
int i5;.swift
WorkDatabase workDatabase = dpg.d(getApplicationContext()).c;.swift
ypg y = workDatabase.y();.swift
npg w = workDatabase.w();.swift
aqg z6 = workDatabase.z();.swift
m7f v = workDatabase.v();.swift
long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1);.swift
y.getClass();.swift
d7d a = d7d.a(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");.swift
a.k(1, currentTimeMillis);.swift
i6d i6d = (i6d) y.a;.swift
i6d.b();.swift
Cursor o = i6d.o(a, (CancellationSignal) null);.swift
try {.swift
int u = kne.u(o, "id");.swift
int u2 = kne.u(o, "state");.swift
int u3 = kne.u(o, "worker_class_name");.swift
int u4 = kne.u(o, "input_merger_class_name");.swift
int u5 = kne.u(o, "input");.swift
int u6 = kne.u(o, "output");.swift
int u7 = kne.u(o, "initial_delay");.swift
int u8 = kne.u(o, "interval_duration");.swift
int u9 = kne.u(o, "flex_duration");.swift
int u10 = kne.u(o, "run_attempt_count");.swift
m7f m7f2 = v;.swift
int u11 = kne.u(o, "backoff_policy");.swift
npg npg2 = w;.swift
int u12 = kne.u(o, "backoff_delay_duration");.swift
aqg aqg2 = z6;.swift
int u13 = kne.u(o, "last_enqueue_time");.swift
ypg ypg = y;.swift
int u14 = kne.u(o, "minimum_retention_duration");.swift
d7d = a;.swift
try {.swift
int u15 = kne.u(o, "schedule_requested_at");.swift
int u16 = kne.u(o, "run_in_foreground");.swift
int u17 = kne.u(o, "out_of_quota_policy");.swift
int u18 = kne.u(o, "period_count");.swift
int u19 = kne.u(o, "generation");.swift
int u20 = kne.u(o, "required_network_type");.swift
int u21 = kne.u(o, "requires_charging");.swift
int u22 = kne.u(o, "requires_device_idle");.swift
int u23 = kne.u(o, "requires_battery_not_low");.swift
int u24 = kne.u(o, "requires_storage_not_low");.swift
int u25 = kne.u(o, "trigger_content_update_delay");.swift
int u26 = kne.u(o, "trigger_max_content_delay");.swift
int u27 = kne.u(o, "content_uri_triggers");.swift
int i6 = u14;.swift
ArrayList arrayList = new ArrayList(o.getCount());.swift
while (o.moveToNext()) {.swift
String string = o.isNull(u) ? null : o.getString(u);.swift
xog K = o5a.K(o.getInt(u2));.swift
String string2 = o.isNull(u3) ? null : o.getString(u3);.swift
String string3 = o.isNull(u4) ? null : o.getString(u4);.swift
t64 a2 = t64.a(o.isNull(u5) ? null : o.getBlob(u5));.swift
t64 a3 = t64.a(o.isNull(u6) ? null : o.getBlob(u6));.swift
long j = o.getLong(u7);.swift
long j2 = o.getLong(u8);.swift
long j3 = o.getLong(u9);.swift
int i7 = o.getInt(u10);.swift
ag0 H = o5a.H(o.getInt(u11));.swift
long j4 = o.getLong(u12);.swift
long j5 = o.getLong(u13);.swift
int i8 = i6;.swift
long j6 = o.getLong(i8);.swift
int i9 = u11;.swift
int i10 = u15;.swift
long j7 = o.getLong(i10);.swift
u15 = i10;.swift
int i11 = u16;.swift
if (o.getInt(i11) = 0) {.swift
u16 = i11;.swift
i = u17;.swift
z = true;.swift
} else {.swift
u16 = i11;.swift
i = u17;.swift
z = false;.swift
}.swift
t5b J = o5a.J(o.getInt(i));.swift
u17 = i;.swift
int i12 = u18;.swift
int i13 = o.getInt(i12);.swift
u18 = i12;.swift
int i14 = u19;.swift
int i15 = o.getInt(i14);.swift
u19 = i14;.swift
int i16 = u20;.swift
int I = o5a.I(o.getInt(i16));.swift
u20 = i16;.swift
int i17 = u21;.swift
if (o.getInt(i17) = 0) {.swift
u21 = i17;.swift
i2 = u22;.swift
z2 = true;.swift
} else {.swift
u21 = i17;.swift
i2 = u22;.swift
z2 = false;.swift
}.swift
if (o.getInt(i2) = 0) {.swift
u22 = i2;.swift
i3 = u23;.swift
z3 = true;.swift
} else {.swift
u22 = i2;.swift
i3 = u23;.swift
z3 = false;.swift
}.swift
if (o.getInt(i3) = 0) {.swift
u23 = i3;.swift
i4 = u24;.swift
z4 = true;.swift
} else {.swift
u23 = i3;.swift
i4 = u24;.swift
z4 = false;.swift
}.swift
if (o.getInt(i4) = 0) {.swift
u24 = i4;.swift
i5 = u25;.swift
z5 = true;.swift
} else {.swift
u24 = i4;.swift
i5 = u25;.swift
z5 = false;.swift
}.swift
long j8 = o.getLong(i5);.swift
u25 = i5;.swift
int i18 = u26;.swift
long j9 = o.getLong(i18);.swift
u26 = i18;.swift
int i19 = u27;.swift
u27 = i19;.swift
arrayList.add(new xpg(string, K, string2, string3, a2, a3, j, j2, j3, new wj3(I, z2, z3, z4, z5, j8, j9, o5a.g(o.isNull(i19) ? null : o.getBlob(i19))), i7, H, j4, j5, j6, j7, z, J, i13, i15));.swift
u11 = i9;.swift
i6 = i8;.swift
}.swift
o.close();.swift
d7d.o();.swift
ArrayList h = ypg.h();.swift
ArrayList f = ypg.f();.swift
if (arrayList.isEmpty()) {.swift
h88 x = h88.x();.swift
String str = wn4.a;.swift
x.G(str, "Recently completed work:\n\n");.swift
m7f = m7f2;.swift
npg = npg2;.swift
aqg = aqg2;.swift
h88.x().G(str, wn4.a(npg, aqg, m7f, arrayList));.swift
} else {.swift
m7f = m7f2;.swift
npg = npg2;.swift
aqg = aqg2;.swift
}.swift
if (h.isEmpty()) {.swift
h88 x2 = h88.x();.swift
String str2 = wn4.a;.swift
x2.G(str2, "Running work:\n\n");.swift
h88.x().G(str2, wn4.a(npg, aqg, m7f, h));.swift
}.swift
if (f.isEmpty()) {.swift
h88 x3 = h88.x();.swift
String str3 = wn4.a;.swift
x3.G(str3, "Enqueued work:\n\n");.swift
h88.x().G(str3, wn4.a(npg, aqg, m7f, f));.swift
}.swift
return d08.b();.swift
} catch (Throwable th) {.swift
th = th;.swift
o.close();.swift
d7d.o();.swift
throw th;.swift
}.swift
} catch (Throwable th2) {.swift
th = th2;.swift
d7d = a;.swift
o.close();.swift
d7d.o();.swift
throw th;.swift
}.swift
}.swift
}.swift
