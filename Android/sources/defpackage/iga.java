package defpackage;

import java.util.HashMap;
import kotlin.reflect.KProperty;

/* renamed from: iga  reason: default package */
public final class iga {
    public static final /* synthetic */ KProperty[] c;
    public static final String d;
    public final hs7 a;
    public final hs7 b;

    static {
        Class<iga> cls = iga.class;
        c = new KProperty[]{wj6.p(cls, "exceptionHandler", "getExceptionHandler()Lru/ok/tamtam/ExceptionHandler;", 0), wj6.p(cls, "analytics", "getAnalytics()Lru/ok/tamtam/stats/Analytics;", 0)};
        d = cls.getName();
    }

    public iga(hs7 hs7, hs7 hs72) {
        this.a = hs72;
        this.b = hs7;
    }

    public static void a(HashMap hashMap, cj5 cj5) {
        hashMap.put("trid", Long.valueOf(cj5.a));
        String str = cj5.h;
        if (str != null) {
            hashMap.put("eKey", str);
        }
        Long l = cj5.g;
        if (l != null) {
            hashMap.put("ttime", l);
            hashMap.put("dtime", Long.valueOf(cj5.j - l.longValue()));
            hashMap.put("fcmdtime", Long.valueOf(cj5.i - l.longValue()));
        }
        Long l2 = cj5.e;
        if (l2 != null) {
            hashMap.put("suid", l2);
        }
    }

    public final nd b() {
        KProperty kProperty = c[1];
        return (nd) this.b.get();
    }

    public final m95 c() {
        KProperty kProperty = c[0];
        return (m95) this.a.get();
    }
}
