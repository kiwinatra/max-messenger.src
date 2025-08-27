package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: mt  reason: default package */
public final class mt implements c01 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onAsrDataPackage(pt ptVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((c01) it.next()).onAsrDataPackage(ptVar);
        }
    }
}
