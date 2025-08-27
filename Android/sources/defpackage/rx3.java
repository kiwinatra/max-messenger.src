package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.CountDownLatch;

/* renamed from: rx3  reason: default package */
public final class rx3 {
    public volatile boolean a;
    public final Object b;
    public final Object c;
    public final Object d;

    public rx3(String str) {
        this.d = new CountDownLatch(1);
        HandlerThread handlerThread = new HandlerThread(str);
        this.c = handlerThread;
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
        this.a = true;
    }

    public static void b(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void a(Runnable runnable) {
        if (this.a) {
            ((Handler) this.b).removeCallbacksAndMessages((Object) null);
            ((Handler) this.b).post(new ir1(17, this, runnable));
            ((HandlerThread) this.c).quitSafely();
            this.a = false;
        }
    }

    public void c(Runnable runnable) {
        ((Handler) this.b).post(runnable);
    }

    public rx3() {
        this.b = new ekd(19);
        this.c = new LinkedHashMap();
        this.d = new LinkedHashSet();
    }
}
