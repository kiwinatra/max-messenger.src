package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: bxd  reason: default package */
public final class bxd implements sj1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void a(ox0 ox0) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((sj1) it.next()).a(ox0);
        }
    }
}
