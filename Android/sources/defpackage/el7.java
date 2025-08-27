package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* renamed from: el7  reason: default package */
public final class el7 extends dn7 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater w = AtomicIntegerFieldUpdater.newUpdater(el7.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final Function1 v;

    public el7(f fVar) {
        this.v = fVar;
    }

    public final boolean h() {
        return true;
    }

    public final void i(Throwable th) {
        if (w.compareAndSet(this, 0, 1)) {
            this.v.invoke(th);
        }
    }
}
