package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: il7  reason: default package */
public final class il7 implements Executor {
    public static volatile il7 c;
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ il7(Handler handler) {
        this.a = 2;
        this.b = handler;
    }

    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((ExecutorService) this.b).execute(runnable);
                return;
            case 1:
                ((ws9) this.b).post(runnable);
                return;
            default:
                ((Handler) this.b).post(runnable);
                return;
        }
    }

    public il7(Looper looper) {
        this.a = 1;
        this.b = new ws9(looper, 5);
    }

    public il7() {
        this.a = 0;
        this.b = Executors.newFixedThreadPool(2, new j40(3));
    }
}
