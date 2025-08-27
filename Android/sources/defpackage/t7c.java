package defpackage;

/* renamed from: t7c  reason: default package */
public final /* synthetic */ class t7c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8c b;

    public /* synthetic */ t7c(c8c c8c, int i) {
        this.a = i;
        this.b = c8c;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.h();
                return;
            default:
                c8c c8c = this.b;
                if (!c8c.U0) {
                    jt8 jt8 = c8c.z0;
                    jt8.getClass();
                    jt8.b(c8c);
                    return;
                }
                return;
        }
    }
}
