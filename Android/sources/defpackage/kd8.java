package defpackage;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: kd8  reason: default package */
public abstract class kd8 implements mq4 {
    public final AtomicBoolean a = new AtomicBoolean();

    public abstract void a();

    public final void dispose() {
        if (!this.a.compareAndSet(false, true)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a();
        } else {
            qe.a().c(new y86(21, (Object) this));
        }
    }

    public final boolean f() {
        return this.a.get();
    }
}
