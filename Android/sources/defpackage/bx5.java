package defpackage;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: bx5  reason: default package */
public final class bx5 extends rk4 implements gx5 {
    public final Object c;
    public final boolean o;
    public rye v;
    public boolean w;

    public bx5(pye pye, Object obj, boolean z) {
        super(pye);
        this.c = obj;
        this.o = z;
    }

    public final void b() {
        if (!this.w) {
            this.w = true;
            Object obj = this.b;
            this.b = null;
            if (obj == null) {
                obj = this.c;
            }
            if (obj == null) {
                boolean z = this.o;
                pye pye = this.a;
                if (z) {
                    pye.onError(new NoSuchElementException());
                } else {
                    pye.b();
                }
            } else {
                f(obj);
            }
        }
    }

    public final void cancel() {
        set(4);
        this.b = null;
        this.v.cancel();
    }

    public final void d(Object obj) {
        if (!this.w) {
            if (this.b != null) {
                this.w = true;
                this.v.cancel();
                this.a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.b = obj;
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
