package defpackage;

/* renamed from: r1a  reason: default package */
public final class r1a extends w1 {
    public final a33 b;

    public r1a(w3a w3a, a33 a33) {
        super(w3a);
        this.b = a33;
        w3a.R(this);
    }

    public final void W(String str) {
        a33 a33 = this.b;
        f2a f2a = this.a;
        if (str == null) {
            ((w3a) f2a).Z(a33.f("user.quick.camera.flashMode", "auto").toUpperCase());
            return;
        }
        a33.l("user.quick.camera.flashMode", str);
        ((w3a) f2a).Z(str);
    }
}
