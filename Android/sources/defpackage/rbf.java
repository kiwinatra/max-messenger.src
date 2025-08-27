package defpackage;

/* renamed from: rbf  reason: default package */
public final /* synthetic */ class rbf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lcf b;
    public final /* synthetic */ qaf c;

    public /* synthetic */ rbf(lcf lcf, qaf qaf, int i) {
        this.a = i;
        this.b = lcf;
        this.c = qaf;
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
                this.b.h(this.c);
                return;
        }
    }
}
