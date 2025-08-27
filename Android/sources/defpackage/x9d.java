package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: x9d  reason: default package */
public final class x9d implements ug1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onRtcStats(xoc xoc) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ug1) it.next()).onRtcStats(xoc);
        }
    }
}
