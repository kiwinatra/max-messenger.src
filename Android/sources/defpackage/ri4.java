package defpackage;

/* renamed from: ri4  reason: default package */
public final /* synthetic */ class ri4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3f b;

    public /* synthetic */ ri4(z3f z3f, int i) {
        this.a = i;
        this.b = z3f;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                return;
            default:
                this.b.g.cancel(true);
                return;
        }
    }
}
