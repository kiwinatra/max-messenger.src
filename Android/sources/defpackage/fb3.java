package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fb3  reason: default package */
public final class fb3 extends AtomicReference implements mq4, Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ fb3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                qq4.a(this);
                return;
            default:
                qq4.a(this);
                return;
        }
    }

    public final boolean f() {
        switch (this.a) {
            case 0:
                return qq4.b((mq4) get());
            default:
                return get() == qq4.a;
        }
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((ya3) this.b).b();
                return;
            default:
                if (!f()) {
                    cla cla = (cla) this.b;
                    cla.d(0L);
                    lazySet(p45.a);
                    cla.b();
                    return;
                }
                return;
        }
    }
}
