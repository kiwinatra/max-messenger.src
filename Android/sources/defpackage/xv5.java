package defpackage;

import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: xv5  reason: default package */
public final class xv5 extends rk4 implements gx5 {
    public final rm0 c;
    public final Object o;
    public rye v;
    public boolean w;

    public xv5(pye pye, Object obj, rm0 rm0) {
        super(pye);
        this.c = rm0;
        this.o = obj;
    }

    public final void b() {
        if (!this.w) {
            this.w = true;
            f(this.o);
        }
    }

    public final void cancel() {
        set(4);
        this.b = null;
        this.v.cancel();
    }

    public final void d(Object obj) {
        if (!this.w) {
            try {
                this.c.accept(this.o, obj);
            } catch (Throwable th) {
                hd8.Z(th);
                this.v.cancel();
                onError(th);
            }
        }
    }

    public final void e(rye rye) {
        if (tye.e(this.v, rye)) {
            this.v = rye;
            this.a.e(this);
            rye.g(LongCompanionObject.MAX_VALUE);
        }
    }

    public final void onError(Throwable th) {
        if (this.w) {
            n54.D(th);
            return;
        }
        this.w = true;
        this.a.onError(th);
    }
}
