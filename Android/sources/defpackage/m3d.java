package defpackage;

/* renamed from: m3d  reason: default package */
public final /* synthetic */ class m3d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3d b;

    public /* synthetic */ m3d(n3d n3d, int i) {
        this.a = i;
        this.b = n3d;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                sb0 sb0 = this.b.c;
                if (((n3d) sb0.g) != null) {
                    sb0.b();
                    return;
                }
                return;
            default:
                sb0 sb02 = this.b.c;
                if (((n3d) sb02.g) != null && (sb02.a & 3) != 0) {
                    sb02.b();
                    return;
                }
                return;
        }
    }
}
