package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;

/* renamed from: qp4  reason: default package */
public final /* synthetic */ class qp4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rp4 b;
    public final /* synthetic */ sp4 c;

    public /* synthetic */ qp4(rp4 rp4, sp4 sp4, int i) {
        this.a = i;
        this.b = rp4;
        this.c = sp4;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                sp4 sp4 = this.c;
                p7d c2 = sp4.b.c(sp4.e);
                ni0 d = sp4.b.d();
                ma5 ma5 = sp4.c;
                return new vu0((nl5) this.b.a.getValue(), c2, d, ma5.f(), ma5.e(), sp4.d);
            case 1:
                sp4 sp42 = this.c;
                p7d c3 = sp42.b.c(sp42.e);
                ni0 d2 = sp42.b.d();
                ma5 ma52 = sp42.c;
                return new vu0((nl5) this.b.c.getValue(), c3, d2, ma52.f(), ma52.e(), sp42.d);
            default:
                Map map = (Map) this.b.e.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    sp4 sp43 = this.c;
                    p7d c4 = sp43.b.c(sp43.e);
                    ni0 d3 = sp43.b.d();
                    ma5 ma53 = sp43.c;
                    linkedHashMap.put(key, new vu0((nl5) entry.getValue(), c4, d3, ma53.f(), ma53.e(), sp43.d));
                }
                return new HashMap(linkedHashMap);
        }
    }
}
