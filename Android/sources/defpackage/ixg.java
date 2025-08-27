package defpackage;

/* renamed from: ixg  reason: default package */
public final class ixg implements kxg {
    public static final Object c = new Object();
    public volatile kxg a;
    public volatile Object b;

    /* JADX WARNING: type inference failed for: r0v1, types: [ixg, java.lang.Object, kxg] */
    public static kxg a(kxg kxg) {
        if (kxg instanceof ixg) {
            return kxg;
        }
        ? obj = new Object();
        obj.b = c;
        obj.a = kxg;
        return obj;
    }

    public final Object y() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.b;
                    if (obj == obj2) {
                        obj = this.a.y();
                        Object obj3 = this.b;
                        if (obj3 != obj2) {
                            if (obj3 != obj) {
                                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                            }
                        }
                        this.b = obj;
                        this.a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
