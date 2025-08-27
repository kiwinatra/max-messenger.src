package defpackage;

/* renamed from: i64  reason: default package */
public final /* synthetic */ class i64 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o64 b;

    public /* synthetic */ i64(o64 o64, int i) {
        this.a = i;
        this.b = o64;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.z();
                return;
            default:
                this.b.y(false);
                return;
        }
    }
}
