package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xha  reason: default package */
public final class xha extends AtomicInteger implements cla, mq4 {
    public final bw5 X;
    public Object Y;
    public volatile int Z;
    public final fz a = new AtomicReference();
    public final int b = 2;
    public final int c = 1;
    public gbe o;
    public mq4 v;
    public volatile boolean w;
    public volatile boolean x;
    public final cla y;
    public final zi6 z;

    /* JADX WARNING: type inference failed for: r0v1, types: [fz, java.util.concurrent.atomic.AtomicReference] */
    public xha(cla cla, zi6 zi6) {
        this.y = cla;
        this.z = zi6;
        this.X = new bw5(1, this);
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            cla cla = this.y;
            int i = this.c;
            gbe gbe = this.o;
            fz fzVar = this.a;
            int i2 = 1;
            while (true) {
                if (this.x) {
                    gbe.clear();
                    this.Y = null;
                } else {
                    int i3 = this.Z;
                    if (fzVar.get() == null || !(i == 1 || (i == 2 && i3 == 0))) {
                        boolean z2 = false;
                        if (i3 == 0) {
                            boolean z3 = this.w;
                            try {
                                Object poll = gbe.poll();
                                if (poll == null) {
                                    z2 = true;
                                }
                                if (z3 && z2) {
                                    fzVar.d(cla);
                                    return;
                                } else if (!z2) {
                                    try {
                                        Object apply = this.z.apply(poll);
                                        Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                                        lbe lbe = (lbe) apply;
                                        this.Z = 1;
                                        lbe.l(this.X);
                                    } catch (Throwable th) {
                                        hd8.Z(th);
                                        this.v.dispose();
                                        gbe.clear();
                                        fzVar.a(th);
                                        fzVar.d(cla);
                                        return;
                                    }
                                }
                            } catch (Throwable th2) {
                                hd8.Z(th2);
                                this.x = true;
                                this.v.dispose();
                                fzVar.a(th2);
                                fzVar.d(cla);
                                return;
                            }
                        } else if (i3 == 2) {
                            Object obj = this.Y;
                            this.Y = null;
                            cla.d(obj);
                            this.Z = 0;
                        }
                    }
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
            gbe.clear();
            this.Y = null;
            fzVar.d(cla);
        }
    }

    public final void b() {
        this.w = true;
        a();
    }

    public final void c(mq4 mq4) {
        if (qq4.g(this.v, mq4)) {
            this.v = mq4;
            if (mq4 instanceof xac) {
                xac xac = (xac) mq4;
                int p = xac.p(7);
                if (p == 1) {
                    this.o = xac;
                    this.w = true;
                    this.y.c(this);
                    a();
                    return;
                } else if (p == 2) {
                    this.o = xac;
                    this.y.c(this);
                    return;
                }
            }
            this.o = new the(this.b);
            this.y.c(this);
        }
    }

    public final void d(Object obj) {
        if (obj != null) {
            this.o.offer(obj);
        }
        a();
    }

    public final void dispose() {
        this.x = true;
        this.v.dispose();
        bw5 bw5 = this.X;
        bw5.getClass();
        qq4.a(bw5);
        this.a.b();
        if (getAndIncrement() == 0) {
            this.o.clear();
            this.Y = null;
        }
    }

    public final boolean f() {
        return this.x;
    }

    public final void onError(Throwable th) {
        if (this.a.a(th)) {
            if (this.c == 1) {
                bw5 bw5 = this.X;
                bw5.getClass();
                qq4.a(bw5);
            }
            this.w = true;
            a();
        }
    }
}
