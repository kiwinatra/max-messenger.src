package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: a3  reason: default package */
public final class a3 {
    public static final a3 c;
    public static final a3 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (g3.o) {
            d = null;
            c = null;
            return;
        }
        d = new a3(false, (CancellationException) null);
        c = new a3(true, (CancellationException) null);
    }

    public a3(boolean z, CancellationException cancellationException) {
        this.a = z;
        this.b = cancellationException;
    }
}
