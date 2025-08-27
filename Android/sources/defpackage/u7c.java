package defpackage;

/* renamed from: u7c  reason: default package */
public final /* synthetic */ class u7c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d8c b;

    public /* synthetic */ u7c(d8c d8c, int i) {
        this.a = i;
        this.b = d8c;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Q0 = true;
                return;
            case 1:
                this.b.m();
                return;
            default:
                d8c d8c = this.b;
                if (!d8c.W0) {
                    kt8 kt8 = d8c.A0;
                    kt8.getClass();
                    kt8.c(d8c);
                    return;
                }
                return;
        }
    }
}
