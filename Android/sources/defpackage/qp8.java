package defpackage;

/* renamed from: qp8  reason: default package */
public final /* synthetic */ class qp8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tp8 b;

    public /* synthetic */ qp8(tp8 tp8, int i) {
        this.a = i;
        this.b = tp8;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                tp8 tp8 = this.b;
                if (((uo8) tp8.g.b).e.a() == null) {
                    tp8.O0();
                    return;
                }
                return;
            default:
                tp8 tp82 = this.b;
                tp82.getClass();
                lm8 lm8 = new lm8(tp82.a, tp82.c.a.b(), new w28(tp82));
                tp82.h = lm8;
                lm8.a.b.connect();
                return;
        }
    }
}
