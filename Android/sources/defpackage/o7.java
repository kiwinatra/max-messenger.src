package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o7  reason: default package */
public final class o7 extends AtomicReference implements mq4 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o7(int i, Object obj) {
        super(obj);
        this.a = i;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    ((x6) obj).run();
                    return;
                } catch (Throwable th) {
                    throw p95.f(th);
                }
            default:
                ((Runnable) obj).run();
                return;
        }
    }

    public final void dispose() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            a(andSet);
        }
    }

    public final boolean f() {
        return get() == null;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "ActionDisposable(disposed=" + f() + ", " + get() + ")";
            default:
                return "RunnableDisposable(disposed=" + f() + ", " + get() + ")";
        }
    }
}
