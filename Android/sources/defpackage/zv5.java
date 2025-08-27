package defpackage;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: zv5  reason: default package */
public final class zv5 implements gx5, mq4 {
    public final /* synthetic */ int a = 1;
    public final gce b;
    public final Object c;
    public rye o;
    public boolean v;
    public Object w;

    public zv5(gce gce, Object obj) {
        this.b = gce;
        this.c = obj;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.v) {
                    this.v = true;
                    this.o = tye.a;
                    this.b.a(this.c);
                    return;
                }
                return;
            default:
                if (!this.v) {
                    this.v = true;
                    this.o = tye.a;
                    Object obj = this.w;
                    this.w = null;
                    if (obj == null) {
                        obj = this.c;
                    }
                    gce gce = this.b;
                    if (obj != null) {
                        gce.a(obj);
                        return;
                    } else {
                        gce.onError(new NoSuchElementException());
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public final void d(Object obj) {
        switch (this.a) {
            case 0:
                if (!this.v) {
                    try {
                        ((rm0) this.w).accept(this.c, obj);
                        return;
                    } catch (Throwable th) {
                        hd8.Z(th);
                        this.o.cancel();
                        onError(th);
                        return;
                    }
                } else {
                    return;
                }
            default:
                if (!this.v) {
                    if (this.w != null) {
                        this.v = true;
                        this.o.cancel();
                        this.o = tye.a;
                        this.b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                        return;
                    }
                    this.w = obj;
                    return;
                }
                return;
        }
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                this.o.cancel();
                this.o = tye.a;
                return;
            default:
                this.o.cancel();
                this.o = tye.a;
                return;
        }
    }

    public final void e(rye rye) {
        switch (this.a) {
            case 0:
                if (tye.e(this.o, rye)) {
                    this.o = rye;
                    this.b.c(this);
                    rye.g(LongCompanionObject.MAX_VALUE);
                    return;
                }
                return;
            default:
                if (tye.e(this.o, rye)) {
                    this.o = rye;
                    this.b.c(this);
                    rye.g(LongCompanionObject.MAX_VALUE);
                    return;
                }
                return;
        }
    }

    public final boolean f() {
        switch (this.a) {
            case 0:
                return this.o == tye.a;
            default:
                return this.o == tye.a;
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
                this.o = tye.a;
                this.b.onError(th);
                return;
            default:
                if (this.v) {
                    n54.D(th);
                    return;
                }
                this.v = true;
                this.o = tye.a;
                this.b.onError(th);
                return;
        }
    }

    public zv5(gce gce, Object obj, rm0 rm0) {
        this.b = gce;
        this.w = rm0;
        this.c = obj;
    }
}
