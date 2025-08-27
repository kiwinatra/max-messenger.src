package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: cac  reason: default package */
public final class cac extends AtomicBoolean implements mq4 {
    public final cla a;
    public final dac b;

    public cac(cla cla, dac dac) {
        this.a = cla;
        this.b = dac;
    }

    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.b.H(this);
        }
    }

    public final boolean f() {
        return get();
    }
}
