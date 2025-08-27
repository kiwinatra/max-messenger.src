package defpackage;

/* renamed from: bw4  reason: default package */
public final /* synthetic */ class bw4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fw4 b;
    public final /* synthetic */ hw4 c;

    public /* synthetic */ bw4(fw4 fw4, hw4 hw4, int i) {
        this.a = i;
        this.b = fw4;
        this.c = hw4;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                fw4 fw4 = this.b;
                this.c.A(fw4.a, fw4.b);
                return;
            case 1:
                fw4 fw42 = this.b;
                this.c.H(fw42.a, fw42.b);
                return;
            case 2:
                fw4 fw43 = this.b;
                this.c.F(fw43.a, fw43.b);
                return;
            default:
                fw4 fw44 = this.b;
                this.c.v(fw44.a, fw44.b);
                return;
        }
    }
}
