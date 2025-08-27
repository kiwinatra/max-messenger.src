package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: rsf  reason: default package */
public final class rsf implements Iterator, KMappedMarker {
    public final Function1 a;
    public final ArrayList b = new ArrayList();
    public Iterator c;

    public rsf(z69 z69, Function1 function1) {
        this.a = function1;
        this.c = z69;
    }

    public final boolean hasNext() {
        return this.c.hasNext();
    }

    public final Object next() {
        Object next = this.c.next();
        Iterator it = (Iterator) this.a.invoke(next);
        ArrayList arrayList = this.b;
        if (it == null || !it.hasNext()) {
            while (!this.c.hasNext() && (!arrayList.isEmpty())) {
                this.c = (Iterator) CollectionsKt.last(arrayList);
                CollectionsKt.removeLast(arrayList);
            }
        } else {
            arrayList.add(this.c);
            this.c = it;
        }
        return next;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
