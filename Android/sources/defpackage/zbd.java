package defpackage;

import android.os.Process;

/* renamed from: zbd  reason: default package */
public final class zbd implements Runnable {
    public final /* synthetic */ int a;
    public final Runnable b;

    public /* synthetic */ zbd(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    this.b.run();
                    return;
                } catch (Exception unused) {
                    y64.u("Executor");
                    return;
                }
            case 1:
                this.b.run();
                return;
            case 2:
                this.b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.b.run();
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return this.b.toString();
            default:
                return super.toString();
        }
    }
}
