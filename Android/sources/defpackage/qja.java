package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qja  reason: default package */
public final class qja extends AtomicReference implements Runnable, qk3 {
    public final sja a;
    public long b;
    public boolean c;
    public boolean o;

    public qja(sja sja) {
        this.a = sja;
    }

    public final void accept(Object obj) {
        qq4.c(this, (mq4) obj);
        synchronized (this.a) {
            try {
                if (this.o) {
                    this.a.a.F();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void run() {
        this.a.E(this);
    }
}
