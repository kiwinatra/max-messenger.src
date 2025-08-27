package defpackage;

import android.os.Handler;

/* renamed from: gw6  reason: default package */
public final class gw6 implements Runnable, mq4 {
    public final /* synthetic */ int a = 0;
    public final Runnable b;
    public volatile boolean c;
    public final Object o;

    public gw6(Handler handler, Runnable runnable) {
        this.o = handler;
        this.b = runnable;
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                ((Handler) this.o).removeCallbacks(this);
                this.c = true;
                return;
            default:
                this.c = true;
                ((jfd) this.o).dispose();
                return;
        }
    }

    public final boolean f() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    this.b.run();
                    return;
                } catch (Throwable th) {
                    n54.D(th);
                    return;
                }
            default:
                if (!this.c) {
                    try {
                        this.b.run();
                        return;
                    } catch (Throwable th2) {
                        dispose();
                        n54.D(th2);
                        throw th2;
                    }
                } else {
                    return;
                }
        }
    }

    public gw6(Runnable runnable, jfd jfd) {
        this.b = runnable;
        this.o = jfd;
    }
}
