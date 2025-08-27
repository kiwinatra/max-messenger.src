package defpackage;

import java.util.HashMap;
import java.util.concurrent.ThreadFactory;

/* renamed from: xcf  reason: default package */
public final class xcf implements ycf {
    public final ycf a;
    public final HashMap b = new HashMap();

    public xcf(ycf ycf) {
        this.a = ycf;
    }

    public final ThreadFactory a(String str) {
        HashMap hashMap = this.b;
        ThreadFactory threadFactory = (ThreadFactory) hashMap.get(str);
        if (threadFactory != null) {
            return threadFactory;
        }
        ThreadFactory a2 = this.a.a(str);
        hashMap.put(str, a2);
        return a2;
    }
}
