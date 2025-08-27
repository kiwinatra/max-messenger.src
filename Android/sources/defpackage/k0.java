package defpackage;

/* renamed from: k0  reason: default package */
public final class k0 extends ej0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ m0 c;

    public k0(m0 m0Var, String str, boolean z) {
        this.c = m0Var;
        this.a = str;
        this.b = z;
    }

    public final void b(i0 i0Var) {
        boolean h = i0Var.h();
        float d = i0Var.d();
        String str = this.a;
        m0 m0Var = this.c;
        if (!m0Var.h(str, i0Var)) {
            m0Var.i("ignore_old_datasource @ onProgress", (Throwable) null);
            i0Var.a();
        } else if (!h) {
            m0Var.h.m(d, false);
        }
    }

    public final void e(i0 i0Var) {
        this.c.l(this.a, i0Var, i0Var.c(), true);
    }

    public final void f(i0 i0Var) {
        boolean h = i0Var.h();
        boolean z = i0Var instanceof v4d;
        float d = i0Var.d();
        Object e = i0Var.e();
        if (e != null) {
            this.c.m(this.a, i0Var, e, d, h, this.b, z);
        } else if (h) {
            this.c.l(this.a, i0Var, new NullPointerException(), true);
        }
    }
}
