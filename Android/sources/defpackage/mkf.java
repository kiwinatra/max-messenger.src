package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutCancellationException;

/* renamed from: mkf  reason: default package */
public final class mkf extends dgd implements Runnable {
    public final long v;

    public mkf(long j, Continuation continuation) {
        super(continuation, continuation.getContext());
        this.v = j;
    }

    public final String T() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.T());
        sb.append("(timeMillis=");
        return i2a.j(sb, this.v, ')');
    }

    public final void run() {
        xk4.d(this.c);
        z(new TimeoutCancellationException("Timed out waiting for " + this.v + " ms", this));
    }
}
