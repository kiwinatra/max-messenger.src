package defpackage;

import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.MapsKt;

/* renamed from: nd  reason: default package */
public final class nd {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    public nd(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = lazy4;
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [hj7, java.lang.Object] */
    public final void a(String str, Map map) {
        ? obj = new Object();
        obj.a = System.currentTimeMillis();
        obj.v = "PUSH";
        obj.w = str;
        obj.c(MapsKt.toMap(map));
        j(obj.d());
    }

    public final void b(l88 l88, x23 x23, fn4 fn4) {
        b89 b89;
        if (((xt6) ((hn4) fn4).g).a()) {
            long currentTimeMillis = System.currentTimeMillis();
            qjd qjd = (qjd) x23;
            long j = qjd.g.getLong("app.last.firebase_push_time", 0);
            if (j == 0) {
                qjd.k("app.last.firebase_push_time", Long.valueOf(currentTimeMillis));
            } else if (currentTimeMillis - j >= 86400000) {
                boolean z = false;
                for (b32 b32 : l88.o) {
                    if (!(b32.Z == 0 || (b89 = b32.z) == null)) {
                        long j2 = b89.b;
                        if (j2 > j && j2 < currentTimeMillis - (86400000 / ((long) 2))) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    String str = Build.MANUFACTURER;
                    if (str == null || str.length() == 0) {
                        str = "UNKNOWN";
                    }
                    f("FIREBASE_PUSH_SKIPPED", str);
                }
            }
        }
    }

    public final void c(int i, String str) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = new HashMap();
        hashMap.put("value", valueOf);
        if (cvg.A("ACTION") || cvg.A(str)) {
            throw new IllegalArgumentException("type or event can't be empty");
        } else if (hashMap.size() <= 10) {
            j(new n78(System.currentTimeMillis(), 0, 0, "ACTION", str, hashMap));
        } else {
            throw new IllegalArgumentException("params can't be greater than limit = 10");
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [hj7, java.lang.Object] */
    public final void d(long j, String str, String str2) {
        ? obj = new Object();
        obj.v = "ACTION";
        obj.w = str;
        obj.b(Long.valueOf(j), "duration");
        if (str2 != null) {
            obj.b(str2, "value");
        }
        j(obj.d());
    }

    public final void e(String str) {
        if (cvg.A("ACTION") || cvg.A(str)) {
            throw new IllegalArgumentException("type or event can't be empty");
        }
        j(new n78(System.currentTimeMillis(), 0, 0, "ACTION", str, (Map) null));
    }

    public final void f(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("value", str2);
        if (cvg.A("ACTION") || cvg.A(str)) {
            throw new IllegalArgumentException("type or event can't be empty");
        } else if (hashMap.size() <= 10) {
            j(new n78(System.currentTimeMillis(), 0, 0, "ACTION", str, hashMap));
        } else {
            throw new IllegalArgumentException("params can't be greater than limit = 10");
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [hj7, java.lang.Object] */
    public final void g(String str, Map map) {
        ? obj = new Object();
        obj.v = "ACTION";
        obj.w = str;
        obj.c(map);
        j(obj.d());
    }

    public final void h(long j, String str) {
        Long valueOf = Long.valueOf(j);
        HashMap hashMap = new HashMap();
        hashMap.put("duration", valueOf);
        if (cvg.A("ACTION") || cvg.A(str)) {
            throw new IllegalArgumentException("type or event can't be empty");
        } else if (hashMap.size() <= 10) {
            j(new n78(System.currentTimeMillis(), 0, 0, "ACTION", str, hashMap));
        } else {
            throw new IllegalArgumentException("params can't be greater than limit = 10");
        }
    }

    public final void i(Object obj, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("uniqueId", obj);
        if (cvg.A("ACTION") || cvg.A(str)) {
            throw new IllegalArgumentException("type or event can't be empty");
        } else if (hashMap.size() <= 10) {
            j(new n78(System.currentTimeMillis(), 0, 0, "ACTION", str, hashMap));
        } else {
            throw new IllegalArgumentException("params can't be greater than limit = 10");
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [hj7, java.lang.Object] */
    public final void j(n78 n78) {
        ((fjd) this.c.getValue()).getClass();
        long j = n78.b;
        if (j == 0) {
            ? obj = new Object();
            obj.a = n78.a;
            obj.b = j;
            obj.v = n78.c;
            obj.w = n78.d;
            obj.c = n78.f;
            obj.c(n78.e);
            obj.b = ((qjd) ((x23) this.a.getValue())).s();
            n78 = obj.d();
        }
        k78 k78 = (k78) this.b.getValue();
        String str = k78.a;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, str, "Store in buffer event=" + n78, (Throwable) null);
        }
        st0 st0 = k78.x;
        if (st0.k.get()) {
            n6e n6e = st0.j;
            if (((Number) ((sye) n6e.g()).getValue()).intValue() != 0) {
                n6e.d(n78);
                return;
            }
        }
        st0.m.add(n78);
    }

    public final void k(long j, String str) {
        if (str.length() != 0) {
            Long valueOf = Long.valueOf(j);
            HashMap hashMap = new HashMap();
            hashMap.put("duration", valueOf);
            if (cvg.A("SCREEN") || cvg.A(str)) {
                throw new IllegalArgumentException("type or event can't be empty");
            } else if (hashMap.size() <= 10) {
                j(new n78(System.currentTimeMillis(), 0, 0, "SCREEN", str, hashMap));
            } else {
                throw new IllegalArgumentException("params can't be greater than limit = 10");
            }
        }
    }
}
