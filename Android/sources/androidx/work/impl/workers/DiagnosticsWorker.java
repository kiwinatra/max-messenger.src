package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class DiagnosticsWorker extends Worker {
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final d08 b() {
        d7d d7d;
        m7f m7f;
        aqg aqg;
        npg npg;
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        WorkDatabase workDatabase = dpg.d(getApplicationContext()).c;
        ypg y = workDatabase.y();
        npg w = workDatabase.w();
        aqg z6 = workDatabase.z();
        m7f v = workDatabase.v();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1);
        y.getClass();
        d7d a = d7d.a(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        a.k(1, currentTimeMillis);
        i6d i6d = (i6d) y.a;
        i6d.b();
        Cursor o = i6d.o(a, (CancellationSignal) null);
        try {
            int u = kne.u(o, "id");
            int u2 = kne.u(o, "state");
            int u3 = kne.u(o, "worker_class_name");
            int u4 = kne.u(o, "input_merger_class_name");
            int u5 = kne.u(o, "input");
            int u6 = kne.u(o, "output");
            int u7 = kne.u(o, "initial_delay");
            int u8 = kne.u(o, "interval_duration");
            int u9 = kne.u(o, "flex_duration");
            int u10 = kne.u(o, "run_attempt_count");
            m7f m7f2 = v;
            int u11 = kne.u(o, "backoff_policy");
            npg npg2 = w;
            int u12 = kne.u(o, "backoff_delay_duration");
            aqg aqg2 = z6;
            int u13 = kne.u(o, "last_enqueue_time");
            ypg ypg = y;
            int u14 = kne.u(o, "minimum_retention_duration");
            d7d = a;
            try {
                int u15 = kne.u(o, "schedule_requested_at");
                int u16 = kne.u(o, "run_in_foreground");
                int u17 = kne.u(o, "out_of_quota_policy");
                int u18 = kne.u(o, "period_count");
                int u19 = kne.u(o, "generation");
                int u20 = kne.u(o, "required_network_type");
                int u21 = kne.u(o, "requires_charging");
                int u22 = kne.u(o, "requires_device_idle");
                int u23 = kne.u(o, "requires_battery_not_low");
                int u24 = kne.u(o, "requires_storage_not_low");
                int u25 = kne.u(o, "trigger_content_update_delay");
                int u26 = kne.u(o, "trigger_max_content_delay");
                int u27 = kne.u(o, "content_uri_triggers");
                int i6 = u14;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    String string = o.isNull(u) ? null : o.getString(u);
                    xog K = o5a.K(o.getInt(u2));
                    String string2 = o.isNull(u3) ? null : o.getString(u3);
                    String string3 = o.isNull(u4) ? null : o.getString(u4);
                    t64 a2 = t64.a(o.isNull(u5) ? null : o.getBlob(u5));
                    t64 a3 = t64.a(o.isNull(u6) ? null : o.getBlob(u6));
                    long j = o.getLong(u7);
                    long j2 = o.getLong(u8);
                    long j3 = o.getLong(u9);
                    int i7 = o.getInt(u10);
                    ag0 H = o5a.H(o.getInt(u11));
                    long j4 = o.getLong(u12);
                    long j5 = o.getLong(u13);
                    int i8 = i6;
                    long j6 = o.getLong(i8);
                    int i9 = u11;
                    int i10 = u15;
                    long j7 = o.getLong(i10);
                    u15 = i10;
                    int i11 = u16;
                    if (o.getInt(i11) != 0) {
                        u16 = i11;
                        i = u17;
                        z = true;
                    } else {
                        u16 = i11;
                        i = u17;
                        z = false;
                    }
                    t5b J = o5a.J(o.getInt(i));
                    u17 = i;
                    int i12 = u18;
                    int i13 = o.getInt(i12);
                    u18 = i12;
                    int i14 = u19;
                    int i15 = o.getInt(i14);
                    u19 = i14;
                    int i16 = u20;
                    int I = o5a.I(o.getInt(i16));
                    u20 = i16;
                    int i17 = u21;
                    if (o.getInt(i17) != 0) {
                        u21 = i17;
                        i2 = u22;
                        z2 = true;
                    } else {
                        u21 = i17;
                        i2 = u22;
                        z2 = false;
                    }
                    if (o.getInt(i2) != 0) {
                        u22 = i2;
                        i3 = u23;
                        z3 = true;
                    } else {
                        u22 = i2;
                        i3 = u23;
                        z3 = false;
                    }
                    if (o.getInt(i3) != 0) {
                        u23 = i3;
                        i4 = u24;
                        z4 = true;
                    } else {
                        u23 = i3;
                        i4 = u24;
                        z4 = false;
                    }
                    if (o.getInt(i4) != 0) {
                        u24 = i4;
                        i5 = u25;
                        z5 = true;
                    } else {
                        u24 = i4;
                        i5 = u25;
                        z5 = false;
                    }
                    long j8 = o.getLong(i5);
                    u25 = i5;
                    int i18 = u26;
                    long j9 = o.getLong(i18);
                    u26 = i18;
                    int i19 = u27;
                    u27 = i19;
                    arrayList.add(new xpg(string, K, string2, string3, a2, a3, j, j2, j3, new wj3(I, z2, z3, z4, z5, j8, j9, o5a.g(o.isNull(i19) ? null : o.getBlob(i19))), i7, H, j4, j5, j6, j7, z, J, i13, i15));
                    u11 = i9;
                    i6 = i8;
                }
                o.close();
                d7d.o();
                ArrayList h = ypg.h();
                ArrayList f = ypg.f();
                if (!arrayList.isEmpty()) {
                    h88 x = h88.x();
                    String str = wn4.a;
                    x.G(str, "Recently completed work:\n\n");
                    m7f = m7f2;
                    npg = npg2;
                    aqg = aqg2;
                    h88.x().G(str, wn4.a(npg, aqg, m7f, arrayList));
                } else {
                    m7f = m7f2;
                    npg = npg2;
                    aqg = aqg2;
                }
                if (!h.isEmpty()) {
                    h88 x2 = h88.x();
                    String str2 = wn4.a;
                    x2.G(str2, "Running work:\n\n");
                    h88.x().G(str2, wn4.a(npg, aqg, m7f, h));
                }
                if (!f.isEmpty()) {
                    h88 x3 = h88.x();
                    String str3 = wn4.a;
                    x3.G(str3, "Enqueued work:\n\n");
                    h88.x().G(str3, wn4.a(npg, aqg, m7f, f));
                }
                return d08.b();
            } catch (Throwable th) {
                th = th;
                o.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d7d = a;
            o.close();
            d7d.o();
            throw th;
        }
    }
}
