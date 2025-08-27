package ru.ok.android.externcalls.sdk.log;

import java.util.Iterator;
import java.util.Map;
import ru.ok.android.ext.OneLogger;

public class ExtLogger extends yoc {
    private static final String COLLECTOR = "ok.mobile.apps.video";
    private final String place;
    private final TimeProvider timeProvider;

    public interface TimeProvider {
        long getCurrentTimeMillis();
    }

    public ExtLogger(String str, TimeProvider timeProvider2) {
        try {
            OneLogger.ensureInitialized();
        } catch (NoClassDefFoundError unused) {
        }
        this.place = str;
        this.timeProvider = timeProvider2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [cna, java.lang.Object] */
    public static cna simpleBuilder(jme jme) {
        ? obj = new Object();
        obj.b();
        obj.a = COLLECTOR;
        obj.b = 1;
        obj.c = jme != null ? jme.a : null;
        obj.d = 1;
        return obj;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [cna, java.lang.Object] */
    public static cna simpleBuilderAny(String str) {
        ? obj = new Object();
        obj.b();
        obj.a = COLLECTOR;
        obj.b = 1;
        obj.c = str;
        obj.d = 1;
        return obj;
    }

    public void log(dna dna) {
        dna.getClass();
        Iterator it = ana.a.iterator();
        if (it.hasNext()) {
            rae.w(it.next());
            throw null;
        }
    }

    public void logSimple(jme jme, String str, String str2) {
        cna simpleBuilder = simpleBuilder(jme);
        simpleBuilder.c("vcid", str);
        simpleBuilder.c("param", str2);
        simpleBuilder.d(this.timeProvider.getCurrentTimeMillis());
        log(simpleBuilder.a());
    }

    public long time() {
        return this.timeProvider.getCurrentTimeMillis();
    }

    public void log(jme jme, Map<String, String> map) {
        log(COLLECTOR, jme.a, map);
    }

    public void log(String str, String str2, Map<String, String> map) {
        log(str, str2, map, (String) null, (Long) null);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [cna, java.lang.Object] */
    public void log(String str, long j, String str2, String str3) {
        ? obj = new Object();
        obj.b();
        obj.a = COLLECTOR;
        obj.b = 1;
        obj.c = str;
        obj.d = 1;
        obj.d(j);
        if (str2 != null) {
            obj.c("param", str2);
        }
        String str4 = this.place;
        if (str4 != null && "callStart".equals(str)) {
            obj.c("place", str4);
        }
        if (str3 != null) {
            obj.c("stat_type", str3);
        }
        log(obj.a());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [cna, java.lang.Object] */
    public void log(String str, String str2, Map<String, String> map, String str3, Long l) {
        ? obj = new Object();
        obj.b();
        obj.a = str;
        obj.b = 1;
        obj.c = str2;
        obj.d = 1;
        if (str3 != null) {
            obj.f = str3;
            obj.g = true;
        }
        if (l != null) {
            obj.d(l.longValue());
        } else {
            obj.d(this.timeProvider.getCurrentTimeMillis());
        }
        for (Map.Entry next : map.entrySet()) {
            obj.c((String) next.getKey(), (String) next.getValue());
        }
        log(obj.a());
    }
}
