package defpackage;

/* renamed from: c1  reason: default package */
public final class c1 implements Runnable {
    public final n1 a;
    public final zz7 b;

    public c1(n1 n1Var, zz7 zz7) {
        this.a = n1Var;
        this.b = zz7;
    }

    public final void run() {
        if (this.a.a == this) {
            if (n1.w.e(this.a, this, n1.h(this.b))) {
                n1.e(this.a, false);
            }
        }
    }
}
