package defpackage;

/* renamed from: b19  reason: default package */
public final /* synthetic */ class b19 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d19 b;
    public final /* synthetic */ lrf c;

    public /* synthetic */ b19(d19 d19, lrf lrf, int i) {
        this.a = i;
        this.b = d19;
        this.c = lrf;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.h(this.c);
                return;
            case 1:
                this.b.h(this.c);
                return;
            default:
                this.b.d(this.c);
                return;
        }
    }
}
