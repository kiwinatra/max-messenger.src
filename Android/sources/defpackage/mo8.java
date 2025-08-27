package defpackage;

/* renamed from: mo8  reason: default package */
public final /* synthetic */ class mo8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo8 b;
    public final /* synthetic */ qo8 c;

    public /* synthetic */ mo8(yo8 yo8, qo8 qo8, int i) {
        this.a = i;
        this.b = yo8;
        this.c = qo8;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                yo8 yo8 = this.b;
                qo8 qo8 = this.c;
                yo8.z = qo8;
                if (qo8 != null && yo8.X) {
                    yo8.l(qo8);
                }
                yo8.d(new mo8(yo8, qo8, 1), new ro1(1, yo8));
                return;
            default:
                yo8 yo82 = this.b;
                qo8 qo82 = this.c;
                if (yo82.a instanceof t0) {
                    qo82.release();
                    return;
                }
                return;
        }
    }
}
