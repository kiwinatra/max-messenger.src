package ru.ok.android.externcalls.sdk.waiting_room;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "load", "", "apply", "(Ljava/lang/Boolean;)Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class WaitingRoomParticipants$loadDisposable$1<T, R> implements zi6 {
    final /* synthetic */ WaitingRoomParticipants this$0;

    public WaitingRoomParticipants$loadDisposable$1(WaitingRoomParticipants waitingRoomParticipants) {
        this.this$0 = waitingRoomParticipants;
    }

    public final WaitingRoomParticipantsUpdate apply(Boolean bool) {
        return this.this$0.loadWaitingParticipantIds();
    }
}
