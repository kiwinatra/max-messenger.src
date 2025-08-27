package defpackage;

import java.util.Collection;
import java.util.Objects;

/* renamed from: ew5  reason: default package */
public final class ew5 implements gx5, zac {
    public final pye a;
    public rye b;
    public zac c;
    public boolean o;
    public int v;
    public final Collection w;
    public final zi6 x;

    public ew5(pye pye, zi6 zi6, Collection collection) {
        this.a = pye;
        this.x = zi6;
        this.w = collection;
    }

    public final void b() {
        if (!this.o) {
            this.o = true;
            this.w.clear();
            this.a.b();
        }
    }

    public final void cancel() {
        this.b.cancel();
    }

    public final void clear() {
        this.w.clear();
        this.c.clear();
    }

    public final void d(Object obj) {
        if (!this.o) {
            int i = this.v;
            pye pye = this.a;
            if (i == 0) {
                try {
                    Object apply = this.x.apply(obj);
                    Objects.requireNonNull(apply, "The keySelector returned a null key");
                    if (this.w.add(apply)) {
                        pye.d(obj);
                    } else {
                        this.b.g(1);
                    }
                } catch (Throwable th) {
                    hd8.Z(th);
                    this.b.cancel();
                    onError(th);
                }
            } else {
                pye.d((Object) null);
            }
        }
    }

    public final void e(rye rye) {
        if (tye.e(this.b, rye)) {
            this.b = rye;
            if (rye instanceof zac) {
                this.c = (zac) rye;
            }
            this.a.e(this);
        }
    }

    public final void g(long j) {
        this.b.g(j);
    }

    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final void onError(Throwable th) {
        if (this.o) {
            n54.D(th);
            return;
        }
        this.o = true;
        this.w.clear();
        this.a.onError(th);
    }

    public final int p(int i) {
        zac zac = this.c;
        if (zac == null || (i & 4) != 0) {
            return 0;
        }
        int p = zac.p(i);
        if (p == 0) {
            return p;
        }
        this.v = p;
        return p;
    }

    public final Object poll() {
        Object poll;
        while (true) {
            poll = this.c.poll();
            if (poll == null) {
                break;
            }
            Object apply = this.x.apply(poll);
            Objects.requireNonNull(apply, "The keySelector returned a null key");
            if (this.w.add(apply)) {
                break;
            } else if (this.v == 2) {
                this.b.g(1);
            }
        }
        return poll;
    }
}
