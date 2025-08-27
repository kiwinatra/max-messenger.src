package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;

/* renamed from: kd6  reason: default package */
public final class kd6 {
    public static final kd6 c = new kd6(SetsKt.emptySet(), MapsKt.emptyMap());
    public final Set a;
    public final LinkedHashMap b;

    public kd6(Set set, Map map) {
        this.a = set;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
        }
        this.b = linkedHashMap;
    }
}
