package defpackage;

/* renamed from: wha  reason: default package */
public final class wha extends r2 {
    public final /* synthetic */ int b = 0;
    public final zi6 c;
    public final int o;
    public final int v;

    public wha(oka oka, zi6 zi6, int i, int i2) {
        super(oka);
        this.c = zi6;
        this.o = i;
        this.v = i2;
    }

    public final void w(cla cla) {
        switch (this.b) {
            case 0:
                oka oka = this.a;
                zi6 zi6 = this.c;
                if (!cvg.P(oka, cla, zi6)) {
                    boolean z = true;
                    int i = this.o;
                    int i2 = this.v;
                    if (i2 == 1) {
                        oka.a(new vha(new btd(cla), zi6, i));
                        return;
                    }
                    if (i2 != 3) {
                        z = false;
                    }
                    oka.a(new uha(cla, zi6, i, z));
                    return;
                }
                return;
            default:
                oka oka2 = this.a;
                zi6 zi62 = this.c;
                if (!cvg.P(oka2, cla, zi62)) {
                    oka2.a(new sia(cla, zi62, this.o, this.v));
                    return;
                }
                return;
        }
    }

    public wha(jha jha, zi6 zi6, int i, int i2) {
        super(jha);
        this.c = zi6;
        this.v = i2;
        this.o = Math.max(8, i);
    }
}
