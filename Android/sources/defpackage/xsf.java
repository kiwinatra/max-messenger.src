package defpackage;

import java.util.ArrayDeque;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractIterator;

/* renamed from: xsf  reason: default package */
public final class xsf extends AbstractIterator {
    public final ArrayDeque a;
    public final /* synthetic */ zsf b;

    public xsf(zsf zsf) {
        this.b = zsf;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.a = arrayDeque;
        if (zsf.b.invoke(zsf.a) != null) {
            arrayDeque.push(a(zsf.a));
            if (zsf.c == veg.b) {
                arrayDeque.push(new vsf(this, zsf.a));
                return;
            }
            return;
        }
        arrayDeque.push(new vsf(this, zsf.a));
    }

    public final ssf a(Object obj) {
        int ordinal = this.b.c.ordinal();
        if (ordinal == 0) {
            return new wsf(this, obj);
        }
        if (ordinal == 1) {
            return new tsf(this, obj);
        }
        if (ordinal == 2) {
            return new usf(this, obj);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void computeNext() {
        Object obj;
        Object a2;
        while (true) {
            ArrayDeque arrayDeque = this.a;
            ysf ysf = (ysf) arrayDeque.peek();
            if (ysf != null) {
                a2 = ysf.a();
                if (a2 != null) {
                    zsf zsf = this.b;
                    veg veg = zsf.c;
                    veg veg2 = veg.b;
                    int i = zsf.g;
                    Object obj2 = ysf.a;
                    if (veg != veg2) {
                        if (a2 == obj2 || zsf.b.invoke(a2) == null || arrayDeque.size() >= i) {
                            break;
                        }
                        arrayDeque.push(a(a2));
                    } else if (a2 != obj2 && arrayDeque.size() < i) {
                        arrayDeque.add(a(a2));
                    }
                } else {
                    arrayDeque.pop();
                }
            } else {
                obj = null;
                break;
            }
        }
        obj = a2;
        if (obj != null) {
            setNext(obj);
        } else {
            done();
        }
    }
}
