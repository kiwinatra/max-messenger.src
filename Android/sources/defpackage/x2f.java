package defpackage;

import java.io.Serializable;

/* renamed from: x2f  reason: default package */
public final class x2f implements s2f, Serializable {
    public final s2f a;
    public volatile transient boolean b;
    public transient Object c;

    public x2f(s2f s2f) {
        this.a = s2f;
    }

    public final Object get() {
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        Object obj = this.a.get();
                        this.c = obj;
                        this.b = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.b) {
            obj = "<supplier that returned " + this.c + ">";
        } else {
            obj = this.a;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
