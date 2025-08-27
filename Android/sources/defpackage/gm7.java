package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: gm7  reason: default package */
public final class gm7 implements Iterator {
    public Iterator a;
    public Iterator b;
    public Iterator c;
    public ArrayDeque o;

    public final boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.b;
            it2.getClass();
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                Iterator it3 = this.c;
                if (it3 != null && it3.hasNext()) {
                    it = this.c;
                    break;
                }
                ArrayDeque arrayDeque = this.o;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    it = null;
                } else {
                    this.c = (Iterator) this.o.removeFirst();
                }
            }
            it = null;
            this.c = it;
            if (it == null) {
                return false;
            }
            Iterator it4 = (Iterator) it.next();
            this.b = it4;
            if (it4 instanceof gm7) {
                gm7 gm7 = (gm7) it4;
                this.b = gm7.b;
                if (this.o == null) {
                    this.o = new ArrayDeque();
                }
                this.o.addFirst(this.c);
                if (gm7.o != null) {
                    while (!gm7.o.isEmpty()) {
                        this.o.addFirst((Iterator) gm7.o.removeLast());
                    }
                }
                this.c = gm7.c;
            }
        }
    }

    public final Object next() {
        if (hasNext()) {
            Iterator it = this.b;
            this.a = it;
            return it.next();
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        Iterator it = this.a;
        if (it != null) {
            it.remove();
            this.a = null;
            return;
        }
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
