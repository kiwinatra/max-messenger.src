package defpackage;

/* renamed from: ej0  reason: default package */
public abstract class ej0 implements r74 {
    public final void a(i0 i0Var) {
        boolean h = i0Var.h();
        try {
            f(i0Var);
        } finally {
            if (h) {
                i0Var.a();
            }
        }
    }

    public void b(i0 i0Var) {
    }

    public final void c(i0 i0Var) {
        try {
            e(i0Var);
        } finally {
            i0Var.a();
        }
    }

    public void d() {
    }

    public abstract void e(i0 i0Var);

    public abstract void f(i0 i0Var);
}
