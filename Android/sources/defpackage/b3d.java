package defpackage;

import android.os.Process;

/* renamed from: b3d  reason: default package */
public final class b3d extends Thread {
    public final int a;

    public b3d(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.a = i;
    }

    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
