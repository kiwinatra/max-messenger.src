package defpackage;

import java.util.concurrent.ScheduledFuture;

/* renamed from: ux5  reason: default package */
public final /* synthetic */ class ux5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wx5 b;
    public final /* synthetic */ long c;

    public /* synthetic */ ux5(int i, long j, wx5 wx5) {
        this.a = i;
        this.b = wx5;
        this.c = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                wx5 wx5 = this.b;
                wx5.getClass();
                wx5.b.execute(new ux5(3, this.c, wx5));
                return;
            case 1:
                wx5 wx52 = this.b;
                wx52.getClass();
                wx52.b.execute(new ux5(2, this.c, wx52));
                return;
            case 2:
                wx5 wx53 = this.b;
                if (this.c == wx53.k) {
                    wx53.b();
                    return;
                }
                return;
            default:
                wx5 wx54 = this.b;
                if (this.c == wx54.k) {
                    wx54.m = false;
                    ScheduledFuture scheduledFuture = wx54.j;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                        wx54.j = null;
                    }
                    do1 do1 = wx54.t;
                    if (do1 != null) {
                        do1.b(new xx5(false));
                        wx54.t = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
