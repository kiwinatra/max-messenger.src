package defpackage;

/* renamed from: n3f  reason: default package */
public final /* synthetic */ class n3f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3f b;

    public /* synthetic */ n3f(p3f p3f, int i) {
        this.a = i;
        this.b = p3f;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a();
                return;
            case 1:
                this.b.b();
                return;
            default:
                p3f p3f = this.b;
                s3f s3f = p3f.q;
                if (s3f != null) {
                    s3f.m();
                }
                if (p3f.p == null) {
                    p3f.o.c();
                    return;
                }
                return;
        }
    }
}
