package defpackage;

/* renamed from: y2f  reason: default package */
public final class y2f implements s2f {
    public static final ad3 c = new ad3(5);
    public volatile s2f a;
    public Object b;

    public final Object get() {
        s2f s2f = this.a;
        ad3 ad3 = c;
        if (s2f != ad3) {
            synchronized (this) {
                try {
                    if (this.a != ad3) {
                        Object obj = this.a.get();
                        this.b = obj;
                        this.a = ad3;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.b;
    }

    public final String toString() {
        Object obj = this.a;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == c) {
            obj = "<supplier that returned " + this.b + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
