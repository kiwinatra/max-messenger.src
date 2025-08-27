package defpackage;

/* renamed from: byd  reason: default package */
public final class byd extends h1 {
    public final boolean n(zz7 zz7) {
        w0 w0Var;
        zz7.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (zz7.isDone()) {
                if (!n1.w.e(this, (Object) null, n1.h(zz7))) {
                    return false;
                }
                n1.e(this, false);
            } else {
                c1 c1Var = new c1(this, zz7);
                if (n1.w.e(this, (Object) null, c1Var)) {
                    try {
                        zz7.d(c1Var, dp4.a);
                    } catch (Throwable th) {
                        try {
                            w0Var = new w0(th);
                        } catch (Error | Exception unused) {
                            w0Var = w0.b;
                        }
                        n1.w.e(this, c1Var, w0Var);
                    }
                } else {
                    obj = this.a;
                }
            }
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        zz7.cancel(((t0) obj).a);
        return false;
    }
}
