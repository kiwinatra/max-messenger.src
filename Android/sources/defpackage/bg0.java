package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: bg0  reason: default package */
public final class bg0 implements Iterable, KMappedMarker {
    public final ArrayDeque a = new ArrayDeque();
    public d9d b;

    public final i9d b() {
        return (i9d) this.a.peek();
    }

    public final i9d d() {
        i9d i9d = (i9d) this.a.pop();
        d9d d9d = this.b;
        if (d9d != null) {
            d9d.d();
        }
        i9d.a.destroy();
        return i9d;
    }

    public final Iterator e() {
        return CollectionsKt.reversed(this.a).iterator();
    }

    public final int getSize() {
        return this.a.size();
    }

    public final Iterator iterator() {
        return ArrayIteratorKt.iterator(this.a.toArray(new i9d[0]));
    }
}
