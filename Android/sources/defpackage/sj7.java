package defpackage;

import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: sj7  reason: default package */
public final class sj7 extends qj7 {
    public final uj7 b;
    public final WeakReference c;

    public sj7(uj7 uj7, qj7 qj7) {
        super(qj7.a);
        this.b = uj7;
        this.c = new WeakReference(qj7);
    }

    public final void a(Set set) {
        qj7 qj7 = (qj7) this.c.get();
        if (qj7 == null) {
            this.b.c(this);
        } else {
            qj7.a(set);
        }
    }
}
