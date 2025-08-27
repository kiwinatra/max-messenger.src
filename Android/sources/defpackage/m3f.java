package defpackage;

/* renamed from: m3f  reason: default package */
public final /* synthetic */ class m3f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q3f b;

    public /* synthetic */ m3f(q3f q3f, int i) {
        this.a = i;
        this.b = q3f;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                q3f q3f = this.b;
                q3f.getClass();
                ryg.G().execute(new m3f(q3f, 1));
                return;
            default:
                q3f q3f2 = this.b;
                if (!q3f2.n) {
                    q3f2.e();
                    return;
                }
                return;
        }
    }
}
