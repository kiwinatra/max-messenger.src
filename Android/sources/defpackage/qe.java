package defpackage;

/* renamed from: qe  reason: default package */
public abstract class qe {
    public static final lfd a;

    static {
        try {
            lfd lfd = (lfd) new oe(0).call();
            if (lfd != null) {
                a = lfd;
                return;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw p95.f(th);
        }
    }

    public static lfd a() {
        lfd lfd = a;
        if (lfd != null) {
            return lfd;
        }
        throw new NullPointerException("scheduler == null");
    }
}
