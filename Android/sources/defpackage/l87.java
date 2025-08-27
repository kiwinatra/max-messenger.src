package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: l87  reason: default package */
public final class l87 extends sb6 {
    public final /* synthetic */ int o = 1;
    public final Object v;

    public l87(ha7 ha7) {
        super(ha7);
        this.v = new AtomicBoolean(false);
    }

    public void close() {
        switch (this.o) {
            case 1:
                if (!((AtomicBoolean) this.v).getAndSet(true)) {
                    super.close();
                    return;
                }
                return;
            default:
                super.close();
                return;
        }
    }

    public l87(ha7 ha7, m87 m87) {
        super(ha7);
        this.v = new WeakReference(m87);
        a(new k87(0, this));
    }
}
