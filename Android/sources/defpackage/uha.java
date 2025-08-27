package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: uha  reason: default package */
public final class uha extends AtomicInteger implements cla, mq4 {
    public volatile boolean X;
    public volatile boolean Y;
    public int Z;
    public final cla a;
    public final zi6 b;
    public final int c;
    public final fz o = new AtomicReference();
    public final tha v;
    public final boolean w;
    public gbe x;
    public mq4 y;
    public volatile boolean z;

    /* JADX WARNING: type inference failed for: r2v1, types: [fz, java.util.concurrent.atomic.AtomicReference] */
    public uha(cla cla, zi6 zi6, int i, boolean z2) {
        this.a = cla;
        this.b = zi6;
        this.c = i;
        this.w = z2;
        this.v = new tha(cla, this, 0);
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            cla cla = this.a;
            gbe gbe = this.x;
            fz fzVar = this.o;
            while (true) {
                if (!this.z) {
                    if (this.Y) {
                        gbe.clear();
                        return;
                    } else if (this.w || ((Throwable) fzVar.get()) == null) {
                        boolean z2 = this.X;
                        try {
                            Object poll = gbe.poll();
                            boolean z3 = poll == null;
                            if (z2 && z3) {
                                this.Y = true;
                                fzVar.d(cla);
                                return;
                            } else if (!z3) {
                                try {
                                    Object apply = this.b.apply(poll);
                                    Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                                    oka oka = (oka) apply;
                                    if (oka instanceof t2f) {
                                        try {
                                            Object obj = ((t2f) oka).get();
                                            if (obj != null && !this.Y) {
                                                cla.d(obj);
                                            }
                                        } catch (Throwable th) {
                                            hd8.Z(th);
                                            fzVar.a(th);
                                        }
                                    } else {
                                        this.z = true;
                                        oka.a(this.v);
                                    }
                                } catch (Throwable th2) {
                                    hd8.Z(th2);
                                    this.Y = true;
                                    this.y.dispose();
                                    gbe.clear();
                                    fzVar.a(th2);
                                    fzVar.d(cla);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            hd8.Z(th3);
                            this.Y = true;
                            this.y.dispose();
                            fzVar.a(th3);
                            fzVar.d(cla);
                            return;
                        }
                    } else {
                        gbe.clear();
                        this.Y = true;
                        fzVar.d(cla);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public final void b() {
        this.X = true;
        a();
    }

    public final void c(mq4 mq4) {
        if (qq4.g(this.y, mq4)) {
            this.y = mq4;
            if (mq4 instanceof xac) {
                xac xac = (xac) mq4;
                int p = xac.p(3);
                if (p == 1) {
                    this.Z = p;
                    this.x = xac;
                    this.X = true;
                    this.a.c(this);
                    a();
                    return;
                } else if (p == 2) {
                    this.Z = p;
                    this.x = xac;
                    this.a.c(this);
                    return;
                }
            }
            this.x = new the(this.c);
            this.a.c(this);
        }
    }

    public final void d(Object obj) {
        if (this.Z == 0) {
            this.x.offer(obj);
        }
        a();
    }

    public final void dispose() {
        this.Y = true;
        this.y.dispose();
        tha tha = this.v;
        tha.getClass();
        qq4.a(tha);
        this.o.b();
    }

    public final boolean f() {
        return this.Y;
    }

    public final void onError(Throwable th) {
        if (this.o.a(th)) {
            this.X = true;
            a();
        }
    }
}
