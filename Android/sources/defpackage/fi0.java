package defpackage;

import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.MapsKt;

/* renamed from: fi0  reason: default package */
public final class fi0 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final cz9 d = new cz9(6);
    public final cz9 e = new cz9(6);

    public fi0(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        int i = ni7.a;
    }

    public final void a(rh0 rh0, ph0 ph0, oh0 oh0) {
        Integer d2 = ((z5a) this.c.getValue()).d();
        if (d2 != null) {
            b("clicked", ((a33) ((x23) this.a.getValue())).B(), rh0, d2.intValue(), ph0, oh0);
        }
    }

    /* JADX WARNING: type inference failed for: r8v4, types: [hj7, java.lang.Object] */
    public final void b(String str, long j, rh0 rh0, int i, ph0 ph0, oh0 oh0) {
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.put("bannerType", rh0.a);
        createMapBuilder.put("screen", Integer.valueOf(i));
        createMapBuilder.put("bannerSize", ph0.a);
        createMapBuilder.put("bannerShowType", oh0.a);
        Map build = MapsKt.build(createMapBuilder);
        ? obj = new Object();
        obj.v = "BANNER";
        obj.b = ((qjd) ((x23) this.a.getValue())).s();
        obj.c = j;
        obj.w = str;
        obj.a = System.currentTimeMillis();
        obj.c(build);
        ((nd) this.b.getValue()).j(obj.d());
    }
}
