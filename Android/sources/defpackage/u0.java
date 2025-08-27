package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: u0  reason: default package */
public final class u0 {
    public static final u0 c;
    public static final u0 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (o1.o) {
            d = null;
            c = null;
            return;
        }
        d = new u0(false, (CancellationException) null);
        c = new u0(true, (CancellationException) null);
    }

    public u0(boolean z, CancellationException cancellationException) {
        this.a = z;
        this.b = cancellationException;
    }
}
