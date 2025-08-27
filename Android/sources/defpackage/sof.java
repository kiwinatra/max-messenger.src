package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: sof  reason: default package */
public final /* synthetic */ class sof implements ThreadFactory {
    public final /* synthetic */ AtomicInteger a;
    public final /* synthetic */ String b;

    public /* synthetic */ sof(AtomicInteger atomicInteger, String str) {
        this.a = atomicInteger;
        this.b = str;
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.a.getAndIncrement();
        return new Thread(runnable, "tracer-io-" + this.b + '-' + andIncrement);
    }
}
