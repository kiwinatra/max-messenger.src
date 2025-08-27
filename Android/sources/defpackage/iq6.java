package defpackage;

/* renamed from: iq6  reason: default package */
public final class iq6 implements zme {
    public final x0g a;
    public final qdf b;

    public iq6(x0g x0g, qdf qdf) {
        this.a = x0g;
        this.b = qdf;
    }

    public final boolean a(Exception exc) {
        this.b.c(exc);
        return true;
    }

    public final boolean b(tb0 tb0) {
        if (tb0.b != 4 || this.a.a(tb0)) {
            return false;
        }
        String str = tb0.c;
        if (str != null) {
            this.b.b(new fb0(tb0.e, str, tb0.f));
            return true;
        }
        throw new NullPointerException("Null token");
    }
}
