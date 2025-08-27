package defpackage;

/* renamed from: ll4  reason: default package */
public final /* synthetic */ class ll4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ u6h c;

    public /* synthetic */ ll4(Runnable runnable, u6h u6h, int i) {
        this.a = i;
        this.b = runnable;
        this.c = u6h;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    this.b.run();
                    return;
                } catch (Exception e) {
                    ((rl4) this.c.b).j(e);
                    throw e;
                }
            case 1:
                try {
                    this.b.run();
                    return;
                } catch (Exception e2) {
                    ((rl4) this.c.b).j(e2);
                    return;
                }
            default:
                Runnable runnable = this.b;
                u6h u6h = this.c;
                try {
                    runnable.run();
                    ((rl4) u6h.b).i((Object) null);
                    return;
                } catch (Exception e3) {
                    ((rl4) u6h.b).j(e3);
                    return;
                }
        }
    }
}
