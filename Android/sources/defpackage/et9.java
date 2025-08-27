package defpackage;

/* renamed from: et9  reason: default package */
public final class et9 extends h1 implements Runnable {
    public final Runnable y;

    public et9(Runnable runnable) {
        runnable.getClass();
        this.y = runnable;
    }

    public final String j() {
        return "task=[" + this.y + "]";
    }

    public final void run() {
        try {
            this.y.run();
        } catch (Throwable th) {
            m(th);
            throw th;
        }
    }
}
