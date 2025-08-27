package defpackage;

/* renamed from: e3  reason: default package */
public final class e3 extends hd8 {
    public final void P(f3 f3Var, f3 f3Var2) {
        f3Var.b = f3Var2;
    }

    public final void Q(f3 f3Var, Thread thread) {
        f3Var.a = thread;
    }

    public final boolean g(g3 g3Var, c3 c3Var, c3 c3Var2) {
        synchronized (g3Var) {
            try {
                if (g3Var.b != c3Var) {
                    return false;
                }
                g3Var.b = c3Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(g3 g3Var, Object obj, Object obj2) {
        synchronized (g3Var) {
            try {
                if (g3Var.a != obj) {
                    return false;
                }
                g3Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean i(g3 g3Var, f3 f3Var, f3 f3Var2) {
        synchronized (g3Var) {
            try {
                if (g3Var.c != f3Var) {
                    return false;
                }
                g3Var.c = f3Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
