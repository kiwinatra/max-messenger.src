package defpackage;

import java.util.Objects;

/* renamed from: qia  reason: default package */
public final class qia extends ul0 {
    public final /* synthetic */ int w;
    public final Object x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qia(cla cla, Object obj, int i) {
        super(cla);
        this.w = i;
        this.x = obj;
    }

    public final void d(Object obj) {
        switch (this.w) {
            case 0:
                int i = this.v;
                cla cla = this.a;
                if (i == 0) {
                    try {
                        if (((nsb) this.x).test(obj)) {
                            cla.d(obj);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        hd8.Z(th);
                        this.b.dispose();
                        onError(th);
                        return;
                    }
                } else {
                    cla.d((Object) null);
                    return;
                }
            default:
                if (!this.o) {
                    int i2 = this.v;
                    cla cla2 = this.a;
                    if (i2 != 0) {
                        cla2.d((Object) null);
                        return;
                    }
                    try {
                        Object apply = ((zi6) this.x).apply(obj);
                        Objects.requireNonNull(apply, "The mapper function returned a null value.");
                        cla2.d(apply);
                        return;
                    } catch (Throwable th2) {
                        hd8.Z(th2);
                        this.b.dispose();
                        onError(th2);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public final Object poll() {
        Object poll;
        switch (this.w) {
            case 0:
                break;
            default:
                Object poll2 = this.c.poll();
                if (poll2 == null) {
                    return null;
                }
                Object apply = ((zi6) this.x).apply(poll2);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                return apply;
        }
        do {
            poll = this.c.poll();
            if (poll == null || ((nsb) this.x).test(poll)) {
                return poll;
            }
            poll = this.c.poll();
            return poll;
        } while (((nsb) this.x).test(poll));
        return poll;
    }
}
