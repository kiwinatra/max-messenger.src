package defpackage;

import java.lang.Thread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: n2b  reason: default package */
public final class n2b implements ThreadFactory {
    public final String a;
    public final Thread.UncaughtExceptionHandler b;
    public final int c;
    public final nif o;
    public final AtomicInteger v = new AtomicInteger(1);

    public n2b(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i, nif nif) {
        this.a = str;
        this.b = uncaughtExceptionHandler;
        this.c = i;
        this.o = nif;
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.v.getAndIncrement();
        yx yxVar = new yx(runnable, this.a + "-" + andIncrement, 1);
        yxVar.setUncaughtExceptionHandler(this.b);
        int i = this.c;
        yxVar.setPriority(i);
        this.o.a(i);
        return yxVar;
    }
}
