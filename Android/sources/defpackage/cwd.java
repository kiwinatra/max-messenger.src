package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: cwd  reason: default package */
public final class cwd implements dwd {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final dwd b;

    public cwd(dwd dwd) {
        this.b = dwd;
    }

    public final void a(fwd fwd) {
        if (!this.a.get()) {
            this.b.a(fwd);
        }
    }

    public final void b() {
        this.a.set(true);
    }
}
