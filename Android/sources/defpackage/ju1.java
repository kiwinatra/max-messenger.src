package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ju1  reason: default package */
public final class ju1 implements Executor {
    public static final j40 c = new j40(1);
    public final Object a = new Object();
    public ThreadPoolExecutor b;

    public ju1() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), c);
        threadPoolExecutor.setRejectedExecutionHandler(new iu1(0));
        this.b = threadPoolExecutor;
    }

    public final void a(vf2 vf2) {
        ThreadPoolExecutor threadPoolExecutor;
        vf2.getClass();
        synchronized (this.a) {
            try {
                if (this.b.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), c);
                    threadPoolExecutor2.setRejectedExecutionHandler(new iu1(0));
                    this.b = threadPoolExecutor2;
                }
                threadPoolExecutor = this.b;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        int max = Math.max(1, new LinkedHashSet((ArrayList) vf2.g).size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.a) {
            this.b.execute(runnable);
        }
    }
}
