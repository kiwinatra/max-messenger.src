package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: j5a  reason: default package */
public final class j5a implements ThreadFactory {
    public final /* synthetic */ int a;
    public final String b;
    public final Object c;

    public j5a(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = str;
                this.c = new AtomicInteger(1);
                return;
            default:
                this.c = Executors.defaultThreadFactory();
                this.b = str;
                return;
        }
    }

    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.c).newThread(new zbd(runnable, 3));
                newThread.setName(this.b);
                return newThread;
            default:
                sx8 sx8 = new sx8(28, this, runnable);
                int andIncrement = ((AtomicInteger) this.c).getAndIncrement();
                return new Thread(sx8, this.b + "-" + andIncrement);
        }
    }
}
