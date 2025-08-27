package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: wb2  reason: default package */
public final class wb2 implements z11 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onNewMessage(ce7 ce7) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((z11) it.next()).onNewMessage(ce7);
        }
    }
}
