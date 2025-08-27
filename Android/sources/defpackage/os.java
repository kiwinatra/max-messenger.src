package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: os  reason: default package */
public final class os extends AbstractSet {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public os(c1g[] c1gArr) {
        this.b = c1gArr;
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new rs((ts) this.b);
            default:
                return new ab7((c1g[]) this.b, 1);
        }
    }

    public final int size() {
        switch (this.a) {
            case 0:
                return ((ts) this.b).c;
            default:
                return ((c1g[]) this.b).length / 2;
        }
    }

    public os(ts tsVar) {
        this.b = tsVar;
    }
}
