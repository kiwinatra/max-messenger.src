package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: ep4  reason: default package */
public final class ep4 implements Executor {
    public static volatile ep4 b;
    public static final /* synthetic */ ep4 c = new ep4(1);
    public static final /* synthetic */ ep4 o = new ep4(2);
    public static final /* synthetic */ ep4 v = new ep4(7);
    public final /* synthetic */ int a;

    public /* synthetic */ ep4(int i) {
        this.a = i;
    }

    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                return;
            case 1:
                runnable.run();
                return;
            case 2:
                runnable.run();
                return;
            case 3:
                new Handler(Looper.getMainLooper()).post(runnable);
                return;
            case 4:
                new Thread(runnable).start();
                return;
            case 5:
                runnable.run();
                return;
            case 6:
                runnable.run();
                return;
            case 7:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
