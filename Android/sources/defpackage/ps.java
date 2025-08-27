package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMutableIterator;

/* renamed from: ps  reason: default package */
public final class ps implements Iterator, KMutableIterator {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object v;

    public ps(int i) {
        this.a = i;
    }

    public final Object a(int i) {
        switch (this.o) {
            case 0:
                return ((ts) this.v).f(i);
            case 1:
                return ((ts) this.v).i(i);
            default:
                return ((ws) this.v).b[i];
        }
    }

    public final void b(int i) {
        switch (this.o) {
            case 0:
                ((ts) this.v).g(i);
                return;
            case 1:
                ((ts) this.v).g(i);
                return;
            default:
                ((ws) this.v).f(i);
                return;
        }
    }

    public final boolean hasNext() {
        return this.b < this.a;
    }

    public final Object next() {
        if (hasNext()) {
            Object a2 = a(this.b);
            this.b++;
            this.c = true;
            return a2;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.c) {
            int i = this.b - 1;
            this.b = i;
            b(i);
            this.a--;
            this.c = false;
            return;
        }
        throw new IllegalStateException("Call next() before removing an element.".toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ps(ws wsVar) {
        this(wsVar.c);
        this.o = 2;
        this.v = wsVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ps(ts tsVar, int i) {
        this(tsVar.c);
        this.o = i;
        switch (i) {
            case 1:
                this.v = tsVar;
                this(tsVar.c);
                return;
            default:
                this.v = tsVar;
                return;
        }
    }
}
