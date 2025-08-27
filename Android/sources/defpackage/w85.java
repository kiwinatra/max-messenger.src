package defpackage;

/* renamed from: w85  reason: default package */
public final class w85 extends x85 {
    public final Runnable c;

    public w85(long j, Runnable runnable) {
        super(j);
        this.c = runnable;
    }

    public final void run() {
        this.c.run();
    }

    public final String toString() {
        return super.toString() + this.c;
    }
}
