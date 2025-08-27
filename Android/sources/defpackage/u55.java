package defpackage;

/* renamed from: u55  reason: default package */
public final /* synthetic */ class u55 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g65 b;

    public /* synthetic */ u55(g65 g65, int i) {
        this.a = i;
        this.b = g65;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                g65 g65 = this.b;
                hd8.a(g65.a(), new b8d((Object) g65), g65.h);
                return;
            case 1:
                g65 g652 = this.b;
                g652.h.execute(new u55(g652, 2));
                return;
            case 2:
                g65 g653 = this.b;
                if (g653.v) {
                    g653.w = null;
                    g653.j();
                    g653.v = false;
                    return;
                }
                return;
            case 3:
                g65 g654 = this.b;
                int y = tr1.y(g654.D);
                if (y == 1) {
                    g654.g();
                    return;
                } else if (y == 6 || y == 8) {
                    throw new IllegalStateException("Encoder is released");
                } else {
                    return;
                }
            case 4:
                g65 g655 = this.b;
                switch (tr1.y(g655.D)) {
                    case 0:
                    case 1:
                    case 2:
                    case 7:
                        g655.f();
                        return;
                    case 3:
                    case 4:
                    case 5:
                        g655.i(7);
                        return;
                    case 6:
                    case 8:
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(g63.s(g655.D)));
                }
            default:
                g65 g656 = this.b;
                g656.A = true;
                if (g656.z) {
                    g656.e.stop();
                    g656.h();
                    return;
                }
                return;
        }
    }
}
