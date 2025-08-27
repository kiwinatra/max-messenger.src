package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: kcf  reason: default package */
public class kcf {
    public static final jcf b = new kcf();
    public final AtomicBoolean a = new AtomicBoolean(false);

    public void a(Runnable runnable) {
        if (this.a.compareAndSet(false, true)) {
            runnable.run();
        }
    }
}
