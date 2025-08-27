package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: vha  reason: default package */
public final class vha extends AtomicInteger implements cla, mq4 {
    public int X;
    public final cla a;
    public final zi6 b;
    public final tha c;
    public final int o;
    public gbe v;
    public mq4 w;
    public volatile boolean x;
    public volatile boolean y;
    public volatile boolean z;

    public vha(btd btd, zi6 zi6, int i) {
        this.a = btd;
        this.b = zi6;
        this.o = i;
        this.c = new tha(btd, this, 1);
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            while (!this.y) {
                if (!this.x) {
                    boolean z2 = this.z;
                    try {
                        Object poll = this.v.poll();
                        boolean z3 = poll == null;
                        if (z2 && z3) {
                            this.y = true;
                            this.a.b();
                            return;
                        } else if (!z3) {
                            try {
                                Object apply = this.b.apply(poll);
                                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                                oka oka = (oka) apply;
                                this.x = true;
                                oka.a(this.c);
                            } catch (Throwable th) {
                                hd8.Z(th);
                                dispose();
                                this.v.clear();
                                this.a.onError(th);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        hd8.Z(th2);
                        dispose();
                        this.v.clear();
                        this.a.onError(th2);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.v.clear();
        }
    }

    public final void b() {
        if (!this.z) {
            this.z = true;
            a();
        }
    }

    public final void c(mq4 mq4) {
        if (qq4.g(this.w, mq4)) {
            this.w = mq4;
            if (mq4 instanceof xac) {
                xac xac = (xac) mq4;
                int p = xac.p(3);
                if (p == 1) {
                    this.X = p;
                    this.v = xac;
                    this.z = true;
                    this.a.c(this);
                    a();
                    return;
                } else if (p == 2) {
                    this.X = p;
                    this.v = xac;
                    this.a.c(this);
                    return;
                }
            }
            this.v = new the(this.o);
            this.a.c(this);
        }
    }

    public final void d(Object obj) {
        if (!this.z) {
            if (this.X == 0) {
                this.v.offer(obj);
            }
            a();
        }
    }

    public final void dispose() {
        this.y = true;
        tha tha = this.c;
        tha.getClass();
        qq4.a(tha);
        this.w.dispose();
        if (getAndIncrement() == 0) {
            this.v.clear();
        }
    }

    public final boolean f() {
        return this.y;
    }

    public final void onError(Throwable th) {
        if (this.z) {
            n54.D(th);
            return;
        }
        this.z = true;
        dispose();
        this.a.onError(th);
    }
}
