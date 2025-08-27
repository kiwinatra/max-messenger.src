package defpackage;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: q08  reason: default package */
public final class q08 extends AbstractSequentialList implements Serializable {
    public final List a;
    public final yi6 b;

    public q08(yi6 yi6, List list) {
        list.getClass();
        this.a = list;
        this.b = yi6;
    }

    public final ListIterator listIterator(int i) {
        return new o08(this, this.a.listIterator(i), 1);
    }

    public final void removeRange(int i, int i2) {
        this.a.subList(i, i2).clear();
    }

    public final int size() {
        return this.a.size();
    }
}
