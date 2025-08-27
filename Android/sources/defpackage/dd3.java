package defpackage;

/* renamed from: dd3  reason: default package */
public final /* synthetic */ class dd3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ed3 b;
    public final /* synthetic */ t8g c;

    public /* synthetic */ dd3(ed3 ed3, t8g t8g, int i) {
        this.a = i;
        this.b = ed3;
        this.c = t8g;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getClass();
                this.c.getClass();
                return;
            case 1:
                this.b.getClass();
                this.c.m();
                return;
            default:
                this.b.getClass();
                this.c.onFirstFrameRendered();
                return;
        }
    }

    public /* synthetic */ dd3(ed3 ed3, t8g t8g, v8g v8g) {
        this.a = 0;
        this.b = ed3;
        this.c = t8g;
    }
}
