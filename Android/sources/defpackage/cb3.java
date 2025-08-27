package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cb3  reason: default package */
public final class cb3 extends AtomicReference implements mq4 {
    public final ya3 a;

    public cb3(ya3 ya3, db3 db3) {
        this.a = ya3;
        lazySet(db3);
    }

    public final void dispose() {
        db3 db3 = (db3) getAndSet((Object) null);
        if (db3 != null) {
            db3.n(this);
        }
    }

    public final boolean f() {
        return get() == null;
    }
}
