package defpackage;

/* renamed from: qf  reason: default package */
public final class qf extends of {
    public final iog h(iog iog) {
        wh7 f = iog.a.f(this.j);
        wh7 f2 = iog.a.f(this.d);
        wh7 b = wh7.b(f.a - f2.a, f.b - f2.b, f.c - f2.c, f.d - f2.d);
        wh7 b2 = wh7.b(Math.max(b.a, 0), Math.max(b.b, 0), Math.max(b.c, 0), Math.max(b.d, 0));
        this.a.setTranslationY((float) (b2.b - b2.d));
        return iog;
    }

    public final void i() {
        this.a.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
    }
}
