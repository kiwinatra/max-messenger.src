package defpackage;

/* renamed from: j9f  reason: default package */
public final /* synthetic */ class j9f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k9f b;

    public /* synthetic */ j9f(k9f k9f, int i) {
        this.a = i;
        this.b = k9f;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                k9f k9f = this.b;
                k9f.o = null;
                k9f.c();
                return;
            default:
                this.b.c();
                return;
        }
    }
}
