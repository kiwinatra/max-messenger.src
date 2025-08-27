package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: ui4  reason: default package */
public final class ui4 extends kne {
    public final Object o = new Object();
    public final ExecutorService p = Executors.newFixedThreadPool(4, new j40(2));
    public volatile Handler q;

    public ui4() {
        super(20);
    }

    public final boolean U() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
