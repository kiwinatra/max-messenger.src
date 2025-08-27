package defpackage;

/* renamed from: zd6  reason: default package */
public final /* synthetic */ class zd6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ be6 b;
    public final /* synthetic */ pe6 c;

    public /* synthetic */ zd6(be6 be6, pe6 pe6, int i) {
        this.a = i;
        this.b = be6;
        this.c = pe6;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.x = this.c;
                return;
            default:
                this.b.y = this.c;
                return;
        }
    }
}
