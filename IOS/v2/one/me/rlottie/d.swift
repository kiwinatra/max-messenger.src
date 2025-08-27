package one.me.rlottie;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

public final class d extends Thread {
    public static int w;
    public volatile Handler a = null;
    public final CountDownLatch b = new CountDownLatch(1);
    public long c;
    public final int o;
    public final int v;

    public d(String str) {
        int i = w;
        w = i + 1;
        this.o = i;
        this.v = -1000;
        setName(str);
        start();
    }

    public final void a(Runnable runnable) {
        this.c = SystemClock.elapsedRealtime();
        try {
            this.b.await();
        } catch (Exception e) {
            RLottie.getLogger().e(e);
        }
        this.a.post(runnable);
    }

    public final void run() {
        Looper.prepare();
        this.a = new Handler(Looper.myLooper(), new xp4(0, this));
        this.b.countDown();
        int i = this.v;
        if (i != -1000) {
            Process.setThreadPriority(i);
        }
        Looper.loop();
    }
}
