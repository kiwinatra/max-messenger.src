package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* renamed from: nx9  reason: default package */
public final class nx9 extends x1 {
    public transient s2f w;

    public final b2 c() {
        Map map = this.o;
        return map instanceof NavigableMap ? new d2(this, (NavigableMap) map) : map instanceof SortedMap ? new g2(this, (SortedMap) map) : new b2(this, map);
    }

    public final Collection d() {
        return (List) this.w.get();
    }

    public final c2 e() {
        Map map = this.o;
        return map instanceof NavigableMap ? new e2(this, (NavigableMap) map) : map instanceof SortedMap ? new h2(this, (SortedMap) map) : new c2(this, map);
    }
}
