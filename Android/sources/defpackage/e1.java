package defpackage;

/* renamed from: e1  reason: default package */
public final class e1 extends hi7 {
    public final void H(l1 l1Var, l1 l1Var2) {
        l1Var.b = l1Var2;
    }

    public final void I(l1 l1Var, Thread thread) {
        l1Var.a = thread;
    }

    public final boolean d(n1 n1Var, y0 y0Var, y0 y0Var2) {
        synchronized (n1Var) {
            try {
                if (n1Var.b != y0Var) {
                    return false;
                }
                n1Var.b = y0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(n1 n1Var, Object obj, Object obj2) {
        synchronized (n1Var) {
            try {
                if (n1Var.a != obj) {
                    return false;
                }
                n1Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f(n1 n1Var, l1 l1Var, l1 l1Var2) {
        synchronized (n1Var) {
            try {
                if (n1Var.c != l1Var) {
                    return false;
                }
                n1Var.c = l1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final y0 p(n1 n1Var) {
        y0 y0Var;
        y0 y0Var2 = y0.d;
        synchronized (n1Var) {
            y0Var = n1Var.b;
            if (y0Var != y0Var2) {
                n1Var.b = y0Var2;
            }
        }
        return y0Var;
    }

    public final l1 q(n1 n1Var) {
        l1 l1Var;
        l1 l1Var2 = l1.c;
        synchronized (n1Var) {
            l1Var = n1Var.c;
            if (l1Var != l1Var2) {
                n1Var.c = l1Var2;
            }
        }
        return l1Var;
    }
}
