package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: md3  reason: default package */
public final class md3 extends jfd {
    public final jz7 a;
    public final kc3 b;
    public final jz7 c;
    public final od3 o;
    public volatile boolean v;

    /* JADX WARNING: type inference failed for: r3v1, types: [mq4, jz7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v0, types: [mq4, java.lang.Object, kc3] */
    /* JADX WARNING: type inference failed for: r1v0, types: [jz7, java.lang.Object] */
    public md3(od3 od3) {
        this.o = od3;
        ? obj = new Object();
        this.a = obj;
        ? obj2 = new Object();
        this.b = obj2;
        ? obj3 = new Object();
        this.c = obj3;
        obj3.a(obj);
        obj3.a(obj2);
    }

    public final mq4 a(Runnable runnable) {
        if (this.v) {
            return p45.a;
        }
        return this.o.d(runnable, 0, TimeUnit.MILLISECONDS, this.a);
    }

    public final mq4 b(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.v) {
            return p45.a;
        }
        return this.o.d(runnable, j, timeUnit, this.b);
    }

    public final void dispose() {
        if (!this.v) {
            this.v = true;
            this.c.dispose();
        }
    }

    public final boolean f() {
        return this.v;
    }
}
