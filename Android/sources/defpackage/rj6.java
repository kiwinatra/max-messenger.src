package defpackage;

import java.util.concurrent.ScheduledFuture;

/* renamed from: rj6  reason: default package */
public final /* synthetic */ class rj6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScheduledFuture b;

    public /* synthetic */ rj6(ScheduledFuture scheduledFuture, int i) {
        this.a = i;
        this.b = scheduledFuture;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.cancel(true);
                return;
            default:
                this.b.cancel(true);
                return;
        }
    }
}
