package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: rzf  reason: default package */
public final class rzf implements im1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onUrlSharingInfoUpdated(hm1 hm1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((im1) it.next()).onUrlSharingInfoUpdated(hm1);
        }
    }
}
