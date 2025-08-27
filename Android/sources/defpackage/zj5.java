package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: zj5  reason: default package */
public final class zj5 implements s51 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onFeedback(r51 r51) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((s51) it.next()).onFeedback(r51);
        }
    }
}
