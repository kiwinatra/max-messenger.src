package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: a2  reason: default package */
public class a2 implements Iterator {
    public final /* synthetic */ int a = 0;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object o;

    public a2(i2 i2Var) {
        Iterator it;
        this.o = i2Var;
        Collection collection = i2Var.b;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public void a() {
        i2 i2Var = (i2) this.o;
        i2Var.d();
        if (i2Var.b != ((Collection) this.c)) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b.hasNext();
            case 1:
                return this.b.hasNext();
            default:
                a();
                return this.b.hasNext();
        }
    }

    public final Object next() {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.b.next();
                this.c = (Collection) entry.getValue();
                return ((b2) this.o).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.b.next();
                this.c = entry2;
                return entry2.getKey();
            default:
                a();
                return this.b.next();
        }
    }

    public final void remove() {
        switch (this.a) {
            case 0:
                if (((Collection) this.c) != null) {
                    this.b.remove();
                    ((b2) this.o).o.v -= ((Collection) this.c).size();
                    ((Collection) this.c).clear();
                    this.c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 1:
                Map.Entry entry = (Map.Entry) this.c;
                if (entry != null) {
                    Collection collection = (Collection) entry.getValue();
                    this.b.remove();
                    ((c2) this.o).b.v -= collection.size();
                    collection.clear();
                    this.c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            default:
                this.b.remove();
                i2 i2Var = (i2) this.o;
                x1 x1Var = i2Var.v;
                x1Var.v--;
                i2Var.e();
                return;
        }
    }

    public a2(i2 i2Var, ListIterator listIterator) {
        this.o = i2Var;
        this.c = i2Var.b;
        this.b = listIterator;
    }

    public a2(c2 c2Var, Iterator it) {
        this.o = c2Var;
        this.b = it;
    }

    public a2(b2 b2Var) {
        this.o = b2Var;
        this.b = b2Var.c.entrySet().iterator();
    }
}
