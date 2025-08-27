package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: yxc  reason: default package */
public final class yxc implements kg1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onRecordStarted(ig1 ig1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((kg1) it.next()).onRecordStarted(ig1);
        }
    }

    public final void onRecordStopped(jg1 jg1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((kg1) it.next()).onRecordStopped(jg1);
        }
    }
}
