package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: hbd  reason: default package */
public final class hbd extends AtomicLong implements ThreadFactory {
    public final String a;
    public final int b;
    public final boolean c;

    public hbd(String str) {
        this(str, 5, false);
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.a + '-' + incrementAndGet();
        Thread yxVar = this.c ? new yx(runnable, str, 2) : new Thread(runnable, str);
        yxVar.setPriority(this.b);
        yxVar.setDaemon(true);
        return yxVar;
    }

    public final String toString() {
        return wj6.n(new StringBuilder("RxThreadFactory["), this.a, "]");
    }

    public hbd(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }
}
