package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: jf5  reason: default package */
public final /* synthetic */ class jf5 implements t5g {
    public final /* synthetic */ int a;
    public final /* synthetic */ kf5 b;
    public final /* synthetic */ CountDownLatch c;

    public /* synthetic */ jf5(kf5 kf5, CountDownLatch countDownLatch, int i) {
        this.a = i;
        this.b = kf5;
        this.c = countDownLatch;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0(this.c);
                return;
            default:
                this.b.c0(this.c);
                return;
        }
    }
}
