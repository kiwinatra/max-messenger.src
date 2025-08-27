package ru.ok.messages.analytics;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.PowerManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ok/messages/analytics/DailyAnalyticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lnd;", "analytics", "Lcq;", "appNotifications", "Lrh3;", "connectionInfo", "Lhn4;", "deviceInfo", "Lcxe;", "storeServicesInfo", "Lxcb;", "permissionStats", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lnd;Lcq;Lrh3;Lhn4;Lcxe;Lxcb;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class DailyAnalyticsWorker extends Worker {
    public static final Regex y = new Regex("\\s+");
    public final nd b;
    public final cq c;
    public final rh3 o;
    public final hn4 v;
    public final cxe w;
    public final xcb x;

    public DailyAnalyticsWorker(Context context, WorkerParameters workerParameters, nd ndVar, cq cqVar, rh3 rh3, hn4 hn4, cxe cxe, xcb xcb) {
        super(context, workerParameters);
        this.b = ndVar;
        this.c = cqVar;
        this.o = rh3;
        this.v = hn4;
        this.w = cxe;
        this.x = xcb;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r7v5, types: [hj7, java.lang.Object] */
    public final d08 b() {
        UUID id = getId();
        z68.c("ru.ok.messages.analytics.DailyAnalyticsWorker", "work " + id + " started", new Object[0]);
        xcb xcb = this.x;
        xcb.getClass();
        Map createMapBuilder = MapsKt.createMapBuilder();
        List createListBuilder = CollectionsKt.createListBuilder();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            Map createMapBuilder2 = MapsKt.createMapBuilder();
            createMapBuilder2.put("pType", "push");
            createMapBuilder2.put("pStatus", xcb.c(xcb.d));
            createListBuilder.add(MapsKt.build(createMapBuilder2));
        }
        Map createMapBuilder3 = MapsKt.createMapBuilder();
        createMapBuilder3.put("pType", "contacts");
        createMapBuilder3.put("pStatus", xcb.c(xcb.e));
        createListBuilder.add(MapsKt.build(createMapBuilder3));
        Map createMapBuilder4 = MapsKt.createMapBuilder();
        createMapBuilder4.put("pType", "gallery");
        ddb ddb = xcb.f;
        createMapBuilder4.put("pStatus", i < 34 ? xcb.c(ddb) : ddb.i() ? "allowed" : xcb.g.i() ? "partial" : "denied");
        createListBuilder.add(MapsKt.build(createMapBuilder4));
        Map createMapBuilder5 = MapsKt.createMapBuilder();
        createMapBuilder5.put("pType", "camera");
        createMapBuilder5.put("pStatus", xcb.c(xcb.h));
        createListBuilder.add(MapsKt.build(createMapBuilder5));
        Map createMapBuilder6 = MapsKt.createMapBuilder();
        createMapBuilder6.put("pType", "microphone");
        createMapBuilder6.put("pStatus", xcb.c(xcb.i));
        createListBuilder.add(MapsKt.build(createMapBuilder6));
        Map createMapBuilder7 = MapsKt.createMapBuilder();
        createMapBuilder7.put("pType", "geo");
        createMapBuilder7.put("pStatus", xcb.c(xcb.j));
        createListBuilder.add(MapsKt.build(createMapBuilder7));
        Unit unit = Unit.INSTANCE;
        createMapBuilder.put("permissions", CollectionsKt.build(createListBuilder));
        xcb.d("permission_status", MapsKt.build(createMapBuilder));
        String str = "0";
        String str2 = nea.a(this.c.b().i(false).b) ? "1" : str;
        nd ndVar = this.b;
        ndVar.f("ACTION_ARE_NOTIFICATIONS_ENABLED", str2);
        hs2 c2 = ((a74) ((qra) ((hd3) getApplicationContext()).b()).getAccessor().g(a74.class)).b.c();
        c2.getClass();
        d7d a = d7d.a(0, "SELECT COUNT(*) FROM chats");
        i6d i6d = c2.a;
        i6d.b();
        Cursor o2 = i6d.o(a, (CancellationSignal) null);
        try {
            long j = o2.moveToFirst() ? o2.getLong(0) : 0;
            o2.close();
            a.o();
            String str3 = this.o.a() ? "1" : str;
            String valueOf = String.valueOf(j);
            ? obj = new Object();
            obj.v = "ACTION";
            obj.w = "ACTION_IS_BACKGROUND_DATA_ENABLED";
            obj.b(str3, "value");
            obj.b(valueOf, "param1");
            ndVar.j(obj.d());
            hn4 hn4 = this.v;
            Context context = hn4.a;
            if (hn4.d == null) {
                hn4.d = (PowerManager) context.getSystemService("power");
            }
            boolean isIgnoringBatteryOptimizations = hn4.d.isIgnoringBatteryOptimizations(context.getPackageName());
            z68.c("fn4", "isIgnoringBatteryOptimizations: " + isIgnoringBatteryOptimizations, new Object[0]);
            ndVar.f("ACTION_IS_IGNORING_BATTERY_OPTIMIZATIONS", isIgnoringBatteryOptimizations ? "1" : str);
            xt6 xt6 = (xt6) this.w;
            String str4 = xt6.f;
            if (xt6.a()) {
                str = "1";
            }
            ndVar.f("ARE_SERVICES_AVAILABLE", y.replace((CharSequence) g63.i(str4, "-", str).toLowerCase(Locale.ENGLISH), "_"));
            UUID id2 = getId();
            z68.c("ru.ok.messages.analytics.DailyAnalyticsWorker", "work " + id2 + " finished", new Object[0]);
            return d08.b();
        } catch (Throwable th) {
            o2.close();
            a.o();
            throw th;
        }
    }
}
