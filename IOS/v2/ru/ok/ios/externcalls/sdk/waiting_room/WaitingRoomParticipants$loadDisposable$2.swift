package ru.ok.android.externcalls.sdk.waiting_room;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "data", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "accept"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class WaitingRoomParticipants$loadDisposable$2<T> implements qk3 {
    final /* synthetic */ WaitingRoomParticipants this$0;

    public WaitingRoomParticipants$loadDisposable$2(WaitingRoomParticipants waitingRoomParticipants) {
        this.this$0 = waitingRoomParticipants;
    }

    public final void accept(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
        this.this$0.notifyListener(waitingRoomParticipantsUpdate);
    }
}
