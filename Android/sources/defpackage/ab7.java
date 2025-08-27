package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ab7  reason: default package */
public final class ab7 implements Iterator {
    public final /* synthetic */ int a;
    public final c1g[] b;
    public int c = 0;

    public /* synthetic */ ab7(c1g[] c1gArr, int i) {
        this.a = i;
        this.b = c1gArr;
    }

    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.c != this.b.length;
            default:
                return this.c < this.b.length;
        }
    }

    public final Object next() {
        switch (this.a) {
            case 0:
                int i = this.c;
                c1g[] c1gArr = this.b;
                if (i < c1gArr.length) {
                    this.c = i + 1;
                    return c1gArr[i];
                }
                throw new NoSuchElementException();
            default:
                int i2 = this.c;
                c1g[] c1gArr2 = this.b;
                if (i2 < c1gArr2.length) {
                    AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(c1gArr2[i2], c1gArr2[i2 + 1]);
                    this.c += 2;
                    return simpleImmutableEntry;
                }
                throw new NoSuchElementException();
        }
    }

    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
