package defpackage;

/* renamed from: qka  reason: default package */
public final class qka implements cla, mq4 {
    public final cla a;
    public boolean b;
    public mq4 c;
    public long o;

    public qka(cla cla, long j) {
        this.a = cla;
        this.o = j;
    }

    public final void b() {
        if (!this.b) {
            this.b = true;
            this.c.dispose();
            this.a.b();
        }
    }

    public final void c(mq4 mq4) {
        if (qq4.g(this.c, mq4)) {
            this.c = mq4;
            int i = (this.o > 0 ? 1 : (this.o == 0 ? 0 : -1));
            cla cla = this.a;
            if (i == 0) {
                this.b = true;
                mq4.dispose();
                p45.a(cla);
                return;
            }
            cla.c(this);
        }
    }

    public final void d(Object obj) {
        if (!this.b) {
            long j = this.o;
            long j2 = j - 1;
            this.o = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.a.d(obj);
                if (z) {
                    b();
                }
            }
        }
    }

    public final void dispose() {
        this.c.dispose();
    }

    public final boolean f() {
        return this.c.f();
    }

    public final void onError(Throwable th) {
        if (this.b) {
            n54.D(th);
            return;
        }
        this.b = true;
        this.c.dispose();
        this.a.onError(th);
    }
}
