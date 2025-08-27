package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: r93  reason: default package */
public abstract class r93 implements Iterator {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ t93 o;

    public r93(t93 t93) {
        this.o = t93;
        this.a = t93.v;
        this.b = t93.isEmpty() ? -1 : 0;
        this.c = -1;
    }

    public abstract Object a(int i);

    public final boolean hasNext() {
        return this.b >= 0;
    }

    public final Object next() {
        t93 t93 = this.o;
        if (t93.v != this.a) {
            throw new ConcurrentModificationException();
        } else if (hasNext()) {
            int i = this.b;
            this.c = i;
            Object a2 = a(i);
            int i2 = this.b + 1;
            if (i2 >= t93.w) {
                i2 = -1;
            }
            this.b = i2;
            return a2;
        } else {
            throw new NoSuchElementException();
        }
    }

    public final void remove() {
        t93 t93 = this.o;
        int i = t93.v;
        int i2 = this.a;
        if (i == i2) {
            int i3 = this.c;
            if (i3 >= 0) {
                this.a = i2 + 32;
                t93.remove(t93.i()[i3]);
                this.b--;
                this.c = -1;
                return;
            }
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        throw new ConcurrentModificationException();
    }
}
