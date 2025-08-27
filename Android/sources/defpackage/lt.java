package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: lt  reason: default package */
public final class lt implements b01 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onAsrRecordStarted(zz0 zz0) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((b01) it.next()).onAsrRecordStarted(zz0);
        }
    }

    public final void onAsrRecordStopped(a01 a01) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((b01) it.next()).onAsrRecordStopped(a01);
        }
    }
}
