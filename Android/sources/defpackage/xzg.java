package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: xzg  reason: default package */
public final class xzg {
    public static volatile xzg b;
    public final Map a = Collections.emptyMap();

    static {
        new xzg();
    }

    public static xzg a() {
        xzg xzg = b;
        if (xzg != null) {
            return xzg;
        }
        synchronized (xzg.class) {
            try {
                xzg xzg2 = b;
                if (xzg2 != null) {
                    return xzg2;
                }
                xzg S = b0h.S();
                b = S;
                return S;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
