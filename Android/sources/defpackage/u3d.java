package defpackage;

import java.util.concurrent.Executor;

/* renamed from: u3d  reason: default package */
public final class u3d implements xvb {
    public final Executor a;
    public final p7d b;
    public final xvb c;
    public final boolean d;
    public final ta7 e;

    public u3d(Executor executor, p7d p7d, xvb xvb, boolean z, ta7 ta7) {
        executor.getClass();
        this.a = executor;
        p7d.getClass();
        this.b = p7d;
        this.c = xvb;
        ta7.getClass();
        this.e = ta7;
        this.d = z;
    }

    public final void a(zi0 zi0, yvb yvb) {
        this.c.a(new t3d(this, zi0, yvb, this.d, this.e), yvb);
    }
}
