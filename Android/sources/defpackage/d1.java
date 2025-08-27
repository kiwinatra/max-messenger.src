package defpackage;

/* renamed from: d1  reason: default package */
public final class d1 implements Runnable {
    public final o1 a;
    public final zz7 b;

    public d1(o1 o1Var, zz7 zz7) {
        this.a = o1Var;
        this.b = zz7;
    }

    public final void run() {
        if (this.a.a == this) {
            if (o1.w.k(this.a, this, o1.f(this.b))) {
                o1.b(this.a);
            }
        }
    }
}
