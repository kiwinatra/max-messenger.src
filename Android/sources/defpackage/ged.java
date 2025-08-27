package defpackage;

/* renamed from: ged  reason: default package */
public final class ged extends j0 implements Runnable {
    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.a.run();
            this.c = null;
        } catch (Throwable th) {
            dispose();
            this.c = null;
            n54.D(th);
            throw th;
        }
    }
}
