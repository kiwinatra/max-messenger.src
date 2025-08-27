package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ki8  reason: default package */
public final class ki8 extends wl0 implements pi8 {
    public final pye a;
    public final kc3 b = new Object();
    public final AtomicLong c = new AtomicLong();
    public final mi8 o;
    public final fz v = new AtomicReference();
    public final int w;
    public volatile boolean x;
    public boolean y;
    public long z;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, kc3] */
    /* JADX WARNING: type inference failed for: r1v3, types: [fz, java.util.concurrent.atomic.AtomicReference] */
    public ki8(pye pye, int i, mi8 mi8) {
        this.a = pye;
        this.w = i;
        this.o = mi8;
    }

    public final void a(Object obj) {
        this.o.offer(obj);
        f();
    }

    public final void b() {
        this.o.offer(lea.a);
        f();
    }

    public final void c(mq4 mq4) {
        this.b.a(mq4);
    }

    public final void cancel() {
        if (!this.x) {
            this.x = true;
            this.b.dispose();
            if (getAndIncrement() == 0) {
                this.o.clear();
            }
        }
    }

    public final void clear() {
        this.o.clear();
    }

    public final void f() {
        int i;
        lea lea;
        if (getAndIncrement() == 0) {
            int i2 = 1;
            if (this.y) {
                pye pye = this.a;
                mi8 mi8 = this.o;
                int i3 = 1;
                while (!this.x) {
                    Throwable th = (Throwable) this.v.get();
                    if (th != null) {
                        mi8.clear();
                        pye.onError(th);
                        return;
                    }
                    boolean z2 = mi8.m() == this.w;
                    if (!mi8.isEmpty()) {
                        pye.d((Object) null);
                    }
                    if (z2) {
                        pye.b();
                        return;
                    }
                    i3 = addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                }
                mi8.clear();
                return;
            }
            pye pye2 = this.a;
            mi8 mi82 = this.o;
            long j = this.z;
            do {
                long j2 = this.c.get();
                while (true) {
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    lea = lea.a;
                    if (i == 0) {
                        break;
                    } else if (this.x) {
                        mi82.clear();
                        return;
                    } else if (((Throwable) this.v.get()) != null) {
                        mi82.clear();
                        this.v.e(this.a);
                        return;
                    } else if (mi82.o() == this.w) {
                        pye2.b();
                        return;
                    } else {
                        Object poll = mi82.poll();
                        if (poll == null) {
                            break;
                        } else if (poll != lea) {
                            pye2.d(poll);
                            j++;
                        }
                    }
                }
                if (i == 0) {
                    if (((Throwable) this.v.get()) != null) {
                        mi82.clear();
                        this.v.e(this.a);
                        return;
                    }
                    while (mi82.peek() == lea) {
                        mi82.drop();
                    }
                    if (mi82.o() == this.w) {
                        pye2.b();
                        return;
                    }
                }
                this.z = j;
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }
    }

    public final void g(long j) {
        if (tye.d(j)) {
            h88.c(this.c, j);
            f();
        }
    }

    public final boolean isEmpty() {
        return this.o.isEmpty();
    }

    public final void onError(Throwable th) {
        if (this.v.a(th)) {
            this.b.dispose();
            this.o.offer(lea.a);
            f();
        }
    }

    public final int p(int i) {
        this.y = true;
        return 2;
    }

    public final Object poll() {
        Object poll;
        do {
            poll = this.o.poll();
        } while (poll == lea.a);
        return poll;
    }
}
