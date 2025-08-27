package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: tw5  reason: default package */
public final class tw5 extends AtomicLong implements gx5, rye {
    public final pye a;
    public rye b;
    public boolean c;

    public tw5(pye pye) {
        this.a = pye;
    }

    public final void b() {
        if (!this.c) {
            this.c = true;
            this.a.b();
        }
    }

    public final void cancel() {
        this.b.cancel();
    }

    public final void d(Object obj) {
        if (!this.c) {
            if (get() != 0) {
                this.a.d(obj);
                h88.P(this, 1);
                return;
            }
            this.b.cancel();
            onError(new RuntimeException("Could not emit value due to lack of requests"));
        }
    }

    public final void e(rye rye) {
        if (tye.e(this.b, rye)) {
            this.b = rye;
            this.a.e(this);
            rye.g(LongCompanionObject.MAX_VALUE);
        }
    }

    public final void g(long j) {
        if (tye.d(j)) {
            h88.c(this, j);
        }
    }

    public final void onError(Throwable th) {
        if (this.c) {
            n54.D(th);
            return;
        }
        this.c = true;
        this.a.onError(th);
    }
}
