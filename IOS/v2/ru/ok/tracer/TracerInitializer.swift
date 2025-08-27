package ru.ok.tracer;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import ru.ok.tracer.utils.LoggerInitializer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/tracer/TracerInitializer;", "Lwf7;", "Lkof;", "<init>", "()V", "tracer-commons_release"}, k = 1, mv = {1, 7, 1})
public final class TracerInitializer implements wf7 {
    public final List a() {
        return CollectionsKt.listOf(LoggerInitializer.class);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [gy8, java.lang.Object] */
    public final Object b(Context context) {
        boolean z = false;
        kof kof = kof.a;
        if (!kof.g.getAndSet(true)) {
            kof.d = context;
            if (context instanceof vw6) {
                try {
                    Iterable d = kof.d((vw6) context);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(d, 10)), 16));
                    for (Object next : d) {
                        linkedHashMap.put(((nof) next).a(), next);
                    }
                    kof.j = linkedHashMap;
                } catch (Exception unused) {
                }
            }
            kof kof2 = kof.a;
            Object obj = kof.c().get(iq.c);
            kxd kxd = null;
            l04 l04 = obj instanceof l04 ? (l04) obj : null;
            if (l04 == null) {
                l04 = new l04(new xe8(9));
            }
            PackageInfo M = ld8.M(context.getPackageManager(), context.getPackageName());
            String str = M.packageName;
            String str2 = M.versionName;
            long longVersionCode = M.getLongVersionCode();
            String p = ev0.p(context, "tracer_mapping_uuid");
            if (p != null) {
                if (Intrinsics.areEqual((Object) p, (Object) "00000000-0000-0000-0000-000000000000")) {
                    p = null;
                }
                String p2 = ev0.p(context, "tracer_environment");
                ? obj2 = new Object();
                obj2.b = str;
                obj2.a = str2;
                obj2.o = longVersionCode;
                obj2.c = p;
                obj2.v = p2;
                kof.c = obj2;
                pf6.o = new abe(new jof(context, 0));
                kof.e = new kxd(context);
                kof.f = new c9f(context);
                Map map = l04.a;
                if (true ^ map.isEmpty()) {
                    c9f c9f = kof.f;
                    if (c9f == null) {
                        c9f = null;
                    }
                    synchronized (c9f.e) {
                        try {
                            for (Map.Entry entry : map.entrySet()) {
                                z |= cd4.k((String) entry.getKey(), (String) entry.getValue(), c9f.e);
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (z) {
                        ipf.a(new mgd(22, c9f));
                    }
                }
                Application application = (Application) context.getApplicationContext();
                kxd kxd2 = kof.e;
                if (kxd2 != null) {
                    kxd = kxd2;
                }
                application.registerActivityLifecycleCallbacks(new lof(kxd));
                return kof.a;
            }
            throw new IllegalStateException("Could not find build UUID. Is Tracer plugin configured properly?");
        }
        throw new IllegalStateException("Tracer already initialized!");
    }
}
