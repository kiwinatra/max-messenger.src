package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: h2  reason: default package */
public class h2 extends c2 implements SortedSet {
    public final /* synthetic */ x1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h2(x1 x1Var, SortedMap sortedMap) {
        super(x1Var, sortedMap);
        this.c = x1Var;
    }

    public SortedMap b() {
        return (SortedMap) this.a;
    }

    public final Comparator comparator() {
        return b().comparator();
    }

    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new h2(this.c, b().headMap(obj));
    }

    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new h2(this.c, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new h2(this.c, b().tailMap(obj));
    }
}
