package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: nbe  reason: default package */
public final class nbe extends AtomicBoolean implements mq4 {
    public final gce a;
    public final obe b;

    public nbe(gce gce, obe obe) {
        this.a = gce;
        this.b = obe;
    }

    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.b.p(this);
        }
    }

    public final boolean f() {
        return get();
    }
}
