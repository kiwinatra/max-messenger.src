package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* renamed from: oq4  reason: default package */
public final class oq4 implements pq4 {
    public final Future a;

    public oq4(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
