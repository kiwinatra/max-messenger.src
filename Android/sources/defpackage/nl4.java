package defpackage;

/* renamed from: nl4  reason: default package */
public final /* synthetic */ class nl4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pl4 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ u6h o;

    public /* synthetic */ nl4(pl4 pl4, Runnable runnable, u6h u6h, int i) {
        this.a = i;
        this.b = pl4;
        this.c = runnable;
        this.o = u6h;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                pl4 pl4 = this.b;
                pl4.getClass();
                pl4.a.execute(new ll4(this.c, this.o, 0));
                return;
            case 1:
                pl4 pl42 = this.b;
                pl42.getClass();
                pl42.a.execute(new ll4(this.c, this.o, 2));
                return;
            default:
                pl4 pl43 = this.b;
                pl43.getClass();
                pl43.a.execute(new ll4(this.c, this.o, 1));
                return;
        }
    }
}
