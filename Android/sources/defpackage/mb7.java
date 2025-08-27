package defpackage;

import java.io.Serializable;

/* renamed from: mb7  reason: default package */
public final class mb7 extends l2 implements Serializable {
    public final Object a;
    public final Object b;

    public mb7(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        return this.b;
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
