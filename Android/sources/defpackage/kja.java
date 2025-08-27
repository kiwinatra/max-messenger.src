package defpackage;

/* renamed from: kja  reason: default package */
public final class kja extends vl0 implements cla, Runnable {
    public int X;
    public boolean Y;
    public final cla a;
    public final jfd b;
    public final boolean c = false;
    public final int o;
    public gbe v;
    public mq4 w;
    public Throwable x;
    public volatile boolean y;
    public volatile boolean z;

    public kja(cla cla, jfd jfd, int i) {
        this.a = cla;
        this.b = jfd;
        this.o = i;
    }

    public final void b() {
        if (!this.y) {
            this.y = true;
            if (getAndIncrement() == 0) {
                this.b.a(this);
            }
        }
    }

    public final void c(mq4 mq4) {
        if (qq4.g(this.w, mq4)) {
            this.w = mq4;
            if (mq4 instanceof xac) {
                xac xac = (xac) mq4;
                int p = xac.p(7);
                if (p == 1) {
                    this.X = p;
                    this.v = xac;
                    this.y = true;
                    this.a.c(this);
                    if (getAndIncrement() == 0) {
                        this.b.a(this);
                        return;
                    }
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

    public final void clear() {
        this.v.clear();
    }

    public final void d(Object obj) {
        if (!this.y) {
            if (this.X != 2) {
                this.v.offer(obj);
            }
            if (getAndIncrement() == 0) {
                this.b.a(this);
            }
        }
    }

    public final void dispose() {
        if (!this.z) {
            this.z = true;
            this.w.dispose();
            this.b.dispose();
            if (!this.Y && getAndIncrement() == 0) {
                this.v.clear();
            }
        }
    }

    public final boolean e(boolean z2, boolean z3, cla cla) {
        if (this.z) {
            this.v.clear();
            return true;
        } else if (!z2) {
            return false;
        } else {
            Throwable th = this.x;
            if (this.c) {
                if (!z3) {
                    return false;
                }
                this.z = true;
                if (th != null) {
                    cla.onError(th);
                } else {
                    cla.b();
                }
                this.b.dispose();
                return true;
            } else if (th != null) {
                this.z = true;
                this.v.clear();
                cla.onError(th);
                this.b.dispose();
                return true;
            } else if (!z3) {
                return false;
            } else {
                this.z = true;
                cla.b();
                this.b.dispose();
                return true;
            }
        }
    }

    public final boolean f() {
        return this.z;
    }

    public final boolean isEmpty() {
        return this.v.isEmpty();
    }

    public final void onError(Throwable th) {
        if (this.y) {
            n54.D(th);
            return;
        }
        this.x = th;
        this.y = true;
        if (getAndIncrement() == 0) {
            this.b.a(this);
        }
    }

    public final int p(int i) {
        this.Y = true;
        return 2;
    }

    public final Object poll() {
        return this.v.poll();
    }

    public final void run() {
        if (this.Y) {
            int i = 1;
            while (!this.z) {
                boolean z2 = this.y;
                Throwable th = this.x;
                if (this.c || !z2 || th == null) {
                    this.a.d((Object) null);
                    if (z2) {
                        this.z = true;
                        Throwable th2 = this.x;
                        if (th2 != null) {
                            this.a.onError(th2);
                        } else {
                            this.a.b();
                        }
                        this.b.dispose();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    this.z = true;
                    this.a.onError(this.x);
                    this.b.dispose();
                    return;
                }
            }
            return;
        }
        gbe gbe = this.v;
        cla cla = this.a;
        int i2 = 1;
        while (!e(this.y, gbe.isEmpty(), cla)) {
            while (true) {
                boolean z3 = this.y;
                try {
                    Object poll = gbe.poll();
                    boolean z4 = poll == null;
                    if (!e(z3, z4, cla)) {
                        if (z4) {
                            i2 = addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        } else {
                            cla.d(poll);
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th3) {
                    hd8.Z(th3);
                    this.z = true;
                    this.w.dispose();
                    gbe.clear();
                    cla.onError(th3);
                    this.b.dispose();
                    return;
                }
            }
        }
    }
}
