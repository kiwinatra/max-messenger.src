package ru.ok.android.externcalls.sdk.watch_together.internal.sessionroom;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieState;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/sessionroom/SessionRoomWatchTogetherHandler;", "Lxj1;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;", "watchTogetherManager", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;)V", "", "stopWatchTogetherForMe", "()V", "Ltj1;", "params", "onCurrentParticipantActiveRoomChanged", "(Ltj1;)V", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;", "Lzwd;", "roomId", "Lzwd;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class SessionRoomWatchTogetherHandler implements xj1 {
    private zwd roomId = xwd.a;
    private final ParticipantStore store;
    private final WatchTogetherPlayer watchTogetherManager;

    public SessionRoomWatchTogetherHandler(ParticipantStore participantStore, WatchTogetherPlayer watchTogetherPlayer) {
        this.store = participantStore;
        this.watchTogetherManager = watchTogetherPlayer;
    }

    private final void stopWatchTogetherForMe() {
        for (Map.Entry next : this.watchTogetherManager.getMovieStates().getStates().entrySet()) {
            vt9 vt9 = (vt9) next.getKey();
            ParticipantId participantId = ((MovieState) next.getValue()).getParticipantId();
            ConversationParticipant me2 = this.store.getMe();
            if (Intrinsics.areEqual((Object) participantId, (Object) me2 != null ? me2.getExternalId() : null)) {
                WatchTogetherPlayer.stop$default(this.watchTogetherManager, vt9, (Function0) null, (Function1) null, 6, (Object) null);
            }
        }
    }

    public void onCurrentParticipantActiveRoomChanged(tj1 tj1) {
        if (!Intrinsics.areEqual((Object) this.roomId, (Object) tj1.a)) {
            stopWatchTogetherForMe();
        }
        this.roomId = tj1.a;
    }

    public /* bridge */ /* synthetic */ void onCurrentParticipantInvitedToRoom(uj1 uj1) {
    }

    public /* bridge */ /* synthetic */ void onRoomRemoved(vj1 vj1) {
    }

    public /* bridge */ /* synthetic */ void onRoomUpdated(wj1 wj1) {
    }
}
