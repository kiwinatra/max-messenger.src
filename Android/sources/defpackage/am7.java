package defpackage;

import java.util.Iterator;
import ru.ok.android.externcalls.sdk.u;

/* renamed from: am7  reason: default package */
public final class am7 implements Iterator {
    public final /* synthetic */ Iterator a;
    public final /* synthetic */ bm7 b;

    public am7(bm7 bm7, Iterator it) {
        this.b = bm7;
        this.a = it;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        Object next = this.a.next();
        ((u) this.b.c).getClass();
        return u.a(next);
    }
}
