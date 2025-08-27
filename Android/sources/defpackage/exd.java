package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: exd  reason: default package */
public final class exd implements xj1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onCurrentParticipantActiveRoomChanged(tj1 tj1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((xj1) it.next()).onCurrentParticipantActiveRoomChanged(tj1);
        }
    }

    public final void onCurrentParticipantInvitedToRoom(uj1 uj1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((xj1) it.next()).onCurrentParticipantInvitedToRoom(uj1);
        }
    }

    public final void onRoomRemoved(vj1 vj1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((xj1) it.next()).onRoomRemoved(vj1);
        }
    }

    public final void onRoomUpdated(wj1 wj1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((xj1) it.next()).onRoomUpdated(wj1);
        }
    }
}
