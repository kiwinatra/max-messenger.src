package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: peg  reason: default package */
public final class peg implements wn1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onAttendee(sn1 sn1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((wn1) it.next()).onAttendee(sn1);
        }
    }

    public final void onFeedback(tn1 tn1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((wn1) it.next()).onFeedback(tn1);
        }
    }

    public final void onHandUp(un1 un1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((wn1) it.next()).onHandUp(un1);
        }
    }

    public final void onMeInWaitingRoomChanged(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((wn1) it.next()).onMeInWaitingRoomChanged(z);
        }
    }

    public final void onPromotionUpdated(vn1 vn1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((wn1) it.next()).onPromotionUpdated(vn1);
        }
    }
}
