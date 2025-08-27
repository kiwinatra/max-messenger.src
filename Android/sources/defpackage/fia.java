package defpackage;

import java.util.Objects;

/* renamed from: fia  reason: default package */
public final class fia extends ul0 {
    public final zi6 w;
    public Object x;
    public boolean y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fia(cla cla) {
        super(cla);
        nfd nfd = m58.c;
        this.w = nfd;
    }

    public final void d(Object obj) {
        if (!this.o) {
            int i = this.v;
            cla cla = this.a;
            if (i != 0) {
                cla.d(obj);
                return;
            }
            try {
                Object apply = this.w.apply(obj);
                if (this.y) {
                    boolean equals = Objects.equals(this.x, apply);
                    this.x = apply;
                    if (equals) {
                        return;
                    }
                } else {
                    this.y = true;
                    this.x = apply;
                }
                cla.d(obj);
            } catch (Throwable th) {
                hd8.Z(th);
                this.b.dispose();
                onError(th);
            }
        }
    }

    public final Object poll() {
        while (true) {
            Object poll = this.c.poll();
            if (poll == null) {
                return null;
            }
            Object apply = this.w.apply(poll);
            if (!this.y) {
                this.y = true;
                this.x = apply;
                return poll;
            } else if (!Objects.equals(this.x, apply)) {
                this.x = apply;
                return poll;
            } else {
                this.x = apply;
            }
        }
    }
}
