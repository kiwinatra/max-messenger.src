package defpackage;

import javax.inject.Provider;

/* renamed from: gr4  reason: default package */
public final class gr4 implements Provider {
    public static final Object c = new Object();
    public volatile Provider a;
    public volatile Object b;

    /* JADX WARNING: type inference failed for: r0v1, types: [javax.inject.Provider, gr4, java.lang.Object] */
    public static Provider a(Provider provider) {
        if (provider instanceof gr4) {
            return provider;
        }
        ? obj = new Object();
        obj.b = c;
        obj.a = provider;
        return obj;
    }

    public final Object get() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.b;
                    if (obj == obj2) {
                        obj = this.a.get();
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
