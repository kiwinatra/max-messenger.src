package defpackage;

/* renamed from: f1  reason: default package */
public final class f1 extends kr7 {
    public final void I(m1 m1Var, m1 m1Var2) {
        m1Var.b = m1Var2;
    }

    public final void J(m1 m1Var, Thread thread) {
        m1Var.a = thread;
    }

    public final boolean j(o1 o1Var, z0 z0Var, z0 z0Var2) {
        synchronized (o1Var) {
            try {
                if (o1Var.b != z0Var) {
                    return false;
                }
                o1Var.b = z0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean k(o1 o1Var, Object obj, Object obj2) {
        synchronized (o1Var) {
            try {
                if (o1Var.a != obj) {
                    return false;
                }
                o1Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean l(o1 o1Var, m1 m1Var, m1 m1Var2) {
        synchronized (o1Var) {
            try {
                if (o1Var.c != m1Var) {
                    return false;
                }
                o1Var.c = m1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
