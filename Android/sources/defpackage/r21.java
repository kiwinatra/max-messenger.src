package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: r21  reason: default package */
public final class r21 implements q21 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onDecorativeParticipantIdChanged(p21 p21) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((q21) it.next()).onDecorativeParticipantIdChanged(p21);
        }
    }
}
