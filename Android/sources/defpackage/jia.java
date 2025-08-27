package defpackage;

import java.util.NoSuchElementException;

/* renamed from: jia  reason: default package */
public final class jia implements cla, mq4 {
    public final cla a;
    public final long b;
    public final Object c;
    public final boolean o;
    public mq4 v;
    public long w;
    public boolean x;

    public jia(cla cla, long j, Object obj, boolean z) {
        this.a = cla;
        this.b = j;
        this.c = obj;
        this.o = z;
    }

    public final void b() {
        if (!this.x) {
            this.x = true;
            cla cla = this.a;
            Object obj = this.c;
            if (obj != null || !this.o) {
                if (obj != null) {
                    cla.d(obj);
                }
                cla.b();
                return;
            }
            cla.onError(new NoSuchElementException());
        }
    }

    public final void c(mq4 mq4) {
        if (qq4.g(this.v, mq4)) {
            this.v = mq4;
            this.a.c(this);
        }
    }

    public final void d(Object obj) {
        if (!this.x) {
            long j = this.w;
            if (j == this.b) {
                this.x = true;
                this.v.dispose();
                cla cla = this.a;
                cla.d(obj);
                cla.b();
                return;
            }
            this.w = j + 1;
        }
    }

    public final void dispose() {
        this.v.dispose();
    }

    public final boolean f() {
        return this.v.f();
    }

    public final void onError(Throwable th) {
        if (this.x) {
            n54.D(th);
            return;
        }
        this.x = true;
        this.a.onError(th);
    }
}
