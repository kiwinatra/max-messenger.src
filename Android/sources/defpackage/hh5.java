package defpackage;

import java.util.HashMap;

/* renamed from: hh5  reason: default package */
public final class hh5 extends xbd {
    public final HashMap v = new HashMap();

    public final ubd b(Object obj) {
        return (ubd) this.v.get(obj);
    }

    public final Object d(Object obj, Object obj2) {
        ubd b = b(obj);
        if (b != null) {
            return b.b;
        }
        HashMap hashMap = this.v;
        ubd ubd = new ubd(obj, obj2);
        this.o++;
        ubd ubd2 = this.b;
        if (ubd2 == null) {
            this.a = ubd;
            this.b = ubd;
        } else {
            ubd2.c = ubd;
            ubd.o = ubd2;
            this.b = ubd;
        }
        hashMap.put(obj, ubd);
        return null;
    }

    public final Object e(Object obj) {
        Object e = super.e(obj);
        this.v.remove(obj);
        return e;
    }
}
