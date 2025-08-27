package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: g2  reason: default package */
public class g2 extends b2 implements SortedMap {
    public SortedSet v;
    public final /* synthetic */ x1 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g2(x1 x1Var, SortedMap sortedMap) {
        super(x1Var, sortedMap);
        this.w = x1Var;
    }

    public SortedSet b() {
        return new h2(this.w, d());
    }

    /* renamed from: c */
    public SortedSet keySet() {
        SortedSet sortedSet = this.v;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet b = b();
        this.v = b;
        return b;
    }

    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.c;
    }

    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new g2(this.w, d().headMap(obj));
    }

    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new g2(this.w, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new g2(this.w, d().tailMap(obj));
    }
}
