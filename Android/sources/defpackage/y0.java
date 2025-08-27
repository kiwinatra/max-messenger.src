package defpackage;

import java.util.concurrent.Executor;

/* renamed from: y0  reason: default package */
public final class y0 {
    public static final y0 d = new y0();
    public final Runnable a;
    public final Executor b;
    public y0 c;

    public y0(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }

    public y0() {
        this.a = null;
        this.b = null;
    }
}
