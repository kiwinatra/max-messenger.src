package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: d9g  reason: default package */
public final /* synthetic */ class d9g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fj b;

    public /* synthetic */ d9g(fj fjVar, int i) {
        this.a = i;
        this.b = fjVar;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((AtomicInteger) this.b.c).decrementAndGet();
                return;
            default:
                ((AtomicInteger) this.b.c).incrementAndGet();
                return;
        }
    }
}
