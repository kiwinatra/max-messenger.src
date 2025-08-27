package defpackage;

import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;

/* renamed from: qeg  reason: default package */
public final /* synthetic */ class qeg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ube b;

    public /* synthetic */ qeg(ube ube, int i) {
        this.a = i;
        this.b = ube;
    }

    public final void run() {
        int i = this.a;
        ube ube = this.b;
        switch (i) {
            case 0:
                WaitingRoomParticipants.loadWaitingParticipantIdsPageSingle$lambda$6$lambda$5(ube);
                return;
            default:
                WaitingRoomParticipants.resolveInternalIdSingle$lambda$1$lambda$0(ube);
                return;
        }
    }
}
