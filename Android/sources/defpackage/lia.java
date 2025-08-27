package defpackage;

import java.util.NoSuchElementException;

/* renamed from: lia  reason: default package */
public final class lia implements cla, mq4 {
    public final /* synthetic */ int a;
    public final long b;
    public mq4 c;
    public long o;
    public boolean v;
    public final Object w;

    public /* synthetic */ lia(Object obj, long j, int i) {
        this.a = i;
        this.w = obj;
        this.b = j;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.v) {
                    this.v = true;
                    ((pi8) this.w).b();
                    return;
                }
                return;
            default:
                if (!this.v) {
                    this.v = true;
                    ((gce) this.w).onError(new NoSuchElementException());
                    return;
                }
                return;
        }
    }

    public final void c(mq4 mq4) {
        switch (this.a) {
            case 0:
                if (qq4.g(this.c, mq4)) {
                    this.c = mq4;
                    ((pi8) this.w).c(this);
                    return;
                }
                return;
            default:
                if (qq4.g(this.c, mq4)) {
                    this.c = mq4;
                    ((gce) this.w).c(this);
                    return;
                }
                return;
        }
    }

    public final void d(Object obj) {
        switch (this.a) {
            case 0:
                if (!this.v) {
                    long j = this.o;
                    if (j == this.b) {
                        this.v = true;
                        this.c.dispose();
                        ((pi8) this.w).a(obj);
                        return;
                    }
                    this.o = j + 1;
                    return;
                }
                return;
            default:
                if (!this.v) {
                    long j2 = this.o;
                    if (j2 == this.b) {
                        this.v = true;
                        this.c.dispose();
                        ((gce) this.w).a(obj);
                        return;
                    }
                    this.o = j2 + 1;
                    return;
                }
                return;
        }
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                this.c.dispose();
                return;
            default:
                this.c.dispose();
                return;
        }
    }

    public final boolean f() {
        switch (this.a) {
            case 0:
                return this.c.f();
            default:
                return this.c.f();
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (this.v) {
                    n54.D(th);
                    return;
                }
                this.v = true;
                ((pi8) this.w).onError(th);
                return;
            default:
                if (this.v) {
                    n54.D(th);
                    return;
                }
                this.v = true;
                ((gce) this.w).onError(th);
                return;
        }
    }
}
