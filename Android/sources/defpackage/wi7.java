package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: wi7  reason: default package */
public final class wi7 extends ConcurrentHashMap {
    public static final wi7 b = new wi7();
    public final Object a = new Object();

    public wi7() {
        super(180, 0.8f, 4);
    }

    public final String a(String str) {
        String str2 = (String) get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.a) {
                try {
                    if (size() >= 180) {
                        clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        String intern = str.intern();
        put(intern, intern);
        return intern;
    }
}
