package defpackage;

/* renamed from: rk4  reason: default package */
public abstract class rk4 extends wl0 {
    public final pye a;
    public Object b;

    public rk4(pye pye) {
        this.a = pye;
    }

    public void a(Object obj) {
        f(obj);
    }

    public final void clear() {
        lazySet(32);
        this.b = null;
    }

    public final void f(Object obj) {
        int i = get();
        do {
            pye pye = this.a;
            if (i == 8) {
                this.b = obj;
                lazySet(16);
                pye.d((Object) null);
                if (get() != 4) {
                    pye.b();
                    return;
                }
                return;
            } else if ((i & -3) == 0) {
                if (i == 2) {
                    lazySet(3);
                    pye.d(obj);
                    if (get() != 4) {
                        pye.b();
                        return;
                    }
                    return;
                }
                this.b = obj;
                if (!compareAndSet(0, 1)) {
                    i = get();
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (i != 4);
        this.b = null;
    }

    public final void g(long j) {
        Object obj;
        if (tye.d(j)) {
            do {
                int i = get();
                if ((i & -2) == 0) {
                    if (i == 1) {
                        if (compareAndSet(1, 3) && (obj = this.b) != null) {
                            this.b = null;
                            pye pye = this.a;
                            pye.d(obj);
                            if (get() != 4) {
                                pye.b();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    public final int p(int i) {
        lazySet(8);
        return 2;
    }

    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.b;
        this.b = null;
        return obj;
    }
}
