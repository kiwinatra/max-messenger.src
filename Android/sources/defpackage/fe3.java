package defpackage;

import java.util.Iterator;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.functions.Function2;

/* renamed from: fe3  reason: default package */
public final class fe3 extends AbstractMutableSet {
    public final Function2 a;
    public final /* synthetic */ ge3 b;

    public fe3(ge3 ge3, Function2 function2) {
        this.b = ge3;
        this.a = function2;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("not implemented");
    }

    public final int getSize() {
        return this.b.size();
    }

    public final Iterator iterator() {
        de3 de3 = (de3) ge3.c.get(this.b);
        de3.getClass();
        return new ce3(de3, this.a);
    }
}
