package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: rl4  reason: default package */
public final class rl4 extends g3 implements ScheduledFuture {
    public final ScheduledFuture y;

    public rl4(ql4 ql4) {
        this.y = ql4.b(new u6h(15, this));
    }

    public final void b() {
        ScheduledFuture scheduledFuture = this.y;
        Object obj = this.a;
        scheduledFuture.cancel((obj instanceof a3) && ((a3) obj).a);
    }

    public final int compareTo(Object obj) {
        return this.y.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.y.getDelay(timeUnit);
    }
}
