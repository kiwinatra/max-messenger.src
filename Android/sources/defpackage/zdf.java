package defpackage;

/* renamed from: zdf  reason: default package */
public final class zdf extends ndf {
    public final Runnable c;

    public zdf(Runnable runnable, long j, jq5 jq5) {
        super(j, jq5);
        this.c = runnable;
    }

    public final void run() {
        try {
            this.c.run();
        } finally {
            this.b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(n79.A(runnable));
        sb.append(", ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(']');
        return sb.toString();
    }
}
