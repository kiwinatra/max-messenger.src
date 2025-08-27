package defpackage;

import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: h04  reason: default package */
public final class h04 implements ListIterator {
    public final ListIterator a;
    public final int b;
    public final int c;

    public h04(List list, int i, int i2, int i3) {
        this.b = i2;
        this.c = i3;
        this.a = list.listIterator(i + i2);
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return nextIndex() < this.c;
    }

    public final boolean hasPrevious() {
        return previousIndex() >= 0;
    }

    public final Object next() {
        if (hasNext()) {
            return this.a.next();
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.a.nextIndex() - this.b;
    }

    public final Object previous() {
        if (hasPrevious()) {
            return this.a.previous();
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.a.previousIndex() - this.b;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
