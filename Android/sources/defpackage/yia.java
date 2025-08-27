package defpackage;

import java.util.Objects;

/* renamed from: yia  reason: default package */
public final class yia extends r2 {
    public final /* synthetic */ int b;
    public final zi6 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yia(oka oka, zi6 zi6, int i) {
        super(oka);
        this.b = i;
        this.c = zi6;
    }

    public final void w(cla cla) {
        switch (this.b) {
            case 0:
                this.a.a(new xia(cla, this.c, 0));
                return;
            case 1:
                this.a.a(new xia(cla, this.c, 1));
                return;
            case 2:
                this.a.a(new zia(cla, this.c, 0));
                return;
            case 3:
                this.a.a(new qia(cla, this.c, 1));
                return;
            case 4:
                g5b g5b = new g5b(cla, (ac2) this.c);
                cla.c((mw1) g5b.v);
                this.a.a(g5b);
                return;
            case 5:
                this.a.a(new zia(cla, this.c, 1));
                return;
            default:
                etd etd = new etd(new dac());
                try {
                    Object apply = this.c.apply(etd);
                    Objects.requireNonNull(apply, "The handler returned a null ObservableSource");
                    oka oka = (oka) apply;
                    eka eka = new eka(cla, etd, this.a);
                    cla.c(eka);
                    oka.a(eka.v);
                    eka.a();
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    p45.b(th, cla);
                    return;
                }
        }
    }
}
