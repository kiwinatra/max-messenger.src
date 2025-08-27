package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: f04  reason: default package */
public final class f04 implements ListIterator {
    public final Object[] a;
    public int b;

    public f04(Object[] objArr, int i) {
        this.b = i;
        this.a = objArr;
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    public final boolean hasPrevious() {
        return this.b > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.b;
            this.b = i + 1;
            return this.a[i];
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.b;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.b - 1;
            this.b = i;
            return this.a[i];
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.b - 1;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
