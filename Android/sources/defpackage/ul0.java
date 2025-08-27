package defpackage;

/* renamed from: ul0  reason: default package */
public abstract class ul0 implements cla, xac {
    public final cla a;
    public mq4 b;
    public xac c;
    public boolean o;
    public int v;

    public ul0(cla cla) {
        this.a = cla;
    }

    public final int a(int i) {
        xac xac = this.c;
        if (xac == null || (i & 4) != 0) {
            return 0;
        }
        int p = xac.p(i);
        if (p != 0) {
            this.v = p;
        }
        return p;
    }

    public void b() {
        if (!this.o) {
            this.o = true;
            this.a.b();
        }
    }

    public final void c(mq4 mq4) {
        if (qq4.g(this.b, mq4)) {
            this.b = mq4;
            if (mq4 instanceof xac) {
                this.c = (xac) mq4;
            }
            this.a.c(this);
        }
    }

    public void clear() {
        this.c.clear();
    }

    public final void dispose() {
        this.b.dispose();
    }

    public final boolean f() {
        return this.b.f();
    }

    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onError(Throwable th) {
        if (this.o) {
            n54.D(th);
            return;
        }
        this.o = true;
        this.a.onError(th);
    }

    public int p(int i) {
        return a(i);
    }
}
