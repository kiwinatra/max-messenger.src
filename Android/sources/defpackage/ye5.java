package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Lazy;

/* renamed from: ye5  reason: default package */
public final class ye5 extends xag {
    public final Lazy b;
    public final Lazy c;
    public final s85 o = new s85(0);
    public aje v;

    public ye5() {
        qe5 qe5 = qe5.a;
        Lazy h = qe5.getAccessor().h(ocf.class);
        Lazy h2 = qe5.getAccessor().h(gaf.class);
        this.b = h;
        this.c = h2;
    }

    public final void i() {
        aje aje = this.v;
        if (aje != null) {
            aje.b((CancellationException) null);
        }
        this.v = null;
    }
}
