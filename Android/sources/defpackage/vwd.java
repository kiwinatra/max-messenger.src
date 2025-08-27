package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: vwd  reason: default package */
public final class vwd implements rj1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void a(xe8 xe8) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((rj1) it.next()).a(xe8);
        }
    }
}
