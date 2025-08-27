package defpackage;

import java.util.Collection;
import java.util.Objects;

/* renamed from: eia  reason: default package */
public final class eia extends ul0 {
    public final Collection w;
    public final zi6 x;

    public eia(cla cla, zi6 zi6, Collection collection) {
        super(cla);
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

    public final void clear() {
        this.w.clear();
        super.clear();
    }

    public final void d(Object obj) {
        if (!this.o) {
            int i = this.v;
            cla cla = this.a;
            if (i == 0) {
                try {
                    Object apply = this.x.apply(obj);
                    Objects.requireNonNull(apply, "The keySelector returned a null key");
                    if (this.w.add(apply)) {
                        cla.d(obj);
                    }
                } catch (Throwable th) {
                    hd8.Z(th);
                    this.b.dispose();
                    onError(th);
                }
            } else {
                cla.d((Object) null);
            }
        }
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

    public final Object poll() {
        Object poll;
        Object apply;
        do {
            poll = this.c.poll();
            if (poll == null) {
                break;
            }
            apply = this.x.apply(poll);
            Objects.requireNonNull(apply, "The keySelector returned a null key");
        } while (!this.w.add(apply));
        return poll;
    }
}
