package ru.ok.android.externcalls.sdk.sessionroom.internal.participant;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.TypeIntrinsics;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"ru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl$roomsListener$1", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$OwnRoomsListener;", "onActiveRoomChanged", "", "event", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "onProposedRoomChanged", "onRoomRemoved", "onRoomUpdated", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SessionRoomParticipantsDataProviderImpl$roomsListener$1 implements SessionRoomsManager.OwnRoomsListener {
    final /* synthetic */ SessionRoomParticipantsDataProviderImpl this$0;

    public SessionRoomParticipantsDataProviderImpl$roomsListener$1(SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl) {
        this.this$0 = sessionRoomParticipantsDataProviderImpl;
    }

    public void onActiveRoomChanged(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
    }

    public void onProposedRoomChanged(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
    }

    public void onRoomRemoved(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        Map access$getKnownSessionRooms$p = this.this$0.knownSessionRooms;
        TypeIntrinsics.asMutableMap(access$getKnownSessionRooms$p).remove(sessionRoomInfo.getRoomId());
    }

    public void onRoomUpdated(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        twd room = sessionRoomInfo.getRoom();
        if (room != null) {
            this.this$0.knownSessionRooms.put(room.a, room);
        }
    }
}
