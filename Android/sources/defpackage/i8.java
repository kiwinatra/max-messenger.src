package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: i8  reason: default package */
public final class i8 implements rz0 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onActiveParticipantUpdated(qz0 qz0) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((rz0) it.next()).onActiveParticipantUpdated(qz0);
        }
    }

    public final void onActiveParticipantsAdded(mz0 mz0) {
        if (!mz0.a.isEmpty()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((rz0) it.next()).onActiveParticipantsAdded(mz0);
            }
        }
    }

    public final void onActiveParticipantsChanged(nz0 nz0) {
        if (!nz0.a.isEmpty()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((rz0) it.next()).onActiveParticipantsChanged(nz0);
            }
        }
    }

    public final void onActiveParticipantsDeAnonimized(oz0 oz0) {
        if (!oz0.a.isEmpty()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((rz0) it.next()).onActiveParticipantsDeAnonimized(oz0);
            }
        }
    }

    public final void onActiveParticipantsRemoved(pz0 pz0) {
        if (!pz0.a.isEmpty()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((rz0) it.next()).onActiveParticipantsRemoved(pz0);
            }
        }
    }
}
