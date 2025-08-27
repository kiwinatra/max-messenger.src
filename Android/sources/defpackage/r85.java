package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: r85  reason: default package */
public final class r85 implements qye, fac {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public r85() {
        wuf wuf = wuf.a;
        this.c = wuf;
    }

    public final void a(ts1 ts1) {
        Class<y64> cls = y64.class;
        Executor executor = this.c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.a.containsKey(cls)) {
                    this.a.put(cls, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(cls)).put(ts1, executor);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
