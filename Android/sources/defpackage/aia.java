package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: aia  reason: default package */
public final class aia implements cla, mq4 {
    public final cla a;
    public final long b;
    public final TimeUnit c;
    public final jfd o;
    public mq4 v;
    public zha w;
    public volatile long x;
    public boolean y;

    public aia(btd btd, long j, TimeUnit timeUnit, jfd jfd) {
        this.a = btd;
        this.b = j;
        this.c = timeUnit;
        this.o = jfd;
    }

    public final void b() {
        if (!this.y) {
            this.y = true;
            zha zha = this.w;
            if (zha != null) {
                qq4.a(zha);
            }
            if (zha != null) {
                zha.run();
            }
            this.a.b();
            this.o.dispose();
        }
    }

    public final void c(mq4 mq4) {
        if (qq4.g(this.v, mq4)) {
            this.v = mq4;
            this.a.c(this);
        }
    }

    public final void d(Object obj) {
        if (!this.y) {
            long j = this.x + 1;
            this.x = j;
            zha zha = this.w;
            if (zha != null) {
                qq4.a(zha);
            }
            zha zha2 = new zha(obj, j, this);
            this.w = zha2;
            qq4.c(zha2, this.o.b(zha2, this.b, this.c));
        }
    }

    public final void dispose() {
        this.v.dispose();
        this.o.dispose();
    }

    public final boolean f() {
        return this.o.f();
    }

    public final void onError(Throwable th) {
        if (this.y) {
            n54.D(th);
            return;
        }
        zha zha = this.w;
        if (zha != null) {
            qq4.a(zha);
        }
        this.y = true;
        this.a.onError(th);
        this.o.dispose();
    }
}
