package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: wne  reason: default package */
public final class wne implements cl1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onMediaDataReceived(long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((cl1) it.next()).onMediaDataReceived(j);
        }
    }
}
