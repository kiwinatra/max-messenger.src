package defpackage;

import java.util.Iterator;

/* renamed from: bm7  reason: default package */
public final class bm7 implements Iterable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Iterable b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bm7(Iterable iterable, Object obj, int i) {
        this.a = i;
        this.b = iterable;
        this.c = obj;
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new am7(this, this.b.iterator());
            default:
                return new cm7(this, this.b.iterator());
        }
    }
}
