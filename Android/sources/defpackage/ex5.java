package defpackage;

/* renamed from: ex5  reason: default package */
public final class ex5 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final long b;
    public final Object c;

    public ex5(long j, rye rye) {
        this.c = rye;
        this.b = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((rye) this.c).g(this.b);
                return;
            default:
                ((yka) this.c).a(this.b);
                return;
        }
    }

    public ex5(long j, yka yka) {
        this.b = j;
        this.c = yka;
    }
}
