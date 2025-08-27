package defpackage;

import java.util.Iterator;

/* renamed from: dm7  reason: default package */
public final class dm7 extends nx5 {
    public final /* synthetic */ Iterable a;
    public final /* synthetic */ msb b;

    public dm7(Iterable iterable, msb msb) {
        this.a = iterable;
        this.b = msb;
    }

    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        msb msb = this.b;
        msb.getClass();
        return new em7(it, msb);
    }
}
