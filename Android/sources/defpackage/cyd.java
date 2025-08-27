package defpackage;

/* renamed from: cyd  reason: default package */
public final class cyd extends o1 {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = o1.x;
        }
        if (!o1.w.k(this, (Object) null, obj)) {
            return false;
        }
        o1.b(this);
        return true;
    }

    public final boolean k(Throwable th) {
        if (!o1.w.k(this, (Object) null, new x0(th))) {
            return false;
        }
        o1.b(this);
        return true;
    }

    public final boolean l(zz7 zz7) {
        d1 d1Var;
        x0 x0Var;
        zz7.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (zz7.isDone()) {
                if (!o1.w.k(this, (Object) null, o1.f(zz7))) {
                    return false;
                }
                o1.b(this);
            } else {
                d1Var = new d1(this, zz7);
                if (o1.w.k(this, (Object) null, d1Var)) {
                    try {
                        zz7.d(d1Var, cp4.a);
                    } catch (Throwable unused) {
                        x0Var = x0.b;
                    }
                } else {
                    obj = this.a;
                }
            }
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        zz7.cancel(((u0) obj).a);
        return false;
        o1.w.k(this, d1Var, x0Var);
        return true;
    }
}
