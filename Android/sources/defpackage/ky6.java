package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: ky6  reason: default package */
public final class ky6 implements Executor {
    public static volatile ky6 c;
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public ky6(int i) {
        this.a = i;
        switch (i) {
            case 1:
                return;
            default:
                this.b = Executors.newSingleThreadExecutor(new Object());
                return;
        }
    }

    public void a() {
        ThreadLocal threadLocal = (ThreadLocal) this.b;
        Integer num = (Integer) threadLocal.get();
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue() - 1;
        if (intValue == 0) {
            threadLocal.remove();
        } else {
            threadLocal.set(Integer.valueOf(intValue));
        }
    }

    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((ExecutorService) this.b).execute(runnable);
                return;
            case 1:
                ThreadLocal threadLocal = (ThreadLocal) this.b;
                Integer num = (Integer) threadLocal.get();
                if (num == null) {
                    num = 0;
                }
                int intValue = num.intValue() + 1;
                threadLocal.set(Integer.valueOf(intValue));
                if (intValue <= 15) {
                    try {
                        runnable.run();
                    } finally {
                        a();
                    }
                } else {
                    fq0.d.a.execute(runnable);
                }
                return;
            default:
                ((Handler) ((g6d) this.b).c).post(runnable);
                return;
        }
    }

    public ky6(g6d g6d) {
        this.a = 2;
        this.b = g6d;
    }
}
