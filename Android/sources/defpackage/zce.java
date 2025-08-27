package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zce  reason: default package */
public final class zce extends AtomicReference implements mq4 {
    public final gce a;

    public zce(gce gce, ade ade) {
        this.a = gce;
        lazySet(ade);
    }

    public final void dispose() {
        ade ade = (ade) getAndSet((Object) null);
        if (ade != null) {
            ade.p(this);
        }
    }

    public final boolean f() {
        return get() == null;
    }
}
