package defpackage;

/* renamed from: js7  reason: default package */
public final class js7 implements m9c {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile m9c b;

    public js7(m9c m9c) {
        this.b = m9c;
    }

    public final Object get() {
        Object obj = this.a;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.a;
                    if (obj == obj2) {
                        obj = this.b.get();
                        this.a = obj;
                        this.b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
