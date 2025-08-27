package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: hm7  reason: default package */
public enum hm7 implements Iterator {
    ;

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
