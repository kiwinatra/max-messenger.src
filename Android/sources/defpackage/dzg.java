package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: dzg  reason: default package */
public final class dzg implements Iterator {
    public int a = 0;
    public final int b;
    public final /* synthetic */ fzg c;

    public dzg(fzg fzg) {
        this.c = fzg;
        this.b = fzg.e();
    }

    public final boolean hasNext() {
        return this.a < this.b;
    }

    public final Object next() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return Byte.valueOf(this.c.d(i));
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
