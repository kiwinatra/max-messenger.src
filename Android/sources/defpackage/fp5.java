package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fp5  reason: default package */
public final class fp5 implements gf0 {
    public static final AtomicReference a = new AtomicReference();

    public final void a(boolean z) {
        synchronized (hp5.j) {
            try {
                Iterator it = new ArrayList(hp5.k.values()).iterator();
                while (it.hasNext()) {
                    hp5 hp5 = (hp5) it.next();
                    if (hp5.e.get()) {
                        Iterator it2 = hp5.i.iterator();
                        while (it2.hasNext()) {
                            hp5 hp52 = ((ep5) it2.next()).a;
                            if (!z) {
                                ((pf4) hp52.h.get()).b();
                            } else {
                                hp52.getClass();
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }
}
