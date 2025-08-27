package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: a9b  reason: default package */
public final class a9b implements df1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onStateChanged(ue1 ue1, we1 we1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((df1) it.next()).onStateChanged(ue1, we1);
        }
    }
}
