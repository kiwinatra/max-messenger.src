package defpackage;

/* renamed from: h9e  reason: default package */
public final class h9e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l9e b;

    public /* synthetic */ h9e(l9e l9e, int i) {
        this.a = i;
        this.b = l9e;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.requestLayout();
                return;
            default:
                l9e l9e = this.b;
                l9e.n1 = false;
                l9e.b();
                return;
        }
    }
}
