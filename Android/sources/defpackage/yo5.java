package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: yo5  reason: default package */
public final class yo5 implements t51 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onCallParticipantFingerprint(ye1 ye1, long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((t51) it.next()).onCallParticipantFingerprint(ye1, j);
        }
    }
}
