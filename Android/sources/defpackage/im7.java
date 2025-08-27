package defpackage;

import java.util.NoSuchElementException;

/* renamed from: im7  reason: default package */
public final class im7 extends wvf {
    public static final Object c = new Object();
    public Object b;

    public final boolean hasNext() {
        return this.b != c;
    }

    public final Object next() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            this.b = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
