package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;

/* renamed from: pp4  reason: default package */
public final /* synthetic */ class pp4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sp4 b;

    public /* synthetic */ pp4(sp4 sp4, int i) {
        this.a = i;
        this.b = sp4;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new rp4(this.b);
            case 1:
                sp4 sp4 = this.b;
                return sp4.a.o(sp4.f);
            case 2:
                sp4 sp42 = this.b;
                return sp42.a.o(sp42.g);
            default:
                sp4 sp43 = this.b;
                Map map = sp43.h;
                if (map == null) {
                    return MapsKt.emptyMap();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), sp43.a.o((kp4) entry.getValue()));
                }
                return linkedHashMap;
        }
    }

    public /* synthetic */ pp4(sp4 sp4, rp4 rp4) {
        this.a = 3;
        this.b = sp4;
    }
}
