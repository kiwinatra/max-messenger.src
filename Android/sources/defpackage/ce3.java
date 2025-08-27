package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMutableIterator;

/* renamed from: ce3  reason: default package */
public final class ce3 implements Iterator, KMutableIterator {
    public final Function2 a;
    public int b = -1;
    public Object c;
    public Object o;
    public final /* synthetic */ de3 v;

    public ce3(de3 de3, Function2 function2) {
        this.v = de3;
        this.a = function2;
        a();
    }

    public final void a() {
        Object obj;
        while (true) {
            int i = this.b + 1;
            this.b = i;
            de3 de3 = this.v;
            if (i < de3.a) {
                yw6 yw6 = (yw6) de3.d.get(i);
                if (!(yw6 == null || (obj = yw6.get()) == null)) {
                    this.c = obj;
                    Object obj2 = de3.e.get(this.b);
                    if (obj2 instanceof lf8) {
                        obj2 = ((lf8) obj2).a;
                    }
                    if (obj2 != null) {
                        this.o = obj2;
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final boolean hasNext() {
        return this.b < this.v.a;
    }

    public final Object next() {
        if (this.b < this.v.a) {
            Object obj = this.c;
            if (obj == null) {
                obj = Unit.INSTANCE;
            }
            Object obj2 = this.o;
            if (obj2 == null) {
                obj2 = Unit.INSTANCE;
            }
            Object invoke = this.a.invoke(obj, obj2);
            a();
            return invoke;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("not implemented");
    }
}
