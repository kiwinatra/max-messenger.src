package defpackage;

/* renamed from: d1b  reason: default package */
public final class d1b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1b b;

    public /* synthetic */ d1b(e1b e1b, int i) {
        this.a = i;
        this.b = e1b;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invalidate();
                return;
            default:
                this.b.invalidate();
                return;
        }
    }
}
