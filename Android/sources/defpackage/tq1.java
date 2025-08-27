package defpackage;

import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.MapsKt;

/* renamed from: tq1  reason: default package */
public final class tq1 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public tq1(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [hj7, java.lang.Object] */
    public static void a(tq1 tq1, String str, String str2, String str3, Integer num, String str4, String str5, boolean z, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            z = false;
        }
        nd ndVar = (nd) tq1.b.getValue();
        Map createMapBuilder = MapsKt.createMapBuilder();
        Integer d = ((z5a) tq1.c.getValue()).d();
        if (d != null) {
            createMapBuilder.put("screen", Integer.valueOf(d.intValue()));
        }
        if (str2 != null) {
            createMapBuilder.put("call_id", str2);
        }
        if (str3 != null) {
            createMapBuilder.put("event_label_str", str3);
        }
        if (num != null) {
            createMapBuilder.put("event_label_int", Integer.valueOf(num.intValue()));
        }
        if (str4 != null) {
            createMapBuilder.put("custom_feedback", str4);
        }
        if (str5 != null) {
            createMapBuilder.put("error_type", str5);
        }
        createMapBuilder.put("is_group", Integer.valueOf(z ? 1 : 0));
        Map build = MapsKt.build(createMapBuilder);
        ? obj = new Object();
        obj.v = "CALL";
        Lazy lazy = tq1.a;
        obj.b = ((qjd) ((x23) lazy.getValue())).s();
        obj.c = ((a33) ((x23) lazy.getValue())).B();
        obj.w = str;
        obj.a = System.currentTimeMillis();
        obj.c(build);
        ndVar.j(obj.d());
    }

    public final void b(oq1 oq1, pq1 pq1) {
        a(this, "SHARE_CALL_LINK", (String) null, oq1.a, Integer.valueOf(pq1.a), (String) null, (String) null, true, 50);
    }

    public final void c(sq1 sq1, boolean z) {
        a(this, "START_CALL", (String) null, sq1.a(), Integer.valueOf(z ? 2 : 1), (String) null, (String) null, sq1 instanceof qq1, 50);
    }
}
