package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: nja  reason: default package */
public final class nja extends AtomicReference implements mq4 {
    public final cla a;

    public nja(cla cla, oja oja) {
        this.a = cla;
        lazySet(oja);
    }

    public final void dispose() {
        oja oja = (oja) getAndSet((Object) null);
        if (oja != null) {
            oja.a(this);
        }
    }

    public final boolean f() {
        return get() == null;
    }
}
