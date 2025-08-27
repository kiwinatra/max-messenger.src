package defpackage;

import android.os.Looper;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: qua  reason: default package */
public final class qua implements a67 {
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();

    public final boolean c() {
        return true;
    }

    public final void d(w78 w78, String str, String str2, Throwable th) {
        String valueOf;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.a;
        Thread currentThread = Thread.currentThread();
        if (((Looper) gif.a.getValue()).isCurrentThread()) {
            valueOf = "ui";
        } else {
            String name = currentThread.getName();
            valueOf = (name == null || name.length() == 0) ? String.valueOf(currentThread.getId()) : currentThread.getName();
        }
        concurrentLinkedQueue.add(new p78(w78, str, str2, valueOf, th));
    }
}
