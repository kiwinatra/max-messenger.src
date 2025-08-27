package defpackage;

/* renamed from: hfd  reason: default package */
public final class hfd implements mq4, Runnable {
    public final Runnable a;
    public final jfd b;
    public Thread c;

    public hfd(Runnable runnable, jfd jfd) {
        this.a = runnable;
        this.b = jfd;
    }

    public final void dispose() {
        if (this.c == Thread.currentThread()) {
            jfd jfd = this.b;
            if (jfd instanceof c9a) {
                c9a c9a = (c9a) jfd;
                if (!c9a.b) {
                    c9a.b = true;
                    c9a.a.shutdown();
                    return;
                }
                return;
            }
        }
        this.b.dispose();
    }

    public final boolean f() {
        return this.b.f();
    }

    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.a.run();
            dispose();
            this.c = null;
        } catch (Throwable th) {
            dispose();
            this.c = null;
            throw th;
        }
    }
}
